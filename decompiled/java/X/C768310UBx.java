package X;

/* JADX INFO: renamed from: X.0UBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768310UBx {
    public long LIZ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C754290TiN
            if (r0 == 0) goto L20
            r6 = r8
            X.0TiN r6 = (X.C754290TiN) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            goto L26
        L20:
            X.0TiN r6 = new X.0TiN
            r6.<init>(r7, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L83
            goto L66
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.android.livesdk.livesetting.broadcast.LiveHostWsMigrationSwitch r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveHostWsMigrationSwitch.INSTANCE     // Catch: java.lang.Throwable -> L83
            boolean r0 = r0.isEnable()     // Catch: java.lang.Throwable -> L83
            r4 = 3
            if (r0 == 0) goto L6e
            webcast.api.room.EventReportReqMessage r2 = new webcast.api.room.EventReportReqMessage     // Catch: java.lang.Throwable -> L83
            r2.<init>()     // Catch: java.lang.Throwable -> L83
            long r0 = r7.LIZ     // Catch: java.lang.Throwable -> L83
            r2.roomId = r0     // Catch: java.lang.Throwable -> L83
            r2.event = r4     // Catch: java.lang.Throwable -> L83
            byte[] r2 = X.C1516000pYM.LJ(r2)     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L66
            X.0psC r1 = new X.0psC     // Catch: java.lang.Throwable -> L83
            r0 = 7
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L83
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostNetwork> r0 = com.bytedance.android.livesdkapi.host.IHostNetwork.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)     // Catch: java.lang.Throwable -> L83
            com.bytedance.android.livesdkapi.host.IHostNetwork r0 = (com.bytedance.android.livesdkapi.host.IHostNetwork) r0     // Catch: java.lang.Throwable -> L83
            X.0UC2 r0 = r0.getLiveHostWsManager()     // Catch: java.lang.Throwable -> L83
            X.0ps9 r0 = (X.C1528270ps9) r0     // Catch: java.lang.Throwable -> L83
            r0.LIZLLL(r1)     // Catch: java.lang.Throwable -> L83
        L66:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L83
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L83
            goto L8f
        L6e:
            X.01GW<X.0UVW> r0 = X.C0UVW.LIZIZ     // Catch: java.lang.Throwable -> L83
            X.0UVW r0 = X.C01QD.LIZ()     // Catch: java.lang.Throwable -> L83
            com.bytedance.android.livesdk.api.BroadcastRoomApiKt r2 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L83
            long r0 = r7.LIZ     // Catch: java.lang.Throwable -> L83
            r6.LLILLL = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r2.reportEvent(r0, r4, r6)     // Catch: java.lang.Throwable -> L83
            if (r0 != r5) goto L66
            return r5
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L8f:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L9a
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C768310UBx.LIZ(X.05Vn):java.lang.Object");
    }
}
