package X;

import Y.ACListenerS166S0100000_32;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceHideInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceUiConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.GoLiveCard;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveDaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingItem;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1856, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1856 extends AbstractC212214182y {
    public ConstraintLayout LLILZ;
    public C18QS LLILZIL;
    public C18L9 LLILZLL;
    public FrameLayout LLIZ;
    public C18L9 LLIZLLLIL;
    public C426160GnO LLJ;
    public TuxIconView LLJI;
    public C182T LLJIJIL;
    public final C212254184m LLJILJIL;
    public final C185A LLJILJILJ;
    public final AnonymousClass1862<C426160GnO> LLJILLL;
    public final C186B<ConstraintLayout> LLJJ;
    public final C0HAO LLJJI;
    public final C212253184l LLJJIII;
    public final C212252184k LLJJIJI;
    public C212281185n LLJJIJIIJIL;

    @Override // X.AbstractC212214182y
    public final void e0() {
    }

    @Override // X.AbstractC212214182y
    public Map<String, String> getContentShowParams() {
        Product product;
        LiveDaInfo liveDaInfo;
        HashMap<String, String> map;
        Product product2;
        BcmStandardTrack bcmStandardTrack;
        Map<String, String> map2;
        Map<String, Object> map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LLJJI.LJIIJJI(linkedHashMap);
        linkedHashMap.putAll(this.LLJJIJI.LIZIZ());
        linkedHashMap.put("card_type", "1");
        C185A c185a = this.LLJILJILJ;
        linkedHashMap.putAll(c185a.LJ);
        if (C123100dR.LIZ(c185a.LJI)) {
            linkedHashMap.put("title_label", c185a.LJI);
        }
        linkedHashMap.put("card_title", c185a.LJII);
        C212252184k c212252184k = this.LLJJIJI;
        c212252184k.getClass();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((LinkedHashMap) c212252184k.LJ).entrySet()) {
            PromotionLabel promotionLabel = (PromotionLabel) entry.getKey();
            View view = (View) entry.getValue();
            if (Intrinsics.LJFF(view.getParent(), c212252184k.LIZ) && view.getWidth() > 0 && (map3 = promotionLabel.daInfo) != null) {
                sb.append(map3.toString());
                sb.append("|||");
            }
        }
        if (sb.length() > 0 && sb.length() > 3) {
            sb.delete(sb.lastIndexOf("|||"), sb.length());
        }
        linkedHashMap.put("product_promotion_tag", sb.toString());
        Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c7998.d5945", PageFinder.via((View) this), null, 4, null);
        if (!mapCreateReportParams$default.isEmpty()) {
            for (Map.Entry entry2 : mapCreateReportParams$default.entrySet()) {
                linkedHashMap.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
        }
        C182T c182t = this.LLJIJIL;
        if (c182t != null && (product2 = c182t.LIZIZ) != null && (bcmStandardTrack = product2.bcmStandardTrack) != null && (map2 = bcmStandardTrack.trackParam) != null) {
            linkedHashMap.putAll(map2);
        }
        C182T c182t2 = this.LLJIJIL;
        if (c182t2 != null && (product = c182t2.LIZIZ) != null && (liveDaInfo = product.commonDaInfo) != null && (map = liveDaInfo.transDaInfo) != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public final FrameLayout getEcommerceliveFansTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gkr);
            this.LLIZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxIconView getEcommerceliveIconCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl8);
            this.LLJI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C18QS getEcommerceliveProductDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.glx);
            this.LLILZIL = (C18QS) callbackFindViewById;
        }
        return (C18QS) callbackFindViewById;
    }

    public final ConstraintLayout getEcommerceliveProductMainImageLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gm8);
            this.LLILZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C426160GnO getEcommerceliveProductPriceLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmd);
            this.LLJ = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final C18L9 getEcommercelivePromotionLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmk);
            this.LLIZLLLIL = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    public final C18L9 getSellingPointViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.up2);
            this.LLILZLL = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJILJIL.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void i0(final Product product) {
        long j;
        List<SellingItem> list;
        List<PromotionLabel> list2;
        ArrayList arrayList = new ArrayList();
        PromotionInfo promotionInfo = product.promotionInfo;
        PromotionLabel promotionLabel = null;
        if (promotionInfo != null && (list2 = promotionInfo.promotionLabels) != null) {
            for (PromotionLabel promotionLabel2 : list2) {
                if (C19676311yb.LIZLLL(promotionLabel2)) {
                    promotionLabel = promotionLabel2;
                } else {
                    arrayList.add(promotionLabel2);
                }
            }
        }
        this.LLJJIII.LJIIJ(promotionLabel);
        ?? LJFF = this.LLJJIII.LJFF();
        SellingView sellingView = product.sellingView;
        if (sellingView != null && (list = sellingView.sellingItems) != null) {
            this.LLJJI.LJIIL(new C0HAQ(list));
        }
        ?? r3 = LJFF;
        if (this.LLJJI.LJFF()) {
            r3 = LJFF + 1;
        }
        if (r3 < 2) {
            C212252184k c212252184k = this.LLJJIJI;
            C212281185n c212281185n = this.LLJJIJIIJIL;
            long j2 = 0;
            if (c212281185n != null) {
                j = c212281185n.LIZ;
                j2 = c212281185n.LIZIZ;
            } else {
                j = 0;
            }
            c212252184k.LJIILL(new C212257184p(arrayList, j, j2, true, 96));
            C212252184k c212252184k2 = this.LLJJIJI;
            c212252184k2.LIZIZ = new InterfaceC212286185s() { // from class: X.185k
                @Override // X.InterfaceC212286185s
                public final void LIZ() {
                    this.LIZ.i0(product);
                }
            };
            if (!c212252184k2.LJFF() || r3 + 1 < 2) {
                this.LLJILJILJ.LJIIJJI(2);
                return;
            }
        }
        this.LLJILJILJ.LJIIJJI(1);
    }

    public final void setEcommerceliveFansTagFromXml(FrameLayout frameLayout) {
        this.LLIZ = frameLayout;
    }

    public final void setEcommerceliveIconCloseFromXml(TuxIconView tuxIconView) {
        this.LLJI = tuxIconView;
    }

    public final void setEcommerceliveProductDescFromXml(C18QS c18qs) {
        this.LLILZIL = c18qs;
    }

    public final void setEcommerceliveProductMainImageLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLILZ = constraintLayout;
    }

    public final void setEcommerceliveProductPriceLayoutFromXml(C426160GnO c426160GnO) {
        this.LLJ = c426160GnO;
    }

    public final void setEcommercelivePromotionLayoutFromXml(C18L9 c18l9) {
        this.LLIZLLLIL = c18l9;
    }

    public final void setSellingPointViewFromXml(C18L9 c18l9) {
        this.LLILZLL = c18l9;
    }

    public AnonymousClass1856(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C212254184m c212254184m = new C212254184m();
        this.LLJILJIL = c212254184m;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.z5);
        C786410Ut5.Sd(R.layout.bvh, C786410Ut5.ne(contextThemeWrapper), this);
        setBackground(C800330VaR.LIZIZ(contextThemeWrapper, R.drawable.bmg));
        C186B<ConstraintLayout> c186b = new C186B<>(getEcommerceliveProductMainImageLayoutFromXml(), new C428480Gr8());
        c186b.LJIJI(new C428550GrF());
        this.LLJJ = c186b;
        this.LLJILJILJ = new C185A(getEcommerceliveProductDescFromXml());
        C0HAO c0hao = new C0HAO(getSellingPointViewFromXml());
        c0hao.LJIILIIL(new C0GSC());
        this.LLJJI = c0hao;
        this.LLJJIII = new C212253184l(getEcommerceliveFansTagFromXml());
        C212252184k c212252184k = new C212252184k(getEcommercelivePromotionLayoutFromXml(), null);
        c212252184k.LJFF = C182X.LIZ();
        this.LLJJIJI = c212252184k;
        AnonymousClass1862<C426160GnO> anonymousClass1862 = new AnonymousClass1862<>(getEcommerceliveProductPriceLayoutFromXml(), new C186R());
        C19344710mD c19344710mD = new C19344710mD();
        anonymousClass1862.LJIILIIL(c19344710mD);
        anonymousClass1862.LJI.LJ(c19344710mD);
        this.LLJILLL = anonymousClass1862;
        c212254184m.LIZ(c212252184k);
        c212254184m.LIZ(c186b);
        C786410Ut5.a9(getEcommerceliveIconCloseFromXml(), new ACListenerS166S0100000_32(this, 88));
    }

    @Override // X.AbstractC212214182y
    public final void h0(C182T c182t, long j, GoLiveCard goLiveCard, Integer num) {
        List<PlacementLabel> list;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        PriceTextConfig priceTextConfig;
        PriceTextConfig priceTextConfig2;
        PriceTextConfig priceTextConfig3;
        PriceTextConfig priceTextConfig4;
        PriceTextConfig priceTextConfig5;
        PriceTextConfig priceTextConfig6;
        PriceTextConfig priceTextConfig7;
        DiscountTag discountTag;
        DiscountTag discountTag2;
        PriceTextConfig priceTextConfig8;
        PriceTextConfig priceTextConfig9;
        String str;
        HashMap<String, PriceConfig> map;
        PriceConfig priceConfig;
        HashMap<String, PriceConfig> map2;
        PriceConfig priceConfig2;
        HashMap<String, PriceConfig> map3;
        PriceConfig priceConfig3;
        HashMap<String, PriceConfig> map4;
        HashMap<String, PriceConfig> map5;
        PriceConfig priceConfig4;
        HashMap<String, PriceConfig> map6;
        PriceConfig priceConfig5;
        HashMap<String, PriceConfig> map7;
        PriceConfig priceConfig6;
        HashMap<String, PriceConfig> map8;
        PriceConfig priceConfig7;
        HashMap<String, PriceConfig> map9;
        PriceConfig priceConfig8;
        HashMap<String, PriceConfig> map10;
        PriceConfig priceConfig9;
        HashMap<String, PriceConfig> map11;
        PriceConfig priceConfig10;
        HashMap<String, PriceConfig> map12;
        PriceConfig priceConfig11;
        HashMap<String, PriceConfig> map13;
        PriceConfig priceConfig12;
        this.LLJIJIL = c182t;
        Product product = c182t.LIZIZ;
        if (product == null) {
            return;
        }
        this.LLJJIJIIJIL = new C212281185n(j);
        ECImage eCImage = product.cover;
        List<String> list2 = null;
        if (eCImage != null && C703302op.LIZ(eCImage.url)) {
            this.LLJJ.LJIILL(C1743690vTb.LJI(eCImage.url, 216, 216, EnumC1769850w9n.LIVE_POP_CARD), null);
        }
        C185A c185a = this.LLJILJILJ;
        String str2 = product.title;
        PromotionInfo promotionInfo = product.promotionInfo;
        if (promotionInfo != null) {
            list = promotionInfo.placementLabels;
        } else {
            list = null;
        }
        c185a.LJIIJ(new C212276185i(str2, list));
        i0(product);
        PromotionInfo promotionInfo2 = product.promotionInfo;
        if (promotionInfo2 != null && (promotionProductPrice = promotionInfo2.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
            AnonymousClass1862<C426160GnO> anonymousClass1862 = this.LLJILLL;
            PriceUiConfig priceUiConfig = singlePriceItem.priceUiConfig;
            if (priceUiConfig != null && (map13 = priceUiConfig.configs) != null && (priceConfig12 = map13.get("preview_pin_card")) != null) {
                priceTextConfig = priceConfig12.currency;
            } else {
                priceTextConfig = null;
            }
            PriceUiConfig priceUiConfig2 = singlePriceItem.priceUiConfig;
            if (priceUiConfig2 != null && (map12 = priceUiConfig2.configs) != null && (priceConfig11 = map12.get("preview_pin_card")) != null) {
                priceTextConfig2 = priceConfig11.prefix;
            } else {
                priceTextConfig2 = null;
            }
            PriceUiConfig priceUiConfig3 = singlePriceItem.priceUiConfig;
            if (priceUiConfig3 != null && (map11 = priceUiConfig3.configs) != null && (priceConfig10 = map11.get("preview_pin_card")) != null) {
                priceTextConfig3 = priceConfig10.formatOriginPrice;
            } else {
                priceTextConfig3 = null;
            }
            PriceUiConfig priceUiConfig4 = singlePriceItem.priceUiConfig;
            if (priceUiConfig4 != null && (map10 = priceUiConfig4.configs) != null && (priceConfig9 = map10.get("preview_pin_card")) != null) {
                priceTextConfig4 = priceConfig9.formatAvailablePrice;
            } else {
                priceTextConfig4 = null;
            }
            PriceUiConfig priceUiConfig5 = singlePriceItem.priceUiConfig;
            if (priceUiConfig5 != null && (map9 = priceUiConfig5.configs) != null && (priceConfig8 = map9.get("preview_pin_card")) != null) {
                priceTextConfig5 = priceConfig8.formatAvailablePriceInteger;
            } else {
                priceTextConfig5 = null;
            }
            PriceUiConfig priceUiConfig6 = singlePriceItem.priceUiConfig;
            if (priceUiConfig6 != null && (map8 = priceUiConfig6.configs) != null && (priceConfig7 = map8.get("preview_pin_card")) != null) {
                priceTextConfig6 = priceConfig7.formatAvailablePriceDecimal;
            } else {
                priceTextConfig6 = null;
            }
            PriceUiConfig priceUiConfig7 = singlePriceItem.priceUiConfig;
            if (priceUiConfig7 != null && (map7 = priceUiConfig7.configs) != null && (priceConfig6 = map7.get("preview_pin_card")) != null) {
                priceTextConfig7 = priceConfig6.formatAvailablePricePoint;
            } else {
                priceTextConfig7 = null;
            }
            PriceUiConfig priceUiConfig8 = singlePriceItem.priceUiConfig;
            if (priceUiConfig8 != null && (map6 = priceUiConfig8.configs) != null && (priceConfig5 = map6.get("preview_pin_card")) != null) {
                discountTag = priceConfig5.discount;
            } else {
                discountTag = null;
            }
            PriceUiConfig priceUiConfig9 = singlePriceItem.priceUiConfig;
            if (priceUiConfig9 != null && (map5 = priceUiConfig9.configs) != null && (priceConfig4 = map5.get("preview_pin_card")) != null) {
                discountTag2 = priceConfig4.flashSaleDiscount;
            } else {
                discountTag2 = null;
            }
            PriceUiConfig priceUiConfig10 = singlePriceItem.priceUiConfig;
            if (priceUiConfig10 != null && (map4 = priceUiConfig10.configs) != null) {
                map4.get("preview_pin_card");
            }
            PriceUiConfig priceUiConfig11 = singlePriceItem.priceUiConfig;
            if (priceUiConfig11 != null && (map3 = priceUiConfig11.configs) != null && (priceConfig3 = map3.get("preview_pin_card")) != null) {
                priceTextConfig8 = priceConfig3.exceedFormatOriginPrice;
            } else {
                priceTextConfig8 = null;
            }
            PriceUiConfig priceUiConfig12 = singlePriceItem.priceUiConfig;
            if (priceUiConfig12 != null && (map2 = priceUiConfig12.configs) != null && (priceConfig2 = map2.get("preview_pin_card")) != null) {
                priceTextConfig9 = priceConfig2.exceedDiscount;
            } else {
                priceTextConfig9 = null;
            }
            PriceUiConfig priceUiConfig13 = singlePriceItem.priceUiConfig;
            if (priceUiConfig13 != null && (map = priceUiConfig13.configs) != null && (priceConfig = map.get("preview_pin_card")) != null) {
                list2 = priceConfig.discountDisplayOrder;
            }
            PriceTextConfig priceTextConfig10 = priceTextConfig4;
            PriceTextConfig priceTextConfig11 = priceTextConfig;
            anonymousClass1862.LJIL(new AnonymousClass1868(priceTextConfig11, priceTextConfig2, priceTextConfig3, priceTextConfig10, priceTextConfig5, priceTextConfig6, priceTextConfig7, discountTag, discountTag2, priceTextConfig8, priceTextConfig9, list2));
            AnonymousClass1862<C426160GnO> anonymousClass18622 = this.LLJILLL;
            String strLIZJ = C743702vL.LIZJ(singlePriceItem);
            String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
            String str3 = singlePriceItem.pricePrefix;
            String str4 = singlePriceItem.discountFormat;
            AnonymousClass1844 anonymousClass1844LIZ = AnonymousClass1843.LIZ(singlePriceItem);
            Integer num2 = singlePriceItem.priceDisplayMode;
            SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
            if (singlePriceHideInfo != null) {
                str = singlePriceHideInfo.displayText;
            } else {
                str = null;
            }
            anonymousClass18622.LJIJJLI(new C185I(strLIZJ, strLIZLLL, "", str3, str4, anonymousClass1844LIZ, false, num2, str, 192));
        }
        this.LLJJ.LJIILLIIL(true);
        this.LLJJ.LJIIZILJ(null, null, product.bagIndex, true);
    }
}
