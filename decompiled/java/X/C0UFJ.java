package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.model.LogParams;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0UFJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UFJ implements C0UAK {
    public static final C0UFJ LIZ = new C0UFJ();
    public static LogParams LIZIZ = new LogParams(null, null, null, null, null, null, 0, 0, 0, C158B.LIZ());
    public static LogParams LIZJ = new LogParams(null, null, null, null, null, null, 0, 0, 0, C158B.LIZ());

    public static C474500IjA LIZ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(LIZIZ.entrance, "entrance");
        c474500IjALIZ.LJJII(String.valueOf(LIZIZ.isFirstGuide), "is_first_guide");
        c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getConnectionType(), "connection_type");
        c474500IjALIZ.LJJII(LIZIZ.settingStatus, "setting_status");
        return c474500IjALIZ;
    }

    public static final void LIZLLL(DataChannel dataChannel, boolean z) {
        String json;
        if (C500260Jjc.LJJIJLIJ() || LIZIZ.backgroundPos == 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stream_goal_background_use_time");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(LIZIZ.streamGoalId, "stream_goal_id");
        c474500IjALIZ.LJJII(Integer.valueOf((int) (C158B.LIZ() - LIZIZ.startTime)), "duration");
        c474500IjALIZ.LJJII(LIZIZ.isAdjust, "is_adjust");
        c474500IjALIZ.LJJII(InterfaceC772190UQv.X3.LIZIZ(), "background_pos");
        c474500IjALIZ.LIZ();
        if (z) {
            C20337914i1<n> c20337914i1 = InterfaceC772190UQv.W3;
            LogParams logParams = LIZIZ;
            n nVarLIZJ = null;
            if (logParams != null && (json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, logParams)) != null) {
                nVarLIZJ = C769080UEw.LIZJ(json);
            }
            c20337914i1.LJFF(nVarLIZJ);
        }
        LIZJ = new LogParams(null, null, null, null, null, null, 0, 0, 0, C158B.LIZ());
        LIZIZ = new LogParams(null, null, null, null, null, null, 0, 0, 0, C158B.LIZ());
    }

    public static void LIZIZ(DataChannel dataChannel, int i, String str) {
        C474500IjA c474500IjALIZ = LIZ(dataChannel, "livesdk_stream_goal_background_sticker_confirm_click");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_confirm");
        c474500IjALIZ.LJJII(str, "conflict_function");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(DataChannel dataChannel, String str, String str2) {
        C474500IjA c474500IjALIZ = LIZ(dataChannel, "livesdk_stream_goal_background_sticker_confirm_show");
        c474500IjALIZ.LJJII(str, "type");
        c474500IjALIZ.LJJII(str2, "conflict_function");
        c474500IjALIZ.LIZ();
    }
}
