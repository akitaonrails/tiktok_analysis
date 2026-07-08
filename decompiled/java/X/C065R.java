package X;

import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.share.QuickShareAIInfo;
import com.ss.android.ugc.aweme.base.share.QuickShareCandidate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.065R, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C065R {
    public static boolean LIZ;
    public static IPitayaCore LIZIZ;
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C065V());

    public static IPitayaCore LIZ() {
        IPitayaCore iPitayaCore = LIZIZ;
        if (iPitayaCore != null) {
            return iPitayaCore;
        }
        C844470XAv.LIZ.getClass();
        return PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ));
    }

    public static boolean LIZJ() {
        boolean zIsReady;
        if (LIZ) {
            return true;
        }
        if (((Boolean) C065S.LIZ.getValue()).booleanValue()) {
            AnonymousClass1455.LIZ.getClass();
            zIsReady = AnonymousClass1455.LJI();
        } else {
            zIsReady = LIZ().isReady();
        }
        if (zIsReady) {
            LIZ = true;
            LIZIZ = LIZ();
        }
        return zIsReady;
    }

    public static PTYTaskData LIZIZ(Aweme aweme, String str, String str2, String str3, List list) {
        Object uid;
        Object obj;
        Object obj2;
        Object aid;
        QuickShareAIInfo quickShareAIInfo;
        QuickShareAIInfo quickShareAIInfo2;
        QuickShareAIInfo quickShareAIInfo3;
        User author;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trigger_source", str);
            jSONObject.put("enter_from", str2);
            Object obj3 = "";
            if (aweme == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
                uid = "";
            }
            jSONObject.put("author_id", uid);
            Object obj4 = null;
            if (aweme != null && (quickShareAIInfo3 = aweme.getQuickShareAIInfo()) != null) {
                obj = quickShareAIInfo3.recallType;
            } else {
                obj = null;
            }
            jSONObject.put("recall_type", obj);
            if (aweme != null && (quickShareAIInfo2 = aweme.getQuickShareAIInfo()) != null) {
                obj2 = quickShareAIInfo2.shareRecExtra;
            } else {
                obj2 = null;
            }
            jSONObject.put("share_rec_extra", obj2);
            if (aweme != null && (quickShareAIInfo = aweme.getQuickShareAIInfo()) != null) {
                obj4 = quickShareAIInfo.shareRate;
            }
            jSONObject.put("share_rate", obj4);
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            jSONObject.put("gid", aid);
            if (Intrinsics.LJFF(str, "first_frame")) {
                jSONObject.put("should_store_score", "1");
            }
            if (C065U.LIZ()) {
                JSONArray jSONArray = new JSONArray();
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        QuickShareCandidate quickShareCandidate = (QuickShareCandidate) it2.next();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("candidate_id", quickShareCandidate.candidateId);
                        jSONObject2.put("type", quickShareCandidate.type);
                        jSONObject2.put("rate_score", quickShareCandidate.rateScore);
                        jSONObject2.put("extra_info", quickShareCandidate.extraInfo);
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("show_by_candidate_score", str3);
                jSONObject.put("candidate_list", jSONArray);
            }
            if (C065D.LIZ()) {
                Pair pairLIZLLL = C065B.LIZLLL();
                Object obj5 = (String) pairLIZLLL.getFirst();
                Object obj6 = (String) pairLIZLLL.getSecond();
                jSONObject.put("share_rates_list", obj5);
                jSONObject.put("three_side_share_rates_list", obj6);
            } else if (C065T.LIZ()) {
                AbstractC2252651DEx abstractC2252651DEx = C065M.LIZ;
                Object obj7 = (String) C065M.LJFF(AFwS187S0000000_2.get$arr$(572));
                if (obj7 == null) {
                    obj7 = "";
                }
                jSONObject.put("share_rates_list", obj7);
                Object obj8 = (String) C065M.LJFF(AFwS187S0000000_2.get$arr$(571));
                if (obj8 != null) {
                    obj3 = obj8;
                }
                jSONObject.put("three_side_share_rates_list", obj3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getTaskData ");
            sbLIZ.append(th);
            C1720006oQ.LIZIZ("QuickShareAI", C2188811AlT.LIZIZ(sbLIZ));
        }
        jSONObject.toString();
        return new PTYTaskData(jSONObject);
    }
}
