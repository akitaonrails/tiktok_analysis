package X;

/* JADX INFO: renamed from: X.0fBX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117450fBX {
    public static final /* synthetic */ C1117450fBX LIZ = new C1117450fBX();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.model.message.RoomEventMessage> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1117470fBZ
            if (r0 == 0) goto L20
            r6 = r8
            X.0fBZ r6 = (X.C1117470fBZ) r6
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
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L5d
        L20:
            X.0fBZ r6 = new X.0fBZ
            r6.<init>(r7, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()     // Catch: java.lang.Exception -> L6d
            if (r0 == 0) goto L59
            X.0Jki r0 = r0.user()     // Catch: java.lang.Exception -> L6d
            if (r0 == 0) goto L59
            long r2 = r0.getCurrentUserId()     // Catch: java.lang.Exception -> L6d
        L41:
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L6d
            java.lang.Class<com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi> r0 = com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L6d
            java.lang.Object r0 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L6d
            com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi r0 = (com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi) r0     // Catch: java.lang.Exception -> L6d
            r6.LLILLL = r4     // Catch: java.lang.Exception -> L6d
            java.lang.Object r1 = r0.getPreviewPageStickerInfo(r2, r6)     // Catch: java.lang.Exception -> L6d
            if (r1 != r5) goto L60
            goto L5c
        L59:
            r2 = 0
            goto L41
        L5c:
            return r5
        L5d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L6d
        L60:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Exception -> L6d
            if (r1 == 0) goto L71
            T r0 = r1.data     // Catch: java.lang.Exception -> L6d
            com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi$PreviewStickerInfoResponse r0 = (com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi.PreviewStickerInfoResponse) r0     // Catch: java.lang.Exception -> L6d
            if (r0 == 0) goto L71
            com.bytedance.android.livesdk.model.message.RoomEventMessage r0 = r0.roomEventMessage     // Catch: java.lang.Exception -> L6d
            return r0
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L71:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1117450fBX.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Long r15, long r16, long r18, java.lang.String r20, java.lang.String r21, int r22, X.InterfaceC1364105Vn r23) {
        /*
            r14 = this;
            r3 = r23
            boolean r0 = r3 instanceof X.C1117460fBY
            if (r0 == 0) goto L22
            r13 = r3
            X.0fBY r13 = (X.C1117460fBY) r13
            int r2 = r13.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r13.LLILLL = r2
        L14:
            java.lang.Object r1 = r13.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LLILLL
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 != r2) goto L2c
            goto L28
        L22:
            X.0fBY r13 = new X.0fBY
            r13.<init>(r14, r3)
            goto L14
        L28:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L5a
            goto L5f
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L5a
            java.lang.Class<com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi> r0 = com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L5a
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L5a
            com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi r4 = (com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi) r4     // Catch: java.lang.Exception -> L5a
            r13.LLILLL = r2     // Catch: java.lang.Exception -> L5a
            r12 = r22
            r8 = r18
            r11 = r21
            r6 = r16
            r10 = r20
            r5 = r15
            java.lang.Object r0 = r4.configLiveEventSticker(r5, r6, r8, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L5a
            if (r0 != r3) goto L5f
            return r3
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2 = 0
        L5f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1117450fBX.LIZ(java.lang.Long, long, long, java.lang.String, java.lang.String, int, X.05Vn):java.lang.Object");
    }
}
