package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0Uec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777440Uec extends AbstractC777950UfR {
    public final Text LJ;
    public final String LJFF;
    public final long LJI;
    public final String LJII;

    @Override // X.AbstractC777950UfR
    public final CharSequence LIZLLL() {
        String str = this.LJII;
        return str == null ? this.LJ.defaultPattern : str;
    }

    @Override // X.AbstractC777950UfR
    public final EnumC777930UfP LIZJ() {
        return EnumC777930UfP.PRIORITY_TYPE_P1;
    }

    @Override // X.AbstractC777950UfR
    public final EnumC777480Ueg LJ() {
        return EnumC777480Ueg.GAME_RANK_STICKER;
    }

    public final void LJFF(DataChannel dataChannel, String str) {
        Room room;
        long ownerUserId;
        String idStr;
        long j;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        long j2 = 0;
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
            idStr = room.getIdStr();
            if (idStr == null) {
            }
            j = this.LJI;
            if (1 <= j && j < 100) {
                j2 = j;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_floating_window_toast");
            c474500IjALIZ.LJJII(str, "action_type");
            c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
            c474500IjALIZ.LJJII(idStr, "room_id");
            c474500IjALIZ.LJJII("anchor", "user_type");
            c474500IjALIZ.LJJII(Long.valueOf(j2), "rank_in_daily");
            c474500IjALIZ.LJJII("screen_share", "live_type");
            c474500IjALIZ.LIZ();
        }
        ownerUserId = 0;
        idStr = CardStruct.IStatusCode.DEFAULT;
        j = this.LJI;
        if (1 <= j) {
            j2 = j;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_floating_window_toast");
        c474500IjALIZ2.LJJII(str, "action_type");
        c474500IjALIZ2.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        c474500IjALIZ2.LJJII(idStr, "room_id");
        c474500IjALIZ2.LJJII("anchor", "user_type");
        c474500IjALIZ2.LJJII(Long.valueOf(j2), "rank_in_daily");
        c474500IjALIZ2.LJJII("screen_share", "live_type");
        c474500IjALIZ2.LIZ();
    }

    public C777440Uec(Text text, String str, long j) {
        boolean z;
        this.LJ = text;
        this.LJFF = str;
        this.LJI = j;
        this.LIZIZ = new AbstractC777790UfB() { // from class: X.0Uet
            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.BACK;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }
        };
        String str2 = text.defaultPattern;
        String str3 = text.key;
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
            String str4 = text.key;
            c1124870fNVLIZJ.getClass();
            String strLIZIZ = C1124870fNV.LIZIZ(str4);
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                str2 = strLIZIZ;
            }
        }
        if (str2 != null && str2.length() != 0) {
            this.LJII = C1133830fbx.LJIILJJIL(str2, this.LJ, null).toString();
        }
    }
}
