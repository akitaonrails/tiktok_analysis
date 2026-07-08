package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFeSchemaConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.linkmic.common.MgTraceInfo;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownContent;

/* JADX INFO: renamed from: X.01ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01ZB {
    public final Context LIZ;

    public C01ZB(Context context) {
        this.LIZ = context;
    }

    public static String LIZIZ(GuestShowdownConfig guestShowdownConfig, int i) {
        long j;
        int i2;
        int i3;
        if (guestShowdownConfig != null) {
            j = guestShowdownConfig.duration;
            i2 = guestShowdownConfig.loserNum;
            i3 = guestShowdownConfig.winnerNum;
        } else {
            j = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().defaultDuration;
            i2 = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().defaultLoserNum;
            i3 = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().defaultWinnerNum;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("&guest_showdown_duration=");
        sbLIZ.append(j);
        sbLIZ.append("&guest_showdown_loser_num=");
        sbLIZ.append(i2);
        sbLIZ.append("&guest_showdown_winner_num=");
        sbLIZ.append(i3);
        sbLIZ.append("&max_position=");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ(C334801Rq c334801Rq, GuestShowdownContent guestShowdownContent, String str) throws JSONException {
        int i;
        long j;
        String strLIZLLL;
        String str2;
        String str3;
        int iIntValue = 0;
        if (guestShowdownContent != null) {
            i = guestShowdownContent.playStatus;
        } else {
            i = 0;
        }
        String strValueOf = String.valueOf(C915980Zwa.LIZLLL().getChannelId());
        if (guestShowdownContent != null) {
            j = guestShowdownContent.playId;
        } else {
            j = 0;
        }
        String strValueOf2 = String.valueOf(j);
        InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
        if (interfaceC938530aWxLIZ == null || (strLIZLLL = interfaceC938530aWxLIZ.LIZLLL()) == null) {
            strLIZLLL = "";
        }
        MgTraceInfo mgTraceInfoLIZ = C01IF.LIZ(c334801Rq);
        JSONObject jSONObject = new JSONObject();
        int i2 = 1;
        if (mgTraceInfoLIZ != null) {
            String str4 = mgTraceInfoLIZ.entranceFrom;
            if (str4 != null && str4.length() > 0) {
                jSONObject.put("entrance_from", str4);
            }
            String str5 = mgTraceInfoLIZ.trafficSource;
            if (str5 != null && str5.length() > 0) {
                jSONObject.put("traffic_source", str5);
            }
            jSONObject.put("entrance_from_playbook_id", String.valueOf(mgTraceInfoLIZ.entranceFromPlaybookId));
            String str6 = mgTraceInfoLIZ.panelPage;
            if (str6 != null && str6.length() > 0) {
                jSONObject.put("panel_page", str6);
            }
            String str7 = mgTraceInfoLIZ.panelEntrance;
            if (str7 != null && str7.length() > 0) {
                jSONObject.put("panel_entrance", str7);
            }
        }
        int guestCount = C915980Zwa.LIZLLL().getGuestCount();
        if (C950220apo.LJI()) {
            str2 = "anchor";
        } else if (C950220apo.LJIJI()) {
            str2 = "guest";
        } else {
            str2 = "audience";
        }
        if (guestCount <= 0) {
            i2 = 0;
        }
        String strLJIL = C940770aaZ.LIZ().getDataSource().LJIL();
        if (C01ZC.LIZ() || C500260Jjc.LJJIL()) {
            iIntValue = LiveAbLabelSetting.INSTANCE.getIntValue("enable_guest_showdown_top3_mode");
        } else {
            Integer numLJ = C931820aM8.LJ("enable_guest_showdown_top3_mode");
            if (numLJ != null) {
                iIntValue = numLJ.intValue();
            }
        }
        String strValueOf3 = String.valueOf(iIntValue);
        if (C960203pA.LIZIZ(this.LIZ) && !C500260Jjc.LJIL()) {
            str3 = "%231E1E1E";
        } else {
            str3 = "%23FFFFFF";
        }
        return "&guest_showdown_game_status=" + i + "&channel_id=" + strValueOf + "&play_id=" + strValueOf2 + "&stream_id=" + strLIZLLL + "&mg_trace_info=" + jSONObject + "&guest_cnt=" + guestCount + "&user_type=" + str2 + "&layout_id=" + strLJIL + "&is_guest_connection=" + i2 + "&fe_enter_from=" + str + "&enable_guest_showdown_top3_mode=" + strValueOf3 + "&container_bg_color=" + str3;
    }

    public final void LIZJ(C334801Rq c334801Rq, GuestShowdownConfig guestShowdownConfig, GuestShowdownContent guestShowdownContent, String str) throws JSONException {
        GuestShowdownConfig guestShowdownConfig2;
        String strLIZIZ;
        String strLIZ = LIZ(c334801Rq, guestShowdownContent, str);
        int iLIZJ = C940770aaZ.LIZ().getDataSource().LIZJ() - 1;
        if (guestShowdownConfig != null) {
            strLIZIZ = LIZIZ(guestShowdownConfig, iLIZJ);
        } else {
            if (guestShowdownContent != null) {
                guestShowdownConfig2 = guestShowdownContent.playConfig;
            } else {
                guestShowdownConfig2 = null;
            }
            strLIZIZ = LIZIZ(guestShowdownConfig2, iLIZJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(MultiGuestFeSchemaConfigSetting.INSTANCE.getValue().guestShowdownRanking);
        sbLIZ.append(strLIZ);
        sbLIZ.append(strLIZIZ);
        try {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.LIZ, C2188811AlT.LIZIZ(sbLIZ), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
