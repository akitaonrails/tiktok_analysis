package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleControl;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.AbsUsECLiveExplanationCardWidget$onMessage$7", f = "AbsUsECLiveExplanationCardWidget.kt", l = {1525, 1531}, m = "invokeSuspend")
public final class C21193517wj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC21194117wp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21193517wj(AbstractC21194117wp abstractC21194117wp, InterfaceC1364105Vn<? super C21193517wj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC21194117wp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21193517wj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String idStr;
        Long lLJFF;
        long id;
        Long lLJFF2;
        C0X52 c0x52;
        BaseResponse baseResponse;
        PopProductResp popProductResp;
        String idStr2;
        Map<String, BuyButtonProperty> map;
        List<AtmosphereTag> list;
        String string;
        Object popPromotion = obj;
        C1C7U.LIZ("AbsUsECLiveExplanationCardWidget@dce0.onMessage$7");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = "";
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(popPromotion);
                    c0x52 = (C0X52) popPromotion;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(popPromotion);
                c0x52 = (C0X52) popPromotion;
            }
        } else {
            C155000ia.LIZIZ(popPromotion);
            if (this.LLILLJJLI.LJJIJLIJ()) {
                UsProductListApi usProductListApi = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
                Room room = this.LLILLJJLI.LLJILLL;
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                Long lLJIILIIL = C2095008Iq.LJIILIIL(AbstractC21194117wp.LJJIJ());
                UsPopupCardVO usPopupCardVO = this.LLILLJJLI.LJJIJIIJI().LL;
                if (usPopupCardVO != null) {
                    lLJFF2 = C2286608xc.LJFF(usPopupCardVO.productId);
                } else {
                    lLJFF2 = null;
                }
                this.LL = 1;
                popPromotion = usProductListApi.getPopFromBroadcastV2("aweme/v1/oec/content/creator/live/pin_card", id, lLJIILIIL, lLJFF2, this);
                if (popPromotion == objLJFF) {
                    C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.onMessage$7");
                    return objLJFF;
                }
                c0x52 = (C0X52) popPromotion;
            } else {
                UsProductListApi usProductListApi2 = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
                Room room2 = this.LLILLJJLI.LLJILLL;
                if (room2 == null || (idStr = room2.getIdStr()) == null) {
                    idStr = "";
                }
                UsPopupCardVO usPopupCardVO2 = this.LLILLJJLI.LJJIJIIJI().LL;
                if (usPopupCardVO2 != null) {
                    lLJFF = C2286608xc.LJFF(usPopupCardVO2.productId);
                } else {
                    lLJFF = null;
                }
                String strValueOf = String.valueOf(lLJFF);
                Integer numLJ = C2286608xc.LJ(1);
                AbstractC21194117wp abstractC21194117wp = this.LLILLJJLI;
                String str2 = abstractC21194117wp.LLLF;
                Integer numLJ2 = C2286608xc.LJ(abstractC21194117wp.LJJIJIL(false));
                this.LL = 2;
                popPromotion = usProductListApi2.getPopPromotion(idStr, strValueOf, numLJ, str2, numLJ2, null, 1, false, null, this);
                if (popPromotion == objLJFF) {
                    C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.onMessage$7");
                    return objLJFF;
                }
                c0x52 = (C0X52) popPromotion;
            }
        }
        if (c0x52.LIZJ() && (baseResponse = (BaseResponse) c0x52.LIZIZ) != null && (popProductResp = (PopProductResp) baseResponse.getData()) != null) {
            AbstractC21194117wp abstractC21194117wp2 = this.LLILLJJLI;
            if (C21195217x0.LIZIZ(popProductResp.pinCardConfig)) {
                Room room3 = abstractC21194117wp2.LLJILLL;
                if (room3 != null && (string = C2286608xc.LJFF(room3.getId()).toString()) != null) {
                    str = string;
                }
                C21188617vw.LIZ(str).LIZ("room_is_pin_coupon", "1");
            }
            C598030Ncv.LIZ.getClass();
            popProductResp.LIZIZ = C598030Ncv.LIZLLL(c0x52);
            C21194017wo.LIZ(popProductResp, abstractC21194117wp2.LJJIJLIJ());
            if (C21194717wv.LJ(popProductResp) != null) {
                Room room4 = abstractC21194117wp2.LLJILLL;
                if (room4 != null) {
                    idStr2 = room4.getIdStr();
                } else {
                    idStr2 = null;
                }
                C598030Ncv.LIZ(c0x52, idStr2, false);
                C182R c182r = UsPopupCardVO.Companion;
                String str3 = popProductResp.LIZIZ;
                Product product = popProductResp.product;
                if (product == null) {
                    product = new Product("", "", null, null, "", "", 0, null, 0, "", "", "", 0, "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null);
                }
                long j = popProductResp.LIZ;
                long j2 = popProductResp.serverTime;
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popProductResp.flashSaleAtmosphereInfo;
                FlashSaleControl flashSaleControl = popProductResp.flashSaleControl;
                int i2 = popProductResp.bagIndex;
                PromotionStyleConfig promotionStyleConfig = popProductResp.promotionStyleConfig;
                Boolean bool = popProductResp.assistantSwitch;
                int i3 = popProductResp.cardType;
                ShoppingBagList shoppingBagList = popProductResp.shoppingBagList;
                BuyButtonConfig buyButtonConfig = popProductResp.buyButtonConfig;
                if (buyButtonConfig != null) {
                    map = buyButtonConfig.pinCardBuyButtonConfig;
                } else {
                    map = null;
                }
                PdpTopBubble pdpTopBubble = popProductResp.pdpTopBubble;
                NextActionInfo nextActionInfo = popProductResp.nextActionInfo;
                long j3 = popProductResp.popCardId;
                LynxCardInfo lynxCardInfo = popProductResp.lynxCardInfo;
                PinCardConfig pinCardConfig = popProductResp.pinCardConfig;
                ProductCardConfig productCardConfig = popProductResp.productCardConfig;
                AuctionData auctionData = popProductResp.auctionData;
                PopupCardBffData popupCardBffData = popProductResp.bffData;
                String str4 = popProductResp.popMsgCtxStr;
                c182r.getClass();
                UsPopupCardVO usPopupCardVOLIZ = C182R.LIZ(null, str3, null, product, j, j2, flashSaleAtmosphereInfo, flashSaleControl, i2, promotionStyleConfig, bool, i3, shoppingBagList, map, pdpTopBubble, nextActionInfo, j3, lynxCardInfo, pinCardConfig, productCardConfig, auctionData, popupCardBffData, null, str4);
                usPopupCardVOLIZ.setBagIndex(popProductResp.bagIndex);
                usPopupCardVOLIZ.setLiveBagAndPinCardType(popProductResp.liveBagAndPinCardType);
                UsPopupCardVO usPopupCardVO3 = abstractC21194117wp2.LJJIJIIJI().LL;
                if (usPopupCardVO3 != null && (list = usPopupCardVO3.atmosphereTags) != null) {
                    usPopupCardVOLIZ.atmosphereTags.addAll(list);
                }
                abstractC21194117wp2.LJJIJIIJI().u(usPopupCardVOLIZ, "live_message_exclusive_price_promotion_status_change", C2097608Jq.LJ());
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.onMessage$7");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
