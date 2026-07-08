package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lHQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351740lHQ {
    public static final C1351740lHQ LIZ = new C1351740lHQ();

    public static JSONObject LJ(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            c098200Yq = new JSONObject(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (JSONObject) obj;
    }

    public static C1351600lHC LIZJ(CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        String str;
        String seriesEnterEntrance;
        String strOptString;
        Map<String, String> paidContentInnerFeedSourceParam;
        String aid = null;
        String strLJFF = LJFF(commentContextSource, aweme, null);
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null && (paidContentInnerFeedSourceParam = iSeriesCommonETServiceLIZ.getPaidContentInnerFeedSourceParam(aweme)) != null) {
            str = paidContentInnerFeedSourceParam.get("source_group_id");
        } else {
            str = null;
        }
        String strLIZIZ = "";
        if (str == null) {
            str = "";
        }
        ISeriesCommonETService iSeriesCommonETServiceLIZ2 = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ2 == null || (seriesEnterEntrance = iSeriesCommonETServiceLIZ2.getSeriesEnterEntrance()) == null) {
            seriesEnterEntrance = "";
        }
        JSONObject jSONObjectLJ = LJ(commentTopBarComponent.extra);
        if (jSONObjectLJ != null && (strOptString = jSONObjectLJ.optString("server_outreach_content")) != null) {
            strLIZIZ = strOptString;
        }
        if (Intrinsics.LJFF(strLJFF, "paid_series_detail_page") && !a0.LJJJIL(strLIZIZ) && !u.LJIIZILJ(strLIZIZ, "_innerfeed", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append("_innerfeed");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C1351600lHC c1351600lHC = new C1351600lHC(str, seriesEnterEntrance, strLJFF, strLIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PineDrama buildSchemaContext aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        }
        sbLIZ2.append(aid);
        sbLIZ2.append(", bizId=");
        sbLIZ2.append(commentTopBarComponent.bizId);
        sbLIZ2.append(", name=");
        sbLIZ2.append(commentTopBarComponent.name);
        sbLIZ2.append(", schemaContext=");
        sbLIZ2.append(c1351600lHC);
        C2188811AlT.LIZIZ(sbLIZ2);
        return c1351600lHC;
    }

    public static String LJFF(CommentContextSource commentContextSource, Aweme aweme, String str) {
        String str2;
        String aid;
        String str3;
        String str4;
        Boolean boolIsInnerFeedRecommend;
        PaidContentInfo paidContentInfo;
        PaidContentMiniDramaInfo paidContentMiniDramaInfo;
        PaidContentInfo paidContentInfo2;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        CommentCommonModel commonModel4;
        Boolean boolIsInnerFeedRecommendVideo = null;
        if (commentContextSource != null && (commonModel4 = commentContextSource.getCommonModel()) != null) {
            str2 = commonModel4.eventType;
        } else {
            str2 = null;
        }
        String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (a0.LJJJIL(str2) && (commentContextSource == null || (commonModel3 = commentContextSource.getCommonModel()) == null || (str2 = commonModel3.enterFrom) == null)) {
            str2 = "";
        }
        if (a0.LJJJIL(str2)) {
            if (str != null) {
                str5 = str;
            }
            str2 = str5;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDrama resolveEnterFrom aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", rawEnterFrom=");
        if (commentContextSource != null && (commonModel2 = commentContextSource.getCommonModel()) != null) {
            str3 = commonModel2.enterFrom;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        sbLIZ.append(", rawEventType=");
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            str4 = commonModel.eventType;
        } else {
            str4 = null;
        }
        sbLIZ.append(str4);
        sbLIZ.append(", eventType=");
        sbLIZ.append(str);
        sbLIZ.append(", isInnerFeedRecommend=");
        if (aweme != null && (paidContentInfo2 = aweme.mPaidContentInfo) != null) {
            boolIsInnerFeedRecommend = paidContentInfo2.isInnerFeedRecommend();
        } else {
            boolIsInnerFeedRecommend = null;
        }
        sbLIZ.append(boolIsInnerFeedRecommend);
        sbLIZ.append(", isInnerFeedRecommendVideo=");
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (paidContentMiniDramaInfo = paidContentInfo.getPaidContentMiniDramaInfo()) != null) {
            boolIsInnerFeedRecommendVideo = paidContentMiniDramaInfo.isInnerFeedRecommendVideo();
        }
        sbLIZ.append(boolIsInnerFeedRecommendVideo);
        sbLIZ.append(", resolvedEnterFrom=");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        return str2;
    }

    public static HashMap LIZ(C19EG c19eg, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) throws JSONException {
        String aid;
        HashMap mapLIZIZ = LIZIZ(c19eg, commentTopBarComponent, aweme, commentContextSource);
        mapLIZIZ.put("outreach_click_method", "pre_click");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDrama buildClickEventParams aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", bizId=");
        sbLIZ.append(commentTopBarComponent.bizId);
        sbLIZ.append(", name=");
        sbLIZ.append(commentTopBarComponent.name);
        sbLIZ.append(", params=");
        sbLIZ.append(mapLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        return mapLIZIZ;
    }

    public static HashMap LIZIZ(C19EG c19eg, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) throws JSONException {
        String strOptString;
        Object c098200Yq;
        boolean zBooleanValue;
        String str;
        String aid;
        C1351600lHC c1351600lHCLIZJ = LIZJ(commentTopBarComponent, aweme, commentContextSource);
        HashMap map = new HashMap();
        map.put("enter_from", c1351600lHCLIZJ.LIZJ);
        LIZ.getClass();
        JSONObject jSONObjectLJ = LJ(commentTopBarComponent.extra);
        String aid2 = null;
        if (jSONObjectLJ != null) {
            strOptString = jSONObjectLJ.optString("outreach_type");
        } else {
            strOptString = null;
        }
        if (strOptString == null) {
            strOptString = "";
        }
        if (a0.LJJJIL(strOptString)) {
            strOptString = "drama_comment_top_bar";
        }
        map.put("outreach_type", strOptString);
        map.put("outreach_key", "comment_top_bar");
        if (c19eg != null) {
            try {
                c098200Yq = Boolean.valueOf(C2162308dZ.LJFF(c19eg, "com.ss.android.ttmd.video"));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = bool;
            }
            zBooleanValue = ((Boolean) c098200Yq).booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            str = "guide_open";
        } else {
            str = "guide_download";
        }
        map.put("outreach_intention", str);
        map.put("outreach_content", c1351600lHCLIZJ.LIZLLL);
        map.put("outreach_to_app_id", "845221");
        LIZ.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectLJ2 = LJ(commentTopBarComponent.extra);
        if (jSONObjectLJ2 != null) {
            Iterator<String> itKeys = jSONObjectLJ2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObjectLJ2.opt(next);
                if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                    jSONObject.put(next, objOpt);
                }
            }
        }
        jSONObject.put("source_group_id", c1351600lHCLIZJ.LIZ);
        jSONObject.put("series_enter_entrance", c1351600lHCLIZJ.LIZIZ);
        jSONObject.put("enter_from", c1351600lHCLIZJ.LIZJ);
        jSONObject.put("outreach_content", c1351600lHCLIZJ.LIZLLL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDrama buildOutreachExtraInfo aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", bizId=");
        sbLIZ.append(commentTopBarComponent.bizId);
        sbLIZ.append(", name=");
        sbLIZ.append(commentTopBarComponent.name);
        sbLIZ.append(", info=");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
        map.put("outreach_extra_info", C786410Ut5.J3(jSONObject));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PineDrama buildCommonEventParams aid=");
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        sbLIZ2.append(aid2);
        sbLIZ2.append(", bizId=");
        sbLIZ2.append(commentTopBarComponent.bizId);
        sbLIZ2.append(", name=");
        sbLIZ2.append(commentTopBarComponent.name);
        sbLIZ2.append(", params=");
        sbLIZ2.append(map);
        C2188811AlT.LIZIZ(sbLIZ2);
        return map;
    }

    public static HashMap LIZLLL(C19EG c19eg, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) throws JSONException {
        String aid;
        HashMap mapLIZIZ = LIZIZ(c19eg, commentTopBarComponent, aweme, commentContextSource);
        mapLIZIZ.put("outreach_show_method", "pre_show");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PineDrama buildShowEventParams aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", bizId=");
        sbLIZ.append(commentTopBarComponent.bizId);
        sbLIZ.append(", name=");
        sbLIZ.append(commentTopBarComponent.name);
        sbLIZ.append(", params=");
        sbLIZ.append(mapLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        return mapLIZIZ;
    }
}
