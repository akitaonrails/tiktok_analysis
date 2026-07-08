package X;

import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Jhx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499230Jhx {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(AbstractC1136060ffY abstractC1136060ffY) {
        if (abstractC1136060ffY == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("clickedMessage", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, IdMessage.from(abstractC1136060ffY)));
        C1143300frE.LJIIJJI().LIZIZ("ttlive_text_message_clicked_on_content", map);
    }

    public static final void LIZJ(AbstractC1136060ffY abstractC1136060ffY) {
        if (abstractC1136060ffY == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("clickedMessage", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, IdMessage.from(abstractC1136060ffY)));
        C1143300frE.LJIIJJI().LIZIZ("ttlive_text_message_clicked_on_name", map);
    }

    public static final void LIZ(DataChannel dataChannel, Room room, String str, BottomMessage bottomMessage) {
        String strTitle;
        String str2;
        PunishEventInfo punishEventInfo;
        String strLIZ = null;
        if (room != null) {
            strTitle = room.title();
        } else {
            strTitle = null;
        }
        if (C1161920gLG.LIZJ(IHostAppContext.class) != null) {
            strLIZ = C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJII(strLIZ, "room_language");
        c474500IjALIZ.LJJII(String.valueOf(strTitle), "room_title");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c474500IjALIZ.LJJII(strLIZ, "tag_language");
        if (bottomMessage == null || (punishEventInfo = bottomMessage.punishInfo) == null || (str2 = punishEventInfo.punishReason) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "strategy");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }
}
