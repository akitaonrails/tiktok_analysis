package X;

import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.LivePlayPullStreamEndEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import qo2.w;

/* JADX INFO: renamed from: X.0IWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468000IWw {
    public static void LIZJ(long j, DataChannel dataChannel, boolean z) {
        int i;
        if (dataChannel.gg0(C749470Tab.class) == null) {
            return;
        }
        C0IX3 c0ix3 = (C0IX3) dataChannel.gg0(C1082830eHh.class);
        if (c0ix3 != null && c0ix3.LIZLLL.size() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enter_room_rate");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_first_screen");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_widgets_load");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r13, long r14, long r16, java.lang.String r18, long r19, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C468000IWw.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel, long, long, java.lang.String, long, java.lang.String, java.lang.String):void");
    }

    public static void LIZIZ(String str, long j, long j2, long j3, long j4, String str2, String str3, DataChannel dataChannel) {
        String str4;
        C20441214yg.LJIIIZ("MultiTopLive", "LiveEnterRoomLog log enter room failed");
        DataChannelGlobal.LLILZ.HQ2(LivePlayPullStreamEndEvent.class, Boolean.TRUE);
        if (!SlardarSampleSetting.INSTANCE.isReport("livesdk_live_play_fail", 0.0d)) {
            return;
        }
        HashMap map = new HashMap();
        map.put("error_msg", str);
        map.put("error_code", String.valueOf(j));
        map.put("detail_error_code", String.valueOf(j2));
        if (j == 208) {
            map.put("pull_stream_time", String.valueOf(j3));
            map.put("start_room_time", String.valueOf(j4));
            map.put("player_error", str2);
        }
        w wVar = w.LIZ;
        wVar.getClass();
        long jLJIJ = w.LJIJ();
        if (jLJIJ > 0) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_portal_user", str4);
        if (jLJIJ > 0) {
            map.put("portal_id", String.valueOf(jLJIJ));
        }
        map.put("is_ecom", str3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_play_fail");
        c474500IjALIZ.LJJIIZI(map);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
            return;
        }
        c474500IjALIZ.LJJIJLIJ();
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJII(wVar.LIZJ(), "live_type");
        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZ.LJJIJL();
    }
}
