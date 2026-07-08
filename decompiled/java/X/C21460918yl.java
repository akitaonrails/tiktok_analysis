package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18yl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21460918yl extends C21371918kP {
    public static boolean LIZJ = true;

    public float LIZIZ(View view) {
        if (LIZJ) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                LIZJ = false;
            }
        }
        return view.getAlpha();
    }

    public void LIZJ(View view, float f) {
        if (LIZJ) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                LIZJ = false;
            }
        }
        C786410Ut5.T4(view, f);
    }
}
