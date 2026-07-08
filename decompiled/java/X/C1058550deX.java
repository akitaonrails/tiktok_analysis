package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.base.activity.MainActivityGlobalAbility;

/* JADX INFO: renamed from: X.0deX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058550deX {
    public static boolean LIZ;
    public static Fragment LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;

    public static Fragment LIZ(C19EG c19eg) {
        if (LIZ) {
            return LIZIZ;
        }
        return C343710Ddh.LIZ(c19eg).BQ2();
    }

    public static boolean LIZIZ(C19EG c19eg, String str) {
        Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19eg);
        if (C1585030rLh.LJIIJ(str) != -1) {
            if (hoxLIZ.KQ2(str)) {
                return true;
            }
            if (C486860J7k.LIZIZ(c19eg).FQ2("NOTIFICATION")) {
                return TextUtils.equals(str, "NOTIFICATION");
            }
            if (C486860J7k.LIZIZ(c19eg).FQ2("page_profile")) {
                return TextUtils.equals(LIZJ, str);
            }
        }
        return hoxLIZ.KQ2(str);
    }

    public static boolean LIZJ(C19EG c19eg, String str) {
        Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19eg);
        if (C1585030rLh.LJIIJ(str) != -1) {
            if (hoxLIZ.LQ2(str)) {
                return true;
            }
            MainActivityGlobalAbility mainActivityGlobalAbility = (MainActivityGlobalAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), MainActivityGlobalAbility.class, null);
            if (mainActivityGlobalAbility != null && mainActivityGlobalAbility.RY0() && LIZIZ(c19eg, str)) {
                return true;
            }
            return false;
        }
        return hoxLIZ.LQ2(str);
    }
}
