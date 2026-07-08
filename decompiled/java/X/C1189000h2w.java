package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189000h2w {
    public static final C1189000h2w LIZ = new C1189000h2w();

    public static View LIZ(Context context, EnumC993200bx8 enumC993200bx8, Aweme aweme, String str, String str2) throws JSONException {
        String componentKey;
        String str3;
        Integer numValueOf;
        List<String> list;
        int i;
        String logExtra;
        String ttclid;
        String str4;
        String str5;
        String str6;
        String poiInfo;
        AwemeRawAd awemeRawAd;
        AnchorCommonStruct anchorCommonStruct;
        AnchorCommonStruct anchorCommonStruct2;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = null;
        String ttlsAnchorType = null;
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = null;
        if (aweme == null) {
            return null;
        }
        int i2 = C993210bx9.LIZ[enumC993200bx8.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                if (aweme.getAnchors() != null && aweme.getAnchors().size() >= 2) {
                    List<AnchorCommonStruct> anchors = aweme.getAnchors();
                    if (anchors != null && (anchorCommonStruct2 = (AnchorCommonStruct) C13LP.LJJJJZI(anchors)) != null) {
                        componentKey = anchorCommonStruct2.getComponentKey();
                    } else {
                        componentKey = null;
                    }
                    if (Intrinsics.LJFF(componentKey, "anchor_poi")) {
                        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
                        if (poiDataStruct != null) {
                            str3 = poiDataStruct.collectInfo;
                        } else {
                            str3 = null;
                        }
                        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
                        if (anchors2 != null) {
                            numValueOf = Integer.valueOf(anchors2.size());
                        } else {
                            numValueOf = null;
                        }
                        PoiDataStruct poiDataStruct2 = aweme.getPoiDataStruct();
                        if (poiDataStruct2 != null && (list = poiDataStruct2.productIds) != null) {
                            int size = list.size();
                            List<AnchorCommonStruct> anchors3 = aweme.getAnchors();
                            if (anchors3 != null && anchors3.size() > 1) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            C1188720h2U c1188720h2U = C1188720h2U.LIZ;
                            List<AnchorCommonStruct> anchors4 = aweme.getAnchors();
                            if (anchors4 != null && (anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLL(anchors4)) != null) {
                                logExtra = anchorCommonStruct.getLogExtra();
                            } else {
                                logExtra = null;
                            }
                            c1188720h2U.getClass();
                            String strLIZ = C1188720h2U.LIZ(logExtra);
                            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                            if (awemeRawAd2 != null && awemeRawAd2.getEnableTtclidForPoi() == 1 && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                                ttclid = awemeRawAd.getTtclid();
                            } else {
                                ttclid = null;
                            }
                            PoiDataStruct poiDataStruct3 = aweme.getPoiDataStruct();
                            if (poiDataStruct3 != null) {
                                str4 = poiDataStruct3.extra;
                            } else {
                                str4 = null;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("data", str4);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("buildProductAnchorItemView jsonObject.toString=");
                            sbLIZ.append(jSONObject);
                            C2188811AlT.LIZIZ(sbLIZ);
                            SparkContext sparkContext = new SparkContext();
                            sparkContext.LJJLIIJ("aweme://roma_redirect/?spark_page=poi_shelf_anchor_product");
                            sparkContext.LJJJZ("roma_enable_with_param", "1");
                            sparkContext.LJJJZ("display_mode", EnumC1189020h2y.LYNXVIEW.getValue());
                            sparkContext.LJJJZ("variant", EnumC1188990h2v.CARD.getValue());
                            C1548420qOe.LIZIZ(sparkContext, "enter_from", str);
                            C1548420qOe.LIZIZ(sparkContext, "enter_method", str2);
                            C1548420qOe.LIZIZ(sparkContext, "initial_poi_enter_from", str);
                            C1548420qOe.LIZIZ(sparkContext, "initial_poi_enter_method", str2);
                            C1548420qOe.LIZIZ(sparkContext, "initial_poi_from_group_id", aweme.getGroupId());
                            PoiDataStruct poiDataStruct4 = aweme.getPoiDataStruct();
                            if (poiDataStruct4 != null) {
                                str5 = poiDataStruct4.poiId;
                            } else {
                                str5 = null;
                            }
                            C1548420qOe.LIZIZ(sparkContext, "initial_poi_id", str5);
                            PoiDataStruct poiDataStruct5 = aweme.getPoiDataStruct();
                            if (poiDataStruct5 != null) {
                                str6 = poiDataStruct5.poiId;
                            } else {
                                str6 = null;
                            }
                            C1548420qOe.LIZIZ(sparkContext, "poi_id", str6);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            PoiDataStruct poiDataStruct6 = aweme.getPoiDataStruct();
                            if (poiDataStruct6 != null) {
                                poiInfo = poiDataStruct6.parsePoiInfo();
                            } else {
                                poiInfo = null;
                            }
                            C1189060h32.LJJ("poi_info", poiInfo, linkedHashMap);
                            C1189060h32.LJJ("sub_poi_info", C1189060h32.LJIIJJI(str3, "sub_poi_info"), linkedHashMap);
                            C1189060h32.LJJ("service_suffix_content", C1189060h32.LJIIJJI(str3, "service_suffix_content"), linkedHashMap);
                            C1189060h32.LJJ("collect_info", str3, linkedHashMap);
                            C1189060h32.LJJ("anchor_number", String.valueOf(numValueOf), linkedHashMap);
                            PoiDataStruct poiDataStruct7 = aweme.getPoiDataStruct();
                            if (poiDataStruct7 != null) {
                                ttlsAnchorType = poiDataStruct7.parseTtlsAnchorType();
                            }
                            C1189060h32.LJJ("ttls_anchor_type", ttlsAnchorType, linkedHashMap);
                            C1189060h32.LJJ("ttls_anchor_product_cnt", String.valueOf(size), linkedHashMap);
                            C1189060h32.LJJ("multi_anchor", String.valueOf(i), linkedHashMap);
                            C1189060h32.LJJ("main_anchor_type", strLIZ, linkedHashMap);
                            C1189060h32.LJJ("request_id", aweme.getRequestId(), linkedHashMap);
                            C1189060h32.LJJ("ad_click_id", ttclid, linkedHashMap);
                            C1548420qOe.LIZIZ(sparkContext, "log_extra", C1189060h32.LJJIIJZLJL(linkedHashMap));
                            sparkContext.LJJJJZ(new C1077530e99(jSONObject, 5));
                            C1541950qED.LIZJ.getClass();
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
                            ViewGroup.LayoutParams layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getLayoutParams();
                            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || layoutParams == null) {
                                layoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                            }
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context);
                            if (numLIZJ != null) {
                                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.setBackgroundColor(numLIZJ.intValue());
                            }
                            C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, layoutParams);
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                        }
                        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                    }
                }
                return new C1188980h2u(context, aweme, str, str2, true);
            }
            throw new C1954807lC();
        }
        return new C1188980h2u(context, aweme, null, null, false);
    }
}
