package X;

import Y.ARunnableS42S0300000_9;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: renamed from: X.0O0T, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O0T {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, FeedItemList feedItemList, boolean z, boolean z2, String str2, C0XIR c0xir, int i2, long j) {
        String str3;
        int size;
        String requestId;
        LogPbBean logPbBean;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "request_type");
        c2344009Gk.LJIIIIZZ("user_id", str);
        String str4 = "false";
        if (feedItemList != null && feedItemList.size() > 0) {
            str3 = "false";
        } else {
            str3 = "true";
        }
        c2344009Gk.LJIIIIZZ("is_empty", str3);
        int i3 = 0;
        if (feedItemList != null) {
            size = feedItemList.size();
        } else {
            size = 0;
        }
        c2344009Gk.LIZJ(size, "size");
        Object obj = "";
        if (feedItemList == null || (requestId = feedItemList.getRequestId()) == null) {
            requestId = "";
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        if (feedItemList != null && (logPbBean = feedItemList.logPb) != null) {
            obj = logPbBean;
        }
        c2344009Gk.LJ(obj, "log_pb");
        if (z) {
            str4 = "true";
        }
        c2344009Gk.LJIIIIZZ("is_my_profile_page", str4);
        c2344009Gk.LJIIIIZZ("source", str2);
        c2344009Gk.LIZJ(i2, "request_count");
        c2344009Gk.LIZLLL(j, "request_cost");
        c2344009Gk.LJ(Boolean.valueOf(z2), "is_from_load_to_target");
        if (c0xir != null) {
            i3 = 1;
        }
        c2344009Gk.LIZJ(i3, "result");
        if (c0xir != null) {
            c2344009Gk.LIZJ(c0xir.getErrorCode(), "error_code");
            c2344009Gk.LJFF("error_msg", c0xir.getErrorMsg());
        }
        C20684815ws.LJFF().execute(new ARunnableS42S0300000_9(feedItemList, c0xir, c2344009Gk.LIZ, 21));
    }
}
