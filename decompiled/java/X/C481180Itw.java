package X;

import Y.AfS143S0200000_7;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ShareSuccessEvent;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.dynamicstrategy.ShareBehaviorEvent;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Itw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481180Itw {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Bundle bundle) {
        String string;
        if (bundle != null) {
            string = bundle.getString(((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).getBundleKey(3));
        } else {
            string = null;
        }
        if (TextUtils.equals(string, "top_supporters")) {
            return "top_supporters";
        }
        if (TextUtils.equals(string, "recently_shared")) {
            return "recently_shared";
        }
        return "none";
    }

    public static final String LIZIZ(User user) {
        String str;
        if (user == null) {
            return "";
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion()) {
            str = "h5_m";
        } else {
            str = "h5_t";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("www.tiktok.com/@");
        sbLIZ.append(C0KVU.LJ(user));
        sbLIZ.append("/live?source=");
        sbLIZ.append(str);
        sbLIZ.append("&_r=1");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZJ(User user, String str) {
        String strLIZIZ = LIZIZ(user);
        if (strLIZIZ.length() == 0) {
            return strLIZIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZIZ);
        sbLIZ.append("&share_live_intent=");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJ(DataChannel dataChannel, HashMap map) {
        String str;
        if (C924810aAp.LJ().LJJII > 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_guest_connection", str);
        C481150Itt.LIZJ(map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_share_v2");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static final void LJFF(DataChannel dataChannel, HashMap map) {
        String str;
        if (Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            str = "anchor";
        } else {
            str = "user";
        }
        map.put("user_type", str);
        map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            map.put("distribution_type", C473420IhQ.LIZ(Integer.valueOf((int) Long.valueOf(room.visibleScopeType).longValue())));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_share_head_click");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static final void LJI(DataChannel dataChannel, HashMap map) {
        String str;
        String str2;
        if (Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            str = "anchor";
        } else {
            str = "user";
        }
        map.put("user_type", str);
        map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (C924810aAp.LJ().LJJII > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_guest_connection", str2);
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            map.put("distribution_type", C473420IhQ.LIZ(Integer.valueOf((int) Long.valueOf(room.visibleScopeType).longValue())));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_share_head_show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static final void LJIIIIZZ(Room room, DataChannel dataChannel, String str) {
        dataChannel.FQ2(ShareSuccessEvent.class);
        dataChannel.FQ2(ShareBehaviorEvent.class);
        if (C0IXW.LJFF(dataChannel) && room.author() != null && !TextUtils.equals(str, "chat_merge")) {
            HashMap map = new HashMap();
            map.put("anchor_id", String.valueOf(room.author().getId()));
            map.put("room_id", String.valueOf(room.getId()));
            C0IXW c0ixw = C0IXW.LIZ;
            C0IXW.LIZ("live_ad", "live_share", null, map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1106200etO LJII(com.bytedance.android.livesdkapi.depend.model.live.Room r4, com.bytedance.ies.sdk.datachannel.DataChannel r5, java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r1 = r0.user()
            X.0etO r2 = new X.0etO
            r2.<init>(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L15
            r2.LJIIIZ = r6
        L15:
            long r0 = r1.getCurrentUserId()
            r2.LIZJ = r0
            qo2.w r0 = qo2.w.LIZ
            r0.getClass()
            java.lang.String r0 = qo2.w.LJIJI()
            r2.LJIJ = r0
            java.lang.String r0 = qo2.w.LJIIIZ()
            r2.LJJI = r0
            java.lang.String r0 = qo2.w.LJIIL()
            r2.LJJIFFI = r0
            java.lang.String r0 = "live_detail"
            r2.LJJJJLL = r0
            r2.LJJII = r7
            java.lang.String r0 = "share_panel"
            r2.LJJIIJ = r0
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomUserChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomUserChannel.class
            java.lang.Object r0 = r5.gg0(r0)
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            if (r0 == 0) goto L9a
            com.bytedance.android.livesdk.model.UserAttr r0 = r0.getUserAttr()
            if (r0 == 0) goto L9a
            boolean r0 = r0.isAdmin
            r3 = 1
            if (r0 != r3) goto L9a
        L51:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel> r0 = com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel.class
            java.lang.Object r1 = r5.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r1 == 0) goto L93
            java.lang.String r0 = r4.getAnchorShareText()
            if (r0 != 0) goto L67
        L65:
            java.lang.String r0 = ""
        L67:
            r2.LJIIJJI = r0
            r2.LJIILIIL = r1
            r2.LJIILL = r3
            X.0UX6 r0 = X.C0UX6.RED_DOT_AUDIENCE_SHARE_MODERATOR_SETTING
            boolean r0 = com.bytedance.android.live.uikit.reddot.RedDotExtensionKt.LJIILLIIL(r0)
            r2.LJIILLIIL = r0
            com.bytedance.android.livesdk.model.Hashtag r0 = r4.hashtag
            if (r0 == 0) goto L90
            java.lang.Long r0 = r0.id
            if (r0 == 0) goto L90
            long r0 = r0.longValue()
        L81:
            r2.LJIIZILJ = r0
            r2.LJIL = r8
            java.lang.Class<X.0Trl> r0 = X.C760110Trl.class
            java.lang.Object r0 = r5.gg0(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.LJIJI = r0
            return r2
        L90:
            r0 = 0
            goto L81
        L93:
            java.lang.String r0 = r4.getUserShareText()
            if (r0 != 0) goto L67
            goto L65
        L9a:
            r3 = 0
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C481180Itw.LJII(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, java.lang.String, java.util.Map):X.0etO");
    }

    public static final void LJIIIZ(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner, String str, String str2, Bundle bundle) {
        String string;
        String str3 = "";
        if (bundle != null && (string = bundle.getString("shareIdList", "")) != null) {
            str3 = string;
        }
        ((C0J1N) ((IShareService) C1161920gLG.LIZJ(IShareService.class)).ky(str2, room.getId(), str3, (String) DataChannelGlobal.LLILZ.gg0(C1148270fzF.class)).LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new AfS143S0200000_7((Object) room, (EmoteModel) dataChannel, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 16), C0J1R.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.bytedance.android.livesdkapi.depend.model.live.Room r34, com.bytedance.ies.sdk.datachannel.DataChannel r35, java.lang.String r36, java.lang.String r37, android.os.Bundle r38, java.lang.String r39, java.util.Map<java.lang.String, java.lang.String> r40, X.C1106210etP r41, java.lang.String r42) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C481180Itw.LIZLLL(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, java.lang.String, android.os.Bundle, java.lang.String, java.util.Map, X.0etP, java.lang.String):void");
    }
}
