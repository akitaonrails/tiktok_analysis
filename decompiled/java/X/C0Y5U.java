package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y5U, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.metric.InitMetricsHelper$trackGetByUserRequestEnd$1", f = "InitMetricsHelper.kt", l = {}, m = "invokeSuspend")
public final class C0Y5U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YCR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y5U(C0YCR c0ycr, InterfaceC1364105Vn<? super C0Y5U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ycr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y5U(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "InitMetricsHelper@8acf.trackGetByUserRequestEnd$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            X.0YCR r2 = r5.LL
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.LJIIJ = r0
            X.0YCR r0 = r5.LL
            kotlin.jvm.functions.Function0<? extends X.0Y3w> r0 = r0.LJIJI
            if (r0 == 0) goto L73
            java.lang.Object r0 = r0.invoke()
            X.0Y3w r0 = (X.C868140Y3w) r0
            if (r0 == 0) goto L73
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = r0.LJIIIZ
            if (r0 == 0) goto L73
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L73
            java.util.List r1 = X.C13LP.LLIIII(r0)
            if (r1 == 0) goto L73
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L73
            java.util.Iterator r3 = r1.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r2 = r3.next()
        L49:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r1 = r3.next()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L69
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L69
            r0 = 1
        L64:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            goto L49
        L69:
            r0 = 0
            goto L64
        L6b:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Empty collection can't be reduced."
            r1.<init>(r0)
            throw r1
        L73:
            X.0YCR r1 = r5.LL
            java.lang.String r0 = "get_by_user_combo failure"
            r1.LIZJ(r0)
            goto L8b
        L7b:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r1 == 0) goto L73
            X.0YCR r0 = r5.LL
            r0.LIZIZ(r1)
        L8b:
            X.0YCR r1 = r5.LL
            X.0YCU r0 = X.C0YCU.COMPLETED
            r1.LJ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y5U.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
