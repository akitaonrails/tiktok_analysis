package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.network.EcomNetworkScoreCenter$scoreConsumer$2$1", f = "EcomNetworkScoreCenter.kt", l = {194}, m = "invokeSuspend")
public final class C877940YcK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C877940YcK(InterfaceC1364105Vn<? super C877940YcK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C877940YcK c877940YcK = new C877940YcK(interfaceC1364105Vn);
        c877940YcK.LLILLL = obj;
        return c877940YcK;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006d -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "EcomNetworkScoreCenter@8a4c.scoreConsumer$2$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L4d
            if (r0 != r3) goto L79
            X.0WWy r5 = r7.LL
            java.lang.Object r2 = r7.LLILLL
            X.C155000ia.LIZIZ(r8)
        L17:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            if (r0 == 0) goto L73
            java.lang.Object r1 = r5.next()
            X.0pIF r1 = (X.InterfaceC1506010pIF) r1
            X.0pI8 r0 = X.C1505940pI8.LIZ     // Catch: java.lang.Throwable -> L3d
            r0.getClass()     // Catch: java.lang.Throwable -> L3d
            X.0YcL r0 = X.C1505940pI8.LIZLLL(r1)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L37
            java.lang.String r1 = r0.LIZ     // Catch: java.lang.Throwable -> L3d
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L3d
            X.C1018703yb.LIZIZ(r1, r0)     // Catch: java.lang.Throwable -> L3d
        L37:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L3d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L3d
            goto L49
        L3d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L49:
            X.C189200o6.m5exceptionOrNullimpl(r0)
            goto L63
        L4d:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r2 = r7.LLILLL
            X.0pI8 r0 = X.C1505940pI8.LIZ
            r0.getClass()
            X.01GW r0 = X.C1505940pI8.LJIILJJIL
            java.lang.Object r0 = r0.getValue()
            X.0954 r0 = (X.AnonymousClass0954) r0
            X.0WWy r5 = r0.iterator()
        L63:
            r7.LLILLL = r2
            r7.LL = r5
            r7.LLILLJJLI = r3
            java.lang.Object r8 = r5.LIZ(r7)
            if (r8 != r4) goto L17
            X.C1C7U.LIZIZ(r6)
            return r4
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C877940YcK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
