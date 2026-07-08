package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VPL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VPL {
    public static final void LIZ(int i, final Activity activity) {
        if (i != -1) {
            return;
        }
        C1606560ruQ.LIZIZ(activity);
        final View decorView = activity.getWindow().getDecorView();
        C786410Ut5.y3(decorView.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0VPK
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C786410Ut5.D3(decorView.getViewTreeObserver(), this);
                try {
                    C1606560ruQ.LJ(activity);
                    return false;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }
        });
    }
}
