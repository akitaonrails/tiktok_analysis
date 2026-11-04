# TikTok Android — Privacy & Data-Flow Analysis 🔎

A static reverse-engineering study of the **TikTok** Android app that asks a simple
question people keep arguing about:

> *Does TikTok "spy" on you — accessing things it shouldn't, quietly phoning home,
> and shipping your data off the device?*

This repo contains the full analysis, the evidence, and the **decompiled source** so
you can check the work yourself.

## What was analyzed

| | |
|---|---|
| **App** | TikTok - Videos, Shop & LIVE |
| **Package** | `com.zhiliaoapp.musically` (the international build) |
| **Latest version analyzed** | **47.7.1** — see [report 14](docs/14-v47-data-inventory-and-dns-blocking.md) & [15](docs/15-repackaging-feasibility-and-patch-plan.md) (472 MB APK, 58 dex, 302 arm64 libs) |
| **Baseline in this repo** | **46.0.1** (versionCode `2024600010`) — reports 00–13 and the committed `decompiled/` tree |
| **Source of the APK** | APKPure — <https://apkpure.com/tiktok-app/com.zhiliaoapp.musically> |
| **Method** | Static only. jadx (1.5.5 baseline; 1.5.6 for v47) for all dex, plus **REA + Ghidra** on the native network stack for v47. No app was run; no live traffic captured. |

> **🆕 Latest pass (v47.7.1, Nov 2026).** A fresh teardown aimed at one practical
> question: *can I block TikTok's data collection at my home DNS and otherwise use it
> safely?* Key findings, with evidence in [report 14](docs/14-v47-data-inventory-and-dns-blocking.md)
> and [15](docs/15-repackaging-feasibility-and-patch-plan.md):
> - **DNS blocking (NextDNS, Pi-hole…) is not a full fence.** TikTok ships its *own*
>   DNS-over-HTTP resolver, on by default, reached by **raw IP** (`34.102.215.99` outside
>   the US), and pins core API hosts to Bytedance IPs — so those lookups never reach your
>   DNS. It still works for third-party trackers and most first-party telemetry *today*,
>   with a router IP rule as backup. The server can also re-route hosts at runtime.
> - **New passive collection:** an **hourly encrypted re-report of all device IDs** (incl.
>   ANDROID_ID) to `cp-rp.tiktokv.com`; **hardware key attestation** (a Google-signed proof
>   of your exact device); and touch-dynamics + motion-sensor sampling.
> - **Still no out-of-bounds access** — no accessibility/notification/SMS/call-log/usage-stats,
>   no all-apps listing. The one new permission only detects recording of TikTok's *own* screen.
> - **Mitigation that actually works:** *isolate, don't spoof* — a SIM-less, not-logged-in
>   TikTok in a separate profile/device, plus the tiered DNS blocklist + router rules.
>   Spoofing hardware/region backfires (it's detected and contradicts the attestation).
> - **Repackaging** can strip the removable telemetry at the source but **not** the native
>   fingerprint or your in-app behavior, and a re-signed build is visible to TikTok's servers.

## TL;DR — the honest answer

**It's not covert malware — but it is surveillance-grade data collection that's
built to be hard to audit.** All three of these are true at the same time:

- ✅ **No smoking gun.** Every server it talks to is TikTok/ByteDance or a *named*
  ad/analytics vendor (AppsFlyer, Facebook, Google, ThreatMetrix, Amazon; Adjust was
  present in v46 but is **gone in v47.7.1**). No hidden hosts. No IMEI/MAC harvesting.
  No `QUERY_ALL_PACKAGES`, SMS, or call-log access. US and EU user data are routed to
  dedicated **`.tiktokv.us` / `.tiktokv.eu` / Oracle-Ashburn** enclaves (Project Texas / Clover).
- ⚠️ **But it collects a LOT.** Persistent device fingerprint, precise location,
  Wi-Fi + Bluetooth scanning, contacts upload, motion sensors, screen capture,
  installed-app detection (91 named apps incl. competitors, PayPal, Venmo, Spotify),
  in-app-browser JavaScript injection, and heavy behavioral telemetry. Your identity
  is shared across ByteDance's app family (CapCut, Lemon8…) and your ad ID fans out
  to ~6 third parties.
- 🔒 **And it's engineered to resist inspection.** The device fingerprint and
  telemetry are assembled and **encrypted in native code** (`libmetasec_ov.so` and a
  stack of crypto libraries), so even full decompilation can't reveal exactly what
  leaves the device. That opacity is the central finding.

So: **"not proven to be spyware" and "collects far more than it needs, opaquely" are
both correct.** TikTok sits at the aggressive end of the same spectrum as other big
ad-driven platforms; what's distinctive is the ByteDance jurisdictional context and
the hardened, unverifiable native telemetry.

👉 Full reasoning: **[docs/07-assessment.md](docs/07-assessment.md)**.

## What TikTok actually gathers about you

Plain-language summary of what the app is built to collect and send to TikTok/ByteDance
servers (and, for some of it, to ad partners). "Collected" means the code path exists
and is wired to the network; exact payloads are encrypted in native code, so treat
this as *what it's built to do*, not a wiretap transcript.

**Sent to TikTok/ByteDance servers:**
- **A permanent device fingerprint** — a persistent ID (`openudid`/`cdid` + a native
  hardware/software signature) that survives clearing app data and re-identifies your
  device across sessions. This is the big one, and it's encrypted so you can't inspect it.
- **Everything about your viewing** — which videos, how long you watch, replays,
  pauses, likes, comments, searches. This *is* the recommendation engine, and it rides
  the same request that fetches the feed, so it's unavoidable while using the app.
- **Device & network profile** — phone model, OS, screen, CPU/RAM, carrier, SIM/network
  country, timezone, language, battery, IP-derived region, and Wi-Fi/Bluetooth signals.
- **Coarse and (if you allow it) precise location** — from GPS, plus Wi-Fi/Bluetooth
  and IP even without the GPS permission. Photos you upload can carry their GPS EXIF.
- **Your contacts** — *if* you enable "Find Friends" (consent-gated); then uploaded and
  periodically re-synced.
- **Which apps you have installed** — checked against a fixed list of ~91 named apps
  (competitors, messengers, PayPal/Venmo, Spotify, sister ByteDance apps).
- **Your advertising ID** — also shared with several ad/analytics firms (AppsFlyer,
  Facebook, Google, ThreatMetrix, Amazon; Adjust in v46, dropped in v47.7.1).

**What it does *not* do (verified across the full code):**
- No reading of your SMS, call logs, calendar, browser history, or other apps' private
  data (it lacks the permissions and only *monitors* those APIs for compliance).
- No **automatic clipboard scraping** on app open — clipboard is read only when you
  paste, behind a permission-token gate.
- No bulk "list every app on the phone," no root/privilege escalation, no dialing
  unknown/mystery servers.

**The honest asterisks:**
- Region routing to US (`tiktokv.us` / Oracle) and EU (`tiktokv.eu`) enclaves is real,
  but ByteDance-global telemetry/fingerprint hosts sit *outside* those enclaves.
- The most sensitive data (the device fingerprint) is **encrypted in native code**, so
  no outside party — including this analysis — can fully verify its exact contents
  without live traffic capture.

See [05 · Data Collection](docs/05-data-collection.md),
[04 · Network Map](docs/04-network-endpoints.md), and
[10 · OS & Clipboard](docs/10-os-and-clipboard-access.md) for the evidence.

## Read the detailed analysis

| Report | What's inside |
|---|---|
| 📄 [00 · Index & Method](docs/README.md) | How the analysis was done + how to reproduce |
| 📦 [01 · App Overview](docs/01-app-overview.md) | Bundle structure, dynamic features, the 204 native libraries |
| 🔑 [02 · Permissions](docs/02-permissions.md) | All 64 permissions, classified, with a "justified?" call |
| 🧩 [03 · Manifest & Components](docs/03-manifest-components.md) | Exported providers, cross-app account sharing, installed-app enumeration |
| 🌐 [04 · Network "Dial-Home" Map](docs/04-network-endpoints.md) | Every server family — who runs it, which region, what for |
| 📊 [05 · Data Collection](docs/05-data-collection.md) | Identifiers, contacts, location, clipboard, sensors, in-app browser |
| 🏢 [06 · Third-Party SDKs](docs/06-third-party-sdks.md) | Adjust, AppsFlyer, Facebook, Google, ThreatMetrix… |
| ⚖️ [07 · Assessment](docs/07-assessment.md) | The full verdict + what only live testing can settle |
| 🛡️ [08 · Mitigation Options](docs/08-mitigation-options.md) | Can you block the leaks? What works, what backfires, and why |
| 🔬 [09 · Deep Scan & Coverage](docs/09-deep-scan-coverage.md) | Full-corpus rescan (all 303k files + native libs), decoded hidden config, honest completeness statement |
| 🧷 [10 · OS & Clipboard Access](docs/10-os-and-clipboard-access.md) | Full-tree check: does it read other apps / SMS / the clipboard? What the OS probing is actually for |
| 🛠️ [11 · Do It Yourself](docs/11-diy-reproduce-guide.md) | How to fetch the APK, decompile it, and prompt an LLM to run this analysis on any app |
| 🎭 [12 · Malicious & Dark Patterns](docs/12-malicious-and-dark-patterns.md) | Any malware patterns? Any manipulative UX? (Spoiler: no malware; yes dark patterns) |
| 🧬 [13 · Native Library Analysis](docs/13-native-library-analysis.md) | `strings` sweep of all 204 `.so` files — metasec fingerprint engine confirmed in cleartext; no keylogger/screen-capture |
| 🛡️ [14 · v47 Data Inventory & DNS Blocking](docs/14-v47-data-inventory-and-dns-blocking.md) | v47.7.1: everything it collects from your phone, its own DNS resolver reached by raw IP (NextDNS can't see it), a NextDNS blocklist + router rules, and how to substitute an isolated identity instead of spoofing |
| 🧩 [15 · Repackaging Feasibility & Patch Plan](docs/15-repackaging-feasibility-and-patch-plan.md) | Can a patched, re-signed build stop the leaks? What dex patching can remove (third-party + best-effort first-party telemetry) vs. can't (native fingerprint, signed behavior), with an honest ban-risk/upkeep verdict |

Raw evidence (host lists, extracted URLs) is in [`docs/_evidence/`](docs/_evidence/).
The full decompiled Java source is under [`decompiled/`](decompiled/).

## Important caveats

- **Static analysis only.** This proves *capabilities present in the app and the
  servers it's built to reach*. It does **not** prove which fields are transmitted on
  any given request — that logic is in encrypted native code. Confirming actual wire
  payloads needs a rooted device, a MITM proxy, and Frida (see report 07).
- **Decompiled code is obfuscated.** Class/method names are machine-mangled; intent
  is inferred from retained strings, endpoints, and package names.
- **Not legal advice, not an accusation.** This is a technical, evidence-based
  security review for research/educational purposes.

## Reproduce it yourself

Baseline (v46.0.1 `.xapk`, the committed `decompiled/` tree):

```sh
unzip -o "TikTok+-+Videos,+Shop+&+LIVE_46.0.1_APKPure.xapk" -d unpacked/
jadx --no-res -j 8 -d decompiled unpacked/com.zhiliaoapp.musically.apk   # source
jadx --no-src  -d _res           unpacked/com.zhiliaoapp.musically.apk   # manifest+resources
```

The v47.7.1 pass uses a single universal `.apk`; its exact rebuild steps (jadx 1.5.6,
native string sweep, REA/Ghidra on `libsscronet.so`, XOR-0x55 config decode) are in
**[AGENTS.md](AGENTS.md)**. The APK/`.xapk` and the `_work/` workspace are **not**
committed (redistributable binaries; get the APK from the APKPure link above). Binary
artifacts, if any, are tracked with **Git LFS**.
