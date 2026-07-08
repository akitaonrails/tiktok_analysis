package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleControl;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductPreheatAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.AbsECLiveExplanationCardWidget$onMessage$8", f = "AbsECLiveExplanationCardWidget.kt", l = {1523, 1532}, m = "invokeSuspend")
public final class C21193617wk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC21194217wq LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21193617wk(AbstractC21194217wq abstractC21194217wq, InterfaceC1364105Vn<? super C21193617wk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC21194217wq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21193617wk(this.LLILLJJLI, interfaceC1364105Vn);
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
        String strLIZIZ;
        Map<String, BuyButtonProperty> map;
        List<AtmosphereTag> list;
        Object popPromotion = obj;
        C1C7U.LIZ("AbsECLiveExplanationCardWidget@7dc4.onMessage$8");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
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
            if (this.LLILLJJLI.LJJIL()) {
                ProductListApi productListApi = (ProductListApi) C0NSL.LIZ().create(ProductListApi.class);
                Room room = this.LLILLJJLI.LLJILLL;
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                Long lLJIILIIL = C2095008Iq.LJIILIIL(AbstractC21194217wq.LJJIJ());
                PopupCardVO popupCardVO = this.LLILLJJLI.LJJIJIIJI().LL;
                if (popupCardVO != null) {
                    lLJFF2 = C2286608xc.LJFF(popupCardVO.productId);
                } else {
                    lLJFF2 = null;
                }
                this.LL = 1;
                popPromotion = productListApi.getPopFromBroadcastV2("aweme/v1/oec/content/creator/live/pin_card", id, lLJIILIIL, lLJFF2, null, null, null, this);
                if (popPromotion == objLJFF) {
                    C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.onMessage$8");
                    return objLJFF;
                }
                c0x52 = (C0X52) popPromotion;
            } else {
                ProductListApi productListApi2 = (ProductListApi) C0NSL.LIZ().create(ProductListApi.class);
                Room room2 = this.LLILLJJLI.LLJILLL;
                if (room2 == null || (idStr = room2.getIdStr()) == null) {
                    idStr = "";
                }
                PopupCardVO popupCardVO2 = this.LLILLJJLI.LJJIJIIJI().LL;
                if (popupCardVO2 != null) {
                    lLJFF = C2286608xc.LJFF(popupCardVO2.productId);
                } else {
                    lLJFF = null;
                }
                String strValueOf = String.valueOf(lLJFF);
                Integer numLJ = C2286608xc.LJ(1);
                AbstractC21194217wq abstractC21194217wq = this.LLILLJJLI;
                String str = abstractC21194217wq.LLLFFI;
                Integer numLJ2 = C2286608xc.LJ(abstractC21194217wq.LJJIJL(false));
                this.LL = 2;
                popPromotion = productListApi2.getPopPromotion(idStr, strValueOf, numLJ, str, numLJ2, null, 1, false, this);
                if (popPromotion == objLJFF) {
                    C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.onMessage$8");
                    return objLJFF;
                }
                c0x52 = (C0X52) popPromotion;
            }
        }
        if (c0x52.LIZJ() && (baseResponse = (BaseResponse) c0x52.LIZIZ) != null && (popProductResp = (PopProductResp) baseResponse.getData()) != null) {
            AbstractC21194217wq abstractC21194217wq2 = this.LLILLJJLI;
            long j = popProductResp.popCardId;
            if (j > 0) {
                abstractC21194217wq2.LLLIZZ = j;
            }
            C21193917wn.LIZ.getClass();
            if (C21193917wn.LJ(popProductResp)) {
                C598040Ncw.LIZ.getClass();
                strLIZIZ = C598040Ncw.LIZIZ(c0x52);
            } else {
                strLIZIZ = null;
            }
            if (C21194717wv.LJ(popProductResp) != null) {
                C182S c182s = PopupCardVO.Companion;
                Product product = popProductResp.product;
                if (product == null) {
                    product = new Product("", "", null, null, "", "", 0, null, 0, "", "", "", 0, "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null);
                }
                long j2 = popProductResp.LIZ;
                long j3 = popProductResp.serverTime;
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popProductResp.flashSaleAtmosphereInfo;
                FlashSaleControl flashSaleControl = popProductResp.flashSaleControl;
                ProductPreheatAtmosphereInfo productPreheatAtmosphereInfo = popProductResp.preheatAtmosphereInfo;
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
                AnchorPinCardConfig anchorPinCardConfig = popProductResp.anchorPinCardConfig;
                long j4 = popProductResp.LIZJ;
                JSONObject jSONObject = popProductResp.LJ;
                long j5 = popProductResp.popCardId;
                if (j5 <= 0) {
                    j5 = abstractC21194217wq2.LLLIZZ;
                }
                PopupCardVO popupCardVOLIZ = C182S.LIZ(c182s, product, j2, j3, flashSaleAtmosphereInfo, flashSaleControl, productPreheatAtmosphereInfo, i2, promotionStyleConfig, bool, i3, shoppingBagList, map, pdpTopBubble, nextActionInfo, null, anchorPinCardConfig, null, C2286608xc.LJFF(j4), null, popProductResp, jSONObject, null, strLIZIZ, j5, popProductResp.bffData, popProductResp.lynxCardInfo, 26935296);
                popupCardVOLIZ.setBagIndex(popProductResp.bagIndex);
                popupCardVOLIZ.setLiveBagAndPinCardType(popProductResp.liveBagAndPinCardType);
                PopupCardVO popupCardVO3 = abstractC21194217wq2.LJJIJIIJI().LL;
                if (popupCardVO3 != null && (list = popupCardVO3.atmosphereTags) != null) {
                    popupCardVOLIZ.atmosphereTags.addAll(list);
                }
                abstractC21194217wq2.LJJIJIIJI().LJJLIIIJLJLI(popupCardVOLIZ, "live_message_exclusive_price_promotion_status_change");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.onMessage$8");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
