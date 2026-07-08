package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import java.io.File;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.126R, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C126R {
    public static final C126R LIZ = new C126R();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(318));

    public static C1533790q13 LIZ(String str) {
        C1533790q13 c1533790q13LIZIZ;
        String strLIZLLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Forest forest = (Forest) LIZIZ.getValue();
        C1533790q13 c1533790q13 = null;
        boolean z = true;
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.channel = "tiktok_social_friends_interaction_res";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("story_streaks_post");
        sbLIZ.append(File.separator);
        sbLIZ.append(str);
        requestParams.bundle = C2188811AlT.LIZIZ(sbLIZ);
        requestParams.waitGeckoUpdate = true;
        requestParams.resourceScene = EnumC1533980q1M.OTHER;
        Boolean bool = Boolean.TRUE;
        requestParams.enableCDNCache = bool;
        requestParams.enableMemoryCache = bool;
        requestParams.enableRequestReuse = true;
        C1533910q1F c1533910q1FCreateSyncRequest = forest.createSyncRequest("", requestParams);
        if (c1533910q1FCreateSyncRequest != null) {
            c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ();
            if (c1533790q13LIZIZ != null && c1533790q13LIZIZ.LIZIZ && (strLIZLLL = c1533790q13LIZIZ.LIZLLL()) != null && strLIZLLL.length() != 0) {
                c1533790q13 = c1533790q13LIZIZ;
            }
        } else {
            c1533790q13LIZIZ = null;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("loadGeckoResource(): success:");
        if (c1533790q13LIZIZ == null) {
            z = false;
        }
        sbLIZ2.append(z);
        sbLIZ2.append(", filename: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", duration: ");
        sbLIZ2.append(jCurrentTimeMillis2);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (C126T.LIZ.contains(str)) {
            C126M.LIZIZ = jCurrentTimeMillis2;
        }
        if (C126T.LIZIZ.contains(str)) {
            C126M.LIZJ = jCurrentTimeMillis2;
        }
        if (C126T.LIZJ.contains(str)) {
            C126M.LIZLLL = jCurrentTimeMillis2;
        }
        if (Intrinsics.LJFF(str, "social_storystreak_fire.json")) {
            C126M.LJ = jCurrentTimeMillis2;
        }
        return c1533790q13;
    }
}
