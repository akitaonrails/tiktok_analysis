package X;

import android.animation.AnimatorSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0c20, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC996220c20 extends AbstractC2273051Dy3 {
    public AnimatorSet LIZIZ;

    @Override // X.AbstractC2273051Dy3
    public final void LIZ() {
        try {
            AnimatorSet animatorSet = this.LIZIZ;
            if (animatorSet == null || !animatorSet.isRunning()) {
                return;
            }
            animatorSet.end();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
