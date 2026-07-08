package X;

import Y.ACListenerS166S0100000_32;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceHideInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.FlashSaleEnhancementConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.FlashSaleEnhancementCurveUiConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceUiConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.SeparatorConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleEnhancementInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveDaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS681S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1854, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1854 extends AnonymousClass1830 {
    public ConstraintLayout LLILZIL;
    public C18QS LLILZLL;
    public C18L9 LLIZ;
    public FrameLayout LLIZLLLIL;
    public C18L9 LLJ;
    public ViewGroup LLJI;
    public TuxIconView LLJIJIL;
    public C182N LLJILJIL;
    public final C212254184m LLJILJILJ;
    public final C185A LLJILLL;
    public final AnonymousClass1862<C426160GnO> LLJJ;
    public final C186B<ConstraintLayout> LLJJI;
    public final C185C LLJJIII;
    public final C212253184l LLJJIJI;
    public final C212252184k LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public C0NOH LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C212280185m LLJL;

    @Override // X.AnonymousClass1830
    public final String e0(View view) {
        return "c7998.d5945";
    }

    @Override // X.AnonymousClass1830
    public final int i0(View view) {
        return 3;
    }

    @Override // X.AnonymousClass1830
    public final void onDestroy() {
    }

    public final void p0() {
        this.LLJJL = -1;
        if (this.LLJJLIIIJLLLLLLLZ) {
            n0();
            LinearLayout seaFlashSaleEnhancementTagContainer = getSeaFlashSaleEnhancementTagContainer();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, seaFlashSaleEnhancementTagContainer);
            removeView(seaFlashSaleEnhancementTagContainer);
            FrameLayout seaFlashSaleEnhancementPriceContainer = getSeaFlashSaleEnhancementPriceContainer();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, seaFlashSaleEnhancementPriceContainer);
            removeView(seaFlashSaleEnhancementPriceContainer);
            this.LLJJLIIIJLLLLLLLZ = false;
        }
    }

    private final AnonymousClass1863 getSeaFlashSaleEnhancementPriceController() {
        return (AnonymousClass1863) this.LLJJJJ.getValue();
    }

    public final FrameLayout getEcommerceliveFansTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gkr);
            this.LLIZLLLIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxIconView getEcommerceliveIconCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl8);
            this.LLJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C18QS getEcommerceliveProductDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.glx);
            this.LLILZLL = (C18QS) callbackFindViewById;
        }
        return (C18QS) callbackFindViewById;
    }

    public final ConstraintLayout getEcommerceliveProductMainImageLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gm8);
            this.LLILZIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ViewGroup getEcommerceliveProductPriceLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmd);
            this.LLJI = (ViewGroup) callbackFindViewById;
        }
        return (ViewGroup) callbackFindViewById;
    }

    public final C18L9 getEcommercelivePromotionLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmk);
            this.LLJ = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    public final FrameLayout getSeaFlashSaleEnhancementPriceContainer() {
        return (FrameLayout) this.LLJJJ.getValue();
    }

    public final LinearLayout getSeaFlashSaleEnhancementTagContainer() {
        return (LinearLayout) this.LLJJIJIL.getValue();
    }

    public final AnonymousClass1855 getSeaFlashSaleEnhancementTagController() {
        return (AnonymousClass1855) this.LLJJJIL.getValue();
    }

    public final C18L9 getSellingPointOrUserRightViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.up2);
            this.LLIZ = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    public final boolean u0() {
        return this.LLJJJJLIIL != 0 && this.LLJJL == 2;
    }

    public final void z0() {
        C0NOH c0noh = this.LLJJJJJIL;
        if (c0noh != null) {
            c0noh.LIZJ();
        }
        this.LLJJJJJIL = null;
    }

    public final void n0() {
        getSeaFlashSaleEnhancementTagController().LJIIIZ(false);
        getSeaFlashSaleEnhancementTagController().destroy();
        getSeaFlashSaleEnhancementPriceController().LJIIIZ(false);
        getSeaFlashSaleEnhancementPriceController().destroy();
        this.LLJJ.LJIIIZ(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z0();
        p0();
        this.LLJILJILJ.LIZIZ();
        getSeaFlashSaleEnhancementTagController().destroy();
        getSeaFlashSaleEnhancementPriceController().destroy();
    }

    public final void B0(boolean z) {
        int id;
        C18L9 sellingPointOrUserRightViewFromXml = getSellingPointOrUserRightViewFromXml();
        if (sellingPointOrUserRightViewFromXml != null) {
            ViewGroup.LayoutParams layoutParams = sellingPointOrUserRightViewFromXml.getLayoutParams();
            if (layoutParams != null) {
                C19ME c19me = (C19ME) layoutParams;
                if (z) {
                    id = getSeaFlashSaleEnhancementTagContainer().getId();
                } else {
                    id = R.id.gmk;
                }
                c19me.topToBottom = id;
                C786410Ut5.W5(sellingPointOrUserRightViewFromXml, c19me);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    @Override // X.AnonymousClass1830
    public final Map<String, String> h0(View view) {
        Product product;
        LiveDaInfo liveDaInfo;
        HashMap<String, String> map;
        Product product2;
        BcmStandardTrack bcmStandardTrack;
        Map<String, String> map2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C185C c185c = this.LLJJIII;
        if (Intrinsics.LJFF(c185c.LIZJ, c185c.LIZ)) {
            c185c.LIZ.LJIIJJI(linkedHashMap);
        } else if (Intrinsics.LJFF(c185c.LIZJ, c185c.LIZIZ)) {
            c185c.LIZIZ.LJIIJ(linkedHashMap);
        }
        linkedHashMap.putAll(this.LLJJIJIIJIL.LIZIZ());
        linkedHashMap.put("card_type", "1");
        C185A c185a = this.LLJILLL;
        linkedHashMap.putAll(c185a.LJ);
        if (C123100dR.LIZ(c185a.LJI)) {
            linkedHashMap.put("title_label", c185a.LJI);
        }
        linkedHashMap.put("card_title", c185a.LJII);
        Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c7998.d5945", PageFinder.via((View) this), null, 4, null);
        if (!mapCreateReportParams$default.isEmpty()) {
            for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        C182N c182n = this.LLJILJIL;
        if (c182n != null && (product2 = c182n.LIZIZ) != null && (bcmStandardTrack = product2.bcmStandardTrack) != null && (map2 = bcmStandardTrack.trackParam) != null) {
            linkedHashMap.putAll(map2);
        }
        C182N c182n2 = this.LLJILJIL;
        if (c182n2 != null && (product = c182n2.LIZIZ) != null && (liveDaInfo = product.commonDaInfo) != null && (map = liveDaInfo.transDaInfo) != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public final void l0(boolean z) {
        this.LLJILLL.LJIIJJI(1);
        this.LLJJIJI.LJIIIZ(false);
        this.LLJJIII.LIZJ();
        this.LLJJIJIIJIL.LJIIIZ(false);
        this.LLJJ.LJIIIZ(!z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public final void s0(final Product product) {
        PromotionLabel promotionLabel;
        long j;
        long j2;
        List<PromotionLabel> list;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        Product product2;
        PromotionInfo promotionInfo;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        long j3;
        FlashSaleAtmosphere flashSaleAtmosphere;
        long j4;
        long j5;
        long j6;
        long j7;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2;
        C185G c185gLIZ;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        AnonymousClass1868 anonymousClass1868;
        PriceTextConfig priceTextConfig;
        FlashSaleEnhancementCurveUiConfig flashSaleEnhancementCurveUiConfig;
        PriceConfig priceConfig;
        B0(false);
        if (u0()) {
            this.LLJILLL.LJIIJJI(1);
            this.LLJJIJI.LJIIIZ(false);
            this.LLJJIII.LIZJ();
            this.LLJJIJIIJIL.LJIIIZ(false);
            if (!this.LLJJLIIIJLLLLLLLZ) {
                addView(getSeaFlashSaleEnhancementTagContainer());
                addView(getSeaFlashSaleEnhancementPriceContainer());
                this.LLJJLIIIJLLLLLLLZ = true;
            }
            z0();
            C182N c182n = this.LLJILJIL;
            if (c182n != null && (flashSaleAtmosphereInfo = c182n.LIZLLL) != null && (product2 = c182n.LIZIZ) != null && (promotionInfo = product2.promotionInfo) != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
                int i = this.LLJJJJLIIL;
                if (i != 1) {
                    if (i == 2) {
                        FlashSaleAtmosphere flashSaleAtmosphere2 = flashSaleAtmosphereInfo.flashSaleAtmosphere;
                        if (flashSaleAtmosphere2 != null && (c185gLIZ = C185B.LIZ(flashSaleAtmosphereInfo)) != null) {
                            C185H c185h = new C185H(c185gLIZ.LIZLLL, c185gLIZ.LJII, C185B.LIZIZ(flashSaleAtmosphereInfo), c185gLIZ.LJIIIIZZ, c185gLIZ.LJI);
                            FlashSaleEnhancementConfig flashSaleEnhancementConfig = flashSaleAtmosphereInfo.LIZ;
                            String str6 = flashSaleAtmosphere2.formatOriginPrice;
                            List<String> list2 = flashSaleAtmosphere2.animatorPriceList;
                            if (list2 != null) {
                                str = (String) C13LP.LJJLIIIJL(list2);
                            } else {
                                str = null;
                            }
                            String str7 = flashSaleAtmosphere2.formatPrice;
                            String str8 = singlePriceItem.pricePrefix;
                            String str9 = flashSaleAtmosphere2.discount;
                            AnonymousClass1844 anonymousClass1844LIZ = AnonymousClass1843.LIZ(singlePriceItem);
                            List<String> list3 = flashSaleAtmosphere2.animatorDisplayPriceList;
                            if (list3 != null) {
                                str2 = (String) C13LP.LJJLIIIJL(list3);
                            } else {
                                str2 = null;
                            }
                            List<String> list4 = flashSaleAtmosphere2.animatorPriceDecimalList;
                            if (list4 != null) {
                                str3 = (String) C13LP.LJJLIIIJL(list4);
                            } else {
                                str3 = null;
                            }
                            List<String> list5 = flashSaleAtmosphere2.animatorPriceIntegerList;
                            if (list5 != null) {
                                str4 = (String) C13LP.LJJLIIIJL(list5);
                            } else {
                                str4 = null;
                            }
                            AnonymousClass1844 anonymousClass1844LIZ2 = AnonymousClass1844.LIZ(anonymousClass1844LIZ, str2, str4, str3, 35);
                            if (flashSaleAtmosphere2.status == 3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Integer num = singlePriceItem.priceDisplayMode;
                            SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
                            if (singlePriceHideInfo != null) {
                                str5 = singlePriceHideInfo.displayText;
                            } else {
                                str5 = null;
                            }
                            C185I c185i = new C185I(str6, str, str7, str8, str9, anonymousClass1844LIZ2, z, num, str5, 128);
                            if (flashSaleEnhancementConfig != null && (priceConfig = flashSaleEnhancementConfig.curvePriceUiConfig) != null) {
                                anonymousClass1868 = new AnonymousClass1868(priceConfig.currency, priceConfig.prefix, priceConfig.formatOriginPrice, priceConfig.formatAvailablePrice, priceConfig.formatAvailablePriceInteger, priceConfig.formatAvailablePriceDecimal, priceConfig.formatAvailablePricePoint, priceConfig.discount, priceConfig.flashSaleDiscount, priceConfig.exceedFormatOriginPrice, priceConfig.exceedDiscount, priceConfig.discountDisplayOrder);
                            } else {
                                anonymousClass1868 = null;
                                if (flashSaleEnhancementConfig == null) {
                                    priceTextConfig = null;
                                    flashSaleEnhancementCurveUiConfig = null;
                                }
                                C185K c185k = new C185K(c185i, c185h, anonymousClass1868, priceTextConfig, flashSaleEnhancementCurveUiConfig);
                                l0(true);
                                B0(false);
                                getSeaFlashSaleEnhancementTagController().LJIIIZ(false);
                                getSeaFlashSaleEnhancementTagController().destroy();
                                getSeaFlashSaleEnhancementPriceController().LJJIIJZLJL(c185k);
                                getSeaFlashSaleEnhancementPriceController().LJJIIZI();
                            }
                            priceTextConfig = flashSaleEnhancementConfig.curveTextUiConfig;
                            flashSaleEnhancementCurveUiConfig = flashSaleEnhancementConfig.curveUiConfig;
                            C185K c185k2 = new C185K(c185i, c185h, anonymousClass1868, priceTextConfig, flashSaleEnhancementCurveUiConfig);
                            l0(true);
                            B0(false);
                            getSeaFlashSaleEnhancementTagController().LJIIIZ(false);
                            getSeaFlashSaleEnhancementTagController().destroy();
                            getSeaFlashSaleEnhancementPriceController().LJJIIJZLJL(c185k2);
                            getSeaFlashSaleEnhancementPriceController().LJJIIZI();
                        } else {
                            n0();
                            return;
                        }
                    }
                } else {
                    List<PromotionLabel> list6 = promotionInfo.promotionLabels;
                    C212280185m c212280185m = this.LLJL;
                    if (c212280185m != null) {
                        j3 = c212280185m.LIZIZ;
                    } else {
                        j3 = 0;
                    }
                    C185F c185fLIZJ = C185B.LIZJ(flashSaleAtmosphereInfo, list6, j3);
                    if (c185fLIZJ == null) {
                        z0();
                        n0();
                        return;
                    }
                    boolean z2 = c185fLIZJ.LJIIIZ;
                    l0(false);
                    B0(z2);
                    getSeaFlashSaleEnhancementPriceController().LJIIIZ(false);
                    getSeaFlashSaleEnhancementPriceController().destroy();
                    AnonymousClass1855 seaFlashSaleEnhancementTagController = getSeaFlashSaleEnhancementTagController();
                    seaFlashSaleEnhancementTagController.LIZLLL = c185fLIZJ;
                    seaFlashSaleEnhancementTagController.LJ = -2;
                    seaFlashSaleEnhancementTagController.LJIJJLI();
                    AnonymousClass1855 seaFlashSaleEnhancementTagController2 = getSeaFlashSaleEnhancementTagController();
                    int i2 = this.LLJJL;
                    if (seaFlashSaleEnhancementTagController2.LJ != i2) {
                        seaFlashSaleEnhancementTagController2.LJ = i2;
                        seaFlashSaleEnhancementTagController2.LJIJJ();
                    }
                    getSeaFlashSaleEnhancementTagController().LJIIIZ(true);
                    if (z2) {
                        this.LLJJIII.LIZIZ(product2.userRightView, product2.sellingView);
                    }
                }
                if (!u0()) {
                    z0();
                    return;
                }
                C182N c182n2 = this.LLJILJIL;
                if (c182n2 != null && (flashSaleAtmosphereInfo2 = c182n2.LIZLLL) != null) {
                    flashSaleAtmosphere = flashSaleAtmosphereInfo2.flashSaleAtmosphere;
                } else {
                    flashSaleAtmosphere = null;
                }
                if (flashSaleAtmosphere != null) {
                    j4 = flashSaleAtmosphere.startTime;
                    j5 = flashSaleAtmosphere.endTime;
                } else {
                    j4 = 0;
                    j5 = 0;
                }
                C212280185m c212280185m2 = this.LLJL;
                if (c212280185m2 != null) {
                    j6 = c212280185m2.LIZ;
                    j7 = c212280185m2.LIZIZ;
                } else {
                    j6 = 0;
                    j7 = 0;
                }
                C0NOI c0noiLIZ = C0NOL.LIZ(j4, j5, j6, j7);
                if (c0noiLIZ == null) {
                    z0();
                    return;
                }
                z0();
                C0NOH c0noh = new C0NOH();
                c0noh.LIZLLL(c0noiLIZ);
                c0noh.LIZ(new AwS681S0100000_32(this, 11));
                if (c0noh.LIZIZ()) {
                    C0NOH.LJ(c0noh);
                    if (c0noh.LIZJ == 2) {
                        getSeaFlashSaleEnhancementTagController().LJJI(c0noh.LIZ);
                    }
                }
                this.LLJJJJJIL = c0noh;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        PromotionInfo promotionInfo2 = product.promotionInfo;
        if (promotionInfo2 != null && (list = promotionInfo2.promotionLabels) != null) {
            promotionLabel = null;
            for (PromotionLabel promotionLabel2 : list) {
                if (C19676311yb.LIZLLL(promotionLabel2)) {
                    promotionLabel = promotionLabel2;
                } else {
                    arrayList.add(promotionLabel2);
                }
            }
        } else {
            promotionLabel = null;
        }
        this.LLJJIJI.LJIIJ(promotionLabel);
        ?? LJFF = this.LLJJIJI.LJFF();
        ?? r6 = LJFF;
        if (this.LLJJIII.LIZIZ(product.userRightView, product.sellingView)) {
            r6 = LJFF + 1;
        }
        if (r6 < 2) {
            C212252184k c212252184k = this.LLJJIJIIJIL;
            c212252184k.LIZIZ = new InterfaceC212286185s() { // from class: X.185P
                @Override // X.InterfaceC212286185s
                public final void LIZ() {
                    if (!this.LIZ.u0()) {
                        this.LIZ.s0(product);
                        return;
                    }
                    AnonymousClass1854 anonymousClass1854 = this.LIZ;
                    anonymousClass1854.LLJILLL.LJIIJJI(1);
                    anonymousClass1854.LLJJIJI.LJIIIZ(false);
                    anonymousClass1854.LLJJIII.LIZJ();
                    anonymousClass1854.LLJJIJIIJIL.LJIIIZ(false);
                }
            };
            C212280185m c212280185m3 = this.LLJL;
            if (c212280185m3 != null) {
                j = c212280185m3.LIZ;
                j2 = c212280185m3.LIZIZ;
            } else {
                j = 0;
                j2 = 0;
            }
            c212252184k.LJIILL(new C212257184p(arrayList, j, j2, true, 96));
            ?? r62 = r6;
            if (this.LLJJIJIIJIL.LJFF()) {
                r62 = r6 + 1;
            }
            if (r62 < 2) {
                this.LLJILLL.LJIIJJI(2);
                return;
            }
        }
        this.LLJILLL.LJIIJJI(1);
    }

    public final void setEcommerceliveFansTagFromXml(FrameLayout frameLayout) {
        this.LLIZLLLIL = frameLayout;
    }

    public final void setEcommerceliveIconCloseFromXml(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setEcommerceliveProductDescFromXml(C18QS c18qs) {
        this.LLILZLL = c18qs;
    }

    public final void setEcommerceliveProductMainImageLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLILZIL = constraintLayout;
    }

    public final void setEcommerceliveProductPriceLayoutFromXml(ViewGroup viewGroup) {
        this.LLJI = viewGroup;
    }

    public final void setEcommercelivePromotionLayoutFromXml(C18L9 c18l9) {
        this.LLJ = c18l9;
    }

    public final void setSellingPointOrUserRightViewFromXml(C18L9 c18l9) {
        this.LLIZ = c18l9;
    }

    @Override // X.AnonymousClass1830
    public final void j0(C182N c182n, long j) {
        List<PlacementLabel> list;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        C19344610mC c19344610mC;
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
        List<String> list2;
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
        PromotionStyleConfig promotionStyleConfig;
        PromotionLabelConfig promotionLabelConfig;
        SeparatorConfig separatorConfig;
        FlashSaleAtmosphere flashSaleAtmosphere;
        int i;
        this.LLJILJIL = c182n;
        Product product = c182n.LIZIZ;
        if (product == null) {
            return;
        }
        this.LLJL = new C212280185m(j);
        ECImage eCImage = product.cover;
        if (eCImage != null && C703302op.LIZ(eCImage.url)) {
            this.LLJJI.LJIILL(C1743690vTb.LJI(eCImage.url, 216, 216, EnumC1769850w9n.LIVE_POP_CARD), null);
        }
        if (C0A0F.LIZ()) {
            C18QS ecommerceliveProductDescFromXml = getEcommerceliveProductDescFromXml();
            if (ecommerceliveProductDescFromXml != null) {
                ecommerceliveProductDescFromXml.setTuxFont(52);
            }
            C18L9 ecommercelivePromotionLayoutFromXml = getEcommercelivePromotionLayoutFromXml();
            if (ecommercelivePromotionLayoutFromXml != null) {
                ViewGroup.LayoutParams layoutParams = ecommercelivePromotionLayoutFromXml.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    C786410Ut5.W5(ecommercelivePromotionLayoutFromXml, marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            C18L9 sellingPointOrUserRightViewFromXml = getSellingPointOrUserRightViewFromXml();
            if (sellingPointOrUserRightViewFromXml != null) {
                ViewGroup.LayoutParams layoutParams2 = sellingPointOrUserRightViewFromXml.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    C786410Ut5.W5(sellingPointOrUserRightViewFromXml, marginLayoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
        }
        C185A c185a = this.LLJILLL;
        String str2 = product.title;
        PromotionInfo promotionInfo = product.promotionInfo;
        if (promotionInfo != null) {
            list = promotionInfo.placementLabels;
        } else {
            list = null;
        }
        c185a.LJIIJ(new C212276185i(str2, list));
        z0();
        p0();
        this.LLJJJJLIIL = 0;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = c182n.LIZLLL;
        if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null) {
            FlashSaleEnhancementInfo flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo;
            if (flashSaleEnhancementInfo != null) {
                i = flashSaleEnhancementInfo.enhancementStyle;
            } else {
                i = 0;
            }
            this.LLJJJJLIIL = i;
            if (i != 0) {
                this.LLJJL = 0;
                if (flashSaleAtmosphere.endTime > j && flashSaleAtmosphere.status == 3) {
                    this.LLJJL = 2;
                }
            }
        }
        PromotionInfo promotionInfo2 = product.promotionInfo;
        if (promotionInfo2 != null && (promotionStyleConfig = promotionInfo2.styleConfig) != null && (promotionLabelConfig = promotionStyleConfig.promotionLabelConfig) != null && (separatorConfig = promotionLabelConfig.separator) != null) {
            getSeaFlashSaleEnhancementTagController().LJIL(separatorConfig);
            C18L9 ecommercelivePromotionLayoutFromXml2 = getEcommercelivePromotionLayoutFromXml();
            if (ecommercelivePromotionLayoutFromXml2 != null) {
                ecommercelivePromotionLayoutFromXml2.setDividerSymbol(separatorConfig);
            }
            C18L9 ecommercelivePromotionLayoutFromXml3 = getEcommercelivePromotionLayoutFromXml();
            if (ecommercelivePromotionLayoutFromXml3 != null) {
                ecommercelivePromotionLayoutFromXml3.setChildHorizontalMargin(0);
            }
        }
        s0(product);
        PromotionInfo promotionInfo3 = product.promotionInfo;
        if (promotionInfo3 != null && (promotionProductPrice = promotionInfo3.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
            AnonymousClass1844 anonymousClass1844LIZ = AnonymousClass1843.LIZ(singlePriceItem);
            AnonymousClass1862<C426160GnO> anonymousClass1862 = this.LLJJ;
            if (anonymousClass1844LIZ.LIZIZ()) {
                c19344610mC = new C19344610mC() { // from class: X.10m5
                    @Override // X.C19344610mC, X.C19345310mJ, X.C186V
                    public final int LIZLLL() {
                        return R.attr.a1k;
                    }

                    {
                        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        new C19344010m6() { // from class: X.10m4
                            {
                                Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)));
                            }
                        };
                    }
                };
            } else {
                c19344610mC = new C19344610mC(0, 0, null, 8191);
            }
            anonymousClass1862.LJIILIIL(c19344610mC);
            anonymousClass1862.LJI.LJ(c19344610mC);
            AnonymousClass1862<C426160GnO> anonymousClass18622 = this.LLJJ;
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
            } else {
                list2 = null;
            }
            anonymousClass18622.LJIL(new AnonymousClass1868(priceTextConfig, priceTextConfig2, priceTextConfig3, priceTextConfig4, priceTextConfig5, priceTextConfig6, priceTextConfig7, discountTag, discountTag2, priceTextConfig8, priceTextConfig9, list2));
            AnonymousClass1862<C426160GnO> anonymousClass18623 = this.LLJJ;
            String strLIZJ = C743702vL.LIZJ(singlePriceItem);
            String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
            String str3 = singlePriceItem.pricePrefix;
            String str4 = singlePriceItem.discountFormat;
            Integer num = singlePriceItem.priceDisplayMode;
            SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
            if (singlePriceHideInfo != null) {
                str = singlePriceHideInfo.displayText;
            } else {
                str = null;
            }
            anonymousClass18623.LJIJJLI(new C185I(strLIZJ, strLIZLLL, "", str3, str4, anonymousClass1844LIZ, false, num, str, 192));
        }
        this.LLJJI.LJIILLIIL(true);
        this.LLJJI.LJIIZILJ(null, null, product.bagIndex, true);
        if (this.LLJILLL.LJFF() && C0A0F.LIZ()) {
            this.LLJJ.LJIILJJIL();
        }
    }

    public AnonymousClass1854(Context context, AttributeSet attributeSet, int i) {
        C0HAI c0gse;
        AnonymousClass1862<C426160GnO> anonymousClass1862;
        super(context, attributeSet, i);
        C212254184m c212254184m = new C212254184m();
        this.LLJILJILJ = c212254184m;
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS548S0100000_4(context, 428));
        this.LLJJJ = C452501pT.LIZIZ(new AwS548S0100000_4(context, 427));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 504));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 503));
        this.LLJJL = -1;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.z5);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(contextThemeWrapper);
        if (C0A0F.LIZ()) {
            C786410Ut5.Sd(R.layout.bwc, layoutInflaterNe, this);
        } else {
            C786410Ut5.Sd(R.layout.bwb, layoutInflaterNe, this);
        }
        setBackground(C800330VaR.LIZIZ(contextThemeWrapper, R.drawable.bmh));
        C186B<ConstraintLayout> c186b = new C186B<>(getEcommerceliveProductMainImageLayoutFromXml(), new C428480Gr8());
        c186b.LJIJI(new C428500GrA() { // from class: X.0GrD
            public final int LJIILL;
            public final Integer LJIILLIIL;
            public final Integer LJIIZILJ;
            public final float LJIJ;
            public final int LJIJI;
            public final float LJIJJ;
            public final Integer LJIJJLI;
            public final boolean LJIL;
            public final int LJJ;
            public final float LJJI;
            public final EnumC429150GsD LJJIFFI;
            public final int LJJII;
            public final int LJJIII;
            public final int LJJIIJ;

            {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78));
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                float fLIZIZ = C418440Gaw.LIZIZ(8);
                Integer numValueOf3 = Integer.valueOf(R.attr.wm);
                float fLIZIZ2 = C418440Gaw.LIZIZ(6);
                EnumC429150GsD enumC429150GsD = EnumC429150GsD.NORMAL;
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
                this.LJIILL = iLIZIZ;
                this.LJIILLIIL = numValueOf;
                this.LJIIZILJ = numValueOf2;
                this.LJIJ = fLIZIZ;
                this.LJIJI = R.attr.uk;
                this.LJIJJ = 0.0f;
                this.LJIJJLI = numValueOf3;
                this.LJIL = false;
                this.LJJ = R.attr.e3;
                this.LJJI = fLIZIZ2;
                this.LJJIFFI = enumC429150GsD;
                this.LJJII = iLIZIZ2;
                this.LJJIII = iLIZIZ3;
                this.LJJIIJ = iLIZIZ4;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final Integer LJIIJ() {
                return Integer.valueOf(this.LJJII);
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final Integer LJIIL() {
                return Integer.valueOf(this.LJJIII);
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final float LIZ() {
                return this.LJIJ;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final Integer LIZIZ() {
                return this.LJIIZILJ;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final int LIZJ() {
                return this.LJJIIJ;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final float LIZLLL() {
                return this.LJJI;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final float LJFF() {
                return this.LJIJJ;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final int LJI() {
                return this.LJJ;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final boolean LJII() {
                return this.LJIL;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final int LJIIIIZZ() {
                return this.LJIILL;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final EnumC429150GsD LJIIIZ() {
                return this.LJJIFFI;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final int LJIIJJI() {
                return this.LJIJI;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final Integer getBgColor() {
                return this.LJIJJLI;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final Integer getMarginTop() {
                return this.LJIILLIIL;
            }
        });
        this.LLJJI = c186b;
        this.LLJILLL = new C185A(getEcommerceliveProductDescFromXml());
        C185C c185c = new C185C(getSellingPointOrUserRightViewFromXml());
        if (C0A0F.LIZ()) {
            c0gse = new C212285185r();
        } else {
            c0gse = new C0GSE(false, 0, 0, 2047);
        }
        C19340910lb c19340910lb = new C19340910lb() { // from class: X.10lc
            public final int LJIIL;
            public final int LJIILIIL;
            public final int LJIILJJIL;
            public final int LJIILL;
            public final float LJIILLIIL;
            public final int LJIIZILJ;
            public final int LJIJ;
            public final int LJIJI;

            {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                this.LJIIL = 0;
                this.LJIILIIL = iLIZIZ;
                this.LJIILJJIL = 0;
                this.LJIILL = R.attr.uk;
                this.LJIILLIIL = 0.0f;
                this.LJIIZILJ = iLIZIZ2;
                this.LJIJ = R.attr.fy;
                this.LJIJI = 81;
            }

            @Override // X.C19340910lb, X.C0HAI
            public final int LIZIZ() {
                return this.LJIJI;
            }

            @Override // X.C19340910lb, X.C0HAI
            public final int LIZJ() {
                return this.LJIJ;
            }

            @Override // X.C19340910lb, X.C0HAI
            public final float LIZLLL() {
                return this.LJIILLIIL;
            }

            @Override // X.C19340910lb, X.C0HAI
            public final int LJ() {
                return this.LJIILJJIL;
            }

            @Override // X.C19340910lb, X.C0HAI
            public final int LJFF() {
                return this.LJIIZILJ;
            }

            @Override // X.C19340910lb, X.C0HAI
            public final int LJII() {
                return this.LJIIL;
            }

            @Override // X.C19340910lb, X.C0HAI
            public final int LJIIIZ() {
                return this.LJIILL;
            }

            @Override // X.C19340910lb, X.C0HAI
            public final int getItemHeight() {
                return this.LJIILIIL;
            }
        };
        c185c.LIZLLL = c0gse;
        c185c.LJ = c19340910lb;
        this.LLJJIII = c185c;
        this.LLJJIJI = new C212253184l(getEcommerceliveFansTagFromXml());
        C212252184k c212252184k = new C212252184k(getEcommercelivePromotionLayoutFromXml(), null);
        c212252184k.LJFF = C182X.LIZ();
        this.LLJJIJIIJIL = c212252184k;
        if (C0A0F.LIZ()) {
            anonymousClass1862 = new AnonymousClass1862<>(getEcommerceliveProductPriceLayoutFromXml(), new C186Q());
        } else {
            anonymousClass1862 = new AnonymousClass1862<>(getEcommerceliveProductPriceLayoutFromXml(), new C186R());
        }
        C19344610mC c19344610mC = new C19344610mC(0, 0, null, 8191);
        anonymousClass1862.LJIILIIL(c19344610mC);
        anonymousClass1862.LJI.LJ(c19344610mC);
        this.LLJJ = anonymousClass1862;
        c212254184m.LIZ(c212252184k);
        c212254184m.LIZ(c186b);
        C786410Ut5.a9(getEcommerceliveIconCloseFromXml(), new ACListenerS166S0100000_32(this, 70));
    }
}
