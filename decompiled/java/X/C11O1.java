package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11O1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11O1 extends C11NZ<Long> {
    public final C11RO LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final TimeUnit LLILZ;

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super Long> interfaceC626120Oh8) {
        C11I2 c11i2 = new C11I2(interfaceC626120Oh8);
        interfaceC626120Oh8.onSubscribe(c11i2);
        C11RO c11ro = this.LL;
        if (c11ro instanceof C1701840uO6) {
            C11RN c11rnLIZ = c11ro.LIZ();
            C11JE.setOnce(c11i2, c11rnLIZ);
            c11rnLIZ.LIZLLL(c11i2, this.LLILLJJLI, this.LLILLL, this.LLILZ);
            return;
        }
        C11JE.setOnce(c11i2, c11ro.LIZLLL(c11i2, this.LLILLJJLI, this.LLILLL, this.LLILZ));
    }

    public C11O1(long j, long j2, TimeUnit timeUnit, C11RO c11ro) {
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = timeUnit;
        this.LL = c11ro;
    }
}
