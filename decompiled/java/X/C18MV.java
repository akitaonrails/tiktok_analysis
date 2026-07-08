package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.PanelPerformanceMetrics;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.search.SearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18MV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18MV extends RecyclerView.ViewHolder {
    public final View LL;
    public final Activity LLILLJJLI;
    public final List<AnchorProductInfoModel> LLILLL;
    public final AwemePruningModel LLILZ;
    public final ArrayList<Integer> LLILZIL;
    public final ArrayList<Integer> LLILZLL;
    public final ArrayList<Integer> LLIZ;
    public final Map<String, C21271218Mc> LLIZLLLIL;
    public final Map<String, C0NOH> LLJ;
    public final IECommerceVideoService LLJI;
    public final IECommerceAnchorService LLJIJIL;
    public final PanelPerformanceMetrics LLJILJIL;
    public final Function1<Boolean, Unit> LLJILJILJ;
    public final Map<String, String> LLJILLL;
    public final int LLJJ;
    public final AnonymousClass1884 LLJJI;
    public final TuxTextView LLJJIII;
    public final TuxTextView LLJJIJI;
    public final Map<String, String> LLJJIJIIJIL;

    public static String L5(Long l) {
        if (l != null) {
            l.longValue();
            if (l.longValue() > 86400000) {
                return "gt_24";
            }
            if (l.longValue() > 3600000) {
                return "in_24";
            }
            if (l.longValue() > 0) {
                return "in_1";
            }
            return "no_countdown";
        }
        return null;
    }

    public final String N5(String str) {
        String strLJJ;
        if (this.LLJILLL.containsKey(str)) {
            return String.valueOf(((LinkedHashMap) this.LLJILLL).get(str));
        }
        AwemePruningModel awemePruningModel = this.LLILZ;
        if (awemePruningModel != null) {
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            String str2 = awemePruningModel.aid;
            HashMap<String, String> map = awemePruningModel.mMobParams;
            anchorBizUtils.getClass();
            strLJJ = AnchorBizUtils.LJJ(str, str2, map);
        } else {
            strLJJ = "";
        }
        this.LLJILLL.put(str, strLJJ);
        return strLJJ;
    }

    public final void I5(View view, int i, AnchorProductInfoModel anchorProductInfoModel, String str) {
        String str2;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2;
        boolean z2;
        String name2;
        Long lValueOf;
        List<PromotionLabel> list;
        String str3;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin3;
        boolean z3;
        String name3;
        Long lValueOf2;
        String str4;
        HashMap<String, String> map;
        AwemePruningModel awemePruningModel;
        String str5;
        String str6;
        String strValueOf;
        Map<String, String> map2;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        Integer num;
        String str7;
        String string;
        C21272518Mp.LIZ.getClass();
        C21272518Mp.LIZIZ = false;
        AnchorProductInfoModel anchorProductInfoModel2 = anchorProductInfoModel;
        boolean zLIZ = C770702zh.LIZ(anchorProductInfoModel2.extraData.schema);
        Integer num2 = anchorProductInfoModel2.extraData.productStatus;
        String str8 = "";
        if (num2 != null && num2.intValue() == 100) {
            String str9 = anchorProductInfoModel2.extraData.unavailableText;
            if (TextUtils.isEmpty(str9)) {
                Context context = view.getContext();
                if (context != null && (string = context.getString(2131845266)) != null) {
                    str8 = string;
                }
                str9 = str8;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
            c1389890mGx.LJIIJ(str9);
            c1389890mGx.LJIIJJI();
            return;
        }
        this.LLJILJILJ.invoke(Boolean.TRUE);
        String strValueOf2 = String.valueOf(anchorProductInfoModel2.extraData.productId);
        String strN5 = N5(strValueOf2);
        if (zLIZ) {
            Integer num3 = anchorProductInfoModel2.type;
            if (num3 != null && num3.intValue() == 33 && (num = anchorProductInfoModel2.extraData.platform) != null && num.intValue() == 100) {
                Activity activity = this.LLILLJJLI;
                AwemePruningModel awemePruningModel2 = this.LLILZ;
                if (awemePruningModel2 != null && (str7 = awemePruningModel2.eventType) != null) {
                    str8 = str7;
                }
                C21272218Mm.LJJIJIIJI(activity, anchorProductInfoModel2, awemePruningModel2, str8, "video_comment_multi_anchor", strN5, this.LLILLL);
            } else {
                AwemePruningModel awemePruningModel3 = this.LLILZ;
                if (awemePruningModel3 == null || (str4 = awemePruningModel3.eventType) == null) {
                    str4 = "";
                }
                anchorProductInfoModel2 = anchorProductInfoModel2;
                String strLJJIIJ = C21272218Mm.LJJIIJ(anchorProductInfoModel2, awemePruningModel3, str4, "video_comment_multi_anchor", strN5, this.LLILLL);
                AwemePruningModel awemePruningModel4 = this.LLILZ;
                if (awemePruningModel4 != null) {
                    map = awemePruningModel4.mMobParams;
                } else {
                    map = null;
                }
                if ((map == null || (str5 = map.get("request_id")) == null) && ((awemePruningModel = this.LLILZ) == null || (str5 = awemePruningModel.requestId) == null)) {
                    str5 = "";
                }
                if (map == null || (str6 = map.get("rec_session_id")) == null) {
                    str6 = "";
                }
                Bundle bundle = new Bundle();
                if (strN5.length() > 0) {
                    C786410Ut5.LJJJI("track_id", strN5, bundle);
                }
                if (str5.length() > 0) {
                    C786410Ut5.LJJJI("request_id", str5, bundle);
                }
                if (str6.length() > 0) {
                    C786410Ut5.LJJJI("rec_session_id", str6, bundle);
                }
                bundle.putBoolean("video_anchor", true);
                C786410Ut5.LJJJI("title", String.valueOf(anchorProductInfoModel2.extraData.title), bundle);
                AnchorProductInfo anchorProductInfo = anchorProductInfoModel2.extraData;
                PromotionInfo promotionInfo = anchorProductInfo.promotionInfo;
                if (promotionInfo != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
                    strValueOf = C743702vL.LIZLLL(singlePriceItem);
                } else {
                    strValueOf = String.valueOf(anchorProductInfo.formatPrice);
                }
                C786410Ut5.LJJJI("price", strValueOf, bundle);
                int i2 = this.LLJJ;
                String str10 = anchorProductInfoModel2.extraData.coverUrl;
                if (str10 != null) {
                    str8 = str10;
                }
                C786410Ut5.LJJJI("cover", C1743690vTb.LJFF(i2, i2, str8), bundle);
                C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, String.valueOf(anchorProductInfoModel2.extraData.productId), bundle);
                String strLIZ = C18LA.LIZ(i, "c9915.d3753_iplaceholder");
                BcmStandardTrack bcmStandardTrack = anchorProductInfoModel2.extraData.bcmStandardTrack;
                if (bcmStandardTrack != null) {
                    map2 = bcmStandardTrack.chainParam;
                } else {
                    map2 = null;
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILLJJLI, C18LA.LJFF(view, strLJJIIJ, strLIZ, map2));
                smartRouteBuildRoute.withParam(bundle);
                smartRouteBuildRoute.open();
            }
        } else {
            Activity activity2 = this.LLILLJJLI;
            Integer num4 = anchorProductInfoModel2.type;
            if (num4 != null && num4.intValue() == 33) {
                AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                String str11 = anchorProductInfoModel2.extraData.finalUrl;
                anchorBizUtils.getClass();
                if (AnchorBizUtils.LJJLIIIJILLIZJL(str11, false)) {
                    str2 = anchorProductInfoModel2.extraData.finalUrl;
                } else {
                    str2 = anchorProductInfoModel2.extraData.detailUrl;
                }
                String str12 = anchorProductInfoModel2.extraData.detailUrl;
                if (str12 == null) {
                    str12 = "";
                }
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2 = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String name4 = IAdDependencyService.class.getName();
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2 != null) {
                        name2 = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2.getClass().getName();
                    } else {
                        name2 = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name4, name2, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
                }
                ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2).openAdWebUrl(activity2, str12, "");
            } else {
                str2 = null;
            }
            Integer num5 = anchorProductInfoModel2.type;
            if (num5 != null && num5.intValue() == 6) {
                str2 = anchorProductInfoModel2.schema;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name5 = IAdDependencyService.class.getName();
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
                }
                ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).openAdWebUrl(activity2, anchorProductInfoModel2.schema, "");
            }
            ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIIZILJ(activity2, str2);
        }
        C21271218Mc c21271218Mc = this.LLIZLLLIL.get(strValueOf2);
        if (c21271218Mc != null) {
            lValueOf = Long.valueOf(c21271218Mc.LIZ);
        } else {
            lValueOf = null;
        }
        String strL5 = L5(lValueOf);
        if (strL5 == null) {
            C0NOH c0noh = this.LLJ.get(strValueOf2);
            if (c0noh != null) {
                lValueOf2 = Long.valueOf(c0noh.LIZ);
            } else {
                lValueOf2 = null;
            }
            strL5 = L5(lValueOf2);
        }
        Map mapLIZJ = C18LA.LIZJ(view, C18LA.LIZ(i, "c9915.d3753_iplaceholder"));
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        AwemePruningModel awemePruningModel5 = this.LLILZ;
        AnchorBizUtils anchorBizUtils2 = AnchorBizUtils.LIZ;
        PromotionInfo promotionInfo2 = anchorProductInfoModel2.extraData.promotionInfo;
        if (promotionInfo2 != null) {
            list = promotionInfo2.promotionLabels;
        } else {
            list = null;
        }
        anchorBizUtils2.getClass();
        String strLJJIL = AnchorBizUtils.LJJIL(AnchorBizUtils.LJJIIZI(list, false));
        List<AnchorProductInfoModel> list2 = this.LLILLL;
        c21271918Mj.getClass();
        if (awemePruningModel5 != null) {
            C1018703yb.LIZLLL("tiktokec_product_click", new C21270418Lu(i, anchorProductInfoModel2, awemePruningModel5, str, strN5, strL5, strLJJIL, list2, mapLIZJ));
        }
        if (AnchorBizUtils.LJJJJZI(this.LLILZ)) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin3 = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin3 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name6 = IAdDependencyService.class.getName();
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin3 != null) {
                    name3 = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin3.getClass().getName();
                } else {
                    name3 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name3, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin3).onAdEvent("anchor_detail", "otherclick", this.LLILZ.awemeRawAd);
            abstractC1056160dagOnAdEvent.LIZ.put("refer", "shop_anchor");
            abstractC1056160dagOnAdEvent.LIZIZ.put("localProductIndex", Integer.valueOf(i));
            abstractC1056160dagOnAdEvent.LIZIZ();
        }
        AwemePruningModel awemePruningModel6 = this.LLILZ;
        if (awemePruningModel6 != null) {
            str3 = awemePruningModel6.eventType;
        } else {
            str3 = null;
        }
        C21271918Mj.LJIJI(c21271918Mj, true, str3, null, awemePruningModel6, anchorProductInfoModel2, new ArrayList(this.LLILLL), "comment_anchor", 4);
    }

    public final void P5(int i, boolean z, C424610Gkt c424610Gkt, AnchorProductInfoModel anchorProductInfoModel, String str) {
        Long l;
        if (!this.LLIZ.contains(Integer.valueOf(i))) {
            this.LLIZ.add(Integer.valueOf(i));
            AwemePruningModel awemePruningModel = this.LLILZ;
            if (awemePruningModel != null && (l = awemePruningModel.startClickTime) != null) {
                long jLongValue = l.longValue();
                C21271918Mj c21271918Mj = C21271918Mj.LIZ;
                Long lValueOf = Long.valueOf(System.currentTimeMillis() - jLongValue);
                AwemePruningModel awemePruningModel2 = this.LLILZ;
                c21271918Mj.getClass();
                C1018703yb.LIZLLL("rd_tiktokec_video_shopping_detail_render", new C18M6(i, awemePruningModel2, lValueOf, z));
            }
        }
        AnchorBizUtils.LIZ.getClass();
        AnchorBizUtils.LJIJ(c424610Gkt, anchorProductInfoModel, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C18MV(View view, Activity activity, List<AnchorProductInfoModel> list, AwemePruningModel awemePruningModel, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2, ArrayList<Integer> arrayList3, Map<String, C21271218Mc> map, Map<String, C0NOH> map2, IECommerceVideoService iECommerceVideoService, IECommerceAnchorService iECommerceAnchorService, PanelPerformanceMetrics panelPerformanceMetrics, Function1<? super Boolean, Unit> function1) {
        AnonymousClass0317 anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin;
        String name;
        super(view);
        this.LL = view;
        this.LLILLJJLI = activity;
        this.LLILLL = list;
        this.LLILZ = awemePruningModel;
        this.LLILZIL = arrayList;
        this.LLILZLL = arrayList2;
        this.LLIZ = arrayList3;
        this.LLIZLLLIL = map;
        this.LLJ = map2;
        this.LLJI = iECommerceVideoService;
        this.LLJIJIL = iECommerceAnchorService;
        this.LLJILJIL = panelPerformanceMetrics;
        this.LLJILJILJ = function1;
        this.LLJILLL = new LinkedHashMap();
        this.LLJJ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.LLJJI = (AnonymousClass1884) view.findViewById(R.id.ed5);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.rst);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.rtf);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = SearchDependencyService.createISearchDependencyServicebyMonsterPlugin(false);
            boolean z = anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null;
            String name2 = ISearchDependencyService.class.getName();
            if (anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ISearchDependencyService.class);
        }
        this.LLJJIJIIJIL = ((ISearchDependencyService) anonymousClass0317CreateISearchDependencyServicebyMonsterPlugin).getLogParamsFromSearch(awemePruningModel != null ? awemePruningModel.eventType : null, "", "search_id", "search_result_id", "search_entrance", "click_recom_search_entrance", "list_item_id", "last_from_group_id", "origin_is_mall_tab");
    }
}
