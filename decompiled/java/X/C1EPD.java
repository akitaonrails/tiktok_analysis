package X;

import android.R;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1EPD, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1EPD {
    Unknown(-1),
    Core(0),
    AppEvents(65536),
    CodelessEvents(65792),
    CloudBridge(67584),
    RestrictiveDataFiltering(66048),
    AAM(66304),
    PrivacyProtection(66560),
    SuggestedEvents(66561),
    IntelligentIntegrity(66562),
    ModelRequest(66563),
    ProtectedMode(66564),
    MACARuleMatching(66565),
    BlocklistEvents(66566),
    FilterRedactedEvents(66567),
    FilterSensitiveParams(66568),
    EventDeactivation(66816),
    OnDeviceEventProcessing(67072),
    OnDevicePostInstallEventProcessing(67073),
    IapLogging(67328),
    IapLoggingLib2(67329),
    Instrument(131072),
    CrashReport(131328),
    CrashShield(131329),
    ThreadCheck(131330),
    ErrorReport(131584),
    AnrReport(131840),
    Monitoring(196608),
    ServiceUpdateCompliance(196864),
    Megatron(262144),
    Elora(327680),
    Login(16777216),
    ChromeCustomTabsPrefetching(R.attr.theme),
    IgnoreAppSwitchToLoggedOut(R.id.background),
    BypassAppSwitch(R.style.Animation),
    Share(33554432);

    public static final C1EPG Companion = new C1EPG();
    public final int code;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static C1EPD[] valuesCustom() {
        return (C1EPD[]) Arrays.copyOf(values(), 36);
    }

    public final C1EPD getParent() {
        int i = this.code;
        if ((i & 255) > 0) {
            Companion.getClass();
            return C1EPG.LIZ(i & (-256));
        }
        if ((65280 & i) > 0) {
            Companion.getClass();
            return C1EPG.LIZ(i & (-65536));
        }
        if ((16711680 & i) > 0) {
            Companion.getClass();
            return C1EPG.LIZ(i & (-16777216));
        }
        Companion.getClass();
        return C1EPG.LIZ(0);
    }

    public final String toKey() {
        return Intrinsics.LJIIJJI(this, "FBSDKFeature");
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C1EPE.LIZ[ordinal()]) {
            case 1:
                return "CoreKit";
            case 2:
                return "AppEvents";
            case 3:
                return "CodelessEvents";
            case 4:
                return "RestrictiveDataFiltering";
            case 5:
                return "Instrument";
            case 6:
                return "CrashReport";
            case 7:
                return "CrashShield";
            case 8:
                return "ThreadCheck";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "ErrorReport";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "AnrReport";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "AAM";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "AppEventsCloudbridge";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "PrivacyProtection";
            case 14:
                return "SuggestedEvents";
            case 15:
                return "IntelligentIntegrity";
            case 16:
                return "ProtectedMode";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "MACARuleMatching";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "BlocklistEvents";
            case 19:
                return "FilterRedactedEvents";
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return "FilterSensitiveParams";
            case 21:
                return "ModelRequest";
            case 22:
                return "EventDeactivation";
            case 23:
                return "OnDeviceEventProcessing";
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return "OnDevicePostInstallEventProcessing";
            case 25:
                return "IAPLogging";
            case 26:
                return "IAPLoggingLib2";
            case 27:
                return "Monitoring";
            case 28:
                return "Megatron";
            case 29:
                return "Elora";
            case 30:
                return "ServiceUpdateCompliance";
            case 31:
                return "LoginKit";
            case 32:
                return "ChromeCustomTabsPrefetching";
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return "IgnoreAppSwitchToLoggedOut";
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return "BypassAppSwitch";
            case 35:
                return "ShareKit";
            default:
                return "unknown";
        }
    }

    C1EPD(int i) {
        this.code = i;
    }
}
