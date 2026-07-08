package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0JTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492670JTt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(C474500IjA c474500IjA, Room room) {
        int i;
        User owner = room.getOwner();
        if (owner != null && owner.isAnchorHasSubQualification()) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjA.LJJII(Integer.valueOf(i ^ 1), "is_opt_in");
    }

    public static void LIZ(String str, String str2, boolean z) {
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_preview_management_page_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "anchor_id");
        c474500IjALIZ.LJJII(str2, "show_entrance");
        if (z) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        c474500IjALIZ.LJJII(str3, "preview_status");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(DataChannel dataChannel, String str, Room room, EnumC492680JTu enumC492680JTu) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_preview_turn_off_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "anchor_id");
        LIZJ(c474500IjALIZ, room);
        c474500IjALIZ.LJJII(enumC492680JTu.getValue(), "click_type");
        c474500IjALIZ.LIZ();
    }
}
