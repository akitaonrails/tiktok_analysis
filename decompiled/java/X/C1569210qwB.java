package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;

/* JADX INFO: renamed from: X.0qwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569210qwB {
    public static boolean LIZ(Aweme aweme) {
        if (AwemeBizExtKt.getSessionPosition(aweme) < 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1564320qoI r6, java.lang.String r7) {
        /*
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LIZ
            if (r0 == 0) goto La3
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r2 = X.C0J4Y.LJI(r0)
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r0 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.ss.android.ugc.aweme.framework.services.IUserService) r0
            r5 = 0
            if (r0 == 0) goto Laa
            java.lang.String r3 = r0.getCurrentUserID()
        L20:
            java.lang.String r1 = com.ss.android.deviceregister.DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()
            java.lang.String r0 = "device_id"
            r4.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "user_id"
            r4.LJIIIIZZ(r0, r3)
            if (r2 == 0) goto La8
            long r0 = r2.ownerUserId
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L36:
            java.lang.String r0 = "anchor_id"
            r4.LJ(r1, r0)
            if (r2 == 0) goto L43
            long r0 = r2.id
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L43:
            java.lang.String r0 = "room_id"
            r4.LJ(r5, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LIZ
            java.lang.String r1 = r0.getRequestId()
            java.lang.String r0 = "request_id"
            r4.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "enter_from_merge"
            r4.LJIIIIZZ(r0, r7)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "live_cell"
            r4.LJIIIIZZ(r1, r0)
            java.lang.String r1 = "action_type"
            java.lang.String r0 = "click"
            r4.LJIIIIZZ(r1, r0)
            if (r2 == 0) goto La6
            boolean r1 = r2.hasCommerceGoods
            r0 = 1
            if (r1 != r0) goto La6
        L6d:
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            if (r0 == 0) goto La4
            r1 = r3
        L74:
            java.lang.String r0 = "is_ecom"
            r4.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LIZ
            boolean r0 = r0.isAd()
            if (r0 != 0) goto L82
            r3 = r2
        L82:
            java.lang.String r0 = "is_ad"
            r4.LJIIIIZZ(r0, r3)
            java.lang.String r1 = "position_gap"
            int r0 = r6.LIZJ
            r4.LIZJ(r0, r1)
            java.lang.String r1 = "last_room_id"
            java.lang.Long r0 = r6.LIZLLL
            r4.LJ(r0, r1)
            java.lang.String r1 = r6.LIZIZ
            java.lang.String r0 = "delete_reason"
            r4.LJIIIIZZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "livesdk_live_removed_gap_info"
            X.C20684815ws.LJIILLIIL(r0, r1)
        La3:
            return
        La4:
            r1 = r2
            goto L74
        La6:
            r0 = 0
            goto L6d
        La8:
            r1 = r5
            goto L36
        Laa:
            r3 = r5
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1569210qwB.LIZIZ(X.0qoI, java.lang.String):void");
    }
}
