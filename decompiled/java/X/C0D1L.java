package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D1L, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.ColorExtractionComponentImpl$launchWorkers$2$1", f = "ColorExtractionComponent.kt", l = {80, 81}, m = "invokeSuspend")
public final class C0D1L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0D1M LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D1L(C0D1M c0d1m, InterfaceC1364105Vn<? super C0D1L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0d1m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D1L(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0045 -> B:7:0x0018). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "ColorExtractionComponentImpl@edcb.launchWorkers$2$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L4b
            if (r0 == r4) goto L26
            if (r0 != r5) goto L57
            X.0WWy r3 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L18:
            r8.LL = r3
            r8.LLILLJJLI = r4
            java.lang.Object r9 = r3.LIZ(r8)
            if (r9 != r6) goto L2b
            X.C1C7U.LIZIZ(r7)
            return r6
        L26:
            X.0WWy r3 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L2b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L5f
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            X.0D1M r1 = r8.LLILLL
            r8.LL = r3
            r8.LLILLJJLI = r5
            java.lang.String r0 = "HIGH"
            java.lang.Object r0 = r1.m3(r2, r0, r8)
            if (r0 != r6) goto L18
            X.C1C7U.LIZIZ(r7)
            return r6
        L4b:
            X.C155000ia.LIZIZ(r9)
            X.0D1M r0 = r8.LLILLL
            X.095E<java.lang.String> r0 = r0.LLILZLL
            X.0WWy r3 = r0.iterator()
            goto L18
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D1L.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
