package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0u5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690600u5y implements InterfaceC20058313e1 {
    public boolean LIZIZ;
    public InterfaceC1364105Vn<? super Unit> LIZJ;

    @Override // X.InterfaceC1685750ty9
    public final /* synthetic */ InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9) {
        return C1685810tyF.LIZ(this, interfaceC1685750ty9);
    }

    @Override // X.InterfaceC1685750ty9
    public final /* synthetic */ boolean LJIILLIIL(Function1 function1) {
        return C1672400tcc.LIZ(this, function1);
    }

    @Override // X.InterfaceC20058313e1
    public final void LJIIJJI() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn = this.LIZJ;
        if (interfaceC1364105Vn != null) {
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC1364105Vn.resumeWith(unit);
        }
        this.LIZJ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1690610u5z
            if (r0 == 0) goto L5f
            r5 = r7
            X.0u5z r5 = (X.C1690610u5z) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 != r3) goto L65
            X.05Vn r2 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            if (r2 == 0) goto L2e
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C189200o6.m2constructorimpl(r0)
            r2.resumeWith(r0)
        L2e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r6.LIZIZ
            if (r0 != 0) goto L2e
            X.05Vn<? super kotlin.Unit> r2 = r6.LIZJ
            r5.getClass()
            r5.LL = r2
            r5.LLILZ = r3
            X.1DEt r1 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r1.<init>(r3, r0)
            r1.LJIJJ()
            r6.LIZJ = r1
            java.lang.Object r1 = r1.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L5c
            X.C099Q.LIZJ(r5)
        L5c:
            if (r1 != r4) goto L24
            return r4
        L5f:
            X.0u5z r5 = new X.0u5z
            r5.<init>(r6, r7)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690600u5y.LJIJI(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1685750ty9
    public final Object LJIILJJIL(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
