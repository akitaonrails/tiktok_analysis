package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPdpMediaWindowInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PdpViewModelDelegate;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.TrackParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpCreatorVideoSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vrz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758810vrz {
    public final Context LIZ;
    public final InterfaceC665370Q7z LIZIZ;
    public final LifecycleOwner LIZJ;
    public C1757630vq5 LIZLLL;
    public C1766620w4a LJ;
    public SeaPdpMediaWindowInfo LJFF;
    public Aweme LJI;
    public final TrackParamsContext LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public int LJIIJ;
    public final String LJIIJJI;
    public Map<String, ? extends Object> LJIIL;
    public boolean LJIILIIL;
    public final C1758820vs0 LJIILJJIL;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0vs0] */
    public C1758810vrz(Context context, InterfaceC665370Q7z interfaceC665370Q7z, SeaPdpFragment seaPdpFragment) {
        Object ability;
        this.LIZ = context;
        this.LIZIZ = interfaceC665370Q7z;
        this.LIZJ = seaPdpFragment;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7z, SeaPdpFragmentScope.class);
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(TrackParamsContext.class);
        } else {
            ability = null;
        }
        this.LJII = (TrackParamsContext) (ability instanceof TrackParamsContext ? ability : null);
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1271));
        this.LJIIIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1270));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pdp_window_video_scene_");
        sbLIZ.append(interfaceC665370Q7z.hashCode());
        this.LJIIJJI = C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIL = C2097608Jq.LJ();
        this.LJIILJJIL = new InterfaceC1757740vqG() { // from class: X.0vs0
            @Override // X.InterfaceC1757740vqG
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1757740vqG
            public final void LIZ() {
                this.LIZ.LIZLLL = null;
            }

            @Override // X.InterfaceC1757740vqG
            public final void LIZJ() {
                C1766620w4a c1766620w4a = this.LIZ.LJ;
                if (c1766620w4a != null) {
                    if (C1766620w4a.LLLJIL) {
                        c1766620w4a.LJIJJLI("playMedia");
                    }
                    c1766620w4a.LLLFFI = true;
                    c1766620w4a.LIZ(null);
                }
            }

            @Override // X.InterfaceC1757740vqG
            public final void LIZLLL() {
                IPdpStarter.PdpEnterParam pdpEnterParamCopy;
                Object c098200Yq;
                String str;
                Map<String, Object> map;
                SeaPdpViewModel seaPdpViewModel;
                IPdpStarter.PdpEnterParam pdpEnterParam;
                C1758810vrz c1758810vrz = this.LIZ;
                Aweme aweme = c1758810vrz.LJI;
                if (aweme != null) {
                    c1758810vrz.LJIILIIL = true;
                    PdpViewModelDelegate pdpViewModelDelegate = (PdpViewModelDelegate) c1758810vrz.LJIIIIZZ.getValue();
                    if (pdpViewModelDelegate == null || (seaPdpViewModel = pdpViewModelDelegate.LL) == null || (pdpEnterParam = seaPdpViewModel.LLIZ) == null || (pdpEnterParamCopy = pdpEnterParam.copy(pdpEnterParam.requestParams, pdpEnterParam.orderRequestParams, pdpEnterParam.trackParams, pdpEnterParam.pipeParams, pdpEnterParam.visitReportParams, pdpEnterParam.fullScreen, pdpEnterParam.checkedSkuIds, pdpEnterParam.expandHeight, pdpEnterParam.collapsedHeight, pdpEnterParam.collapsible, pdpEnterParam.playerControl, pdpEnterParam.isPromotionPage, pdpEnterParam.productEnterContext, pdpEnterParam.pdpCacheKey, pdpEnterParam.pdpPreParam, pdpEnterParam.preTrackNodeId, pdpEnterParam.awemeId, pdpEnterParam.clickFrom, pdpEnterParam.bizType, pdpEnterParam.enterViewName, pdpEnterParam.ocpContext, pdpEnterParam.ocpFlag, pdpEnterParam.ocpOrderId, pdpEnterParam.selectedAddressId, pdpEnterParam.btmToken, pdpEnterParam.route, pdpEnterParam.schemaChainKey, pdpEnterParam.autoOpenSku, pdpEnterParam.autoOpenSkuPanelClickFrom, pdpEnterParam.containerParams, pdpEnterParam.isFromPdpAddCartAfterToastEntrance, pdpEnterParam.autoAddToCart, pdpEnterParam.pdpPreviousPageId, pdpEnterParam.trackId, pdpEnterParam.recipientInfoId, pdpEnterParam.expandOnShow, pdpEnterParam.pageExpressionType)) == null) {
                        pdpEnterParamCopy = null;
                    } else {
                        Map<String, Object> map2 = pdpEnterParamCopy.trackParams;
                        if (map2 != null) {
                            map2.put("page_name", "picture_detail");
                            map2.put("previous_page", "product_detail");
                        }
                    }
                    Object obj = (pdpEnterParamCopy == null || (map = pdpEnterParamCopy.trackParams) == null) ? null : map.get("entrance_info");
                    try {
                        Map map3 = (Map) C1280004ze.LIZIZ(obj instanceof String ? (String) obj : null, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00WU
                        }.getType());
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map3.entrySet()) {
                            if (entry.getValue() instanceof String) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
                        for (Object obj2 : linkedHashMap.entrySet()) {
                            linkedHashMap2.put(((Map.Entry) obj2).getKey(), (String) ((Map.Entry) obj2).getValue());
                        }
                        c098200Yq = new HashMap(linkedHashMap2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    HashMap map4 = (HashMap) c098200Yq;
                    if (map4 == null) {
                        map4 = new HashMap();
                    }
                    HashMap map5 = new HashMap();
                    map5.put("pdp_enter_from", "from_creator_video_window");
                    Aweme aweme2 = c1758810vrz.LJI;
                    map5.put("request_body", C2097908Jt.LIZJ(new Pair(FollowStatusChangeMethod.PARAM_UID, aweme2 != null ? aweme2.getAid() : null)).toString());
                    EcSeaPdpCreatorVideoSettings.EcSeaPdpCreatorVideoModel ecSeaPdpCreatorVideoModel = EcSeaPdpCreatorVideoSettings.LIZ;
                    Integer num = ecSeaPdpCreatorVideoModel.loadMoreVideoDetailCount;
                    if (num != null) {
                        map5.put("detail_load_page_count", String.valueOf(num.intValue()));
                    }
                    Integer num2 = ecSeaPdpCreatorVideoModel.clickIntoFeedOffset;
                    if (num2 != null) {
                        map5.put("click_into_inner_feed_offset", String.valueOf(num2.intValue()));
                    }
                    map5.put("pdp_shared_player_scene", c1758810vrz.LJIIJJI);
                    try {
                        map5.put("module_da_info", C1741890vQh.LJIIIIZZ(C2097608Jq.LJIIIIZZ(new Pair("entrance_info", C1741890vQh.LJIIIIZZ(map4)), new Pair("request_id", map4.get("request_id")), new Pair("source_previous_page", c1758810vrz.LJIIL.get("source_previous_page")), new Pair("source_module", c1758810vrz.LJIIL.get("source_module")))));
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                    map5.put("vod_tag", "gec_window_creator_video");
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c1758810vrz.LIZ, "//aweme/detail");
                    smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
                    SeaPdpMediaWindowInfo seaPdpMediaWindowInfo = c1758810vrz.LJFF;
                    smartRouteBuildRoute.withParam("ids", seaPdpMediaWindowInfo != null ? seaPdpMediaWindowInfo.videoIds : null);
                    smartRouteBuildRoute.withParam("video_from", "from_sea_pdp_creator_video");
                    smartRouteBuildRoute.withParam("video_type", 126);
                    TrackParamsContext trackParamsContext = c1758810vrz.LJII;
                    Object obj3 = trackParamsContext != null ? trackParamsContext.LL.get("previous_page") : null;
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    smartRouteBuildRoute.withParam("enter_from", str2);
                    smartRouteBuildRoute.withParam("feed_param_extra", map5);
                    PageStateContext pageStateContext = (PageStateContext) c1758810vrz.LJIIIZ.getValue();
                    Object objLIZ = pageStateContext != null ? PageStateContext.LIZ(pageStateContext, "product_id") : null;
                    if ((objLIZ instanceof String) && (str = (String) objLIZ) != null) {
                        str3 = str;
                    }
                    smartRouteBuildRoute.withParam("product_id", str3);
                    smartRouteBuildRoute.withParam("feed_param_log_extra", map4);
                    smartRouteBuildRoute.withParam("activity_has_activity_options", false);
                    smartRouteBuildRoute.withParam("video_current_position", c1758810vrz.LJIIJ);
                    smartRouteBuildRoute.open();
                }
            }

            @Override // X.InterfaceC1757740vqG
            public final void LJ() {
                C1766620w4a c1766620w4a = this.LIZ.LJ;
                if (c1766620w4a != null) {
                    c1766620w4a.LJIL(EnumC1308950kAP.PASSIVE);
                }
            }

            @Override // X.InterfaceC1757740vqG
            public final void LJI() {
                C1766620w4a c1766620w4a = this.LIZ.LJ;
                if (c1766620w4a != null) {
                    c1766620w4a.LJIL(EnumC1308950kAP.PASSIVE);
                }
            }

            @Override // X.InterfaceC1757740vqG
            public final boolean isMuted() {
                C1766620w4a c1766620w4a = this.LIZ.LJ;
                return c1766620w4a != null && c1766620w4a.LLILZ;
            }

            @Override // X.InterfaceC1757740vqG
            public final void LJFF(boolean z) {
                C1766620w4a c1766620w4a = this.LIZ.LJ;
                if (c1766620w4a != null) {
                    c1766620w4a.LJJI(z, EnumC1308950kAP.ACTIVE);
                }
                C1766620w4a c1766620w4a2 = this.LIZ.LJ;
                if (c1766620w4a2 != null) {
                    c1766620w4a2.LIZIZ();
                }
            }
        };
    }
}
