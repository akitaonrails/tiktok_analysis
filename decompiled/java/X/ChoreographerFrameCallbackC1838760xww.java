package X;

import android.view.Choreographer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0xww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class ChoreographerFrameCallbackC1838760xww implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ C1838750xwv LL;

    public final void LIZ() {
        C1838750xwv.LLIILII(this.LL);
        C1838750xwv c1838750xwv = this.LL;
        synchronized (c1838750xwv.LLILLL) {
            try {
                if (c1838750xwv.LLILZIL.isEmpty()) {
                    c1838750xwv.LL.removeFrameCallback(this);
                    c1838750xwv.LLIZLLLIL = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public ChoreographerFrameCallbackC1838760xww(C1838750xwv c1838750xwv) {
        this.LL = c1838750xwv;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.LL.LLILLJJLI.removeCallbacks(this);
        C1838750xwv.LLIILII(this.LL);
        C1838750xwv c1838750xwv = this.LL;
        synchronized (c1838750xwv.LLILLL) {
            try {
                if (!c1838750xwv.LLIZLLLIL) {
                    return;
                }
                c1838750xwv.LLIZLLLIL = false;
                List<Choreographer.FrameCallback> list = c1838750xwv.LLILZIL;
                c1838750xwv.LLILZIL = c1838750xwv.LLILZLL;
                c1838750xwv.LLILZLL = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) ListProtector.get(list, i)).doFrame(j);
                }
                list.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
