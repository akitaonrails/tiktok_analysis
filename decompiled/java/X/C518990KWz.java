package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsRunPinCardClientAiStrategySetting2;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.0KWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518990KWz implements InterfaceC759600Tqw {
    public static final C518990KWz LIZ = new C518990KWz();

    public static void LIZJ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_entrance_bubble_show");
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LJJII("pin_card_bubble", "bubble_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC759600Tqw
    public final void LIZ(DataChannel dataChannel, int i) {
        Room room;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            long createTime = room.getCreateTime();
            int intValue = SettingsManager.INSTANCE.getIntValue("live_pcs_run_pin_card_client_ai_strategy2", LivePcsRunPinCardClientAiStrategySetting2.DEFAULT);
            long jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - createTime;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("send pin card guide tooltip show log, group=");
            sbLIZ.append(intValue);
            sbLIZ.append(", strategy=");
            sbLIZ.append(i);
            sbLIZ.append(", durationAfterLiveTake=");
            sbLIZ.append(jCurrentTimeMillis);
            C20441214yg.LJIIIZ("PcsServicePlusLogUtil", C2188811AlT.LIZIZ(sbLIZ));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_entrance_pin_card_tooltip_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Integer.valueOf(intValue), "group");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "strategy");
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration_after_live_take");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LIZLLL(String str, String str2, boolean z, boolean z2, Integer num, String str3, Map map) {
        String str4;
        String str5;
        int iIntValue;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_service_term_page");
        c474500IjALIZ.LJJII(str, "anchor_id");
        c474500IjALIZ.LJJII(str2, "show_entrance");
        if (z) {
            str4 = "show";
        } else {
            str4 = "click";
        }
        c474500IjALIZ.LJJII(str4, "action_type");
        if (z2) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str5, "is_valid");
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "block_status");
        c474500IjALIZ.LJJIIZI(C01N7.LIZ(str3));
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    @Override // X.InterfaceC759600Tqw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, java.lang.Integer r8, java.util.Map<java.lang.String, java.lang.String> r9, com.bytedance.ies.sdk.datachannel.DataChannel r10) {
        /*
            r3 = this;
            java.lang.String r0 = "livesdk_service_plus_entrance"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            r2.LJJIIZI(r9)
            r2.LJIJJLI(r10)
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r4, r0)
            java.lang.String r0 = "room_id"
            r2.LJJII(r6, r0)
            java.lang.String r0 = "show_entrance"
            r2.LJJII(r5, r0)
            java.lang.String r1 = "user_type"
            java.lang.String r0 = "anchor"
            r2.LJJII(r0, r1)
            if (r8 == 0) goto L5f
            int r0 = r8.intValue()
            r1 = 1
            if (r0 != r1) goto L5f
        L2b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "is_opt_in"
            r2.LJJII(r1, r0)
            if (r7 == 0) goto L5c
            java.lang.String r1 = "show"
        L38:
            java.lang.String r0 = "action_type"
            r2.LJJII(r1, r0)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0fzJ> r0 = X.C1148310fzJ.class
            java.lang.Object r0 = r1.gg0(r0)
            X.0IR5 r0 = (X.C0IR5) r0
            if (r0 == 0) goto L51
            X.0IXL r0 = r0.LJFF
            if (r0 == 0) goto L51
            java.lang.String r1 = r0.LJFF
            if (r1 != 0) goto L53
        L51:
            java.lang.String r1 = ""
        L53:
            java.lang.String r0 = "live_action_type"
            r2.LJJII(r1, r0)
            r2.LIZ()
            return
        L5c:
            java.lang.String r1 = "click"
            goto L38
        L5f:
            r1 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C518990KWz.LIZIZ(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.util.Map, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
