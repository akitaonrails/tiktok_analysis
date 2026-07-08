package Y;

import X.C098200Yq;
import X.C1175120ggY;
import X.C1188720h2U;
import X.C1189060h32;
import X.C1196260hEe;
import X.C1196270hEf;
import X.C1227904rF;
import X.C13LE;
import X.C13LP;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1548420qOe;
import X.C189200o6;
import X.C18JG;
import X.C1909107dp;
import X.C1C7U;
import X.C2188811AlT;
import X.C2365509Or;
import X.C2371409Qy;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1196240hEc;
import X.InterfaceC1196250hEd;
import X.InterfaceC1542790qFZ;
import android.content.Context;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenData;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEvent;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS0S2300000_18 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        InterfaceC1196240hEc interfaceC1196240hEc = (InterfaceC1196240hEc) C1909107dp.LIZJ(InterfaceC1196240hEc.class, this.s0);
        interfaceC1196240hEc.setSessionId(((C1196260hEe) this.l2).LIZIZ);
        interfaceC1196240hEc.setPhase("data");
        interfaceC1196240hEc.setKey(this.s1);
        RavenData ravenData = (RavenData) this.l3;
        interfaceC1196240hEc.setTimestamp(ravenData != null ? Long.valueOf(ravenData.timestamp) : null);
        RavenData ravenData2 = (RavenData) this.l3;
        Object obj = ravenData2 != null ? ravenData2.data : null;
        interfaceC1196240hEc.setData(obj instanceof Map ? (Map) obj : null);
        try {
            ((CompletionBlock) this.l4).onSuccess(interfaceC1196240hEc, "data");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ$1() {
        InterfaceC1196250hEd interfaceC1196250hEd = (InterfaceC1196250hEd) C1909107dp.LIZJ(InterfaceC1196250hEd.class, this.s0);
        interfaceC1196250hEd.setSessionId(((C1196270hEf) this.l2).LIZIZ);
        interfaceC1196250hEd.setPhase("event");
        interfaceC1196250hEd.setEventName(this.s1);
        interfaceC1196250hEd.setTimestamp(Long.valueOf(((RavenEvent) this.l3).timestamp));
        Object obj = ((RavenEvent) this.l3).data;
        interfaceC1196250hEd.setData(obj instanceof Map ? (Map) obj : null);
        try {
            ((CompletionBlock) this.l4).onSuccess(interfaceC1196250hEd, "event");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ$2() {
        String str;
        List<PoiDetailApi.PoiDetailProductShelf> productShelves;
        PoiDetailApi.PoiDetailProductShelf poiDetailProductShelf;
        List<PoiDetailApi.PoiDetailProductModel> list;
        PoiDetailApi.PoiDetailProductModel poiDetailProductModel;
        PoiDataStruct poiDataStruct;
        List<String> list2;
        String strLJIL;
        n nVar;
        q qVarLJJIJIIJI;
        AwemeRawAd awemeRawAd;
        PoiDataStruct poiDataStruct2 = ((Aweme) this.l2).getPoiDataStruct();
        if (poiDataStruct2 == null || (str = poiDataStruct2.extra) == null) {
            return;
        }
        C1188720h2U.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C1227904rF.LIZ.getClass();
            PoiDetailApi.PoiProductShelvesResponse poiProductShelvesResponse = (PoiDetailApi.PoiProductShelvesResponse) C1227904rF.LIZLLL().LJII(str, PoiDetailApi.PoiProductShelvesResponse.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deserializePoiProductShelvesResponse cost=");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ.append(", result=");
            sbLIZ.append(poiProductShelvesResponse);
            C2188811AlT.LIZIZ(sbLIZ);
            if (poiProductShelvesResponse == null || (productShelves = poiProductShelvesResponse.getProductShelves()) == null || (poiDetailProductShelf = (PoiDetailApi.PoiDetailProductShelf) C13LP.LJJJJZI(productShelves)) == null || (list = poiDetailProductShelf.products) == null || (poiDetailProductModel = (PoiDetailApi.PoiDetailProductModel) C13LP.LJJJJZI(list)) == null || (poiDataStruct = ((Aweme) this.l2).getPoiDataStruct()) == null || (list2 = poiDataStruct.productIds) == null) {
                return;
            }
            int size = list2.size();
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context = (Context) this.l3;
            SparkContext sparkContext = new SparkContext();
            String str2 = this.s0;
            String str3 = this.s1;
            Aweme aweme = (Aweme) this.l2;
            final Context context2 = (Context) this.l3;
            PageFinder pageFinder = (PageFinder) this.l4;
            String strLIZIZ = TiktokPoiLynxSettings.LIZIZ("poi_product_detail");
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            sparkContext.LJJLIIJ(strLIZIZ);
            sparkContext.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0h31
                @Override // X.InterfaceC1163130gND
                public final void release() {
                }

                @Override // X.InterfaceC1542790qFZ
                public final C1725480v0E LJJJJI() {
                    return !C444960Hcc.LIZJ(context2) ? new C1725480v0E(R.anim.g6, R.anim.ed) : new C1725480v0E(R.anim.g5, R.anim.ed);
                }

                @Override // X.InterfaceC1542790qFZ
                public final C1725480v0E LJJLI() {
                    return !C444960Hcc.LIZJ(context2) ? new C1725480v0E(0, R.anim.g8) : new C1725480v0E(0, R.anim.g7);
                }
            });
            sparkContext.LJJJZ("enter_from", str2);
            sparkContext.LJJJZ("enter_method", str3);
            sparkContext.LJJJZ("initial_poi_enter_from", str2);
            sparkContext.LJJJZ("initial_poi_enter_method", str3);
            C1548420qOe.LIZIZ(sparkContext, "initial_poi_from_group_id", aweme != null ? aweme.getGroupId() : null);
            PoiDataStruct poiDataStruct3 = aweme.getPoiDataStruct();
            C1548420qOe.LIZIZ(sparkContext, "initial_poi_id", poiDataStruct3 != null ? poiDataStruct3.poiId : null);
            C1548420qOe.LIZIZ(sparkContext, "track_info", poiDetailProductModel.getTrackInfo());
            PoiDetailApi.PriceInformation priceInformation = poiDetailProductModel.getPriceInformation();
            C1548420qOe.LIZIZ(sparkContext, "discount", Double.valueOf(C1175120ggY.LIZ(priceInformation != null ? priceInformation.discountNum : null)));
            C1548420qOe.LIZIZ(sparkContext, "compliance_theme", poiDetailProductModel.getComplianceTheme());
            C1548420qOe.LIZIZ(sparkContext, "product_type", poiDetailProductModel.getProductType());
            PoiDataStruct poiDataStruct4 = aweme.getPoiDataStruct();
            C1548420qOe.LIZIZ(sparkContext, "poi_id", poiDataStruct4 != null ? poiDataStruct4.poiId : null);
            PoiDataStruct poiDataStruct5 = aweme.getPoiDataStruct();
            C1548420qOe.LIZIZ(sparkContext, "collect_info", poiDataStruct5 != null ? poiDataStruct5.collectInfo : null);
            C1548420qOe.LIZIZ(sparkContext, "product_id", poiDetailProductModel.getProductId());
            LogPbBean logPbBean = aweme.getLogPbBean();
            C1548420qOe.LIZIZ(sparkContext, "log_id", logPbBean != null ? logPbBean.getImprId() : null);
            C1548420qOe.LIZIZ(sparkContext, "shelf_type", "product");
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            C1548420qOe.LIZIZ(sparkContext, "ad_click_id", (awemeRawAd2 == null || awemeRawAd2.getEnableTtclidForPoi() != 1 || (awemeRawAd = aweme.getAwemeRawAd()) == null) ? null : awemeRawAd.getTtclid());
            if (C960203pA.LIZIZ(context2)) {
                sparkContext.LJJJZ("navigation_bar_bg_color", "000000");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            PoiDataStruct poiDataStruct6 = aweme.getPoiDataStruct();
            C1189060h32.LJJ("ttls_anchor_type", poiDataStruct6 != null ? poiDataStruct6.parseTtlsAnchorType() : null, linkedHashMap);
            C1189060h32.LJJ("ttls_anchor_product_cnt", String.valueOf(size), linkedHashMap);
            C1189060h32.LJJ("request_id", aweme.getRequestId(), linkedHashMap);
            C1548420qOe.LIZIZ(sparkContext, "log_extra", C1189060h32.LJJIIJZLJL(linkedHashMap));
            BcmParams bcmParams = new BcmParams();
            String productId = poiDetailProductModel.getProductId();
            if (productId == null) {
                productId = "";
            }
            bcmParams.put("product_id", productId);
            try {
                try {
                    Object objLJIIIIZZ = C2365509Or.LIZ().LJIIIIZZ(poiDetailProductModel.getTrackInfo(), C2371409Qy.LIZJ(C13LE.LJII(n.class)));
                    if (!(objLJIIIIZZ instanceof n)) {
                        objLJIIIIZZ = null;
                    }
                    nVar = (n) objLJIIIIZZ;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (nVar == null || (qVarLJJIJIIJI = nVar.LJJIJIIJI("merchant_ids")) == null || (strLJIL = qVarLJJIJIIJI.LJIL()) == null) {
                    strLJIL = "";
                }
                bcmParams.put("merchant_id", strLJIL);
                C189200o6.m2constructorimpl(bcmParams);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            String strLIZ = C18JG.LIZ("c1480.d0", pageFinder, bcmParams);
            sparkContext.LJJJZ("source_btm_token", strLIZ != null ? strLIZ : "");
            c1537900q7g.getClass();
            C786410Ut5.LJJZZIII(C1188720h2U.LIZIZ, new ARunnableS118S0100000_18(new C1541950qED(context, sparkContext), 86));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("something was wrong with deserializePoiProductShelvesResponse, e=");
            sbLIZ2.append(e2.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public static final void run$0(ARunnableS0S2300000_18 aRunnableS0S2300000_18) {
        boolean zLIZ;
        C1C7U.LIZ("RavenSubscribeDataMethodIDL@4ee6.handle$dataCallback$1$onDataUpdate$1");
        try {
            aRunnableS0S2300000_18.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RavenSubscribeDataMethodIDL@4ee6.handle$dataCallback$1$onDataUpdate$1");
    }

    public static final void run$1(ARunnableS0S2300000_18 aRunnableS0S2300000_18) {
        boolean zLIZ;
        C1C7U.LIZ("RavenSubscribeEventMethodIDL@c85e.handle$subscriber$1$onReceiveEvent$1");
        try {
            aRunnableS0S2300000_18.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RavenSubscribeEventMethodIDL@c85e.handle$subscriber$1$onReceiveEvent$1");
    }

    public static final void run$2(ARunnableS0S2300000_18 aRunnableS0S2300000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiAnchorPageOpenHelper@fbe6.openProductDetailPage$1");
        try {
            aRunnableS0S2300000_18.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiAnchorPageOpenHelper@fbe6.openProductDetailPage$1");
    }

    public ARunnableS0S2300000_18(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj3;
        this.l3 = obj;
        this.s0 = str;
        this.s1 = str2;
        this.l4 = obj2;
    }
}
