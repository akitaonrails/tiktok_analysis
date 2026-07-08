package X;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0Q0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663370Q0h {
    public static final Map<Integer, String> LIZ;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        map.put(3, "general_search");
        map.put(6, "search_sug");
    }

    public static String LIZ(int i) {
        String str = (String) ((HashMap) LIZ).get(Integer.valueOf(i));
        if (str != null && !TextUtils.isEmpty(str)) {
            return str;
        }
        return "search_result";
    }

    public static String LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "click_search_recommend";
        }
        return "click_search_result";
    }

    public static void LJFF(int i, String str, String str2) {
        C2241008qG c2241008qG = new C2241008qG();
        if (i != 3) {
            c2241008qG.LIZLLL("group_id", "");
            c2241008qG.LIZLLL("request_id", str);
            c2241008qG.LIZLLL("enter_from", "search_result");
            c2241008qG.LIZLLL("enter_method", "click_card");
            c2241008qG.LIZLLL("enter_type", "normal_way");
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("enter_detail");
            mobClickObtain.setLabelName("personal_homepage");
            mobClickObtain.setValue(str2);
            mobClickObtain.setJsonObject(c2241008qG.LJ());
            C20684815ws.onEvent(mobClickObtain);
            return;
        }
        c2241008qG.LIZLLL("enter_from", "general_search");
        c2241008qG.LIZLLL("enter_method", "click_card");
        c2241008qG.LIZLLL("enter_type", "normal_way");
        MobClick mobClickObtain2 = MobClick.obtain();
        mobClickObtain2.setEventName("enter_detail");
        mobClickObtain2.setLabelName("personal_homepage");
        mobClickObtain2.setValue(str2);
        mobClickObtain2.setJsonObject(c2241008qG.LJ());
        C20684815ws.onEvent(mobClickObtain2);
    }

    public static void LJI(int i, String str, String str2) {
        if (i == 3) {
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("challenge_click");
            mobClickObtain.setLabelName("general_search");
            mobClickObtain.setValue(str);
            C20684815ws.onEvent(mobClickObtain);
            return;
        }
        C2241008qG c2241008qG = new C2241008qG();
        if (!TextUtils.isEmpty(str2)) {
            c2241008qG.LIZLLL("search_keyword", str2);
            MobClick mobClickObtain2 = MobClick.obtain();
            mobClickObtain2.setEventName("challenge_click");
            mobClickObtain2.setLabelName("search_result");
            mobClickObtain2.setExtValueString(str);
            mobClickObtain2.setJsonObject(c2241008qG.LJ());
            C20684815ws.onEvent(mobClickObtain2);
            return;
        }
        c2241008qG.LIZLLL("source", "recommend");
        c2241008qG.LIZLLL(FollowStatusChangeMethod.PARAM_UID, str);
        MobClick mobClickObtain3 = MobClick.obtain();
        mobClickObtain3.setEventName("challenge_click");
        mobClickObtain3.setLabelName("search_result");
        mobClickObtain3.setJsonObject(c2241008qG.LJ());
        C20684815ws.onEvent(mobClickObtain3);
    }

    public static void LIZJ(int i, String str, String str2, AbstractC735380Ssy abstractC735380Ssy, int i2, String str3) {
        C663380Q0i c663380Q0i = new C663380Q0i();
        c663380Q0i.setOrder(i);
        c663380Q0i.setSearchKeyword(str);
        c663380Q0i.setRid(str2);
        c663380Q0i.setEnterFrom(LIZ(i2));
        c663380Q0i.setEnterMethod(str3);
        c663380Q0i.installToMetrics(abstractC735380Ssy);
        abstractC735380Ssy.LJIILJJIL();
    }

    public static void LJ(View view, String str, Aweme aweme, String str2, int i, boolean z, Map<String, String> map) {
        LIZLLL(view, str, aweme, str2, i, "", "", "", z, map);
    }

    public static void LIZLLL(final View view, final String str, final Aweme aweme, final String str2, final int i, final String str3, final String str4, final String str5, final boolean z, final Map<String, String> map) {
        if (!str.equals("general_search") && !str.equals("search_result") && !str.equals("ecommerce") && !str.equals("visual_search") && !str.equals("smart_search_title") && !str.equals("visual_search_ai_card")) {
            return;
        }
        C653440Pk6.LIZ(i, view, C735370Ssx.LIZJ(aweme), null);
        C15O7.LIZIZ(new Callable() { // from class: X.0Pm8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<PhotoModeImageUrlModel> imageList;
                ISearchContextAbility iSearchContextAbilityLIZ;
                C0PCY<C646370PWx> c0pcyWO2;
                String str6 = str;
                Aweme aweme2 = aweme;
                View view2 = view;
                String str7 = str2;
                int i2 = i;
                String str8 = str3;
                String str9 = str4;
                Map map2 = map;
                String str10 = str5;
                boolean z2 = z;
                C1C7U.LIZ("SearchStatistics@e166.sendEnterFeedEvent$1L");
                String strLIZIZ = str6.equals("general_search") ? aweme2 != null ? ((C0PRC) C0Q3E.LIZJ(aweme2).Ph1().LIZJ()).LLILLL : C653440Pk6.LIZIZ() : C735370Ssx.LJIJJ(aweme2);
                C650950Pg5.Companion.getClass();
                C650960Pg6 c650960Pg6LIZJ = C646000PVm.LIZJ();
                String str11 = c650960Pg6LIZJ != null ? c650960Pg6LIZJ.searchVideoModel.groupId : "";
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("request_id", C735370Ssx.LJIJJ(aweme2));
                MobClick mobClickObtain = MobClick.obtain();
                mobClickObtain.setEventName("feed_enter");
                mobClickObtain.setLabelName(str6);
                mobClickObtain.setValue(C735370Ssx.LIZJ(aweme2));
                mobClickObtain.setJsonObject(c2241008qG.LJ());
                C20684815ws.onEvent(mobClickObtain);
                C0PIF.LIZ.getClass();
                String strLJIIIZ = C0PIF.LJIIIZ(view2);
                C654790PmH c654790PmH = new C654790PmH(C660870Pw5.LIZ(view2));
                c654790PmH.LJJJIL(aweme2);
                c654790PmH.LJIJJ(str6);
                c654790PmH.LJIIZILJ("group_id", C735370Ssx.LIZJ(aweme2));
                c654790PmH.LJIIZILJ("search_keyword", str7);
                c654790PmH.LJIJI("search_result_id", C735370Ssx.LIZJ(aweme2));
                c654790PmH.LJIIZILJ("author_id", AwemeExtKt.getAuthorUid(aweme2));
                c654790PmH.LJIIZILJ("log_pb", C584850Mwl.LIZ.LIZIZ(strLIZIZ));
                c654790PmH.LJIIZILJ("search_id", strLIZIZ);
                c654790PmH.LJJIIZ(Integer.valueOf(i2));
                c654790PmH.LIZIZ(C666580QCq.LIZIZ(aweme2, "feed_enter", str6, null));
                c654790PmH.LJIIZILJ("click_times", strLJIIIZ);
                C653400Pk2.LIZIZ(aweme2, c654790PmH);
                C643200PKs.LIZ(c654790PmH, (view2 == null || (iSearchContextAbilityLIZ = C0Q3E.LIZ(view2)) == null || (c0pcyWO2 = iSearchContextAbilityLIZ.wO2()) == null) ? null : (C646370PWx) c0pcyWO2.LIZJ(), null);
                if (!TextUtils.isEmpty(str8)) {
                    c654790PmH.LJJIJIIJI(str8);
                }
                if (!TextUtils.isEmpty(str9)) {
                    c654790PmH.LJJIZ(str9);
                }
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    c654790PmH.LJJIIZI(strLIZIZ);
                    c654790PmH.LJIIZILJ("impr_id", strLIZIZ);
                }
                if ("smart_search_title".equals(str6)) {
                    c654790PmH.LJJIIZI((String) map2.get("search_id"));
                }
                if (!TextUtils.isEmpty(str10)) {
                    c654790PmH.LJIJJLI(str10);
                }
                if ("search_result".equals(str6) || "general_search".equals(str6)) {
                    c654790PmH.LJJI(str11);
                }
                c654790PmH.LJJIFFI(Integer.valueOf(aweme2.getAwemeType()));
                if (aweme2.getPhotoModeImageInfo() != null && (imageList = aweme2.getPhotoModeImageInfo().getImageList()) != null) {
                    c654790PmH.LJJIIJZLJL(Integer.valueOf(imageList.size()));
                }
                if (aweme2.getVideo() != null && aweme2.getVideo().getVideoTag() != null && EnumC657080Ppy.POI_DISTANCE.getType().equals(aweme2.getVideo().getVideoTag().getType())) {
                    c654790PmH.LJIIZILJ("video_tag", "distance");
                }
                C664590Q4z.LIZ.getClass();
                c654790PmH.LIZIZ(C664590Q4z.LIZIZ(aweme2, z2));
                C645930PVf.LIZ(c654790PmH);
                C656630PpF.LIZ(aweme2, c654790PmH);
                if (map2 != null) {
                    c654790PmH.LIZIZ(map2);
                }
                C660800Pvy.LIZ.getClass();
                PoiDataStruct poiDataStructLIZ = C660800Pvy.LIZ(aweme2);
                if (poiDataStructLIZ != null) {
                    HashMap map3 = new HashMap();
                    map3.put("anchor_outreach_type", "1");
                    map3.put("poi_id", poiDataStructLIZ.poiId);
                    C186700nh.LIZ(poiDataStructLIZ.collectInfo, map3);
                    c654790PmH.LIZIZ(map3);
                }
                c654790PmH.LJIILJJIL();
                C1C7U.LIZIZ("SearchStatistics@e166.sendEnterFeedEvent$1L");
                return null;
            }
        }, C823050WQl.LIZIZ(), null);
    }
}
