package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.Map;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: renamed from: X.0Ibw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470020Ibw {
    public static final void LIZJ(long j, String str, String str2, long j2, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_video_play");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(Long.valueOf(j), "first_frame_duration");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "first_frame_load_duration");
        c474500IjALIZ.LJJII(str, "error_code");
        c474500IjALIZ.LJJII(str2, "error_desc");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZ(EncourageGoLiveCard encourageGoLiveCard, long j, String str, long j2, boolean z, boolean z2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_lynx_load_status");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "anchor_id");
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII(encourageGoLiveCard.cardId, "card_id");
        c474500IjALIZ.LJJII(String.valueOf(encourageGoLiveCard.cardType), "card_type");
        c474500IjALIZ.LJJII(String.valueOf(encourageGoLiveCard.style), "content_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "card_render_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "card_show_result");
        c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_reuse_sparkview");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZIZ(EncourageGoLiveCard encourageGoLiveCard, long j, boolean z, EnterRoomConfig enterRoomConfig, Room room, boolean z2) {
        long id;
        String str;
        EnterRoomConfig.RoomsData roomsData;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_lynx_preload_status");
        if (room != null && (interfaceC2262081DgMAuthor = room.author()) != null) {
            id = interfaceC2262081DgMAuthor.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.mRoomsData) == null || (str = roomsData.enterFromMerge) == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII(encourageGoLiveCard.cardId, "card_id");
        c474500IjALIZ.LJJII(String.valueOf(encourageGoLiveCard.cardType), "card_type");
        c474500IjALIZ.LJJII(String.valueOf(encourageGoLiveCard.style), "content_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "preload_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "preload_status");
        c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "card_show_result");
        c474500IjALIZ.LIZ();
    }
}
