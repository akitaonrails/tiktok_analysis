package X;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: X.0MWV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MWV {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Bundle bundle) {
        int i;
        if (bundle != null) {
            i = bundle.getInt("translation_type", 0);
        } else {
            i = 0;
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(16, 15, 17, 13, 12, 14, 18, 19, 20, 9);
        if (C15Q1.LIZ().transitionType > 0) {
            listLJIILJJIL.add(9);
        }
        if (!listLJIILJJIL.contains(Integer.valueOf(i))) {
            return 11;
        }
        return i;
    }

    public static int LIZIZ(Bundle bundle) {
        if (bundle == null) {
            return 1;
        }
        int i = bundle.getInt("translation_type", 0);
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(16, 15, 17, 13, 12, 14, 10, 1, 19, 18, 19, 20, 22, 27);
        if (C15Q1.LIZ().transitionType > 0) {
            listLJIILJJIL.add(9);
        }
        if (!listLJIILJJIL.contains(Integer.valueOf(i))) {
            i = 11;
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tools_shooting_page_enter_animation_type", true);
        if (iLJIJ == 1) {
            return 1;
        }
        if (iLJIJ == 2) {
            if (i == 16) {
                return 31;
            }
            if (i == 11) {
                return 33;
            }
        } else if (iLJIJ == 3) {
            if (i == 16) {
                return 29;
            }
            if (i == 11) {
                return 32;
            }
        }
        return i;
    }
}
