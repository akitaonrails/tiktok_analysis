package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.SkuPanelParam;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.18M7, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18M7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C18MV LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ AnchorProductInfoModel LLILZ;
    public final /* synthetic */ C013C LLILZIL;
    public final /* synthetic */ C259800zU LLILZLL;
    public final /* synthetic */ TuxIconView LLIZ;
    public final /* synthetic */ View LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18M7(View view, C18MV c18mv, int i, AnchorProductInfoModel anchorProductInfoModel, C013C c013c, C259800zU c259800zU, TuxIconView tuxIconView, View view2, String str, boolean z) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = c18mv;
        this.LLILLL = i;
        this.LLILZ = anchorProductInfoModel;
        this.LLILZIL = c013c;
        this.LLILZLL = c259800zU;
        this.LLIZ = tuxIconView;
        this.LLIZLLLIL = view2;
        this.LLJ = str;
        this.LLJI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
        IECommerceHostService iECommerceHostService;
        String str;
        String string;
        String string2;
        IECommerceHostService iECommerceHostService2;
        IECommerceHostService iECommerceHostService3;
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap<String, String> map;
        C21271218Mc c21271218Mc;
        PromotionInfo promotionInfo;
        SinglePriceItem singlePriceItem;
        String str6;
        SinglePriceItem singlePriceItem2;
        String str7;
        SinglePriceItem singlePriceItem3;
        String str8;
        SinglePriceItem singlePriceItem4;
        SinglePriceItem singlePriceItem5;
        User user;
        AwemeRawAd awemeRawAd;
        Long adId;
        AwemeRawAd awemeRawAd2;
        Long creativeId;
        List<SkuItem> list;
        Map<String, String> map2;
        Map<String, String> map3;
        View view = this.LL;
        C21272518Mp.LIZ.getClass();
        C21272518Mp.LIZIZ = true;
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        C18MV c18mv = this.LLILLJJLI;
        AwemePruningModel awemePruningModel = c18mv.LLILZ;
        int i = this.LLILLL;
        AnchorProductInfoModel anchorProductInfoModel = this.LLILZ;
        boolean z = !this.LLILZIL.element;
        List<AnchorProductInfoModel> list2 = c18mv.LLILLL;
        c21271918Mj.getClass();
        if (awemePruningModel != null) {
            C1018703yb.LIZLLL("tiktokec_button_click", new C21270218Ls(i, anchorProductInfoModel, awemePruningModel, list2, z));
        }
        if (!this.LLILZIL.element) {
            IECommerceVideoService iECommerceVideoService = this.LLILLJJLI.LLJI;
            if (iECommerceVideoService != null) {
                TuxIconView tuxIconView = this.LLIZ;
                ViewGroup viewGroup = (ViewGroup) this.LLIZLLLIL.findViewById(R.id.azy);
                AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                AnchorProductInfo anchorProductInfo = this.LLILZ.extraData;
                anchorBizUtils.getClass();
                iECommerceVideoService.LJFF(tuxIconView, viewGroup, AnchorBizUtils.LJJJJJ(anchorProductInfo, 2));
            }
            String strN5 = this.LLILLJJLI.N5(this.LLJ);
            this.LLIZLLLIL.findViewById(R.id.v8n);
            AnchorBizUtils anchorBizUtils2 = AnchorBizUtils.LIZ;
            String str9 = this.LLILZ.extraData.schema;
            anchorBizUtils2.getClass();
            String strLJJII = AnchorBizUtils.LJJII(str9);
            C18M2 c18m2 = C18M2.LIZ;
            AwemePruningModel awemePruningModel2 = this.LLILLJJLI.LLILZ;
            String str10 = null;
            String str11 = awemePruningModel2 != null ? awemePruningModel2.eventType : null;
            Integer numValueOf = Integer.valueOf(this.LLILLL);
            AnchorProductInfoModel anchorProductInfoModel2 = this.LLILZ;
            C18MV c18mv2 = this.LLILLJJLI;
            AwemePruningModel awemePruningModel3 = c18mv2.LLILZ;
            List<SkuItem> list3 = anchorProductInfoModel2.extraData.skus;
            Map<String, String> map4 = c18mv2.LLJJIJIIJIL;
            List<AnchorProductInfoModel> list4 = c18mv2.LLILLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("previous_page", "video");
            linkedHashMap.put("button_type", this.LLILZIL.element ? "unable_to_cart" : "able_to_cart");
            BcmStandardTrack bcmStandardTrack = this.LLILZ.extraData.bcmStandardTrack;
            if (bcmStandardTrack != null && (map3 = bcmStandardTrack.trackParam) != null) {
                linkedHashMap.putAll(map3);
            }
            c18m2.getClass();
            if (awemePruningModel3 == null) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                String str12 = awemePruningModel3.aid;
                if (str12 == null) {
                    str12 = "";
                }
                linkedHashMap.put("group_id", str12);
                linkedHashMap.put("is_ad", Integer.valueOf(Intrinsics.LJFF(awemePruningModel3.isAd(), Boolean.TRUE) ? 1 : 0));
                String str13 = awemePruningModel3.authorUid;
                if (str13 == null) {
                    str13 = "";
                }
                linkedHashMap.put("author_id", str13);
                String str14 = awemePruningModel3.requestId;
                if (str14 == null) {
                    str14 = "";
                }
                linkedHashMap.put("request_id", str14);
                linkedHashMap.put("enter_from", str11 == null ? "" : str11);
                linkedHashMap.put("anchor_show_type", "video_cart_tag");
                linkedHashMap.put("product_source", String.valueOf(anchorProductInfoModel2.extraData.platform));
                String str15 = anchorProductInfoModel2.extraData.source;
                if (str15 == null) {
                    str15 = "";
                }
                linkedHashMap.put("source", str15);
                linkedHashMap.put("product_id", String.valueOf(anchorProductInfoModel2.extraData.productId));
                String str16 = awemePruningModel3.authorUid;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null ? iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null);
                    iECommerceHostService = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                }
                linkedHashMap.put("is_self", Integer.valueOf(Intrinsics.LJFF(str16, ((IAccountDependencyService) iECommerceHostService).getUserId()) ? 1 : 0));
                linkedHashMap.put("is_single_anchor", "no");
                if (numValueOf != null) {
                    linkedHashMap.put("item_order", String.valueOf(numValueOf.intValue() + 1));
                }
                Integer numLJIIZILJ = C21272218Mm.LJIIZILJ(awemePruningModel3);
                linkedHashMap.put("follow_status", Integer.valueOf(numLJIIZILJ != null ? numLJIIZILJ.intValue() : 0));
                linkedHashMap.put("source_page_type", "video");
                if (!a0.LJJJIL("video_comment_multi_anchor")) {
                    linkedHashMap.put("entrance_form", "video_comment_multi_anchor");
                }
                linkedHashMap.put("page_name", "video");
                linkedHashMap.put("entrance_info", C21272218Mm.LJIJJ(anchorProductInfoModel2, awemePruningModel3, str11, "video_comment_multi_anchor", strN5 == null ? "" : strN5, list4, true, map4));
                linkedHashMap.put("is_mix_product", C21272218Mm.LJIJ(anchorProductInfoModel2.extra));
                Integer num = anchorProductInfoModel2.extraData.productStatus;
                if (num == null || num.intValue() != 70) {
                    linkedHashMap.put("shopping_status", "product_available");
                } else {
                    linkedHashMap.put("shopping_status", "product_not_available");
                }
                linkedHashMap.putAll(C21272218Mm.LJIILJJIL(awemePruningModel3, str11, awemePruningModel3.mMobParams));
                List<SkuItem> list5 = anchorProductInfoModel2.extraData.skus;
                linkedHashMap.put("is_single_sku", (list5 == null || list5.size() != 1) ? CardStruct.IStatusCode.DEFAULT : "1");
                linkedHashMap.put("enter_from_info", awemePruningModel3.eventType);
                linkedHashMap.put("biz_type", anchorProductInfoModel2.extraData.bizType);
                String str17 = awemePruningModel3.requestId;
                if (str17 == null) {
                    str17 = "";
                }
                linkedHashMap.put("request_id", str17);
                linkedHashMap.put("track_id", strN5);
                linkedHashMap.put("purchase_path", "skip_pdp");
                String str18 = awemePruningModel3.groupId;
                if (str18 == null) {
                    str18 = "";
                }
                linkedHashMap.put("source_content_id", str18);
                HashMap<String, String> map5 = awemePruningModel3.mMobParams;
                if (map5 != null) {
                    for (Map.Entry<String, String> entry : map5.entrySet()) {
                        if (entry.getValue() != null) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (value == null) {
                                value = "";
                            }
                            linkedHashMap.put(key, value);
                        }
                    }
                }
                linkedHashMap.put("button_name", "buy_now");
                C21272018Mk.LIZ.getClass();
                linkedHashMap.putAll(C21272018Mk.LJIJI(anchorProductInfoModel2, list3));
                int i2 = C1742080vR0.LIZ;
                linkedHashMap.put("traffic_source_list", C1742080vR0.LIZJ(2, C1742080vR0.LJIIIZ(awemePruningModel3.mMobParams)));
            }
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(linkedHashMap);
            Integer num2 = this.LLILZ.extraData.bizType;
            String strLIZ = C18LA.LIZ(this.LLILLL, "c9915.d3753_iplaceholder_w6182");
            BcmStandardTrack bcmStandardTrack2 = this.LLILZ.extraData.bcmStandardTrack;
            SkuPanelParam skuPanelParam = new SkuPanelParam(num2, 0, strLIZ, (bcmStandardTrack2 == null || (map2 = bcmStandardTrack2.chainParam) == null) ? null : map2.toString(), Boolean.TRUE, null, strLJIIIIZZ, null);
            AnchorProductInfoModel anchorProductInfoModel3 = this.LLILZ;
            C18MV c18mv3 = this.LLILLJJLI;
            AwemePruningModel awemePruningModel4 = c18mv3.LLILZ;
            SkuItem skuItem = null;
            String strLJFF = C21272218Mm.LJFF(anchorProductInfoModel3, null, awemePruningModel4, awemePruningModel4 != null ? awemePruningModel4.eventType : null, "video_comment_multi_anchor", strN5, c18mv3.LLILLL, true, "video", false, null, 1536);
            AnchorBizUtils anchorBizUtils3 = AnchorBizUtils.LIZ;
            AnchorProductInfo anchorProductInfo2 = this.LLILZ.extraData;
            if (this.LLJI && (list = anchorProductInfo2.skus) != null) {
                skuItem = (SkuItem) C13LP.LJJJLZIJ(0, list);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (entry2.getValue() != null) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            C18MV c18mv4 = this.LLILLJJLI;
            AwemePruningModel awemePruningModel5 = c18mv4.LLILZ;
            AnchorProductInfoModel anchorProductInfoModel4 = this.LLILZ;
            String str19 = this.LLJ;
            boolean z2 = !this.LLILZIL.element;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap3.put("page_name", "video");
            linkedHashMap3.put("previous_page", "video");
            if (awemePruningModel5 == null || (str = awemePruningModel5.authorUid) == null) {
                str = "";
            }
            linkedHashMap3.put("author_id", str);
            linkedHashMap3.put("product_id", str19);
            linkedHashMap3.put("product_source", String.valueOf(anchorProductInfoModel4.extraData.platform));
            linkedHashMap3.put("entrance_info", C21272218Mm.LJIJJ(anchorProductInfoModel4, awemePruningModel5, awemePruningModel5 != null ? awemePruningModel5.eventType : null, "video_comment_multi_anchor", strN5, c18mv4.LLILLL, true, c18mv4.LLJJIJIIJIL));
            AnchorBizUtils.LIZ.getClass();
            linkedHashMap3.put("is_ad", Integer.valueOf(AnchorBizUtils.LJJJJZI(awemePruningModel5) ? 1 : 0));
            if (!AnchorBizUtils.LJJJJZI(awemePruningModel5) || (awemeRawAd2 = awemePruningModel5.awemeRawAd) == null || (creativeId = awemeRawAd2.getCreativeId()) == null || (string = creativeId.toString()) == null) {
                string = "";
            }
            linkedHashMap3.put("creative_id", string);
            if (!AnchorBizUtils.LJJJJZI(awemePruningModel5) || (awemeRawAd = awemePruningModel5.awemeRawAd) == null || (adId = awemeRawAd.getAdId()) == null || (string2 = adId.toString()) == null) {
                string2 = "";
            }
            linkedHashMap3.put("ad_id", string2);
            String str20 = awemePruningModel5 != null ? awemePruningModel5.authorUid : null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2 = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime2, 1, IAccountDependencyService.class.getName(), iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2 != null ? iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2.getClass().getName() : null, iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2 != null);
                iECommerceHostService2 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            linkedHashMap3.put("is_self", Integer.valueOf(Intrinsics.LJFF(str20, ((IAccountDependencyService) iECommerceHostService2).getUserId()) ? 1 : 0));
            String str21 = awemePruningModel5 != null ? awemePruningModel5.authorUid : null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin3 = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime3, 1, IAccountDependencyService.class.getName(), iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin3 != null ? iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin3.getClass().getName() : null, iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin3 != null);
                iECommerceHostService3 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin3;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            if (!Intrinsics.LJFF(str21, ((IAccountDependencyService) iECommerceHostService3).getUserId())) {
                Integer numValueOf2 = Integer.valueOf((awemePruningModel5 == null || (user = awemePruningModel5.author) == null) ? -1 : user.getFollowStatus());
                if (numValueOf2 != null) {
                    linkedHashMap3.put("follow_status", Integer.valueOf(numValueOf2.intValue()));
                }
            }
            linkedHashMap3.put("source_page_type", "video");
            linkedHashMap3.put("source_button", "add_to_cart");
            linkedHashMap3.put("cart_form", "add_to_cart");
            if (awemePruningModel5 == null || (str2 = awemePruningModel5.aid) == null) {
                str2 = "";
            }
            linkedHashMap3.put("source_content_id", str2);
            if (awemePruningModel5 == null || (str3 = awemePruningModel5.eventType) == null) {
                str3 = "";
            }
            linkedHashMap3.put("enter_from_info", str3);
            Integer num3 = anchorProductInfoModel4.extraData.productStatus;
            linkedHashMap3.put("product_type", (num3 == null || num3.intValue() != EnumC590000NCc.ProductStatusOnSales.getValue()) ? (num3 == null || num3.intValue() != EnumC590000NCc.ProductStatusStock.getValue()) ? "3" : "2" : "1");
            linkedHashMap3.put("button_type", z2 ? "able_to_cart" : "unable_to_cart");
            List<SkuItem> list6 = anchorProductInfoModel4.extraData.skus;
            linkedHashMap3.put("is_single_sku", (list6 == null || list6.size() != 1) ? CardStruct.IStatusCode.DEFAULT : "1");
            if (awemePruningModel5 == null || (str4 = awemePruningModel5.eventType) == null) {
                str4 = "";
            }
            linkedHashMap3.put("enter_from_info", str4);
            Integer num4 = anchorProductInfoModel4.extraData.bizType;
            if (num4 == null) {
                num4 = "";
            }
            linkedHashMap3.put("biz_type", num4);
            if (awemePruningModel5 == null || (str5 = awemePruningModel5.requestId) == null) {
                str5 = "";
            }
            linkedHashMap3.put("request_id", str5);
            AnchorProductInfo anchorProductInfo3 = anchorProductInfoModel4.extraData;
            if (anchorProductInfo3 != null && (promotionInfo = anchorProductInfo3.promotionInfo) != null) {
                PromotionProductPrice promotionProductPrice = promotionInfo.productPrice;
                if (promotionProductPrice != null && (singlePriceItem5 = promotionProductPrice.minPrice) != null) {
                    linkedHashMap3.put("original_price", C743702vL.LIZJ(singlePriceItem5));
                }
                PromotionProductPrice promotionProductPrice2 = promotionInfo.productPrice;
                if (promotionProductPrice2 != null && (singlePriceItem4 = promotionProductPrice2.minPrice) != null) {
                    linkedHashMap3.put("sale_price", C743702vL.LIZLLL(singlePriceItem4));
                }
                PromotionProductPrice promotionProductPrice3 = promotionInfo.productPrice;
                if (promotionProductPrice3 != null && (singlePriceItem3 = promotionProductPrice3.minPrice) != null && (str8 = singlePriceItem3.originPriceDecimal) != null) {
                    linkedHashMap3.put("original_price_value", str8);
                }
                PromotionProductPrice promotionProductPrice4 = promotionInfo.productPrice;
                if (promotionProductPrice4 != null && (singlePriceItem2 = promotionProductPrice4.minPrice) != null && (str7 = singlePriceItem2.salePriceDecimal) != null) {
                    linkedHashMap3.put("sale_price_value", str7);
                }
                PromotionProductPrice promotionProductPrice5 = promotionInfo.productPrice;
                if (promotionProductPrice5 != null && (singlePriceItem = promotionProductPrice5.minPrice) != null && (str6 = singlePriceItem.currencyName) != null) {
                    linkedHashMap3.put("currency", str6);
                }
            }
            Map<String, C21271218Mc> map6 = c18mv4.LLIZLLLIL;
            if (map6 != null && (c21271218Mc = map6.get(str19)) != null) {
                linkedHashMap3.put("flashsale_status", c21271218Mc.LJII == 2 ? "on_sale" : "");
                linkedHashMap3.put("countdown_type", AnchorBizUtils.LJJIII(c21271218Mc));
            }
            Map<String, ? extends Object> map7 = anchorProductInfoModel4.extraData.promotionLogExtraInfo;
            if (map7 != null) {
                linkedHashMap3.putAll(map7);
            }
            if (awemePruningModel5 != null) {
                str10 = awemePruningModel5.eventType;
                map = awemePruningModel5.mMobParams;
            } else {
                map = null;
            }
            linkedHashMap3.putAll(C21272218Mm.LJIILJJIL(awemePruningModel5, str10, map));
            Map mapLJJIZ = AnchorBizUtils.LJJIZ(anchorProductInfoModel4.extraData.commonDaInfo);
            if (mapLJJIZ != null) {
                linkedHashMap3.putAll(mapLJJIZ);
            }
            if (this.LLJI) {
                C18MV c18mv5 = this.LLILLJJLI;
                View view2 = this.LLIZLLLIL;
                int i3 = this.LLILLL;
                c18mv5.getClass();
                linkedHashMap3.putAll(C18LA.LIZJ(view2, C18LA.LIZ(i3, "c9915.d3753_iplaceholder_w6182")));
            }
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(strLJFF);
            AFwS223S0000000_32 aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(155);
            anchorBizUtils3.getClass();
            AnchorBizUtils.LJL(view, anchorProductInfo2, skuItem, strLJJII, "video_comment_multi_anchor", linkedHashMap2, linkedHashMap3, skuPanelParam, mapLJIIJ, aFwS223S0000000_32);
        } else if (((CharSequence) this.LLILZLL.element).length() > 0) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI.LLILLJJLI);
            c1389890mGx.LJIIJ((CharSequence) this.LLILZLL.element);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }
}
