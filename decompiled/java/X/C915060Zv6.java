package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Zv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915060Zv6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, String str2, String str3, String str4) {
        int i2;
        Long lValueOf;
        int i3;
        String strU3;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        int i4 = -1;
        if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ.LIZIZ()) != null) {
            i2 = multiLiveAnchorPanelSettingsLIZIZ2.layoutType;
        } else {
            i2 = -1;
        }
        MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ2.LIZIZ()) != null) {
            i4 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
        }
        C917140ZyS.LJFF(i2, i4);
        HashMap map = new HashMap();
        map.put("action_type", str);
        map.put("request_page", str4);
        map.put("is_multi_guest_moderator", String.valueOf(i));
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        map.put("room_id", String.valueOf(lValueOf));
        map.put("guest_id", str2);
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        map.put("layout_setting", C917520Zz4.LJII(C927600aFK.LJII()).getFirst());
        C307001Gy.LIZ().getClass();
        map.put("window_setting", C917520Zz4.LJII(C927600aFK.LJII()).getSecond());
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null) {
            i3 = multiGuestDataHolder.LJJIFFI;
        } else {
            i3 = 0;
        }
        map.put("guest_cnt", String.valueOf(i3));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            strU3 = interfaceC954180awCLLJLL.U3();
        } else {
            strU3 = null;
        }
        map.put("channel_id", String.valueOf(strU3));
        map.put("link_id", str3);
        C0KX4.LIZ("livesdk_anchor_guest_gift_entrance", map, null, true);
    }
}
