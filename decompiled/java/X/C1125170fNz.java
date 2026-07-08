package X;

/* JADX INFO: renamed from: X.0fNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125170fNz {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:5:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r4, com.bytedance.android.livesdk.model.message.GiftMessage r5, com.bytedance.android.livesdkapi.depend.model.live.Room r6) {
        /*
            java.lang.String r2 = "gift_tray"
            r3 = 0
            if (r5 == 0) goto L6
            goto L8
        L6:
            r1 = r3
            goto Le
        L8:
            com.bytedance.android.livesdk.model.GiftTrayInfo r0 = r5.mTrayInfo     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L6
            java.lang.String r1 = r0.rightTagJumpSchema     // Catch: java.lang.Exception -> Lb9
        Le:
            boolean r0 = X.C1125150fNx.LIZJ(r4, r5, r6)     // Catch: java.lang.Exception -> Lb9
            if (r0 != 0) goto Lc0
            boolean r0 = X.C500260Jjc.LJJIIZ(r1)     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto Lc0
            if (r4 != 0) goto L1d
            return
        L1d:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)     // Catch: java.lang.Exception -> Lb9
            android.net.Uri$Builder r1 = r0.buildUpon()     // Catch: java.lang.Exception -> Lb9
            java.lang.String r0 = "tap_area"
            r1.appendQueryParameter(r0, r2)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r0 = "enter_from"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r2)     // Catch: java.lang.Exception -> Lb9
            android.net.Uri r0 = r0.build()     // Catch: java.lang.Exception -> Lb9
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Exception -> Lb9
            com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayForGuardianSetting r0 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayForGuardianSetting.INSTANCE     // Catch: java.lang.Exception -> Lb9
            boolean r0 = r0.isEnable()     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto Lac
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)     // Catch: java.lang.Exception -> Lb9
            com.bytedance.android.live.actionhandler.IActionHandlerService r0 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r0     // Catch: java.lang.Exception -> Lb9
            r0.handle(r4, r1)     // Catch: java.lang.Exception -> Lb9
        L4b:
            java.lang.String r0 = "gift_tray_icon_click"
            X.0IjA r4 = X.C0IJT.LIZ(r0)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r2 = "user_id"
            long r0 = X.C2640010k.LIZ()     // Catch: java.lang.Exception -> Lb9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> Lb9
            r4.LJJII(r0, r2)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r1 = "user_type"
            boolean r0 = X.C2640010k.LIZIZ()     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto La9
            java.lang.String r0 = "anchor"
        L68:
            r4.LJJII(r0, r1)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r1 = "icon_content"
            if (r5 == 0) goto La7
            com.bytedance.android.livesdk.model.GiftTrayInfo r0 = r5.mTrayInfo     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto La7
            com.bytedance.android.livesdk.model.message.common.Text r0 = r0.rightTagText     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto La7
            java.lang.String r0 = r0.key     // Catch: java.lang.Exception -> Lb9
        L79:
            r4.LJJII(r0, r1)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r2 = "anchor_id"
            if (r6 == 0) goto La4
            com.bytedance.android.live.base.model.user.User r0 = r6.getOwner()     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto La4
            long r0 = r0.getId()     // Catch: java.lang.Exception -> Lb9
        L8a:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> Lb9
            r4.LJJII(r0, r2)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r2 = "room_id"
            if (r6 == 0) goto L9d
            long r0 = r6.getId()     // Catch: java.lang.Exception -> Lb9
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> Lb9
        L9d:
            r4.LJJII(r3, r2)     // Catch: java.lang.Exception -> Lb9
            r4.LIZ()     // Catch: java.lang.Exception -> Lb9
            goto Lb8
        La4:
            r0 = 0
            goto L8a
        La7:
            r0 = r3
            goto L79
        La9:
            java.lang.String r0 = "user"
            goto L68
        Lac:
            java.lang.Class<com.bytedance.android.live.browser.IHybridContainerService> r0 = com.bytedance.android.live.browser.IHybridContainerService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)     // Catch: java.lang.Exception -> Lb9
            com.bytedance.android.live.browser.IHybridContainerService r0 = (com.bytedance.android.live.browser.IHybridContainerService) r0     // Catch: java.lang.Exception -> Lb9
            r0.YC1(r4, r1, r3)     // Catch: java.lang.Exception -> Lb9
            goto L4b
        Lb8:
            return
        Lb9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1125170fNz.LIZ(android.content.Context, com.bytedance.android.livesdk.model.message.GiftMessage, com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }
}
