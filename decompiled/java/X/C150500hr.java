package X;

import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.00hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C150500hr {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(EnvelopePortalMessage envelopePortalMessage, boolean z) {
        String str;
        String str2;
        String str3;
        HashMap map = new HashMap(11);
        EnvelopePortalMessage.PortalInfo portalInfo = envelopePortalMessage.portalInfo;
        String str4 = "";
        if (portalInfo == null || (str = portalInfo.id) == null) {
            str = "";
        }
        map.put("portal_id", str);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str2);
        EnvelopePortalMessage.PortalInfo portalInfo2 = envelopePortalMessage.portalInfo;
        if (portalInfo2 != null && (str3 = portalInfo2.senderId) != null) {
            str4 = str3;
        }
        map.put("sender_id", str4);
        map.put("portal_view_type", String.valueOf(envelopePortalMessage.portalView));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_portal_short_touch_enqueue");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(EnvelopePortalMessage envelopePortalMessage, boolean z, String str) {
        String str2;
        String str3;
        HashMap map = new HashMap(11);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str2);
        ArrayList arrayList = new ArrayList();
        EnvelopePortalMessage.PortalInfo portalInfo = envelopePortalMessage.portalInfo;
        if (portalInfo == null || (str3 = portalInfo.id) == null) {
            str3 = "";
        }
        arrayList.add(str3);
        map.put("drop_portal_ids", arrayList.toString());
        map.put("drop_count", "1");
        map.put("drop_reason", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_portal_msg_drop");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
