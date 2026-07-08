package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11O2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11O2 extends C11NZ<Long> {
    public final C11RO LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final TimeUnit LLILZLL;

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super Long> interfaceC626120Oh8) {
        C11I9 c11i9 = new C11I9(interfaceC626120Oh8, this.LLILLJJLI, this.LLILLL);
        interfaceC626120Oh8.onSubscribe(c11i9);
        C11RO c11ro = this.LL;
        if (c11ro instanceof C1701840uO6) {
            C11RN c11rnLIZ = c11ro.LIZ();
            C11JE.setOnce(c11i9, c11rnLIZ);
            c11rnLIZ.LIZLLL(c11i9, this.LLILZ, this.LLILZIL, this.LLILZLL);
            return;
        }
        C11JE.setOnce(c11i9, c11ro.LIZLLL(c11i9, this.LLILZ, this.LLILZIL, this.LLILZLL));
    }

    public C11O2(long j, long j2, long j3, long j4, TimeUnit timeUnit, C11RO c11ro) {
        this.LLILZ = j3;
        this.LLILZIL = j4;
        this.LLILZLL = timeUnit;
        this.LL = c11ro;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }
}
