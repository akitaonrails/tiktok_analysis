package X;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k5O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305840k5O {
    public static final C1305840k5O LIZ = new C1305840k5O();
    public static final JSONObject LIZIZ = new JSONObject();

    public static boolean LIZ(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        try {
            if (Build.VERSION.SDK_INT < 31) {
                return false;
            }
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (!((WindowManager) C786410Ut5.H2(context, "window")).isCrossWindowBlurEnabled()) {
                z = true;
            } else {
                z = false;
            }
            try {
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            if (Settings.Global.getInt(context.getContentResolver(), "disable_window_blurs", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            try {
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            if (Settings.Global.getInt(context.getContentResolver(), "accessibility_reduce_transparency", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z) {
                return false;
            }
            if (!z2 && !z3) {
                return false;
            }
            return true;
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            return false;
        }
    }

    public static void LIZIZ(EnumC1305880k5S enumC1305880k5S, Object obj) {
        String str;
        switch (C1305870k5R.LIZ[enumC1305880k5S.ordinal()]) {
            case 1:
                str = "common_screen_reader";
                break;
            case 2:
                str = "common_dark_display";
                break;
            case 3:
                str = "common_reduce_animation";
                break;
            case 4:
                str = "common_preferred_font_size";
                break;
            case 5:
                str = "android_high_contrast_text";
                break;
            case 6:
                str = "common_bold_text";
                break;
            case 7:
                str = "android_color_inversion";
                break;
            case 8:
                str = "android_show_captions";
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                str = "common_dynamic_font";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                str = "android_voice_control";
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                str = "android_touch_exploration";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                str = "disable_window_blurs";
                break;
            default:
                throw new C1954807lC();
        }
        if (obj == null) {
            LIZIZ.remove(str);
        }
        if (!(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Boolean)) {
            return;
        }
        try {
            LIZIZ.put(str, obj.toString());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
