package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11Ie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19477411Ie extends AbstractC19486711Lt {
    public final long LL;
    public final TimeUnit LLILLJJLI;
    public final C11RO LLILLL;

    @Override // X.AbstractC19486711Lt
    public final void LJIJJ(C11IY c11iy) {
        RunnableC19477311Id runnableC19477311Id = new RunnableC19477311Id(c11iy);
        c11iy.onSubscribe(runnableC19477311Id);
        C11JE.replace(runnableC19477311Id, this.LLILLL.LIZJ(runnableC19477311Id, this.LL, this.LLILLJJLI));
    }

    public C19477411Ie(long j, TimeUnit timeUnit, C11RO c11ro) {
        this.LL = j;
        this.LLILLJJLI = timeUnit;
        this.LLILLL = c11ro;
    }
}
