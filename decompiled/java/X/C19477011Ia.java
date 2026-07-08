package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11Ia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19477011Ia extends AbstractC19486711Lt {
    public final C11IV LL;
    public final long LLILLJJLI;
    public final TimeUnit LLILLL;
    public final C11RO LLILZ;
    public final boolean LLILZIL = false;

    @Override // X.AbstractC19486711Lt
    public final void LJIJJ(C11IY c11iy) {
        this.LL.LIZIZ(new C11IZ(c11iy, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL));
    }

    public C19477011Ia(C11IV c11iv, long j, TimeUnit timeUnit, C11RO c11ro) {
        this.LL = c11iv;
        this.LLILLJJLI = j;
        this.LLILLL = timeUnit;
        this.LLILZ = c11ro;
    }
}
