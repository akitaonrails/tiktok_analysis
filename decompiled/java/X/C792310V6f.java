package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792310V6f extends AbstractC792220V5w<InterfaceC792320V6g> {
    public static volatile C792310V6f LLJI;
    public InterfaceC792330V6h LLJ;

    public static C792310V6f LJIIIZ() {
        if (LLJI == null) {
            synchronized (C792310V6f.class) {
                try {
                    if (LLJI == null) {
                        LLJI = new C792310V6f();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC792220V5w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.InterfaceC792320V6g r12) {
        /*
            r11 = this;
            org.json.JSONObject r8 = r12.LIZ()
            r5 = r11
            X.0V6i r0 = r5.LLILZIL
            r4 = 1
            r2 = 0
            if (r0 == 0) goto L24
            boolean r0 = X.C792340V6i.LIZ(r8)
            if (r0 == 0) goto L24
            r1 = 1
        L12:
            r9 = 1
            if (r1 == 0) goto L1c
            X.0V6i r0 = r5.LLILZIL
            if (r0 == 0) goto L1c
            X.C792340V6i.LIZIZ(r8)
        L1c:
            boolean r0 = X.C792400V6o.LJIIIIZZ()
            if (r0 == 0) goto L73
            r0 = 2
            goto L2d
        L24:
            r1 = 0
            boolean r0 = r12.LIZJ(r8)
            if (r0 != 0) goto L12
            r9 = 0
            goto L1c
        L2d:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L6f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = "logType: "
            r1.append(r0)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = r12.LIZLLL()     // Catch: java.lang.Exception -> L6f
            r1.append(r0)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = ", subType: "
            r1.append(r0)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = r12.LJ()     // Catch: java.lang.Exception -> L6f
            r1.append(r0)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = "data: "
            r1.append(r0)     // Catch: java.lang.Exception -> L6f
            r1.append(r8)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L6f
            r3[r2] = r0     // Catch: java.lang.Exception -> L6f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = " ,sample: "
            r1.append(r0)     // Catch: java.lang.Exception -> L6f
            r1.append(r9)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L6f
            r3[r4] = r0     // Catch: java.lang.Exception -> L6f
            X.C2163508dl.LIZ(r3)     // Catch: java.lang.Exception -> L6f
            goto L73
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L73:
            if (r9 != 0) goto L89
            boolean r0 = r12.LIZIZ()
            if (r0 != 0) goto L89
            boolean r0 = X.C792400V6o.LJIIIIZZ()
            if (r0 == 0) goto L88
            java.lang.String r0 = r12.LIZLLL()
            X.C793430VAn.LIZ(r8, r0, r2)
        L88:
            return
        L89:
            java.lang.String r6 = r12.LIZLLL()
            java.lang.String r7 = r12.LJ()
            r10 = 0
            r5.LJII(r6, r7, r8, r9, r10)
            X.0V6h r1 = r5.LLJ
            if (r1 == 0) goto La3
            r12.LIZLLL()
            java.lang.String r0 = r12.LJ()
            r1.LIZ(r0, r8)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C792310V6f.LIZLLL(X.0V6g):void");
    }
}
