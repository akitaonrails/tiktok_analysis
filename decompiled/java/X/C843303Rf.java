package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspCartPreview;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.03Rf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C843303Rf {
    public static final boolean LIZ = C953203o2.LIZIZ();
    public static final C844003Rm LIZIZ = new C098K<String, C03RS>() { // from class: X.03Rm
    };
    public static final C844003Rm LIZJ = new C098K<String, C03RS>() { // from class: X.03Rm
    };
    public static final boolean LIZLLL = ECOspCartPreview.LIZ();
    public static final ConcurrentHashMap<String, Integer> LJ = new ConcurrentHashMap<>();
    public static final List<String> LJFF = new ArrayList();

    public static void LIZ(Integer num) {
        if (num != null && num.intValue() == 1) {
            if (C03RU.LIZ() || LIZLLL) {
                LIZJ.LIZ();
                return;
            }
            return;
        }
        if (!LIZ && !LIZLLL) {
            return;
        }
        LIZIZ.LIZ();
    }

    public static C03RS LIZIZ(Integer num, String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (num != null && num.intValue() == 1) {
            if (C03RU.LIZ() || LIZLLL) {
                return LIZJ.LIZIZ(str);
            }
        } else if (LIZ || LIZLLL) {
            return LIZIZ.LIZIZ(str);
        }
        return null;
    }

    public static boolean LIZJ(Integer num, String str) {
        C03RS c03rsLIZIZ;
        if ((!LIZ && !C03RU.LIZ() && !LIZLLL) || str == null || str.length() == 0) {
            return false;
        }
        if (num != null && num.intValue() == 1) {
            c03rsLIZIZ = LIZJ.LIZIZ(str);
        } else {
            c03rsLIZIZ = LIZIZ.LIZIZ(str);
        }
        if (!C770702zh.LIZIZ(str) || c03rsLIZIZ == null || SystemClock.elapsedRealtime() - c03rsLIZIZ.LIZLLL > ((Number) c03rsLIZIZ.LJI.getValue()).longValue()) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Integer num, String str) {
        C03RS c03rsLIZIZ;
        if (LIZJ(num, str) && (c03rsLIZIZ = LIZIZ(num, str)) != null) {
            return c03rsLIZIZ.LIZ();
        }
        return false;
    }

    public static void LJ(Integer num, String str) {
        if (str != null && str.length() != 0) {
            if (num != null && num.intValue() == 1) {
                if (C03RU.LIZ() || LIZLLL) {
                    LIZJ.LIZLLL(str);
                    return;
                }
                return;
            }
            if (!LIZ && !LIZLLL) {
                return;
            }
            LIZIZ.LIZLLL(str);
        }
    }

    public static void LJFF(String str, C03RS c03rs, Integer num) {
        if (str != null && str.length() != 0) {
            if (num != null && num.intValue() == 1) {
                if (C03RU.LIZ() || LIZLLL) {
                    LIZJ.LIZJ(str, c03rs);
                    return;
                }
                return;
            }
            if (!LIZ && !LIZLLL) {
                return;
            }
            LIZIZ.LIZJ(str, c03rs);
        }
    }
}
