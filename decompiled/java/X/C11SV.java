package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11SV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11SV<T> extends AtomicInteger implements InterfaceC420801kM {
    public static final long serialVersionUID = 466549804534799122L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final C11SU<T> LLILLJJLI;
    public Object LLILLL;
    public volatile boolean LLILZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        this.LLILLJJLI.LJLZ(this);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ;
    }

    public C11SV(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, C11SU<T> c11su) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = c11su;
    }
}
