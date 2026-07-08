package X;

import Y.ARunnableS118S0100000_18;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h2U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188720h2U {
    public static final C1188720h2U LIZ = new C1188720h2U();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    public static String LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String strOptString = "";
        if (z) {
            return "";
        }
        try {
            strOptString = new JSONObject(str).optString("anchor_type", "");
            return strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strOptString;
        }
    }

    public static void LIZJ(final Context context, final Aweme aweme, final EnumC1189020h2y enumC1189020h2y, final EnumC1188990h2v enumC1188990h2v, final String str, final String str2) {
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0h2x
            public final void LIZ() {
                List<String> list;
                AwemeRawAd awemeRawAd;
                AnchorCommonStruct anchorCommonStruct;
                EnumC1188920h2o anchorNavigateTarget;
                PoiDataStruct poiDataStruct;
                String str3;
                C1188720h2U c1188720h2U = C1188720h2U.LIZ;
                Aweme aweme2 = aweme;
                c1188720h2U.getClass();
                PoiDataStruct poiDataStruct2 = aweme2.getPoiDataStruct();
                String ttclid = null;
                if (poiDataStruct2 != null && (anchorNavigateTarget = poiDataStruct2.getAnchorNavigateTarget(false)) != null && (poiDataStruct = aweme2.getPoiDataStruct()) != null && (str3 = poiDataStruct.extra) != null && (anchorNavigateTarget == EnumC1188920h2o.PRODUCT_SHELVES_POPUP || anchorNavigateTarget == EnumC1188920h2o.PRODUCT_SHELVES_FULL_SCREEN)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("anchor_shelf_");
                    sbLIZ.append(aweme2.getAid());
                    C1956707lV.LIZ(str3, C2188811AlT.LIZIZ(sbLIZ), false);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("saveData key=anchor_shelf_");
                    sbLIZ2.append(aweme2.getAid());
                    sbLIZ2.append(",extra=");
                    sbLIZ2.append(str3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("openPoiShelfAnchorProductPage displayMode=");
                sbLIZ3.append(enumC1189020h2y.getValue());
                sbLIZ3.append(", variant=");
                sbLIZ3.append(enumC1188990h2v.getValue());
                C2188811AlT.LIZIZ(sbLIZ3);
                PoiDataStruct poiDataStruct3 = aweme.getPoiDataStruct();
                if (poiDataStruct3 == null || (list = poiDataStruct3.productIds) == null) {
                    return;
                }
                int size = list.size();
                int iLJFF = C418440Gaw.LJFF((float) (((double) C497820Jfg.LIZ(context)) * (size > 2 ? 0.73d : 0.45d)), context);
                String aid = aweme.getAid();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("anchor_shelf_");
                sbLIZ4.append(aid);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                PoiDataStruct poiDataStruct4 = aweme.getPoiDataStruct();
                String str4 = poiDataStruct4 != null ? poiDataStruct4.collectInfo : null;
                List<AnchorCommonStruct> anchors = aweme.getAnchors();
                Integer numValueOf = anchors != null ? Integer.valueOf(anchors.size()) : null;
                List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
                int i = (anchors2 == null || anchors2.size() <= 1) ? 0 : 1;
                List<AnchorCommonStruct> anchors3 = aweme.getAnchors();
                String strLIZ = C1188720h2U.LIZ((anchors3 == null || (anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLL(anchors3)) == null) ? null : anchorCommonStruct.getLogExtra());
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null && awemeRawAd2.getEnableTtclidForPoi() == 1 && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                    ttclid = awemeRawAd.getTtclid();
                }
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                Context context2 = context;
                SparkContext sparkContext = new SparkContext();
                EnumC1189020h2y enumC1189020h2y2 = enumC1189020h2y;
                EnumC1188990h2v enumC1188990h2v2 = enumC1188990h2v;
                String str5 = str;
                String str6 = str2;
                Aweme aweme3 = aweme;
                final Context context3 = context;
                sparkContext.LJJLIIJ("aweme://roma_redirect/?spark_page=poi_shelf_anchor_product");
                sparkContext.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0h2z
                    @Override // X.InterfaceC1163130gND
                    public final void release() {
                    }

                    @Override // X.InterfaceC1542790qFZ
                    public final C1725480v0E LJJJJI() {
                        return !C444960Hcc.LIZJ(context3) ? new C1725480v0E(R.anim.g6, R.anim.ed) : new C1725480v0E(R.anim.g5, R.anim.ed);
                    }

                    @Override // X.InterfaceC1542790qFZ
                    public final C1725480v0E LJJLI() {
                        return !C444960Hcc.LIZJ(context3) ? new C1725480v0E(0, R.anim.g8) : new C1725480v0E(0, R.anim.g7);
                    }
                });
                sparkContext.LJJJZ("roma_enable_with_param", "1");
                sparkContext.LJJJZ("display_mode", enumC1189020h2y2.getValue());
                sparkContext.LJJJZ("variant", enumC1188990h2v2.getValue());
                sparkContext.LJJJZ("enter_from", str5);
                sparkContext.LJJJZ("enter_method", str6);
                sparkContext.LJJJZ("initial_poi_enter_from", str5);
                sparkContext.LJJJZ("initial_poi_enter_method", str6);
                C1548420qOe.LIZIZ(sparkContext, "initial_poi_from_group_id", aweme3 != null ? aweme3.getGroupId() : null);
                PoiDataStruct poiDataStruct5 = aweme3.getPoiDataStruct();
                C1548420qOe.LIZIZ(sparkContext, "initial_poi_id", poiDataStruct5 != null ? poiDataStruct5.poiId : null);
                sparkContext.LJJJZ("cache_key", strLIZIZ);
                sparkContext.LJJJLZIJ(iLJFF, "height");
                PoiDataStruct poiDataStruct6 = aweme3.getPoiDataStruct();
                C1548420qOe.LIZIZ(sparkContext, "poi_id", poiDataStruct6 != null ? poiDataStruct6.poiId : null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                PoiDataStruct poiDataStruct7 = aweme3.getPoiDataStruct();
                C1189060h32.LJJ("poi_info", poiDataStruct7 != null ? poiDataStruct7.parsePoiInfo() : null, linkedHashMap);
                C1189060h32.LJJ("sub_poi_info", C1189060h32.LJIIJJI(str4, "sub_poi_info"), linkedHashMap);
                C1189060h32.LJJ("service_suffix_content", C1189060h32.LJIIJJI(str4, "service_suffix_content"), linkedHashMap);
                C1189060h32.LJJ("collect_info", str4, linkedHashMap);
                C1189060h32.LJJ("anchor_number", String.valueOf(numValueOf), linkedHashMap);
                PoiDataStruct poiDataStruct8 = aweme3.getPoiDataStruct();
                C1189060h32.LJJ("ttls_anchor_type", poiDataStruct8 != null ? poiDataStruct8.parseTtlsAnchorType() : null, linkedHashMap);
                C1189060h32.LJJ("ttls_anchor_product_cnt", String.valueOf(size), linkedHashMap);
                C1189060h32.LJJ("multi_anchor", String.valueOf(i), linkedHashMap);
                C1189060h32.LJJ("main_anchor_type", strLIZ, linkedHashMap);
                C1189060h32.LJJ("request_id", aweme3.getRequestId(), linkedHashMap);
                C1189060h32.LJJ("ad_click_id", ttclid, linkedHashMap);
                C1548420qOe.LIZIZ(sparkContext, "log_extra", C1189060h32.LJJIIJZLJL(linkedHashMap));
                c1537900q7g.getClass();
                C786410Ut5.LJJZZIII(C1188720h2U.LIZIZ, new ARunnableS118S0100000_18(new C1541950qED(context2, sparkContext), 30));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PoiAnchorPageOpenHelper@fbe6.openPoiShelfAnchorProductPage$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PoiAnchorPageOpenHelper@fbe6.openPoiShelfAnchorProductPage$1");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r14, java.lang.String r15, com.ss.android.ugc.aweme.feed.model.Aweme r16, X.C1188440h22 r17, com.bytedance.android.btm.api.model.PageFinder r18, java.lang.String r19, java.lang.String r20, java.lang.Boolean r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.Integer r26, boolean r27, java.lang.String r28, boolean r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1188720h2U.LIZIZ(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, X.0h22, com.bytedance.android.btm.api.model.PageFinder, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, java.lang.String, boolean, java.lang.String):void");
    }
}
