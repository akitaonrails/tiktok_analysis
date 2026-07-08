package X;

/* JADX INFO: renamed from: X.00va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C235600va {
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r4, com.bytedance.ies.sdk.datachannel.DataChannel r5, java.lang.String r6) {
        /*
            X.0IjA r2 = X.C0IJT.LIZ(r6)
            r3 = 0
            if (r4 == 0) goto L7f
            long r0 = r4.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        Lf:
            java.lang.String r0 = "room_id"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "user_id"
            r2.LJJII(r1, r0)
            r1 = 1
            if (r5 == 0) goto L7b
            boolean r0 = X.C500260Jjc.LJIIZILJ(r5)
            if (r0 != r1) goto L72
            java.lang.String r1 = "anchor"
        L34:
            java.lang.String r0 = "user_type"
            r2.LJJII(r1, r0)
            if (r4 == 0) goto L70
            com.bytedance.android.live.base.model.user.User r0 = r4.getOwner()
            if (r0 == 0) goto L70
            long r0 = r0.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L4a:
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            if (r5 == 0) goto L59
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = X.C751980Tee.LIZJ(r5)
            if (r0 == 0) goto L59
            java.lang.String r3 = r0.logStreamingType
        L59:
            java.lang.String r0 = "live_type"
            r2.LJJII(r3, r0)
            qo2.w r0 = qo2.w.LIZ
            r0.getClass()
            java.lang.String r1 = qo2.w.LJIILIIL()
            java.lang.String r0 = "event_page"
            r2.LJJII(r1, r0)
            r2.LIZ()
            return
        L70:
            r1 = r3
            goto L4a
        L72:
            boolean r0 = X.C01C5.LIZ(r5)
            if (r0 != r1) goto L7b
            java.lang.String r1 = "admin"
            goto L34
        L7b:
            java.lang.String r1 = "viewer"
            goto L34
        L7f:
            r1 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C235600va.LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String):void");
    }
}
