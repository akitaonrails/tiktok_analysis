package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import qo2.w;

/* JADX INFO: renamed from: X.0IiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474110IiX {
    public final Room LIZ;
    public final long LIZIZ;

    public C474110IiX(long j, Room room) {
        this.LIZ = room;
        this.LIZIZ = j;
    }

    public final void LIZ(int i, long j, long j2, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        Object obj;
        Room room;
        OfficialChannelInfo officialChannelInfo;
        C474130IiZ c474130IiZ = new C474130IiZ("", this.LIZIZ);
        String str3 = "live_audience_c_anchor";
        if (i != 1) {
            c474130IiZ.LIZ = "live_audience_c_anchor";
        } else {
            if (z2) {
                c474130IiZ.LIZ = "live_audience_c_anchor";
            } else {
                c474130IiZ.LIZ = "live_audience_c_audience";
            }
            str3 = null;
            if (TextUtils.isEmpty(null)) {
                c474130IiZ.LIZ = "live_audience_c_audience";
                str3 = "live_audience_c_audience";
            }
        }
        HashMap map = new HashMap();
        if (z2) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).k30(map);
        }
        String strValueOf = String.valueOf(j);
        IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (iMicRoomService != null && (room = this.LIZ) != null && iMicRoomService.n42(room) && (officialChannelInfo = this.LIZ.officialChannelInfo) != null) {
            if (officialChannelInfo.channelUser.getId() == j) {
                if (iMicRoomService.tp1()) {
                    str3 = "carousel_audience_c_official_id";
                } else {
                    str3 = "loyal_audience_c_official_id";
                }
                strValueOf = String.valueOf(this.LIZ.officialChannelInfo.channelUser.getId());
            } else if (j == this.LIZ.getOwner().getId()) {
                if (iMicRoomService.tp1()) {
                    str3 = "carousel_audience_c_anchor";
                } else {
                    str3 = "loyal_audience_c_anchor";
                }
                strValueOf = String.valueOf(this.LIZ.officialChannelInfo.channelUser.getId());
            }
        }
        map.put("to_user_id", strValueOf);
        map.put("request_page", str3);
        map.put("click_user_position", "lineup_official_panel");
        if (z) {
            map.put("growth_deepevent", String.valueOf(1));
            long ownerUserId = this.LIZ.getOwnerUserId();
            long jLLJJJIL = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIJ().LLJJJIL();
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
                if (j == this.LIZ.getOwnerUserId()) {
                    map.put("anchor_type", "current");
                }
                if (z2) {
                    map.put("anchor_type", "opposite");
                }
                map.put("channel_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIJ().getChannelId()));
                List<Long> listB70 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70();
                if (listB70.size() > 2) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_multi", obj);
                if (listB70.size() <= 2) {
                    ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).k30(map);
                }
                map.put("connection_inviter_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ().LJLLLLLL()));
                map.put("connection_invitee_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LIZ().LJJI()));
            }
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vp0()) {
                map.put("pk_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId()));
                if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).n12()) {
                    map.put("pk_inviter_id", String.valueOf(ownerUserId));
                    map.put("pk_invitee_id", String.valueOf(jLLJJJIL));
                } else {
                    map.put("pk_invitee_id", String.valueOf(ownerUserId));
                    map.put("pk_inviter_id", String.valueOf(jLLJJJIL));
                }
            }
        }
        if (!C2093608Ic.LJ(C466640IRq.LIZJ().LIZLLL())) {
            map.put("enter_live_method", C466640IRq.LIZJ().LIZLLL());
        }
        map.put("follow_status", String.valueOf(j2));
        w.LIZ.getClass();
        String strLJIILJJIL = w.LJIILJJIL();
        if (!TextUtils.isEmpty(strLJIILJJIL) && "click_push_live_cd_user".equals(strLJIILJJIL)) {
            map.put("is_subscribe", "1");
        } else {
            map.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        if (z3) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        map.put("room_orientation", str);
        map.put("connection_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType());
        if ("manual_pk".equals(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType())) {
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nt()) {
                map.put("match_status", "pk_phase");
            } else {
                map.put("match_status", LiveCenterMockToolSwitch.PUNISH);
            }
            map.putAll(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
        }
        if (z) {
            str2 = "follow";
        } else {
            str2 = "unfollow";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIILLIIL(c474130IiZ);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJJ();
        c474500IjALIZ.LJIIJJI("live_interact");
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LIZ();
    }
}
