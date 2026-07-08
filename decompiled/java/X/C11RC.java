package X;

import Y.ARunnableS129S0100000_29;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.11RC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11RC implements InterfaceC420801kM {
    public final AtomicBoolean LL = new AtomicBoolean();

    public abstract void LIZ();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LL.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                LIZ();
            } else {
                C1701940uOG.LIZIZ().LIZIZ(new ARunnableS129S0100000_29(this, 250));
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LL.get();
    }
}
