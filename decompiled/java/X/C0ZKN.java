package X;

/* JADX INFO: renamed from: X.0ZKN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZKN {
    public final String LIZ = "push_avatar_image";
    public final C0ZK0 LIZIZ;

    public C0ZKN(C0ZK0 c0zk0) {
        this.LIZIZ = c0zk0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap LIZ(android.graphics.Bitmap.Config r13, com.ss.android.ugc.aweme.base.model.UrlModel r14, java.lang.String r15) {
        /*
            r12 = this;
            r10 = r14
            r1 = 0
            if (r15 == 0) goto Ld
            X.0ZK0 r0 = r12.LIZIZ
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.LIZ(r1, r15)
            if (r0 == 0) goto Ld
            r10 = r0
        Ld:
            if (r10 != 0) goto L10
            return r1
        L10:
            long r8 = java.lang.System.currentTimeMillis()
            boolean r0 = X.C0ZKR.LIZ()
            r3 = 1
            java.lang.String r4 = ""
            if (r0 == 0) goto L71
            java.util.List r0 = r10.getUrlList()
            java.lang.Object r2 = X.C13LP.LJJJLL(r0)
            if (r2 != 0) goto L28
            r2 = r4
        L28:
            X.01GW r0 = X.C0ZKR.LIZ
            java.lang.Object r0 = r0.getValue()
            X.0WQx r0 = (X.C823170WQx) r0
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L71
            r5 = 1
        L37:
            if (r5 == 0) goto L6f
            java.util.List r0 = r10.getUrlList()
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L46
            r4 = r0
        L46:
            boolean r11 = X.C1326900kdM.LIZ(r4)
        L4a:
            X.03IT r2 = new X.03IT
            java.util.List r0 = r10.getUrlList()
            r2.<init>(r0)
            java.util.concurrent.CountDownLatch r7 = new java.util.concurrent.CountDownLatch
            r7.<init>(r3)
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference
            r6.<init>(r1)
            X.0kl3 r0 = X.C1331660kl2.LJIIJ(r2)
            r0.LJIL = r13
            X.C1326900kdM.LIZIZ(r0)
            X.0ZKV r4 = new X.0ZKV
            r4.<init>()
            r0.LJJII(r4)
            goto L73
        L6f:
            r11 = 0
            goto L4a
        L71:
            r5 = 0
            goto L37
        L73:
            r7.await()     // Catch: java.lang.InterruptedException -> L7d
            java.lang.Object r0 = r6.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L7d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Thread r0 = X.C786410Ut5.u3()
            r0.interrupt()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZKN.LIZ(android.graphics.Bitmap$Config, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String):android.graphics.Bitmap");
    }
}
