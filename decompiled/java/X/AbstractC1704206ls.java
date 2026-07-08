package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.06ls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1704206ls implements InterfaceC420801kM {
    public final AtomicBoolean LL = new AtomicBoolean(false);

    public abstract void LIZ();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LL.compareAndSet(false, true)) {
            LIZ();
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LL.get();
    }
}
