package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.GamePartnership;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dt4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067560dt4 {
    public static boolean LIZ(AnchorCommonStruct anchorCommonStruct, Aweme aweme, InterfaceC1392640mLO interfaceC1392640mLO) throws JSONException {
        Long lValueOf;
        String string;
        Object obj;
        Object obj2;
        String string2;
        String strLJLJJLL;
        Object obj3;
        StandardBusinessModel standardBusinessModel;
        GamePartnership gamePartnership;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        String str = "";
        if (curUserId == null) {
            curUserId = "";
        }
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        ContentModel contentModel = aweme.getContentModel();
        String strLJLJJI = null;
        if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (gamePartnership = standardBusinessModel.getGamePartnership()) != null) {
            lValueOf = Long.valueOf(gamePartnership.publisherTaskId);
        } else {
            lValueOf = null;
        }
        if (lValueOf == null || lValueOf.longValue() <= 0 || Intrinsics.LJFF(curUserId, authorUid)) {
            return false;
        }
        String aid = aweme.getAid();
        C827070WcT.LIZ.getClass();
        String strLIZJ = C827070WcT.LIZJ();
        String strLLIIJI = interfaceC1392640mLO.LLIIJI();
        int promoteAdTypeForReport = AwemeExtKt.getPromoteAdTypeForReport(aweme);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String id = anchorCommonStruct.getId();
        String keyword = anchorCommonStruct.getKeyword();
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(anchorCommonStruct.getExtra());
        if (mapLJIIJ == null || (obj3 = mapLJIIJ.get("game_detail_base")) == null || (string = obj3.toString()) == null) {
            string = "{}";
        }
        JSONObject jSONObjectOptJSONObject = new JSONObject(string).optJSONObject("game_info");
        if (jSONObjectOptJSONObject != null) {
            obj = jSONObjectOptJSONObject.get(FollowStatusChangeMethod.PARAM_UID);
        } else {
            obj = null;
        }
        String strValueOf = String.valueOf(obj);
        if (jSONObjectOptJSONObject != null && (obj2 = jSONObjectOptJSONObject.get("name")) != null && (string2 = obj2.toString()) != null && (strLJLJJLL = a0.LJLJJLL(string2, '\"')) != null) {
            strLJLJJI = a0.LJLJJI(strLJLJJLL, '\"');
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            if (aid == null) {
                aid = "";
            }
            if (strLLIIJI == null) {
                strLLIIJI = "";
            }
            Integer numValueOf = Integer.valueOf(promoteAdTypeForReport);
            Long lValueOf2 = Long.valueOf(jCurrentTimeMillis);
            if (id == null) {
                id = "";
            }
            if (keyword == null) {
                keyword = "";
            }
            if (strLJLJJI != null) {
                str = strLJLJJI;
            }
            return iLiveOuterService.N4(aid, curUserId, strLIZJ, strLLIIJI, id, keyword, strValueOf, str, lValueOf2, numValueOf);
        }
        return false;
    }
}
