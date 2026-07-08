package X;

import Y.ALAdapterS1S1200000_32;
import Y.ALAdapterS24S0100000_29;
import Y.ALAdapterS2S0201000_32;
import Y.ALAdapterS5S0101000_32;
import Y.ALAdapterS5S0210000_32;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.Img;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionSticker;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceHideInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceUiConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.SeparatorConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ActionCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.DepositPrice;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingItem;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.TextDisplay;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.TopBrand;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.PinCardRefactorSettings;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.oec_msg.BagIndex;
import webcast.data.oec_msg.LiveFlashSaleInfo;
import webcast.data.oec_msg.ProductItem;
import webcast.data.oec_msg.ShopBrandLogo;
import webcast.data.oec_msg.Title;

/* JADX INFO: renamed from: X.183d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212219183d extends AbstractC21202317y9 implements InterfaceC21204817yY {
    public ViewGroup LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public C18L9 LLJIJIL;
    public C197039127h LLJILJIL;
    public C185U LLJILJILJ;
    public C18QT LLJILLL;
    public ConstraintLayout LLJJ;
    public FrameLayout LLJJI;
    public C18L9 LLJJIII;
    public C18L9 LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public LinearLayout LLJJJ;
    public TuxIconView LLJJJIL;
    public C14L7 LLJJJJ;
    public C14L7 LLJJJJJIL;
    public View LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public ConstraintLayout LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public final C0HAL LLJLILLLLZIIL;
    public final C212230183o LLJLL;
    public final C212198182i LLJLLIL;
    public final C184R<C426160GnO> LLJLLL;
    public final C184D LLJZ;
    public final C186F<ConstraintLayout> LLJZIJLIL;
    public final C184W LLL;
    public final C184W LLLF;
    public final C212224183i LLLFF;
    public final C212228183m LLLFFI;
    public final C212229183n LLLFZ;
    public final C212232183q LLLI;
    public final C01GW LLLII;
    public Animator LLLIIII;
    public int LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public final C01GW LLLIL;

    public static /* synthetic */ void getLivePinCardMinimalism$annotations() {
    }

    private final InterfaceC212223183h getPopCardStyle() {
        return (InterfaceC212223183h) this.LLLII.getValue();
    }

    private final View getVisibleBtn() {
        return (this.LLLFF.LJI() ? this.LLLFF : this.LLJLL).LIZ;
    }

    @Override // X.InterfaceC21204817yY
    public final void LJI() {
        PromotionInfo promotionInfo;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        String str;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        FlashSaleAtmosphere flashSaleAtmosphere;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("hideAtmosphereAndPromotionThenShowHidePrice");
        this.LLJZ.LJIILL(new ArrayList());
        this.LLLFFI.LJIIJ(false);
        this.LLL.LJIIJ(false);
        this.LLLF.LJIIJ(false);
        UsPopupCardVO usPopupCardVO = this.LLIZ;
        if (usPopupCardVO != null && (promotionInfo = usPopupCardVO.promotionInfo) != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
            singlePriceItem.setPriceDisplayMode(1);
            C184R<C426160GnO> c184r = this.LLJLLL;
            String strLIZJ = C743702vL.LIZJ(singlePriceItem);
            String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
            String str2 = singlePriceItem.pricePrefix;
            String str3 = singlePriceItem.discountFormat;
            C212225183j c212225183jLIZ = C212227183l.LIZ(singlePriceItem);
            UsPopupCardVO usPopupCardVO2 = this.LLIZ;
            boolean z = (usPopupCardVO2 == null || (flashSaleAtmosphereInfo = usPopupCardVO2.flashSaleAtmosphereInfo) == null || (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) == null || flashSaleAtmosphere.status != 3) ? false : true;
            boolean zZ0 = Z0();
            Integer num = singlePriceItem.priceDisplayMode;
            SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
            DepositPrice depositPrice = null;
            String str4 = singlePriceHideInfo != null ? singlePriceHideInfo.displayText : null;
            UsPopupCardVO usPopupCardVO3 = this.LLIZ;
            if (usPopupCardVO3 != null) {
                depositPrice = usPopupCardVO3.depositPrice;
                str = usPopupCardVO3.afterCouponPriceContent;
            } else {
                str = null;
            }
            c184r.LJIJI(new C184S(strLIZJ, strLIZLLL, str2, str3, c212225183jLIZ, z, zZ0, num, str4, depositPrice, str));
        }
        F0();
    }

    @Override // X.InterfaceC21197417xM
    public final void LJJIL() {
        UsPopupCardVO usPopupCardVO = this.LLIZ;
        if (usPopupCardVO == null || !usPopupCardVO.isInStock()) {
            C184D c184d = this.LLJZ;
            c184d.getClass();
            c184d.LJIILIIL(AnonymousClass0207.get$arr$(103));
        }
        this.LLJZ.LJIILLIIL(null, null);
    }

    public final void M0() {
        Animator animator = this.LLLIIII;
        if (animator != null) {
            animator.cancel();
        }
        C184R<C426160GnO> c184r = this.LLJLLL;
        TuxTextView tuxTextView = c184r.LJIILIIL;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 1.0f);
        }
        TuxTextView tuxTextView2 = c184r.LJIIL;
        if (tuxTextView2 != null) {
            C786410Ut5.B5(tuxTextView2, 1.0f);
        }
        this.LLLI.LJIIIIZZ();
        C18QT ecommerceliveProductDescFromXml = getEcommerceliveProductDescFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(ecommerceliveProductDescFromXml);
        ecommerceliveProductDescFromXml.setTranslationY(0.0f);
        this.LLJLILLLLZIIL.LJIIIIZZ();
        this.LLL.LJIIIIZZ();
        this.LLLF.LJIIIIZZ();
        this.LLLFFI.LJIIIIZZ();
        C786410Ut5.bd(0.0f, (ViewGroup) this.LLLFFI.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T0() {
        /*
            r15 = this;
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r0 = r15.LLIZ
            r2 = 0
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo r0 = r0.promotionInfo
            if (r0 == 0) goto L93
            java.util.List<com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel> r0 = r0.promotionLabels
            if (r0 == 0) goto L93
            java.util.Iterator r1 = r0.iterator()
        L11:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r7 = r1.next()
            r0 = r7
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel r0 = (com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel) r0
            boolean r0 = X.C212258184q.LJ(r0)
            if (r0 == 0) goto L11
        L24:
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel r7 = (com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel) r7
        L26:
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r0 = r15.LLIZ
            if (r0 == 0) goto L8f
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo r6 = r0.flashSaleAtmosphereInfo
        L2c:
            if (r7 == 0) goto L87
            if (r6 == 0) goto L87
            X.183m r1 = r15.LLLFFI
            X.183t r4 = new X.183t
            boolean r0 = X.C2533209wI.LIZ()
            if (r0 == 0) goto L8d
            X.183q r0 = r15.LLLI
            boolean r0 = r0.LJI()
            if (r0 == 0) goto L8d
            int r0 = r15.LLLIIIIL
            r5 = 1
            if (r0 == r5) goto L8d
        L47:
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r3 = r15.LLIZ
            r10 = 0
            if (r3 == 0) goto L8a
            long r8 = r3.createTime
            long r10 = r3.serverTime
        L51:
            if (r3 == 0) goto L5b
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo r0 = r3.promotionInfo
            if (r0 == 0) goto L5b
            java.util.List<com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel> r12 = r0.promotionLabels
            if (r12 != 0) goto L5d
        L5b:
            X.13BV r12 = X.C13BV.INSTANCE
        L5d:
            if (r3 == 0) goto L67
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo r0 = r3.promotionInfo
            if (r0 == 0) goto L67
            java.util.List<com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel> r13 = r0.secondPromotionLabels
            if (r13 != 0) goto L69
        L67:
            X.13BV r13 = X.C13BV.INSTANCE
        L69:
            if (r3 == 0) goto L88
            int r14 = r3.weakenLiveFlashSaleAtmosphere
        L6d:
            r4.<init>(r5, r6, r7, r8, r10, r12, r13, r14)
            T extends android.view.View r0 = r1.LIZ
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C786410Ut5.LJJJJI(r0)
            r0 = -2
            r1.LJIIIIZZ = r0
            r0 = -1
            r1.LJIIL = r0
            r1.LJIILIIL = r0
            r1.LJIIIZ = r2
            r1.LJIIJ = r2
            r1.LJIILJJIL = r2
            r1.LJII = r4
        L87:
            return
        L88:
            r14 = 0
            goto L6d
        L8a:
            r8 = 0
            goto L51
        L8d:
            r5 = 2
            goto L47
        L8f:
            r6 = r2
            goto L2c
        L91:
            r7 = r2
            goto L24
        L93:
            r7 = r2
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212219183d.T0():void");
    }

    public final boolean Z0() {
        UsPopupCardVO usPopupCardVO;
        PromotionInfo promotionInfo;
        int i = this.LLLIIIIL;
        return ((i != -1 && i != 0) || (usPopupCardVO = this.LLIZ) == null || (promotionInfo = usPopupCardVO.promotionInfo) == null || promotionInfo.prelaunchPromotionLabel == null) ? false : true;
    }

    public final C14L7 getBenefitsVerticalLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bw5);
            this.LLJJJJ = (C14L7) callbackFindViewById;
        }
        return (C14L7) callbackFindViewById;
    }

    @Override // X.AbstractC21202317y9, X.AbstractC21202917yF
    public Map<String, String> getCommonShowParams() {
        String strLJJLIIIJ;
        PromotionInfo promotionInfo;
        List<PlacementLabel> list;
        Object obj;
        String string;
        PromotionInfo promotionInfo2;
        PromotionLabel promotionLabel;
        Map<String, Object> map;
        Object obj2;
        String string2;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        String strLIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LLILZLL);
        String strLJIILJJIL = this.LLL.LJIILJJIL();
        if (strLJIILJJIL != null) {
            linkedHashMap.put("flashsale_status", strLJIILJJIL);
        }
        String strLJIILJJIL2 = this.LLLF.LJIILJJIL();
        if (strLJIILJJIL2 != null) {
            linkedHashMap.put("flashsale_status", strLJIILJJIL2);
        }
        String strLJIILIIL = this.LLL.LJIILIIL();
        if (strLJIILIIL != null) {
            linkedHashMap.put("countdown_type", strLJIILIIL);
        }
        String strLJIILIIL2 = this.LLLF.LJIILIIL();
        if (strLJIILIIL2 != null) {
            linkedHashMap.put("countdown_type", strLJIILIIL2);
        }
        linkedHashMap.put("is_free_shipping", (this.LLL.LJ || this.LLLF.LJ || this.LLLFFI.LJIIL().LJ) ? "1" : CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("promotion_label_level", "3");
        UsPopupCardVO usPopupCardVO = this.LLIZ;
        if (usPopupCardVO == null || (flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo) == null || (strLIZ = C21206417yo.LIZ(flashSaleAtmosphereInfo, usPopupCardVO.serverTime, usPopupCardVO.showAtmosphereBeginMilliSecond, usPopupCardVO.flashSaleStockLimit)) == null) {
            TuxTextView tuxTextView = this.LLLFFI.LJFF;
            if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
                linkedHashMap.put("label_type", "live_flash_sale_only_left");
            }
        } else {
            linkedHashMap.put("label_type", strLIZ);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LLL.LJIIL());
        arrayList.addAll(this.LLLF.LJIIL());
        ArrayList arrayList2 = new ArrayList();
        UsPopupCardVO usPopupCardVO2 = this.LLIZ;
        if (usPopupCardVO2 != null && (promotionInfo2 = usPopupCardVO2.promotionInfo) != null && (promotionLabel = promotionInfo2.prelaunchPromotionLabel) != null && (map = promotionLabel.daInfo) != null && (obj2 = map.get("activity_name")) != null && (string2 = obj2.toString()) != null && C123100dR.LIZ(string2)) {
            arrayList2.add(string2);
        }
        ArrayList arrayList3 = new ArrayList();
        UsPopupCardVO usPopupCardVO3 = this.LLIZ;
        if (usPopupCardVO3 != null && (promotionInfo = usPopupCardVO3.promotionInfo) != null && (list = promotionInfo.placementLabels) != null) {
            Iterator<PlacementLabel> it2 = list.iterator();
            while (it2.hasNext()) {
                List<PromotionLabel> list2 = it2.next().placementLabelList;
                if (list2 != null) {
                    Iterator<PromotionLabel> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        Map<String, Object> map2 = it3.next().daInfo;
                        if (map2 != null && (obj = map2.get("activity_name")) != null && (string = obj.toString()) != null && C123100dR.LIZ(string)) {
                            arrayList3.add(string);
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) C13LP.LJLIL(arrayList3, C13LP.LJLIL(arrayList2, arrayList));
        if (arrayList4.isEmpty()) {
            strLJJLIIIJ = "";
        } else {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : arrayList4) {
                if (C123100dR.LIZ((String) obj3)) {
                    arrayList5.add(obj3);
                }
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList5, ",", null, null, 0, null, null, 62);
        }
        linkedHashMap.put("activity_name", strLJJLIIIJ);
        return linkedHashMap;
    }

    public final C197039127h getEcommerceliveBtnBuyFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gke);
            this.LLJILJIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final LinearLayout getEcommerceliveCreatorExclusivePricePreheatLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gkn);
            this.LLJJJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getEcommerceliveIconAssistantFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl7);
            this.LLJJIJIIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getEcommerceliveIconCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl8);
            this.LLJJJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getEcommerceliveLiveExclusiveFlashSaleLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gla);
            this.LLJJIJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C14L7 getEcommerceliveLiveExclusiveFlashSaleLayoutFromXmlV4() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gla);
            this.LLJJJJJIL = (C14L7) callbackFindViewById;
        }
        return (C14L7) callbackFindViewById;
    }

    public final View getEcommerceliveNextActionDividerLineFromXml() {
        View view = this.LLJJJJLIIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.gll);
        this.LLJJJJLIIL = viewFindViewById;
        return viewFindViewById;
    }

    public final ConstraintLayout getEcommerceliveNextActionLowerLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gln);
            this.LLJJL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ConstraintLayout getEcommerceliveNextActionUpperLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.glq);
            this.LLJJLIIIJLLLLLLLZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxTextView getEcommerceliveProductAfterCouponPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gk_);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final FrameLayout getEcommerceliveProductAtmosphereLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.glw);
            this.LLJJI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C18QT getEcommerceliveProductDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.glx);
            this.LLJILLL = (C18QT) callbackFindViewById;
        }
        return (C18QT) callbackFindViewById;
    }

    public final ConstraintLayout getEcommerceliveProductMainImageLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gm8);
            this.LLJJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxTextView getEcommerceliveProductMinDepositFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gm9);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ViewGroup getEcommerceliveProductPriceLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmd);
            this.LLIZLLLIL = (ViewGroup) callbackFindViewById;
        }
        return (ViewGroup) callbackFindViewById;
    }

    public final C18L9 getEcommercelivePromotionLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmk);
            this.LLJJIII = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    public final C18L9 getEcommerceliveSecondPromotionLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmp);
            this.LLJJIJI = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    public final C185U getEcommerceliveSellerBrandFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmr);
            this.LLJILJILJ = (C185U) callbackFindViewById;
        }
        return (C185U) callbackFindViewById;
    }

    @Override // X.AbstractC21202917yF
    public List<String> getInnerItemsShowParamsProductPromotionTag() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LLL.LJIILL());
        arrayList.addAll(this.LLLF.LJIILL());
        return arrayList;
    }

    public final C19395610uQ getMoreActionFlipController() {
        return (C19395610uQ) this.LLLIL.getValue();
    }

    @Override // X.AbstractC21202917yF
    public Map<String, String> getPromotionLogoDaInfo() {
        return this.LLJLLIL.LJ;
    }

    public final C18L9 getSellingPointViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.up2);
            this.LLJIJIL = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    @Override // X.AbstractC21202917yF
    public final boolean h0() {
        Boolean bool = this.LLJLL.LJIIIIZZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean s0() {
        UsPopupCardVO usPopupCardVO;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock;
        int i = this.LLLIIIIL;
        return ((1 != i && 2 != i) || (usPopupCardVO = this.LLIZ) == null || (flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo) == null || (flashSaleAtmosphereStock = flashSaleAtmosphereInfo.flashSaleAtmosphereStock) == null || flashSaleAtmosphereStock.activityStockStatus != 3) ? false : true;
    }

    public final void F0() {
        PromotionInfo promotionInfo;
        if (!Z0()) {
            this.LLLFZ.LJIIJ(false);
            return;
        }
        this.LLL.LJIIJ(false);
        this.LLLF.LJIIJ(false);
        this.LLJLILLLLZIIL.LJIIJ(false);
        this.LLLI.LJIIJ(false);
        this.LLLFZ.LJIIJ(true);
        C212229183n c212229183n = this.LLLFZ;
        UsPopupCardVO usPopupCardVO = this.LLIZ;
        c212229183n.LJIIJJI(new AnonymousClass1848((usPopupCardVO == null || (promotionInfo = usPopupCardVO.promotionInfo) == null) ? null : promotionInfo.prelaunchPromotionLabel));
    }

    @Override // X.AbstractC21202317y9, X.InterfaceC21184217vE
    public final boolean LLLLLZ() {
        return getMoreActionFlipController().LJII;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("onDetachedFromWindow");
        C212228183m c212228183m = this.LLLFFI;
        c212228183m.LJIIIIZZ = -2;
        TuxTextView tuxTextView = c212228183m.LJI;
        if (tuxTextView != null) {
            tuxTextView.removeOnLayoutChangeListener(c212228183m.LJIJ);
        }
        c212228183m.LJIIL = -1;
        c212228183m.LJIILIIL = -1;
        c212228183m.LJIIIZ = null;
        c212228183m.LJIIJ = null;
        c212228183m.LJIILJJIL = null;
    }

    public /* synthetic */ C212219183d(Context context) {
        this(context, null, 0);
    }

    public static boolean p0(UsPopupCardVO usPopupCardVO) {
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        Integer num;
        String str;
        PromotionProductPrice promotionProductPrice2;
        SinglePriceItem singlePriceItem2;
        SinglePriceHideInfo singlePriceHideInfo;
        String str2 = usPopupCardVO.afterCouponPriceContent;
        if (str2 != null && C703302op.LIZ(str2)) {
            PromotionInfo promotionInfo = usPopupCardVO.promotionInfo;
            if (promotionInfo != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null && (num = singlePriceItem.priceDisplayMode) != null && num.intValue() == 1) {
                PromotionInfo promotionInfo2 = usPopupCardVO.promotionInfo;
                if (promotionInfo2 != null && (promotionProductPrice2 = promotionInfo2.productPrice) != null && (singlePriceItem2 = promotionProductPrice2.minPrice) != null && (singlePriceHideInfo = singlePriceItem2.priceHideInfo) != null) {
                    str = singlePriceHideInfo.displayText;
                } else {
                    str = null;
                }
                if (C703302op.LIZ(str)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private final void setBenefitsSectionAlignRule(C14L7 c14l7) {
        int right;
        if (c14l7 != null) {
            Integer numValueOf = Integer.valueOf((getVisibleBtn().getTop() - c14l7.getTop()) - C679280Qkg.LIZ(6));
            int i = 0;
            if (numValueOf.intValue() > 0) {
                c14l7.setMarginEndThreshold(numValueOf.intValue());
            }
            if (c14l7.getLayoutDirection() != 1 ? (right = c14l7.getRight() - (getVisibleBtn().getLeft() - C679280Qkg.LIZ(4))) >= 0 : (right = (getVisibleBtn().getRight() + C679280Qkg.LIZ(4)) - c14l7.getLeft()) >= 0) {
                i = right;
            }
            c14l7.setMarginEndValue(i);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c14l7);
            sbLIZ.append(" marginEndThreshold = ");
            sbLIZ.append(c14l7.getMarginEndThreshold());
            sbLIZ.append(", marginEndValue = ");
            sbLIZ.append(c14l7.getMarginEndValue());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [STYLE, X.1849, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [STYLE, X.0GrN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [STYLE, X.10mS, X.186W, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void setPopCardStyle(UsPopupCardVO usPopupCardVO) {
        int i;
        PromotionStyleConfig promotionStyleConfig;
        PromotionLabelConfig promotionLabelConfig;
        SeparatorConfig separatorConfig;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numValueOf;
        InterfaceC212223183h popCardStyle = getPopCardStyle();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(popCardStyle.LJFF().LIZ());
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        setBackground(c384050F3z.LIZ(getContext()));
        setPaddingRelative(0, 0, 0, popCardStyle.LJFF().LJJI());
        C186F<ConstraintLayout> c186f = this.LLJZIJLIL;
        ?? LIZLLL = popCardStyle.LIZLLL();
        c186f.LJI = LIZLLL;
        c186f.LJ = C186F.LJIILIIL(LIZLLL);
        c186f.LJII.LJI(LIZLLL);
        c186f.LJIIL().LJII((ViewGroup) c186f.LIZ);
        C212198182i c212198182i = this.LLJLLIL;
        c212198182i.LJFF = popCardStyle.LJ();
        if (!C288750BTl.LIZ()) {
            C0H9H.LIZLLL(c212198182i.LJFF.LIZIZ(), c212198182i.LIZ);
        }
        C212230183o c212230183o = this.LLJLL;
        ?? LJI = popCardStyle.LJI();
        c212230183o.LJI = LJI;
        c212230183o.LJ = C212230183o.LJIILIIL(LJI);
        this.LLJLILLLLZIIL.LJIILJJIL(popCardStyle.LJII());
        C184R<C426160GnO> c184r = this.LLJLLL;
        ?? LIZ = popCardStyle.LIZ();
        c184r.LJI = LIZ;
        c184r.LJ = C184R.LJIILLIIL(LIZ);
        c184r.LJIIIZ.LJ(LIZ);
        this.LLL.LJI = popCardStyle.LIZJ();
        this.LLLF.LJI = popCardStyle.LIZJ();
        this.LLJZ.LJI = popCardStyle.LIZIZ();
        ViewGroup.LayoutParams layoutParams = this.LLJZIJLIL.LIZ.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && (numValueOf = Integer.valueOf(marginLayoutParams.width + marginLayoutParams.getMarginStart())) != null) {
            this.LLJZ.LJIIJ = numValueOf.intValue();
        }
        ProductCardConfig productCardConfig = usPopupCardVO.productCardConfig;
        if (productCardConfig != null) {
            i = productCardConfig.layoutStyle;
        } else {
            i = 0;
        }
        C212198182i c212198182i2 = this.LLJLLIL;
        if (i == 1) {
            ((TuxTextView) c212198182i2.LIZ).setTuxFont(62);
        } else {
            ((TuxTextView) c212198182i2.LIZ).setTuxFont(61);
        }
        this.LLLFFI.LJIIZILJ = i;
        if (C288750BTl.LIZ()) {
            ProductCardConfig productCardConfig2 = usPopupCardVO.productCardConfig;
            if (productCardConfig2 != null && productCardConfig2.layoutStyle == 1) {
                C14L7 benefitsVerticalLayoutFromXml = getBenefitsVerticalLayoutFromXml();
                if (benefitsVerticalLayoutFromXml != null) {
                    benefitsVerticalLayoutFromXml.setVerticalLayoutDirection(1);
                }
                C14L7 ecommerceliveLiveExclusiveFlashSaleLayoutFromXmlV4 = getEcommerceliveLiveExclusiveFlashSaleLayoutFromXmlV4();
                if (ecommerceliveLiveExclusiveFlashSaleLayoutFromXmlV4 != null) {
                    ecommerceliveLiveExclusiveFlashSaleLayoutFromXmlV4.setVerticalLayoutDirection(1);
                }
            } else {
                C14L7 benefitsVerticalLayoutFromXml2 = getBenefitsVerticalLayoutFromXml();
                if (benefitsVerticalLayoutFromXml2 != null) {
                    benefitsVerticalLayoutFromXml2.setVerticalLayoutDirection(0);
                }
                C14L7 ecommerceliveLiveExclusiveFlashSaleLayoutFromXmlV42 = getEcommerceliveLiveExclusiveFlashSaleLayoutFromXmlV4();
                if (ecommerceliveLiveExclusiveFlashSaleLayoutFromXmlV42 != null) {
                    ecommerceliveLiveExclusiveFlashSaleLayoutFromXmlV42.setVerticalLayoutDirection(0);
                }
            }
            PromotionInfo promotionInfo = usPopupCardVO.promotionInfo;
            if (promotionInfo != null && (promotionStyleConfig = promotionInfo.styleConfig) != null && (promotionLabelConfig = promotionStyleConfig.promotionLabelConfig) != null && (separatorConfig = promotionLabelConfig.separator) != null) {
                C18L9 ecommercelivePromotionLayoutFromXml = getEcommercelivePromotionLayoutFromXml();
                if (ecommercelivePromotionLayoutFromXml != null) {
                    ecommercelivePromotionLayoutFromXml.setDividerSymbol(separatorConfig);
                }
                C18L9 ecommerceliveSecondPromotionLayoutFromXml = getEcommerceliveSecondPromotionLayoutFromXml();
                if (ecommerceliveSecondPromotionLayoutFromXml != null) {
                    ecommerceliveSecondPromotionLayoutFromXml.setDividerSymbol(separatorConfig);
                }
                ((C18L9) this.LLLFFI.LJIJI.getValue()).setDividerSymbol(separatorConfig);
                ((C18L9) this.LLLFFI.LJIJJLI.getValue()).setDividerSymbol(separatorConfig);
            }
        }
    }

    private final void setProductInfoAtStartOfCloseBtn(View view) {
        if (C288750BTl.LIZ()) {
            return;
        }
        C19ME c19me = (C19ME) view.getLayoutParams();
        if (c19me.endToStart != -1 || c19me.endToEnd != 0) {
            c19me.endToStart = -1;
            c19me.endToEnd = 0;
            c19me.setMarginEnd(getContext().getResources().getDimensionPixelOffset(R.dimen.ul));
            C786410Ut5.W5(view, c19me);
        }
    }

    public final void B0(List<Animator> list) {
        if (this.LLLI.LJI() && getEcommerceliveProductDescFromXml().getTranslationY() == 0.0f) {
            if (getEcommerceliveSellerBrandFromXml().getY() > 0.0f && getEcommerceliveProductDescFromXml().getY() > 0.0f) {
                Animator animatorLIZIZ = C19395710uR.LIZIZ(getEcommerceliveProductDescFromXml(), getEcommerceliveSellerBrandFromXml().getY() - getEcommerceliveProductDescFromXml().getY());
                animatorLIZIZ.setDuration(150L);
                ((ArrayList) list).add(animatorLIZIZ);
                setProductInfoAtStartOfCloseBtn(this.LLJLLIL.LIZ);
            }
            if (this.LLLI.LJI() && C2533209wI.LIZ() && this.LLLFFI.LJI() && this.LLLFFI.LIZ.getTranslationY() != 0.0f) {
                Animator animatorLIZIZ2 = C19395710uR.LIZIZ(this.LLLFFI.LIZ, 0.0f);
                animatorLIZIZ2.setDuration(150L);
                ((ArrayList) list).add(animatorLIZIZ2);
            }
            Animator animatorLJFF = this.LLLI.LJFF();
            animatorLJFF.setDuration(150L);
            ((ArrayList) list).add(animatorLJFF);
        }
    }

    public final void C0(List<Animator> list) {
        if (this.LLLI.LJI() && getEcommerceliveProductDescFromXml().getTranslationY() != 0.0f) {
            Animator animatorLIZIZ = C19395710uR.LIZIZ(getEcommerceliveProductDescFromXml(), 0.0f);
            animatorLIZIZ.setDuration(150L);
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(animatorLIZIZ);
            V0(this.LLJLLIL.LIZ, this.LLJLL.LIZ);
            Animator animatorLJ = this.LLLI.LJ(false);
            animatorLJ.setDuration(150L);
            arrayList.add(animatorLJ);
        }
        if (C2533209wI.LIZ() && this.LLLI.LJI() && this.LLLFFI.LJI() && this.LLLFFI.LIZ.getTranslationY() == 0.0f) {
            T t = this.LLLFFI.LIZ;
            C1546210qL5.LIZ.getClass();
            Animator animatorLIZIZ2 = C19395710uR.LIZIZ(t, C1546210qL5.LIZ(17));
            animatorLIZIZ2.setDuration(150L);
            ((ArrayList) list).add(animatorLIZIZ2);
        }
    }

    public final void I0(UsPopupCardVO usPopupCardVO) {
        UsPopupCardVO usPopupCardVO2;
        PromotionInfo promotionInfo;
        if (this.LLLFFI.LJI()) {
            this.LLJLLIL.LJIIL(1);
            return;
        }
        if (this.LLLI.LJI()) {
            this.LLJLLIL.LJIIL(1);
            return;
        }
        int i = this.LLLIIIIL;
        if (i == 1 || i == 2 || ((usPopupCardVO2 = this.LLIZ) != null && (promotionInfo = usPopupCardVO2.promotionInfo) != null && promotionInfo.prelaunchPromotionLabel != null)) {
            this.LLJLLIL.LJIIL(1);
            return;
        }
        boolean zP0 = p0(usPopupCardVO);
        if (this.LLILZIL) {
            if (this.LLJL >= 1 - (zP0 ? 1 : 0)) {
                this.LLJLLIL.LJIIL(1);
                return;
            } else {
                this.LLJLLIL.LJIIL(2);
                return;
            }
        }
        if (this.LLJL >= 2 - (zP0 ? 1 : 0)) {
            this.LLJLLIL.LJIIL(1);
        } else {
            this.LLJLLIL.LJIIL(2);
        }
    }

    @Override // X.InterfaceC21204817yY
    public final void LIZIZ(int i) {
        boolean z;
        C212230183o c212230183o = this.LLJLL;
        if (!h0() && !s0()) {
            z = false;
        } else {
            z = true;
        }
        c212230183o.LJIILJJIL(new AnonymousClass1845(z, Integer.valueOf(i)));
    }

    @Override // X.InterfaceC21184217vE
    public final void LJJLIIIJILLIZJL(boolean z) {
        if (!isAttachedToWindow()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZJ("not shown, don't refresh stock");
        } else if (this.LLJLL.LJI() && this.LLIZ != null) {
            S0(z, null, s0());
        }
    }

    @Override // X.InterfaceC1865210ydb
    public final Map<String, String> LJLLL(String str) {
        if (Intrinsics.LJFF(str, "promotion_items") && this.LLLFFI.LJI()) {
            return this.LLLFFI.LJIIL().LIZ();
        }
        if (Intrinsics.LJFF(str, "second_promotion_items") && this.LLLFFI.LJI()) {
            return this.LLLFFI.LJIILIIL().LIZ();
        }
        C181Q c181q = (C181Q) ((LinkedHashMap) getControllerShowParametersManager().LIZ).get(str);
        if (c181q != null) {
            if (c181q.LIZIZ) {
                return c181q.LIZ.LIZ();
            }
            return c181q.LIZ.LIZIZ();
        }
        return null;
    }

    public final boolean Y0(UsPopupCardVO usPopupCardVO) {
        List<SellingItem> list;
        SellingView sellingView = usPopupCardVO.sellingView;
        if (sellingView != null && (list = sellingView.sellingItems) != null) {
            this.LLJLILLLLZIIL.LJIILIIL(new C0HAM(list));
        }
        return this.LLJLILLLLZIIL.LJI();
    }

    @Override // X.AbstractC21202317y9, X.AbstractC21202917yF
    public void setAtmosphereTags(List<C184F> list) {
        this.LLJZ.LJIILL(list);
    }

    public final void setBenefitsVerticalLayoutFromXml(C14L7 c14l7) {
        this.LLJJJJ = c14l7;
    }

    public final void setEcommerceliveBtnBuyFromXml(C197039127h c197039127h) {
        this.LLJILJIL = c197039127h;
    }

    public final void setEcommerceliveCreatorExclusivePricePreheatLayoutFromXml(LinearLayout linearLayout) {
        this.LLJJJ = linearLayout;
    }

    public final void setEcommerceliveIconAssistantFromXml(TuxIconView tuxIconView) {
        this.LLJJIJIIJIL = tuxIconView;
    }

    public final void setEcommerceliveIconCloseFromXml(TuxIconView tuxIconView) {
        this.LLJJJIL = tuxIconView;
    }

    public final void setEcommerceliveLiveExclusiveFlashSaleLayoutFromXml(LinearLayout linearLayout) {
        this.LLJJIJIL = linearLayout;
    }

    public final void setEcommerceliveLiveExclusiveFlashSaleLayoutFromXmlV4(C14L7 c14l7) {
        this.LLJJJJJIL = c14l7;
    }

    public final void setEcommerceliveNextActionDividerLineFromXml(View view) {
        this.LLJJJJLIIL = view;
    }

    public final void setEcommerceliveNextActionLowerLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLJJL = constraintLayout;
    }

    public final void setEcommerceliveNextActionUpperLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLJJLIIIJLLLLLLLZ = constraintLayout;
    }

    public final void setEcommerceliveProductAfterCouponPriceFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setEcommerceliveProductAtmosphereLayoutFromXml(FrameLayout frameLayout) {
        this.LLJJI = frameLayout;
    }

    public final void setEcommerceliveProductDescFromXml(C18QT c18qt) {
        this.LLJILLL = c18qt;
    }

    public final void setEcommerceliveProductMainImageLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLJJ = constraintLayout;
    }

    public final void setEcommerceliveProductMinDepositFromXml(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public final void setEcommerceliveProductPriceLayoutFromXml(ViewGroup viewGroup) {
        this.LLIZLLLIL = viewGroup;
    }

    public final void setEcommercelivePromotionLayoutFromXml(C18L9 c18l9) {
        this.LLJJIII = c18l9;
    }

    public final void setEcommerceliveSecondPromotionLayoutFromXml(C18L9 c18l9) {
        this.LLJJIJI = c18l9;
    }

    public final void setEcommerceliveSellerBrandFromXml(C185U c185u) {
        this.LLJILJILJ = c185u;
    }

    public final void setSellingPointViewFromXml(C18L9 c18l9) {
        this.LLJIJIL = c18l9;
    }

    @Override // X.InterfaceC21197417xM
    public final void A(int i, C184F c184f) {
        AtmosphereTag atmosphereTag;
        boolean z;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        if (!isAttachedToWindow()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("refreshAtmosphereTag but not show");
            C184D c184d = this.LLJZ;
            C187I c187iLJIIL = c184d.LJIIIIZZ.get(i);
            if (c187iLJIIL != null || (c187iLJIIL = c184d.LJIIL(i)) != null) {
                c187iLJIIL.LJFF = c184f;
                return;
            }
            return;
        }
        if (!this.LLJZ.LJIIIZ) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("refreshAtmosphereTag but not shown");
            C184D c184d2 = this.LLJZ;
            C187I c187iLJIIL2 = c184d2.LJIIIIZZ.get(i);
            if (c187iLJIIL2 != null || (c187iLJIIL2 = c184d2.LJIIL(i)) != null) {
                c187iLJIIL2.LJFF = c184f;
                return;
            }
            return;
        }
        UsPopupCardVO usPopupCardVO = this.LLIZ;
        if (usPopupCardVO != null && usPopupCardVO.isInStock() && !s0()) {
            C184D c184d3 = this.LLJZ;
            FlashSaleAtmosphereStock flashSaleAtmosphereStock = null;
            if ((c184f instanceof AtmosphereTag) && (atmosphereTag = (AtmosphereTag) c184f) != null) {
                UsPopupCardVO usPopupCardVO2 = this.LLIZ;
                if (usPopupCardVO2 != null && (flashSaleAtmosphereInfo = usPopupCardVO2.flashSaleAtmosphereInfo) != null) {
                    flashSaleAtmosphereStock = flashSaleAtmosphereInfo.flashSaleAtmosphereStock;
                }
                atmosphereTag.LIZLLL = flashSaleAtmosphereStock;
            } else {
                atmosphereTag = null;
            }
            if (!h0() && !s0()) {
                z = false;
            } else {
                z = true;
            }
            C184D.LJIILJJIL(c184d3, i, atmosphereTag, false, 0L, z, null, 40);
            return;
        }
        C184D c184d4 = this.LLJZ;
        c184d4.getClass();
        c184d4.LJIILIIL(AnonymousClass0207.get$arr$(103));
    }

    public final void E0(UsPopupCardVO usPopupCardVO, String str) {
        List<PlacementLabel> list;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        PriceConfig priceConfig;
        PriceTextConfig priceTextConfig;
        PriceTextConfig priceTextConfig2;
        PriceTextConfig priceTextConfig3;
        PriceTextConfig priceTextConfig4;
        DiscountTag discountTag;
        DiscountTag discountTag2;
        PriceTextConfig priceTextConfig5;
        PriceTextConfig priceTextConfig6;
        List<String> list2;
        PriceTextConfig priceTextConfig7;
        boolean z;
        FlashSaleAtmosphere flashSaleAtmosphere;
        HashMap<String, PriceConfig> map;
        PriceConfig priceConfig2;
        HashMap<String, PriceConfig> map2;
        PriceConfig priceConfig3;
        HashMap<String, PriceConfig> map3;
        PriceConfig priceConfig4;
        HashMap<String, PriceConfig> map4;
        PriceConfig priceConfig5;
        HashMap<String, PriceConfig> map5;
        HashMap<String, PriceConfig> map6;
        PriceConfig priceConfig6;
        HashMap<String, PriceConfig> map7;
        PriceConfig priceConfig7;
        HashMap<String, PriceConfig> map8;
        PriceConfig priceConfig8;
        HashMap<String, PriceConfig> map9;
        PriceConfig priceConfig9;
        HashMap<String, PriceConfig> map10;
        PriceConfig priceConfig10;
        HashMap<String, PriceConfig> map11;
        PriceConfig priceConfig11;
        HashMap<String, PriceConfig> map12;
        AtmosphereTag next;
        List<PromotionSticker> list3;
        getMoreActionFlipController().LJFF();
        u0(usPopupCardVO, false, this.LLJLIL);
        C186F.LJIILLIIL(this.LLJZIJLIL, usPopupCardVO.bagIndex, usPopupCardVO.source, Integer.valueOf(usPopupCardVO.platform));
        S0(usPopupCardVO.isSoldOut(), Integer.valueOf(usPopupCardVO.buyButtonType), s0());
        this.LLLFF.LJIIJJI(new C212237183v(usPopupCardVO.assistantSwitch, usPopupCardVO.assistantModules));
        if (this.LLLFF.LJI()) {
            this.LLJLL.LJIIJ(false);
            C786410Ut5.I7(new C19LP(this, 0, 42), this.LLLFF.LIZ);
            Map<String, String> map13 = this.LLILZLL;
            map13.put("has_live_helper", "1");
            map13.put("user_type", "moderator");
        } else {
            this.LLJLL.LJIIJ(true);
        }
        this.LLLI.LJIILIIL(usPopupCardVO.enhancedBrandLogo);
        if (this.LLLI.LJI()) {
            V0(this.LLJLLIL.LIZ, this.LLJLL.LIZ);
        } else {
            setProductInfoAtStartOfCloseBtn(this.LLJLLIL.LIZ);
        }
        boolean zLJI = this.LLLI.LJI();
        if (C2533209wI.LIZ() && this.LLLFFI.LJI()) {
            ViewGroup viewGroup = (ViewGroup) this.LLLFFI.LIZ;
            if (zLJI) {
                if (viewGroup.getTranslationY() == 0.0f) {
                    C1546210qL5.LIZ.getClass();
                    C786410Ut5.bd(C1546210qL5.LIZ(17), viewGroup);
                }
            } else {
                C786410Ut5.bd(0.0f, viewGroup);
            }
        } else {
            C786410Ut5.bd(0.0f, (ViewGroup) this.LLLFFI.LIZ);
        }
        this.LLILZIL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().o1();
        L0(this, usPopupCardVO, true, false, 4);
        PromotionInfo promotionInfo = usPopupCardVO.promotionInfo;
        if (promotionInfo != null && (list3 = promotionInfo.promotionStickers) != null) {
            this.LLJZIJLIL.LJIILJJIL(list3, this.LLILZLL);
        }
        TopBrand topBrand = usPopupCardVO.topBrand;
        if (topBrand != null) {
            this.LLJZIJLIL.LJIJ(topBrand);
        }
        C212198182i c212198182i = this.LLJLLIL;
        String str2 = usPopupCardVO.title;
        PromotionInfo promotionInfo2 = usPopupCardVO.promotionInfo;
        String str3 = null;
        if (promotionInfo2 != null) {
            list = promotionInfo2.placementLabels;
        } else {
            list = null;
        }
        c212198182i.LJIIJJI(new C212199182j(str2, false, list, 28));
        C184D c184d = this.LLJZ;
        List<AtmosphereTag> list4 = usPopupCardVO.atmosphereTags;
        c184d.getClass();
        if (PinCardRefactorSettings.LIZ().atmosphereEnable) {
            C184F c184f = c184d.LJ;
            if (c184f != null) {
                C187I c187i = c184d.LJIIIIZZ.get(c184f.LIZLLL());
                c184d.LJIIIIZZ.clear();
                c184d.LJII.clear();
                if (c187i != null) {
                    c184d.LJIIIIZZ.put(c184f.LIZLLL(), c187i);
                    c184d.LJII.add(c187i);
                    Iterator<AtmosphereTag> it2 = list4.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.LIZLLL() == c187i.LJ) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    AtmosphereTag atmosphereTag = next;
                    if (atmosphereTag != null) {
                        c187i.LJFF = atmosphereTag;
                    }
                }
            }
            for (AtmosphereTag atmosphereTag2 : list4) {
                C187I c187iLJIIL = c184d.LJIIIIZZ.get(atmosphereTag2.LIZLLL());
                if (c187iLJIIL != null || (c187iLJIIL = c184d.LJIIL(atmosphereTag2.LIZLLL())) != null) {
                    c187iLJIIL.LJFF = atmosphereTag2;
                }
            }
        }
        if (usPopupCardVO.isInStock() && !s0()) {
            if (this.LLJZ.LJ == null) {
                LJJIL();
            }
        } else {
            C184D c184d2 = this.LLJZ;
            c184d2.getClass();
            c184d2.LJIILIIL(AnonymousClass0207.get$arr$(103));
        }
        PromotionInfo promotionInfo3 = usPopupCardVO.promotionInfo;
        if (promotionInfo3 != null && (promotionProductPrice = promotionInfo3.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
            C184R<C426160GnO> c184r = this.LLJLLL;
            PriceUiConfig priceUiConfig = singlePriceItem.priceUiConfig;
            if (priceUiConfig != null && (map12 = priceUiConfig.configs) != null) {
                priceConfig = map12.get("pin_card");
            } else {
                priceConfig = null;
            }
            PriceUiConfig priceUiConfig2 = singlePriceItem.priceUiConfig;
            if (priceUiConfig2 != null && (map11 = priceUiConfig2.configs) != null && (priceConfig11 = map11.get("pin_card")) != null) {
                priceTextConfig = priceConfig11.currency;
            } else {
                priceTextConfig = null;
            }
            PriceUiConfig priceUiConfig3 = singlePriceItem.priceUiConfig;
            if (priceUiConfig3 != null && (map10 = priceUiConfig3.configs) != null && (priceConfig10 = map10.get("pin_card")) != null) {
                priceTextConfig2 = priceConfig10.prefix;
            } else {
                priceTextConfig2 = null;
            }
            PriceUiConfig priceUiConfig4 = singlePriceItem.priceUiConfig;
            if (priceUiConfig4 != null && (map9 = priceUiConfig4.configs) != null && (priceConfig9 = map9.get("pin_card")) != null) {
                priceTextConfig3 = priceConfig9.formatOriginPrice;
            } else {
                priceTextConfig3 = null;
            }
            PriceUiConfig priceUiConfig5 = singlePriceItem.priceUiConfig;
            if (priceUiConfig5 != null && (map8 = priceUiConfig5.configs) != null && (priceConfig8 = map8.get("pin_card")) != null) {
                priceTextConfig4 = priceConfig8.formatAvailablePrice;
            } else {
                priceTextConfig4 = null;
            }
            PriceUiConfig priceUiConfig6 = singlePriceItem.priceUiConfig;
            if (priceUiConfig6 != null && (map7 = priceUiConfig6.configs) != null && (priceConfig7 = map7.get("pin_card")) != null) {
                discountTag = priceConfig7.discount;
            } else {
                discountTag = null;
            }
            PriceUiConfig priceUiConfig7 = singlePriceItem.priceUiConfig;
            if (priceUiConfig7 != null && (map6 = priceUiConfig7.configs) != null && (priceConfig6 = map6.get("pin_card")) != null) {
                discountTag2 = priceConfig6.flashSaleDiscount;
            } else {
                discountTag2 = null;
            }
            PriceUiConfig priceUiConfig8 = singlePriceItem.priceUiConfig;
            if (priceUiConfig8 != null && (map5 = priceUiConfig8.configs) != null) {
                map5.get("pin_card");
            }
            PriceUiConfig priceUiConfig9 = singlePriceItem.priceUiConfig;
            if (priceUiConfig9 != null && (map4 = priceUiConfig9.configs) != null && (priceConfig5 = map4.get("pin_card")) != null) {
                priceTextConfig5 = priceConfig5.exceedFormatOriginPrice;
            } else {
                priceTextConfig5 = null;
            }
            PriceUiConfig priceUiConfig10 = singlePriceItem.priceUiConfig;
            if (priceUiConfig10 != null && (map3 = priceUiConfig10.configs) != null && (priceConfig4 = map3.get("pin_card")) != null) {
                priceTextConfig6 = priceConfig4.exceedDiscount;
            } else {
                priceTextConfig6 = null;
            }
            PriceUiConfig priceUiConfig11 = singlePriceItem.priceUiConfig;
            if (priceUiConfig11 != null && (map2 = priceUiConfig11.configs) != null && (priceConfig3 = map2.get("pin_card")) != null) {
                list2 = priceConfig3.discountDisplayOrder;
            } else {
                list2 = null;
            }
            PriceUiConfig priceUiConfig12 = singlePriceItem.priceUiConfig;
            if (priceUiConfig12 != null && (map = priceUiConfig12.configs) != null && (priceConfig2 = map.get("pin_card")) != null) {
                priceTextConfig7 = priceConfig2.afterCouponPrice;
            } else {
                priceTextConfig7 = null;
            }
            PriceConfig priceConfig12 = priceConfig;
            C184U c184u = new C184U(priceConfig12, priceTextConfig, priceTextConfig2, priceTextConfig3, priceTextConfig4, discountTag, discountTag2, priceTextConfig5, priceTextConfig6, list2, priceTextConfig7);
            c184r.LJIILL = c184u;
            c184r.LJIIL().LJIILIIL(c184u);
            C184R<C426160GnO> c184r2 = this.LLJLLL;
            String strLIZJ = C743702vL.LIZJ(singlePriceItem);
            String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
            String str4 = singlePriceItem.pricePrefix;
            String str5 = singlePriceItem.discountFormat;
            C212225183j c212225183jLIZ = C212227183l.LIZ(singlePriceItem);
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && flashSaleAtmosphere.status == 3) {
                z = true;
            } else {
                z = false;
            }
            boolean zZ0 = Z0();
            Integer num = singlePriceItem.priceDisplayMode;
            SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
            if (singlePriceHideInfo != null) {
                str3 = singlePriceHideInfo.displayText;
            }
            c184r2.LJIJI(new C184S(strLIZJ, strLIZLLL, str4, str5, c212225183jLIZ, z, zZ0, num, str3, usPopupCardVO.depositPrice, usPopupCardVO.afterCouponPriceContent));
        }
        if (TextUtils.equals(str, "live_message_exclusive_price_promotion_status_change") && (h0() || s0())) {
            C184D c184d3 = this.LLJZ;
            c184d3.getClass();
            c184d3.LJIILIIL(AnonymousClass0207.get$arr$(103));
            this.LLJZIJLIL.LJIIZILJ(true);
        }
        F0();
    }

    @Override // X.InterfaceC21184217vE
    public final void LJIIJJI(GetMoreActionResp getMoreActionResp, Function0<Unit> function0) {
        long jLongValue;
        int iIntValue;
        boolean z;
        Pair pair;
        String str;
        String str2;
        Integer num;
        Integer num2;
        C18QS c18qs;
        String str3;
        Integer num3;
        ActionCardInfo actionCardInfo;
        Integer num4;
        TextView textView;
        Integer num5;
        Integer num6;
        BuyButtonProperty buyButtonProperty;
        Long l;
        Integer num7;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(getEcommerceliveNextActionUpperLayoutFromXml());
        List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(getEcommerceliveNextActionLowerLayoutFromXml());
        ActionCardInfo actionCardInfo2 = getMoreActionResp.cardInfo;
        if (actionCardInfo2 != null && (num7 = actionCardInfo2.uiType) != null && num7.intValue() == 2 && !this.LLLIILIL) {
            listLJIILJJIL2.add(getEcommerceliveNextActionDividerLineFromXml());
        }
        C19395610uQ moreActionFlipController = getMoreActionFlipController();
        List listLJIILJJIL3 = C1697810uHb.LJIILJJIL(this.LLJLLIL.LIZ, this.LLJLILLLLZIIL.LIZ, this.LLL.LIZ, this.LLLF.LIZ, this.LLJLLL.LIZ, this.LLJLL.LIZ);
        moreActionFlipController.LJIILL.removeCallbacksAndMessages(null);
        ((ArrayList) moreActionFlipController.LIZLLL).clear();
        ((ArrayList) moreActionFlipController.LIZLLL).addAll(listLJIILJJIL3);
        ((ArrayList) moreActionFlipController.LJ).clear();
        ((ArrayList) moreActionFlipController.LJ).addAll(listLJIILJJIL);
        ((ArrayList) moreActionFlipController.LJFF).clear();
        ((ArrayList) moreActionFlipController.LJFF).addAll(listLJIILJJIL2);
        moreActionFlipController.LJIILJJIL = false;
        C19395610uQ.LJIJI = null;
        C19395610uQ.LJIJJ = null;
        ActionCardInfo actionCardInfo3 = getMoreActionResp.cardInfo;
        if (actionCardInfo3 != null && (l = actionCardInfo3.showTimeMs) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 10000;
        }
        moreActionFlipController.LJI = jLongValue;
        moreActionFlipController.LJIIJ = getContext();
        moreActionFlipController.LJIIIIZZ = new AwS576S0100000_32((AwS576S0100000_32) function0, 25);
        moreActionFlipController.LJIILIIL = this.LLLIILIL;
        InterfaceC212166181c popCardViewCallback = getPopCardViewCallback();
        C786410Ut5.I7(new C12Y6(moreActionFlipController, popCardViewCallback, 1), moreActionFlipController.LIZ);
        C786410Ut5.I7(new C12Y6(moreActionFlipController, popCardViewCallback, 2), moreActionFlipController.LIZIZ);
        ActionCardInfo actionCardInfo4 = getMoreActionResp.cardInfo;
        if (actionCardInfo4 != null && (buyButtonProperty = actionCardInfo4.buttonStyle) != null) {
            getMoreActionFlipController().LIZJ = buyButtonProperty;
        }
        C19395610uQ moreActionFlipController2 = getMoreActionFlipController();
        ActionCardInfo actionCardInfo5 = getMoreActionResp.cardInfo;
        if (actionCardInfo5 != null && (num6 = actionCardInfo5.uiType) != null) {
            iIntValue = num6.intValue();
        } else {
            iIntValue = 0;
        }
        moreActionFlipController2.getClass();
        C19395610uQ.LJIIZILJ = iIntValue;
        C19395610uQ moreActionFlipController3 = getMoreActionFlipController();
        String str4 = getMoreActionResp.LIZ().get("entrance_form");
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        moreActionFlipController3.getClass();
        C19395610uQ.LJIJ = str4;
        C19395610uQ moreActionFlipController4 = getMoreActionFlipController();
        String str6 = getMoreActionResp.LIZ;
        moreActionFlipController4.getClass();
        C19395610uQ.LJIJI = str6;
        C19395610uQ moreActionFlipController5 = getMoreActionFlipController();
        Long l2 = getMoreActionResp.LIZIZ;
        moreActionFlipController5.getClass();
        C19395610uQ.LJIJJ = l2;
        C19395610uQ moreActionFlipController6 = getMoreActionFlipController();
        CharSequence text = ((AppCompatTextView) this.LLJLLIL.LIZ).getText();
        View view = this.LLJZIJLIL.LIZ;
        View view2 = this.LLJLL.LIZ;
        moreActionFlipController6.LJIIIZ = getMoreActionResp;
        ActionCardInfo actionCardInfo6 = getMoreActionResp.cardInfo;
        if (actionCardInfo6 != null && (num5 = actionCardInfo6.uiType) != null && num5.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (actionCardInfo = getMoreActionResp.cardInfo) != null && (num4 = actionCardInfo.uiType) != null && num4.intValue() == 2 && (textView = (TextView) moreActionFlipController6.LIZ.findViewById(R.id.glr)) != null) {
            textView.setMaxLines(1);
            textView.setText(text);
        }
        TextDisplay textDisplay = getMoreActionResp.title;
        if (textDisplay != null) {
            ActionCardInfo actionCardInfo7 = getMoreActionResp.cardInfo;
            if (actionCardInfo7 != null && (num3 = actionCardInfo7.uiType) != null && num3.intValue() == 1) {
                c18qs = (C18QS) moreActionFlipController6.LIZ.findViewById(R.id.glr);
            } else {
                c18qs = (C18QS) moreActionFlipController6.LIZIZ.findViewById(R.id.glo);
            }
            ECImage eCImage = getMoreActionResp.title.rightIcon;
            if (eCImage != null) {
                str3 = eCImage.url;
            } else {
                str3 = null;
            }
            String str7 = textDisplay.wholeText;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = textDisplay.highlightPart;
            if (str8 != null) {
                str5 = str8;
            }
            c18qs.LJJJJL(str7, str5, str3, null);
        }
        ActionCardInfo actionCardInfo8 = getMoreActionResp.cardInfo;
        if (actionCardInfo8 != null && (num2 = actionCardInfo8.uiType) != null && num2.intValue() == 1) {
            moreActionFlipController6.LJ(getMoreActionResp, 3);
            moreActionFlipController6.LIZJ(view, view2);
        }
        Context context = moreActionFlipController6.LJIIJ;
        if (context != null) {
            ActionCardInfo actionCardInfo9 = getMoreActionResp.cardInfo;
            if (actionCardInfo9 != null && (num = actionCardInfo9.uiType) != null && num.intValue() == 1) {
                pair = new Pair(Integer.valueOf(R.attr.eyv), Integer.valueOf(R.attr.eya));
            } else {
                pair = new Pair(Integer.valueOf(R.attr.ewy), Integer.valueOf(R.attr.c5z));
            }
            int iIntValue2 = ((Number) pair.getFirst()).intValue();
            int iIntValue3 = ((Number) pair.getSecond()).intValue();
            C197039127h c197039127h = (C197039127h) moreActionFlipController6.LIZIZ.findViewById(R.id.glm);
            if (c197039127h != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(iIntValue2, context);
                if (numLIZJ != null) {
                    c197039127h.setTextColor(numLIZJ.intValue());
                }
                Integer numLIZJ2 = C1308910kAL.LIZJ(iIntValue3, context);
                if (numLIZJ2 != null) {
                    int iIntValue4 = numLIZJ2.intValue();
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                    c384050F3z.LIZ = Integer.valueOf(iIntValue4);
                    c197039127h.setBackground(c384050F3z.LIZ(context));
                }
                BuyButtonProperty buyButtonProperty2 = moreActionFlipController6.LIZJ;
                if (buyButtonProperty2 != null) {
                    if (C960203pA.LIZIZ(c197039127h.getContext()) && C123100dR.LIZ(buyButtonProperty2.displayTextColorDarkMode)) {
                        str = buyButtonProperty2.displayTextColorDarkMode;
                    } else {
                        str = buyButtonProperty2.displayTextColor;
                    }
                    int color = ColorProtector.parseColor(str);
                    if (C960203pA.LIZIZ(c197039127h.getContext()) && C123100dR.LIZ(buyButtonProperty2.backgroundColorDarkMode)) {
                        str2 = buyButtonProperty2.backgroundColorDarkMode;
                    } else {
                        str2 = buyButtonProperty2.backgroundColor;
                    }
                    int color2 = ColorProtector.parseColor(str2);
                    c197039127h.setText(buyButtonProperty2.displayText);
                    c197039127h.setTextColor(color);
                    C384050F3z c384050F3z2 = new C384050F3z();
                    c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                    c384050F3z2.LIZ = Integer.valueOf(color2);
                    c197039127h.setBackground(c384050F3z2.LIZ(context));
                }
            }
            C197039127h c197039127h2 = (C197039127h) moreActionFlipController6.LIZIZ.findViewById(R.id.glm);
            if (c197039127h2 != null) {
                c197039127h2.LJJJJLI(true);
            }
        }
        C19395610uQ moreActionFlipController7 = getMoreActionFlipController();
        moreActionFlipController7.LJII = true;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) moreActionFlipController7.LIZLLL).iterator();
        while (it2.hasNext()) {
            arrayList.add(C19395710uR.LIZ(1.0f, 0.0f, (View) it2.next()));
        }
        for (View view3 : (ArrayList) moreActionFlipController7.LJ) {
            C786410Ut5.LJLLLLLL(0, view3);
            C786410Ut5.T4(view3, 0.0f);
            arrayList.add(C19395710uR.LIZ(0.0f, 1.0f, view3));
        }
        for (View view4 : (ArrayList) moreActionFlipController7.LJFF) {
            C786410Ut5.LJLLLLLL(0, view4);
            C786410Ut5.T4(view4, 0.0f);
            arrayList.add(C19395710uR.LIZ(0.0f, 1.0f, view4));
            arrayList.add(ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.TRANSLATION_Y, C418440Gaw.LIZIZ(36), 0.0f));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
        animatorSet.setDuration(300L);
        animatorSet.addListener(new ALAdapterS24S0100000_29(moreActionFlipController7, 19));
        animatorSet.start();
        moreActionFlipController7.LJIIJJI = animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0143 A[PHI: r0
      0x0143: PHI (r0v5 long) = (r0v4 long), (r0v25 long), (r0v25 long), (r0v25 long) binds: [B:44:0x0097, B:46:0x009d, B:48:0x00a1, B:50:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC21204817yY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(int r18, long r19) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212219183d.LJJI(int, long):void");
    }

    @Override // X.InterfaceC21204817yY
    public final void LJJIIJ(int i, boolean z) {
        Integer num;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        boolean z2;
        FlashSaleAtmosphere flashSaleAtmosphere;
        PromotionInfo promotionInfo;
        PromotionProductPrice promotionProductPrice2;
        SinglePriceItem singlePriceItem2;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshPromotionAndPrice, needPromotion = ");
        sbLIZ.append(z);
        sbLIZ.append(", priceDisplayMode:");
        UsPopupCardVO usPopupCardVO = this.LLIZ;
        String str = null;
        if (usPopupCardVO != null && (promotionInfo = usPopupCardVO.promotionInfo) != null && (promotionProductPrice2 = promotionInfo.productPrice) != null && (singlePriceItem2 = promotionProductPrice2.minPrice) != null) {
            num = singlePriceItem2.priceDisplayMode;
        } else {
            num = null;
        }
        sbLIZ.append(num);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        UsPopupCardVO usPopupCardVO2 = this.LLIZ;
        if (usPopupCardVO2 != null) {
            Animator animator = this.LLLIIII;
            if (animator != null && true == animator.isStarted()) {
                C2341109Fh.LJII("animator is running, wait for anim");
                Animator animator2 = this.LLLIIII;
                if (animator2 != null) {
                    animator2.addListener(new ALAdapterS5S0210000_32(usPopupCardVO2, this, z, 0));
                    return;
                }
                return;
            }
            if (z) {
                L0(this, usPopupCardVO2, false, false, 6);
            }
            PromotionInfo promotionInfo2 = usPopupCardVO2.promotionInfo;
            if (promotionInfo2 != null && (promotionProductPrice = promotionInfo2.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
                C184R<C426160GnO> c184r = this.LLJLLL;
                String strLIZJ = C743702vL.LIZJ(singlePriceItem);
                String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
                String str2 = singlePriceItem.pricePrefix;
                String str3 = singlePriceItem.discountFormat;
                C212225183j c212225183jLIZ = C212227183l.LIZ(singlePriceItem);
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = usPopupCardVO2.flashSaleAtmosphereInfo;
                if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && flashSaleAtmosphere.status == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zZ0 = Z0();
                Integer num2 = singlePriceItem.priceDisplayMode;
                SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
                if (singlePriceHideInfo != null) {
                    str = singlePriceHideInfo.displayText;
                }
                c184r.LJIJI(new C184S(strLIZJ, strLIZLLL, str2, str3, c212225183jLIZ, z2, zZ0, num2, str, usPopupCardVO2.depositPrice, usPopupCardVO2.afterCouponPriceContent));
            }
            F0();
        }
    }

    @Override // X.InterfaceC21184217vE
    public final void LJJIIZI(String str, Img img) {
        boolean z;
        List<PlacementLabel> list;
        int i;
        TextView textView;
        if (!isAttachedToWindow()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZJ("not shown, don't refresh title");
            return;
        }
        UsPopupCardVO usPopupCardVO = this.LLIZ;
        if (usPopupCardVO != null) {
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C212198182i c212198182i = this.LLJLLIL;
                PromotionInfo promotionInfo = usPopupCardVO.promotionInfo;
                if (promotionInfo != null) {
                    list = promotionInfo.placementLabels;
                } else {
                    list = null;
                }
                c212198182i.LJIIJJI(new C212199182j(str, false, list, 28));
                C19395610uQ moreActionFlipController = getMoreActionFlipController();
                CharSequence text = ((AppCompatTextView) this.LLJLLIL.LIZ).getText();
                if (moreActionFlipController.LJII && (i = C19395610uQ.LJIIZILJ) != 1 && i == 2 && (textView = (TextView) moreActionFlipController.LIZ.findViewById(R.id.glr)) != null) {
                    textView.setMaxLines(1);
                    textView.setText(text);
                }
            }
            if (img != null && C703302op.LIZ(img.url)) {
                int iLIZ = C21195917x7.LIZ(this.LLJLIL);
                this.LLJZIJLIL.LJIILL(C19411510wz.LIZLLL(img.url, iLIZ, iLIZ, EnumC1769850w9n.LIVE_POP_CARD_PRODUCT_IMAGE), null);
            }
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024a A[PHI: r10
      0x024a: PHI (r10v5 java.lang.String) = (r10v4 java.lang.String), (r10v8 java.lang.String) binds: [B:152:0x0247, B:131:0x01f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015f  */
    @Override // X.InterfaceC21204817yY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLZIJ(int r31, java.lang.Integer r32) {
        /*
            Method dump skipped, instruction units count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212219183d.LJJJLZIJ(int, java.lang.Integer):void");
    }

    public final void N0(View view, View view2) {
        C19ME c19me = (C19ME) view.getLayoutParams();
        if (c19me.endToStart != -1 || c19me.endToEnd != view2.getId()) {
            c19me.endToStart = -1;
            c19me.endToEnd = view2.getId();
            c19me.setMarginEnd(0);
            C786410Ut5.W5(view, c19me);
        }
    }

    public final void O0(View view, View view2) {
        C19ME c19me = (C19ME) view.getLayoutParams();
        if (c19me.endToEnd != -1 || c19me.endToStart != view2.getId()) {
            c19me.endToEnd = -1;
            c19me.endToStart = view2.getId();
            c19me.setMarginEnd(C1210230hbB.LIZ(8, getContext()));
            C786410Ut5.W5(view, c19me);
        }
    }

    public final void P0(View view, boolean z) {
        if (z) {
            O0(view, getVisibleBtn());
        } else {
            N0(view, getVisibleBtn());
        }
    }

    @Override // X.AbstractC21202317y9, X.InterfaceC21184217vE
    public final void U(ProductItem productItem, C1563990qnl c1563990qnl) {
        FlashSaleAtmosphereStock flashSaleAtmosphereStock;
        List<PlacementLabel> list;
        if (!isAttachedToWindow()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZJ("not shown, don't refresh part");
            return;
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HorizontalPopCardViewV0: onProductRefresh: ");
        sbLIZ.append(productItem);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_NATIVE_SUCCEED, c1563990qnl, C2097608Jq.LJ());
        UsPopupCardVO usPopupCardVO = this.LLIZ;
        boolean z = false;
        if (usPopupCardVO != null && productItem.productId == usPopupCardVO.productId) {
            BagIndex bagIndex = productItem.bagIndex;
            if (bagIndex != null) {
                C186F.LJIILLIIL(this.LLJZIJLIL, bagIndex.value, usPopupCardVO.source, Integer.valueOf(usPopupCardVO.platform));
            }
            Title title = productItem.title;
            FlashSaleAtmosphereStock flashSaleAtmosphereStock2 = null;
            if (title != null) {
                C212198182i c212198182i = this.LLJLLIL;
                String str = title.text;
                UsPopupCardVO usPopupCardVO2 = this.LLIZ;
                if (usPopupCardVO2 != null) {
                    list = usPopupCardVO2.placementLabels;
                } else {
                    list = null;
                }
                c212198182i.LJIIJJI(new C212199182j(str, false, list, 28));
            }
            ImageModel imageModel = productItem.cover;
            if (imageModel != null) {
                String str2 = (String) C13LP.LJJJLL(imageModel.getUrls());
                if (str2 == null) {
                    str2 = "";
                }
                if (C703302op.LIZ(str2) && C703302op.LIZ(str2)) {
                    int iLIZ = C21195917x7.LIZ(this.LLJLIL);
                    this.LLJZIJLIL.LJIILL(C19411510wz.LIZLLL(str2, iLIZ, iLIZ, EnumC1769850w9n.LIVE_POP_CARD_PRODUCT_IMAGE), null);
                    requestLayout();
                }
            }
            ShopBrandLogo shopBrandLogo = productItem.shopBrandLogo;
            if (shopBrandLogo != null) {
                this.LLLI.LJIILIIL(C0132001y.LIZ(shopBrandLogo));
                if (this.LLLI.LJI()) {
                    V0(this.LLJLLIL.LIZ, this.LLJLL.LIZ);
                } else {
                    setProductInfoAtStartOfCloseBtn(this.LLJLLIL.LIZ);
                }
            }
            LiveFlashSaleInfo liveFlashSaleInfo = productItem.liveFlashSaleInfo;
            if (liveFlashSaleInfo != null) {
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo;
                if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphereStock = flashSaleAtmosphereInfo.flashSaleAtmosphereStock) != null) {
                    flashSaleAtmosphereStock2 = new FlashSaleAtmosphereStock(liveFlashSaleInfo.stockStatus, liveFlashSaleInfo.availableStock, flashSaleAtmosphereStock.activityStockText, flashSaleAtmosphereStock.totalActivityStock);
                    if (flashSaleAtmosphereStock2.activityStockStatus == 3) {
                        z = true;
                    }
                }
                LJJJLIIL(flashSaleAtmosphereStock2, z, true);
            }
        }
    }

    public final void V0(View view, View view2) {
        if (C288750BTl.LIZ()) {
            return;
        }
        C19ME c19me = (C19ME) view.getLayoutParams();
        if (c19me.endToStart != -1 || c19me.endToEnd != view2.getId()) {
            c19me.endToStart = -1;
            c19me.endToEnd = view2.getId();
            c19me.setMarginEnd(0);
            C786410Ut5.W5(view, c19me);
        }
    }

    public final void l0(View view, View view2) {
        if (view.getVisibility() == 0) {
            if (view.getBottom() + C1210230hbB.LIZ(3, getContext()) <= view2.getTop()) {
                N0(view, view2);
                return;
            } else {
                O0(view, view2);
                return;
            }
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJII("only visible benefitView need check");
    }

    public final void n0(List list, long j) {
        if (this.LLL.LJI()) {
            Animator animatorLJFF = this.LLL.LJFF();
            animatorLJFF.setStartDelay(j);
            animatorLJFF.setDuration(100L);
            ((ArrayList) list).add(animatorLJFF);
        }
        if (this.LLLF.LJI()) {
            Animator animatorLJFF2 = this.LLLF.LJFF();
            animatorLJFF2.setStartDelay(j);
            animatorLJFF2.setDuration(100L);
            ((ArrayList) list).add(animatorLJFF2);
        }
        if (this.LLJLILLLLZIIL.LJI()) {
            Animator animatorLJFF3 = this.LLJLILLLLZIIL.LJFF();
            animatorLJFF3.setStartDelay(j);
            animatorLJFF3.setDuration(100L);
            ((ArrayList) list).add(animatorLJFF3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0GrO] */
    public C212219183d(Context context, AttributeSet attributeSet, int i) {
        C184R<C426160GnO> c184r;
        super(context, attributeSet, i);
        this.LLJLIL = 1;
        this.LLLII = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(22));
        this.LLLIIIIL = -1;
        this.LLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 24));
        LayoutInflater layoutInflaterCloneInContext = C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp));
        if (C288750BTl.LIZ()) {
            C786410Ut5.Sd(R.layout.bxc, layoutInflaterCloneInContext, this);
        } else {
            C786410Ut5.Sd(R.layout.bxb, layoutInflaterCloneInContext, this);
        }
        if (C288750BTl.LIZ()) {
            c184r = new C184R<>(getEcommerceliveProductPriceLayoutFromXml(), getEcommerceliveProductMinDepositFromXml(), getEcommerceliveProductAfterCouponPriceFromXml(), new C184T<C425870Gmv>() { // from class: X.186T
                public C186W LIZ = new C19345910mP(0);

                @Override // X.C184T
                public final TuxTextView LIZ(C425870Gmv c425870Gmv) {
                    C425870Gmv c425870Gmv2 = c425870Gmv;
                    int iIndexOf = this.LIZ.LJIILLIIL().indexOf("format_origin_price");
                    if (iIndexOf >= c425870Gmv2.getChildCount()) {
                        iIndexOf = -1;
                    }
                    TuxTextView tuxTextView = new TuxTextView(c425870Gmv2.getContext(), null, 6, 0);
                    tuxTextView.setId(R.id.gls);
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setTextAlignment(5);
                    tuxTextView.setTuxFont(this.LIZ.LJII());
                    tuxTextView.setGravity(17);
                    tuxTextView.setTextColorRes(this.LIZ.LIZLLL());
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    TextPaint paint = tuxTextView.getPaint();
                    paint.setFlags(16);
                    paint.setAntiAlias(true);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, this.LIZ.LIZ());
                    marginLayoutParams.setMarginStart(tuxTextView.getContext().getResources().getDimensionPixelSize(R.dimen.ug));
                    c425870Gmv2.addView(tuxTextView, iIndexOf, marginLayoutParams);
                    return tuxTextView;
                }

                @Override // X.C184T
                public final TuxTextView LIZIZ(C425870Gmv c425870Gmv) {
                    C425870Gmv c425870Gmv2 = c425870Gmv;
                    int iIndexOf = this.LIZ.LJIILLIIL().indexOf("format_available_price");
                    if (iIndexOf >= c425870Gmv2.getChildCount()) {
                        iIndexOf = -1;
                    }
                    TuxTextView tuxTextView = new TuxTextView(c425870Gmv2.getContext(), null, 6, 0);
                    tuxTextView.setId(R.id.gma);
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setTextAlignment(5);
                    tuxTextView.setGravity(this.LIZ.LJIIIIZZ());
                    c425870Gmv2.addView(tuxTextView, iIndexOf, new ViewGroup.MarginLayoutParams(-2, this.LIZ.LJIIJ()));
                    return tuxTextView;
                }

                @Override // X.C184T
                public final TuxTextView LIZJ(C425870Gmv c425870Gmv) {
                    int iIntValue;
                    C425870Gmv c425870Gmv2 = c425870Gmv;
                    int iIndexOf = this.LIZ.LJIILLIIL().indexOf("discount_tag");
                    if (iIndexOf >= c425870Gmv2.getChildCount()) {
                        iIndexOf = -1;
                    }
                    if (this.LIZ.LJIILL().LJ() == EnumC19354910nr.NONE) {
                        return null;
                    }
                    TuxTextView tuxTextView = new TuxTextView(c425870Gmv2.getContext(), null, 6, 0);
                    tuxTextView.setId(R.id.gkp);
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setGravity(17);
                    tuxTextView.setTextAlignment(5);
                    if (C19355210nu.LIZ[this.LIZ.LJIILL().LJ().ordinal()] == 1) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = this.LIZ.LJIILL().LIZJ();
                        c384050F3z.LIZIZ = this.LIZ.LJIILL().LIZIZ();
                        tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
                    }
                    C426750GoL.LJIIL(tuxTextView, this.LIZ.LJIILL().LJII(), 0, this.LIZ.LJIILL().LJII(), 0, 16);
                    Integer numLJI = this.LIZ.LJIILL().LJI();
                    if (numLJI != null) {
                        tuxTextView.setTuxFont(numLJI.intValue());
                    }
                    Integer numLJFF = this.LIZ.LJIILL().LJFF();
                    if (numLJFF != null) {
                        tuxTextView.setTextColorRes(numLJFF.intValue());
                    }
                    Integer numLIZLLL = this.LIZ.LJIILL().LIZLLL();
                    if (numLIZLLL != null) {
                        iIntValue = numLIZLLL.intValue();
                    } else {
                        iIntValue = -2;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, iIntValue);
                    marginLayoutParams.setMarginStart(tuxTextView.getContext().getResources().getDimensionPixelSize(R.dimen.ug));
                    c425870Gmv2.addView(tuxTextView, iIndexOf, marginLayoutParams);
                    return tuxTextView;
                }

                @Override // X.C184T
                public final TuxTextView LIZLLL(C425870Gmv c425870Gmv) {
                    C425870Gmv c425870Gmv2 = c425870Gmv;
                    TuxTextView tuxTextView = new TuxTextView(c425870Gmv2.getContext(), null, 6, 0);
                    tuxTextView.setId(R.id.gmc);
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setTextAlignment(5);
                    tuxTextView.setGravity(this.LIZ.LJIIIIZZ());
                    tuxTextView.setTuxFont(this.LIZ.LJIILIIL());
                    tuxTextView.setTextColorRes(this.LIZ.LJI());
                    c425870Gmv2.addView(tuxTextView, new ViewGroup.MarginLayoutParams(-2, this.LIZ.LJIIJ()));
                    return tuxTextView;
                }

                @Override // X.C184T
                public final void LJ(C186W c186w) {
                    this.LIZ = c186w;
                }
            });
        } else {
            c184r = new C184R<>(getEcommerceliveProductPriceLayoutFromXml(), getEcommerceliveProductMinDepositFromXml(), getEcommerceliveProductAfterCouponPriceFromXml(), new C184T<C426160GnO>() { // from class: X.186S
                public C186W LIZ = new C19345910mP(0);

                @Override // X.C184T
                public final TuxTextView LIZ(C426160GnO c426160GnO) {
                    C426160GnO c426160GnO2 = c426160GnO;
                    int iIndexOf = this.LIZ.LJIILLIIL().indexOf("format_origin_price");
                    if (iIndexOf >= c426160GnO2.getChildCount()) {
                        iIndexOf = -1;
                    }
                    TuxTextView tuxTextView = new TuxTextView(c426160GnO2.getContext(), null, 6, 0);
                    tuxTextView.setId(R.id.gls);
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setTextAlignment(5);
                    tuxTextView.setTuxFont(this.LIZ.LJII());
                    tuxTextView.setGravity(17);
                    tuxTextView.setTextColorRes(this.LIZ.LIZLLL());
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    TextPaint paint = tuxTextView.getPaint();
                    paint.setFlags(16);
                    paint.setAntiAlias(true);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, this.LIZ.LIZ());
                    marginLayoutParams.setMarginStart(tuxTextView.getContext().getResources().getDimensionPixelSize(R.dimen.ug));
                    marginLayoutParams.topMargin = this.LIZ.LJIILJJIL();
                    c426160GnO2.addView(tuxTextView, iIndexOf, marginLayoutParams);
                    return tuxTextView;
                }

                @Override // X.C184T
                public final TuxTextView LIZIZ(C426160GnO c426160GnO) {
                    C426160GnO c426160GnO2 = c426160GnO;
                    int iIndexOf = this.LIZ.LJIILLIIL().indexOf("format_available_price");
                    if (iIndexOf >= c426160GnO2.getChildCount()) {
                        iIndexOf = -1;
                    }
                    TuxTextView tuxTextView = new TuxTextView(c426160GnO2.getContext(), null, 6, 0);
                    tuxTextView.setId(R.id.gma);
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setTextAlignment(5);
                    tuxTextView.setGravity(this.LIZ.LJIIIIZZ());
                    c426160GnO2.addView(tuxTextView, iIndexOf, new ViewGroup.MarginLayoutParams(-2, this.LIZ.LJIIJ()));
                    return tuxTextView;
                }

                @Override // X.C184T
                public final TuxTextView LIZJ(C426160GnO c426160GnO) {
                    int iIntValue;
                    C426160GnO c426160GnO2 = c426160GnO;
                    int iIndexOf = this.LIZ.LJIILLIIL().indexOf("discount_tag");
                    if (iIndexOf >= c426160GnO2.getChildCount()) {
                        iIndexOf = -1;
                    }
                    if (this.LIZ.LJIILL().LJ() == EnumC19354910nr.NONE) {
                        return null;
                    }
                    TuxTextView tuxTextView = new TuxTextView(c426160GnO2.getContext(), null, 6, 0);
                    tuxTextView.setId(R.id.gkp);
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setGravity(17);
                    tuxTextView.setTextAlignment(5);
                    if (C19355110nt.LIZ[this.LIZ.LJIILL().LJ().ordinal()] == 1) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = this.LIZ.LJIILL().LIZJ();
                        c384050F3z.LIZIZ = this.LIZ.LJIILL().LIZIZ();
                        tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
                    }
                    C426750GoL.LJIIL(tuxTextView, this.LIZ.LJIILL().LJII(), 0, this.LIZ.LJIILL().LJII(), 0, 16);
                    Integer numLJI = this.LIZ.LJIILL().LJI();
                    if (numLJI != null) {
                        tuxTextView.setTuxFont(numLJI.intValue());
                    }
                    Integer numLJFF = this.LIZ.LJIILL().LJFF();
                    if (numLJFF != null) {
                        tuxTextView.setTextColorRes(numLJFF.intValue());
                    }
                    Integer numLIZLLL = this.LIZ.LJIILL().LIZLLL();
                    if (numLIZLLL != null) {
                        iIntValue = numLIZLLL.intValue();
                    } else {
                        iIntValue = -2;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, iIntValue);
                    marginLayoutParams.setMarginStart(tuxTextView.getContext().getResources().getDimensionPixelSize(R.dimen.ug));
                    Integer numLIZ = this.LIZ.LJIILL().LIZ();
                    if (numLIZ != null) {
                        marginLayoutParams.topMargin = numLIZ.intValue();
                    }
                    c426160GnO2.addView(tuxTextView, iIndexOf, marginLayoutParams);
                    return tuxTextView;
                }

                @Override // X.C184T
                public final TuxTextView LIZLLL(C426160GnO c426160GnO) {
                    C426160GnO c426160GnO2 = c426160GnO;
                    TuxTextView tuxTextView = new TuxTextView(c426160GnO2.getContext(), null, 6, 0);
                    tuxTextView.setId(R.id.gmc);
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setTextAlignment(5);
                    tuxTextView.setGravity(this.LIZ.LJIIIIZZ());
                    tuxTextView.setTuxFont(this.LIZ.LJIILIIL());
                    tuxTextView.setTextColorRes(this.LIZ.LJI());
                    c426160GnO2.addView(tuxTextView, new ViewGroup.MarginLayoutParams(-2, this.LIZ.LJIIJ()));
                    return tuxTextView;
                }

                @Override // X.C184T
                public final void LJ(C186W c186w) {
                    this.LIZ = c186w;
                }
            });
        }
        this.LLJLLL = c184r;
        this.LLJLL = new C212230183o(getEcommerceliveBtnBuyFromXml());
        this.LLLI = new C212232183q(getEcommerceliveSellerBrandFromXml());
        this.LLJLLIL = new C212198182i(getEcommerceliveProductDescFromXml());
        C186F<ConstraintLayout> c186f = new C186F<>(getEcommerceliveProductMainImageLayoutFromXml(), new C186H<ConstraintLayout>() { // from class: X.0GrO
            public InterfaceC428630GrN LIZ = new C428650GrP();

            @Override // X.C186H
            public final C0H0C LIZ(ConstraintLayout constraintLayout) {
                return (C0H0C) constraintLayout.findViewById(R.id.gm0);
            }

            @Override // X.C186H
            public final TuxTextView LIZIZ(ConstraintLayout constraintLayout) {
                ConstraintLayout constraintLayout2 = constraintLayout;
                TuxTextView tuxTextView = new TuxTextView(constraintLayout2.getContext(), null, 6, 0);
                tuxTextView.setId(R.id.glt);
                tuxTextView.setTextColorRes(R.attr.ee);
                tuxTextView.setTuxFont(92);
                tuxTextView.setMaxLines(1);
                tuxTextView.setGravity(17);
                tuxTextView.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), 0, 0);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView.setBackground(C800330VaR.LIZIZ(tuxTextView.getContext(), R.drawable.bmw));
                C19ME c19me = new C19ME(-2, this.LIZ.LIZJ());
                c19me.startToStart = 0;
                c19me.topToTop = 0;
                c19me.constrainedWidth = true;
                constraintLayout2.addView(tuxTextView, c19me);
                return tuxTextView;
            }

            @Override // X.C186H
            public final C186K LIZJ(ConstraintLayout constraintLayout) {
                return (C186K) constraintLayout.findViewById(R.id.gmj);
            }

            @Override // X.C186H
            public final AppCompatImageView LIZLLL(ConstraintLayout constraintLayout) {
                ConstraintLayout constraintLayout2 = constraintLayout;
                AppCompatImageView appCompatImageView = new AppCompatImageView(constraintLayout2.getContext());
                appCompatImageView.setId(R.id.gm6);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z.LIZJ = Float.valueOf(this.LIZ.LIZ());
                appCompatImageView.setBackground(c384050F3z.LIZ(constraintLayout2.getContext()));
                C19ME c19me = new C19ME(0, 0);
                c19me.endToEnd = 0;
                c19me.startToStart = 0;
                c19me.topToTop = 0;
                c19me.bottomToBottom = 0;
                c19me.constrainedWidth = true;
                constraintLayout2.addView(appCompatImageView, c19me);
                return appCompatImageView;
            }

            @Override // X.C186H
            public final SmartImageView LJ(ConstraintLayout constraintLayout) {
                Integer numLIZJ;
                SmartImageView smartImageView = (SmartImageView) constraintLayout.findViewById(R.id.gm_);
                if (this.LIZ.LJII()) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.eu9);
                    c384050F3z.LIZJ = Float.valueOf(this.LIZ.LIZ());
                    smartImageView.setPlaceholderImage(c384050F3z.LIZ(smartImageView.getContext()));
                }
                Integer bgColor = this.LIZ.getBgColor();
                if (bgColor != null && (numLIZJ = C1308910kAL.LIZJ(bgColor.intValue(), smartImageView.getContext())) != null) {
                    smartImageView.setColorFilter(numLIZJ.intValue());
                }
                return smartImageView;
            }

            @Override // X.C186H
            public final TuxTextView LJFF(ConstraintLayout constraintLayout) {
                ConstraintLayout constraintLayout2 = constraintLayout;
                TuxTextView tuxTextView = new TuxTextView(constraintLayout2.getContext(), null, 6, 0);
                tuxTextView.setId(R.id.glu);
                tuxTextView.setTextColorRes(R.attr.ee);
                tuxTextView.setTuxFont(91);
                tuxTextView.setGravity(17);
                tuxTextView.setMaxLines(1);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJIIJJI = Float.valueOf(this.LIZ.LIZLLL());
                c384050F3z.LIZIZ = Integer.valueOf(this.LIZ.LJ());
                tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
                tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                C19ME c19me = new C19ME(-2, this.LIZ.LIZJ());
                c19me.endToEnd = 0;
                c19me.startToEnd = R.id.glt;
                c19me.topToTop = 0;
                c19me.horizontalBias = 0.0f;
                c19me.constrainedWidth = true;
                constraintLayout2.addView(tuxTextView, c19me);
                return tuxTextView;
            }

            @Override // X.C186H
            public final void LJI(InterfaceC428630GrN interfaceC428630GrN) {
                this.LIZ = interfaceC428630GrN;
            }
        });
        this.LLJZIJLIL = c186f;
        C184D c184d = new C184D(getEcommerceliveProductAtmosphereLayoutFromXml());
        c184d.LJIIJJI = new C212222183g(this);
        this.LLJZ = c184d;
        if (C288750BTl.LIZ()) {
            C18L9 c18l9 = new C18L9(context, null);
            c18l9.setId(R.id.gmk);
            C786410Ut5.Q(c18l9, 8);
            C18L9 c18l92 = new C18L9(context, null);
            c18l92.setId(R.id.gmp);
            C786410Ut5.Q(c18l92, 8);
            C18L9 c18l93 = new C18L9(context, null);
            c18l93.setId(R.id.up2);
            C786410Ut5.Q(c18l93, 8);
            C14L7 benefitsVerticalLayoutFromXml = getBenefitsVerticalLayoutFromXml();
            if (benefitsVerticalLayoutFromXml != null) {
                benefitsVerticalLayoutFromXml.setVerticalLayoutDirection(0);
                benefitsVerticalLayoutFromXml.setViews(C1697810uHb.LJIIJJI(new Pair(c18l9, 10), new Pair(c18l92, 20), new Pair(c18l93, 30)));
            }
            this.LLJLILLLLZIIL = new C0HAL(c18l93);
            this.LLL = new C184W(c18l9, "promotion_items");
            this.LLLF = new C184W(c18l92, "second_promotion_items");
            C14L7 ecommerceliveLiveExclusiveFlashSaleLayoutFromXmlV4 = getEcommerceliveLiveExclusiveFlashSaleLayoutFromXmlV4();
            if (ecommerceliveLiveExclusiveFlashSaleLayoutFromXmlV4 != null) {
                ecommerceliveLiveExclusiveFlashSaleLayoutFromXmlV4.setVerticalLayoutDirection(0);
            }
            this.LLLFFI = new C212228183m(getEcommerceliveLiveExclusiveFlashSaleLayoutFromXmlV4());
        } else {
            this.LLJLILLLLZIIL = new C0HAL(getSellingPointViewFromXml());
            this.LLL = new C184W(getEcommercelivePromotionLayoutFromXml(), "promotion_items");
            this.LLLF = new C184W(getEcommerceliveSecondPromotionLayoutFromXml(), "second_promotion_items");
            this.LLLFFI = new C212228183m(getEcommerceliveLiveExclusiveFlashSaleLayoutFromXml());
        }
        this.LLLFF = new C212224183i(getEcommerceliveIconAssistantFromXml());
        this.LLLFZ = new C212229183n(getEcommerceliveCreatorExclusivePricePreheatLayoutFromXml());
        this.LLLFFI.LJIILLIIL = this;
        getControllerLifecycleManager().LIZ(this.LLL);
        getControllerLifecycleManager().LIZ(this.LLLF);
        getControllerLifecycleManager().LIZ(c186f);
        C181O controllerShowParametersManager = getControllerShowParametersManager();
        C184W c184w = this.LLL;
        controllerShowParametersManager.LIZ.put(c184w.LIZIZ, new C181Q(c184w, true));
        C181O controllerShowParametersManager2 = getControllerShowParametersManager();
        C184W c184w2 = this.LLLF;
        controllerShowParametersManager2.LIZ.put(c184w2.LIZIZ, new C181Q(c184w2, true));
        C181O controllerShowParametersManager3 = getControllerShowParametersManager();
        C0HAL c0hal = this.LLJLILLLLZIIL;
        controllerShowParametersManager3.LIZ.put(c0hal.LIZIZ, new C181Q(c0hal, true));
        getControllerShowParametersManager().LIZ.put("atmosphere_layout", new C181Q(c184d, false));
        if (C288750BTl.LIZ()) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZ = R.raw.icon_x_mark_small;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
            TuxIconView ecommerceliveIconCloseFromXml = getEcommerceliveIconCloseFromXml();
            if (ecommerceliveIconCloseFromXml != null) {
                ecommerceliveIconCloseFromXml.setImageDrawable(layerDrawableLJIILIIL);
            }
        }
    }

    @Override // X.InterfaceC21204817yY
    public final void LJJJLIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock, boolean z, boolean z2) {
        Integer numValueOf;
        int i;
        boolean z3;
        AtmosphereTag atmosphereTag;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFlashSaleStockStatus stockStatus = ");
        if (flashSaleAtmosphereStock != null) {
            numValueOf = Integer.valueOf(flashSaleAtmosphereStock.activityStockStatus);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", ");
        sbLIZ.append(z2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        boolean z4 = true;
        if (flashSaleAtmosphereStock != null) {
            UsPopupCardVO usPopupCardVO = this.LLIZ;
            if (usPopupCardVO != null) {
                i = usPopupCardVO.flashSaleStockLimit;
            } else {
                i = 0;
            }
            flashSaleAtmosphereStock.LIZ = i;
            ArrayList arrayList = new ArrayList();
            this.LLLFFI.LJIILLIIL(flashSaleAtmosphereStock, arrayList);
            C184D c184d = this.LLJZ;
            if (!z && !s0()) {
                z3 = false;
            } else {
                z3 = true;
            }
            C184F c184f = c184d.LJ;
            if (c184f != null && c184f.LIZLLL() == 5) {
                C184F c184f2 = c184d.LJ;
                if ((c184f2 instanceof AtmosphereTag) && (atmosphereTag = (AtmosphereTag) c184f2) != null) {
                    atmosphereTag.LIZLLL = flashSaleAtmosphereStock;
                } else {
                    atmosphereTag = null;
                }
                C184D.LJIILJJIL(c184d, 5, atmosphereTag, false, 0L, z3, arrayList, 8);
            }
            if (!arrayList.isEmpty()) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(300L);
                animatorSet.playTogether(arrayList);
                animatorSet.start();
            }
        }
        if (z2) {
            UsPopupCardVO usPopupCardVO2 = this.LLIZ;
            if (usPopupCardVO2 == null || true != usPopupCardVO2.isSoldOut()) {
                z4 = false;
            }
            S0(z4, null, z);
        }
    }

    public final void S0(boolean z, Integer num, boolean z2) {
        boolean z3;
        C212230183o c212230183o = this.LLJLL;
        if (!z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        c212230183o.LJIILJJIL(new AnonymousClass1845(z3, num));
    }

    public final boolean W0(C184W c184w, List<PromotionLabel> list, final UsPopupCardVO usPopupCardVO) {
        c184w.LJIIZILJ(new C212244184c(list, usPopupCardVO.createTime, usPopupCardVO.serverTime, 56));
        c184w.LIZJ = new AnonymousClass1847() { // from class: X.183f
            /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
            @Override // X.AnonymousClass1847
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r5 = this;
                    X.183d r2 = r5.LIZ
                    com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r1 = r2
                    r2.getClass()
                    X.09Fh r0 = X.C2341109Fh.LIZ
                    r0.getClass()
                    java.lang.String r0 = "recheckPromotionLayout, because promotionViewController change visible"
                    X.C2341109Fh.LJ(r0)
                    boolean r0 = X.C212219183d.p0(r1)
                    if (r0 == 0) goto L86
                    r4 = 1
                L18:
                    X.183q r0 = r2.LLLI
                    boolean r0 = r0.LJI()
                    if (r0 == 0) goto L22
                    int r4 = r4 + (-1)
                L22:
                    r3 = 0
                    r2.LLJL = r3
                    if (r4 <= 0) goto L6c
                    X.184W r0 = r2.LLL
                    boolean r0 = r0.LJI()
                    if (r0 == 0) goto L35
                    int r0 = r2.LLJL
                    int r0 = r0 + 1
                    r2.LLJL = r0
                L35:
                    int r0 = r2.LLJL
                    if (r0 >= r4) goto L47
                    X.184W r0 = r2.LLLF
                    boolean r0 = r0.LJI()
                    if (r0 == 0) goto L47
                    int r0 = r2.LLJL
                    int r0 = r0 + 1
                    r2.LLJL = r0
                L47:
                    int r0 = r2.LLJL
                    if (r0 >= r4) goto L66
                    com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r0 = r2.LLIZ
                    if (r0 == 0) goto L5f
                    boolean r0 = r2.Y0(r0)
                L53:
                    if (r0 == 0) goto L66
                    int r0 = r2.LLJL
                    int r0 = r0 + 1
                    r2.LLJL = r0
                L5b:
                    r2.I0(r1)
                    return
                L5f:
                    X.0HAL r0 = r2.LLJLILLLLZIIL
                    boolean r0 = r0.LJI()
                    goto L53
                L66:
                    X.0HAL r0 = r2.LLJLILLLLZIIL
                    r0.LJIIJ(r3)
                    goto L5b
                L6c:
                    X.0HAL r0 = r2.LLJLILLLLZIIL
                    r0.LJIIJ(r3)
                    X.184W r0 = r2.LLL
                    r0.destroy()
                    X.184W r0 = r2.LLL
                    r0.LJIIJ(r3)
                    X.184W r0 = r2.LLLF
                    r0.destroy()
                    X.184W r0 = r2.LLLF
                    r0.LJIIJ(r3)
                    goto L5b
                L86:
                    r4 = 2
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C212221183f.LIZ():void");
            }
        };
        return c184w.LJI();
    }

    @Override // X.InterfaceC21184217vE
    public final void u(UsPopupCardVO usPopupCardVO, String str, Map<String, ? extends Object> map) {
        List<PlacementLabel> list;
        SinglePriceItem singlePriceItem;
        boolean z;
        FlashSaleAtmosphere flashSaleAtmosphere;
        if (this.LLIZ == null) {
            return;
        }
        this.LLIZ = usPopupCardVO;
        ((LinkedHashMap) this.LLILZLL).clear();
        getControllerLifecycleManager().LIZIZ();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HorizontalPopCardViewV0: onProductRefresh: ");
        sbLIZ.append(C292450BdD.LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (C292450BdD.LIZ()) {
            if (!isAttachedToWindow()) {
                C2341109Fh.LIZJ("not shown, don't refresh all");
                return;
            }
            C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_NATIVE_SUCCEED, usPopupCardVO.chainInfo, C2097608Jq.LJ());
            Animator animator = this.LLLIIII;
            if (animator != null && true == animator.isStarted()) {
                Animator animator2 = this.LLLIIII;
                if (animator2 != null) {
                    animator2.addListener(new ALAdapterS1S1200000_32(this, usPopupCardVO, str, 0));
                    return;
                }
                return;
            }
            E0(usPopupCardVO, str);
            return;
        }
        C186F.LJIILLIIL(this.LLJZIJLIL, usPopupCardVO.bagIndex, usPopupCardVO.source, Integer.valueOf(usPopupCardVO.platform));
        if (this.LLJZ.LJ != null) {
            this.LLJZIJLIL.LJIIZILJ(false);
        }
        C212198182i c212198182i = this.LLJLLIL;
        String str2 = usPopupCardVO.title;
        PromotionInfo promotionInfo = usPopupCardVO.promotionInfo;
        String str3 = null;
        if (promotionInfo != null) {
            list = promotionInfo.placementLabels;
        } else {
            list = null;
        }
        c212198182i.LJIIJJI(new C212199182j(str2, false, list, 28));
        S0(usPopupCardVO.isSoldOut(), Integer.valueOf(usPopupCardVO.buyButtonType), s0());
        PromotionInfo promotionInfo2 = usPopupCardVO.promotionInfo;
        if (promotionInfo2 != null) {
            L0(this, usPopupCardVO, false, false, 6);
            PromotionProductPrice promotionProductPrice = promotionInfo2.productPrice;
            if (promotionProductPrice != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
                C184R<C426160GnO> c184r = this.LLJLLL;
                String strLIZJ = C743702vL.LIZJ(singlePriceItem);
                String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
                String str4 = singlePriceItem.pricePrefix;
                String str5 = singlePriceItem.discountFormat;
                C212225183j c212225183jLIZ = C212227183l.LIZ(singlePriceItem);
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo;
                if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && flashSaleAtmosphere.status == 3) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zZ0 = Z0();
                Integer num = singlePriceItem.priceDisplayMode;
                SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
                if (singlePriceHideInfo != null) {
                    str3 = singlePriceHideInfo.displayText;
                }
                c184r.LJIJI(new C184S(strLIZJ, strLIZLLL, str4, str5, c212225183jLIZ, z, zZ0, num, str3, usPopupCardVO.depositPrice, usPopupCardVO.afterCouponPriceContent));
            }
            List<PromotionSticker> list2 = promotionInfo2.promotionStickers;
            if (list2 != null) {
                this.LLJZIJLIL.LJIILJJIL(list2, this.LLILZLL);
            }
        }
        if (TextUtils.equals(str, "live_message_exclusive_price_promotion_status_change") && (h0() || s0())) {
            C184D c184d = this.LLJZ;
            c184d.getClass();
            c184d.LJIILIIL(AnonymousClass0207.get$arr$(103));
            this.LLJZIJLIL.LJIIZILJ(true);
        }
        F0();
    }

    public final void u0(UsPopupCardVO usPopupCardVO, boolean z, int i) {
        int iLIZ = C21195917x7.LIZ(i);
        String strLIZLLL = C19411510wz.LIZLLL(usPopupCardVO.imageUrl, iLIZ, iLIZ, EnumC1769850w9n.LIVE_POP_CARD_PRODUCT_IMAGE);
        C05XL<Unit> c05xl = C339120DRe.LIZ.get(strLIZLLL);
        if (c05xl != null && c05xl.isCompleted()) {
            z0(usPopupCardVO, z, strLIZLLL, true);
        } else if (C292310Bcz.LIZ) {
            z0(usPopupCardVO, z, strLIZLLL, false);
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0NSN(c05xl, this, usPopupCardVO, z, strLIZLLL, null), 3);
        }
    }

    public final void z0(final UsPopupCardVO usPopupCardVO, final boolean z, String str, final boolean z2) {
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = System.currentTimeMillis();
        this.LLJZIJLIL.LJIILL(str, new AbstractC1335900krs() { // from class: X.183k
            @Override // X.AbstractC1335900krs, X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view) {
                c238400w2.element = System.currentTimeMillis();
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                long jCurrentTimeMillis = System.currentTimeMillis() - c238400w2.element;
                InterfaceC212166181c popCardViewCallback = this.getPopCardViewCallback();
                if (popCardViewCallback != null) {
                    popCardViewCallback.LJIILLIIL(usPopupCardVO, z, z2, false, jCurrentTimeMillis);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                long jCurrentTimeMillis = System.currentTimeMillis() - c238400w2.element;
                InterfaceC212166181c popCardViewCallback = this.getPopCardViewCallback();
                if (popCardViewCallback != null) {
                    popCardViewCallback.LJIILLIIL(usPopupCardVO, z, z2, true, jCurrentTimeMillis);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void L0(X.C212219183d r15, com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r16, boolean r17, boolean r18, int r19) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212219183d.L0(X.183d, com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO, boolean, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212219183d.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21202917yF
    public final void j0(UsPopupCardVO usPopupCardVO, C1743900vTw c1743900vTw, final Function2<? super Boolean, ? super String, Unit> function2, boolean z, final boolean z2, int i) {
        List<PlacementLabel> list;
        PromotionLabel promotionLabel;
        TuxTextView tuxTextView;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        PriceConfig priceConfig;
        PriceTextConfig priceTextConfig;
        PriceTextConfig priceTextConfig2;
        PriceTextConfig priceTextConfig3;
        PriceTextConfig priceTextConfig4;
        DiscountTag discountTag;
        DiscountTag discountTag2;
        PriceTextConfig priceTextConfig5;
        PriceTextConfig priceTextConfig6;
        List<String> list2;
        PriceTextConfig priceTextConfig7;
        boolean z3;
        FlashSaleAtmosphere flashSaleAtmosphere;
        HashMap<String, PriceConfig> map;
        PriceConfig priceConfig2;
        HashMap<String, PriceConfig> map2;
        PriceConfig priceConfig3;
        HashMap<String, PriceConfig> map3;
        PriceConfig priceConfig4;
        HashMap<String, PriceConfig> map4;
        PriceConfig priceConfig5;
        HashMap<String, PriceConfig> map5;
        HashMap<String, PriceConfig> map6;
        PriceConfig priceConfig6;
        HashMap<String, PriceConfig> map7;
        PriceConfig priceConfig7;
        HashMap<String, PriceConfig> map8;
        PriceConfig priceConfig8;
        HashMap<String, PriceConfig> map9;
        PriceConfig priceConfig9;
        HashMap<String, PriceConfig> map10;
        PriceConfig priceConfig10;
        HashMap<String, PriceConfig> map11;
        PriceConfig priceConfig11;
        HashMap<String, PriceConfig> map12;
        List<PromotionSticker> list3;
        String strLIZJ;
        setPopCardStyle(usPopupCardVO);
        this.LLLIIIL = false;
        this.LLLIIL = false;
        this.LLLIILIL = z2;
        M0();
        u0(usPopupCardVO, z, i);
        getControllerLifecycleManager().LIZIZ();
        this.LLIZ = usPopupCardVO;
        this.LLLIIIIL = -1;
        this.LLJLIL = i;
        C186F.LJIILLIIL(this.LLJZIJLIL, usPopupCardVO.bagIndex, usPopupCardVO.source, Integer.valueOf(usPopupCardVO.platform));
        S0(usPopupCardVO.isSoldOut(), Integer.valueOf(usPopupCardVO.buyButtonType), s0());
        this.LLLFF.LJIIJJI(new C212237183v(usPopupCardVO.assistantSwitch, usPopupCardVO.assistantModules));
        if (this.LLLFF.LJI()) {
            this.LLJLL.LJIIJ(false);
            C786410Ut5.I7(new C19LP(this, 1, 42), this.LLLFF.LIZ);
            Map<String, String> map13 = this.LLILZLL;
            map13.put("has_live_helper", "1");
            map13.put("user_type", "moderator");
            if (c1743900vTw == null || (strLIZJ = c1743900vTw.LIZJ("author_id")) == null) {
                strLIZJ = "";
            }
            map13.put("moderator_id", strLIZJ);
        } else {
            this.LLJLL.LJIIJ(true);
        }
        this.LLLI.LJIILIIL(usPopupCardVO.enhancedBrandLogo);
        if (this.LLLI.LJI()) {
            V0(this.LLJLLIL.LIZ, this.LLJLL.LIZ);
        } else {
            setProductInfoAtStartOfCloseBtn(this.LLJLLIL.LIZ);
        }
        this.LLILZIL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().o1();
        L0(this, usPopupCardVO, false, true, 2);
        PromotionInfo promotionInfo = usPopupCardVO.promotionInfo;
        if (promotionInfo != null && (list3 = promotionInfo.promotionStickers) != null) {
            this.LLJZIJLIL.LJIILJJIL(list3, this.LLILZLL);
        }
        TopBrand topBrand = usPopupCardVO.topBrand;
        if (topBrand != null) {
            this.LLJZIJLIL.LJIJ(topBrand);
        }
        C212198182i c212198182i = this.LLJLLIL;
        String str = usPopupCardVO.title;
        PromotionInfo promotionInfo2 = usPopupCardVO.promotionInfo;
        String str2 = null;
        if (promotionInfo2 != null) {
            list = promotionInfo2.placementLabels;
        } else {
            list = null;
        }
        c212198182i.LJIIJJI(new C212199182j(str, false, list, 28));
        C212229183n c212229183n = this.LLLFZ;
        PromotionInfo promotionInfo3 = usPopupCardVO.promotionInfo;
        if (promotionInfo3 != null) {
            promotionLabel = promotionInfo3.prelaunchPromotionLabel;
        } else {
            promotionLabel = null;
        }
        c212229183n.LJIIJJI(new AnonymousClass1848(promotionLabel));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(usPopupCardVO.atmosphereTags);
        Collection arrayList2 = usPopupCardVO.staticAtmosphereInfoList;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        arrayList.addAll(arrayList2);
        setAtmosphereTags(arrayList);
        PromotionInfo promotionInfo4 = usPopupCardVO.promotionInfo;
        if (promotionInfo4 != null && (promotionProductPrice = promotionInfo4.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
            C184R<C426160GnO> c184r = this.LLJLLL;
            PriceUiConfig priceUiConfig = singlePriceItem.priceUiConfig;
            if (priceUiConfig != null && (map12 = priceUiConfig.configs) != null) {
                priceConfig = map12.get("pin_card");
            } else {
                priceConfig = null;
            }
            PriceUiConfig priceUiConfig2 = singlePriceItem.priceUiConfig;
            if (priceUiConfig2 != null && (map11 = priceUiConfig2.configs) != null && (priceConfig11 = map11.get("pin_card")) != null) {
                priceTextConfig = priceConfig11.currency;
            } else {
                priceTextConfig = null;
            }
            PriceUiConfig priceUiConfig3 = singlePriceItem.priceUiConfig;
            if (priceUiConfig3 != null && (map10 = priceUiConfig3.configs) != null && (priceConfig10 = map10.get("pin_card")) != null) {
                priceTextConfig2 = priceConfig10.prefix;
            } else {
                priceTextConfig2 = null;
            }
            PriceUiConfig priceUiConfig4 = singlePriceItem.priceUiConfig;
            if (priceUiConfig4 != null && (map9 = priceUiConfig4.configs) != null && (priceConfig9 = map9.get("pin_card")) != null) {
                priceTextConfig3 = priceConfig9.formatOriginPrice;
            } else {
                priceTextConfig3 = null;
            }
            PriceUiConfig priceUiConfig5 = singlePriceItem.priceUiConfig;
            if (priceUiConfig5 != null && (map8 = priceUiConfig5.configs) != null && (priceConfig8 = map8.get("pin_card")) != null) {
                priceTextConfig4 = priceConfig8.formatAvailablePrice;
            } else {
                priceTextConfig4 = null;
            }
            PriceUiConfig priceUiConfig6 = singlePriceItem.priceUiConfig;
            if (priceUiConfig6 != null && (map7 = priceUiConfig6.configs) != null && (priceConfig7 = map7.get("pin_card")) != null) {
                discountTag = priceConfig7.discount;
            } else {
                discountTag = null;
            }
            PriceUiConfig priceUiConfig7 = singlePriceItem.priceUiConfig;
            if (priceUiConfig7 != null && (map6 = priceUiConfig7.configs) != null && (priceConfig6 = map6.get("pin_card")) != null) {
                discountTag2 = priceConfig6.flashSaleDiscount;
            } else {
                discountTag2 = null;
            }
            PriceUiConfig priceUiConfig8 = singlePriceItem.priceUiConfig;
            if (priceUiConfig8 != null && (map5 = priceUiConfig8.configs) != null) {
                map5.get("pin_card");
            }
            PriceUiConfig priceUiConfig9 = singlePriceItem.priceUiConfig;
            if (priceUiConfig9 != null && (map4 = priceUiConfig9.configs) != null && (priceConfig5 = map4.get("pin_card")) != null) {
                priceTextConfig5 = priceConfig5.exceedFormatOriginPrice;
            } else {
                priceTextConfig5 = null;
            }
            PriceUiConfig priceUiConfig10 = singlePriceItem.priceUiConfig;
            if (priceUiConfig10 != null && (map3 = priceUiConfig10.configs) != null && (priceConfig4 = map3.get("pin_card")) != null) {
                priceTextConfig6 = priceConfig4.exceedDiscount;
            } else {
                priceTextConfig6 = null;
            }
            PriceUiConfig priceUiConfig11 = singlePriceItem.priceUiConfig;
            if (priceUiConfig11 != null && (map2 = priceUiConfig11.configs) != null && (priceConfig3 = map2.get("pin_card")) != null) {
                list2 = priceConfig3.discountDisplayOrder;
            } else {
                list2 = null;
            }
            PriceUiConfig priceUiConfig12 = singlePriceItem.priceUiConfig;
            if (priceUiConfig12 != null && (map = priceUiConfig12.configs) != null && (priceConfig2 = map.get("pin_card")) != null) {
                priceTextConfig7 = priceConfig2.afterCouponPrice;
            } else {
                priceTextConfig7 = null;
            }
            C184U c184u = new C184U(priceConfig, priceTextConfig, priceTextConfig2, priceTextConfig3, priceTextConfig4, discountTag, discountTag2, priceTextConfig5, priceTextConfig6, list2, priceTextConfig7);
            c184r.LJIILL = c184u;
            c184r.LJIIL().LJIILIIL(c184u);
            C184R<C426160GnO> c184r2 = this.LLJLLL;
            String strLIZJ2 = C743702vL.LIZJ(singlePriceItem);
            String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
            String str3 = singlePriceItem.pricePrefix;
            String str4 = singlePriceItem.discountFormat;
            C212225183j c212225183jLIZ = C212227183l.LIZ(singlePriceItem);
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && flashSaleAtmosphere.status == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zZ0 = Z0();
            Integer num = singlePriceItem.priceDisplayMode;
            SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
            if (singlePriceHideInfo != null) {
                str2 = singlePriceHideInfo.displayText;
            }
            c184r2.LJIJI(new C184S(strLIZJ2, strLIZLLL, str3, str4, c212225183jLIZ, z3, zZ0, num, str2, usPopupCardVO.depositPrice, usPopupCardVO.afterCouponPriceContent));
        }
        F0();
        C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl() { // from class: X.181j
            @Override // X.AbstractViewOnClickListenerC372950Ejl
            public final void LIZ(View view) {
                Function2 function22;
                if (view != null && (function22 = function2) != null) {
                    function22.invoke(Boolean.valueOf(this.getMoreActionFlipController().LJII), "user_close");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, getEcommerceliveIconCloseFromXml());
        C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl() { // from class: X.181h
            @Override // X.AbstractViewOnClickListenerC372950Ejl
            public final void LIZ(View view) {
                if (view != null) {
                    if (this.LLILZ.getMoreActionFlipController().LJII) {
                        InterfaceC212166181c popCardViewCallback = this.LLILZ.getPopCardViewCallback();
                        if (popCardViewCallback != null) {
                            popCardViewCallback.LIZ("flip_card_pic", null, 0);
                        }
                        if (z2) {
                            this.LLILZ.getMoreActionFlipController().LJIILJJIL = true;
                            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C0NT1(null), 3);
                            return;
                        }
                        return;
                    }
                    InterfaceC212166181c popCardViewCallback2 = this.LLILZ.getPopCardViewCallback();
                    if (popCardViewCallback2 == null) {
                        return;
                    }
                    popCardViewCallback2.LIZ("pic", null, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LLJZIJLIL.LIZ);
        C786410Ut5.I7(new C19LP(this, 2, 42), this.LLJLLIL.LIZ);
        C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl() { // from class: X.181i
            @Override // X.AbstractViewOnClickListenerC372950Ejl
            public final void LIZ(View view) {
                if (view != null) {
                    if (this.LLILZ.getMoreActionFlipController().LJII && z2) {
                        this.LLILZ.getMoreActionFlipController().LJIILJJIL = true;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C0NT2(null), 3);
                    }
                    InterfaceC212166181c popCardViewCallback = this.LLILZ.getPopCardViewCallback();
                    if (popCardViewCallback != null) {
                        popCardViewCallback.LIZ("button", null, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LLJLL.LIZ);
        C786410Ut5.I7(new C19LP(this, 3, 42), this);
        C184R<C426160GnO> c184r3 = this.LLJLLL;
        TuxTextView tuxTextView2 = c184r3.LJIIL;
        if ((tuxTextView2 != null && tuxTextView2.getVisibility() == 0) || ((tuxTextView = c184r3.LJIILIIL) != null && tuxTextView.getVisibility() == 0)) {
            c184r3.LIZ.removeOnLayoutChangeListener(c184r3.LJIIZILJ);
            c184r3.LIZ.addOnLayoutChangeListener(c184r3.LJIIZILJ);
            TuxTextView tuxTextView3 = c184r3.LJII;
            if (tuxTextView3 != null) {
                tuxTextView3.removeOnLayoutChangeListener(c184r3.LJIJ);
            }
            TuxTextView tuxTextView4 = c184r3.LJII;
            if (tuxTextView4 != null) {
                tuxTextView4.addOnLayoutChangeListener(c184r3.LJIJ);
                return;
            }
            return;
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJII("origin price and discount not show");
    }

    public final void a1(List<Animator> list, Integer num, int i, long j, long j2, long j3, long j4) {
        boolean z;
        if (this.LLLFFI.LJI() && j2 > 0) {
            Animator animatorLJFF = this.LLLFFI.LJFF();
            animatorLJFF.addListener(new ALAdapterS5S0101000_32(this, i, 0));
            animatorLJFF.setStartDelay(j);
            animatorLJFF.setDuration(j2);
            ((ArrayList) list).add(animatorLJFF);
            z = false;
        } else {
            T0();
            this.LLLFFI.LJIIJJI(i);
            this.LLLFFI.LJIIJ(true);
            z = true;
        }
        Animator animatorLJ = this.LLLFFI.LJ(z);
        animatorLJ.setStartDelay(j3);
        animatorLJ.setDuration(j4);
        animatorLJ.addListener(new ALAdapterS2S0201000_32(this, num, i, 0));
        ((ArrayList) list).add(animatorLJ);
    }
}
