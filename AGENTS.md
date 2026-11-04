# AGENTS.md — TikTok Privacy & Data-Flow Analysis

You are working in a **static reverse-engineering privacy analysis** of the TikTok
Android app. This file is your brief: what the project is, what's already done, the
standards to uphold, and how to extend it.

## What this project is

Static analysis of **TikTok `com.zhiliaoapp.musically` v46.0.1** (APKPure `.xapk`)
answering: what data it collects, where it dials home, whether it goes out of bounds,
how to mitigate, and whether it shows malicious/dark patterns. Findings live in
`docs/` (reports 00–12); the full jadx decompilation is in `decompiled/`.

**Status: the analysis is complete and pushed** to
`git@github.com:akitaonrails/tiktok_analysis.git` (branch `main`). Reports 00–14 are
written and cross-linked. Report 14 re-analyses **v47.7.1**: its workspace is
`_work/v47/` (gitignored: `apk/`, `jadx-src/`, `strings/`, `c03ho/`), and its evidence is in
`docs/_evidence/v47/`. `decompiled/` is still the v46 tree. Extend or deepen; don't redo from scratch.

## Repo layout

- `README.md` — user-friendly landing page (TL;DR, "what it gathers about you", index).
- `docs/00`–`docs/12` — the report set (index in `docs/README.md`).
- `docs/_evidence/` — host lists, decoded config, extracted URLs (tracked).
- `decompiled/java/` — 303k jadx Java files (tracked, text). `decompiled/AndroidManifest.xml`.
- `.gitignore` keeps `*.xapk`/`*.apk`/`*.dex`, `unpacked/`, `_work/` out. `.gitattributes` = Git LFS for binaries.
- `_work/` (gitignored) — scratch: `jadx-res/`, `jadx-src/`, `dex/`, `so/`, `strings/`, `scan/`.

## The reports (what's already established)

| # | Report | Key finding |
|---|---|---|
| 00 | Index & method | Static-only; native code is a black box; reproduce steps |
| 01 | App overview | 37 dex, 204 native libs; metasec/crypto/telemetry-heavy |
| 02 | Permissions | Broad sensor/identity surface; notably NO SMS/call-log/`QUERY_ALL_PACKAGES`/`READ_PHONE_STATE` |
| 03 | Manifest components | Cross-app account providers are **signature-allowlist gated**; scoped `<queries>` of 91 apps |
| 04 | Network map | 991 hosts/445 domains; attributable; US/EU enclaves + ByteDance-global telemetry tier |
| 05 | Data collection | Device fingerprint, contacts upload, location, clipboard (reads=3), sensors |
| 06 | Third-party SDKs | Adjust, AppsFlyer, Facebook, Google, ThreatMetrix, Amazon |
| 07 | Assessment | Not covert malware, but surveillance-grade + encrypted/native = unverifiable |
| 08 | Mitigation | Tiered: 3rd-party blockable; fingerprint fused to auth; spoofing backfires |
| 09 | Deep scan/coverage | Full-tree rescan; decoded `builtin_network_config` (XOR 0x55); honest gaps |
| 10 | OS & clipboard | No out-of-bounds; clipboard not auto-scraped; Helios/BPEA governance |
| 11 | DIY guide | Fetch/decompile/LLM-prompt playbook for any app |
| 12 | Malicious & dark patterns | No malware; dark patterns present; well-being counter-signal |
| 13 | Native libraries | `.so` string sweep; metasec engine; reassuring negatives |
| 14 | v47.7.1 inventory & DNS | Built-in HTTP-DNS by raw IP bypasses NextDNS; full collection inventory; blocklist + router IP rules; isolate-don't-spoof plan; Morphe patch review |
| 15 | Repackaging feasibility & patch plan | Dex patching removes third-party + best-effort telemetry; native signer/fingerprint + signed behavior can't be stripped; re-sign is server-visible; isolation beats repackaging |

## Analysis principles (non-negotiable)

1. **"Capability present" ≠ "behavior proven."** Static code shows intent, not wire
   traffic. Say so.
2. **Cite `file:line`** for substantive claims.
3. **Separate first-party from bundled-SDK code** (e.g. `content://sms` inside the
   Helios privacy *monitor* is not the app reading SMS).
4. **Flag blind spots:** native `.so` semantics (string-scanned, not disassembled),
   encrypted/runtime-decrypted strings, server-pushed config, 49 dynamic-feature
   modules downloaded post-install, ~2.4k failed-decompile methods.
5. **Be fair and calibrated** — note reassuring negatives, don't sensationalize.
6. **Full-corpus, not sampled** — `ripgrep` the whole tree; state coverage + residual gaps.

## Reproduce / rebuild the workspace (gitignored artifacts)

```sh
unzip -o "TikTok+..._APKPure.xapk" -d unpacked/
jadx --no-src -d _work/jadx-res unpacked/com.zhiliaoapp.musically.apk        # manifest+res
jadx --no-res -j 8 -d _work/jadx-src unpacked/com.zhiliaoapp.musically.apk   # source (~30 min)
unzip -o unpacked/com.zhiliaoapp.musically.apk 'classes*.dex' -d _work/dex/
unzip -o unpacked/config.arm64_v8a.apk 'lib/*' -d _work/so/
rg -oiN --no-filename 'https?://[^" ]+' _work/jadx-src | sort -u          # host census
```
Decoded hidden config trick: `builtin_network_config` is single-byte XOR key `0x55`.

## Useful ripgrep patterns

- Hosts: `rg -oiN 'https?://[a-z0-9._~:/?#%-]+' decompiled/java`
- Sinks: `rg -l 'getPrimaryClip\(|getLastKnownLocation|getInstalledPackages|AdvertisingIdClient|MediaProjection|addJavascriptInterface' decompiled/java`
- Out-of-bounds: `rg -oiN 'content://[a-z0-9._/-]+' decompiled/java`; `Runtime.getRuntime\(\)\.exec`
- Obfuscated names are mangled (`X/C842060X1o.java`); infer intent from retained
  strings, endpoint paths, and package names (`com.ss.android.ugc.aweme.*`).

## Conventions

- Commit decompiled source + docs + evidence (text). `.apk`/`.xapk` stay gitignored; LFS for binaries.
- Keep `docs/README.md` and root `README.md` index tables in sync when adding a report.
- When a new finding refines an old claim, **update the affected report** (esp. 07 the
  assessment) — don't just append; keep the set internally consistent.
- Commit-message footer: `Co-Authored-By: Claude Fable 5 <noreply@anthropic.com>`
- Only push when the user asks. Push over SSH:
  `GIT_SSH_COMMAND='ssh -o StrictHostKeyChecking=accept-new' git push origin main`

## Open follow-ups (not yet done — require dynamic analysis)

The whole "capability → proven behavior" gap needs: a rooted device/emulator, a MITM
proxy with TLS-unpinning (Frida), and hooks on `getPrimaryClip`/location/the native
network signer, plus disassembly of `libmetasec_ov.so`. See `docs/07-assessment.md`.

## Sibling project

`~/Projects/clash_of_kings_analysis` reuses this exact methodology for a Cocos2d-x/Lua
game (see its `AGENTS.md`).
