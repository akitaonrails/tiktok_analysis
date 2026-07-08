package X;

import android.content.Context;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import tikcast.api.perception.MultiViolationStatusResponse;

/* JADX INFO: renamed from: X.0JlQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501380JlQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, DataChannel dataChannel, final MultiViolationStatusResponse.ViolationData violationData) {
        if (context != null && violationData != null) {
            PerceptionMessage perceptionMessage = new PerceptionMessage();
            perceptionMessage.dialog = violationData.perceptionDialog;
            perceptionMessage.publicEventInfo = violationData.punishEvent;
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).showDialog(context, perceptionMessage, dataChannel, new InterfaceC775230Ub3() { // from class: X.0JlP
                @Override // X.InterfaceC775230Ub3
                public final void LIZ(String str, String str2) {
                    String str3;
                    PunishEventInfo punishEventInfo = violationData.punishEvent;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_penalty_detail_page");
                    c474500IjALIZ.LJIL();
                    String str4 = null;
                    if (punishEventInfo != null) {
                        str3 = punishEventInfo.punishId;
                    } else {
                        str3 = null;
                    }
                    c474500IjALIZ.LJJII(str3, "record_id");
                    if (punishEventInfo != null) {
                        str4 = punishEventInfo.punishType;
                    }
                    c474500IjALIZ.LJJII(str4, "violation_type");
                    c474500IjALIZ.LJJII(str, "action_type");
                    c474500IjALIZ.LJJII(str2, "click_tab");
                    c474500IjALIZ.LJJII("banner", "source");
                    c474500IjALIZ.LIZ();
                }
            });
        }
    }
}
