package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.058Q, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager$setValueForKeyInMemory$1", f = "EcUgPitayaManager.kt", l = {}, m = "invokeSuspend")
public final class C058Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058Q(String str, String str2, Object obj, InterfaceC1364105Vn<? super C058Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C058Q(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[PHI: r0
      0x0068: PHI (r0v16 com.bytedance.pitaya.api.feature.IKVStore) = (r0v15 com.bytedance.pitaya.api.feature.IKVStore), (r0v20 com.bytedance.pitaya.api.feature.IKVStore) binds: [B:14:0x0054, B:19:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[Catch: all -> 0x009b, CancellationException -> 0x00bf, PHI: r0
      0x0092: PHI (r0v8 com.bytedance.pitaya.api.feature.IKVStore) = (r0v7 com.bytedance.pitaya.api.feature.IKVStore), (r0v12 com.bytedance.pitaya.api.feature.IKVStore) binds: [B:25:0x007e, B:30:0x0090] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x00bf, all -> 0x009b, blocks: (B:24:0x0076, B:26:0x0080, B:28:0x0088, B:29:0x008c, B:32:0x0095, B:31:0x0092), top: B:41:0x0076 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "EcUgPitayaManager@a4f0.setValueForKeyInMemory$1"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r14)
            java.lang.String r5 = r13.LL
            java.lang.String r4 = r13.LLILLJJLI
            java.lang.Object r3 = r13.LLILLL
            boolean r0 = X.C034S.LIZ()
            r2 = 0
            if (r0 == 0) goto Laf
            X.04Zw r0 = X.C1120604Zw.LIZ
            r0.LIZ()
            long r7 = android.os.SystemClock.elapsedRealtime()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r1 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r1
            if (r1 == 0) goto Lad
            r12 = 1
        L30:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.String r10 = r0.getName()
            r9 = 1
            if (r1 == 0) goto Lab
            java.lang.Class r0 = r1.getClass()
            java.lang.String r11 = r0.getName()
        L41:
            X.C1AQS.LIZJ(r7, r9, r10, r11, r12)
        L44:
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService r1 = (com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService) r1
            boolean r0 = r1.isLocalTest()
            if (r0 == 0) goto L76
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.pitaya.api.feature.IKVStore> r1 = com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager.memoryKVStores
            java.lang.Object r0 = r1.get(r5)
            com.bytedance.pitaya.api.feature.IKVStore r0 = (com.bytedance.pitaya.api.feature.IKVStore) r0
            if (r0 != 0) goto L68
            com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager r0 = com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager.INSTANCE
            com.bytedance.pitaya.api.feature.IFeatureCore r0 = r0.getFeatureCore()
            if (r0 == 0) goto L62
            com.bytedance.pitaya.api.feature.IKVStore r2 = r0.createInMemoryKVStore(r5)
        L62:
            r1.put(r5, r2)
            r0 = r2
            if (r2 == 0) goto L6b
        L68:
            r0.setValueForKey(r4, r3)
        L6b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C189200o6.m2constructorimpl(r0)
        L70:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L76:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.pitaya.api.feature.IKVStore> r1 = com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager.memoryKVStores     // Catch: java.lang.Throwable -> L9b java.util.concurrent.CancellationException -> Lbf
            java.lang.Object r0 = r1.get(r5)     // Catch: java.lang.Throwable -> L9b java.util.concurrent.CancellationException -> Lbf
            com.bytedance.pitaya.api.feature.IKVStore r0 = (com.bytedance.pitaya.api.feature.IKVStore) r0     // Catch: java.lang.Throwable -> L9b java.util.concurrent.CancellationException -> Lbf
            if (r0 != 0) goto L92
            com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager r0 = com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager.INSTANCE     // Catch: java.lang.Throwable -> L9b java.util.concurrent.CancellationException -> Lbf
            com.bytedance.pitaya.api.feature.IFeatureCore r0 = r0.getFeatureCore()     // Catch: java.lang.Throwable -> L9b java.util.concurrent.CancellationException -> Lbf
            if (r0 == 0) goto L8c
            com.bytedance.pitaya.api.feature.IKVStore r2 = r0.createInMemoryKVStore(r5)     // Catch: java.lang.Throwable -> L9b java.util.concurrent.CancellationException -> Lbf
        L8c:
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L9b java.util.concurrent.CancellationException -> Lbf
            r0 = r2
            if (r2 == 0) goto L95
        L92:
            r0.setValueForKey(r4, r3)     // Catch: java.lang.Throwable -> L9b java.util.concurrent.CancellationException -> Lbf
        L95:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L9b java.util.concurrent.CancellationException -> Lbf
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L9b java.util.concurrent.CancellationException -> Lbf
            goto L70
        L9b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.C1AF0.LJ(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            goto L70
        Lab:
            r11 = r2
            goto L41
        Lad:
            r12 = 0
            goto L30
        Laf:
            X.04Zw r0 = X.C1120604Zw.LIZ
            r0.LIZ()
            X.04aq r1 = X.C1120604Zw.LIZJ
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            X.0317 r1 = r1.LIZLLL(r0)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r1 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r1
            goto L44
        Lbf:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C058Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
