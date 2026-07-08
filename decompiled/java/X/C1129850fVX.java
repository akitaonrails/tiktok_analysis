package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;

/* JADX INFO: renamed from: X.0fVX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129850fVX {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C474500IjA c474500IjA) {
        long id;
        Long lValueOf;
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (owner = room.getOwner()) != null) {
            id = owner.getId();
        } else {
            id = 0;
        }
        c474500IjA.LJJII(Long.valueOf(id), "anchor_id");
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjA.LJJII(lValueOf, "room_id");
        c474500IjA.LJJII(C1130100fVw.LIZ.LIZJ, "gift_enter_from");
        c474500IjA.LJIIIIZZ();
    }

    public static void LIZIZ(String str, List list) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("featured_area_edit_button_click");
        c474500IjALIZ.LJIL();
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "button_type");
        c474500IjALIZ.LJJII(list, "featured_gift_id_set");
        c474500IjALIZ.LJJII(Integer.valueOf(list.size()), "featured_gift_cnt");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str, List list) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("featured_area_edit_button_show");
        c474500IjALIZ.LJIL();
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "button_type");
        c474500IjALIZ.LJJII(list, "featured_gift_id_set");
        c474500IjALIZ.LJJII(Integer.valueOf(list.size()), "featured_gift_cnt");
        c474500IjALIZ.LIZ();
    }
}
