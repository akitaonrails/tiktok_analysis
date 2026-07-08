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
| **Version** | **46.0.1** (versionCode `2024600010`) |
| **Source of the APK** | APKPure — <https://apkpure.com/tiktok-app/com.zhiliaoapp.musically> |
| **File analyzed** | `TikTok+-+Videos,+Shop+&+LIVE_46.0.1_APKPure.xapk` (195 MB) |
| **Method** | Static only — unpack `.xapk`, decode manifest/resources, decompile all 37 dex with **jadx 1.5.5**, mine strings/URLs. No app was run; no live traffic captured. |

## TL;DR — the honest answer

**It's not covert malware — but it is surveillance-grade data collection that's
built to be hard to audit.** All three of these are true at the same time:

- ✅ **No smoking gun.** Every server it talks to is TikTok/ByteDance or a *named*
  ad/analytics vendor (Adjust, AppsFlyer, Facebook, Google, ThreatMetrix, Amazon).
  No hidden hosts. No IMEI/MAC harvesting. No `QUERY_ALL_PACKAGES`, SMS, or call-log
  access. US and EU user data are routed to dedicated **`.tiktokv.us` / `.tiktokv.eu`
  / Oracle-Ashburn** enclaves (Project Texas / Clover).
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

```sh
unzip -o "TikTok+-+Videos,+Shop+&+LIVE_46.0.1_APKPure.xapk" -d unpacked/
jadx --no-res -j 8 -d decompiled unpacked/com.zhiliaoapp.musically.apk   # source
jadx --no-src  -d _res           unpacked/com.zhiliaoapp.musically.apk   # manifest+resources
```

The original `.xapk` is **not** committed (it's a redistributable binary; get it from
the APKPure link above). Binary artifacts, if any, are tracked with **Git LFS**.
