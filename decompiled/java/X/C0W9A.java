package X;

import android.os.Build;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0W9A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W9A {
    public static final String LIZ() {
        switch (Build.VERSION.SDK_INT) {
            case 23:
                return "6";
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            case 25:
                return "7";
            case 26:
            case 27:
                return "8";
            case 28:
                return "9";
            case 29:
                return "10";
            case 30:
                return "11";
            case 31:
            case 32:
                return "12";
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return "13";
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return "14";
            case 35:
                return "15";
            default:
                return "null";
        }
    }

    public static final String LIZIZ() {
        String string;
        String lowerCase;
        String string2;
        String str = Build.MANUFACTURER;
        String lowerCase2 = null;
        if (str != null && (string2 = a0.LJLIIIL(str).toString()) != null) {
            lowerCase2 = string2.toLowerCase(Locale.ROOT);
        }
        String str2 = "";
        if (lowerCase2 == null) {
            lowerCase2 = "";
        }
        String str3 = Build.BRAND;
        if (str3 != null && (string = a0.LJLIIIL(str3).toString()) != null && (lowerCase = string.toLowerCase(Locale.ROOT)) != null) {
            str2 = lowerCase;
        }
        if (lowerCase2.length() == 0) {
            lowerCase2 = str2;
        }
        return lowerCase2.length() == 0 ? "unknown" : lowerCase2;
    }
}
