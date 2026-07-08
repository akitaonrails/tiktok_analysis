package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11MD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11MD extends C11NN<Long> {
    public final C11RO LLILLJJLI;
    public final long LLILLL;
    public final TimeUnit LLILZ;

    @Override // X.C11NN
    public final void LJIILLIIL(C11M9<? super Long> c11m9) {
        C11ME c11me = new C11ME(c11m9);
        c11m9.onSubscribe(c11me);
        C11JE.trySet(c11me, this.LLILLJJLI.LIZJ(c11me, this.LLILLL, this.LLILZ));
    }

    public C11MD(long j, TimeUnit timeUnit, C11RO c11ro) {
        this.LLILLL = j;
        this.LLILZ = timeUnit;
        this.LLILLJJLI = c11ro;
    }
}
