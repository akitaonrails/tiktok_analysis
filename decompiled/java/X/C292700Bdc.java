package X;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0Bdc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C292700Bdc {
    public static final Set<String> LIZ = new HashSet();
    public static final Set<String> LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;

    static {
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "4370_view_preload_miss_white_list", "", true);
        if (!TextUtils.isEmpty(strLJJ)) {
            for (String str : strLJJ.split(",")) {
                LIZ.add(str.trim());
            }
        }
        LIZIZ = new HashSet();
        String strLJJ2 = C0C64.LJIILLIIL().LJJ(31744, "4370_view_preload_miss_black_list", "", true);
        if (!TextUtils.isEmpty(strLJJ2)) {
            for (String str2 : strLJJ2.split(",")) {
                LIZIZ.add(str2.trim());
            }
        }
        LIZJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "4370_view_preload_miss_threshold", true);
        LIZLLL = C0C64.LJIILLIIL().LJIJ(31744, 30000, "4370_view_preload_hit_dead_line", true);
        LJ = C0C64.LJIILLIIL().LJIJ(31744, 5000, "4370_view_preload_intercept_dead_line", true);
        LJFF = C0C64.LJIILLIIL().LJIJ(31744, 5000, "4480_view_preload_delay_sleep", true);
    }
}
