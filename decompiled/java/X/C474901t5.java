package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01t5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.utils.MinisGuidanceSheetUtil$loadLottieComposition$1$1$1$1", f = "MinisGuidanceSheetUtil.kt", l = {}, m = "invokeSuspend")
public final class C474901t5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1292000jj4<C1294720jnS> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474901t5(C1292000jj4<C1294720jnS> c1292000jj4, InterfaceC1364105Vn<? super C474901t5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1292000jj4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C474901t5 c474901t5 = new C474901t5(this.LLILLJJLI, interfaceC1364105Vn);
        c474901t5.LL = obj;
        return c474901t5;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.String r2 = "MinisGuidanceSheetUtil@389c.loadLottieComposition$1$1$1$1"
            X.C1C7U.LIZ(r2)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r4)
            X.0jj4<X.0jnS> r0 = r3.LLILLJJLI
            V r1 = r0.LIZ
            X.0jnS r1 = (X.C1294720jnS) r1
            if (r1 == 0) goto L1d
            com.ss.android.ugc.aweme.minis.view.MinisGuidanceSheetFragment r0 = X.C14M7.LIZJ
            if (r0 == 0) goto L1d
            r0.LL = r1
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L26
        L1d:
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r1 = "MinisGuidanceSheetUtil"
            java.lang.String r0 = "Failed to load animation"
            X.C1720106oR.LIZ(r1, r0)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C474901t5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
