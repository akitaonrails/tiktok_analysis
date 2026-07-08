package X;

import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionDiscount;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SEACCIPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.CounterDescription;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaSkuPanelWaistBanner;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.044c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10380044c {
    public final String LIZ;
    public final Integer LIZIZ;
    public final PdpShipping LIZJ;
    public final PDPShippingModule LIZLLL;
    public final PdpPaymentModule LJ;
    public final PromotionLabelVO LJFF;
    public final String LJI;
    public final ProductPackStruct LJII;
    public final BuyButton LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final CounterDescription LJIIJJI;
    public final String LJIIL;
    public final List<PromotionDiscount> LJIILIIL;
    public final SEACCIPaymentModule LJIILJJIL;
    public final List<NextRequestScene> LJIILL;
    public final String LJIILLIIL;
    public final Map<String, String> LJIIZILJ;
    public final SkuPrice LJIJ;
    public final Boolean LJIJI;
    public final SeaSkuPanelWaistBanner LJIJJ;
    public final GodaV2Protocol<?> LJIJJLI;

    public C10380044c() {
        throw null;
    }

    public C10380044c(String str, Integer num, PdpShipping pdpShipping, PDPShippingModule pDPShippingModule, PdpPaymentModule pdpPaymentModule, PromotionLabelVO promotionLabelVO, String str2, ProductPackStruct productPackStruct, BuyButton buyButton, String str3, String str4, CounterDescription counterDescription, String str5, List list, SEACCIPaymentModule sEACCIPaymentModule, List list2, String str6, Map map, SkuPrice skuPrice, Boolean bool, SeaSkuPanelWaistBanner seaSkuPanelWaistBanner, GodaV2Protocol godaV2Protocol, int i) {
        PdpPaymentModule pdpPaymentModule2 = pdpPaymentModule;
        List list3 = list;
        String str7 = str5;
        CounterDescription counterDescription2 = counterDescription;
        String str8 = str4;
        String str9 = str3;
        BuyButton buyButton2 = buyButton;
        ProductPackStruct productPackStruct2 = productPackStruct;
        String str10 = str2;
        PromotionLabelVO promotionLabelVO2 = promotionLabelVO;
        GodaV2Protocol godaV2Protocol2 = godaV2Protocol;
        SeaSkuPanelWaistBanner seaSkuPanelWaistBanner2 = seaSkuPanelWaistBanner;
        Boolean bool2 = bool;
        SkuPrice skuPrice2 = skuPrice;
        Map map2 = map;
        String str11 = str6;
        List list4 = list2;
        SEACCIPaymentModule sEACCIPaymentModule2 = sEACCIPaymentModule;
        PDPShippingModule pDPShippingModule2 = (i & 16) != 0 ? null : pDPShippingModule;
        pdpPaymentModule2 = (i & 32) != 0 ? null : pdpPaymentModule2;
        promotionLabelVO2 = (i & 64) != 0 ? null : promotionLabelVO2;
        str10 = (i & 128) != 0 ? null : str10;
        productPackStruct2 = (i & 256) != 0 ? null : productPackStruct2;
        buyButton2 = (i & 512) != 0 ? null : buyButton2;
        str9 = (i & 1024) != 0 ? null : str9;
        str8 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str8;
        counterDescription2 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : counterDescription2;
        str7 = (i & 8192) != 0 ? null : str7;
        list3 = (i & 16384) != 0 ? null : list3;
        sEACCIPaymentModule2 = (32768 & i) != 0 ? null : sEACCIPaymentModule2;
        list4 = (65536 & i) != 0 ? null : list4;
        str11 = (131072 & i) != 0 ? null : str11;
        map2 = (262144 & i) != 0 ? null : map2;
        skuPrice2 = (524288 & i) != 0 ? null : skuPrice2;
        bool2 = (1048576 & i) != 0 ? null : bool2;
        seaSkuPanelWaistBanner2 = (2097152 & i) != 0 ? null : seaSkuPanelWaistBanner2;
        godaV2Protocol2 = (i & 4194304) != 0 ? null : godaV2Protocol2;
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = pdpShipping;
        this.LIZLLL = pDPShippingModule2;
        this.LJ = pdpPaymentModule2;
        this.LJFF = promotionLabelVO2;
        this.LJI = str10;
        this.LJII = productPackStruct2;
        this.LJIIIIZZ = buyButton2;
        this.LJIIIZ = str9;
        this.LJIIJ = str8;
        this.LJIIJJI = counterDescription2;
        this.LJIIL = str7;
        this.LJIILIIL = list3;
        this.LJIILJJIL = sEACCIPaymentModule2;
        this.LJIILL = list4;
        this.LJIILLIIL = str11;
        this.LJIIZILJ = map2;
        this.LJIJ = skuPrice2;
        this.LJIJI = bool2;
        this.LJIJJ = seaSkuPanelWaistBanner2;
        this.LJIJJLI = godaV2Protocol2;
    }
}
