package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188410h1z {
    public static final void LIZ(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, String str, String str2) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
        C1189060h32.LJJIFFI(c2344009Gk, "enter_method", str);
        C1189060h32.LJJIFFI(c2344009Gk, "tag_code", str2);
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_post_view_all_click", map, c1185050gwZ);
    }

    public static final void LIZJ(final int i, final PageFinder pageFinder, final InterfaceC665370Q7z interfaceC665370Q7z, final Aweme aweme, final Boolean bool, final String str, final String str2, final String str3, final String str4, final String str5, final String str6) {
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0h20
            public final void LIZ() {
                C1188950h2r c1188950h2r = C1188950h2r.LIZ;
                C1188730h2V c1188730h2V = C1185490gxH.Companion;
                C2344009Gk c2344009Gk = new C2344009Gk();
                C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z);
                c2344009Gk.LIZJ(i, "order");
                Aweme aweme2 = aweme;
                C1188460h24.LIZ.getClass();
                C1188440h22 c1188440h22LJ = C1188460h24.LJ(aweme2, "detail_item_show", null);
                if (c1188440h22LJ != null) {
                    c1188950h2r.getClass();
                    C1188950h2r.LJ(c2344009Gk, c1188440h22LJ);
                    C1188480h26 c1188480h26 = C1188510h29.Companion;
                    String poiId = c1188440h22LJ.getPoiId();
                    c1188480h26.getClass();
                    C1188510h29 c1188510h29LIZ = C1188480h26.LIZ(poiId);
                    c2344009Gk.LJII(c1188510h29LIZ != null ? c1188510h29LIZ.getSearchParams() : null);
                }
                Aweme aweme3 = aweme;
                c1188730h2V.getClass();
                C1188730h2V.LIZ(c2344009Gk, C1188730h2V.LJ(aweme3));
                Aweme aweme4 = aweme;
                c1188950h2r.getClass();
                C1188950h2r.LIZJ(c2344009Gk, aweme4);
                C1189060h32.LJI(c2344009Gk, str2);
                C1189060h32.LJJIFFI(c2344009Gk, "tab_code", str5);
                C1189060h32.LJJIFFI(c2344009Gk, "tag_code", str6);
                C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_rank", String.valueOf(i));
                Map<String, String> map = c2344009Gk.LIZ;
                HashMap map2 = (HashMap) map;
                map2.put("page_poi_id", str);
                String str7 = str3;
                if (str7 != null) {
                    map2.put("from_group_id", str7);
                }
                map2.put("page_model", Intrinsics.LJFF(bool, Boolean.TRUE) ? "panel" : "detail");
                map2.put("enter_method", str4);
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
                c1185040gwY.getClass();
                C1185040gwY.LIZIZ("poi_video_show", map, c1185050gwZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PoiDetailVideoListMobHelperKt@e228.mobPoiVideoShow$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PoiDetailVideoListMobHelperKt@e228.mobPoiVideoShow$1");
            }
        });
    }

    public static void LIZIZ(Aweme aweme, String str, int i, String str2, String str3, Boolean bool, C1185490gxH c1185490gxH, String str4, String str5, String str6, String str7, PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, int i2) {
        String poiRegionCode;
        String poiCityCode;
        String poiId;
        String str8;
        String string;
        String imprId;
        Object obj;
        Object obj2;
        String string2;
        Map<String, Object> extraParam;
        Object obj3;
        String fromGroupId = str3;
        Boolean bool2 = bool;
        InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
        String str9 = str7;
        String str10 = str6;
        String str11 = str5;
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            fromGroupId = null;
        }
        if ((i2 & 32) != 0) {
            bool2 = null;
        }
        if ((i2 & 128) != 0) {
            c1185490gxH = null;
        }
        if ((i2 & 512) != 0) {
            str11 = null;
        }
        if ((i2 & 1024) != 0) {
            str10 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str9 = null;
        }
        if ((i2 & 8192) != 0) {
            interfaceC665370Q7z2 = null;
        }
        C1188460h24.LIZ.getClass();
        C1188440h22 c1188440h22LJ = C1188460h24.LJ(aweme, "detail_item_click", null);
        C1188440h22 c1188440h22LIZIZ = C1188460h24.LIZIZ(str);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        C1188730h2V c1188730h2V = C1185490gxH.Companion;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7z2);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        c2344009Gk.LIZJ(i, "order");
        if (c1188440h22LJ != null) {
            poiRegionCode = c1188440h22LJ.getPoiRegionCode();
        } else {
            poiRegionCode = null;
        }
        c2344009Gk.LJIIIIZZ("poi_region_code", poiRegionCode);
        if (c1188440h22LJ != null) {
            poiCityCode = c1188440h22LJ.getPoiCityCode();
        } else {
            poiCityCode = null;
        }
        c2344009Gk.LJIIIIZZ("poi_city", poiCityCode);
        if (c1188440h22LJ != null) {
            poiId = c1188440h22LJ.getPoiId();
        } else {
            poiId = null;
        }
        c2344009Gk.LJIIIIZZ("poi_id", poiId);
        c2344009Gk.LJIIIIZZ("page_poi_id", str);
        String str12 = "";
        if (fromGroupId == null && (c1188440h22LIZIZ == null || (fromGroupId = c1188440h22LIZIZ.getFromGroupId()) == null)) {
            fromGroupId = "";
        }
        c2344009Gk.LJIIIIZZ("from_group_id", fromGroupId);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        if (Intrinsics.LJFF(bool2, Boolean.TRUE)) {
            str8 = "panel";
        } else {
            str8 = "detail";
        }
        c2344009Gk.LJIIIIZZ("page_model", str8);
        String collectInfo = null;
        C1189060h32.LJJIFFI(c2344009Gk, "anchor_interact_method", null);
        if (c1188440h22LJ != null) {
            collectInfo = c1188440h22LJ.getCollectInfo();
        }
        C1189060h32.LIZJ(c2344009Gk, collectInfo);
        C1189060h32.LJI(c2344009Gk, str2);
        c1188730h2V.getClass();
        String strLIZJ = C1188730h2V.LIZJ("pic_cnt");
        if (c1185490gxH == null || (extraParam = c1185490gxH.getExtraParam()) == null || (obj3 = extraParam.get("pic_cnt")) == null || (string = obj3.toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF(strLIZJ, string);
        if (c1185490gxH != null) {
            Map<String, Object> extraParam2 = c1185490gxH.getExtraParam();
            if (extraParam2 != null && (obj2 = extraParam2.get("aweme_type")) != null && (string2 = obj2.toString()) != null) {
                c2344009Gk.LJFF(C1188730h2V.LIZJ("aweme_type"), string2);
            }
            String groupId = c1185490gxH.getGroupId();
            if (groupId != null) {
                c2344009Gk.LJFF(C1188730h2V.LIZJ("group_id"), groupId);
            }
            try {
                Map<String, Object> extraParam3 = c1185490gxH.getExtraParam();
                if (extraParam3 != null && (obj = extraParam3.get("event_track")) != null) {
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
        }
        LogPbBean logPbBean = aweme.getLogPbBean();
        if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
            str12 = imprId;
        }
        C1189060h32.LJJIFFI(c2344009Gk, "log_pb", str12);
        c2344009Gk.LJIIIIZZ("enter_method", str4);
        C1189060h32.LJJIFFI(c2344009Gk, "tab_code", str11);
        C1189060h32.LJJIFFI(c2344009Gk, "tag_code", str10);
        C1189060h32.LJJIFFI(c2344009Gk, "click_area", str9);
        C1189060h32.LJJIFFI(c2344009Gk, "poi_detail_rank", String.valueOf(i));
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("poi_video_click", map, c1185050gwZ);
    }
}
