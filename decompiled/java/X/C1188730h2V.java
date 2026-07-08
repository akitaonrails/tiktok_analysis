package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h2V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188730h2V {
    public static final String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("from_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1185490gxH LJ(Aweme aweme) {
        String str;
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> mapLJII = ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJII(aweme);
        if (mapLJII != null) {
            linkedHashMap.putAll(mapLJII);
        }
        linkedHashMap.put("aweme_type", Integer.valueOf(aweme.getAwemeType()));
        NearbyInfo nearbyInfo = aweme.getNearbyInfo();
        Object objValueOf = "";
        if (nearbyInfo == null || (str = nearbyInfo.eventTrack) == null) {
            str = "";
        }
        linkedHashMap.put("event_track", str);
        linkedHashMap.put("follow_status", String.valueOf(AwemeExtKt.getFollowStatus(aweme)));
        linkedHashMap.put("publish_consume_Interval", String.valueOf(System.currentTimeMillis() - aweme.getCreateTime()));
        linkedHashMap.put("pic_cnt", Integer.valueOf(C735370Ssx.LJIILL(aweme)));
        FeedCommonService feedCommonService = (FeedCommonService) ServiceManager.get().getService(FeedCommonService.class);
        if (feedCommonService != null) {
            objValueOf = Integer.valueOf(feedCommonService.LJJI(C2214201BlK.LJFF(), aweme));
        }
        linkedHashMap.put("music_name", objValueOf);
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null && anchors.size() > 1) {
            i = 1;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        String aid = aweme.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        String strLJIILIIL = C735370Ssx.LJIILIIL(aweme);
        String logPbString = aweme.getLogPbString();
        if (logPbString != null) {
            if (logPbString.length() == 0) {
                logPbString = C584850Mwl.LIZ.LIZIZ(aweme.getRequestId());
            }
        } else {
            logPbString = null;
        }
        return new C1185490gxH(numValueOf, aid, authorUid, strLJIILIIL, logPbString, linkedHashMap);
    }

    public static void LIZ(C2344009Gk c2344009Gk, C1185490gxH c1185490gxH) {
        String logPb;
        Integer multiAnchor;
        String authorId;
        String groupId;
        Object obj;
        String musicId = null;
        if (c1185490gxH != null) {
            logPb = c1185490gxH.getLogPb();
        } else {
            logPb = null;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "log_pb", logPb);
        if (c1185490gxH != null) {
            Map<String, Object> extraParam = c1185490gxH.getExtraParam();
            if (extraParam != null) {
                for (Map.Entry<String, Object> entry : extraParam.entrySet()) {
                    if (!Intrinsics.LJFF(entry.getKey(), "event_track") && !Intrinsics.LJFF(entry.getKey(), "follow_status") && !Intrinsics.LJFF(entry.getKey(), "publish_consume_Interval")) {
                        C1189060h32.LJIIIZ(c2344009Gk, entry.getKey(), entry.getValue());
                    }
                }
            }
            try {
                Map<String, Object> extraParam2 = c1185490gxH.getExtraParam();
                if (extraParam2 != null && (obj = extraParam2.get("event_track")) != null) {
                    JSONObject jSONObject = new JSONObject(obj.toString());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        C1189060h32.LJIIIZ(c2344009Gk, next, jSONObject.opt(next));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            multiAnchor = c1185490gxH.getMultiAnchor();
        } else {
            multiAnchor = null;
        }
        c2344009Gk.LJ(multiAnchor, "multi_anchor");
        if (c1185490gxH != null) {
            authorId = c1185490gxH.getAuthorId();
        } else {
            authorId = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorId);
        if (c1185490gxH != null) {
            groupId = c1185490gxH.getGroupId();
        } else {
            groupId = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        if (c1185490gxH != null) {
            musicId = c1185490gxH.getMusicId();
        }
        c2344009Gk.LJIIIIZZ("music_id", musicId);
        C1200940hMC c1200940hMC = C1200940hMC.LIZ;
        Application applicationLIZ = C1BWL.LIZ();
        c1200940hMC.getClass();
        c2344009Gk.LIZJ(C1200940hMC.LIZIZ(applicationLIZ) ? 1 : 0, "enable_location");
    }

    public static final String LIZLLL(String str, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("from_");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static void LIZIZ(Map map, C1185490gxH c1185490gxH, boolean z) {
        String string;
        String string2;
        String groupId;
        Object obj;
        String string3;
        Map<String, Object> extraParam;
        Object obj2;
        Map<String, Object> extraParam2;
        Object obj3;
        String strLIZLLL = LIZLLL("pic_cnt", z);
        if (c1185490gxH == null || (extraParam2 = c1185490gxH.getExtraParam()) == null || (obj3 = extraParam2.get("pic_cnt")) == null || (string = obj3.toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJIJI(map, strLIZLLL, string);
        String strLIZLLL2 = LIZLLL("aweme_type", z);
        if (c1185490gxH != null && (extraParam = c1185490gxH.getExtraParam()) != null && (obj2 = extraParam.get("aweme_type")) != null) {
            string2 = obj2.toString();
        } else {
            string2 = null;
        }
        C1189060h32.LJIJI(map, strLIZLLL2, string2);
        String strLIZLLL3 = LIZLLL("group_id", z);
        if (c1185490gxH != null) {
            groupId = c1185490gxH.getGroupId();
        } else {
            groupId = null;
        }
        C1189060h32.LJIJI(map, strLIZLLL3, groupId);
        if (c1185490gxH != null) {
            try {
                Map<String, Object> extraParam3 = c1185490gxH.getExtraParam();
                if (extraParam3 != null && (obj = extraParam3.get("event_track")) != null) {
                    JSONObject jSONObject = new JSONObject(obj.toString());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object objOpt = jSONObject.opt(next);
                        if (objOpt != null) {
                            string3 = objOpt.toString();
                        } else {
                            string3 = null;
                        }
                        C1189060h32.LJJ(next, string3, map);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
