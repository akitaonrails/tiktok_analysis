package X;

import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768090UBb {
    public static String LIZ = "normal_video_live";
    public static Long LIZIZ = 0L;

    public static void LIZIZ(boolean z) {
        Long lValueOf;
        String str;
        Accompaniment accompaniment;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_cut_off_music");
        c474500IjALIZ.LJIL();
        C0UBZ c0ubz = C0UBZ.LL;
        C768190UBl c768190UBl = C0UBZ.LLJJIJI;
        if (c768190UBl != null && (accompaniment = c768190UBl.accompaniment) != null) {
            lValueOf = Long.valueOf(accompaniment.id);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "music_id");
        c474500IjALIZ.LJJII(String.valueOf(C0UBZ.LLJJIII), "collection_id");
        if (z) {
            str = "cut_off_click";
        } else {
            str = "collection_click";
        }
        c474500IjALIZ.LJJII(str, "method");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(DataChannel dataChannel, String str) {
        Long lValueOf;
        Room room;
        Accompaniment accompaniment;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_request_button_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "button_type");
        C0UBZ c0ubz = C0UBZ.LL;
        C768190UBl c768190UBl = C0UBZ.LLJJIJI;
        Long lValueOf2 = null;
        if (c768190UBl != null && (accompaniment = c768190UBl.accompaniment) != null) {
            lValueOf = Long.valueOf(accompaniment.id);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "music_id");
        c474500IjALIZ.LJJII(String.valueOf(C0UBZ.LLJJIII), "collection_id");
        c474500IjALIZ.LIZ();
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            lValueOf2 = Long.valueOf(room.getId());
        }
        LIZIZ = lValueOf2;
    }
}
