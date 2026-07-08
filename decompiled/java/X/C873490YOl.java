package X;

/* JADX INFO: renamed from: X.0YOl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873490YOl {
    public final C0YH7 LIZ;
    public final C873570YOt LIZIZ;

    public C873490YOl(C0YH5 c0yh5, C873570YOt c873570YOt) {
        this.LIZ = c0yh5;
        this.LIZIZ = c873570YOt;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061 A[Catch: Exception -> 0x008c, TryCatch #0 {Exception -> 0x008c, blocks: (B:10:0x0052, B:12:0x0061, B:13:0x0082, B:9:0x0048), top: B:18:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[Catch: Exception -> 0x008c, TRY_LEAVE, TryCatch #0 {Exception -> 0x008c, blocks: (B:10:0x0052, B:12:0x0061, B:13:0x0082, B:9:0x0048), top: B:18:0x0048 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C00FC LIZ(java.lang.String r16, X.C0YHT r17, java.util.List<? extends X.AbstractC873650YPb> r18, X.C0Y3I r19, X.C0IC5 r20, X.C0YOY r21) {
        /*
            r15 = this;
            X.0YOm r8 = new X.0YOm
            r0 = r20
            boolean r13 = r0.LIZ
            r14 = 4
            r11 = r21
            r12 = r19
            r10 = r18
            r9 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.0YOt r5 = r15.LIZIZ
            X.0YH7 r0 = r15.LIZ
            X.0YH1 r0 = r0.LLJLL()
            X.01wk r3 = r0.LIZ()
            r7 = 0
            if (r3 != 0) goto L2a
            r2 = r7
        L22:
            r5.getClass()
            java.lang.String r4 = "SendMediaMessageUseCaseV2"
            if (r2 != 0) goto L52
            goto L48
        L2a:
            kotlin.coroutines.CoroutineContext r1 = r3.getCoroutineContext()
            X.08zJ r0 = X.C09AE.LJJLJ
            kotlin.coroutines.CoroutineContext$Element r2 = r1.get(r0)
            X.09AE r2 = (X.C09AE) r2
            kotlin.coroutines.CoroutineContext r1 = r3.getCoroutineContext()
            X.094b r0 = new X.094b
            r0.<init>(r2)
            kotlin.coroutines.CoroutineContext r0 = r1.plus(r0)
            X.054G r2 = X.C2296808zG.LIZ(r0)
            goto L22
        L48:
            X.0YH7 r0 = r5.LIZ     // Catch: java.lang.Exception -> L8c
            X.0YH1 r0 = r0.LLJLL()     // Catch: java.lang.Exception -> L8c
            X.01wk r2 = r0.LIZ()     // Catch: java.lang.Exception -> L8c
        L52:
            X.0YH7 r0 = r5.LIZ     // Catch: java.lang.Exception -> L8c
            X.0YEM r1 = r0.LJFF()     // Catch: java.lang.Exception -> L8c
            X.0YOY r0 = r8.LIZLLL     // Catch: java.lang.Exception -> L8c
            X.0YPf r6 = new X.0YPf     // Catch: java.lang.Exception -> L8c
            r6.<init>(r1, r0)     // Catch: java.lang.Exception -> L8c
            if (r2 != 0) goto L82
            X.0YH7 r0 = r5.LIZ     // Catch: java.lang.Exception -> L8c
            X.0Y6i r1 = r0.LIZLLL()     // Catch: java.lang.Exception -> L8c
            java.lang.String r0 = "userLifecycleScope is null, ABORT"
            r1.LJIIIIZZ(r4, r0, r7)     // Catch: java.lang.Exception -> L8c
            X.0YQ0 r3 = new X.0YQ0     // Catch: java.lang.Exception -> L8c
            X.0YPY r2 = new X.0YPY     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = "userLifecycleScope is null"
            r0 = -1042(0xfffffffffffffbee, float:NaN)
            r2.<init>(r0, r1, r7, r7)     // Catch: java.lang.Exception -> L8c
            java.lang.String r0 = X.C873700YPg.LIZ(r9)     // Catch: java.lang.Exception -> L8c
            r3.<init>(r7, r7, r2, r0)     // Catch: java.lang.Exception -> L8c
            r6.LIZ(r3)     // Catch: java.lang.Exception -> L8c
            goto Lb7
        L82:
            X.0YOn r1 = new X.0YOn     // Catch: java.lang.Exception -> L8c
            r1.<init>(r5, r8, r6, r7)     // Catch: java.lang.Exception -> L8c
            r0 = 3
            X.C23250099c.LIZLLL(r2, r7, r7, r1, r0)     // Catch: java.lang.Exception -> L8c
            goto Lb7
        L8c:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0YH7 r0 = r5.LIZ
            X.0Y6i r2 = r0.LIZLLL()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "startSendingProcess exception "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 0
            r2.LJIIIIZZ(r4, r1, r0)
            X.0YH7 r0 = r5.LIZ
            X.0YDx r0 = r0.LJ()
            X.0YJ8 r0 = r0.getEvent()
            r0.LIZLLL(r4, r3)
        Lb7:
            X.00FC r0 = new X.00FC
            r1 = r16
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873490YOl.LIZ(java.lang.String, X.0YHT, java.util.List, X.0Y3I, X.0IC5, X.0YOY):X.00FC");
    }
}
