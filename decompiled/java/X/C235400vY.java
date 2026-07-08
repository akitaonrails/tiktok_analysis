package X;

/* JADX INFO: renamed from: X.00vY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C235400vY {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r5, java.lang.String r6) {
        /*
            r3 = 0
            if (r5 == 0) goto L8b
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r4 = r5.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r4
        Lb:
            X.0IjA r2 = X.C0IJT.LIZ(r6)
            if (r4 == 0) goto L89
            long r0 = r4.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L19:
            java.lang.String r0 = "room_id"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "user_id"
            r2.LJJII(r1, r0)
            r1 = 1
            if (r5 == 0) goto L85
            boolean r0 = X.C500260Jjc.LJIIZILJ(r5)
            if (r0 != r1) goto L7c
            java.lang.String r1 = "anchor"
        L3e:
            java.lang.String r0 = "user_type"
            r2.LJJII(r1, r0)
            if (r4 == 0) goto L7a
            com.bytedance.android.live.base.model.user.User r0 = r4.getOwner()
            if (r0 == 0) goto L7a
            long r0 = r0.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L54:
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            if (r5 == 0) goto L63
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = X.C751980Tee.LIZJ(r5)
            if (r0 == 0) goto L63
            java.lang.String r3 = r0.logStreamingType
        L63:
            java.lang.String r0 = "live_type"
            r2.LJJII(r3, r0)
            qo2.w r0 = qo2.w.LIZ
            r0.getClass()
            java.lang.String r1 = qo2.w.LJIILIIL()
            java.lang.String r0 = "event_page"
            r2.LJJII(r1, r0)
            r2.LIZ()
            return
        L7a:
            r1 = r3
            goto L54
        L7c:
            boolean r0 = X.C01C5.LIZ(r5)
            if (r0 != r1) goto L85
            java.lang.String r1 = "admin"
            goto L3e
        L85:
            java.lang.String r1 = "viewer"
            goto L3e
        L89:
            r1 = r3
            goto L19
        L8b:
            r4 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C235400vY.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String):void");
    }
}
