package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi_api.config.PoiImageUrlConfig;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186070gyD {
    public static final C1186070gyD LIZ = new C1186070gyD();

    public static String LIZ(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        if (C960203pA.LIZIZ(context)) {
            if (C426750GoL.LIZLLL(context)) {
                PoiImageUrlConfig.Config configLIZ = PoiImageUrlConfig.LIZ();
                if (configLIZ == null || (str4 = configLIZ.poiDetailAddressBgDarkRTL) == null) {
                    return "https://sf16-va.tiktokcdn.com/obj/eden-va2/7001eh7bfnuhpenuhd/poi_address_rtl_dark.png";
                }
                return str4;
            }
            PoiImageUrlConfig.Config configLIZ2 = PoiImageUrlConfig.LIZ();
            if (configLIZ2 != null && (str3 = configLIZ2.poiDetailAddressBgDark) != null) {
                return str3;
            }
            return "https://sf16-va.tiktokcdn.com/obj/eden-va2/ulyps/dark_11.png";
        }
        if (C426750GoL.LIZLLL(context)) {
            PoiImageUrlConfig.Config configLIZ3 = PoiImageUrlConfig.LIZ();
            if (configLIZ3 != null && (str2 = configLIZ3.poiDetailAddressBgLightRTL) != null) {
                return str2;
            }
            return "https://sf16-va.tiktokcdn.com/obj/eden-va2/7001eh7bfnuhpenuhd/poi_address_rtl_light.png";
        }
        PoiImageUrlConfig.Config configLIZ4 = PoiImageUrlConfig.LIZ();
        if (configLIZ4 != null && (str = configLIZ4.poiDetailAddressBgLight) != null) {
            return str;
        }
        return "https://sf16-va.tiktokcdn.com/obj/eden-va2/ulyps/light_11.png";
    }

    public static String LIZIZ(Context context, EnumC1184810gwB enumC1184810gwB) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i = C1184860gwG.LIZ[enumC1184810gwB.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (C960203pA.LIZIZ(context)) {
                        if (C426750GoL.LIZLLL(context)) {
                            PoiImageUrlConfig.Config configLIZ = PoiImageUrlConfig.LIZ();
                            if (configLIZ == null || (str8 = configLIZ.poiDetailMiddleAddressBgDarkRtl) == null) {
                                return "https://sf16.tiktokcdn-us.com/obj/eden-va2/ulyps/rtl_dark_map_double_column_v2.png";
                            }
                            return str8;
                        }
                        PoiImageUrlConfig.Config configLIZ2 = PoiImageUrlConfig.LIZ();
                        if (configLIZ2 != null && (str7 = configLIZ2.poiDetailMiddleAddressBgDark) != null) {
                            return str7;
                        }
                        return "https://sf16-va.tiktokcdn.com/obj/eden-va2/ulyps/dark_map_double_column_v2.png";
                    }
                    if (C426750GoL.LIZLLL(context)) {
                        PoiImageUrlConfig.Config configLIZ3 = PoiImageUrlConfig.LIZ();
                        if (configLIZ3 != null && (str6 = configLIZ3.poiDetailMiddleAddressBgLightRtl) != null) {
                            return str6;
                        }
                        return "https://sf16.tiktokcdn-us.com/obj/eden-va2/ulyps/rtl_light_map_double_column_v2.png";
                    }
                    PoiImageUrlConfig.Config configLIZ4 = PoiImageUrlConfig.LIZ();
                    if (configLIZ4 != null && (str5 = configLIZ4.poiDetailMiddleAddressBgLight) != null) {
                        return str5;
                    }
                    return "https://sf16.tiktokcdn-us.com/obj/eden-va2/ulyps/light_map_double_column_v2.png";
                }
                throw new C1954807lC();
            }
            if (C960203pA.LIZIZ(context)) {
                if (C426750GoL.LIZLLL(context)) {
                    PoiImageUrlConfig.Config configLIZ5 = PoiImageUrlConfig.LIZ();
                    if (configLIZ5 == null || (str4 = configLIZ5.poiDetailBottomAddressBgDarkRtl) == null) {
                        return "https://sf16.tiktokcdn-us.com/obj/eden-va2/ulyps/rtl_dark_map_big_v2.png";
                    }
                    return str4;
                }
                PoiImageUrlConfig.Config configLIZ6 = PoiImageUrlConfig.LIZ();
                if (configLIZ6 != null && (str3 = configLIZ6.poiDetailBottomAddressBgDark) != null) {
                    return str3;
                }
                return "https://sf16.tiktokcdn-us.com/obj/eden-va2/ulyps/dark_map_big_v2.png";
            }
            if (C426750GoL.LIZLLL(context)) {
                PoiImageUrlConfig.Config configLIZ7 = PoiImageUrlConfig.LIZ();
                if (configLIZ7 != null && (str2 = configLIZ7.poiDetailBottomAddressBgLightRtl) != null) {
                    return str2;
                }
                return "https://sf16.tiktokcdn-us.com/obj/eden-va2/ulyps/rtl_light_map_big_v2.png";
            }
            PoiImageUrlConfig.Config configLIZ8 = PoiImageUrlConfig.LIZ();
            if (configLIZ8 != null && (str = configLIZ8.poiDetailBottomAddressBgLight) != null) {
                return str;
            }
            return "https://sf16.tiktokcdn-us.com/obj/eden-va2/ulyps/light_map_big_v2.png";
        }
        return LIZ(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [X.0Q7z] */
    /* JADX WARN: Type inference failed for: r24v3, types: [X.0Q7z] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    public static void LIZLLL(C1186070gyD c1186070gyD, final Context context, String str, PoiListApi.PoiDetailResponse poiDetailResponse, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Function0 function0, String str10, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String strLJ;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
        String str11;
        ?? r24;
        SparkContext sparkContext;
        c1186070gyD.getClass();
        String str12 = null;
        if (C123100dR.LIZ(null)) {
            strLJ = null;
        } else {
            strLJ = C2365509Or.LJ(C308370C6x.LIZ(null));
        }
        boolean z = false;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_detail_page_review_opt", false) > 0) {
            z = true;
        }
        String str13 = "";
        if (!z || poiDetailResponse.getPoiReviewEntrance() == null ? (poiReviewSummaryModel = poiDetailResponse.getPoiReviewSummaryModel()) == null || (str11 = poiReviewSummaryModel.eligibleExtraInfo) == null : (str11 = poiDetailResponse.getPoiReviewEntrance().eligibleExtraInfo) == null) {
            str11 = "";
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        String strLIZIZ = TiktokPoiLynxSettings.LIZIZ("poi_review_post");
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        sparkContext2.LJJLIIJ(strLIZIZ);
        sparkContext2.LJJJZ("poi_id", str);
        sparkContext2.LJJJZ("poi_name", Uri.encode(poiDetailResponse.getName()));
        sparkContext2.LJJJZ("post_source", "3");
        String collectInfo = poiDetailResponse.getCollectInfo();
        if (collectInfo == null) {
            collectInfo = "";
        }
        sparkContext2.LJJJZ("collect_info", Uri.encode(collectInfo));
        sparkContext2.LJJJZ("review_config", Uri.encode(str11));
        sparkContext2.LJJJZ("associated_video_id", "");
        sparkContext2.LJJJZ("enter_method", str8);
        sparkContext2.LJJJZ("enter_from", "poi_detail");
        sparkContext2.LJJJZ("initial_poi_id", str2);
        sparkContext2.LJJJZ("initial_poi_from_group_id", str3);
        sparkContext2.LJJJZ("initial_poi_enter_from", str4);
        sparkContext2.LJJJZ("initial_poi_enter_method", str5);
        sparkContext2.LJJJZ("poi_detail_enter_from", str7);
        sparkContext2.LJJJZ("poi_detail_enter_method", str6);
        if (str10 != null) {
            str13 = str10;
        }
        sparkContext2.LJJJZ("poi_session_id", str13);
        sparkContext2.LJJJZ("log_extra", strLJ);
        if (str9 != 0) {
            sparkContext2.LJJJZ("from_group_id", str9);
        }
        try {
            str9 = interfaceC665370Q7z;
            Map mapLJII = C1182380gsG.LJII(str9);
            if (!mapLJII.isEmpty()) {
                C1548420qOe.LIZIZ(sparkContext2, "poi_general_track_params", C2365509Or.LJ(mapLJII));
                sparkContext = sparkContext2;
            } else {
                sparkContext = null;
            }
            C189200o6.m2constructorimpl(sparkContext);
            r24 = str9;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            r24 = str9;
        }
        sparkContext2.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0gyG
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJJJI() {
                return !C444960Hcc.LIZJ(context) ? new C1725480v0E(R.anim.g6, R.anim.ed) : new C1725480v0E(R.anim.g5, R.anim.ed);
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJLI() {
                return !C444960Hcc.LIZJ(context) ? new C1725480v0E(0, R.anim.g8) : new C1725480v0E(0, R.anim.g7);
            }
        });
        sparkContext2.LJJJJZI(new C1209100hZM(function0, 18));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext2).LIZIZ();
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        String collectInfo2 = poiDetailResponse.getCollectInfo();
        PoiListApi.PoiReviewEntrance poiReviewEntrance = poiDetailResponse.getPoiReviewEntrance();
        if (poiReviewEntrance != null) {
            str12 = poiReviewEntrance.eligibleExtraInfo;
        }
        C1191160h6Q.LJIJJ(c1191160h6Q, str2, str4, str5, str6, str7, null, "poi_detail", str8, str, collectInfo2, null, null, null, null, null, r24, C2365509Or.LIZIZ(str12), pageFinder, 63488);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C1186070gyD r12, final android.content.Context r13, android.view.View r14, java.lang.String r15, boolean r16, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, X.C1185410gx9 r25, java.lang.String r26, java.lang.Object r27, boolean r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1186070gyD.LIZJ(X.0gyD, android.content.Context, android.view.View, java.lang.String, boolean, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0gx9, java.lang.String, java.lang.Object, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
