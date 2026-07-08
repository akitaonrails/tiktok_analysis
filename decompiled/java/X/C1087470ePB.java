package X;

import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0ePB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087470ePB {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[PHI: r1
      0x007c: PHI (r1v12 java.lang.String) = (r1v10 java.lang.String), (r1v13 java.lang.String) binds: [B:29:0x007a, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[PHI: r1
      0x0082: PHI (r1v11 java.lang.String) = (r1v10 java.lang.String), (r1v12 java.lang.String) binds: [B:29:0x007a, B:31:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C474500IjA r8, com.bytedance.android.livesdk.model.message.RoomNotifyMessage r9, com.bytedance.ies.sdk.datachannel.DataChannel r10) {
        /*
            if (r10 != 0) goto La8
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
        Lc:
            r6 = 0
            if (r0 == 0) goto La2
            long r4 = r0.getId()
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto La4
            long r2 = r0.getId()
        L1e:
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            r1 = 0
            if (r0 == 0) goto L2d
            X.1DgM r1 = r0.getCurrentUser()
        L2d:
            boolean r0 = r1 instanceof com.bytedance.android.live.base.model.user.User
            if (r0 == 0) goto L39
            com.bytedance.android.live.base.model.user.User r1 = (com.bytedance.android.live.base.model.user.User) r1
            if (r1 == 0) goto L39
            long r6 = r1.getId()
        L39:
            java.lang.String r1 = "room_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r8.LJJII(r0, r1)
            java.lang.String r1 = "anchor_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r8.LJJII(r0, r1)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L9f
            java.lang.String r1 = "anchor"
        L51:
            java.lang.String r0 = "user_type"
            r8.LJJII(r1, r0)
            qo2.w r0 = qo2.w.LIZ
            java.lang.String r1 = r0.LIZJ()
            java.lang.String r0 = "live_type"
            r8.LJJII(r1, r0)
            java.lang.String r4 = "enter_from_merge"
            java.lang.String r3 = "enter_method"
            java.lang.String r2 = ""
            if (r9 == 0) goto L9c
            java.lang.String r0 = r9.schema
            if (r0 == 0) goto L9c
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r0 == 0) goto L79
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r3)
            if (r1 != 0) goto L7c
        L79:
            r1 = r2
            if (r0 == 0) goto L82
        L7c:
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r4)
            if (r0 != 0) goto L83
        L82:
            r0 = r2
        L83:
            r8.LJJII(r1, r3)
            r8.LJJII(r0, r4)
            if (r9 == 0) goto L9b
            com.bytedance.android.livesdk.livesetting.gift.GiftAdvancedNotificationSceneConfig r1 = com.bytedance.android.livesdk.livesetting.gift.GiftAdvancedNotificationSceneConfig.INSTANCE
            java.lang.String r0 = r9.source
            java.lang.String r0 = r1.getOrDefault(r0, r0)
            if (r0 == 0) goto L96
            r2 = r0
        L96:
            java.lang.String r0 = "privilege_scenario"
            r8.LJJII(r2, r0)
        L9b:
            return
        L9c:
            r0 = r2
            r1 = r2
            goto L83
        L9f:
            java.lang.String r1 = "user"
            goto L51
        La2:
            r4 = 0
        La4:
            r2 = 0
            goto L1e
        La8:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C500260Jjc.LJJLIIIIJ(r10)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1087470ePB.LIZ(X.0IjA, com.bytedance.android.livesdk.model.message.RoomNotifyMessage, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public static void LIZIZ(DataChannel dataChannel, RoomNotifyMessage roomNotifyMessage, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_advanced_message_double_confirm_click");
        LIZ(c474500IjALIZ, roomNotifyMessage, dataChannel);
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }
}
