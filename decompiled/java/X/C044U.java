package X;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CutPriceLayerData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CutPriceSKUPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SeaSkuPanelData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.044U, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C044U {
    /* JADX WARN: Removed duplicated region for block: B:101:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <VM extends androidx.lifecycle.ViewModel> java.util.Map<java.lang.String, java.lang.Object> LIZ(X.C044Z<VM> r12) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C044U.LIZ(X.044Z):java.util.Map");
    }

    public static Integer LIZJ(SeaSkuPanelViewModel seaSkuPanelViewModel) {
        String[] strArr;
        SkuItem skuItemLIZJ;
        String str;
        PdpShipping pdpShipping;
        List<LogisticDTO> list;
        LogisticDTO logisticDTO;
        Boolean bool;
        List<SkuItem> list2;
        SkuPanelState skuPanelState = seaSkuPanelViewModel.LLJI;
        if (skuPanelState == null || (strArr = skuPanelState.checkedSkuIds) == null) {
            return null;
        }
        String strLIZ = C036I.LIZ(strArr);
        ProductPackStruct productPackStruct = seaSkuPanelViewModel.LLJILJILJ;
        if (productPackStruct != null && (list2 = productPackStruct.skus) != null) {
            skuItemLIZJ = C731902tR.LIZJ(strLIZ, list2);
        } else {
            skuItemLIZJ = null;
        }
        if (skuItemLIZJ != null) {
            str = skuItemLIZJ.skuId;
        } else {
            str = null;
        }
        C10380044c c10380044cLIZ = seaSkuPanelViewModel.LLJJJIL.LIZ(C03KN.LIZ(Integer.valueOf(seaSkuPanelViewModel.hf()), str, seaSkuPanelViewModel.LLJJIJI));
        if (c10380044cLIZ == null || (pdpShipping = c10380044cLIZ.LIZJ) == null || (list = pdpShipping.logistics) == null || (logisticDTO = (LogisticDTO) C13LP.LJJJLL(list)) == null || (bool = logisticDTO.freeShipping) == null) {
            return null;
        }
        return Integer.valueOf(bool.booleanValue() ? 1 : 0);
    }

    public static <VM extends ViewModel> C10380044c LIZLLL(C044Z<VM> c044z) {
        String str;
        SkuItem skuItemLLZILL = c044z.LLZILL();
        if (skuItemLLZILL != null) {
            str = skuItemLLZILL.skuId;
        } else {
            str = null;
        }
        return c044z.De0().LIZ(C03KN.LIZ(Integer.valueOf(c044z.hf()), str, c044z.fd()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct] */
    public static <VM extends ViewModel> void LJI(C044Z<VM> c044z, SkuPanelStarter.SkuRenderParams skuRenderParams) {
        ?? productInfoPack;
        String str;
        SkuCommonConfig skuCommonConfig;
        CutPriceLayerData cutPriceLayerData;
        ProductPackStruct productPackStruct;
        SeaSkuPanelData seaSkuPanelData;
        String str2;
        HashMap<String, Object> mapLJIIJ;
        Map<String, Map<String, Object>> skuCoreBizDaInfo;
        C10379044b c10379044bEr0;
        C259800zU c259800zU = new C259800zU();
        CutPriceSKUPanel cutPriceSKUPanel = null;
        if (skuRenderParams != null) {
            productInfoPack = skuRenderParams.getProductInfoPack();
        } else {
            productInfoPack = 0;
        }
        c259800zU.element = productInfoPack;
        if (productInfoPack != 0) {
            C044V.LIZ.getClass();
            C044V.LJIIJJI(productInfoPack);
        }
        if (skuRenderParams != null && (skuCoreBizDaInfo = skuRenderParams.getSkuCoreBizDaInfo()) != null && (c10379044bEr0 = c044z.er0()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(skuCoreBizDaInfo);
            Map map = (Map) linkedHashMap.remove("key_server_core_biz_da_info");
            if (map != null) {
                ((ConcurrentHashMap) c10379044bEr0.LIZ).putAll(map);
            }
            Map map2 = (Map) linkedHashMap.remove("key_client_core_biz_da_info");
            if (map2 != null) {
                ((ConcurrentHashMap) c10379044bEr0.LIZIZ).putAll(map2);
            }
            ((ConcurrentHashMap) c10379044bEr0.LIZJ).putAll(linkedHashMap);
        }
        C10379044b c10379044bEr02 = c044z.er0();
        if (c10379044bEr02 != null && (productPackStruct = (ProductPackStruct) c259800zU.element) != null && (seaSkuPanelData = productPackStruct.skuPanelData) != null && (str2 = seaSkuPanelData.seaCoreBizDaInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            ((ConcurrentHashMap) c10379044bEr02.LIZ).putAll(mapLJIIJ);
        }
        C03T5 c03t5 = C03T5.LIZ;
        ProductPackStruct productPackStruct2 = (ProductPackStruct) c259800zU.element;
        c03t5.getClass();
        ?? LIZ = C03T5.LIZ(productPackStruct2, false);
        if (LIZ != 0) {
            c259800zU.element = LIZ;
            c044z.I30(C03T5.LIZIZ());
        }
        c044z.m1((ProductPackStruct) c259800zU.element);
        c044z.LJJJZ(new AwS580S0100000_1(c259800zU, (C259800zU<String>) 276));
        if (skuRenderParams != null) {
            String productId = skuRenderParams.getProductId();
            SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ = c044z.LLIIIJ();
            if (skuEnterParamsLLIIIJ != null) {
                str = skuEnterParamsLLIIIJ.productId;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(productId, str)) {
                c044z.y8(EnumC1756020vnU.PREFETCH_FULL);
                c044z.ua0(EnumC10382044e.NORMAL);
                List<SkuItem> skuList = skuRenderParams.getSkuList();
                List<SaleProp> salePropList = skuRenderParams.getSalePropList();
                ProductPackStruct productPackStruct3 = (ProductPackStruct) c259800zU.element;
                if (productPackStruct3 != null) {
                    skuCommonConfig = productPackStruct3.skuCommonConfig;
                } else {
                    skuCommonConfig = null;
                }
                SkuInfo skuInfo = new SkuInfo(skuList, salePropList, skuCommonConfig);
                ProductPrice price = skuRenderParams.getPrice();
                Image mainPicture = skuRenderParams.getMainPicture();
                SkuPanelState skuPanelState = new SkuPanelState(skuRenderParams.getProductId(), null, null, null, skuRenderParams.getCheckedSkuIds(), skuRenderParams.getProductQuantity(), null, null, false, 0, null, null, null, skuRenderParams.getClickSpecGroupIds(), null, null, null, null, null, null, skuRenderParams.isDefaultPreSelect(), skuRenderParams.getDefaultPreSelectType(), skuRenderParams.getDefaultPreSelectSkuIds(), skuRenderParams.isSkuManuallySelected(), null, null);
                String sellerId = skuRenderParams.getSellerId();
                AddToCartButton addToCartButton = skuRenderParams.getAddToCartButton();
                PdpPaymentModule paymentModule = skuRenderParams.getPaymentModule();
                String selectedAddressId = skuRenderParams.getSelectedAddressId();
                ProductPackStruct productPackStruct4 = (ProductPackStruct) c259800zU.element;
                if (productPackStruct4 != null && (cutPriceLayerData = productPackStruct4.cutPriceLayerData) != null) {
                    cutPriceSKUPanel = cutPriceLayerData.cutPriceSkuPanel;
                }
                LJFF(c044z, skuInfo, price, mainPicture, skuPanelState, sellerId, addToCartButton, paymentModule, selectedAddressId, cutPriceSKUPanel, true);
                c044z.LJJJZ(new AwS89S0110000_1(false, EnumC10383044f.SUCCESS, 12));
            }
        }
    }

    public static void LIZIZ(SeaSkuPanelViewModel seaSkuPanelViewModel, Context context, String str) {
        boolean zBooleanValue;
        String str2;
        Integer num;
        int iIntValue;
        Boolean bool;
        C03QN c03qn = C03QN.LIZ;
        ProductPackStruct productPackStruct = seaSkuPanelViewModel.LLJILJILJ;
        SkuPanelState skuPanelState = seaSkuPanelViewModel.LLJI;
        SkuPanelStarter skuPanelStarter = SkuPanelStarter.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams = seaSkuPanelViewModel.LLJILJIL;
        String str3 = null;
        String strLJI = seaSkuPanelViewModel.LLJLLL.LJI("c1771.d3669", null);
        skuPanelStarter.getClass();
        IPdpStarter.PdpEnterParam pdpEnterParamLIZIZ = SkuPanelStarter.LIZIZ(skuEnterParams, strLJI);
        Long l = seaSkuPanelViewModel.LLJJLIIIJLLLLLLLZ;
        if (l != null) {
            long jLongValue = l.longValue();
            Map<String, Object> map = pdpEnterParamLIZIZ.trackParams;
            if (map != null) {
                map.put("start_click_time", Long.valueOf(jLongValue));
            }
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = seaSkuPanelViewModel.LLJILJIL;
        if (skuEnterParams2 != null && (bool = skuEnterParams2.pdpFullScreen) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams3 = seaSkuPanelViewModel.LLJILJIL;
        if (skuEnterParams3 != null) {
            str3 = skuEnterParams3.pdpFrom;
            str2 = skuEnterParams3.voucherTypeId;
            num = skuEnterParams3.oneStepOrderType;
        } else {
            str2 = null;
            num = null;
        }
        Integer numLIZJ = LIZJ(seaSkuPanelViewModel);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C03QN.LJIIJ(c03qn, context, null, productPackStruct, skuPanelState, pdpEnterParamLIZIZ, zBooleanValue, str, 0, str3, str2, num, Integer.valueOf(iIntValue), 0, 2, null, null, null, null, 0, 0, 1032192);
    }

    public static <VM extends ViewModel> void LJ(C044Z<VM> c044z, ProductPackStruct productPackStruct, boolean z, boolean z2) {
        String[] strArr;
        Integer num;
        String str;
        ProductPrice productPrice;
        Image image;
        String str2;
        String str3;
        String[] strArr2;
        String[] checkedSkuIds;
        SkuCommonConfig skuCommonConfig;
        List<Image> list;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> chainParam;
        HashMap<String, Object> mapLJIIJ;
        String str4;
        String str5;
        HashMap<String, Object> mapLJIIJ2;
        HashMap<String, Object> mapLJIIJ3;
        List listLJLI;
        List<SaleProp> list2;
        SalePropValue next;
        String str6;
        String[] strArr3;
        ExceptionUX exceptionUX;
        String str7;
        SeaSkuPanelViewModel seaSkuPanelViewModel;
        ProductPackStruct productPackStruct2 = productPackStruct;
        if (z2) {
            c044z.Fk(false);
        }
        C03T5.LIZ.getClass();
        ProductPackStruct productPackStructLIZ = C03T5.LIZ(productPackStruct2, false);
        if (productPackStructLIZ != null) {
            c044z.I30(C03T5.LIZIZ());
            productPackStruct2 = productPackStructLIZ;
        }
        c044z.m1(productPackStruct2);
        CutPriceSKUPanel cutPriceSKUPanel = null;
        if (!z2) {
            c044z.De0().LIZ.clear();
            SkuPanelState skuPanelStateDw = c044z.dw();
            if (skuPanelStateDw != null) {
                str7 = skuPanelStateDw.skuId;
            } else {
                str7 = null;
            }
            if (C123100dR.LIZ(str7)) {
                return;
            }
            if ((c044z instanceof SeaSkuPanelViewModel) && (seaSkuPanelViewModel = (SeaSkuPanelViewModel) c044z) != null) {
                seaSkuPanelViewModel.LLLIIL = true;
            }
        }
        ProductPackStruct productPackStructDh = c044z.Dh();
        if (productPackStructDh != null && (exceptionUX = productPackStructDh.exceptionUX) != null) {
            c044z.LJJJZ(new AwS580S0100000_1(exceptionUX, 274));
        }
        if (c044z.Dh() != null) {
            SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ = c044z.LLIIIJ();
            if (skuEnterParamsLLIIIJ != null && skuEnterParamsLLIIIJ.checkedSkuIds != null) {
                SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ2 = c044z.LLIIIJ();
                if (skuEnterParamsLLIIIJ2 != null && (strArr3 = skuEnterParamsLLIIIJ2.checkedSkuIds) != null) {
                    listLJLI = C13LQ.LJLI(strArr3);
                } else {
                    listLJLI = C13BV.INSTANCE;
                }
                if (!listLJLI.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    HashMap map = new HashMap();
                    for (Object obj : listLJLI) {
                        map.put(obj, obj);
                    }
                    ProductPackStruct productPackStructDh2 = c044z.Dh();
                    if (productPackStructDh2 != null && (list2 = productPackStructDh2.saleProps) != null) {
                        Iterator<SaleProp> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            List<SalePropValue> list3 = it2.next().salePropValueList;
                            if (list3 != null) {
                                Iterator<SalePropValue> it3 = list3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        if (map.get(next.propValueId) != null) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                SalePropValue salePropValue = next;
                                if (salePropValue != null && (str6 = salePropValue.propValueId) != null) {
                                    arrayList.add(str6);
                                }
                            }
                        }
                    }
                    listLJLI = arrayList;
                }
                strArr = (String[]) listLJLI.toArray(new String[0]);
            } else {
                strArr = null;
            }
        } else {
            SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ3 = c044z.LLIIIJ();
            if (skuEnterParamsLLIIIJ3 != null) {
                strArr = skuEnterParamsLLIIIJ3.checkedSkuIds;
            } else {
                strArr = null;
            }
        }
        C044V.LIZ.getClass();
        C044V.LJIIJJI(productPackStruct2);
        C044V.LJIIJ(productPackStruct2, strArr);
        C10379044b c10379044bEr0 = c044z.er0();
        if (c10379044bEr0 != null) {
            ((ConcurrentHashMap) c10379044bEr0.LIZ).clear();
            String str8 = productPackStruct2.seaCoreBizDaInfo;
            if (str8 != null && (mapLJIIJ3 = C1741890vQh.LJIIJ(str8)) != null) {
                ((ConcurrentHashMap) c10379044bEr0.LIZ).putAll(mapLJIIJ3);
            }
            SeaSkuPanelData seaSkuPanelData = productPackStruct2.skuPanelData;
            if (seaSkuPanelData != null && (str5 = seaSkuPanelData.seaCoreBizDaInfo) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str5)) != null) {
                ((ConcurrentHashMap) c10379044bEr0.LIZ).putAll(mapLJIIJ2);
            }
            PdpPaymentModule pdpPaymentModule = productPackStruct2.pdpPaymentModule;
            if (pdpPaymentModule != null && (str4 = pdpPaymentModule.pdpDaInfo) != null) {
                mapLJIIJ = C1741890vQh.LJIIJ(str4);
            } else {
                mapLJIIJ = null;
            }
            c10379044bEr0.LIZJ("key_pdp_payment_module", mapLJIIJ);
        }
        ProductPackStruct productPackStructDh3 = c044z.Dh();
        if (productPackStructDh3 != null && (bCMStandardTrack = productPackStructDh3.bcmStandardTrack) != null && (chainParam = bCMStandardTrack.getChainParam()) != null) {
            c044z.ye().LJIIIIZZ(chainParam);
        }
        String str9 = productPackStruct2.productId;
        if (str9 == null) {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ4 = c044z.LLIIIJ();
        if (skuEnterParamsLLIIIJ4 != null) {
            num = skuEnterParamsLLIIIJ4.productQuantity;
        } else {
            num = null;
        }
        List<SkuItem> list4 = productPackStruct2.skus;
        List<SaleProp> list5 = productPackStruct2.saleProps;
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ5 = c044z.LLIIIJ();
        if (skuEnterParamsLLIIIJ5 != null) {
            str = skuEnterParamsLLIIIJ5.enterFrom;
        } else {
            str = null;
        }
        ProductBase productBase = productPackStruct2.baseInfo;
        if (productBase != null) {
            productPrice = productBase.priceInfo;
        } else {
            productPrice = null;
        }
        if (productBase != null && (list = productBase.images) != null) {
            image = (Image) C13LP.LJJJLZIJ(0, list);
        } else {
            image = null;
        }
        SellerInfo sellerInfo = productPackStruct2.sellerInfo;
        if (sellerInfo != null) {
            str2 = sellerInfo.sellerId;
        } else {
            str2 = null;
        }
        AddToCartButton addToCartButton = productPackStruct2.addToCartButton;
        PdpPaymentModule pdpPaymentModule2 = productPackStruct2.pdpPaymentModule;
        String strFd = c044z.fd();
        if (strFd == null) {
            strFd = productPackStruct2.defaultAddressId;
        }
        SkuPanelStarter.SkuRenderParams skuRenderParams = new SkuPanelStarter.SkuRenderParams(str9, strArr, num, list4, list5, str, productPrice, null, image, str2, addToCartButton, pdpPaymentModule2, productPackStruct2, strFd, null, null, null, null, null, 0, "", null, Boolean.FALSE, null);
        String productId = skuRenderParams.getProductId();
        SkuPanelStarter.SkuEnterParams skuEnterParamsLLIIIJ6 = c044z.LLIIIJ();
        if (skuEnterParamsLLIIIJ6 != null) {
            str3 = skuEnterParamsLLIIIJ6.productId;
        } else {
            str3 = null;
        }
        if (Intrinsics.LJFF(productId, str3)) {
            SkuPanelState skuPanelStateDw2 = c044z.dw();
            if (skuPanelStateDw2 != null) {
                strArr2 = skuPanelStateDw2.checkedSkuIds;
            } else {
                strArr2 = null;
            }
            if (C041G.LJIIL(productPackStruct2.saleProps, strArr2)) {
                SkuPanelState skuPanelStateDw3 = c044z.dw();
                if (skuPanelStateDw3 != null) {
                    checkedSkuIds = skuPanelStateDw3.checkedSkuIds;
                } else {
                    checkedSkuIds = null;
                }
            } else {
                checkedSkuIds = skuRenderParams.getCheckedSkuIds();
            }
            List<SkuItem> skuList = skuRenderParams.getSkuList();
            List<SaleProp> salePropList = skuRenderParams.getSalePropList();
            ProductPackStruct productPackStructDh4 = c044z.Dh();
            if (productPackStructDh4 != null) {
                skuCommonConfig = productPackStructDh4.skuCommonConfig;
            } else {
                skuCommonConfig = null;
            }
            SkuInfo skuInfo = new SkuInfo(skuList, salePropList, skuCommonConfig);
            ProductPrice price = skuRenderParams.getPrice();
            Image mainPicture = skuRenderParams.getMainPicture();
            SkuPanelState skuPanelState = new SkuPanelState(skuRenderParams.getProductId(), null, null, null, checkedSkuIds, skuRenderParams.getProductQuantity(), null, null, false, 0, null, null, null, null, null, null, null, null, null, null, 0, "", null, Boolean.FALSE, null, null);
            String sellerId = skuRenderParams.getSellerId();
            AddToCartButton addToCartButton2 = skuRenderParams.getAddToCartButton();
            PdpPaymentModule paymentModule = skuRenderParams.getPaymentModule();
            String strFd2 = c044z.fd();
            if (strFd2 == null) {
                strFd2 = productPackStruct2.defaultAddressId;
            }
            CutPriceLayerData cutPriceLayerData = productPackStruct2.cutPriceLayerData;
            if (cutPriceLayerData != null) {
                cutPriceSKUPanel = cutPriceLayerData.cutPriceSkuPanel;
            }
            LJFF(c044z, skuInfo, price, mainPicture, skuPanelState, sellerId, addToCartButton2, paymentModule, strFd2, cutPriceSKUPanel, z2);
            c044z.LJJJZ(new AwS89S0110000_1(z, EnumC10383044f.SUCCESS, 12));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x02e8, code lost:
    
        if (r0 != null) goto L180;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ea A[PHI: r0
      0x02ea: PHI (r0v53 java.lang.String[]) = (r0v50 java.lang.String[]), (r0v55 java.lang.String[]) binds: [B:209:0x035a, B:179:0x02e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <VM extends androidx.lifecycle.ViewModel> void LJFF(X.C044Z<VM> r15, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo r16, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice r17, com.ss.android.ugc.aweme.ecommerce.service.vo.Image r18, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r19, java.lang.String r20, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton r21, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule r22, java.lang.String r23, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CutPriceSKUPanel r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C044U.LJFF(X.044Z, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice, com.ss.android.ugc.aweme.ecommerce.service.vo.Image, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CutPriceSKUPanel, boolean):void");
    }
}
