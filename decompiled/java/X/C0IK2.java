package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0IK2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IK2 {
    public static void LIZ(DataChannel dataChannel, int i, String str, Integer num, String str2) {
        String string;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_inner_flow_survey_status");
        c474500IjALIZ.LJJII(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(str, "survey_id");
        if (num == null || (string = num.toString()) == null) {
            string = "NULL";
        }
        c474500IjALIZ.LJJII(string, "frequency_block_details");
        c474500IjALIZ.LJJII(str2, "detail_status");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }
}
