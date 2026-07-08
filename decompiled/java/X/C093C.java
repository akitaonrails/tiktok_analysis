package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.093C, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.EffectPrefetcherComponentImplV2$startDrainer$1$1$1$1", f = "EffectPrefetcherComponentImplV2.kt", l = {110, 111}, m = "invokeSuspend")
public final class C093C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public int LLILLJJLI;
    public final /* synthetic */ C093F LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C093C(C093F c093f, InterfaceC1364105Vn<? super C093C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c093f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C093C(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0040 -> B:7:0x0018). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "EffectPrefetcherComponentImplV2@7766.startDrainer$1$1$1$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L46
            if (r0 == r2) goto L26
            if (r0 != r3) goto L52
            X.0WWy r1 = r6.LL
            X.C155000ia.LIZIZ(r7)
        L18:
            r6.LL = r1
            r6.LLILLJJLI = r2
            java.lang.Object r7 = r1.LIZ(r6)
            if (r7 != r4) goto L2b
            X.C1C7U.LIZIZ(r5)
            return r4
        L26:
            X.0WWy r1 = r6.LL
            X.C155000ia.LIZIZ(r7)
        L2b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L5a
            r1.next()
            X.093F r0 = r6.LLILLL
            r6.LL = r1
            r6.LLILLJJLI = r3
            java.lang.Object r0 = r0.X1(r6)
            if (r0 != r4) goto L18
            X.C1C7U.LIZIZ(r5)
            return r4
        L46:
            X.C155000ia.LIZIZ(r7)
            X.093F r0 = r6.LLILLL
            X.095E<kotlin.Unit> r0 = r0.LLIZ
            X.0WWy r1 = r0.iterator()
            goto L18
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C093C.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
