package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11O5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11O5<T> extends C11J7<T, T> {
    public final long LLILLJJLI;
    public final TimeUnit LLILLL;
    public final C11RO LLILZ;
    public final boolean LLILZIL;

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        InterfaceC626120Oh8<? super T> c11pi = interfaceC626120Oh8;
        if (!this.LLILZIL) {
            c11pi = new C11PI(c11pi);
        }
        this.LL.LIZIZ(new C19498111Qd(c11pi, this.LLILLJJLI, this.LLILLL, this.LLILZ.LIZ(), this.LLILZIL));
    }

    public C11O5(C098D c098d, long j, TimeUnit timeUnit, C11RO c11ro) {
        super(c098d);
        this.LLILLJJLI = j;
        this.LLILLL = timeUnit;
        this.LLILZ = c11ro;
        this.LLILZIL = false;
    }
}
