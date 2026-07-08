package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.series.feed.tab.feed.author.SeriesFeedAuthorInfoAssemTrigger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SFX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFX extends C09AY implements Function2<String, C2344009Gk, Unit> {
    public final /* synthetic */ VideoItemParams LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SFX(VideoItemParams videoItemParams) {
        super(2);
        this.LL = videoItemParams;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, C2344009Gk c2344009Gk) throws JSONException {
        Long lValueOf;
        Long lValueOf2;
        Map<String, String> logExtra;
        Map<String, String> mapLJ;
        HashMap<String, String> mobParams;
        String str2;
        Object c098200Yq;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        String str3 = str;
        C2344009Gk c2344009Gk2 = c2344009Gk;
        Aweme aweme = this.LL.getAweme();
        if (aweme != null) {
            String aid = aweme.getAid();
            PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
            String str4 = null;
            if (paidContentInfo != null) {
                lValueOf = Long.valueOf(paidContentInfo.getPaidCollectionId());
            } else {
                lValueOf = null;
            }
            PaidContentInfo paidContentInfo2 = aweme.mPaidContentInfo;
            if (paidContentInfo2 != null) {
                lValueOf2 = Long.valueOf(paidContentInfo2.getCategory());
            } else {
                lValueOf2 = null;
            }
            PaidContentInfo paidContentInfo3 = aweme.mPaidContentInfo;
            if (paidContentInfo3 != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo3)) != null) {
                logExtra = paidContentMiniDramaInfoLIZ.getLogExtra();
            } else {
                logExtra = null;
            }
            HashMap<String, String> mobParams2 = aweme.getMobParams();
            if (mobParams2 != null) {
                str4 = mobParams2.get("is_from_series_dnu_insertion");
            }
            if (logExtra == null) {
                mapLJ = C2097608Jq.LJ();
            } else {
                mapLJ = logExtra;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ);
            HashMap<String, String> mobParams3 = aweme.getMobParams();
            if (mobParams3 != null && mobParams3.containsKey("source_video_id") && (mobParams = aweme.getMobParams()) != null && (str2 = mobParams.get("log_extra")) != null && str2.length() != 0 && str2 != null) {
                int i = SeriesFeedAuthorInfoAssemTrigger.LLJL;
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("entrance_");
                        sbLIZ.append(next);
                        linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), jSONObject.optString(next));
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
            C1577250r99 c1577250r99 = C1577250r99.LIZ;
            String strValueOf = String.valueOf(lValueOf);
            String str5 = this.LL.mEventType;
            String strLJ = C718180SFc.LJ(aweme);
            String strLIZLLL = C718180SFc.LIZLLL(aweme, this.LL.mEventType);
            c1577250r99.getClass();
            JSONObject jSONObject2 = new JSONObject();
            if (str5 == null) {
                str5 = "homepage_series";
            }
            jSONObject2.put("enter_from", str5);
            jSONObject2.put("previous_page", C1577250r99.LIZIZ);
            jSONObject2.put("collection_id", strValueOf);
            jSONObject2.put("group_id", aid);
            jSONObject2.put("series_category", lValueOf2);
            jSONObject2.put("series_tab_location", C1577250r99.LJ());
            jSONObject2.put("series_feed_type", strLIZLLL);
            jSONObject2.put("series_video_type", strLJ);
            if (str4 != null) {
                jSONObject2.put("is_from_series_dnu_insertion", str4);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            C20684815ws.LJIJ("series_information_hot_zone_show", jSONObject2);
            if (logExtra != null) {
                c2344009Gk2.LJII(logExtra);
            }
            C20684815ws.LJIILLIIL(str3, c2344009Gk2.LIZ);
        }
        return Unit.LIZ;
    }
}
