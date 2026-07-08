package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0UtZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786710UtZ {
    public static volatile C786720Uta LIZ;

    public static String LIZ(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 24) {
            return C786410Ut5.d3(context);
        }
        if (LIZ == null) {
            LIZ = new C786720Uta(context, new C786730Utb(context));
        }
        C787140UuG c787140UuG = LIZ.LIZ;
        synchronized (c787140UuG.LJIIJ) {
            try {
                str = c787140UuG.LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        boolean z = true;
        if ("WIFI".equals(str)) {
            int iLIZIZ = LIZ.LIZIZ();
            if (iLIZIZ <= 4900 || iLIZIZ >= 5900) {
                z = false;
            }
            if (z) {
                return "wifi5g";
            }
            return "wifi";
        }
        if ("MOBILE".equals(str)) {
            C787140UuG c787140UuG2 = LIZ.LIZ;
            if (!c787140UuG2.LJII && !"NR".equals(c787140UuG2.LIZJ)) {
                z = false;
            }
            if (z) {
                return "5g";
            }
            switch (LIZ.LIZ.LIZ) {
                case 1:
                    return "gprs";
                case 2:
                    return "edge";
                case 3:
                    return "umts";
                case 4:
                    return "cdma";
                case 5:
                    return "evdo_0";
                case 6:
                    return "evdo_a";
                case 7:
                    return "1xrtt";
                case 8:
                    return "hsdpa";
                case BdTuring.TYPE_ECAF /* 9 */:
                    return "hsupa";
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    return "hspa";
                case BdTuring.TYPE_EMAIL /* 11 */:
                    return "iden";
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    return "evdo_b";
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    return "lte";
                case 14:
                    return "ehrpd";
                case 15:
                    return "hspap";
                case 16:
                    return "gsm";
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    return "td_scdma";
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                default:
                    return LIZ.LIZ();
                case 19:
                    return "lte_ca";
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    return "nr";
            }
        }
        return "unknown";
    }
}
