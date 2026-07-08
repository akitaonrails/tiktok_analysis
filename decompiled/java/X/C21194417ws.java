package X;

import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceUiConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleControl;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardBuyButton;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductPromotionInfo;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.17ws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.AbsUsECLiveExplanationCardWidget$onMessage$5", f = "AbsUsECLiveExplanationCardWidget.kt", l = {1334}, m = "invokeSuspend")
public final class C21194417ws extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC21194117wp LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21194417ws(AbstractC21194117wp abstractC21194117wp, String str, Integer num, InterfaceC1364105Vn<? super C21194417ws> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC21194117wp;
        this.LLILLL = str;
        this.LLILZ = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21194417ws(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String idStr;
        String string;
        ProductPromotionInfo productPromotionInfo;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        int i;
        boolean z;
        long j;
        Integer numLJ;
        int i2;
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        FlashSaleAtmosphere flashSaleAtmosphere;
        Integer numLJ2;
        FlashSaleAtmosphere flashSaleAtmosphere2;
        Integer numLJ3;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock;
        int iIntValue;
        Integer num;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        PriceUiConfig priceUiConfig;
        FlashSaleAtmosphereInfo next;
        String str;
        ProductPromotionInfo next2;
        String str2;
        Object objLIZ = obj;
        C1C7U.LIZ("AbsUsECLiveExplanationCardWidget@dce0.onMessage$5");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        boolean z2 = true;
        if (i3 != 0) {
            if (i3 == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C597710NcP c597710NcP = UsProductListApi.LIZ;
            AbstractC21194117wp abstractC21194117wp = this.LLILLJJLI;
            C054G c054g = abstractC21194117wp.LLLFF;
            Room room = abstractC21194117wp.LLJILLL;
            if (room == null || (idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            Room room2 = this.LLILLJJLI.LLJILLL;
            if (room2 != null) {
                string = C2286608xc.LJFF(room2.getOwnerUserId()).toString();
            } else {
                string = null;
            }
            String str3 = this.LLILLJJLI.LLLF;
            List listSingletonList = Collections.singletonList(this.LLILLL);
            this.LL = 1;
            objLIZ = c597710NcP.LIZ(c054g, idStr, string, str3, listSingletonList, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.onMessage$5");
                return objLJFF;
            }
        }
        UsProductListApi.GetProductPromotionAndPriceResponse getProductPromotionAndPriceResponse = (UsProductListApi.GetProductPromotionAndPriceResponse) objLIZ;
        if (getProductPromotionAndPriceResponse != null) {
            UsPopupCardVO usPopupCardVO = this.LLILLJJLI.LJJIJIIJI().LL;
            if (usPopupCardVO != null) {
                String str4 = this.LLILLL;
                AbstractC21194117wp abstractC21194117wp2 = this.LLILLJJLI;
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("check promotion flash sale and price currentProductId = ");
                sbLIZ.append(str4);
                sbLIZ.append(" , newProduct = ");
                sbLIZ.append(usPopupCardVO.productId);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ);
                if (Intrinsics.LJFF(String.valueOf(usPopupCardVO.productId), str4)) {
                    List<ProductPromotionInfo> list = getProductPromotionAndPriceResponse.products;
                    if (list != null) {
                        Iterator<ProductPromotionInfo> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                ProductPromotionInfo productPromotionInfo2 = next2;
                                if (productPromotionInfo2 != null) {
                                    str2 = productPromotionInfo2.productId;
                                } else {
                                    str2 = null;
                                }
                                if (Intrinsics.LJFF(str2, str4)) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        productPromotionInfo = next2;
                    } else {
                        productPromotionInfo = null;
                    }
                    List<FlashSaleAtmosphereInfo> list2 = getProductPromotionAndPriceResponse.flashAtmosphereInfo;
                    if (list2 != null) {
                        Iterator<FlashSaleAtmosphereInfo> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2 = next;
                                if (flashSaleAtmosphereInfo2 != null) {
                                    str = flashSaleAtmosphereInfo2.productId;
                                } else {
                                    str = null;
                                }
                                if (Intrinsics.LJFF(str, str4)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        flashSaleAtmosphereInfo = next;
                    } else {
                        flashSaleAtmosphereInfo = null;
                    }
                    if (productPromotionInfo != null) {
                        productPromotionInfo.LIZ(getProductPromotionAndPriceResponse.promotionStyleConfig);
                        usPopupCardVO.setFormatAvailablePrice(productPromotionInfo.formatAvailablePrice);
                        usPopupCardVO.setFormatOriginPrice(productPromotionInfo.formatOriginPrice);
                        usPopupCardVO.setPromotionInfo(productPromotionInfo.promotionInfo);
                        PromotionInfo promotionInfo = usPopupCardVO.promotionInfo;
                        if (promotionInfo != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
                            PromotionStyleConfig promotionStyleConfig = getProductPromotionAndPriceResponse.promotionStyleConfig;
                            if (promotionStyleConfig != null) {
                                priceUiConfig = promotionStyleConfig.priceUiConfig;
                            } else {
                                priceUiConfig = null;
                            }
                            singlePriceItem.setPriceUiConfig(priceUiConfig);
                        }
                        usPopupCardVO.setDiscount(productPromotionInfo.discount);
                        PinCardBuyButton pinCardBuyButton = productPromotionInfo.pinCardBuyButton;
                        if (pinCardBuyButton != null && (num = pinCardBuyButton.buyButtonType) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        usPopupCardVO.setBuyButtonType(iIntValue);
                        usPopupCardVO.setAdvancedFlashSale(productPromotionInfo.advancedFlashSale);
                        usPopupCardVO.setBcmStandardTrack(productPromotionInfo.bcmStandardTrack);
                    }
                    FlashSaleControl flashSaleControl = getProductPromotionAndPriceResponse.flashSaleRefreshControl;
                    if (flashSaleControl != null) {
                        i = flashSaleControl.showAtmosphereStockChangeLimit;
                    } else {
                        i = 0;
                    }
                    usPopupCardVO.setFlashSaleAtmosphereInfo(flashSaleAtmosphereInfo);
                    FlashSaleAtmosphereInfo flashSaleAtmosphereInfo3 = usPopupCardVO.flashSaleAtmosphereInfo;
                    if (flashSaleAtmosphereInfo3 != null && (flashSaleAtmosphereStock = flashSaleAtmosphereInfo3.flashSaleAtmosphereStock) != null) {
                        flashSaleAtmosphereStock.LIZ = i;
                    }
                    FlashSaleControl flashSaleControl2 = getProductPromotionAndPriceResponse.flashSaleRefreshControl;
                    if (flashSaleControl2 != null && flashSaleControl2.showLiveFlashSaleAtmosphere == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    usPopupCardVO.setEnableLiveFlashSaleAtmosphere(z);
                    FlashSaleControl flashSaleControl3 = getProductPromotionAndPriceResponse.flashSaleRefreshControl;
                    if (flashSaleControl3 != null) {
                        j = flashSaleControl3.showAtmosphereBeginMilliSecond;
                    } else {
                        j = 0;
                    }
                    usPopupCardVO.setShowAtmosphereBeginMilliSecond(j);
                    usPopupCardVO.setFlashSaleStockLimit(i);
                    if (productPromotionInfo != null) {
                        numLJ = C2286608xc.LJ(productPromotionInfo.isDisable);
                    } else {
                        numLJ = C2286608xc.LJ(0);
                    }
                    usPopupCardVO.setPopupCardStatus(numLJ);
                    if (productPromotionInfo != null) {
                        i2 = productPromotionInfo.productStatus;
                    } else {
                        i2 = 0;
                    }
                    usPopupCardVO.setProductStatus(i2);
                    InterfaceC21180717uf interfaceC21180717uf = abstractC21194117wp2.LLILZ;
                    if ((interfaceC21180717uf != null && !interfaceC21180717uf.LJIILL(abstractC21194117wp2)) || (slotViewModel = abstractC21194117wp2.LLJIJIL) == null || (mutableLiveData = slotViewModel.LL) == null || (value = mutableLiveData.getValue()) == null || !Intrinsics.LJFF(value.first, true)) {
                        if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere2 = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && (numLJ3 = C2286608xc.LJ(flashSaleAtmosphere2.status)) != null && (2 == numLJ3.intValue() || 3 == numLJ3.intValue())) {
                            abstractC21194117wp2.LJJIJL().LJI();
                        }
                    } else {
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LJ("now card is showing");
                        if (flashSaleAtmosphereInfo != null && flashSaleAtmosphereInfo.flashSaleAtmosphere != null) {
                            FlashSaleAtmosphere flashSaleAtmosphere3 = flashSaleAtmosphereInfo.flashSaleAtmosphere;
                            if (flashSaleAtmosphere3 != null) {
                                abstractC21194117wp2.LJJIJIIJI().LJIILL(flashSaleAtmosphere3);
                            }
                            FlashSaleAtmosphereStock flashSaleAtmosphereStock2 = flashSaleAtmosphereInfo.flashSaleAtmosphereStock;
                            if (flashSaleAtmosphereStock2 != null) {
                                abstractC21194117wp2.LJJIJIIJI().LJIIL(flashSaleAtmosphereStock2);
                            }
                        } else {
                            abstractC21194117wp2.LJJIJIIJI().LJIILL(null);
                            abstractC21194117wp2.LLLIIL.LJFF();
                        }
                        abstractC21194117wp2.LJJIJIIJI().LIZIZ(usPopupCardVO.buyButtonType);
                        if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && (numLJ2 = C2286608xc.LJ(flashSaleAtmosphere.status)) != null && !AbstractC21194117wp.LJJIL(numLJ2)) {
                            z2 = false;
                        }
                        abstractC21194117wp2.LJJIJIIJI().LJFF(z2);
                    }
                }
            }
        } else if (AbstractC21194117wp.LJJIL(this.LLILZ)) {
            this.LLILLJJLI.LJJIJIIJI().LJIILL(null);
            this.LLILLJJLI.LLLIIL.LJFF();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.onMessage$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
