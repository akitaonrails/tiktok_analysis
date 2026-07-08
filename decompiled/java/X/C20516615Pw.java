package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15Pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20516615Pw {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZIZ(C1771930wD9 c1771930wD9) {
        try {
            int iLIZJ = C418440Gaw.LIZJ(c1771930wD9.getContext());
            if (iLIZJ <= 0) {
                int iLJIIIIZZ = C12ES.LJIIIIZZ(c1771930wD9.getContext());
                if (iLJIIIIZZ >= 0) {
                    return iLJIIIIZZ;
                }
            } else {
                return iLIZJ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return 0;
    }

    public static int LIZJ(View view) {
        try {
            int iLIZLLL = C418440Gaw.LIZLLL(view.getContext());
            if (iLIZLLL <= 0) {
                int iLJIIJ = C12ES.LJIIJ(view.getContext());
                if (iLJIIJ >= 0) {
                    return iLJIIJ;
                }
            } else {
                return iLIZLLL;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return 0;
    }

    public static void LIZLLL(C1771930wD9 c1771930wD9, float f) {
        if (c1771930wD9.getLayoutDirection() == 1) {
            f = -f;
        }
        C786410Ut5.Jc(c1771930wD9, f);
    }

    public static void LIZ(View view, int[] iArr, Boolean bool, Integer num) {
        int iLIZJ;
        view.getLocationInWindow(iArr);
        if (bool != null) {
            if (!bool.booleanValue()) {
                return;
            }
        } else if (view.getLayoutDirection() != 1) {
            return;
        }
        if (num != null) {
            iLIZJ = num.intValue();
        } else {
            iLIZJ = LIZJ(view);
        }
        iArr[0] = (iLIZJ - iArr[0]) - view.getMeasuredWidth();
    }
}
