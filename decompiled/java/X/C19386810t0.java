package X;

import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10t0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19386810t0 {
    public boolean LIZ;
    public Pair<? extends ViewPager, ? extends Runnable> LIZIZ;

    public final void LIZ() {
        Pair<? extends ViewPager, ? extends Runnable> pair = this.LIZIZ;
        if (pair != null) {
            try {
                HandlerHook.viewRemoveCallbacks(pair.getFirst(), pair.getSecond());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LIZIZ = null;
    }
}
