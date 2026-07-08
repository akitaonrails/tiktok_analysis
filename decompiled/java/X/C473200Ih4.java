package X;

import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;

/* JADX INFO: renamed from: X.0Ih4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473200Ih4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1ACA c1aca, String str) {
        LiveRoomStruct liveRoomStruct;
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_currently_live_popup_click");
            c474500IjALIZ.LJJII(c1aca.LIZLLL, "enter_from_merge");
            c474500IjALIZ.LJJII("live_cell", "enter_method");
            c474500IjALIZ.LJJII("click", "action_type");
            c474500IjALIZ.LJJII(Long.valueOf(liveRoomStruct.id), "room_id");
            c474500IjALIZ.LJJII(Long.valueOf(liveRoomStruct.getAnchorId()), "anchor_id");
            c474500IjALIZ.LJJII(str, "buttom_name");
            c474500IjALIZ.LIZ();
        }
    }
}
