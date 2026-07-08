package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11IM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11IM extends AbstractC19483511Kn<Long> {
    public final long LL;
    public final TimeUnit LLILLJJLI;
    public final C11RO LLILLL;

    @Override // X.AbstractC19483511Kn
    public final void LJIJI(C11IH<? super Long> c11ih) {
        C11IL c11il = new C11IL(c11ih);
        c11ih.onSubscribe(c11il);
        C11JE.replace(c11il, this.LLILLL.LIZJ(c11il, this.LL, this.LLILLJJLI));
    }

    public C11IM(long j, TimeUnit timeUnit, C11RO c11ro) {
        this.LL = j;
        this.LLILLJJLI = timeUnit;
        this.LLILLL = c11ro;
    }
}
