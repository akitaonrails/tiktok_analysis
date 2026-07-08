package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.01xQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C501801xQ {
    public static final C501801xQ LIZ = new C501801xQ();
    public static final Keva LIZIZ = Keva.getRepo("ai_studio_setting");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.Integer> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C351801Ye
            if (r0 == 0) goto L21
            r5 = r7
            X.01Ye r5 = (X.C351801Ye) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = -1
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            goto L42
        L21:
            X.01Ye r5 = new X.01Ye
            r5.<init>(r6, r7)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r4)
            X.01xR r0 = com.ss.android.ugc.aweme.creatorcenter.settings.AiStudioApi.LIZ     // Catch: java.lang.Exception -> L90
            r0.getClass()     // Catch: java.lang.Exception -> L90
            com.ss.android.ugc.aweme.creatorcenter.settings.AiStudioApi r0 = X.C501901xR.LIZIZ     // Catch: java.lang.Exception -> L90
            r5.LLILLL = r1     // Catch: java.lang.Exception -> L90
            java.lang.Object r4 = r0.requestAiStudioSettingSuspend(r5)     // Catch: java.lang.Exception -> L90
            if (r4 != r2) goto L45
            return r2
        L42:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L90
        L45:
            X.0X52 r4 = (X.C0X52) r4     // Catch: java.lang.Exception -> L90
            boolean r0 = r4.LIZJ()     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L88
            T r0 = r4.LIZIZ     // Catch: java.lang.Exception -> L90
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L90
            com.google.gson.n r1 = X.C0TGH.LIZ(r0)     // Catch: java.lang.Exception -> L90
            r2 = 0
            if (r1 == 0) goto L6d
            java.lang.String r0 = "settings"
            com.google.gson.h r1 = r1.LJJIIZI(r0)     // Catch: java.lang.Exception -> L90
            if (r1 == 0) goto L6d
            r0 = 0
            com.google.gson.k r1 = r1.LJJIIJZLJL(r0)     // Catch: java.lang.Exception -> L90
        L65:
            boolean r0 = r1 instanceof com.google.gson.n     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L6f
            r2 = r1
            com.google.gson.n r2 = (com.google.gson.n) r2     // Catch: java.lang.Exception -> L90
            goto L6f
        L6d:
            r1 = r2
            goto L65
        L6f:
            if (r2 == 0) goto L72
            goto L74
        L72:
            r2 = -1
            goto L80
        L74:
            java.lang.String r0 = "status"
            com.google.gson.k r0 = r2.LJJIIZ(r0)     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L72
            int r2 = r0.LJIIJJI()     // Catch: java.lang.Exception -> L90
        L80:
            com.bytedance.keva.Keva r1 = X.C501801xQ.LIZIZ     // Catch: java.lang.Exception -> L90
            java.lang.String r0 = "ai_studio_status"
            r1.storeInt(r0, r2)     // Catch: java.lang.Exception -> L90
            goto L98
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L90
            java.lang.String r0 = "Response failed or body is null"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L90
            throw r1     // Catch: java.lang.Exception -> L90
        L90:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            goto L99
        L98:
            r3 = r2
        L99:
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C501801xQ.LIZ(X.05Vn):java.lang.Object");
    }
}
