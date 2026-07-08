package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.text.a0;
import qo2.w;

/* JADX INFO: renamed from: X.0fKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123080fKc {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("shortcut_gift_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILIIL("bottom_tab");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZIZ(Room room, DataChannel dataChannel, String str) {
        boolean z;
        List<Long> list;
        if (room == null) {
            LIZJ(dataChannel, str, false, false);
            return;
        }
        RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
        if (linkMicInfo != null && (list = linkMicInfo.audienceIdList) != null && list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        LIZJ(dataChannel, str, false, z);
    }

    public static void LIZLLL(boolean z, long j, Room room) {
        int i;
        if (room != null) {
            long id = room.getId();
            if (id == C1123130fKh.LIZJ) {
                return;
            }
            C1123130fKh.LIZJ = id;
            long jUptimeMillis = SystemClock.uptimeMillis() - C1123130fKh.LIZ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("quick_gift_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Integer.valueOf(!z ? 1 : 0), "show_status");
            c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis), "show_duration");
            c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
            if (C083100Sv.LIZ()) {
                if (room.quickGift != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                c474500IjALIZ.LJJII(Integer.valueOf(i ^ 1), "is_quick_gift_empty");
            }
            c474500IjALIZ.LJIIJJI("live");
            c474500IjALIZ.LJIILL("other");
            c474500IjALIZ.LJIILJJIL("live_detail");
            c474500IjALIZ.LJIILIIL("bottom_tab");
            c474500IjALIZ.LIZ();
        }
    }

    public static final void LIZJ(DataChannel dataChannel, String str, boolean z, boolean z2) {
        Object obj;
        String strNo2;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        if (roomLJJLIIIIJ != null) {
            long id = roomLJJLIIIIJ.getId();
            if (id == C1123130fKh.LIZJ) {
                return;
            }
            C1123130fKh.LIZJ = id;
            String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
            long jUptimeMillis = SystemClock.uptimeMillis() - C1123130fKh.LIZ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("convenient_gift_show");
            C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJIIZI(C155200ic.LIZ(dataChannel));
            c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
            c474500IjALIZ.LJJII(strValueOf, "user_id");
            String str2 = "1";
            if (z2) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj, "is_guest_connection");
            c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis), "room_enter_to_show_duration");
            c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_transparent");
            if (!C1123130fKh.LIZLLL) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str2, "has_tip");
            if (str != null && !a0.LJJJIL(str)) {
                c474500IjALIZ.LJJII(str, "gift_id");
            }
            IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
            if (iInteractService != null) {
                strNo2 = iInteractService.No2();
            } else {
                strNo2 = null;
            }
            c474500IjALIZ.LJJII(strNo2, "multi_tool");
            C1128460fTI.LIZ(c474500IjALIZ, null);
            c474500IjALIZ.LJIILJJIL("live_detail");
            c474500IjALIZ.LJIILIIL("bottom_tab");
            c474500IjALIZ.LJIIJJI("live");
            c474500IjALIZ.LJIILL("other");
            C498410Jgd.LIZ(c474500IjALIZ, dataChannel);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LIZ();
                return;
            }
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJIL();
            c474500IjALIZ.LJJII(w.LIZ.LIZJ(), "live_type");
            c474500IjALIZ.LJJIJL();
        }
    }
}
