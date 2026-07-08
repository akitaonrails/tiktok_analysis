package X;

import Y.ALAdapterS1S1200000_32;
import Y.ALAdapterS24S0100000_29;
import Y.ALAdapterS2S0201000_32;
import Y.ALAdapterS5S0101000_32;
import Y.ALAdapterS5S0210000_32;
import Y.ALAdapterS9S0200000_12;
import Y.ARunnableS45S0300000_12;
import Y.AUListenerS253S0100000_2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.model.message.Img;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionSticker;
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
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ActionCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleEnhancementInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleEnhancementPriceCurveInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleEnhancementTextInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductPreheatAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.TextDisplay;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ThirdLineTopBrand;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.TopBrand;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.anim.ViewFlipperController;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.PinCardRefactorSettings;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import webcast.data.oec_msg.BagIndex;
import webcast.data.oec_msg.EnhancementText;
import webcast.data.oec_msg.EnhancementTextInfo;
import webcast.data.oec_msg.LiveFlashSaleInfo;
import webcast.data.oec_msg.PlaceholderInfo;
import webcast.data.oec_msg.ProductItem;
import webcast.data.oec_msg.ShopBrandLogo;
import webcast.data.oec_msg.Title;
import webcast.data.oec_msg.UserInfo;

/* JADX INFO: renamed from: X.1853, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1853 extends AbstractC21177617uA implements InterfaceC21204917yZ {
    public ViewGroup LLJ;
    public FrameLayout LLJI;
    public C18L9 LLJIJIL;
    public C197039127h LLJILJIL;
    public C186M LLJILJILJ;
    public C18QS LLJILLL;
    public ConstraintLayout LLJJ;
    public FrameLayout LLJJI;
    public C18L9 LLJJIII;
    public FrameLayout LLJJIJI;
    public C18L9 LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public FrameLayout LLJJJ;
    public TuxIconView LLJJJIL;
    public LinearLayout LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public FrameLayout LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public FrameLayout LLJLIL;
    public View LLJLILLLLZIIL;
    public ConstraintLayout LLJLL;
    public ConstraintLayout LLJLLIL;
    public TuxTextView LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public final C185C LLL;
    public final C212262184u LLLF;
    public final C185E LLLFF;
    public final AnonymousClass1862<C426160GnO> LLLFFI;
    public final C212271185d LLLFZ;
    public final AnonymousClass1859 LLLI;
    public final C186B<ConstraintLayout> LLLII;
    public final C212253184l LLLIIII;
    public final C212252184k LLLIIIIL;
    public final C212252184k LLLIIIL;
    public final C185O LLLIIL;
    public final AnonymousClass1858 LLLIILIL;
    public final AnonymousClass1855 LLLIL;
    public final AnonymousClass1863 LLLILZ;
    public final C184L LLLILZJ;
    public final C185Q LLLILZLLLI;
    public final C998550c5l LLLIZZ;
    public final C182X LLLJ;
    public Animator LLLJIL;
    public Animator LLLJL;
    public int LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public final C01GW LLLLIILL;
    public AwS576S0100000_32 LLLLIILLL;
    public C621730Oa3 LLLLIL;
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;

    public static /* synthetic */ void getLivePinCardMinimalism$annotations() {
    }

    private final int getBenefitMaxRows() {
        return this.LLLILZLLLI.LJFF() ? 1 : 2;
    }

    private final ViewFlipperController getPromotionFlipperController() {
        return (ViewFlipperController) this.LLLLILI.getValue();
    }

    private final View getVisibleBtn() {
        return this.LLLIIL.LJFF() ? this.LLLIIL.LIZ : this.LLLF.LIZLLL();
    }

    public final boolean B0() {
        return this.LLLIIIIL.LJFF() || this.LLLIIIL.LJFF();
    }

    public final void L0() {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("recheckPromotionLayout, because promotionViewController change visible");
        int benefitMaxRows = getBenefitMaxRows();
        this.LLJZ = 0;
        if (this.LLLIIII.LJFF()) {
            this.LLJZ++;
        }
        if (this.LLJZ >= benefitMaxRows) {
            this.LLLIZZ.LJIIIZ(false);
            this.LLL.LIZJ();
            h1(true);
        } else if (this.LLLIIII.LJFF()) {
            o1(benefitMaxRows, this.LLLIZZ.LJFF(), this.LLL.LIZ());
            if (B0()) {
                int i = this.LLJZ;
                if (i < benefitMaxRows) {
                    this.LLJZ = i + 1;
                } else {
                    h1(true);
                }
            }
        } else {
            if (B0()) {
                this.LLJZ++;
            }
            o1(benefitMaxRows, this.LLLIZZ.LJFF(), this.LLL.LIZ());
        }
        O0();
    }

    @Override // X.InterfaceC21204917yZ
    public final void LJI() {
        PromotionInfo promotionInfo;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        FlashSaleAtmosphere flashSaleAtmosphere;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("hideAtmosphereAndPromotionThenShowHidePrice");
        this.LLLI.LJIILJJIL(new ArrayList());
        this.LLLIILIL.LJIIIZ(false);
        h1(false);
        PopupCardVO popupCardVO = this.LLIZLLLIL;
        if (popupCardVO != null && (promotionInfo = popupCardVO.promotionInfo) != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
            singlePriceItem.setPriceDisplayMode(1);
            AnonymousClass1862<C426160GnO> anonymousClass1862 = this.LLLFFI;
            String strLIZJ = C743702vL.LIZJ(singlePriceItem);
            String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
            String str = singlePriceItem.pricePrefix;
            String str2 = singlePriceItem.discountFormat;
            AnonymousClass1844 anonymousClass1844LIZ = AnonymousClass1843.LIZ(singlePriceItem);
            PopupCardVO popupCardVO2 = this.LLIZLLLIL;
            boolean z = (popupCardVO2 == null || (flashSaleAtmosphereInfo = popupCardVO2.flashSaleAtmosphereInfo) == null || (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) == null || flashSaleAtmosphere.status != 3) ? false : true;
            boolean zS1 = s1();
            Integer num = singlePriceItem.priceDisplayMode;
            SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
            anonymousClass1862.LJIJJLI(new C185I(strLIZJ, strLIZLLL, "", str, str2, anonymousClass1844LIZ, z, zS1, num, singlePriceHideInfo != null ? singlePriceHideInfo.displayText : null));
        }
        N0();
    }

    @Override // X.InterfaceC21197317xL
    public final void LJJIL() {
        C181I popCardViewCallback;
        int i;
        PopupCardVO popupCardVO = this.LLIZLLLIL;
        if (popupCardVO == null || !popupCardVO.isInStock()) {
            this.LLLI.LJIIL();
            return;
        }
        AnonymousClass1859 anonymousClass1859 = this.LLLI;
        anonymousClass1859.LJIIIZ = true;
        C212269185b c212269185b = new C212269185b(0);
        if (PinCardRefactorSettings.LIZ().atmosphereEnable) {
            Iterator<C187K> it2 = anonymousClass1859.LJII.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = 0;
                    break;
                }
                C187K next = it2.next();
                if (next.LJ == null) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("showAtmosphereTagAsPriority getData is null, type = ");
                    sbLIZ.append(next.LIZLLL);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2341109Fh.getClass();
                    C2341109Fh.LJII(strLIZIZ);
                    next.LJIJ(false);
                    anonymousClass1859.LJ = null;
                } else {
                    C187X c187xLJIJJLI = next.LJIJJLI(0L, null);
                    C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("showAtmosphereTagAsPriority type = ");
                    sbLIZ2.append(next.LIZLLL);
                    sbLIZ2.append(",needShow = ");
                    sbLIZ2.append(c187xLJIJJLI.LIZ);
                    sbLIZ2.append(" ,showChanged = ");
                    sbLIZ2.append(c187xLJIJJLI.LIZIZ);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c2341109Fh2.getClass();
                    C2341109Fh.LJ(strLIZIZ2);
                    if (c187xLJIJJLI.LIZ) {
                        anonymousClass1859.LJ = next.LJ;
                        if (c187xLJIJJLI.LIZIZ) {
                            anonymousClass1859.LJFF++;
                            c212269185b.LIZIZ = true;
                            c212269185b.LIZJ = anonymousClass1859.LJIIJ(true);
                        }
                        i = next.LIZLLL;
                        c212269185b.LIZ = true;
                    }
                }
            }
            SparseArray<C187K> sparseArray = anonymousClass1859.LJIIIIZZ;
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                C187K c187kValueAt = sparseArray.valueAt(i2);
                if (iKeyAt != i) {
                    c187kValueAt.LJIJ(false);
                }
            }
        }
        C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("showAtmosphere result needShow = ");
        sbLIZ3.append(c212269185b.LIZ);
        sbLIZ3.append(" , showChanged = ");
        sbLIZ3.append(c212269185b.LIZIZ);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        c2341109Fh3.getClass();
        C2341109Fh.LJ(strLIZIZ3);
        this.LLLII.LJIJ(!c212269185b.LIZ);
        if (c212269185b.LIZ) {
            Map<String, String> map = c212269185b.LIZJ;
            if (!c212269185b.LIZIZ || map == null || (popCardViewCallback = getPopCardViewCallback()) == null) {
                return;
            }
            popCardViewCallback.LJIIIIZZ(map);
        }
    }

    @Override // X.AbstractC21202217y8, X.InterfaceC21184317vF
    public final void LLLLLLIL() {
        AnchorPinCardConfig anchorPinCardConfig;
        C212262184u c212262184u = this.LLLF;
        if (c212262184u.LIZLLL && c212262184u.LIZIZ() == 2 && C621750Oa5.LIZ().enable) {
            PopupCardVO popupCardVO = this.LLIZLLLIL;
            String str = (popupCardVO == null || (anchorPinCardConfig = popupCardVO.anchorPinCardConfig) == null) ? null : anchorPinCardConfig.educationText;
            if (C123100dR.LIZ(str)) {
                C212271185d c212271185d = this.LLLFZ;
                c212271185d.getClass();
                c212271185d.LIZLLL.setText(u.LJJIFFI(str, "{{duration}}", String.valueOf(C21196617xE.LIZ().LIZIZ(null) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), false));
                C621730Oa3 c621730Oa3 = this.LLLLIL;
                if (c621730Oa3 != null) {
                    c621730Oa3.LIZLLL.sendEmptyMessage(1);
                }
            }
        }
    }

    public final void O0() {
        PopupCardVO popupCardVO;
        PromotionInfo promotionInfo;
        if (this.LLLIILIL.LJFF() || u1(this.LLIZLLLIL)) {
            this.LLLFF.LJIIJJI(1);
            return;
        }
        if (this.LLLILZLLLI.LJFF()) {
            this.LLLFF.LJIIJJI(1);
            return;
        }
        int i = this.LLLL;
        if (i == 1 || i == 2 || !((popupCardVO = this.LLIZLLLIL) == null || (promotionInfo = popupCardVO.promotionInfo) == null || promotionInfo.prelaunchPromotionLabel == null)) {
            this.LLLFF.LJIIJJI(1);
            return;
        }
        if (this.LLILZLL) {
            if (this.LLJZ >= 1) {
                this.LLLFF.LJIIJJI(1);
                return;
            } else {
                this.LLLFF.LJIIJJI(2);
                return;
            }
        }
        if (this.LLJZ >= 2) {
            this.LLLFF.LJIIJJI(1);
        } else {
            this.LLLFF.LJIIJJI(2);
        }
    }

    public final void S0() {
        C621730Oa3 c621730Oa3;
        Animator animator = this.LLLJIL;
        if (animator != null) {
            animator.cancel();
        }
        this.LLLFFI.LJIJJ();
        this.LLLILZLLLI.LJII();
        C18QS ecommerceliveProductDescFromXml = getEcommerceliveProductDescFromXml();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(ecommerceliveProductDescFromXml);
        ecommerceliveProductDescFromXml.setTranslationY(0.0f);
        this.LLLIIII.LJII();
        this.LLL.LIZJ.LJII();
        this.LLLIIIIL.LJII();
        this.LLLIIIL.LJII();
        this.LLLIILIL.LJII();
        this.LLLILZ.LJII();
        this.LLLIL.LJII();
        if (!this.LLLLIIL || (c621730Oa3 = this.LLLLIL) == null) {
            return;
        }
        c621730Oa3.LIZLLL.removeMessages(1);
        c621730Oa3.LIZLLL.removeMessages(2);
        c621730Oa3.LIZ();
    }

    public final void V0() {
        this.LLLFFI.LJII();
        this.LLLFFI.LJIJJ();
        if (this.LLLFFI.LJFF()) {
            return;
        }
        this.LLLFFI.LJIIIZ(true);
    }

    public final void b1() {
        PromotionLabel promotionLabel;
        long j;
        List list;
        PromotionInfo promotionInfo;
        PromotionInfo promotionInfo2;
        List<PromotionLabel> list2;
        PromotionLabel next;
        PopupCardVO popupCardVO = this.LLIZLLLIL;
        if (popupCardVO == null || (promotionInfo2 = popupCardVO.promotionInfo) == null || (list2 = promotionInfo2.promotionLabels) == null) {
            promotionLabel = null;
        } else {
            Iterator<PromotionLabel> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (C212258184q.LJ(next)) {
                        break;
                    }
                }
            }
            promotionLabel = next;
        }
        PopupCardVO popupCardVO2 = this.LLIZLLLIL;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popupCardVO2 != null ? popupCardVO2.flashSaleAtmosphereInfo : null;
        if (promotionLabel == null || flashSaleAtmosphereInfo == null) {
            return;
        }
        AnonymousClass1858 anonymousClass1858 = this.LLLIILIL;
        long j2 = 0;
        if (popupCardVO2 != null) {
            j = popupCardVO2.createTime;
            j2 = popupCardVO2.serverTime;
        } else {
            j = 0;
        }
        if (popupCardVO2 == null || (promotionInfo = popupCardVO2.promotionInfo) == null || (list = promotionInfo.promotionLabels) == null) {
            list = C13BV.INSTANCE;
        }
        C185V c185v = new C185V(flashSaleAtmosphereInfo, promotionLabel, j, j2, list);
        C786410Ut5.LJJJJJL((LinearLayout) anonymousClass1858.LIZ);
        anonymousClass1858.LJII = -2;
        anonymousClass1858.LJIIJJI = -1;
        anonymousClass1858.LJIIL = -1;
        anonymousClass1858.LJIIIIZZ = null;
        anonymousClass1858.LJIIIZ = null;
        anonymousClass1858.LJIILIIL = null;
        anonymousClass1858.LJI = c185v;
    }

    @Override // X.AbstractC21177617uA, X.AbstractC21202217y8
    public Map<String, String> getCommonShowParams() {
        String str;
        AnonymousClass1855 anonymousClass1855;
        C185F c185f;
        int i;
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
        C185F c185f2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LLIZ);
        String strLJIILIIL = this.LLLIIIIL.LJIILIIL();
        if (strLJIILIIL != null) {
            linkedHashMap.put("flashsale_status", strLJIILIIL);
        }
        String strLJIIL = this.LLLIIIIL.LJIIL();
        if (strLJIIL != null) {
            linkedHashMap.put("countdown_type", strLJIIL);
        }
        if (this.LLLIIIIL.LIZLLL || ((AbstractC212248184g) this.LLLIILIL.LJIJ.getValue()).LIZLLL) {
            str = "1";
            break;
        }
        if (v1(this.LLIZLLLIL) && (c185f2 = this.LLLIL.LIZLLL) != null) {
            List<PromotionLabel> list2 = c185f2.LJIIL;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<PromotionLabel> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (it2.next().type == 8) {
                        str = "1";
                        break;
                    }
                }
            }
        }
        str = CardStruct.IStatusCode.DEFAULT;
        linkedHashMap.put("is_free_shipping", str);
        linkedHashMap.put("promotion_label_level", "3");
        PopupCardVO popupCardVO = this.LLIZLLLIL;
        if (popupCardVO == null || (flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo) == null || (strLIZ = C21206417yo.LIZ(flashSaleAtmosphereInfo, popupCardVO.serverTime, popupCardVO.showAtmosphereBeginMilliSecond, popupCardVO.flashSaleStockLimit)) == null) {
            TuxTextView tuxTextView = this.LLLIILIL.LJ;
            if ((tuxTextView != null && tuxTextView.getVisibility() == 0) || (v1(this.LLIZLLLIL) && (c185f = (anonymousClass1855 = this.LLLIL).LIZLLL) != null && anonymousClass1855.LJ == 2 && ((i = c185f.LIZ) == 2 || i == 3))) {
                linkedHashMap.put("label_type", "live_flash_sale_only_left");
            }
        } else {
            linkedHashMap.put("label_type", strLIZ);
        }
        List<String> listLJIIJJI = this.LLLIIIIL.LJIIJJI();
        ArrayList arrayList = new ArrayList();
        PopupCardVO popupCardVO2 = this.LLIZLLLIL;
        if (popupCardVO2 != null && (promotionInfo2 = popupCardVO2.promotionInfo) != null && (promotionLabel = promotionInfo2.prelaunchPromotionLabel) != null && (map = promotionLabel.daInfo) != null && (obj2 = map.get("activity_name")) != null && (string2 = obj2.toString()) != null && C123100dR.LIZ(string2)) {
            arrayList.add(string2);
        }
        ArrayList arrayList2 = new ArrayList();
        PopupCardVO popupCardVO3 = this.LLIZLLLIL;
        if (popupCardVO3 != null && (promotionInfo = popupCardVO3.promotionInfo) != null && (list = promotionInfo.placementLabels) != null) {
            Iterator<PlacementLabel> it3 = list.iterator();
            while (it3.hasNext()) {
                List<PromotionLabel> list3 = it3.next().placementLabelList;
                if (list3 != null) {
                    Iterator<PromotionLabel> it4 = list3.iterator();
                    while (it4.hasNext()) {
                        Map<String, Object> map2 = it4.next().daInfo;
                        if (map2 != null && (obj = map2.get("activity_name")) != null && (string = obj.toString()) != null && C123100dR.LIZ(string)) {
                            arrayList2.add(string);
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = (ArrayList) C13LP.LJLIL(arrayList2, C13LP.LJLIL(arrayList, listLJIIJJI));
        if (arrayList3.isEmpty()) {
            strLJJLIIIJ = "";
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (C123100dR.LIZ((String) obj3)) {
                    arrayList4.add(obj3);
                }
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62);
        }
        linkedHashMap.put("activity_name", strLJJLIIIJ);
        return linkedHashMap;
    }

    public final TuxTextView getEcommerceliveAnchorEducationViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gka);
            this.LLJLLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
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
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gkn);
            this.LLJJJJJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final FrameLayout getEcommerceliveFansTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gkr);
            this.LLJJJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final FrameLayout getEcommerceliveFlashSaleEnhancementPriceLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl2);
            this.LLJI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxIconView getEcommerceliveIconAssistantFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl7);
            this.LLJJJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final FrameLayout getEcommerceliveIconCloseContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl9);
            this.LLJL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxIconView getEcommerceliveIconCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl8);
            this.LLJJLIIIJLLLLLLLZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getEcommerceliveLiveExclusiveFlashSaleLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gla);
            this.LLJJJJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final View getEcommerceliveNextActionDividerLineFromXml() {
        View view = this.LLJLILLLLZIIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.gll);
        this.LLJLILLLLZIIL = viewFindViewById;
        return viewFindViewById;
    }

    public final ConstraintLayout getEcommerceliveNextActionLowerLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gln);
            this.LLJLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ConstraintLayout getEcommerceliveNextActionUpperLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.glq);
            this.LLJLLIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final FrameLayout getEcommerceliveProductAtmosphereLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.glw);
            this.LLJJI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C18QS getEcommerceliveProductDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.glx);
            this.LLJILLL = (C18QS) callbackFindViewById;
        }
        return (C18QS) callbackFindViewById;
    }

    public final ConstraintLayout getEcommerceliveProductMainImageLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gm8);
            this.LLJJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ViewGroup getEcommerceliveProductPriceLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmd);
            this.LLJ = (ViewGroup) callbackFindViewById;
        }
        return (ViewGroup) callbackFindViewById;
    }

    public final FrameLayout getEcommercelivePromotionLayoutContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmm);
            this.LLJJIJI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C18L9 getEcommercelivePromotionLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmk);
            this.LLJJIII = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    public final FrameLayout getEcommerceliveSecondPromotionLayoutContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmq);
            this.LLJJIJIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C18L9 getEcommerceliveSecondPromotionLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmp);
            this.LLJJIJIIJIL = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    public final C186M getEcommerceliveSellerBrandFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmr);
            this.LLJILJILJ = (C186M) callbackFindViewById;
        }
        return (C186M) callbackFindViewById;
    }

    public final FrameLayout getEcommerceliveTopBrandViewContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gn6);
            this.LLJLIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final LinearLayout getEcommerceliveTopBrandViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gn5);
            this.LLJJJJLIIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    @Override // X.AbstractC21202217y8
    public List<String> getInnerItemsShowParamsProductPromotionTag() {
        Object obj;
        C212252184k c212252184k = this.LLLIIIIL;
        c212252184k.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) c212252184k.LJ).entrySet()) {
            PromotionLabel promotionLabel = (PromotionLabel) entry.getKey();
            View view = (View) entry.getValue();
            if (Intrinsics.LJFF(view.getParent(), c212252184k.LIZ) && view.getWidth() > 0) {
                Map<String, Object> map = promotionLabel.daInfo;
                if (map == null || (obj = map.get("product_promotion_tag")) == null || !C123100dR.LIZ(obj.toString())) {
                    obj = null;
                }
                arrayList.add(String.valueOf(obj));
                Map<String, Object> map2 = promotionLabel.daInfo;
                if (map2 != null) {
                    arrayList.add(map2.toString());
                }
            }
        }
        return arrayList;
    }

    public final C19395510uP getMoreActionFlipController() {
        return (C19395510uP) this.LLLLJ.getValue();
    }

    @Override // X.AbstractC21202217y8
    public Map<String, String> getPromotionLogoDaInfo() {
        return this.LLLFF.LIZLLL;
    }

    public final FrameLayout getSellingPointViewContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.up3);
            this.LLJJL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C18L9 getSellingPointViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.up2);
            this.LLJIJIL = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    public final ViewFlipperController getViewFlipperController() {
        return (ViewFlipperController) this.LLLLIILL.getValue();
    }

    @Override // X.AbstractC21202217y8
    public final boolean h0() {
        Boolean bool;
        C212262184u c212262184u = this.LLLF;
        if (c212262184u.LIZLLL || (bool = c212262184u.LIZJ().LJII) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void n0() throws Throwable {
        if (!this.LLLIIIIL.LJFF()) {
            AwS576S0100000_32 awS576S0100000_32 = this.LLLLIILLL;
            if (awS576S0100000_32 != null) {
                awS576S0100000_32.invoke();
                return;
            }
            return;
        }
        C18L9 ecommercelivePromotionLayoutFromXml = getEcommercelivePromotionLayoutFromXml();
        C786410Ut5.Q(ecommercelivePromotionLayoutFromXml, 0);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(ecommercelivePromotionLayoutFromXml);
        ecommercelivePromotionLayoutFromXml.setTranslationY(0.0f);
        C18L9 ecommerceliveSecondPromotionLayoutFromXml = getEcommerceliveSecondPromotionLayoutFromXml();
        C786410Ut5.Q(ecommerceliveSecondPromotionLayoutFromXml, 4);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(ecommerceliveSecondPromotionLayoutFromXml);
        ecommerceliveSecondPromotionLayoutFromXml.setTranslationY(0.0f);
        ViewFlipperController promotionFlipperController = getPromotionFlipperController();
        promotionFlipperController.LIZJ(C1697810uHb.LJIILJJIL(ecommercelivePromotionLayoutFromXml, ecommerceliveSecondPromotionLayoutFromXml));
        promotionFlipperController.LIZIZ = C212277185j.LIZ().internal;
        promotionFlipperController.LIZJ = C212277185j.LIZ().count;
        promotionFlipperController.LJFF = new AwS576S0100000_32(this, 819);
        promotionFlipperController.LJ = new AwS398S0200000_32(ecommerceliveSecondPromotionLayoutFromXml, this, 103);
        promotionFlipperController.LIZ();
    }

    public final boolean s1() {
        PopupCardVO popupCardVO;
        PromotionInfo promotionInfo;
        int i = this.LLLL;
        return ((i != -1 && i != 0) || (popupCardVO = this.LLIZLLLIL) == null || (promotionInfo = popupCardVO.promotionInfo) == null || promotionInfo.prelaunchPromotionLabel == null) ? false : true;
    }

    public final boolean z0() {
        PopupCardVO popupCardVO;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock;
        int i = this.LLLL;
        return ((1 != i && 2 != i) || (popupCardVO = this.LLIZLLLIL) == null || (flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo) == null || (flashSaleAtmosphereStock = flashSaleAtmosphereInfo.flashSaleAtmosphereStock) == null || flashSaleAtmosphereStock.activityStockStatus != 3) ? false : true;
    }

    public final void N0() {
        PromotionInfo promotionInfo;
        if (!s1()) {
            this.LLLILZJ.LJIIIZ(false);
            return;
        }
        h1(false);
        this.LLL.LIZJ();
        this.LLLILZLLLI.LJIIIZ(false);
        this.LLLIZZ.LJIIIZ(false);
        this.LLLILZJ.LJIIIZ(true);
        C184L c184l = this.LLLILZJ;
        PopupCardVO popupCardVO = this.LLIZLLLIL;
        c184l.LJIIJ(new C184N((popupCardVO == null || (promotionInfo = popupCardVO.promotionInfo) == null) ? null : promotionInfo.prelaunchPromotionLabel));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("onDetachedFromWindow");
        Animator animator = this.LLLJL;
        if (animator != null) {
            animator.cancel();
        }
        this.LLLJL = null;
        AnonymousClass1858 anonymousClass1858 = this.LLLIILIL;
        anonymousClass1858.LJII = -2;
        TuxTextView tuxTextView = anonymousClass1858.LJFF;
        if (tuxTextView != null) {
            tuxTextView.removeOnLayoutChangeListener(anonymousClass1858.LJIILLIIL);
        }
        anonymousClass1858.LJIIJJI = -1;
        anonymousClass1858.LJIIL = -1;
        anonymousClass1858.LJIIIIZZ = null;
        anonymousClass1858.LJIIIZ = null;
        anonymousClass1858.LJIILIIL = null;
        this.LLLIL.destroy();
        this.LLLILZ.destroy();
        C998550c5l c998550c5l = this.LLLIZZ;
        c998550c5l.LIZ.removeOnLayoutChangeListener(c998550c5l.LJ);
        getViewFlipperController().LIZIZ();
        getPromotionFlipperController().LIZIZ();
    }

    public static C1555800qaY B1(UserInfo userInfo) {
        ECImage eCImage;
        ImageModel imageModel = userInfo.avatar;
        if (imageModel != null) {
            String str = (String) C13LP.LJJJLL(imageModel.getUrls());
            int i = imageModel.width;
            int i2 = imageModel.height;
            String str2 = (String) C13LP.LJJJLL(imageModel.getUrls());
            if (str2 == null) {
                str2 = "";
            }
            eCImage = new ECImage(str, i, i2, str2, imageModel.getUri());
        } else {
            eCImage = null;
        }
        return new C1555800qaY(eCImage);
    }

    public static int W0(PopupCardVO popupCardVO) {
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        FlashSaleAtmosphere flashSaleAtmosphere;
        FlashSaleEnhancementInfo flashSaleEnhancementInfo;
        if (popupCardVO != null && (flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo) != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && (flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo) != null) {
            return flashSaleEnhancementInfo.enhancementStyle;
        }
        return 0;
    }

    public static boolean p1(PopupCardVO popupCardVO) {
        PromotionInfo promotionInfo;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        Integer num;
        String str;
        if (popupCardVO != null && (promotionInfo = popupCardVO.promotionInfo) != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null && (num = singlePriceItem.priceDisplayMode) != null && num.intValue() == 1) {
            SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
            if (singlePriceHideInfo != null) {
                str = singlePriceHideInfo.displayText;
            } else {
                str = null;
            }
            if (C703302op.LIZ(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final void setBuyButtonVisible(boolean z) {
        this.LLLF.LJFF(z);
    }

    private final void setCloseBtnVisible(boolean z) {
        int i;
        FrameLayout ecommerceliveIconCloseContainerFromXml = getEcommerceliveIconCloseContainerFromXml();
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LJZ(i, ecommerceliveIconCloseContainerFromXml);
    }

    private final void setPopCardStyle(PopupCardVO popupCardVO) {
        C0HAI c0gse;
        PromotionStyleConfig promotionStyleConfig;
        PromotionLabelConfig promotionLabelConfig;
        SeparatorConfig separatorConfig;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numValueOf;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        AnonymousClass1844 anonymousClass1844LIZ;
        C182X c182x = this.LLLJ;
        C384050F3z c384050F3z = new C384050F3z();
        c182x.getClass();
        c384050F3z.LIZJ = Float.valueOf(new C1913807ea().LIZ);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        setBackground(c384050F3z.LIZ(getContext()));
        setPaddingRelative(0, 0, 0, new C1913807ea().LIZIZ);
        this.LLLII.LJIJI(new C428500GrA() { // from class: X.0GrE
            public final int LJIILL;
            public final int LJIILLIIL;
            public final int LJIIZILJ;
            public final float LJIJ;
            public final int LJIJI;
            public final float LJIJJ;
            public final Integer LJIJJLI;
            public final int LJIL;
            public final float LJJ;
            public final EnumC429150GsD LJJI;
            public final int LJJIFFI;
            public final int LJJII;
            public final int LJJIII;
            public final int LJJIIJ;

            {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                float fLIZIZ = C418440Gaw.LIZIZ(8);
                Integer numValueOf2 = Integer.valueOf(R.attr.wm);
                float fLIZIZ2 = C418440Gaw.LIZIZ(8);
                EnumC429150GsD enumC429150GsD = EnumC429150GsD.NORMAL;
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
                this.LJIILL = iLIZIZ;
                this.LJIILLIIL = iLIZIZ2;
                this.LJIIZILJ = iLIZIZ3;
                this.LJIJ = fLIZIZ;
                this.LJIJI = R.attr.uk;
                this.LJIJJ = 0.0f;
                this.LJIJJLI = numValueOf2;
                this.LJIL = R.attr.e3;
                this.LJJ = fLIZIZ2;
                this.LJJI = enumC429150GsD;
                this.LJJIFFI = iLIZIZ4;
                this.LJJII = iLIZIZ5;
                this.LJJIII = iLIZIZ6;
                this.LJJIIJ = R.attr.e5;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final Integer LIZIZ() {
                return Integer.valueOf(this.LJIIZILJ);
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final Integer LJIIJ() {
                return Integer.valueOf(this.LJJIFFI);
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final Integer LJIIL() {
                return Integer.valueOf(this.LJJII);
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final Integer getMarginTop() {
                return Integer.valueOf(this.LJIILLIIL);
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final float LIZ() {
                return this.LJIJ;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final int LIZJ() {
                return this.LJJIII;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final float LIZLLL() {
                return this.LJJ;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final int LJ() {
                return this.LJJIIJ;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final float LJFF() {
                return this.LJIJJ;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final int LJI() {
                return this.LJIL;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final int LJIIIIZZ() {
                return this.LJIILL;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final EnumC429150GsD LJIIIZ() {
                return this.LJJI;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final int LJIIJJI() {
                return this.LJIJI;
            }

            @Override // X.C428500GrA, X.InterfaceC428490Gr9
            public final Integer getBgColor() {
                return this.LJIJJLI;
            }
        });
        C185E c185e = this.LLLFF;
        C0GS4 c0gs4 = new C0GS4();
        c185e.LJ = c0gs4;
        C0H9H.LIZLLL(c0gs4.LIZIZ, c185e.LIZ);
        C212262184u c212262184u = this.LLLF;
        C212270185c c212270185c = new C212270185c() { // from class: X.185Y
            public final float LIZ = C418440Gaw.LIZIZ(5);

            @Override // X.InterfaceC212288185u
            public final float LIZ() {
                return this.LIZ;
            }
        };
        if (c212262184u.LIZLLL) {
            c212262184u.LIZ().LJIILIIL(c212270185c);
        } else {
            c212262184u.LIZJ().LJIILIIL(c212270185c);
        }
        if (C0A0F.LIZ()) {
            c0gse = new C212285185r();
        } else {
            c0gse = new C0GSE(false, 0, 0, 2047);
        }
        C185C c185c = this.LLL;
        C19340910lb c19340910lb = new C19340910lb();
        c185c.LIZLLL = c0gse;
        c185c.LJ = c19340910lb;
        AnonymousClass1862<C426160GnO> anonymousClass1862 = this.LLLFFI;
        C19344910mF c19344910mF = new C19344910mF(null, false, 31);
        PromotionInfo promotionInfo = popupCardVO.promotionInfo;
        if (promotionInfo != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null && (anonymousClass1844LIZ = AnonymousClass1843.LIZ(singlePriceItem)) != null && anonymousClass1844LIZ.LIZIZ()) {
            c19344910mF = new C19344910mF() { // from class: X.10mH
                public final int LJJIJIL;
                public final int LJJIJL;

                {
                    new C19344510mB() { // from class: X.10mG
                        {
                            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        }
                    };
                    this.LJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                    this.LJJIJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }

                @Override // X.C19344810mE, X.C19345310mJ, X.C186V
                public final int LJIIJ() {
                    return this.LJJIJIL;
                }

                @Override // X.C19344410mA, X.C19344810mE, X.C19345310mJ, X.C186V
                public final int LJIILJJIL() {
                    return this.LJJIJL;
                }
            };
        }
        anonymousClass1862.LJIILIIL(c19344910mF);
        anonymousClass1862.LJI.LJ(c19344910mF);
        this.LLLIIIIL.LJFF = C182X.LIZ();
        this.LLLIIIL.LJFF = C182X.LIZ();
        this.LLLI.LJI = new C19343610m2() { // from class: X.10m3
            public final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));

            @Override // X.C19343610m2, X.InterfaceC212331187l
            public final int getMarginTop() {
                return this.LIZIZ;
            }
        };
        ViewGroup.LayoutParams layoutParams = this.LLLII.LIZ.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && (numValueOf = Integer.valueOf(marginLayoutParams.width + marginLayoutParams.getMarginStart())) != null) {
            this.LLLI.LJIIJ = numValueOf.intValue();
        }
        PromotionInfo promotionInfo2 = popupCardVO.promotionInfo;
        if (promotionInfo2 != null && (promotionStyleConfig = promotionInfo2.styleConfig) != null && (promotionLabelConfig = promotionStyleConfig.promotionLabelConfig) != null && (separatorConfig = promotionLabelConfig.separator) != null) {
            C18L9 c18l9 = this.LLLIL.LJI;
            if (c18l9 != null) {
                c18l9.setDividerSymbol(separatorConfig);
            }
            C18L9 ecommercelivePromotionLayoutFromXml = getEcommercelivePromotionLayoutFromXml();
            if (ecommercelivePromotionLayoutFromXml != null) {
                ecommercelivePromotionLayoutFromXml.setDividerSymbol(separatorConfig);
            }
            C18L9 ecommercelivePromotionLayoutFromXml2 = getEcommercelivePromotionLayoutFromXml();
            if (ecommercelivePromotionLayoutFromXml2 != null) {
                ecommercelivePromotionLayoutFromXml2.setChildHorizontalMargin(0);
            }
            C18L9 ecommerceliveSecondPromotionLayoutFromXml = getEcommerceliveSecondPromotionLayoutFromXml();
            if (ecommerceliveSecondPromotionLayoutFromXml != null) {
                ecommerceliveSecondPromotionLayoutFromXml.setDividerSymbol(separatorConfig);
            }
            C18L9 ecommerceliveSecondPromotionLayoutFromXml2 = getEcommerceliveSecondPromotionLayoutFromXml();
            if (ecommerceliveSecondPromotionLayoutFromXml2 != null) {
                ecommerceliveSecondPromotionLayoutFromXml2.setChildHorizontalMargin(0);
            }
            ((C18L9) this.LLLIILIL.LJIIZILJ.getValue()).setDividerSymbol(separatorConfig);
            ((C18L9) this.LLLIILIL.LJIIZILJ.getValue()).setChildHorizontalMargin(0);
        }
    }

    private final void setProductInfoAtStartOfCloseBtn(View view) {
        C19ME c19me = (C19ME) view.getLayoutParams();
        if (c19me.endToStart != -1 || c19me.endToEnd != 0) {
            c19me.endToStart = -1;
            c19me.endToEnd = 0;
            c19me.setMarginEnd(getContext().getResources().getDimensionPixelOffset(R.dimen.ul));
            C786410Ut5.W5(view, c19me);
        }
    }

    public static boolean u1(PopupCardVO popupCardVO) {
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        FlashSaleAtmosphere flashSaleAtmosphere;
        FlashSaleEnhancementInfo flashSaleEnhancementInfo;
        if (popupCardVO == null || (flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo) == null || (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) == null || (flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo) == null) {
            return false;
        }
        int i = flashSaleEnhancementInfo.enhancementStyle;
        if (p1(popupCardVO) && i == 2) {
            return false;
        }
        if (i == 2) {
            if (flashSaleAtmosphere.status != 3) {
                return false;
            }
        } else {
            if (i != 1) {
                return false;
            }
            C212287185t c212287185t = InterfaceC212283185p.LJIIZILJ;
            int i2 = flashSaleAtmosphere.status;
            c212287185t.getClass();
            if (2 != i2 && 3 != i2) {
                return false;
            }
        }
        return true;
    }

    public static boolean v1(PopupCardVO popupCardVO) {
        if (u1(popupCardVO) && W0(popupCardVO) == 1) {
            return true;
        }
        return false;
    }

    public static final void z1(AnonymousClass1853 anonymousClass1853) {
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        List<PromotionLabel> list;
        PromotionInfo promotionInfo;
        PromotionStyleConfig promotionStyleConfig;
        PromotionLabelConfig promotionLabelConfig;
        SeparatorConfig separatorConfig;
        PopupCardVO popupCardVO = anonymousClass1853.LLIZLLLIL;
        if (popupCardVO == null || (flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo) == null) {
            return;
        }
        PromotionInfo promotionInfo2 = popupCardVO.promotionInfo;
        if (promotionInfo2 != null) {
            list = promotionInfo2.promotionLabels;
        } else {
            list = null;
        }
        C185F c185fLIZJ = C185B.LIZJ(flashSaleAtmosphereInfo, list, popupCardVO.serverTime);
        if (c185fLIZJ == null) {
            return;
        }
        AnonymousClass1855 anonymousClass1855 = anonymousClass1853.LLLIL;
        anonymousClass1855.LIZLLL = c185fLIZJ;
        anonymousClass1855.LJ = -2;
        anonymousClass1855.LJIJJLI();
        PopupCardVO popupCardVO2 = anonymousClass1853.LLIZLLLIL;
        if (popupCardVO2 != null && (promotionInfo = popupCardVO2.promotionInfo) != null && (promotionStyleConfig = promotionInfo.styleConfig) != null && (promotionLabelConfig = promotionStyleConfig.promotionLabelConfig) != null && (separatorConfig = promotionLabelConfig.separator) != null) {
            anonymousClass1853.LLLIL.LJIL(separatorConfig);
        }
    }

    public final void C1(boolean z) {
        int i;
        FrameLayout sellingPointViewContainerFromXml = getSellingPointViewContainerFromXml();
        ViewGroup.LayoutParams layoutParams = sellingPointViewContainerFromXml.getLayoutParams();
        if (layoutParams != null) {
            C19ME c19me = (C19ME) layoutParams;
            if (z) {
                i = R.id.gla;
            } else {
                i = R.id.gn6;
            }
            c19me.topToBottom = i;
            C786410Ut5.W5(sellingPointViewContainerFromXml, c19me);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void D1(boolean z) {
        LinearLayout ecommerceliveTopBrandViewFromXml = getEcommerceliveTopBrandViewFromXml();
        C786410Ut5.LJZL(0, ecommerceliveTopBrandViewFromXml);
        C786410Ut5.hd(ecommerceliveTopBrandViewFromXml, 0.0f);
        if (z) {
            C18L9 sellingPointViewFromXml = getSellingPointViewFromXml();
            C786410Ut5.Q(sellingPointViewFromXml, 4);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(sellingPointViewFromXml);
            sellingPointViewFromXml.setTranslationY(0.0f);
            FrameLayout sellingPointViewContainerFromXml = getSellingPointViewContainerFromXml();
            ViewGroup.LayoutParams layoutParams = sellingPointViewContainerFromXml.getLayoutParams();
            if (layoutParams != null) {
                C19ME c19me = (C19ME) layoutParams;
                c19me.topToBottom = R.id.gml;
                C786410Ut5.W5(sellingPointViewContainerFromXml, c19me);
                this.LLLLIILLL = new AwS576S0100000_32(this, 822);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C18L9 sellingPointViewFromXml2 = getSellingPointViewFromXml();
        C786410Ut5.Q(sellingPointViewFromXml2, 0);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(sellingPointViewFromXml2);
        sellingPointViewFromXml2.setTranslationY(0.0f);
        FrameLayout sellingPointViewContainerFromXml2 = getSellingPointViewContainerFromXml();
        ViewGroup.LayoutParams layoutParams2 = sellingPointViewContainerFromXml2.getLayoutParams();
        if (layoutParams2 != null) {
            C19ME c19me2 = (C19ME) layoutParams2;
            c19me2.topToBottom = R.id.gn6;
            C786410Ut5.W5(sellingPointViewContainerFromXml2, c19me2);
            getViewFlipperController().LIZIZ();
            this.LLLLIILLL = null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void F0(PopupCardVO popupCardVO) {
        ProductPreheatAtmosphereInfo productPreheatAtmosphereInfo;
        List<String> list;
        Animator animator = this.LLLJL;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = null;
        this.LLLJL = null;
        if (popupCardVO.flashSaleAtmosphereInfo == null && !Intrinsics.LJFF(popupCardVO.advancedFlashSale, Boolean.TRUE) && (productPreheatAtmosphereInfo = popupCardVO.preheatAtmosphereInfo) != null && (list = productPreheatAtmosphereInfo.animationPriceList) != null) {
            Animator animatorLJIJ = this.LLLFFI.LJIJ(list);
            if (animatorLJIJ != null) {
                animatorLJIJ.setDuration(500L);
                animatorLJIJ.start();
                animator2 = animatorLJIJ;
            }
            this.LLLJL = animator2;
        }
    }

    public final void I0(List<Animator> list) {
        if (this.LLLILZLLLI.LJFF() && getEcommerceliveProductDescFromXml().getTranslationY() == 0.0f) {
            if (getEcommerceliveSellerBrandFromXml().getY() > 0.0f && getEcommerceliveProductDescFromXml().getY() > 0.0f) {
                C18QS ecommerceliveProductDescFromXml = getEcommerceliveProductDescFromXml();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ecommerceliveProductDescFromXml, (Property<C18QS, Float>) View.TRANSLATION_Y, ecommerceliveProductDescFromXml.getTranslationY(), getEcommerceliveSellerBrandFromXml().getY() - getEcommerceliveProductDescFromXml().getY());
                objectAnimatorOfFloat.setDuration(150L);
                ((ArrayList) list).add(objectAnimatorOfFloat);
                setProductInfoAtStartOfCloseBtn(this.LLLFF.LIZ);
            }
            Animator animatorLJ = this.LLLILZLLLI.LJ();
            animatorLJ.setDuration(150L);
            ((ArrayList) list).add(animatorLJ);
        }
        if (this.LLLIZZ.LJFF() && getEcommerceliveTopBrandViewFromXml().getAlpha() != 0.0f) {
            Animator animatorLIZ = C621740Oa4.LIZ(1.0f, 0.0f, getEcommerceliveTopBrandViewFromXml());
            animatorLIZ.setDuration(150L);
            ((ArrayList) list).add(animatorLIZ);
        }
        getViewFlipperController().LJI.removeMessages(101);
    }

    @Override // X.InterfaceC21204917yZ
    public final void LIZIZ(int i) {
        boolean z;
        C212262184u c212262184u = this.LLLF;
        if (!h0() && !z0()) {
            z = false;
        } else {
            z = true;
        }
        c212262184u.LJ(new C212284185q(z, Integer.valueOf(i)), null);
    }

    @Override // X.InterfaceC21184117vD
    public final void LJJLIIIJILLIZJL(boolean z) {
        C185J c185jLIZJ;
        if (!isAttachedToWindow()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZJ("not shown, don't refresh stock");
            return;
        }
        C212262184u c212262184u = this.LLLF;
        if (c212262184u.LIZLLL) {
            c185jLIZJ = c212262184u.LIZ();
        } else {
            c185jLIZJ = c212262184u.LIZJ();
        }
        if (c185jLIZJ.LJFF() && this.LLIZLLLIL != null) {
            c1(this, z, z0(), null, 12);
        }
    }

    @Override // X.InterfaceC21147917pN
    public final Map<String, String> LLJJLIIIJLLLLLLLZ(int i) {
        return getControllerShowParametersManager().LIZIZ(i);
    }

    @Override // X.AbstractC21202217y8, X.InterfaceC21184317vF
    public final void LLLLLLJ(int i) {
        C621730Oa3 c621730Oa3;
        this.LLLF.LJ(null, Integer.valueOf(i));
        if (i == 1 && this.LLLLIIL && (c621730Oa3 = this.LLLLIL) != null) {
            c621730Oa3.LIZLLL.removeMessages(1);
            c621730Oa3.LIZLLL.removeMessages(2);
            c621730Oa3.LIZ();
        }
    }

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
    @Override // X.AbstractC21177617uA, X.InterfaceC21184117vD
    public final void b0(ProductItem productItem) {
        FlashSaleAtmosphereStock flashSaleAtmosphereStock;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        FlashSaleAtmosphere flashSaleAtmosphere;
        FlashSaleEnhancementInfo flashSaleEnhancementInfo;
        Map<Long, String> mapLJ;
        EnhancementText enhancementText;
        Integer numValueOf;
        Double dValueOf;
        boolean z;
        int iIntValue;
        List<C1555800qaY> listLL;
        float fFloatValue;
        String string;
        final FrameLayout frameLayout;
        final FrameLayout frameLayout2;
        final View view;
        int iLIZIZ;
        List<C1555800qaY> list;
        List<C1555800qaY> list2;
        List<EnhancementText> list3;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2;
        FlashSaleAtmosphere flashSaleAtmosphere2;
        FlashSaleEnhancementInfo flashSaleEnhancementInfo2;
        Map<Long, String> mapLJ2;
        EnhancementText enhancementText2;
        Integer numValueOf2;
        boolean z2;
        int iIntValue2;
        List<C1555800qaY> listLL2;
        float fFloatValue2;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock2;
        List<EnhancementText> list4;
        List<PlacementLabel> list5;
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
        PopupCardVO popupCardVO = this.LLIZLLLIL;
        boolean z3 = false;
        if (popupCardVO != null && productItem.productId == popupCardVO.productId) {
            BagIndex bagIndex = productItem.bagIndex;
            if (bagIndex != null) {
                this.LLLII.LJIIZILJ(Integer.valueOf(popupCardVO.platform), popupCardVO.source, bagIndex.value, true);
            }
            Title title = productItem.title;
            FlashSaleAtmosphereStock flashSaleAtmosphereStock3 = null;
            Double dValueOf2 = null;
            flashSaleAtmosphereStock3 = null;
            if (title != null) {
                C185E c185e = this.LLLFF;
                String str = title.text;
                PopupCardVO popupCardVO2 = this.LLIZLLLIL;
                if (popupCardVO2 != null) {
                    list5 = popupCardVO2.placementLabels;
                } else {
                    list5 = null;
                }
                c185e.LJIIJ(new C212276185i(str, list5));
            }
            ImageModel imageModel = productItem.cover;
            String str2 = "";
            if (imageModel != null) {
                String str3 = (String) C13LP.LJJJLL(imageModel.getUrls());
                if (str3 == null) {
                    str3 = "";
                }
                if (C703302op.LIZ(str3) && C703302op.LIZ(str3)) {
                    int iLIZ = C21195917x7.LIZ(this.LLJZIJLIL);
                    this.LLLII.LJIILL(C1743690vTb.LJI(str3, iLIZ, iLIZ, EnumC1769850w9n.LIVE_POP_CARD), null);
                    requestLayout();
                }
            }
            ShopBrandLogo shopBrandLogo = productItem.shopBrandLogo;
            if (shopBrandLogo != null) {
                this.LLLILZLLLI.LJIILJJIL(C0132001y.LIZ(shopBrandLogo));
                if (this.LLLILZLLLI.LJFF()) {
                    e1(this.LLLFF.LIZ, this.LLLF.LIZLLL());
                } else {
                    setProductInfoAtStartOfCloseBtn(this.LLLFF.LIZ);
                }
            }
            LiveFlashSaleInfo liveFlashSaleInfo = productItem.liveFlashSaleInfo;
            if (liveFlashSaleInfo != null) {
                if (u1(popupCardVO)) {
                    if (W0(popupCardVO) == 2) {
                        PopupCardVO popupCardVO3 = this.LLIZLLLIL;
                        if (popupCardVO3 != null && (flashSaleAtmosphereInfo2 = popupCardVO3.flashSaleAtmosphereInfo) != null && (flashSaleAtmosphere2 = flashSaleAtmosphereInfo2.flashSaleAtmosphere) != null && (flashSaleEnhancementInfo2 = flashSaleAtmosphere2.enhancementInfo) != null) {
                            C212287185t c212287185t = InterfaceC212283185p.LJIIZILJ;
                            int i = flashSaleAtmosphere2.status;
                            c212287185t.getClass();
                            if ((2 == i || 3 == i) && flashSaleEnhancementInfo2.enhancementStyle == 2) {
                                FlashSaleEnhancementTextInfo flashSaleEnhancementTextInfo = flashSaleEnhancementInfo2.enhancementTextInfo;
                                if (flashSaleEnhancementTextInfo == null || (mapLJ2 = flashSaleEnhancementTextInfo.allTexts) == null) {
                                    mapLJ2 = C2097608Jq.LJ();
                                }
                                webcast.data.oec_msg.FlashSaleEnhancementInfo flashSaleEnhancementInfo3 = liveFlashSaleInfo.enhancementInfo;
                                if (flashSaleEnhancementInfo3 != null) {
                                    EnhancementTextInfo enhancementTextInfo = flashSaleEnhancementInfo3.enhancementTextInfo;
                                    if (enhancementTextInfo == null || (list4 = enhancementTextInfo.enhancementTexts) == null || (enhancementText2 = (EnhancementText) C13LP.LJJJLL(list4)) == null) {
                                        enhancementText2 = new EnhancementText();
                                        enhancementText2.type = 0;
                                    }
                                    List<UserInfo> list6 = flashSaleEnhancementInfo3.buyerInfos;
                                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list6, 10));
                                    Iterator<UserInfo> it2 = list6.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(B1(it2.next()));
                                    }
                                    if (!(!arrayList.isEmpty())) {
                                        arrayList = null;
                                    }
                                    String strT0 = T0(mapLJ2, enhancementText2);
                                    FlashSaleAtmosphereInfo flashSaleAtmosphereInfo3 = popupCardVO3.flashSaleAtmosphereInfo;
                                    if (flashSaleAtmosphereInfo3 != null && (flashSaleAtmosphereStock2 = flashSaleAtmosphereInfo3.flashSaleAtmosphereStock) != null) {
                                        numValueOf2 = Integer.valueOf(flashSaleAtmosphereStock2.totalActivityStock);
                                    } else {
                                        numValueOf2 = null;
                                    }
                                    int i2 = liveFlashSaleInfo.availableStock;
                                    FlashSaleEnhancementPriceCurveInfo flashSaleEnhancementPriceCurveInfo = flashSaleEnhancementInfo2.enhancementPriceCurveInfo;
                                    if (flashSaleEnhancementPriceCurveInfo != null) {
                                        dValueOf2 = Double.valueOf(flashSaleEnhancementPriceCurveInfo.changeRate);
                                    }
                                    Float fJ0 = j0(numValueOf2, i2, dValueOf2);
                                    AnonymousClass1863 anonymousClass1863 = this.LLLILZ;
                                    Integer numValueOf3 = Integer.valueOf(enhancementText2.type);
                                    C185K c185k = anonymousClass1863.LIZLLL;
                                    if (c185k != null) {
                                        if (strT0 != null && !Intrinsics.LJFF(strT0, c185k.LIZIZ.LIZIZ) && arrayList != null && !arrayList.isEmpty()) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        C185H c185h = c185k.LIZIZ;
                                        if (numValueOf3 != null) {
                                            iIntValue2 = numValueOf3.intValue();
                                        } else {
                                            iIntValue2 = c185h.LIZ;
                                        }
                                        if (strT0 == null) {
                                            strT0 = c185k.LIZIZ.LIZIZ;
                                        }
                                        if (z2) {
                                            List<C1555800qaY> list7 = c185k.LIZIZ.LIZJ;
                                            if (arrayList == null || arrayList.isEmpty()) {
                                                listLL2 = C13LP.LL(list7, 2);
                                            } else {
                                                List listLL3 = C13LP.LL(list7, 2);
                                                if (listLL3.isEmpty()) {
                                                    listLL2 = C13LP.LL(arrayList, 2);
                                                } else {
                                                    Object objLJJJJZI = C13LP.LJJJJZI(arrayList);
                                                    C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                                                    c13dvLIZIZ.add(objLJJJJZI);
                                                    c13dvLIZIZ.addAll(C13LP.LJJJJJ(1, listLL3));
                                                    listLL2 = C13LP.LL(C1697820uHc.LIZ(c13dvLIZIZ), 2);
                                                }
                                            }
                                        } else {
                                            listLL2 = c185k.LIZIZ.LIZJ;
                                        }
                                        if (fJ0 != null) {
                                            fFloatValue2 = fJ0.floatValue();
                                        } else {
                                            fFloatValue2 = c185k.LIZIZ.LJ;
                                        }
                                        C185K c185kLJJII = AnonymousClass1863.LJJII(C185K.LIZ(c185k, C185H.LIZ(c185h, iIntValue2, strT0, listLL2, fFloatValue2, 8)));
                                        anonymousClass1863.LIZLLL = c185kLJJII;
                                        if (((ViewGroup) anonymousClass1863.LIZ).getChildCount() > 0) {
                                            if (anonymousClass1863.LJ != null) {
                                                z3 = true;
                                            }
                                            anonymousClass1863.LJJIII(c185kLJJII, z3, z2, z2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    PopupCardVO popupCardVO4 = this.LLIZLLLIL;
                    if (popupCardVO4 != null && (flashSaleAtmosphereInfo = popupCardVO4.flashSaleAtmosphereInfo) != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && (flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo) != null) {
                        C212287185t c212287185t2 = InterfaceC212283185p.LJIIZILJ;
                        int i3 = flashSaleAtmosphere.status;
                        c212287185t2.getClass();
                        if ((2 == i3 || 3 == i3) && flashSaleEnhancementInfo.enhancementStyle == 1) {
                            FlashSaleEnhancementTextInfo flashSaleEnhancementTextInfo2 = flashSaleEnhancementInfo.enhancementTextInfo;
                            if (flashSaleEnhancementTextInfo2 == null || (mapLJ = flashSaleEnhancementTextInfo2.allTexts) == null) {
                                mapLJ = C2097608Jq.LJ();
                            }
                            webcast.data.oec_msg.FlashSaleEnhancementInfo flashSaleEnhancementInfo4 = liveFlashSaleInfo.enhancementInfo;
                            if (flashSaleEnhancementInfo4 != null) {
                                EnhancementTextInfo enhancementTextInfo2 = flashSaleEnhancementInfo4.enhancementTextInfo;
                                if (enhancementTextInfo2 == null || (list3 = enhancementTextInfo2.enhancementTexts) == null || (enhancementText = (EnhancementText) C13LP.LJJJLL(list3)) == null) {
                                    enhancementText = new EnhancementText();
                                    enhancementText.type = 0;
                                }
                                List<UserInfo> list8 = flashSaleEnhancementInfo4.buyerInfos;
                                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list8, 10));
                                Iterator<UserInfo> it3 = list8.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(B1(it3.next()));
                                }
                                if (!(!arrayList2.isEmpty())) {
                                    arrayList2 = null;
                                }
                                String strT02 = T0(mapLJ, enhancementText);
                                FlashSaleAtmosphereStock flashSaleAtmosphereStock4 = flashSaleAtmosphereInfo.flashSaleAtmosphereStock;
                                if (flashSaleAtmosphereStock4 != null) {
                                    numValueOf = Integer.valueOf(flashSaleAtmosphereStock4.totalActivityStock);
                                } else {
                                    numValueOf = null;
                                }
                                int i4 = liveFlashSaleInfo.availableStock;
                                FlashSaleEnhancementPriceCurveInfo flashSaleEnhancementPriceCurveInfo2 = flashSaleEnhancementInfo.enhancementPriceCurveInfo;
                                if (flashSaleEnhancementPriceCurveInfo2 != null) {
                                    dValueOf = Double.valueOf(flashSaleEnhancementPriceCurveInfo2.changeRate);
                                } else {
                                    dValueOf = null;
                                }
                                Float fJ02 = j0(numValueOf, i4, dValueOf);
                                final AnonymousClass1855 anonymousClass1855 = this.LLLIL;
                                C00YG c00yg = new C00YG(Integer.valueOf(enhancementText.type), strT02, arrayList2, fJ02, 16);
                                final C185F c185f = anonymousClass1855.LIZLLL;
                                if (c185f != null) {
                                    String str4 = c00yg.LIZIZ;
                                    if (str4 != null && !Intrinsics.LJFF(str4, c185f.LIZIZ) && (list2 = c00yg.LIZJ) != null && !list2.isEmpty()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    Integer num = c00yg.LIZ;
                                    if (num != null) {
                                        iIntValue = num.intValue();
                                    } else {
                                        iIntValue = c185f.LIZ;
                                    }
                                    String str5 = c00yg.LIZIZ;
                                    if (str5 == null) {
                                        str5 = c185f.LIZIZ;
                                    }
                                    if (!z || (list = c00yg.LIZJ) == null || list.isEmpty()) {
                                        listLL = c185f.LJ;
                                    } else {
                                        List listLL4 = C13LP.LL(c185f.LJ, 2);
                                        if (listLL4.isEmpty()) {
                                            listLL = C13LP.LL(list, 2);
                                        } else {
                                            Object objLJJJJZI2 = C13LP.LJJJJZI(list);
                                            C13DV c13dvLIZIZ2 = C1697820uHc.LIZIZ();
                                            c13dvLIZIZ2.add(objLJJJJZI2);
                                            c13dvLIZIZ2.addAll(C13LP.LJJJJJ(1, listLL4));
                                            listLL = C13LP.LL(C1697820uHc.LIZ(c13dvLIZIZ2), 2);
                                        }
                                    }
                                    Float f = c00yg.LIZLLL;
                                    if (f != null) {
                                        fFloatValue = f.floatValue();
                                    } else {
                                        fFloatValue = c185f.LJII;
                                    }
                                    final C185F c185fLIZ = C185F.LIZ(c185f, iIntValue, str5, listLL, c185f.LJFF, fFloatValue, 32588);
                                    anonymousClass1855.LIZLLL = c185fLIZ;
                                    int i5 = anonymousClass1855.LJ;
                                    if (i5 != 1) {
                                        if (i5 != 2) {
                                            anonymousClass1855.LJIJJ();
                                            return;
                                        }
                                        int i6 = c185f.LIZ;
                                        int i7 = c185fLIZ.LIZ;
                                        if (i6 == i7) {
                                            if (i7 != 1) {
                                                if (i7 != 2 && i7 != 3) {
                                                    if (anonymousClass1855.LJIIJ(c185fLIZ)) {
                                                        return;
                                                    }
                                                } else {
                                                    final TuxTextView tuxTextView = anonymousClass1855.LJIIZILJ;
                                                    if (tuxTextView != null && (frameLayout2 = anonymousClass1855.LJIILL) != null && (view = anonymousClass1855.LJIILLIIL) != null) {
                                                        C12ES.LJIILL(0, frameLayout2);
                                                        if (c185f.LJII == c185fLIZ.LJII) {
                                                            tuxTextView.setText(c185fLIZ.LIZIZ);
                                                            Integer numValueOf4 = Integer.valueOf(frameLayout2.getWidth());
                                                            if (numValueOf4.intValue() > 0) {
                                                                iLIZIZ = numValueOf4.intValue();
                                                            } else {
                                                                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90));
                                                            }
                                                            AnonymousClass1855.LJJIFFI(c185fLIZ.LJII, iLIZIZ, view);
                                                            return;
                                                        }
                                                        HandlerHook.viewPost(frameLayout2, new Runnable() { // from class: X.0TLC
                                                            public final void LIZ() {
                                                                Integer numValueOf5 = Integer.valueOf(frameLayout2.getWidth());
                                                                int iIntValue3 = numValueOf5.intValue() > 0 ? numValueOf5.intValue() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90));
                                                                AnonymousClass1855 anonymousClass18552 = anonymousClass1855;
                                                                View view2 = view;
                                                                float f2 = c185f.LJII;
                                                                C185F c185f2 = c185fLIZ;
                                                                float f3 = c185f2.LJII;
                                                                AwS413S0200000_12 awS413S0200000_12 = new AwS413S0200000_12(tuxTextView, c185f2, 33);
                                                                anonymousClass18552.getClass();
                                                                float f4 = iIntValue3;
                                                                int iLJ = C13LZ.LJ((int) (f2 * f4), 0, iIntValue3);
                                                                int iLJ2 = C13LZ.LJ((int) (f4 * f3), 0, iIntValue3);
                                                                if (iLJ == iLJ2) {
                                                                    AnonymousClass1855.LJJIFFI(f3, iIntValue3, view2);
                                                                    awS413S0200000_12.invoke();
                                                                    return;
                                                                }
                                                                Animator animator = anonymousClass18552.LJIJI;
                                                                if (animator != null) {
                                                                    animator.cancel();
                                                                }
                                                                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iLJ, iLJ2);
                                                                valueAnimatorOfInt.setDuration(220L);
                                                                valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(view2, 12));
                                                                valueAnimatorOfInt.addListener(new ALAdapterS9S0200000_12(anonymousClass18552, awS413S0200000_12, 1));
                                                                valueAnimatorOfInt.start();
                                                                anonymousClass18552.LJIJI = valueAnimatorOfInt;
                                                            }

                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                boolean zLIZ;
                                                                C1C7U.LIZ("SeaFlashSaleEnhancementTagController@6718.applyStockSceneUpdate$2");
                                                                try {
                                                                    LIZ();
                                                                } finally {
                                                                    if (!zLIZ) {
                                                                    }
                                                                }
                                                                C1C7U.LIZIZ("SeaFlashSaleEnhancementTagController@6718.applyStockSceneUpdate$2");
                                                            }
                                                        });
                                                        return;
                                                    }
                                                }
                                            } else {
                                                if (!z && Intrinsics.LJFF(c185f.LIZIZ, c185fLIZ.LIZIZ) && Intrinsics.LJFF(c185f.LJ, c185fLIZ.LJ)) {
                                                    return;
                                                }
                                                TuxTextView tuxTextView2 = anonymousClass1855.LJIILJJIL;
                                                if (tuxTextView2 != null && (frameLayout = anonymousClass1855.LJIILIIL) != null) {
                                                    if (z) {
                                                        List<C1555800qaY> list9 = c185fLIZ.LJ;
                                                        final AwS433S0200000_32 awS433S0200000_32 = new AwS433S0200000_32(tuxTextView2, c185fLIZ, 43);
                                                        final List<C1555800qaY> listLL5 = C13LP.LL(list9, 2);
                                                        if (listLL5.size() < 2) {
                                                            C786410Ut5.LJJJJIZL(frameLayout);
                                                            awS433S0200000_32.invoke();
                                                            return;
                                                        }
                                                        if (frameLayout.getChildCount() < 2) {
                                                            anonymousClass1855.LJIIL(frameLayout, listLL5);
                                                            awS433S0200000_32.invoke();
                                                            return;
                                                        }
                                                        Animator animator = anonymousClass1855.LJIJ;
                                                        if (animator != null) {
                                                            animator.cancel();
                                                        }
                                                        final View viewFindViewWithTag = frameLayout.findViewWithTag("sea_flash_sale_tag_avatar_first");
                                                        if (viewFindViewWithTag == null) {
                                                            anonymousClass1855.LJIIL(frameLayout, listLL5);
                                                            awS433S0200000_32.invoke();
                                                            return;
                                                        }
                                                        final View viewFindViewWithTag2 = frameLayout.findViewWithTag("sea_flash_sale_tag_avatar_second");
                                                        if (viewFindViewWithTag2 == null) {
                                                            anonymousClass1855.LJIIL(frameLayout, listLL5);
                                                            awS433S0200000_32.invoke();
                                                            return;
                                                        }
                                                        float fLJIIJJI = AnonymousClass1855.LJIIJJI(1);
                                                        final FrameLayout frameLayoutLJIILL = AnonymousClass1855.LJIILL(frameLayout.getContext(), (C1555800qaY) C13LP.LJJJJZI(listLL5));
                                                        frameLayoutLJIILL.setTag("sea_flash_sale_tag_avatar_incoming");
                                                        C786410Ut5.U4(frameLayoutLJIILL, 1.0f);
                                                        C786410Ut5.Pb(frameLayoutLJIILL, 0.0f);
                                                        C786410Ut5.qc(frameLayoutLJIILL, 0.0f);
                                                        frameLayoutLJIILL.setPivotX(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)) / 2.0f);
                                                        frameLayoutLJIILL.setPivotY(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)) / 2.0f);
                                                        C786410Ut5.Gd(frameLayoutLJIILL, AnonymousClass1855.LJIIJJI(0));
                                                        C786410Ut5.Md(frameLayoutLJIILL, 0.0f);
                                                        frameLayoutLJIILL.setZ(3.0f);
                                                        frameLayout.addView(frameLayoutLJIILL, AnonymousClass1855.LJIILJJIL());
                                                        AnimatorSet animatorSet = new AnimatorSet();
                                                        animatorSet.setDuration(600L);
                                                        animatorSet.playTogether(ObjectAnimator.ofFloat(viewFindViewWithTag, (Property<View, Float>) View.X, viewFindViewWithTag.getX(), fLJIIJJI), ObjectAnimator.ofFloat(viewFindViewWithTag2, (Property<View, Float>) View.X, viewFindViewWithTag2.getX(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)) + fLJIIJJI), ObjectAnimator.ofFloat(viewFindViewWithTag2, (Property<View, Float>) View.ALPHA, viewFindViewWithTag2.getAlpha(), 0.0f), ObjectAnimator.ofFloat(frameLayoutLJIILL, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(frameLayoutLJIILL, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f));
                                                        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.185L
                                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                                            public final void onAnimationCancel(Animator animator2) {
                                                                anonymousClass1855.LJIIL(frameLayout, listLL5);
                                                                anonymousClass1855.LJIJ = null;
                                                                Function0<Unit> function0 = awS433S0200000_32;
                                                                if (function0 != null) {
                                                                    function0.invoke();
                                                                }
                                                            }

                                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                                            public final void onAnimationEnd(Animator animator2) {
                                                                AnonymousClass1855 anonymousClass18552 = anonymousClass1855;
                                                                FrameLayout frameLayout3 = frameLayout;
                                                                FrameLayout frameLayout4 = frameLayoutLJIILL;
                                                                View view2 = viewFindViewWithTag;
                                                                View view3 = viewFindViewWithTag2;
                                                                anonymousClass18552.getClass();
                                                                C786410Ut5.T4(view3, 0.0f);
                                                                C786410Ut5.LJJJZ(view3, frameLayout3);
                                                                frameLayout4.setTag("sea_flash_sale_tag_avatar_first");
                                                                C786410Ut5.T4(frameLayout4, 1.0f);
                                                                C786410Ut5.Ob(frameLayout4, 1.0f);
                                                                C786410Ut5.pc(frameLayout4, 1.0f);
                                                                C786410Ut5.Fd(frameLayout4, AnonymousClass1855.LJIIJJI(0));
                                                                C786410Ut5.Ld(frameLayout4, 0.0f);
                                                                frameLayout4.setZ(2.0f);
                                                                view2.setTag("sea_flash_sale_tag_avatar_second");
                                                                C786410Ut5.T4(view2, 1.0f);
                                                                C786410Ut5.Ob(view2, 1.0f);
                                                                C786410Ut5.pc(view2, 1.0f);
                                                                C786410Ut5.Fd(view2, AnonymousClass1855.LJIIJJI(1));
                                                                C786410Ut5.Ld(view2, 0.0f);
                                                                view2.setZ(1.0f);
                                                                frameLayout3.bringChildToFront(view2);
                                                                frameLayout3.bringChildToFront(frameLayout4);
                                                                frameLayout3.invalidate();
                                                                anonymousClass1855.LJIJ = null;
                                                                Function0<Unit> function0 = awS433S0200000_32;
                                                                if (function0 != null) {
                                                                    function0.invoke();
                                                                }
                                                            }
                                                        });
                                                        animatorSet.start();
                                                        anonymousClass1855.LJIJ = animatorSet;
                                                        return;
                                                    }
                                                    tuxTextView2.setText(c185fLIZ.LIZIZ);
                                                    return;
                                                }
                                            }
                                        }
                                        LinearLayout linearLayout = anonymousClass1855.LJFF;
                                        if (linearLayout == null) {
                                            anonymousClass1855.LJIJ(c185fLIZ);
                                            return;
                                        } else {
                                            linearLayout.animate().alpha(0.0f).setDuration(120L).withEndAction(new ARunnableS45S0300000_12(anonymousClass1855, c185fLIZ, linearLayout, 19)).start();
                                            return;
                                        }
                                    }
                                    TuxTextView tuxTextView3 = anonymousClass1855.LJII;
                                    if (tuxTextView3 == null) {
                                        anonymousClass1855.LJIJI(c185fLIZ);
                                        return;
                                    }
                                    SpannableStringBuilder spannableStringBuilder = anonymousClass1855.LJIIIIZZ;
                                    if (spannableStringBuilder != null) {
                                        string = spannableStringBuilder.toString();
                                    } else {
                                        string = null;
                                    }
                                    if (!Intrinsics.LJFF(string, c185fLIZ.LIZJ)) {
                                        anonymousClass1855.LJIIIIZZ = null;
                                        anonymousClass1855.LJIIIZ = null;
                                        anonymousClass1855.LJIIJ = -1;
                                        anonymousClass1855.LJIIJJI = -1;
                                        anonymousClass1855.LJIIZILJ(c185fLIZ);
                                    }
                                    if (C703302op.LIZ(anonymousClass1855.LJIIL)) {
                                        String str6 = anonymousClass1855.LJIIL;
                                        if (str6 != null) {
                                            str2 = str6;
                                        }
                                        anonymousClass1855.LJJ(str2);
                                        return;
                                    }
                                    SpannableStringBuilder spannableStringBuilder2 = anonymousClass1855.LJIIIIZZ;
                                    if (spannableStringBuilder2 != null) {
                                        tuxTextView3.setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo4 = popupCardVO.flashSaleAtmosphereInfo;
                if (flashSaleAtmosphereInfo4 != null && (flashSaleAtmosphereStock = flashSaleAtmosphereInfo4.flashSaleAtmosphereStock) != null) {
                    flashSaleAtmosphereStock3 = new FlashSaleAtmosphereStock(liveFlashSaleInfo.stockStatus, liveFlashSaleInfo.availableStock, flashSaleAtmosphereStock.activityStockText, flashSaleAtmosphereStock.totalActivityStock);
                    if (flashSaleAtmosphereStock3.activityStockStatus == 3) {
                        z3 = true;
                    }
                }
                LJJJLIIL(flashSaleAtmosphereStock3, z3, true);
            }
        }
    }

    public final void h1(boolean z) {
        if (z) {
            this.LLLIIIIL.destroy();
            this.LLLIIIL.destroy();
        }
        this.LLLIIIIL.LJIIIZ(false);
        this.LLLIIIL.LJIIIZ(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final boolean k1(PopupCardVO popupCardVO) {
        ThirdLineTopBrand thirdLineTopBrand = popupCardVO.thirdLineTopBrand;
        if (thirdLineTopBrand != null) {
            C998550c5l c998550c5l = this.LLLIZZ;
            c998550c5l.LIZ.addOnLayoutChangeListener(c998550c5l.LJ);
            C786410Ut5.LJJJJJL((LinearLayout) c998550c5l.LIZ);
            AttributeSet attributeSet = null;
            c998550c5l.LIZLLL = null;
            TopBrand topBrand = thirdLineTopBrand.prefix;
            int i = 6;
            boolean z = false;
            if (topBrand != null) {
                ViewGroup viewGroup = (ViewGroup) c998550c5l.LIZ;
                C186G c186g = new C186G(c998550c5l.LIZJ, attributeSet, i, null == true ? 1 : 0);
                c998550c5l.LIZLLL = c186g;
                c186g.e0(topBrand, new C186J(0.0f, 0.0f, 81, 0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 59));
                viewGroup.addView(c186g);
            }
            if (C123100dR.LIZ(thirdLineTopBrand.sellerName)) {
                if (((ViewGroup) c998550c5l.LIZ).getChildCount() > 0) {
                    ViewGroup viewGroup2 = (ViewGroup) c998550c5l.LIZ;
                    TuxTextView tuxTextView = new TuxTextView(c998550c5l.LIZJ, attributeSet, i, null == true ? 1 : 0);
                    tuxTextView.setText("·");
                    tuxTextView.setTextColorRes(R.attr.ft);
                    tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0);
                    viewGroup2.addView(tuxTextView);
                }
                ViewGroup viewGroup3 = (ViewGroup) c998550c5l.LIZ;
                C186M c186m = new C186M(c998550c5l.LIZJ, null, 6);
                c186m.LIZ(new EnhancedBrandLogo(thirdLineTopBrand.sellerLogo, thirdLineTopBrand.sellerName, thirdLineTopBrand.blueVImage, thirdLineTopBrand.blueVImageDarkMode, null, null), new C186N(Integer.valueOf(R.attr.ft), 81, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), null, null, null, 56));
                viewGroup3.addView(c186m);
            }
            if (((ViewGroup) c998550c5l.LIZ).getChildCount() > 0) {
                z = true;
            }
            c998550c5l.LJIIIZ(z);
        }
        return this.LLLIZZ.LJFF();
    }

    @Override // X.AbstractC21177617uA, X.AbstractC21202217y8
    public void setAtmosphereTags(List<AtmosphereTag> list) {
        this.LLLI.LJIILJJIL(list);
    }

    public final void setEcommerceliveAnchorEducationViewFromXml(TuxTextView tuxTextView) {
        this.LLJLLL = tuxTextView;
    }

    public final void setEcommerceliveBtnBuyFromXml(C197039127h c197039127h) {
        this.LLJILJIL = c197039127h;
    }

    public final void setEcommerceliveCreatorExclusivePricePreheatLayoutFromXml(LinearLayout linearLayout) {
        this.LLJJJJJIL = linearLayout;
    }

    public final void setEcommerceliveFansTagFromXml(FrameLayout frameLayout) {
        this.LLJJJ = frameLayout;
    }

    public final void setEcommerceliveFlashSaleEnhancementPriceLayoutFromXml(FrameLayout frameLayout) {
        this.LLJI = frameLayout;
    }

    public final void setEcommerceliveIconAssistantFromXml(TuxIconView tuxIconView) {
        this.LLJJJIL = tuxIconView;
    }

    public final void setEcommerceliveIconCloseContainerFromXml(FrameLayout frameLayout) {
        this.LLJL = frameLayout;
    }

    public final void setEcommerceliveIconCloseFromXml(TuxIconView tuxIconView) {
        this.LLJJLIIIJLLLLLLLZ = tuxIconView;
    }

    public final void setEcommerceliveLiveExclusiveFlashSaleLayoutFromXml(LinearLayout linearLayout) {
        this.LLJJJJ = linearLayout;
    }

    public final void setEcommerceliveNextActionDividerLineFromXml(View view) {
        this.LLJLILLLLZIIL = view;
    }

    public final void setEcommerceliveNextActionLowerLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLJLL = constraintLayout;
    }

    public final void setEcommerceliveNextActionUpperLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLJLLIL = constraintLayout;
    }

    public final void setEcommerceliveProductAtmosphereLayoutFromXml(FrameLayout frameLayout) {
        this.LLJJI = frameLayout;
    }

    public final void setEcommerceliveProductDescFromXml(C18QS c18qs) {
        this.LLJILLL = c18qs;
    }

    public final void setEcommerceliveProductMainImageLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLJJ = constraintLayout;
    }

    public final void setEcommerceliveProductPriceLayoutFromXml(ViewGroup viewGroup) {
        this.LLJ = viewGroup;
    }

    public final void setEcommercelivePromotionLayoutContainerFromXml(FrameLayout frameLayout) {
        this.LLJJIJI = frameLayout;
    }

    public final void setEcommercelivePromotionLayoutFromXml(C18L9 c18l9) {
        this.LLJJIII = c18l9;
    }

    public final void setEcommerceliveSecondPromotionLayoutContainerFromXml(FrameLayout frameLayout) {
        this.LLJJIJIL = frameLayout;
    }

    public final void setEcommerceliveSecondPromotionLayoutFromXml(C18L9 c18l9) {
        this.LLJJIJIIJIL = c18l9;
    }

    public final void setEcommerceliveSellerBrandFromXml(C186M c186m) {
        this.LLJILJILJ = c186m;
    }

    public final void setEcommerceliveTopBrandViewContainerFromXml(FrameLayout frameLayout) {
        this.LLJLIL = frameLayout;
    }

    public final void setEcommerceliveTopBrandViewFromXml(LinearLayout linearLayout) {
        this.LLJJJJLIIL = linearLayout;
    }

    public final void setSellingPointViewContainerFromXml(FrameLayout frameLayout) {
        this.LLJJL = frameLayout;
    }

    public final void setSellingPointViewFromXml(C18L9 c18l9) {
        this.LLJIJIL = c18l9;
    }

    public static String T0(Map map, EnhancementText enhancementText) {
        String strLJJIFFI = (String) map.get(Long.valueOf(enhancementText.type));
        if (strLJJIFFI == null) {
            strLJJIFFI = "";
        }
        if (strLJJIFFI.length() == 0) {
            return "";
        }
        for (PlaceholderInfo placeholderInfo : enhancementText.placeholderInfo) {
            strLJJIFFI = u.LJJIFFI(strLJJIFFI, placeholderInfo.placeholder, placeholderInfo.value, false);
        }
        return strLJJIFFI;
    }

    @Override // X.InterfaceC21184117vD
    public final void LJIIJJI(GetMoreActionResp getMoreActionResp, Function0<Unit> function0) {
        long jLongValue;
        int iIntValue;
        boolean z;
        int i;
        int i2;
        C197039127h c197039127h;
        Integer num;
        Integer num2;
        Integer num3;
        C18QS c18qs;
        String str;
        Integer num4;
        ActionCardInfo actionCardInfo;
        Integer num5;
        TextView textView;
        Integer num6;
        Integer num7;
        Long l;
        Integer num8;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(getEcommerceliveNextActionUpperLayoutFromXml());
        List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(getEcommerceliveNextActionLowerLayoutFromXml());
        ActionCardInfo actionCardInfo2 = getMoreActionResp.cardInfo;
        if (actionCardInfo2 != null && (num8 = actionCardInfo2.uiType) != null && num8.intValue() == 2) {
            listLJIILJJIL2.add(getEcommerceliveNextActionDividerLineFromXml());
        }
        C19395510uP moreActionFlipController = getMoreActionFlipController();
        List listLJIILJJIL3 = C1697810uHb.LJIILJJIL(this.LLLFF.LIZ, this.LLLIIII.LIZ, this.LLL.LIZJ.LIZ, this.LLLIIIIL.LIZ, this.LLLIIIL.LIZ, this.LLLFFI.LIZ, this.LLLF.LIZLLL(), this.LLLIZZ.LIZ);
        moreActionFlipController.LJIIL.removeCallbacksAndMessages(null);
        ((ArrayList) moreActionFlipController.LIZJ).clear();
        ((ArrayList) moreActionFlipController.LIZJ).addAll(listLJIILJJIL3);
        ((ArrayList) moreActionFlipController.LIZLLL).clear();
        ((ArrayList) moreActionFlipController.LIZLLL).addAll(listLJIILJJIL);
        ((ArrayList) moreActionFlipController.LJ).clear();
        ((ArrayList) moreActionFlipController.LJ).addAll(listLJIILJJIL2);
        ActionCardInfo actionCardInfo3 = getMoreActionResp.cardInfo;
        if (actionCardInfo3 != null && (l = actionCardInfo3.showTimeMs) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 10000;
        }
        moreActionFlipController.LJFF = jLongValue;
        moreActionFlipController.LJIIIZ = getContext();
        moreActionFlipController.LJII = new AwS576S0100000_32((AFwS223S0000000_32) function0, 821);
        C181I popCardViewCallback = getPopCardViewCallback();
        C786410Ut5.I7(new C19LP(popCardViewCallback, 11, 42), moreActionFlipController.LIZ);
        C786410Ut5.I7(new C19LP(popCardViewCallback, 12, 42), moreActionFlipController.LIZIZ);
        C19395510uP moreActionFlipController2 = getMoreActionFlipController();
        ActionCardInfo actionCardInfo4 = getMoreActionResp.cardInfo;
        if (actionCardInfo4 != null && (num7 = actionCardInfo4.uiType) != null) {
            iIntValue = num7.intValue();
        } else {
            iIntValue = 0;
        }
        moreActionFlipController2.getClass();
        C19395510uP.LJIILJJIL = iIntValue;
        C19395510uP moreActionFlipController3 = getMoreActionFlipController();
        String str2 = getMoreActionResp.LIZ().get("entrance_form");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        moreActionFlipController3.getClass();
        C19395510uP.LJIILL = str2;
        C19395510uP moreActionFlipController4 = getMoreActionFlipController();
        CharSequence text = ((AppCompatTextView) this.LLLFF.LIZ).getText();
        View view = this.LLLII.LIZ;
        TuxTextView tuxTextViewLIZLLL = this.LLLF.LIZLLL();
        moreActionFlipController4.LJIIIIZZ = getMoreActionResp;
        ActionCardInfo actionCardInfo5 = getMoreActionResp.cardInfo;
        if (actionCardInfo5 != null && (num6 = actionCardInfo5.uiType) != null && num6.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (actionCardInfo = getMoreActionResp.cardInfo) != null && (num5 = actionCardInfo.uiType) != null && num5.intValue() == 2 && (textView = (TextView) moreActionFlipController4.LIZ.findViewById(R.id.glr)) != null) {
            textView.setMaxLines(1);
            textView.setText(text);
        }
        TextDisplay textDisplay = getMoreActionResp.title;
        if (textDisplay != null) {
            ActionCardInfo actionCardInfo6 = getMoreActionResp.cardInfo;
            if (actionCardInfo6 != null && (num4 = actionCardInfo6.uiType) != null && num4.intValue() == 1) {
                c18qs = (C18QS) moreActionFlipController4.LIZ.findViewById(R.id.glr);
            } else {
                c18qs = (C18QS) moreActionFlipController4.LIZIZ.findViewById(R.id.glo);
            }
            ECImage eCImage = getMoreActionResp.title.rightIcon;
            if (eCImage != null) {
                str = eCImage.url;
            } else {
                str = null;
            }
            String str4 = textDisplay.wholeText;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = textDisplay.highlightPart;
            if (str5 != null) {
                str3 = str5;
            }
            c18qs.LJJJJL(str4, str3, str, null);
        }
        ActionCardInfo actionCardInfo7 = getMoreActionResp.cardInfo;
        if (actionCardInfo7 != null && (num3 = actionCardInfo7.uiType) != null && num3.intValue() == 1) {
            moreActionFlipController4.LJ(getMoreActionResp, 3);
            moreActionFlipController4.LIZJ(view, tuxTextViewLIZLLL);
        }
        ActionCardInfo actionCardInfo8 = getMoreActionResp.cardInfo;
        if (actionCardInfo8 != null && (num2 = actionCardInfo8.uiType) != null && num2.intValue() == 1) {
            i = R.attr.eyv;
        } else {
            i = R.attr.ewy;
        }
        ActionCardInfo actionCardInfo9 = getMoreActionResp.cardInfo;
        if (actionCardInfo9 != null && (num = actionCardInfo9.uiType) != null && num.intValue() == 1) {
            i2 = R.attr.eya;
        } else {
            i2 = R.attr.c5z;
        }
        Context context = moreActionFlipController4.LJIIIZ;
        if (context != null && (c197039127h = (C197039127h) moreActionFlipController4.LIZIZ.findViewById(R.id.glm)) != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(i, context);
            if (numLIZJ != null) {
                c197039127h.setTextColor(numLIZJ.intValue());
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(i2, context);
            if (numLIZJ2 != null) {
                int iIntValue2 = numLIZJ2.intValue();
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                c384050F3z.LIZ = Integer.valueOf(iIntValue2);
                c197039127h.setBackground(c384050F3z.LIZ(context));
            }
        }
        C19395510uP moreActionFlipController5 = getMoreActionFlipController();
        moreActionFlipController5.LJI = true;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) moreActionFlipController5.LIZJ).iterator();
        while (it2.hasNext()) {
            arrayList.add(C621740Oa4.LIZ(1.0f, 0.0f, (View) it2.next()));
        }
        for (View view2 : (ArrayList) moreActionFlipController5.LIZLLL) {
            C786410Ut5.LJLLLLLL(0, view2);
            C786410Ut5.T4(view2, 0.0f);
            arrayList.add(C621740Oa4.LIZ(0.0f, 1.0f, view2));
        }
        for (View view3 : (ArrayList) moreActionFlipController5.LJ) {
            C786410Ut5.LJLLLLLL(0, view3);
            C786410Ut5.T4(view3, 0.0f);
            arrayList.add(C621740Oa4.LIZ(0.0f, 1.0f, view3));
            arrayList.add(C621740Oa4.LIZIZ(C418440Gaw.LIZIZ(36), 0.0f, view3));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
        animatorSet.setDuration(300L);
        animatorSet.addListener(new ALAdapterS24S0100000_29(moreActionFlipController5, 14));
        animatorSet.start();
        moreActionFlipController5.LJIIJ = animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0143 A[PHI: r4
      0x0143: PHI (r4v2 long) = (r4v1 long), (r4v4 long), (r4v4 long), (r4v4 long) binds: [B:60:0x00d0, B:62:0x00d6, B:64:0x00da, B:66:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC21204917yZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(int r18, long r19) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1853.LJJI(int, long):void");
    }

    @Override // X.InterfaceC21204917yZ
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
        PopupCardVO popupCardVO = this.LLIZLLLIL;
        String str = null;
        if (popupCardVO != null && (promotionInfo = popupCardVO.promotionInfo) != null && (promotionProductPrice2 = promotionInfo.productPrice) != null && (singlePriceItem2 = promotionProductPrice2.minPrice) != null) {
            num = singlePriceItem2.priceDisplayMode;
        } else {
            num = null;
        }
        sbLIZ.append(num);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        PopupCardVO popupCardVO2 = this.LLIZLLLIL;
        if (popupCardVO2 != null) {
            Animator animator = this.LLLJIL;
            if (animator != null && true == animator.isStarted()) {
                C2341109Fh.LJII("animator is running, wait for anim");
                Animator animator2 = this.LLLJIL;
                if (animator2 != null) {
                    animator2.addListener(new ALAdapterS5S0210000_32(popupCardVO2, this, z, 4));
                    return;
                }
                return;
            }
            if (z) {
                P0(popupCardVO2, false);
            }
            PromotionInfo promotionInfo2 = popupCardVO2.promotionInfo;
            if (promotionInfo2 != null && (promotionProductPrice = promotionInfo2.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
                AnonymousClass1862<C426160GnO> anonymousClass1862 = this.LLLFFI;
                String strLIZJ = C743702vL.LIZJ(singlePriceItem);
                String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
                String str2 = singlePriceItem.pricePrefix;
                String str3 = singlePriceItem.discountFormat;
                AnonymousClass1844 anonymousClass1844LIZ = AnonymousClass1843.LIZ(singlePriceItem);
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popupCardVO2.flashSaleAtmosphereInfo;
                if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && flashSaleAtmosphere.status == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zS1 = s1();
                Integer num2 = singlePriceItem.priceDisplayMode;
                SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
                if (singlePriceHideInfo != null) {
                    str = singlePriceHideInfo.displayText;
                }
                anonymousClass1862.LJIJJLI(new C185I(strLIZJ, strLIZLLL, "", str2, str3, anonymousClass1844LIZ, z2, zS1, num2, str));
            }
            N0();
            F0(popupCardVO2);
        }
    }

    @Override // X.InterfaceC21184117vD
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
        PopupCardVO popupCardVO = this.LLIZLLLIL;
        if (popupCardVO != null) {
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C185E c185e = this.LLLFF;
                PromotionInfo promotionInfo = popupCardVO.promotionInfo;
                if (promotionInfo != null) {
                    list = promotionInfo.placementLabels;
                } else {
                    list = null;
                }
                c185e.LJIIJ(new C212276185i(str, list));
                C19395510uP moreActionFlipController = getMoreActionFlipController();
                CharSequence text = ((AppCompatTextView) this.LLLFF.LIZ).getText();
                if (moreActionFlipController.LJI && (i = C19395510uP.LJIILJJIL) != 1 && i == 2 && (textView = (TextView) moreActionFlipController.LIZ.findViewById(R.id.glr)) != null) {
                    textView.setMaxLines(1);
                    textView.setText(text);
                }
            }
            if (img != null && C703302op.LIZ(img.url)) {
                int iLIZ = C21195917x7.LIZ(this.LLJZIJLIL);
                this.LLLII.LJIILL(C1743690vTb.LJI(img.url, iLIZ, iLIZ, EnumC1769850w9n.LIVE_POP_CARD), null);
            }
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b7  */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v49, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v65 */
    @Override // X.InterfaceC21204917yZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLZIJ(int r45, java.lang.Integer r46) {
        /*
            Method dump skipped, instruction units count: 1887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1853.LJJJLZIJ(int, java.lang.Integer):void");
    }

    @Override // X.InterfaceC21184117vD
    public final void LJJLIIIJLJLI(PopupCardVO popupCardVO, String str) {
        List<PlacementLabel> list;
        SinglePriceItem singlePriceItem;
        boolean z;
        FlashSaleAtmosphere flashSaleAtmosphere;
        if (this.LLIZLLLIL == null) {
            return;
        }
        this.LLIZLLLIL = popupCardVO;
        ((LinkedHashMap) this.LLIZ).clear();
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
            Animator animator = this.LLLJIL;
            if (animator != null && true == animator.isStarted()) {
                Animator animator2 = this.LLLJIL;
                if (animator2 != null) {
                    animator2.addListener(new ALAdapterS1S1200000_32(this, popupCardVO, str, 1));
                    return;
                }
                return;
            }
            M0(popupCardVO, str);
            return;
        }
        this.LLLII.LJIIZILJ(Integer.valueOf(popupCardVO.platform), popupCardVO.source, popupCardVO.bagIndex, true);
        if (this.LLLI.LJ != null) {
            this.LLLII.LJIJ(false);
        }
        C185E c185e = this.LLLFF;
        String str2 = popupCardVO.title;
        PromotionInfo promotionInfo = popupCardVO.promotionInfo;
        String str3 = null;
        if (promotionInfo != null) {
            list = promotionInfo.placementLabels;
        } else {
            list = null;
        }
        c185e.LJIIJ(new C212276185i(str2, list));
        c1(this, popupCardVO.isSoldOut(), z0(), Integer.valueOf(popupCardVO.buyButtonType), 8);
        PromotionInfo promotionInfo2 = popupCardVO.promotionInfo;
        if (promotionInfo2 != null) {
            P0(popupCardVO, false);
            PromotionProductPrice promotionProductPrice = promotionInfo2.productPrice;
            if (promotionProductPrice != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
                AnonymousClass1862<C426160GnO> anonymousClass1862 = this.LLLFFI;
                String strLIZJ = C743702vL.LIZJ(singlePriceItem);
                String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
                String str4 = singlePriceItem.pricePrefix;
                String str5 = singlePriceItem.discountFormat;
                AnonymousClass1844 anonymousClass1844LIZ = AnonymousClass1843.LIZ(singlePriceItem);
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo;
                if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && flashSaleAtmosphere.status == 3) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zS1 = s1();
                Integer num = singlePriceItem.priceDisplayMode;
                SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
                if (singlePriceHideInfo != null) {
                    str3 = singlePriceHideInfo.displayText;
                }
                anonymousClass1862.LJIJJLI(new C185I(strLIZJ, strLIZLLL, "", str4, str5, anonymousClass1844LIZ, z, zS1, num, str3));
            }
            List<PromotionSticker> list2 = promotionInfo2.promotionStickers;
            if (list2 != null) {
                this.LLLII.LJIILJJIL(list2, this.LLIZ);
            }
        }
        if (TextUtils.equals(str, "live_message_exclusive_price_promotion_status_change") && (h0() || z0())) {
            this.LLLI.LJIIL();
            this.LLLII.LJIJ(true);
        }
        N0();
        F0(popupCardVO);
    }

    @Override // X.InterfaceC21197317xL
    public final void LLJJ(int i, AtmosphereTag atmosphereTag) {
        boolean z;
        C181I popCardViewCallback;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        AtmosphereTag atmosphereTag2 = atmosphereTag;
        if (!isAttachedToWindow()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("refreshAtmosphereTag but not show");
            AnonymousClass1859 anonymousClass1859 = this.LLLI;
            C187K c187kLJIIJJI = anonymousClass1859.LJIIIIZZ.get(i);
            if (c187kLJIIJJI != null || (c187kLJIIJJI = anonymousClass1859.LJIIJJI(i)) != null) {
                c187kLJIIJJI.LJ = atmosphereTag2;
                return;
            }
            return;
        }
        if (!this.LLLI.LJIIIZ) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("refreshAtmosphereTag but not shown");
            AnonymousClass1859 anonymousClass18592 = this.LLLI;
            C187K c187kLJIIJJI2 = anonymousClass18592.LJIIIIZZ.get(i);
            if (c187kLJIIJJI2 != null || (c187kLJIIJJI2 = anonymousClass18592.LJIIJJI(i)) != null) {
                c187kLJIIJJI2.LJ = atmosphereTag2;
                return;
            }
            return;
        }
        PopupCardVO popupCardVO = this.LLIZLLLIL;
        if (popupCardVO != null && popupCardVO.isInStock() && !z0()) {
            AnonymousClass1859 anonymousClass18593 = this.LLLI;
            FlashSaleAtmosphereStock flashSaleAtmosphereStock = null;
            if (atmosphereTag2 != null) {
                PopupCardVO popupCardVO2 = this.LLIZLLLIL;
                if (popupCardVO2 != null && (flashSaleAtmosphereInfo = popupCardVO2.flashSaleAtmosphereInfo) != null) {
                    flashSaleAtmosphereStock = flashSaleAtmosphereInfo.flashSaleAtmosphereStock;
                }
                atmosphereTag2.LIZLLL = flashSaleAtmosphereStock;
            } else {
                atmosphereTag2 = null;
            }
            if (!h0() && !z0()) {
                z = false;
            } else {
                z = true;
            }
            C212269185b c212269185bLJIILIIL = AnonymousClass1859.LJIILIIL(anonymousClass18593, i, atmosphereTag2, false, 0L, z, null, 40);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refreshAtmosphereTag result needShow = ");
            sbLIZ.append(c212269185bLJIILIIL.LIZ);
            sbLIZ.append(" , showChanged = ");
            sbLIZ.append(c212269185bLJIILIIL.LIZIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            this.LLLII.LJIJ(!c212269185bLJIILIIL.LIZ);
            if (c212269185bLJIILIIL.LIZ) {
                Map<String, String> map = c212269185bLJIILIIL.LIZJ;
                if (c212269185bLJIILIIL.LIZIZ && map != null && (popCardViewCallback = getPopCardViewCallback()) != null) {
                    popCardViewCallback.LJIIIIZZ(map);
                    return;
                }
                return;
            }
            return;
        }
        this.LLLI.LJIIL();
    }

    public final void M0(PopupCardVO popupCardVO, String str) {
        List<PlacementLabel> list;
        FlashSaleAtmosphere flashSaleAtmosphere;
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
        List<String> list2;
        boolean z;
        String str2;
        FlashSaleAtmosphere flashSaleAtmosphere2;
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
        C187K c187kLJIIJJI;
        AtmosphereTag next;
        List<PromotionSticker> list3;
        getMoreActionFlipController().LJFF();
        C0(popupCardVO, false, this.LLJZIJLIL);
        this.LLLII.LJIIZILJ(Integer.valueOf(popupCardVO.platform), popupCardVO.source, popupCardVO.bagIndex, true);
        c1(this, popupCardVO.isSoldOut(), z0(), Integer.valueOf(popupCardVO.buyButtonType), 8);
        this.LLLIIL.LJIIJ(new C212273185f(popupCardVO.assistantSwitch, popupCardVO.assistantModules));
        if (this.LLLIIL.LJFF()) {
            this.LLLF.LJFF(false);
            C786410Ut5.I7(new C19LP(this, 15, 42), this.LLLIIL.LIZ);
            Map<String, String> map14 = this.LLIZ;
            map14.put("has_live_helper", "1");
            map14.put("user_type", "moderator");
        } else {
            this.LLLF.LJFF(true);
        }
        this.LLLILZLLLI.LJIILJJIL(popupCardVO.enhancedBrandLogo);
        if (this.LLLILZLLLI.LJFF()) {
            e1(this.LLLFF.LIZ, this.LLLF.LIZLLL());
        } else {
            setProductInfoAtStartOfCloseBtn(this.LLLFF.LIZ);
        }
        this.LLILZLL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().o1();
        P0(popupCardVO, true);
        PromotionInfo promotionInfo = popupCardVO.promotionInfo;
        if (promotionInfo != null && (list3 = promotionInfo.promotionStickers) != null) {
            this.LLLII.LJIILJJIL(list3, this.LLIZ);
        }
        C185E c185e = this.LLLFF;
        String str3 = popupCardVO.title;
        PromotionInfo promotionInfo2 = popupCardVO.promotionInfo;
        Integer numValueOf = null;
        if (promotionInfo2 != null) {
            list = promotionInfo2.placementLabels;
        } else {
            list = null;
        }
        c185e.LJIIJ(new C212276185i(str3, list));
        AnonymousClass1859 anonymousClass1859 = this.LLLI;
        List<AtmosphereTag> list4 = popupCardVO.atmosphereTags;
        anonymousClass1859.getClass();
        if (PinCardRefactorSettings.LIZ().atmosphereEnable) {
            AtmosphereTag atmosphereTag = anonymousClass1859.LJ;
            if (atmosphereTag != null) {
                C187K c187k = anonymousClass1859.LJIIIIZZ.get(atmosphereTag.tagType);
                anonymousClass1859.LJIIIIZZ.clear();
                anonymousClass1859.LJII.clear();
                anonymousClass1859.LJIIIIZZ.put(atmosphereTag.tagType, c187k);
                anonymousClass1859.LJII.add(c187k);
                Iterator<AtmosphereTag> it2 = list4.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.tagType == c187k.LIZLLL) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                AtmosphereTag atmosphereTag2 = next;
                if (atmosphereTag2 != null) {
                    c187k.LJ = atmosphereTag2;
                }
            }
            for (AtmosphereTag atmosphereTag3 : list4) {
                if (anonymousClass1859.LJIIIIZZ.get(atmosphereTag3.tagType) == null && (c187kLJIIJJI = anonymousClass1859.LJIIJJI(atmosphereTag3.tagType)) != null) {
                    c187kLJIIJJI.LJ = atmosphereTag3;
                }
            }
        }
        if (this.LLLI.LJ == null) {
            LJJIL();
        }
        PromotionInfo promotionInfo3 = popupCardVO.promotionInfo;
        if (promotionInfo3 != null && (promotionProductPrice = promotionInfo3.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
            AnonymousClass1862<C426160GnO> anonymousClass1862 = this.LLLFFI;
            PriceUiConfig priceUiConfig = singlePriceItem.priceUiConfig;
            if (priceUiConfig != null && (map13 = priceUiConfig.configs) != null && (priceConfig12 = map13.get("pin_card")) != null) {
                priceTextConfig = priceConfig12.currency;
            } else {
                priceTextConfig = null;
            }
            PriceUiConfig priceUiConfig2 = singlePriceItem.priceUiConfig;
            if (priceUiConfig2 != null && (map12 = priceUiConfig2.configs) != null && (priceConfig11 = map12.get("pin_card")) != null) {
                priceTextConfig2 = priceConfig11.prefix;
            } else {
                priceTextConfig2 = null;
            }
            PriceUiConfig priceUiConfig3 = singlePriceItem.priceUiConfig;
            if (priceUiConfig3 != null && (map11 = priceUiConfig3.configs) != null && (priceConfig10 = map11.get("pin_card")) != null) {
                priceTextConfig3 = priceConfig10.formatOriginPrice;
            } else {
                priceTextConfig3 = null;
            }
            PriceUiConfig priceUiConfig4 = singlePriceItem.priceUiConfig;
            if (priceUiConfig4 != null && (map10 = priceUiConfig4.configs) != null && (priceConfig9 = map10.get("pin_card")) != null) {
                priceTextConfig4 = priceConfig9.formatAvailablePrice;
            } else {
                priceTextConfig4 = null;
            }
            PriceUiConfig priceUiConfig5 = singlePriceItem.priceUiConfig;
            if (priceUiConfig5 != null && (map9 = priceUiConfig5.configs) != null && (priceConfig8 = map9.get("pin_card")) != null) {
                priceTextConfig5 = priceConfig8.formatAvailablePriceInteger;
            } else {
                priceTextConfig5 = null;
            }
            PriceUiConfig priceUiConfig6 = singlePriceItem.priceUiConfig;
            if (priceUiConfig6 != null && (map8 = priceUiConfig6.configs) != null && (priceConfig7 = map8.get("pin_card")) != null) {
                priceTextConfig6 = priceConfig7.formatAvailablePriceDecimal;
            } else {
                priceTextConfig6 = null;
            }
            PriceUiConfig priceUiConfig7 = singlePriceItem.priceUiConfig;
            if (priceUiConfig7 != null && (map7 = priceUiConfig7.configs) != null && (priceConfig6 = map7.get("pin_card")) != null) {
                priceTextConfig7 = priceConfig6.formatAvailablePricePoint;
            } else {
                priceTextConfig7 = null;
            }
            PriceUiConfig priceUiConfig8 = singlePriceItem.priceUiConfig;
            if (priceUiConfig8 != null && (map6 = priceUiConfig8.configs) != null && (priceConfig5 = map6.get("pin_card")) != null) {
                discountTag = priceConfig5.discount;
            } else {
                discountTag = null;
            }
            PriceUiConfig priceUiConfig9 = singlePriceItem.priceUiConfig;
            if (priceUiConfig9 != null && (map5 = priceUiConfig9.configs) != null && (priceConfig4 = map5.get("pin_card")) != null) {
                discountTag2 = priceConfig4.flashSaleDiscount;
            } else {
                discountTag2 = null;
            }
            PriceUiConfig priceUiConfig10 = singlePriceItem.priceUiConfig;
            if (priceUiConfig10 != null && (map4 = priceUiConfig10.configs) != null) {
                map4.get("pin_card");
            }
            PriceUiConfig priceUiConfig11 = singlePriceItem.priceUiConfig;
            if (priceUiConfig11 != null && (map3 = priceUiConfig11.configs) != null && (priceConfig3 = map3.get("pin_card")) != null) {
                priceTextConfig8 = priceConfig3.exceedFormatOriginPrice;
            } else {
                priceTextConfig8 = null;
            }
            PriceUiConfig priceUiConfig12 = singlePriceItem.priceUiConfig;
            if (priceUiConfig12 != null && (map2 = priceUiConfig12.configs) != null && (priceConfig2 = map2.get("pin_card")) != null) {
                priceTextConfig9 = priceConfig2.exceedDiscount;
            } else {
                priceTextConfig9 = null;
            }
            PriceUiConfig priceUiConfig13 = singlePriceItem.priceUiConfig;
            if (priceUiConfig13 != null && (map = priceUiConfig13.configs) != null && (priceConfig = map.get("pin_card")) != null) {
                list2 = priceConfig.discountDisplayOrder;
            } else {
                list2 = null;
            }
            anonymousClass1862.LJIL(new AnonymousClass1868(priceTextConfig, priceTextConfig2, priceTextConfig3, priceTextConfig4, priceTextConfig5, priceTextConfig6, priceTextConfig7, discountTag, discountTag2, priceTextConfig8, priceTextConfig9, list2));
            AnonymousClass1862<C426160GnO> anonymousClass18622 = this.LLLFFI;
            String strLIZJ = C743702vL.LIZJ(singlePriceItem);
            String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
            String str4 = singlePriceItem.pricePrefix;
            String str5 = singlePriceItem.discountFormat;
            AnonymousClass1844 anonymousClass1844LIZ = AnonymousClass1843.LIZ(singlePriceItem);
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere2 = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && flashSaleAtmosphere2.status == 3) {
                z = true;
            } else {
                z = false;
            }
            boolean zS1 = s1();
            Integer num = singlePriceItem.priceDisplayMode;
            SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
            if (singlePriceHideInfo != null) {
                str2 = singlePriceHideInfo.displayText;
            } else {
                str2 = null;
            }
            anonymousClass18622.LJIJJLI(new C185I(strLIZJ, strLIZLLL, "", str4, str5, anonymousClass1844LIZ, z, zS1, num, str2));
        }
        if (TextUtils.equals(str, "live_message_exclusive_price_promotion_status_change") && (h0() || z0())) {
            this.LLLI.LJIIL();
            this.LLLII.LJIJ(true);
        }
        N0();
        F0(popupCardVO);
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2 = popupCardVO.flashSaleAtmosphereInfo;
        if (flashSaleAtmosphereInfo2 != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo2.flashSaleAtmosphere) != null) {
            numValueOf = Integer.valueOf(flashSaleAtmosphere.status);
        }
        if (this.LLLL == 2 && W0(this.LLIZLLLIL) == 2 && numValueOf != null && numValueOf.intValue() == 3) {
            this.LLLFFI.LJII();
            this.LLLFFI.LJIJJ();
            this.LLLIILIL.LJII();
            this.LLLILZ.LJII();
            if (p1(popupCardVO)) {
                this.LLLIILIL.LJIIJ(2);
                this.LLLIILIL.LJIIIZ(true);
                this.LLLFFI.LJIIIZ(true);
                this.LLLILZ.LJIIIZ(false);
                return;
            }
            this.LLLFFI.LJIIIZ(false);
            this.LLLIILIL.LJIIIZ(false);
            this.LLLILZ.LJJIIZI();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P0(PopupCardVO popupCardVO, boolean z) {
        FlashSaleAtmosphere flashSaleAtmosphere;
        FlashSaleEnhancementInfo flashSaleEnhancementInfo;
        List<PromotionLabel> list;
        PromotionStyleConfig promotionStyleConfig;
        PromotionLabelConfig promotionLabelConfig;
        SeparatorConfig separatorConfig;
        PromotionLabel promotionLabel;
        PromotionLabel promotionLabel2;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j;
        List list2;
        C212334187o c212334187o;
        List<PromotionLabel> list3;
        AttributeSet attributeSet = null;
        boolean z7 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (!u1(popupCardVO)) {
            if (!z) {
                this.LLLIL.LJIIIZ(false);
                this.LLLILZ.LJIIIZ(false);
                V0();
            }
        } else {
            if (!z) {
                this.LLLFF.LJIIJJI(1);
                this.LLLIIII.LJIIIZ(false);
                this.LLLIILIL.LJIIIZ(false);
                this.LLLILZJ.LJIIIZ(false);
                this.LLLIZZ.LJIIIZ(false);
                this.LLL.LIZJ();
                h1(false);
            }
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && (flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo) != null) {
                if (flashSaleEnhancementInfo.enhancementStyle == 2) {
                    if (!z) {
                        this.LLLIL.LJIIIZ(false);
                        this.LLLIILIL.LJIIIZ(false);
                        this.LLLFFI.LJIIIZ(false);
                    } else {
                        AnonymousClass1863 anonymousClass1863 = this.LLLILZ;
                        C185K c185kU0 = u0(popupCardVO, null);
                        anonymousClass1863.getClass();
                        if (c185kU0 != null) {
                            anonymousClass1863.LIZLLL = AnonymousClass1863.LJJII(c185kU0);
                            if (anonymousClass1863.LJFF()) {
                                anonymousClass1863.LJJIIZI();
                            }
                        }
                    }
                } else {
                    if (!z) {
                        V0();
                        this.LLLILZ.LJIIIZ(false);
                    }
                    LinearLayout ecommerceliveLiveExclusiveFlashSaleLayoutFromXml = getEcommerceliveLiveExclusiveFlashSaleLayoutFromXml();
                    ViewGroup.LayoutParams layoutParams = ecommerceliveLiveExclusiveFlashSaleLayoutFromXml.getLayoutParams();
                    if (layoutParams != null) {
                        C19ME c19me = (C19ME) layoutParams;
                        c19me.endToStart = R.id.gl9;
                        C786410Ut5.W5(ecommerceliveLiveExclusiveFlashSaleLayoutFromXml, c19me);
                        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2 = popupCardVO.flashSaleAtmosphereInfo;
                        if (flashSaleAtmosphereInfo2 != null) {
                            PromotionInfo promotionInfo = popupCardVO.promotionInfo;
                            if (promotionInfo != null) {
                                list = promotionInfo.promotionLabels;
                            } else {
                                list = null;
                            }
                            C185F c185fLIZJ = C185B.LIZJ(flashSaleAtmosphereInfo2, list, popupCardVO.serverTime);
                            if (c185fLIZJ != null) {
                                if (z) {
                                    AnonymousClass1855 anonymousClass1855 = this.LLLIL;
                                    anonymousClass1855.LIZLLL = c185fLIZJ;
                                    anonymousClass1855.LJIJJ();
                                } else {
                                    AnonymousClass1855 anonymousClass18552 = this.LLLIL;
                                    anonymousClass18552.LIZLLL = c185fLIZJ;
                                    anonymousClass18552.LJ = -2;
                                    anonymousClass18552.LJIJJLI();
                                }
                                PromotionInfo promotionInfo2 = popupCardVO.promotionInfo;
                                if (promotionInfo2 != null && (promotionStyleConfig = promotionInfo2.styleConfig) != null && (promotionLabelConfig = promotionStyleConfig.promotionLabelConfig) != null && (separatorConfig = promotionLabelConfig.separator) != null) {
                                    this.LLLIL.LJIL(separatorConfig);
                                }
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                }
                O0();
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        PromotionInfo promotionInfo3 = popupCardVO.promotionInfo;
        if (promotionInfo3 != null && (list3 = promotionInfo3.promotionLabels) != null) {
            promotionLabel2 = null;
            promotionLabel = null;
            for (PromotionLabel promotionLabel3 : list3) {
                if (C19676311yb.LIZLLL(promotionLabel3)) {
                    promotionLabel = promotionLabel3;
                } else if (C212258184q.LJ(promotionLabel3)) {
                    promotionLabel2 = promotionLabel3;
                } else {
                    arrayList.add(promotionLabel3);
                }
            }
        } else {
            promotionLabel = null;
            promotionLabel2 = null;
        }
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo3 = popupCardVO.flashSaleAtmosphereInfo;
        if (promotionLabel2 != null && flashSaleAtmosphereInfo3 != null) {
            this.LLLFF.LJIIJJI(1);
            PopupCardVO popupCardVO2 = this.LLIZLLLIL;
            long j2 = 0;
            if (popupCardVO2 != null) {
                j = popupCardVO2.createTime;
                j2 = popupCardVO2.serverTime;
            } else {
                j = 0;
            }
            PromotionInfo promotionInfo4 = popupCardVO.promotionInfo;
            if (promotionInfo4 == null || (list2 = promotionInfo4.promotionLabels) == null) {
                list2 = C13BV.INSTANCE;
            }
            C185V c185v = new C185V(flashSaleAtmosphereInfo3, promotionLabel2, j, j2, list2);
            if (z) {
                AnonymousClass1858 anonymousClass1858 = this.LLLIILIL;
                anonymousClass1858.LJI = c185v;
                int i2 = anonymousClass1858.LJII;
                int i3 = 6;
                if (i2 != 1) {
                    if (i2 != 2) {
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZJ("changeState but state error");
                        return;
                    }
                    TuxTextView tuxTextView = anonymousClass1858.LJFF;
                    if (tuxTextView != null) {
                        tuxTextView.removeOnLayoutChangeListener(anonymousClass1858.LJIILLIIL);
                    }
                    anonymousClass1858.LJFF = null;
                    C786410Ut5.LJJJJJL((LinearLayout) anonymousClass1858.LIZ);
                    ((ViewGroup) anonymousClass1858.LIZ).addView((View) anonymousClass1858.LJIIZILJ.getValue(), -1, -2);
                    ((C212252184k) anonymousClass1858.LJIJ.getValue()).LJIILL(new C212257184p(list2, j, j2, false, 32));
                    C212249184h<ViewGroup> c212249184h = ((AbstractC212248184g) anonymousClass1858.LJIJ.getValue()).LJI;
                    if (c212249184h != null && (c212334187o = c212249184h.LJIIIZ) != null) {
                        c212334187o.setPromotionTextEllipsize(TextUtils.TruncateAt.END);
                    } else {
                        c212334187o = null;
                    }
                    anonymousClass1858.LIZLLL = c212334187o;
                    TuxTextView tuxTextView2 = new TuxTextView(anonymousClass1858.LIZJ, attributeSet, i3, objArr2 == true ? 1 : 0);
                    tuxTextView2.setSingleLine(true);
                    tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    tuxTextView2.setTuxFont(81);
                    tuxTextView2.setTextColorRes(R.attr.a1k);
                    ViewGroup viewGroup = (ViewGroup) anonymousClass1858.LIZ;
                    C19ME c19me2 = new C19ME(-2, -2);
                    ((ViewGroup.MarginLayoutParams) c19me2).topMargin = tuxTextView2.getContext().getResources().getDimensionPixelOffset(R.dimen.us);
                    viewGroup.addView(tuxTextView2, c19me2);
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                    anonymousClass1858.LJ = tuxTextView2;
                    FlashSaleAtmosphereStock flashSaleAtmosphereStock = flashSaleAtmosphereInfo3.flashSaleAtmosphereStock;
                    if (flashSaleAtmosphereStock == null) {
                        return;
                    }
                    anonymousClass1858.LJIILJJIL(flashSaleAtmosphereStock, null);
                    return;
                }
                C786410Ut5.LJJJJJL((LinearLayout) anonymousClass1858.LIZ);
                anonymousClass1858.LIZLLL = null;
                anonymousClass1858.LJ = null;
                anonymousClass1858.LJIIJJI = -1;
                anonymousClass1858.LJIIL = -1;
                anonymousClass1858.LJIIIZ = null;
                anonymousClass1858.LJIIIIZZ = null;
                TuxTextView tuxTextView3 = new TuxTextView(anonymousClass1858.LIZJ, attributeSet, i3, objArr == true ? 1 : 0);
                tuxTextView3.setTuxFont(71);
                tuxTextView3.setTextColor(anonymousClass1858.LJIIL());
                tuxTextView3.setMaxLines(2);
                anonymousClass1858.LJIIJJI();
                SpannableStringBuilder spannableStringBuilder = anonymousClass1858.LJIIIIZZ;
                if (spannableStringBuilder != null) {
                    tuxTextView3.setText(spannableStringBuilder);
                }
                ((ViewGroup) anonymousClass1858.LIZ).addView(tuxTextView3, -1, -2);
                tuxTextView3.addOnLayoutChangeListener(anonymousClass1858.LJIILLIIL);
                TuxTextView tuxTextView4 = anonymousClass1858.LJFF;
                if (tuxTextView4 != null) {
                    tuxTextView4.removeOnLayoutChangeListener(anonymousClass1858.LJIILLIIL);
                }
                anonymousClass1858.LJFF = tuxTextView3;
                return;
            }
            AnonymousClass1858 anonymousClass18582 = this.LLLIILIL;
            C786410Ut5.LJJJJJL((LinearLayout) anonymousClass18582.LIZ);
            anonymousClass18582.LJII = -2;
            anonymousClass18582.LJIIJJI = -1;
            anonymousClass18582.LJIIL = -1;
            anonymousClass18582.LJIIIIZZ = null;
            anonymousClass18582.LJIIIZ = null;
            anonymousClass18582.LJIILIIL = null;
            anonymousClass18582.LJI = c185v;
            return;
        }
        this.LLLIILIL.LJIIIZ(false);
        if (promotionLabel != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLILZIL = z2;
        int benefitMaxRows = getBenefitMaxRows();
        this.LLJZ = 0;
        this.LLLIIII.LJIIJ(promotionLabel);
        if (this.LLLIIII.LJFF()) {
            this.LLJZ++;
            h1(false);
        }
        if (this.LLJZ < benefitMaxRows) {
            if (this.LLLIIII.LJFF()) {
                o1(benefitMaxRows, k1(popupCardVO), this.LLL.LIZIZ(popupCardVO.userRightView, popupCardVO.sellingView));
                if (this.LLJZ < benefitMaxRows && g1(popupCardVO, arrayList)) {
                    this.LLJZ++;
                }
                n0();
            } else {
                if (g1(popupCardVO, arrayList)) {
                    this.LLJZ++;
                }
                if (this.LLJZ < benefitMaxRows) {
                    o1(benefitMaxRows, k1(popupCardVO), this.LLL.LIZIZ(popupCardVO.userRightView, popupCardVO.sellingView));
                }
                n0();
            }
        }
        if (this.LLJZ >= benefitMaxRows) {
            if (this.LLLIIII.LJFF()) {
                if (benefitMaxRows - 1 <= 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                a1(this.LLLIIII.LIZ, z6);
                i = 1;
            } else {
                i = 0;
            }
            if (this.LLLIIIIL.LJFF()) {
                int i4 = benefitMaxRows - 1;
                if (i >= i4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                a1(getEcommercelivePromotionLayoutContainerFromXml(), z4);
                if (i >= i4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                a1(getEcommerceliveSecondPromotionLayoutContainerFromXml(), z5);
                i++;
            }
            if (this.LLLIZZ.LJFF()) {
                if (i >= benefitMaxRows - 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                a1(getEcommerceliveTopBrandViewContainerFromXml(), z3);
            }
            if (this.LLL.LIZ()) {
                if (i >= benefitMaxRows - 1) {
                    z7 = true;
                }
                a1(getSellingPointViewContainerFromXml(), z7);
            }
        }
        O0();
    }

    public final void Y0(View view, View view2) {
        C19ME c19me = (C19ME) view.getLayoutParams();
        if (c19me.endToStart != -1 || c19me.endToEnd != view2.getId()) {
            c19me.endToStart = -1;
            c19me.endToEnd = view2.getId();
            c19me.setMarginEnd(0);
            C786410Ut5.W5(view, c19me);
        }
    }

    public final void Z0(View view, View view2) {
        C19ME c19me = (C19ME) view.getLayoutParams();
        if (c19me.endToEnd != -1 || c19me.endToStart != view2.getId()) {
            c19me.endToEnd = -1;
            c19me.endToStart = view2.getId();
            c19me.setMarginEnd(C1210230hbB.LIZ(8, getContext()));
            C786410Ut5.W5(view, c19me);
        }
    }

    public final void a1(View view, boolean z) {
        if (z) {
            Z0(view, getVisibleBtn());
        } else {
            Y0(view, getVisibleBtn());
        }
    }

    public final void e1(View view, View view2) {
        C19ME c19me = (C19ME) view.getLayoutParams();
        if (c19me.endToStart != -1 || c19me.endToEnd != view2.getId()) {
            c19me.endToStart = -1;
            c19me.endToEnd = view2.getId();
            c19me.setMarginEnd(0);
            C786410Ut5.W5(view, c19me);
        }
    }

    public final boolean g1(PopupCardVO popupCardVO, List list) {
        Integer num;
        C212252184k c212252184k = this.LLLIIIL;
        C13BV c13bv = C13BV.INSTANCE;
        c212252184k.LJIILL(new C212257184p(c13bv, popupCardVO.createTime, popupCardVO.serverTime, true, 96));
        this.LLLIIIIL.LJIILL(new C212257184p(list, popupCardVO.createTime, popupCardVO.serverTime, true, 96));
        PromotionInfo promotionInfo = popupCardVO.promotionInfo;
        List<PromotionLabel> list2 = null;
        if (promotionInfo != null) {
            num = promotionInfo.promotionLabelsShowStyle;
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            PromotionInfo promotionInfo2 = popupCardVO.promotionInfo;
            if (promotionInfo2 != null) {
                list2 = promotionInfo2.secondPromotionLabels;
            }
            if (!this.LLLIIIIL.LJFF() && list2 != null && !list2.isEmpty()) {
                C212252184k c212252184k2 = this.LLLIIIIL;
                C212257184p c212257184p = c212252184k2.LJIIIZ;
                List list3 = c13bv;
                if (c212257184p != null) {
                    List<PromotionLabel> list4 = c212257184p.LIZ;
                    list3 = c13bv;
                    if (list4 != null) {
                        ArrayList arrayList = new ArrayList(list4);
                        arrayList.addAll(list2);
                        list3 = arrayList;
                    }
                }
                c212252184k2.LJIILL(new C212257184p(list3, popupCardVO.createTime, popupCardVO.serverTime, true, 96));
                if (!this.LLLIIIIL.LJFF()) {
                    h1(false);
                }
            }
        }
        if (!B0()) {
            h1(false);
        }
        this.LLLIIIIL.LIZIZ = new InterfaceC212286185s() { // from class: X.185o
            @Override // X.InterfaceC212286185s
            public final void LIZ() {
                this.LIZ.L0();
            }
        };
        return B0();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C185I l0(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r22, java.lang.Integer r23) {
        /*
            r21 = this;
            r5 = r22
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo r0 = r5.flashSaleAtmosphereInfo
            r2 = 0
            if (r0 == 0) goto Lad
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere r6 = r0.flashSaleAtmosphere
            if (r6 == 0) goto Lad
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo r0 = r5.promotionInfo
            if (r0 == 0) goto Lad
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice r0 = r0.productPrice
            if (r0 == 0) goto Lad
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem r3 = r0.minPrice
            if (r3 == 0) goto Lad
            java.util.List<java.lang.String> r0 = r6.animatorPriceList
            if (r0 == 0) goto Laa
            java.lang.Object r12 = X.C13LP.LJJLIIIJL(r0)
            java.lang.String r12 = (java.lang.String) r12
        L21:
            r4 = 3
            r7 = 1
            r1 = r21
            if (r23 == 0) goto L97
            int r0 = r23.intValue()
            if (r0 != r7) goto L8e
            int r0 = r6.status
            if (r0 != r4) goto L8e
            java.lang.String r11 = r5.formatOriginPrice
            java.lang.String r15 = r5.discount
        L35:
            X.1844 r10 = X.AnonymousClass1843.LIZ(r3)
            java.util.List<java.lang.String> r0 = r6.animatorDisplayPriceList
            if (r0 == 0) goto L8c
            java.lang.Object r9 = X.C13LP.LJJLIIIJL(r0)
            java.lang.String r9 = (java.lang.String) r9
        L43:
            java.util.List<java.lang.String> r0 = r6.animatorPriceIntegerList
            if (r0 == 0) goto L8a
            java.lang.Object r8 = X.C13LP.LJJLIIIJL(r0)
            java.lang.String r8 = (java.lang.String) r8
        L4d:
            java.util.List<java.lang.String> r0 = r6.animatorPriceDecimalList
            if (r0 == 0) goto L88
            java.lang.Object r7 = X.C13LP.LJJLIIIJL(r0)
            java.lang.String r7 = (java.lang.String) r7
        L57:
            r0 = 35
            X.1844 r16 = X.AnonymousClass1844.LIZ(r10, r9, r8, r7, r0)
            X.185I r10 = new X.185I
            java.lang.String r13 = r6.formatPrice
            java.lang.String r14 = r3.pricePrefix
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo r0 = r5.flashSaleAtmosphereInfo
            if (r0 == 0) goto L85
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere r0 = r0.flashSaleAtmosphere
            if (r0 == 0) goto L85
            int r0 = r0.status
            if (r0 != r4) goto L85
            r17 = 1
        L71:
            boolean r18 = r1.s1()
            java.lang.Integer r1 = r3.priceDisplayMode
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceHideInfo r0 = r3.priceHideInfo
            if (r0 == 0) goto L7d
            java.lang.String r2 = r0.displayText
        L7d:
            r19 = r1
            r20 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r10
        L85:
            r17 = 0
            goto L71
        L88:
            r7 = r2
            goto L57
        L8a:
            r8 = r2
            goto L4d
        L8c:
            r9 = r2
            goto L43
        L8e:
            int r0 = r23.intValue()
            if (r0 != r7) goto L97
            r11 = r2
            r15 = r2
            goto L35
        L97:
            java.lang.String r11 = r6.formatOriginPrice
            java.lang.String r15 = r6.discount
            boolean r0 = r1.LLLLIIL
            if (r0 == 0) goto L35
            int r0 = r11.length()
            if (r0 != 0) goto L35
            java.lang.String r11 = X.C743702vL.LIZJ(r3)
            goto L35
        Laa:
            r12 = r2
            goto L21
        Lad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1853.l0(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO, java.lang.Integer):X.185I");
    }

    public final void p0(View view, View view2) {
        if (view.getVisibility() == 0) {
            if (view.getBottom() + C1210230hbB.LIZ(4, getContext()) <= view2.getTop()) {
                Y0(view, view2);
                return;
            } else {
                Z0(view, view2);
                return;
            }
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJII("only visible benefitView need check");
    }

    public final void s0(List list, long j) {
        if (this.LLLIIII.LJFF()) {
            Animator animatorLJ = this.LLLIIII.LJ();
            animatorLJ.setStartDelay(j);
            animatorLJ.setDuration(100L);
            ((ArrayList) list).add(animatorLJ);
        }
        if (this.LLLIIIIL.LJFF()) {
            Animator animatorLJ2 = this.LLLIIIIL.LJ();
            animatorLJ2.setStartDelay(j);
            animatorLJ2.setDuration(100L);
            ((ArrayList) list).add(animatorLJ2);
        }
        if (this.LLLIIIL.LJFF()) {
            Animator animatorLJ3 = this.LLLIIIL.LJ();
            animatorLJ3.setStartDelay(j);
            animatorLJ3.setDuration(100L);
            ((ArrayList) list).add(animatorLJ3);
        }
        getPromotionFlipperController().LJI.removeMessages(101);
        if (this.LLL.LIZ()) {
            Animator animatorLJ4 = this.LLL.LIZJ.LJ();
            animatorLJ4.setStartDelay(j);
            animatorLJ4.setDuration(100L);
            ((ArrayList) list).add(animatorLJ4);
        }
    }

    public final C185K u0(PopupCardVO popupCardVO, Integer num) {
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        List<PromotionLabel> list;
        double d;
        AnonymousClass1868 anonymousClass1868;
        PriceTextConfig priceTextConfig;
        FlashSaleEnhancementCurveUiConfig flashSaleEnhancementCurveUiConfig;
        PriceConfig priceConfig;
        FlashSaleAtmosphere flashSaleAtmosphere;
        FlashSaleEnhancementInfo flashSaleEnhancementInfo;
        FlashSaleEnhancementPriceCurveInfo flashSaleEnhancementPriceCurveInfo;
        C185I c185iL0 = l0(popupCardVO, num);
        FlashSaleEnhancementConfig flashSaleEnhancementConfig = null;
        if (c185iL0 == null || (flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo) == null) {
            return null;
        }
        PromotionInfo promotionInfo = popupCardVO.promotionInfo;
        if (promotionInfo != null) {
            list = promotionInfo.promotionLabels;
        } else {
            list = null;
        }
        C185F c185fLIZJ = C185B.LIZJ(flashSaleAtmosphereInfo, list, popupCardVO.serverTime);
        if (c185fLIZJ == null) {
            return null;
        }
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2 = popupCardVO.flashSaleAtmosphereInfo;
        if (flashSaleAtmosphereInfo2 != null) {
            flashSaleEnhancementConfig = flashSaleAtmosphereInfo2.LIZ;
        }
        int i = c185fLIZJ.LIZ;
        String str = c185fLIZJ.LIZIZ;
        List<C1555800qaY> list2 = c185fLIZJ.LJ;
        if (flashSaleAtmosphereInfo2 != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo2.flashSaleAtmosphere) != null && (flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo) != null && (flashSaleEnhancementPriceCurveInfo = flashSaleEnhancementInfo.enhancementPriceCurveInfo) != null) {
            d = flashSaleEnhancementPriceCurveInfo.changeRate;
        } else {
            d = 0.05d;
        }
        C185H c185h = new C185H(i, str, c185fLIZJ.LJII, d, list2);
        if (flashSaleEnhancementConfig != null && (priceConfig = flashSaleEnhancementConfig.curvePriceUiConfig) != null) {
            anonymousClass1868 = new AnonymousClass1868(priceConfig.currency, priceConfig.prefix, priceConfig.formatOriginPrice, priceConfig.formatAvailablePrice, priceConfig.formatAvailablePriceInteger, priceConfig.formatAvailablePriceDecimal, priceConfig.formatAvailablePricePoint, priceConfig.discount, priceConfig.flashSaleDiscount, priceConfig.exceedFormatOriginPrice, priceConfig.exceedDiscount, priceConfig.discountDisplayOrder);
        } else {
            anonymousClass1868 = null;
            if (flashSaleEnhancementConfig == null) {
                priceTextConfig = null;
                flashSaleEnhancementCurveUiConfig = null;
            }
            return new C185K(c185iL0, c185h, anonymousClass1868, priceTextConfig, flashSaleEnhancementCurveUiConfig);
        }
        priceTextConfig = flashSaleEnhancementConfig.curveTextUiConfig;
        flashSaleEnhancementCurveUiConfig = flashSaleEnhancementConfig.curveUiConfig;
        return new C185K(c185iL0, c185h, anonymousClass1868, priceTextConfig, flashSaleEnhancementCurveUiConfig);
    }

    public AnonymousClass1853(Context context, AttributeSet attributeSet, int i) {
        AnonymousClass1862<C426160GnO> anonymousClass1862;
        super(context, attributeSet, i);
        this.LLJZIJLIL = 1;
        this.LLLJ = new C182X();
        this.LLLL = -1;
        this.LLLLIILL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(282));
        this.LLLLILI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(281));
        this.LLLLJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 820));
        LayoutInflater layoutInflaterCloneInContext = C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp));
        if (C0A0F.LIZ()) {
            C786410Ut5.Sd(R.layout.bvs, layoutInflaterCloneInContext, this);
        } else {
            C786410Ut5.Sd(R.layout.bvr, layoutInflaterCloneInContext, this);
        }
        if (C0A0F.LIZ()) {
            anonymousClass1862 = new AnonymousClass1862<>(getEcommerceliveProductPriceLayoutFromXml(), new C186Q());
        } else {
            anonymousClass1862 = new AnonymousClass1862<>(getEcommerceliveProductPriceLayoutFromXml(), new C186R());
        }
        this.LLLFFI = anonymousClass1862;
        this.LLLFZ = new C212271185d(getEcommerceliveAnchorEducationViewFromXml());
        C185C c185c = new C185C(getSellingPointViewFromXml());
        this.LLL = c185c;
        this.LLLF = new C212262184u(getEcommerceliveBtnBuyFromXml());
        this.LLLILZLLLI = new C185Q(getEcommerceliveSellerBrandFromXml());
        this.LLLFF = new C185E(getEcommerceliveProductDescFromXml());
        C186B<ConstraintLayout> c186b = new C186B<>(getEcommerceliveProductMainImageLayoutFromXml(), new C428480Gr8());
        this.LLLII = c186b;
        AnonymousClass1859 anonymousClass1859 = new AnonymousClass1859(getEcommerceliveProductAtmosphereLayoutFromXml());
        this.LLLI = anonymousClass1859;
        C212252184k c212252184k = new C212252184k(getEcommercelivePromotionLayoutFromXml(), getEcommercelivePromotionLayoutContainerFromXml());
        this.LLLIIIIL = c212252184k;
        this.LLLIIIL = new C212252184k(getEcommerceliveSecondPromotionLayoutFromXml(), getEcommerceliveSecondPromotionLayoutContainerFromXml());
        this.LLLIIII = new C212253184l(getEcommerceliveFansTagFromXml());
        this.LLLIIL = new C185O(getEcommerceliveIconAssistantFromXml());
        AnonymousClass1858 anonymousClass1858 = new AnonymousClass1858(getEcommerceliveLiveExclusiveFlashSaleLayoutFromXml());
        this.LLLIILIL = anonymousClass1858;
        this.LLLIL = new AnonymousClass1855(getEcommerceliveLiveExclusiveFlashSaleLayoutFromXml());
        this.LLLILZ = new AnonymousClass1863(getEcommerceliveFlashSaleEnhancementPriceLayoutFromXml());
        this.LLLILZJ = new C184L(getEcommerceliveCreatorExclusivePricePreheatLayoutFromXml());
        anonymousClass1858.LJIILL = this;
        getControllerLifecycleManager().LIZ(c212252184k);
        getControllerLifecycleManager().LIZ(c186b);
        getControllerShowParametersManager().LIZ(1, c212252184k, true);
        C185S controllerShowParametersManager = getControllerShowParametersManager();
        c185c.LIZ.getClass();
        controllerShowParametersManager.LIZ(2, c185c.LIZ, true);
        C185S controllerShowParametersManager2 = getControllerShowParametersManager();
        c185c.LIZIZ.getClass();
        controllerShowParametersManager2.LIZ(21, c185c.LIZIZ, true);
        getControllerShowParametersManager().LIZ(7, anonymousClass1859, false);
        this.LLLIZZ = new C998550c5l(getEcommerceliveTopBrandViewFromXml());
    }

    public static Float j0(Integer num, int i, Double d) {
        double dDoubleValue;
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        float fLIZLLL = C13LZ.LIZLLL(i / num.intValue(), 0.0f, 1.0f);
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.05d;
        }
        return Float.valueOf(C415470GQv.LIZ(dDoubleValue, fLIZLLL));
    }

    public final void C0(PopupCardVO popupCardVO, boolean z, int i) {
        int iLIZ = C21195917x7.LIZ(i);
        String strLJI = C1743690vTb.LJI(popupCardVO.imageUrl, iLIZ, iLIZ, EnumC1769850w9n.LIVE_POP_CARD);
        C05XL<Unit> c05xl = C339090DRb.LIZ.get(strLJI);
        if (c05xl != null && c05xl.isCompleted()) {
            E0(popupCardVO, z, strLJI, true);
        } else if (C292310Bcz.LIZ) {
            E0(popupCardVO, z, strLJI, false);
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0NSM(c05xl, this, popupCardVO, z, strLJI, null), 3);
        }
    }

    @Override // X.InterfaceC21204917yZ
    public final void LJJJLIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock, boolean z, boolean z2) {
        Integer numValueOf;
        int i;
        boolean z3;
        C181I popCardViewCallback;
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
            PopupCardVO popupCardVO = this.LLIZLLLIL;
            if (popupCardVO != null) {
                i = popupCardVO.flashSaleStockLimit;
            } else {
                i = 0;
            }
            flashSaleAtmosphereStock.LIZ = i;
            boolean zU1 = u1(popupCardVO);
            ArrayList arrayList = new ArrayList();
            if (!zU1) {
                this.LLLIILIL.LJIILJJIL(flashSaleAtmosphereStock, arrayList);
                AnonymousClass1859 anonymousClass1859 = this.LLLI;
                if (!z && !z0()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                AtmosphereTag atmosphereTag = anonymousClass1859.LJ;
                if (atmosphereTag != null && atmosphereTag.tagType == 5) {
                    if (atmosphereTag != null) {
                        atmosphereTag.LIZLLL = flashSaleAtmosphereStock;
                    } else {
                        atmosphereTag = null;
                    }
                    C212269185b c212269185bLJIILIIL = AnonymousClass1859.LJIILIIL(anonymousClass1859, 5, atmosphereTag, false, 0L, z3, arrayList, 8);
                    if (c212269185bLJIILIIL != null && c212269185bLJIILIIL.LIZ) {
                        Map<String, String> map = c212269185bLJIILIIL.LIZJ;
                        if (c212269185bLJIILIIL.LIZIZ && map != null && (popCardViewCallback = getPopCardViewCallback()) != null) {
                            popCardViewCallback.LJIIIIZZ(map);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(300L);
                animatorSet.playTogether(arrayList);
                animatorSet.start();
            }
        }
        if (z2) {
            PopupCardVO popupCardVO2 = this.LLIZLLLIL;
            if (popupCardVO2 == null || true != popupCardVO2.isSoldOut()) {
                z4 = false;
            }
            c1(this, z4, z, null, 12);
        }
    }

    public final void o1(int i, boolean z, boolean z2) {
        int i2 = this.LLJZ;
        if (i2 > 0 && z && z2) {
            this.LLJZ = i2 + 1;
            D1(true);
            return;
        }
        D1(false);
        int i3 = this.LLJZ;
        if (i3 < i && z) {
            this.LLJZ = i3 + 1;
        } else {
            this.LLLIZZ.LJIIIZ(false);
        }
        int i4 = this.LLJZ;
        if (i4 < i && z2) {
            this.LLJZ = i4 + 1;
        } else {
            this.LLL.LIZJ();
        }
        if (this.LLLIZZ.LJFF()) {
            C0H9H.LJI(C1210230hbB.LIZ(4, getContext()), getEcommerceliveTopBrandViewContainerFromXml());
        } else {
            C0H9H.LJI(0, getEcommerceliveTopBrandViewContainerFromXml());
        }
    }

    public final void E0(final PopupCardVO popupCardVO, final boolean z, String str, final boolean z2) {
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = System.currentTimeMillis();
        this.LLLII.LJIILL(str, new AbstractC1335900krs() { // from class: X.184K
            @Override // X.AbstractC1335900krs, X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view) {
                c238400w2.element = System.currentTimeMillis();
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                long jCurrentTimeMillis = System.currentTimeMillis() - c238400w2.element;
                C181I popCardViewCallback = this.getPopCardViewCallback();
                if (popCardViewCallback != null) {
                    popCardViewCallback.LJIILLIIL(popupCardVO, z, z2, false, jCurrentTimeMillis);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                long jCurrentTimeMillis = System.currentTimeMillis() - c238400w2.element;
                C181I popCardViewCallback = this.getPopCardViewCallback();
                if (popCardViewCallback != null) {
                    popCardViewCallback.LJIILLIIL(popupCardVO, z, z2, true, jCurrentTimeMillis);
                }
            }
        });
    }

    public static void c1(AnonymousClass1853 anonymousClass1853, boolean z, boolean z2, Integer num, int i) {
        boolean z3;
        if ((i & 4) != 0) {
            num = null;
        }
        anonymousClass1853.getClass();
        if (!z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        anonymousClass1853.LLLF.LJ(new C212284185q(z3, num), null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View visibleBtn = getVisibleBtn();
        p0(getEcommercelivePromotionLayoutContainerFromXml(), visibleBtn);
        p0(getSellingPointViewContainerFromXml(), visibleBtn);
        this.LLLIIIIL.LIZJ();
        ((C185Z) this.LLL.LIZJ).LIZJ();
        boolean z2 = true;
        if (!this.LLLLII && getShown() && this.LLLIIIIL.LJFF()) {
            this.LLLLII = true;
            C181I popCardViewCallback = getPopCardViewCallback();
            if (popCardViewCallback != null) {
                popCardViewCallback.LIZLLL(this.LLLIIIIL.LIZ());
            }
        }
        if (!this.LLLLIIIILLL && getShown()) {
            C185C c185c = this.LLL;
            if (Intrinsics.LJFF(c185c.LIZJ, c185c.LIZ) && c185c.LIZ()) {
                this.LLLLIIIILLL = true;
                C181I popCardViewCallback2 = getPopCardViewCallback();
                if (popCardViewCallback2 != null) {
                    Map<String, String> mapLIZ = ((C185Z) this.LLL.LIZJ).LIZ();
                    if (mapLIZ == null) {
                        mapLIZ = C2097608Jq.LJ();
                    }
                    popCardViewCallback2.LJIILIIL(mapLIZ);
                }
            }
        }
        if (!getShown()) {
            setShown(true);
            C181I popCardViewCallback3 = getPopCardViewCallback();
            if (popCardViewCallback3 != null) {
                popCardViewCallback3.LJ();
            }
            getMoreActionFlipController().LIZJ(this.LLLII.LIZ, this.LLLF.LIZLLL());
        }
        if (z) {
            boolean zO1 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().o1();
            int i5 = i3 - i;
            int iLIZ = C1210230hbB.LIZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, getContext());
            if (!zO1 && i5 >= iLIZ) {
                z2 = false;
            }
            if (z2 != this.LLILZLL) {
                this.LLILZLL = z2;
                if (this.LLIZLLLIL != null) {
                    O0();
                }
                getMoreActionFlipController().LIZJ(this.LLLII.LIZ, this.LLLF.LIZLLL());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    @Override // X.AbstractC21202217y8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(final com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r29, X.C1743900vTw r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, boolean r32, final boolean r33, int r34) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1853.i0(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO, X.0vTw, kotlin.jvm.functions.Function0, boolean, boolean, int):void");
    }

    public final void x1(List<Animator> list, Integer num, int i, long j, long j2, long j3, long j4) {
        boolean z;
        if (this.LLLIILIL.LJFF() && j2 > 0) {
            Animator animatorLJ = this.LLLIILIL.LJ();
            animatorLJ.addListener(new ALAdapterS5S0101000_32(this, i, 1));
            animatorLJ.setStartDelay(j);
            animatorLJ.setDuration(j2);
            ((ArrayList) list).add(animatorLJ);
            z = false;
        } else {
            b1();
            this.LLLIILIL.LJIIJ(i);
            this.LLLIILIL.LJIIIZ(true);
            z = true;
        }
        Animator animatorLIZLLL = this.LLLIILIL.LIZLLL(z);
        animatorLIZLLL.setStartDelay(j3);
        animatorLIZLLL.setDuration(j4);
        animatorLIZLLL.addListener(new ALAdapterS2S0201000_32(this, num, i, 2));
        ((ArrayList) list).add(animatorLIZLLL);
    }

    public final void y1(List<Animator> list, Integer num, int i, long j, long j2, long j3, long j4) {
        boolean z;
        if (this.LLLIL.LJFF() && j2 > 0) {
            Animator animatorLJ = this.LLLIL.LJ();
            animatorLJ.addListener(new ALAdapterS5S0101000_32(this, i, 2));
            animatorLJ.setStartDelay(j);
            animatorLJ.setDuration(j2);
            ((ArrayList) list).add(animatorLJ);
            z = false;
        } else {
            z1(this);
            AnonymousClass1855 anonymousClass1855 = this.LLLIL;
            if (anonymousClass1855.LJ != i) {
                anonymousClass1855.LJ = i;
                anonymousClass1855.LJIJJ();
            }
            this.LLLIL.LJIIIZ(true);
            z = true;
        }
        Animator animatorLIZLLL = this.LLLIL.LIZLLL(z);
        animatorLIZLLL.setStartDelay(j3);
        animatorLIZLLL.setDuration(j4);
        animatorLIZLLL.addListener(new ALAdapterS2S0201000_32(this, num, i, 3));
        ((ArrayList) list).add(animatorLIZLLL);
    }
}
