package X;

/* JADX INFO: renamed from: X.00vW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C235200vW {
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r5, java.lang.String r6, com.bytedance.ies.sdk.datachannel.DataChannel r7, java.util.Map r8) {
        /*
            X.0IjA r2 = X.C0IJT.LIZ(r6)
            r4 = 0
            if (r5 == 0) goto L9d
            long r0 = r5.getId()
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
            r3 = 1
            if (r7 == 0) goto L99
            boolean r0 = X.C500260Jjc.LJIIZILJ(r7)
            if (r0 != r3) goto L90
            java.lang.String r1 = "anchor"
        L34:
            java.lang.String r0 = "user_type"
            r2.LJJII(r1, r0)
            if (r5 == 0) goto L8e
            com.bytedance.android.live.base.model.user.User r0 = r5.getOwner()
            if (r0 == 0) goto L8e
            long r0 = r0.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L4a:
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            if (r5 == 0) goto L8c
            com.bytedance.android.live.base.model.user.User r0 = r5.getOwner()
            if (r0 == 0) goto L8c
            long r0 = r0.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L5f:
            java.lang.String r0 = "author_id"
            r2.LJJII(r1, r0)
            if (r7 == 0) goto L6e
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = X.C751980Tee.LIZJ(r7)
            if (r0 == 0) goto L6e
            java.lang.String r4 = r0.logStreamingType
        L6e:
            java.lang.String r0 = "live_type"
            r2.LJJII(r4, r0)
            if (r7 == 0) goto L89
            boolean r0 = X.C500260Jjc.LJIIZILJ(r7)
            if (r0 != r3) goto L89
            java.lang.String r1 = "live_take_detail"
        L7d:
            java.lang.String r0 = "event_page"
            r2.LJJII(r1, r0)
            r2.LJJIIZI(r8)
            r2.LIZ()
            return
        L89:
            java.lang.String r1 = "live_detail"
            goto L7d
        L8c:
            r1 = r4
            goto L5f
        L8e:
            r1 = r4
            goto L4a
        L90:
            boolean r0 = X.C01C5.LIZ(r7)
            if (r0 != r3) goto L99
            java.lang.String r1 = "admin"
            goto L34
        L99:
            java.lang.String r1 = "viewer"
            goto L34
        L9d:
            r1 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C235200vW.LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, com.bytedance.ies.sdk.datachannel.DataChannel, java.util.Map):void");
    }
}
