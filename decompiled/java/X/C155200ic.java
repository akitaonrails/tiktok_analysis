package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.model.GameTagDetail;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C155200ic {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(DataChannel dataChannel) {
        Room room;
        Long lValueOf;
        GameTagDetail gameTagDetail;
        GameTagDetail gameTagDetail2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("game_fusion_label", String.valueOf(((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).getFeature("g_interaction_fusion_tag_name")));
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        }
        String str = null;
        if (room != null && (gameTagDetail2 = room.gameTagDetail) != null) {
            lValueOf = Long.valueOf(gameTagDetail2.gameTagId);
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("game_tag_id", String.valueOf(lValueOf));
        if (room != null && (gameTagDetail = room.gameTagDetail) != null) {
            str = gameTagDetail.gameTagName;
        }
        linkedHashMap.put("game_tag_name", String.valueOf(str));
        return linkedHashMap;
    }
}
