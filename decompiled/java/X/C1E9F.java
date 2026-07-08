package X;

import com.ss.android.ugc.profile.business.ur.experiment.SearchInRelationExpValue;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1E9F, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E9F {
    public static final SearchInRelationExpValue LIZ = new SearchInRelationExpValue(2, 5000, 5000, 50);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(670));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(669));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(668));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(667));

    public static int LIZ() {
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static boolean LIZIZ(boolean z, Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue > ((Number) LJ.getValue()).intValue()) {
            return false;
        }
        if ((!z || LIZ() != 1) && LIZ() != 2) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(boolean z, Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue > ((Number) LIZLLL.getValue()).intValue()) {
            return false;
        }
        if ((!z || LIZ() != 1) && LIZ() != 2) {
            return false;
        }
        return true;
    }
}
