package X;

import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: X.0uSP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1704510uSP implements InterfaceC553510LnJ {
    public final AIGCWorkflowManagementApi LIZ;
    public final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final ConcurrentMap<String, C1704480uSM> LIZJ = new ConcurrentHashMap();

    public C1704510uSP(AIGCWorkflowManagementApi aIGCWorkflowManagementApi) {
        this.LIZ = aIGCWorkflowManagementApi;
    }

    @Override // X.InterfaceC553510LnJ
    public final void LIZ(String str, String str2) {
        LJ(str, new C1173504iT(str2));
    }

    @Override // X.InterfaceC553510LnJ
    public final C099F LIZIZ(String str, C553310Lmz c553310Lmz) {
        C099F c099fLIZIZ = C090F.LIZIZ();
        LJ(str, new C1704530uSR(c553310Lmz, c099fLIZIZ));
        return c099fLIZIZ;
    }

    @Override // X.InterfaceC553510LnJ
    public final void LIZJ(String str, List<String> list) {
        LJ(str, new C1173404iS(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r6, X.InterfaceC1704540uSS r7) {
        /*
            r5 = this;
            X.054G r0 = r5.LIZIZ
            boolean r0 = X.C2296808zG.LJI(r0)
            if (r0 != 0) goto L16
            boolean r0 = r7 instanceof X.C1704530uSR
            if (r0 == 0) goto L15
            X.0uSR r7 = (X.C1704530uSR) r7
            X.05XL<kotlin.Unit> r1 = r7.LIZIZ
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.LJIIZILJ(r0)
        L15:
            return
        L16:
            java.util.concurrent.ConcurrentMap<java.lang.String, X.0uSM> r0 = r5.LIZJ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r2 = r0.get(r6)
            X.0uSM r2 = (X.C1704480uSM) r2
            r1 = 0
            if (r2 != 0) goto L4b
            X.0uSM r2 = new X.0uSM
            r2.<init>(r5, r6)
            java.util.concurrent.ConcurrentMap<java.lang.String, X.0uSM> r0 = r5.LIZJ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.putIfAbsent(r6, r2)
            if (r0 == 0) goto L4b
            X.1DEK r0 = r2.LIZIZ
            X.C395701gJ.LIZ(r0)
            X.0956 r0 = r2.LJIIJ
            r0.LIZIZ(r1)
            X.0956 r0 = r2.LJIIIIZZ
            if (r0 == 0) goto L43
            r0.LIZIZ(r1)
        L43:
            X.0956 r0 = r2.LJIIIZ
            if (r0 == 0) goto L16
            r0.LIZIZ(r1)
            goto L16
        L4b:
            java.lang.Object r4 = r2.LJ
            monitor-enter(r4)
            boolean r0 = r2.LJFF     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L66
            X.1DEK r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r0.LJIIIIZZ(r7)     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r0 instanceof X.C094O     // Catch: java.lang.Throwable -> L8b
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L66
            int r0 = r2.LJI     // Catch: java.lang.Throwable -> L8b
            int r0 = r0 + 1
            r2.LJI = r0     // Catch: java.lang.Throwable -> L8b
            goto L67
        L66:
            r3 = 0
        L67:
            monitor-exit(r4)
            if (r3 == 0) goto L6b
            return
        L6b:
            java.util.concurrent.ConcurrentMap<java.lang.String, X.0uSM> r0 = r5.LIZJ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.remove(r6, r2)
            X.1DEK r0 = r2.LIZIZ
            X.C395701gJ.LIZ(r0)
            X.0956 r0 = r2.LJIIJ
            r0.LIZIZ(r1)
            X.0956 r0 = r2.LJIIIIZZ
            if (r0 == 0) goto L83
            r0.LIZIZ(r1)
        L83:
            X.0956 r0 = r2.LJIIIZ
            if (r0 == 0) goto L16
            r0.LIZIZ(r1)
            goto L16
        L8b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1704510uSP.LJ(java.lang.String, X.0uSS):void");
    }

    @Override // X.InterfaceC553510LnJ
    public final void LIZLLL(String str, String str2, boolean z) {
        LJ(str, new C1267704xf(str2, z));
    }
}
