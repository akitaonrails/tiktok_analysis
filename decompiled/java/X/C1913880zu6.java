package X;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0zu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913880zu6 {
    public static final String LIZIZ() {
        String upperCase;
        String str;
        String strLJFF = "";
        try {
            C844470XAv.LIZ.getClass();
            TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C844470XAv.LIZ(), "phone");
            AtomicBoolean atomicBoolean = C794320VDy.LIZ;
            upperCase = C1300840jxK.LJIIIIZZ(telephonyManager);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            upperCase = "";
        }
        if (!TextUtils.isEmpty(upperCase)) {
            upperCase = upperCase.toUpperCase();
        }
        if (C2138308Zh.LIZ()) {
            String str2 = "US";
            if (TextUtils.isEmpty(upperCase)) {
                strLJFF = C2222691Bz1.LJFF();
                if (TextUtils.isEmpty(strLJFF)) {
                    strLJFF = C2222691Bz1.LIZJ();
                }
                if (TextUtils.isEmpty(strLJFF)) {
                    str = "US";
                } else {
                    strLJFF = strLJFF.toUpperCase(Locale.US);
                    str = strLJFF;
                }
            } else {
                str = upperCase;
            }
            if (!TextUtils.equals(upperCase, "CN") && !TextUtils.equals(strLJFF, "CN")) {
                str2 = str;
            }
            C844470XAv.LIZ.getClass();
            String string = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "test_setting").getString("pref_carrier", str2);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return upperCase;
    }

    public static final String LIZ() {
        String strLIZIZ = LIZIZ();
        if (TextUtils.isEmpty(strLIZIZ)) {
            strLIZIZ = C2222691Bz1.LJFF();
            if (TextUtils.isEmpty(strLIZIZ)) {
                strLIZIZ = C2222691Bz1.LIZJ();
            }
        }
        if (TextUtils.isEmpty(strLIZIZ)) {
            strLIZIZ = "";
        }
        return strLIZIZ.toUpperCase();
    }

    public static final boolean LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Arrays.asList("AT", "BE", "BG", "HR", "CY", "CZ", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "GB").contains(str.toUpperCase());
    }
}
