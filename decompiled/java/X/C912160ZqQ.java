package X;

import com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912160ZqQ {
    public static void LIZ(String str, String str2, String str3) {
        IMSayhiAnalytics imSayhiAnalytics = C1336205Ku.LIZ(false).getImSayhiAnalytics();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("enter_method", "button");
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("rec_type", str2);
        pairArr[3] = new Pair("scene_type", "item");
        imSayhiAnalytics.LIZJ(str3, C2097608Jq.LJIIJ(pairArr));
    }

    public static void LIZIZ(String str, String str2, String str3) {
        IMSayhiAnalytics imSayhiAnalytics = C1336205Ku.LIZ(false).getImSayhiAnalytics();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("enter_method", "button");
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("rec_type", str2);
        pairArr[3] = new Pair("scene_type", "item");
        imSayhiAnalytics.LIZIZ(str3, C2097608Jq.LJIIJ(pairArr), null, true);
    }
}
