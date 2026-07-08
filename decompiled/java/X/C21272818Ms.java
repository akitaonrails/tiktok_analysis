package X;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Ms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21272818Ms extends AbstractC1351650lHH {
    public final List<AnchorProductInfoModel> LIZJ;
    public final boolean LIZLLL;
    public final Map<String, Object> LJ;
    public final String LJFF;
    public final AwemePruningModel LJI;
    public final AnchorCommonStruct LJII;
    public final C2252321DDq LJIIIIZZ;
    public Map<String, Object> LJIIIZ;
    public List<SkuItem> LJIIJ;

    @Override // X.AbstractC1351650lHH
    public final void LIZJ() {
    }

    @Override // X.AbstractC1351650lHH
    public final void LJ() {
    }

    @Override // X.AbstractC1351650lHH
    public final C1351660lHI LIZ() {
        AnchorProductInfo anchorProductInfo;
        C21272618Mq c21272618Mq = C21272618Mq.LIZ;
        Aweme aweme = this.LIZ;
        c21272618Mq.getClass();
        int iLJIILL = C21272618Mq.LJIILL(C21272618Mq.LJIILLIIL(aweme));
        if (!this.LIZLLL) {
            return new C1351660lHI(null, Integer.valueOf(iLJIILL), 1);
        }
        this.LJ.put("is_head_image", 0);
        if (C21272618Mq.LJIJJLI(this.LIZ)) {
            this.LJ.put("is_head_image", 1);
            AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(this.LIZJ);
            if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
                AnchorBizUtils.LIZ.getClass();
                String strLJJJJJ = AnchorBizUtils.LJJJJJ(anchorProductInfo, 1);
                if (C770702zh.LIZ(strLJJJJJ)) {
                    return new C1351660lHI(strLJJJJJ, null, 2);
                }
            }
        }
        return new C1351660lHI(null, Integer.valueOf(iLJIILL), 1);
    }

    @Override // X.AbstractC1351650lHH
    public final C2252321DDq LIZIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1351650lHH
    public final void LJFF(Fragment fragment) {
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        String str;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z;
        AnchorProductInfoModel anchorProductInfoModel;
        AnchorProductInfo anchorProductInfo;
        Long l;
        String string;
        boolean z2;
        String name;
        String name2 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IAnchorDependencyService.class.getName();
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        IAnchorDependencyService iAnchorDependencyService = (IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        if (iAnchorDependencyService.getAnchorMobRefactorExpEnable()) {
            str = "comment_top_anchor";
        } else {
            str = "comment_anchor";
        }
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        boolean z3 = !this.LIZLLL;
        String str2 = this.LIZIZ;
        Aweme aweme = this.LIZ;
        List<AnchorProductInfoModel> list = this.LIZJ;
        c21271918Mj.getClass();
        C2344009Gk c2344009GkLJJI = C21271918Mj.LJJI(z3, str2, aweme, list, str);
        if (iAnchorDependencyService.getAnchorMobRefactorExpEnable()) {
            JSONObject jSONObjectMobParamsParserGetJSONObject = iAnchorDependencyService.mobParamsParserGetJSONObject(iAnchorDependencyService.appendCommentLogParams(c2344009GkLJJI, this.LIZ, this.LJII, !this.LIZLLL));
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LJI("multi_anchor_entrance_show", jSONObjectMobParamsParserGetJSONObject);
        }
        String requestId = this.LIZ.getRequestId();
        String str3 = "";
        if (requestId == null) {
            requestId = "";
        }
        String aid = this.LIZ.getAid();
        if (aid == null) {
            aid = "";
        }
        List<AnchorProductInfoModel> list2 = this.LIZJ;
        if (list2 != null && (anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(list2)) != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null && (l = anchorProductInfo.productId) != null && (string = l.toString()) != null) {
            str3 = string;
        }
        Map<String, Object> mapLJI = LJI(fragment);
        mapLJI.putAll(this.LJ);
        C21271918Mj.LJIIL(true, this.LIZLLL, C03RE.LIZ(requestId, aid, str3), this.LIZIZ, this.LJIIJ, this.LIZJ, this.LIZ, mapLJI);
        Map<String, Object> map = this.LJIIIZ;
        if (map != null && !map.isEmpty()) {
            C21271918Mj.LJJIJIIJI(this.LJIIIZ);
        }
        if (this.LIZ.isAd()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = IAdDependencyService.class.getName();
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    name2 = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("comment_ad", "othershow", this.LIZ.getAwemeRawAd());
            abstractC1056160dagOnAdEvent.LIZ.put("refer", "comment_panel_top_ad");
            abstractC1056160dagOnAdEvent.LIZIZ();
        }
    }

    public final Map<String, Object> LJI(Fragment fragment) {
        String str;
        String string;
        if (this.LIZLLL) {
            str = "c20736.d0";
        } else {
            str = "c5134.d0";
        }
        HashMap map = new HashMap();
        if (fragment != null) {
            for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str, PageFinder.via(fragment), null, 4, null).entrySet()) {
                Object value = entry.getValue();
                if (value != null && (string = value.toString()) != null) {
                    map.put(entry.getKey(), string);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            linkedHashMap.put(entry2.getKey(), entry2.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21272818Ms(com.ss.android.ugc.aweme.feed.model.Aweme r9, java.lang.String r10) {
        /*
            r8 = this;
            r8.<init>(r9, r10)
            r5 = 35
            r4 = 0
            r7 = 1
            if (r9 == 0) goto Lb7
            java.util.List r0 = r9.getAnchors()
            if (r0 == 0) goto Lb7
            java.util.Iterator r3 = r0.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lb4
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r1
            int r0 = r1.getType()
            if (r0 != r5) goto L13
            java.lang.String r0 = r1.getExtra()
            int r0 = r0.length()
            if (r0 <= 0) goto L13
        L30:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r2 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r2
            if (r2 == 0) goto Lb7
            java.util.List r6 = X.C21272218Mm.LJIILIIL(r2)
            if (r6 == 0) goto Lb7
        L3a:
            r8.LIZJ = r6
            int r0 = r6.size()
            if (r0 != r7) goto Lb2
            r0 = 1
        L43:
            r8.LIZLLL = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r8.LJ = r0
            com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel r0 = X.C21272218Mm.LJJIJIL(r9, r10)
            r8.LJI = r0
            java.lang.String r3 = ""
            X.1DDq r0 = X.C1BNE.LIZ(r3)
            r8.LJIIIIZZ = r0
            java.lang.String r2 = r9.getRequestId()
            if (r2 != 0) goto L61
            r2 = r3
        L61:
            java.lang.String r1 = r9.getAid()
            if (r1 != 0) goto L68
            r1 = r3
        L68:
            java.lang.Object r0 = X.C13LP.LJJJLL(r6)
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r0 = (com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel) r0
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r0.extraData
            if (r0 == 0) goto L7f
            java.lang.Long r0 = r0.productId
            if (r0 == 0) goto L7f
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L7f
            r3 = r0
        L7f:
            java.lang.String r0 = X.C03RE.LIZ(r2, r1, r3)
            r8.LJFF = r0
            java.util.List r0 = r9.getAnchors()
            if (r0 == 0) goto Laf
            java.util.Iterator r3 = r0.iterator()
        L8f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r1
            int r0 = r1.getType()
            if (r0 != r5) goto L8f
            java.lang.String r0 = r1.getExtra()
            int r0 = r0.length()
            if (r0 <= 0) goto L8f
            r4 = r2
        Lad:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r4 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r4
        Laf:
            r8.LJII = r4
            return
        Lb2:
            r0 = 0
            goto L43
        Lb4:
            r2 = r4
            goto L30
        Lb7:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272818Ms.<init>(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    @Override // X.AbstractC1351650lHH
    public final void LIZLLL(Fragment fragment, C19EG c19eg) {
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        String str;
        String str2;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z;
        boolean z2;
        String name;
        String str3;
        HashMap<String, String> map;
        Aweme aweme;
        String requestId;
        String str4;
        Integer num;
        String name2 = null;
        if (this.LIZLLL) {
            Map<String, Object> mapLJI = LJI(fragment);
            mapLJI.putAll(this.LJ);
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            boolean z3 = this.LIZLLL;
            String str5 = this.LJFF;
            String str6 = this.LIZIZ;
            List<SkuItem> list = this.LJIIJ;
            List<AnchorProductInfoModel> list2 = this.LIZJ;
            Aweme aweme2 = this.LIZ;
            c21271918Mj.getClass();
            C21271918Mj.LJIIL(false, z3, str5, str6, list, list2, aweme2, mapLJI);
            AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(this.LIZJ);
            if (anchorProductInfoModel != null) {
                AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                String strValueOf = String.valueOf(anchorProductInfoModel.extraData.productId);
                AwemePruningModel awemePruningModel = this.LJI;
                if (awemePruningModel != null) {
                    str3 = awemePruningModel.aid;
                    map = awemePruningModel.mMobParams;
                } else {
                    str3 = null;
                    map = null;
                }
                anchorBizUtils.getClass();
                String strLJJ = AnchorBizUtils.LJJ(strValueOf, str3, map);
                if (C770702zh.LIZ(anchorProductInfoModel.extraData.schema)) {
                    Integer num2 = anchorProductInfoModel.type;
                    if (num2 != null && num2.intValue() == 33 && (num = anchorProductInfoModel.extraData.platform) != null && num.intValue() == 100) {
                        C21272218Mm.LJJIJIIJI(c19eg, anchorProductInfoModel, this.LJI, this.LIZIZ, "video_comment_single_anchor", strLJJ, C1697810uHb.LJIILJJIL(anchorProductInfoModel));
                    } else {
                        String strLJJIIJ = C21272218Mm.LJJIIJ(anchorProductInfoModel, this.LJI, this.LIZIZ, "video_comment_single_anchor", strLJJ, C1697810uHb.LJIILJJIL(anchorProductInfoModel));
                        HashMap<String, String> mobParams = this.LIZ.getMobParams();
                        String str7 = "";
                        if ((mobParams == null || (requestId = mobParams.get("request_id")) == null) && ((aweme = this.LIZ) == null || (requestId = aweme.getRequestId()) == null)) {
                            requestId = "";
                        }
                        if (mobParams != null && (str4 = mobParams.get("track_id")) != null) {
                            str7 = str4;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("video_anchor", true);
                        C786410Ut5.LJJJI("title", String.valueOf(anchorProductInfoModel.extraData.title), bundle);
                        C786410Ut5.LJJJI("price", String.valueOf(anchorProductInfoModel.extraData.formatPrice), bundle);
                        C786410Ut5.LJJJI("cover", String.valueOf(anchorProductInfoModel.extraData.coverUrl), bundle);
                        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, String.valueOf(anchorProductInfoModel.extraData.productId), bundle);
                        if (str7.length() > 0) {
                            C786410Ut5.LJJJI("track_id", str7, bundle);
                        } else {
                            C786410Ut5.LJJJI("track_id", this.LJFF, bundle);
                        }
                        if (requestId.length() > 0) {
                            C786410Ut5.LJJJI("request_id", requestId, bundle);
                        }
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, C18LA.LJI(fragment, strLJJIIJ, "c20736.d0", null));
                        smartRouteBuildRoute.withParam(bundle);
                        smartRouteBuildRoute.open();
                    }
                } else {
                    AnchorBizUtils.LJLIIIL(c19eg, this.LIZ, anchorProductInfoModel);
                }
            }
        } else {
            Map<String, Object> mapLJI2 = LJI(fragment);
            mapLJI2.putAll(this.LJ);
            C21271918Mj c21271918Mj2 = C21271918Mj.LIZ;
            boolean z4 = this.LIZLLL;
            String str8 = this.LJFF;
            String str9 = this.LIZIZ;
            List<SkuItem> list3 = this.LJIIJ;
            List<AnchorProductInfoModel> list4 = this.LIZJ;
            Aweme aweme3 = this.LIZ;
            c21271918Mj2.getClass();
            C21271918Mj.LJIIL(false, z4, str8, str9, list3, list4, aweme3, mapLJI2);
            AwemePruningModel awemePruningModel2 = this.LJI;
            if (awemePruningModel2 != null) {
                awemePruningModel2.setStartClickTime(Long.valueOf(System.currentTimeMillis()));
            }
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(c19eg, "aweme://ec/anchor_product_list");
            smartRouteBuildRoute2.withParam("commonVideoAnchorModel", this.LJI);
            smartRouteBuildRoute2.withParam("source_btm_token", C18LA.LIZLLL(fragment, "c5134.d0", null));
            smartRouteBuildRoute2.open();
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IAnchorDependencyService.class.getName();
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        IAnchorDependencyService iAnchorDependencyService = (IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        if (iAnchorDependencyService.getAnchorMobRefactorExpEnable()) {
            str = "comment_top_anchor";
        } else {
            str = "comment_anchor";
        }
        C21271918Mj c21271918Mj3 = C21271918Mj.LIZ;
        boolean z5 = this.LIZLLL;
        boolean z6 = !z5;
        String str10 = this.LIZIZ;
        Aweme aweme4 = this.LIZ;
        List<AnchorProductInfoModel> list5 = this.LIZJ;
        if (z5) {
            str2 = "pdp";
        } else {
            str2 = "comment_panel";
        }
        C2344009Gk c2344009GkLJ = c21271918Mj3.LJ(z6, str10, aweme4, list5, str, str2);
        if (this.LIZ.isAd()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = IAdDependencyService.class.getName();
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    name2 = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("comment_ad", "click", this.LIZ.getAwemeRawAd());
            abstractC1056160dagOnAdEvent.LIZ.put("refer", "comment_panel_top_ad");
            abstractC1056160dagOnAdEvent.LIZIZ();
        }
        if (iAnchorDependencyService.getAnchorMobRefactorExpEnable()) {
            JSONObject jSONObjectMobParamsParserGetJSONObject = iAnchorDependencyService.mobParamsParserGetJSONObject(iAnchorDependencyService.appendCommentLogParams(c2344009GkLJ, this.LIZ, this.LJII, false));
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LJI("multi_anchor_entrance_click", jSONObjectMobParamsParserGetJSONObject);
        }
    }
}
