package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03d2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C885003d2 {
    public static void LIZ(View view, boolean z) {
        try {
            if (z) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -2;
                C786410Ut5.W5(view, layoutParams);
                C12ES.LJIILL(0, view);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = 0;
            C786410Ut5.W5(view, layoutParams2);
            C0H1U.LIZIZ(view);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZIZ();
        }
    }
}
