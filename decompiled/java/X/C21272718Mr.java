package X;

import Y.AObserverS234S0100000_32;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.EcCommentAnchorViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.comment.CommentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Mr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21272718Mr extends ConstraintLayout implements InterfaceC1164530gPT {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public TuxIconView LLILZ;
    public SmartImageView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public ConstraintLayout LLJI;
    public C1735630vGb LLJIJIL;
    public C1735630vGb LLJILJIL;
    public final List<AnchorPrivilegeItem> LLJILJILJ;
    public View LLJILLL;
    public List<AnchorProductInfoModel> LLJJ;
    public boolean LLJJI;
    public EcCommentAnchorViewModel LLJJIII;
    public AwemePruningModel LLJJIJI;
    public String LLJJIJIIJIL;
    public AnchorCommonStruct LLJJIJIL;
    public List<SkuItem> LLJJJ;
    public final Map<String, Object> LLJJJIL;

    private final List<AnchorProductInfoModel> getAnchorData() {
        AnchorCommonStruct anchorCommonStruct;
        List<AnchorProductInfoModel> listLJIILIIL;
        AnchorCommonStruct next;
        List<AnchorCommonStruct> anchors = this.LL.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                AnchorCommonStruct anchorCommonStruct2 = next;
                if (anchorCommonStruct2.getType() == 35 && anchorCommonStruct2.getExtra().length() > 0) {
                    break;
                }
            }
            anchorCommonStruct = next;
        } else {
            anchorCommonStruct = null;
        }
        this.LLJJIJIL = anchorCommonStruct;
        if (anchorCommonStruct == null || (listLJIILIIL = C21272218Mm.LJIILIIL(anchorCommonStruct)) == null) {
            return null;
        }
        return listLJIILIIL;
    }

    private final Map<String, Object> getBtmParamMap() {
        Map mapLIZJ = C18LA.LIZJ(this.LLIZLLLIL, h0() ? "c5134.d0" : "c20736.d0");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((HashMap) mapLIZJ).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public final boolean h0() {
        List<AnchorProductInfoModel> anchorData = getAnchorData();
        return anchorData != null && anchorData.size() > 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        super.onAttachedToWindow();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAnchorDependencyService.class.getName(), anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        IAnchorDependencyService iAnchorDependencyService = (IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        String str = iAnchorDependencyService.getAnchorMobRefactorExpEnable() ? "comment_top_anchor" : "comment_anchor";
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        boolean z = this.LLJJI;
        String str2 = this.LLILLJJLI;
        Aweme aweme = this.LL;
        List<AnchorProductInfoModel> list = this.LLJJ;
        c21271918Mj.getClass();
        C2344009Gk c2344009GkLJJI = C21271918Mj.LJJI(z, str2, aweme, list, str);
        if (iAnchorDependencyService.getAnchorMobRefactorExpEnable()) {
            JSONObject jSONObjectMobParamsParserGetJSONObject = iAnchorDependencyService.mobParamsParserGetJSONObject(iAnchorDependencyService.appendCommentLogParams(c2344009GkLJJI, this.LL, this.LLJJIJIL, false));
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LJI("multi_anchor_entrance_show", jSONObjectMobParamsParserGetJSONObject);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_anchor_open_comment", this);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(boolean r34) {
        /*
            Method dump skipped, instruction units count: 1245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272718Mr.e0(boolean):void");
    }

    public final void i0(Context context, List list) {
        Map<String, Object> btmParamMap = getBtmParamMap();
        btmParamMap.putAll(this.LLJJJIL);
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        boolean z = !this.LLJJI;
        String str = this.LLJJIJIIJIL;
        String str2 = this.LLILLJJLI;
        List<AnchorProductInfoModel> list2 = this.LLJJ;
        Aweme aweme = this.LL;
        c21271918Mj.getClass();
        C21271918Mj.LJIIL(false, z, str, str2, list, list2, aweme, btmParamMap);
        AwemePruningModel awemePruningModel = this.LLJJIJI;
        if (awemePruningModel != null) {
            awemePruningModel.setStartClickTime(Long.valueOf(System.currentTimeMillis()));
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://ec/anchor_product_list");
        smartRouteBuildRoute.withParam("commonVideoAnchorModel", this.LLJJIJI);
        smartRouteBuildRoute.withParam("source_btm_token", C18LA.LJ("c5134.d0", this, null));
        smartRouteBuildRoute.open();
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        String str3;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z;
        Map<String, Object> map;
        AnchorProductInfoModel anchorProductInfoModel;
        AnchorProductInfo anchorProductInfo;
        Long l;
        String string;
        Type type;
        C1350640lFe c1350640lFe;
        if (Intrinsics.LJFF(str, "ec_anchor_open_comment")) {
            String name = null;
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(C1350640lFe.class));
                } else {
                    type = new TypeToken<C1350640lFe>() { // from class: X.18OU
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof C1350640lFe)) {
                    objFromJson = null;
                }
                c1350640lFe = (C1350640lFe) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (c1350640lFe == null) {
                str3 = null;
            } else {
                str3 = c1350640lFe.eventType;
            }
            if (Intrinsics.LJFF(str3, this.LLILLJJLI)) {
                String requestId = this.LL.getRequestId();
                String str4 = "";
                if (requestId == null) {
                    requestId = "";
                }
                String aid = this.LL.getAid();
                if (aid == null) {
                    aid = "";
                }
                List<AnchorProductInfoModel> list = this.LLJJ;
                if (list != null && (anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(list)) != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null && (l = anchorProductInfo.productId) != null && (string = l.toString()) != null) {
                    str4 = string;
                }
                Map<String, Object> btmParamMap = getBtmParamMap();
                btmParamMap.putAll(this.LLJJJIL);
                String strLIZ = C03RE.LIZ(requestId, aid, str4);
                this.LLJJIJIIJIL = strLIZ;
                C21271918Mj c21271918Mj = C21271918Mj.LIZ;
                boolean z2 = !this.LLJJI;
                String str5 = this.LLILLJJLI;
                List<SkuItem> list2 = this.LLJJJ;
                List<AnchorProductInfoModel> list3 = this.LLJJ;
                Aweme aweme = this.LL;
                c21271918Mj.getClass();
                C21271918Mj.LJIIL(true, z2, strLIZ, str5, list2, list3, aweme, btmParamMap);
                if (!((ArrayList) this.LLJILJILJ).isEmpty()) {
                    EcCommentAnchorViewModel ecCommentAnchorViewModel = this.LLJJIII;
                    if (ecCommentAnchorViewModel != null) {
                        map = ecCommentAnchorViewModel.LLILLJJLI;
                    } else {
                        map = null;
                    }
                    C21271918Mj.LJJIJIIJI(map);
                }
                if (this.LL.isAd()) {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IAdDependencyService.class.getName();
                        if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
                    }
                    AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("comment_ad", "othershow", this.LL.getAwemeRawAd());
                    abstractC1056160dagOnAdEvent.LIZ.put("refer", "comment_panel_top_ad");
                    abstractC1056160dagOnAdEvent.LIZIZ();
                }
            }
        }
    }

    public final void j0(Context context, AnchorProductInfoModel anchorProductInfoModel, List<SkuItem> list) {
        String str;
        HashMap<String, String> map;
        Aweme aweme;
        String requestId;
        String str2;
        Integer num;
        Map<String, Object> btmParamMap = getBtmParamMap();
        btmParamMap.putAll(this.LLJJJIL);
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        boolean z = !this.LLJJI;
        String str3 = this.LLJJIJIIJIL;
        String str4 = this.LLILLJJLI;
        List<AnchorProductInfoModel> list2 = this.LLJJ;
        Aweme aweme2 = this.LL;
        c21271918Mj.getClass();
        C21271918Mj.LJIIL(false, z, str3, str4, list, list2, aweme2, btmParamMap);
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        String strValueOf = String.valueOf(anchorProductInfoModel.extraData.productId);
        AwemePruningModel awemePruningModel = this.LLJJIJI;
        if (awemePruningModel != null) {
            str = awemePruningModel.aid;
            map = awemePruningModel.mMobParams;
        } else {
            str = null;
            map = null;
        }
        anchorBizUtils.getClass();
        String strLJJ = AnchorBizUtils.LJJ(strValueOf, str, map);
        if (C770702zh.LIZ(anchorProductInfoModel.extraData.schema)) {
            Integer num2 = anchorProductInfoModel.type;
            if (num2 != null && num2.intValue() == 33 && (num = anchorProductInfoModel.extraData.platform) != null && num.intValue() == 100) {
                C21272218Mm.LJJIJIIJI(context, anchorProductInfoModel, this.LLJJIJI, this.LLILLJJLI, "video_comment_single_anchor", strLJJ, C1697810uHb.LJIILJJIL(anchorProductInfoModel));
                return;
            }
            String strLJJIIJ = C21272218Mm.LJJIIJ(anchorProductInfoModel, this.LLJJIJI, this.LLILLJJLI, "video_comment_single_anchor", strLJJ, C1697810uHb.LJIILJJIL(anchorProductInfoModel));
            HashMap<String, String> mobParams = this.LL.getMobParams();
            String str5 = "";
            if ((mobParams == null || (requestId = mobParams.get("request_id")) == null) && ((aweme = this.LL) == null || (requestId = aweme.getRequestId()) == null)) {
                requestId = "";
            }
            if (mobParams != null && (str2 = mobParams.get("track_id")) != null) {
                str5 = str2;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("video_anchor", true);
            C786410Ut5.LJJJI("title", String.valueOf(anchorProductInfoModel.extraData.title), bundle);
            C786410Ut5.LJJJI("price", String.valueOf(anchorProductInfoModel.extraData.formatPrice), bundle);
            C786410Ut5.LJJJI("cover", String.valueOf(anchorProductInfoModel.extraData.coverUrl), bundle);
            C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, String.valueOf(anchorProductInfoModel.extraData.productId), bundle);
            if (str5.length() > 0) {
                C786410Ut5.LJJJI("track_id", str5, bundle);
            } else {
                C786410Ut5.LJJJI("track_id", this.LLJJIJIIJIL, bundle);
            }
            if (requestId.length() > 0) {
                C786410Ut5.LJJJI("request_id", requestId, bundle);
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C18LA.LJFF(this, strLJJIIJ, "c20736.d0", null));
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open();
            return;
        }
        AnchorBizUtils.LJLIIIL(context, this.LL, anchorProductInfoModel);
    }

    public C21272718Mr(Context context, Aweme aweme, String str, AwS265S0300000_21 awS265S0300000_21) {
        String str2;
        AnonymousClass0317 anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin;
        boolean z;
        AnonymousClass0317 anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2;
        boolean z2;
        Fragment detailSafRootFragment;
        MutableLiveData<C18OQ> mutableLiveData;
        super(context);
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = awS265S0300000_21;
        this.LLJILJILJ = new ArrayList();
        this.LLJJIJIIJIL = "";
        this.LLJJJIL = new LinkedHashMap();
        this.LLJJ = getAnchorData();
        this.LLJJI = h0();
        this.LLJJIJI = C21272218Mm.LJJIJIL(aweme, str);
        EcCommentAnchorViewModel ecCommentAnchorViewModel = new EcCommentAnchorViewModel();
        this.LLJJIII = ecCommentAnchorViewModel;
        AwemePruningModel awemePruningModel = this.LLJJIJI;
        boolean z3 = this.LLJJI;
        ecCommentAnchorViewModel.LL = awemePruningModel;
        ecCommentAnchorViewModel.LLILLJJLI.putAll(C21272018Mk.LJJIFFI(C21272018Mk.LIZ, null, awemePruningModel, 1));
        Map<String, Object> map = ecCommentAnchorViewModel.LLILLJJLI;
        if (z3) {
            str2 = "video_comment_multi_anchor";
        } else {
            str2 = "video_comment_single_anchor";
        }
        map.put("entrance_form", str2);
        LifecycleOwner lifecycleOwnerLIZIZ = C1388190mED.LIZIZ(getContext());
        if (lifecycleOwnerLIZIZ != null) {
            IECommerceFYPPlayerService iECommerceFYPPlayerService = (IECommerceFYPPlayerService) PluggableExtentionKt.pluggableSpi$default(IECommerceFYPPlayerService.class, false, false, false, 14, null);
            if (iECommerceFYPPlayerService != null) {
                detailSafRootFragment = iECommerceFYPPlayerService.getDetailSafRootFragment(this);
            } else {
                detailSafRootFragment = null;
            }
            EcCommentAnchorViewModel ecCommentAnchorViewModel2 = this.LLJJIII;
            if (ecCommentAnchorViewModel2 != null && (mutableLiveData = ecCommentAnchorViewModel2.LLILLL) != null) {
                mutableLiveData.observe(detailSafRootFragment != null ? detailSafRootFragment : lifecycleOwnerLIZIZ, new AObserverS234S0100000_32(this, 56));
            }
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_anchor_open_comment", this);
        if (this.LLJJI) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2 = CommentDependencyService.createICommentDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, ICommentDependencyService.class.getName(), anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2.getClass().getName() : null, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommentDependencyService.class);
            }
            if (!((ICommentDependencyService) anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin2).enablePreloadHighestAnchor() || C20673215v0.LJFF(getContext(), getContext(), R.layout.alh, this, true) == null) {
                C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.alh, this, true);
            }
            findViewById(R.id.ol2);
            e0(false);
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin = CommentDependencyService.createICommentDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, ICommentDependencyService.class.getName(), anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin.getClass().getName() : null, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommentDependencyService.class);
        }
        if (!((ICommentDependencyService) anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin).enablePreloadHighestAnchor() || C20673215v0.LJFF(getContext(), getContext(), R.layout.alm, this, true) == null) {
            C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.alm, this, true);
        }
        e0(true);
    }
}
