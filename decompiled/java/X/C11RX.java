package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11RX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11RX<T> extends AtomicInteger implements InterfaceC420801kM {
    public static final long serialVersionUID = 2728361546769921047L;
    public final C11RU<T> LL;
    public final InterfaceC626120Oh8<? super T> LLILLJJLI;
    public Object LLILLL;
    public volatile boolean LLILZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        this.LL.LIZ(this);
        this.LLILLL = null;
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ;
    }

    public C11RX(C11RU<T> c11ru, InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LL = c11ru;
        this.LLILLJJLI = interfaceC626120Oh8;
    }
}
