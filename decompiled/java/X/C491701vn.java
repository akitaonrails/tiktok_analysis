package X;

import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01vn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C491701vn {
    public static final String LIZ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return (room == null || room.getOwner() == null) ? "" : String.valueOf(room.getOwner().getId());
    }

    public static final long LIZIZ() {
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            return interfaceC500940JkiUser.getCurrentUserId();
        }
        return 0L;
    }

    public static final void LIZJ(String str, String str2, String str3) {
        String str4;
        String currentResolution;
        String str5 = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str5);
        if (interfaceC480510IsrLIZIZ != null && (currentResolution = interfaceC480510IsrLIZIZ.getCurrentResolution()) != null) {
            str6 = currentResolution;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_definition_selection_btn_show");
        c474500IjALIZ.LJJII(LIZ(), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "user_id");
        c474500IjALIZ.LJJII(str, "room_id");
        if (Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, str3)) {
            str4 = "portrait";
        } else {
            str4 = "landscape";
        }
        c474500IjALIZ.LJJII(str4, "room_orientation");
        c474500IjALIZ.LJJII(str6, "current_definition");
        c474500IjALIZ.LJJ(str2);
        c474500IjALIZ.LIZ();
    }

    public static final void LIZLLL(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String strLIZ;
        String str8;
        LiveMode streamType;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_definition_selection_select_success");
        c474500IjALIZ.LJJII(LIZ(), "anchor_id");
        c474500IjALIZ.LJJII(str, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "user_id");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = "";
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        if (Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, str3)) {
            str8 = "portrait";
        } else {
            str8 = "landscape";
        }
        c474500IjALIZ.LJJII(str8, "room_orientation");
        c474500IjALIZ.LJJII(str7, "current_definition");
        c474500IjALIZ.LJJII(str4, "duration");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "user_id");
        c474500IjALIZ.LJJII(str5, "previous_definition");
        c474500IjALIZ.LJJII(str6, "switch_type");
        c474500IjALIZ.LJJ(str2);
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            c474500IjALIZ.LJJIIZI(room2.getMultiStreamLogParams());
        }
        c474500IjALIZ.LIZ();
    }
}
