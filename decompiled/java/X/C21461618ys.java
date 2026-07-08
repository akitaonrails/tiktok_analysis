package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21461618ys extends C21371818kO {
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
