package X;

import com.ss.android.ugc.aweme.ecommerce.proto.hybrid.EcHybridPbDecodeConfigModel;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pa1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517030pa1 implements InterfaceC1517070pa5 {
    public final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final ConcurrentHashMap<String, AnonymousClass0957<InterfaceC1516890pZn>> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1517070pa5
    public final Object LIZ(String str, boolean z, C1517050pa3 c1517050pa3) {
        String str2;
        EcHybridPbDecodeConfigModel ecHybridPbDecodeConfigModel = (EcHybridPbDecodeConfigModel) C1517020pa0.LIZ().get(str);
        if (ecHybridPbDecodeConfigModel == null || (str2 = ecHybridPbDecodeConfigModel.channelName) == null) {
            return null;
        }
        AnonymousClass0957<InterfaceC1516890pZn> anonymousClass0957 = this.LIZIZ.get(str2);
        if (anonymousClass0957 != null) {
            return LIZIZ(str2, c1517050pa3, anonymousClass0957);
        }
        AnonymousClass0957<InterfaceC1516890pZn> anonymousClass0957LIZIZ = C23250099c.LIZIZ(this.LIZ, null, null, new C2153408c8(str2, z, null), 3);
        AnonymousClass0957<InterfaceC1516890pZn> anonymousClass0957PutIfAbsent = this.LIZIZ.putIfAbsent(str2, anonymousClass0957LIZIZ);
        if (anonymousClass0957PutIfAbsent != null) {
            anonymousClass0957LIZIZ = anonymousClass0957PutIfAbsent;
        }
        return LIZIZ(str2, c1517050pa3, anonymousClass0957LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r10, X.InterfaceC1364105Vn r11, X.AnonymousClass0957 r12) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1517060pa4
            if (r0 == 0) goto L24
            r3 = r11
            X.0pa4 r3 = (X.C1517060pa4) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r8 = r3.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLILZIL
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            X.0957 r12 = r3.LLILLJJLI
            java.lang.Object r10 = r3.LL
            goto L42
        L24:
            X.0pa4 r3 = new X.0pa4
            r3.<init>(r9, r11)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r8)
            r3.LL = r10     // Catch: java.lang.Exception -> L48
            r3.LLILLJJLI = r12     // Catch: java.lang.Exception -> L48
            r3.LLILZIL = r0     // Catch: java.lang.Exception -> L48
            java.lang.Object r8 = r12.LJLIIIL(r3)     // Catch: java.lang.Exception -> L48
            if (r8 != r2) goto L45
            return r2
        L42:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Exception -> L48
        L45:
            X.0pZn r8 = (X.InterfaceC1516890pZn) r8     // Catch: java.lang.Exception -> L48
            return r8
        L48:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.service.IEcErrorCollectService> r3 = com.ss.android.ugc.aweme.ecommerce.service.IEcErrorCollectService.class
            r4 = 0
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.ecommerce.service.IEcErrorCollectService r1 = (com.ss.android.ugc.aweme.ecommerce.service.IEcErrorCollectService) r1
            if (r1 == 0) goto L61
            java.lang.String r0 = "GeckoDefinitionsProvider getDefinitions failed"
            r1.LIZ(r0, r2, r8)
        L61:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0957<X.0pZn>> r2 = r9.LIZIZ
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L6d
            r2.remove(r10, r12)
            return r8
        L6d:
            monitor-enter(r2)
            java.lang.Object r0 = r2.get(r10)     // Catch: java.lang.Throwable -> L7f
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r12)     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L7d
            r2.remove(r10)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r2)
            return r8
        L7d:
            monitor-exit(r2)
            return r8
        L7f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1517030pa1.LIZIZ(java.lang.String, X.05Vn, X.0957):java.lang.Object");
    }
}
