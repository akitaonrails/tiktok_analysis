package X;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0Bde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C292720Bde {
    public static final Set<String> LIZ = new HashSet();

    static {
        String strLJIL = C0C64.LJIILLIIL().LJIL(31744, 2, "optimize_hot_warm_boot_refresh_finish_top_4400", "", true);
        if (strLJIL != null) {
            for (String str : strLJIL.split(",")) {
                LIZ.add(str.trim());
            }
        }
    }
}
