package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01XU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.starship.service.StarshipSdkService$toRegisterPitayaReady$1", f = "StarshipSdkService.kt", l = {204, 215}, m = "invokeSuspend")
public final class C01XU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C01XU(InterfaceC1364105Vn<? super C01XU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01XU(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "StarshipSdkService@2648.toRegisterPitayaReady$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L1c
            if (r0 == r5) goto L2d
            if (r0 != r6) goto L14
            goto L5a
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.C155000ia.LIZIZ(r10)
            r9.LL = r5     // Catch: java.lang.Exception -> L7a
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)     // Catch: java.lang.Exception -> L7a
            if (r0 != r7) goto L30
            X.C1C7U.LIZIZ(r8)
            return r7
        L2d:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> L7a
        L30:
            com.bytedance.android.starship.base.IStarshipBaseBridge r1 = X.C1307940k8m.LIZ()     // Catch: java.lang.Exception -> L7a
            r0 = 6
            kotlin.jvm.internal.AFwS258S0000000_20 r0 = kotlin.jvm.internal.AFwS258S0000000_20.get$arr$(r0)     // Catch: java.lang.Exception -> L7a
            r1.LIZ(r0)     // Catch: java.lang.Exception -> L7a
            X.01GW r0 = X.C078600Rc.LIZJ     // Catch: java.lang.Exception -> L7a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L7a
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L7a
            long r3 = r0.longValue()     // Catch: java.lang.Exception -> L7a
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7e
            r9.LL = r6     // Catch: java.lang.Exception -> L7a
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r3, r9)     // Catch: java.lang.Exception -> L7a
            if (r0 != r7) goto L5d
            X.C1C7U.LIZIZ(r8)
            return r7
        L5a:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> L7a
        L5d:
            com.bytedance.android.starship.base.IStarshipBaseBridge r1 = X.C1307940k8m.LIZ()     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = "starship_sdk"
            boolean r2 = r1.initPitaya(r0)     // Catch: java.lang.Exception -> L7a
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = "initPitaya:"
            r1.append(r0)     // Catch: java.lang.Exception -> L7a
            if (r2 != 0) goto L73
            r5 = 0
        L73:
            r1.append(r5)     // Catch: java.lang.Exception -> L7a
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L7a
            goto L7e
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01XU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01XU(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
