package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a59, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921290a59 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DataChannel dataChannel, ListByTypeResponse.ReservedUser reservedUser) {
        Boolean bool;
        String str;
        String str2;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C956700b0G.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJJI(bool)) {
            str = "anchor_connect_popup";
        } else if (Intrinsics.LJFF(C920830a4P.LJFF, "appointment_guide")) {
            str = "appointment_guide";
        } else {
            str = "panel_Golive";
        }
        User user = reservedUser.user;
        if (Intrinsics.LJFF(C920830a4P.LJFF, "appointment_guide")) {
            str2 = "appointment_guide_invite";
        } else {
            str2 = "panel_Golive_invite";
        }
        C919670a2X c919670a2X = new C919670a2X(4, user, str, str2);
        c919670a2X.LJFF = -1;
        if (dataChannel != null) {
            dataChannel.LC0(LinkInRoomAnchorInviteGuestEvent.class, c919670a2X);
        }
        C766270U4b.LJII(2131841205, C0KVU.LIZ(reservedUser.user));
        C921330a5D.LIZJ = 1;
        C921330a5D.LIZIZ = C925640aCA.LJFF(C924810aAp.LJ().LJJII);
    }
}
