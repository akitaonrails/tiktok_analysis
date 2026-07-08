package X;

import android.graphics.Matrix;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18yp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21461318yp extends C21460918yl {
    public static boolean LIZLLL = true;
    public static boolean LJ = true;

    public void LIZLLL(View view, Matrix matrix) {
        if (LIZLLL) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                LIZLLL = false;
            }
        }
    }

    public void LJ(View view, Matrix matrix) {
        if (LJ) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                LJ = false;
            }
        }
    }
}
