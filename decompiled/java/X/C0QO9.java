package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS37S1200000_35;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.explore.experiment.ExploreSearchRealTimeConfig;
import com.ss.android.ugc.aweme.outreach.dispersion.monitor.OutreachMonitorServiceImpl;
import com.ss.android.ugc.aweme.outreach.dispersion.spi.IOutreachMonitorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QO9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QO9 {
    public static final C0QO9 LIZ = new C0QO9();

    public static final void LIZ(String str, JSONObject jSONObject) {
        EnumC2252111DCv enumC2252111DCv;
        int iOptInt;
        int iOptInt2;
        int iLIZ;
        int iLIZ2;
        if (!C300610BqN.LIZ()) {
            return;
        }
        C2252051DCp.LIZ.getClass();
        if (Intrinsics.LJFF(str, "search") && (C21141917oP.LIZ() || ((ExploreSearchRealTimeConfig) C291500Bbg.LIZIZ.getValue()).enable)) {
            C2252051DCp.LJFF().execute(new ARunnableS110S0100000_10(str, jSONObject, 193));
        }
        String strOptString = null;
        if (Intrinsics.LJFF("play_session_events", str)) {
            if (jSONObject != null) {
                strOptString = jSONObject.optString("enter_from");
            }
            if (Intrinsics.LJFF(strOptString, "general_search") && str != null && jSONObject != null) {
                if (jSONObject.has("no_v_list") && (iLIZ2 = C2838018a.LIZ(jSONObject.optString("no_v_list"))) > 0) {
                    C666110QAv c666110QAv = new C666110QAv(307, "has no video list count: " + iLIZ2);
                    c666110QAv.LJ = "general_search";
                    c666110QAv.LIZ("no_v_count", String.valueOf(iLIZ2));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("search_session_info");
                    if (jSONObjectOptJSONObject != null) {
                        c666110QAv.LIZJ = C0QGD.LIZ(jSONObjectOptJSONObject);
                    }
                    C0QO8.LIZ.LJII(c666110QAv);
                }
                if (jSONObject.has("no_a_list") && (iLIZ = C2838018a.LIZ(jSONObject.optString("no_a_list"))) > 0) {
                    C666110QAv c666110QAv2 = new C666110QAv(308, "has no audio list count: " + iLIZ);
                    c666110QAv2.LJ = "general_search";
                    c666110QAv2.LIZ("no_a_count", String.valueOf(iLIZ));
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("search_session_info");
                    if (jSONObjectOptJSONObject2 != null) {
                        c666110QAv2.LIZJ = C0QGD.LIZ(jSONObjectOptJSONObject2);
                    }
                    C0QO8.LIZ.LJII(c666110QAv2);
                }
                if (jSONObject.has("av_outsync_count") && (iOptInt2 = jSONObject.optInt("av_outsync_count")) > 0) {
                    C666110QAv c666110QAv3 = new C666110QAv(310, "audio and video frame out sync count: " + iOptInt2);
                    c666110QAv3.LJ = "general_search";
                    c666110QAv3.LIZ("av_outsync_count", String.valueOf(iOptInt2));
                    JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("search_session_info");
                    if (jSONObjectOptJSONObject3 != null) {
                        c666110QAv3.LIZJ = C0QGD.LIZ(jSONObjectOptJSONObject3);
                    }
                    C0QO8.LIZ.LJII(c666110QAv3);
                }
                if (jSONObject.has("crosstalk_count") && (iOptInt = jSONObject.optInt("crosstalk_count")) >= 2) {
                    C666110QAv c666110QAv4 = new C666110QAv(309, "video cross talk count: " + iOptInt);
                    c666110QAv4.LJ = "general_search";
                    c666110QAv4.LIZ("crosstalk_count", String.valueOf(iOptInt));
                    JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("search_session_info");
                    if (jSONObjectOptJSONObject4 != null) {
                        c666110QAv4.LIZJ = C0QGD.LIZ(jSONObjectOptJSONObject4);
                    }
                    C0QO8.LIZ.LJII(c666110QAv4);
                }
            }
        }
        C01GW c01gw = C2252101DCu.LIZ;
        if (!TextUtils.isEmpty(str) && (enumC2252111DCv = C2252101DCu.LJ.get(str)) != null) {
            C2252051DCp.LJFF().execute(new ARunnableS37S1200000_35(jSONObject, str, enumC2252111DCv, 1));
        }
        IOutreachMonitorService iOutreachMonitorServiceLIZ = OutreachMonitorServiceImpl.LIZ();
        if (iOutreachMonitorServiceLIZ != null) {
            iOutreachMonitorServiceLIZ.onEventV3(str, jSONObject);
        }
    }
}
