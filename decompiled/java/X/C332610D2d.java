package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.BaseCarouselBottomFuncComponent$extractColorAndUpdate$1", f = "BaseCarouselBottomFuncComponent.kt", l = {165, 166}, m = "invokeSuspend")
public final class C332610D2d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1628090sT9 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332610D2d(AbstractC1628090sT9 abstractC1628090sT9, String str, InterfaceC1364105Vn<? super C332610D2d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1628090sT9;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332610D2d(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "BaseCarouselBottomFuncComponent@84.extractColorAndUpdate$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L36
            if (r0 != r3) goto L56
            X.C155000ia.LIZIZ(r8)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r8)
            X.0sT9 r0 = r7.LLILLJJLI
            X.0D2c r1 = r0.LLJJI
            if (r1 == 0) goto L34
            java.lang.String r0 = r7.LLILLL
            r7.LL = r2
            java.lang.Object r8 = r1.get(r0, r7)
            if (r8 != r5) goto L39
            X.C1C7U.LIZIZ(r6)
            return r5
        L34:
            r8 = r4
            goto L3b
        L36:
            X.C155000ia.LIZIZ(r8)
        L39:
            java.lang.Integer r8 = (java.lang.Integer) r8
        L3b:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r2 = r0.LLIILII()
            X.0D2e r1 = new X.0D2e
            X.0sT9 r0 = r7.LLILLJJLI
            r1.<init>(r0, r8, r4)
            r7.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r7, r2, r1)
            if (r0 != r5) goto L17
            X.C1C7U.LIZIZ(r6)
            return r5
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332610D2d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
