package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.popcard.ECExplanationWatcherCardWidgetNativeImpl$showAfterAnim$2", f = "ECExplanationWatcherCardWidgetNativeImpl.kt", l = {633}, m = "invokeSuspend")
public final class C591930NJn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C21199817xk LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591930NJn(C21199817xk c21199817xk, InterfaceC1364105Vn<? super C591930NJn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c21199817xk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C591930NJn c591930NJn = new C591930NJn(this.LLILLL, interfaceC1364105Vn);
        c591930NJn.LLILLJJLI = obj;
        return c591930NJn;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003f -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "ECExplanationWatcherCardWidgetNativeImpl@4b4c.showAfterAnim$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L45
            if (r0 != r3) goto L53
            java.lang.Object r0 = r6.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            X.C155000ia.LIZIZ(r7)
        L17:
            X.0NJo r2 = new X.0NJo
            r1 = 2
            r2.<init>(r1, r3)
            X.C1440005kM.LIZ(r2)
        L20:
            boolean r1 = X.C2296808zG.LJI(r0)
            if (r1 == 0) goto L4d
            X.17xk r1 = r6.LLILLL
            X.01GW r1 = r1.LJFF
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 * 1000
            long r1 = (long) r1
            r6.LLILLJJLI = r0
            r6.LL = r3
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r1, r6)
            if (r1 != r4) goto L17
            X.C1C7U.LIZIZ(r5)
            return r4
        L45:
            X.C155000ia.LIZIZ(r7)
            java.lang.Object r0 = r6.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            goto L20
        L4d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C591930NJn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
