package X;

import android.os.ParcelUuid;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0k04, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302540k04 implements InterfaceC1302330jzj {
    public final C1302520k02 LL;
    public final C05XL<Unit> LLILLJJLI;
    public final CoroutineContext LLILLL;
    public final InterfaceC346201Wa<C1302410jzr> LLILZ;
    public final InterfaceC346201Wa<List<C1302410jzr>> LLILZIL;
    public final InterfaceC346201Wa<Boolean> LLILZLL;

    @Override // X.InterfaceC1302330jzj
    public final ParcelUuid xT0() {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LL.LL), null, null, new C0NRH(null), 3);
        return this.LL.LLJILJIL.getCallId();
    }

    @Override // X.InterfaceC1302330jzj
    public final InterfaceC346201Wa<List<C1302410jzr>> Ii() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1302330jzj
    public final InterfaceC346201Wa<C1302410jzr> NQ0() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1302330jzj
    public final InterfaceC346201Wa<Boolean> isMuted() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1302330jzj
    public final Object Ix0(InterfaceC1364105Vn<? super AbstractC1302360jzm> interfaceC1364105Vn) {
        return this.LL.LJIILLIIL(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1302330jzj
    public final Object kb0(InterfaceC1364105Vn interfaceC1364105Vn) {
        return this.LL.LIZ(1, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1302330jzj
    public final Object ta0(InterfaceC1364105Vn<? super AbstractC1302360jzm> interfaceC1364105Vn) {
        return this.LL.LJIILL(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1302330jzj
    public final Object VY1(C1302410jzr c1302410jzr, InterfaceC1364105Vn<? super AbstractC1302360jzm> interfaceC1364105Vn) {
        return this.LL.LJII(c1302410jzr, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    @Override // X.InterfaceC1302330jzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uL1(android.telecom.DisconnectCause r6, X.InterfaceC1364105Vn<? super X.AbstractC1302360jzm> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1302600k0A
            if (r0 == 0) goto L3e
            r4 = r7
            X.0k0A r4 = (X.C1302600k0A) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L44
            X.0k04 r0 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            X.05XL<kotlin.Unit> r1 = r0.LLILLJJLI
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.LJIIZILJ(r0)
            return r3
        L2c:
            X.C155000ia.LIZIZ(r3)
            X.0k02 r0 = r5.LL
            r4.LL = r5
            r4.LLILZ = r1
            java.lang.Object r3 = r0.LIZIZ(r6, r4)
            if (r3 != r2) goto L3c
            return r2
        L3c:
            r0 = r5
            goto L24
        L3e:
            X.0k0A r4 = new X.0k0A
            r4.<init>(r5, r7)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302540k04.uL1(android.telecom.DisconnectCause, X.05Vn):java.lang.Object");
    }

    public C1302540k04(C1302520k02 c1302520k02, C1302920k0g c1302920k0g, C05XL<Unit> c05xl, CoroutineContext coroutineContext) {
        this.LL = c1302520k02;
        this.LLILLJJLI = c05xl;
        this.LLILLL = coroutineContext;
        this.LLILZ = C09IC.LJJIIJ(c1302920k0g.LIZ);
        this.LLILZIL = C09IC.LJJIIJ(c1302920k0g.LIZIZ);
        this.LLILZLL = C09IC.LJJIIJ(c1302920k0g.LIZJ);
    }
}
