package Y;

import X.AbstractC214710190y;
import X.AnonymousClass1843;
import X.AnonymousClass1844;
import X.AnonymousClass1853;
import X.AnonymousClass1862;
import X.C1664680tQA;
import X.C184R;
import X.C184S;
import X.C185I;
import X.C191E;
import X.C19KJ;
import X.C19KL;
import X.C212219183d;
import X.C212225183j;
import X.C212227183l;
import X.C390640FTi;
import X.C426160GnO;
import X.C743702vL;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceHideInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.jvm.internal.AwS0S0004000_32;

/* JADX INFO: loaded from: classes33.dex */
public class ALAdapterS5S0210000_32 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS5S0210000_32 aLAdapterS5S0210000_32, Animator animator) {
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        String str;
        FlashSaleAtmosphere flashSaleAtmosphere;
        boolean z = false;
        if (aLAdapterS5S0210000_32.z2) {
            C212219183d.L0((C212219183d) aLAdapterS5S0210000_32.l0, (UsPopupCardVO) aLAdapterS5S0210000_32.l1, false, false, 6);
        }
        Animator animator2 = ((C212219183d) aLAdapterS5S0210000_32.l0).LLLIIII;
        if (animator2 != null) {
            animator2.removeListener(aLAdapterS5S0210000_32);
        }
        UsPopupCardVO usPopupCardVO = (UsPopupCardVO) aLAdapterS5S0210000_32.l1;
        PromotionInfo promotionInfo = usPopupCardVO.promotionInfo;
        if (promotionInfo != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
            C212219183d c212219183d = (C212219183d) aLAdapterS5S0210000_32.l0;
            C184R<C426160GnO> c184r = c212219183d.LLJLLL;
            String strLIZJ = C743702vL.LIZJ(singlePriceItem);
            String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
            String str2 = singlePriceItem.pricePrefix;
            String str3 = singlePriceItem.discountFormat;
            C212225183j c212225183jLIZ = C212227183l.LIZ(singlePriceItem);
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && flashSaleAtmosphere.status == 3) {
                z = true;
            }
            boolean zZ0 = c212219183d.Z0();
            Integer num = singlePriceItem.priceDisplayMode;
            SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
            if (singlePriceHideInfo != null) {
                str = singlePriceHideInfo.displayText;
            } else {
                str = null;
            }
            c184r.LJIJI(new C184S(strLIZJ, strLIZLLL, str2, str3, c212225183jLIZ, z, zZ0, num, str, usPopupCardVO.depositPrice, usPopupCardVO.afterCouponPriceContent));
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS5S0210000_32 aLAdapterS5S0210000_32, Animator animator) {
        if (!aLAdapterS5S0210000_32.z2) {
            C786410Ut5.LJLLLLLL(8, (View) aLAdapterS5S0210000_32.l0);
        }
        if (aLAdapterS5S0210000_32.z2) {
            int top = ((C19KJ) aLAdapterS5S0210000_32.l1).getTop();
            int left = ((C19KJ) aLAdapterS5S0210000_32.l1).getLeft();
            int width = ((C19KJ) aLAdapterS5S0210000_32.l1).getWidth();
            int height = ((C19KJ) aLAdapterS5S0210000_32.l1).getHeight();
            C1664680tQA<C390640FTi> c1664680tQA = ((C19KJ) aLAdapterS5S0210000_32.l1).LL;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            c1664680tQA.LIZLLL(new AwS0S0004000_32(left, top, width, height, 0), true);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$2(ALAdapterS5S0210000_32 aLAdapterS5S0210000_32, Animator animator) {
        super.onAnimationEnd(animator);
        ((C191E) aLAdapterS5S0210000_32.l0).LIZ(1.0f);
        ((AbstractC214710190y) aLAdapterS5S0210000_32.l1).LJ(aLAdapterS5S0210000_32.z2);
    }

    public static final void onAnimationEnd$3(ALAdapterS5S0210000_32 aLAdapterS5S0210000_32, Animator animator) {
        if (aLAdapterS5S0210000_32.z2) {
            int top = ((C19KL) aLAdapterS5S0210000_32.l0).getTop();
            int left = ((C19KL) aLAdapterS5S0210000_32.l0).getLeft();
            int width = ((C19KL) aLAdapterS5S0210000_32.l0).getWidth();
            int height = ((C19KL) aLAdapterS5S0210000_32.l0).getHeight();
            C1664680tQA<C390640FTi> c1664680tQA = ((C19KL) aLAdapterS5S0210000_32.l0).LLJIJIL;
            if (c1664680tQA != null) {
                c1664680tQA.LIZLLL(new AwS0S0004000_32(left, top, width, height, 1), true);
            }
        } else {
            C786410Ut5.LJLLLLLL(8, (View) aLAdapterS5S0210000_32.l1);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$4(ALAdapterS5S0210000_32 aLAdapterS5S0210000_32, Animator animator) {
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        String str;
        FlashSaleAtmosphere flashSaleAtmosphere;
        boolean z = false;
        if (aLAdapterS5S0210000_32.z2) {
            ((AnonymousClass1853) aLAdapterS5S0210000_32.l0).P0((PopupCardVO) aLAdapterS5S0210000_32.l1, false);
        }
        Animator animator2 = ((AnonymousClass1853) aLAdapterS5S0210000_32.l0).LLLJIL;
        if (animator2 != null) {
            animator2.removeListener(aLAdapterS5S0210000_32);
        }
        PopupCardVO popupCardVO = (PopupCardVO) aLAdapterS5S0210000_32.l1;
        PromotionInfo promotionInfo = popupCardVO.promotionInfo;
        if (promotionInfo != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
            AnonymousClass1853 anonymousClass1853 = (AnonymousClass1853) aLAdapterS5S0210000_32.l0;
            AnonymousClass1862<C426160GnO> anonymousClass1862 = anonymousClass1853.LLLFFI;
            String strLIZJ = C743702vL.LIZJ(singlePriceItem);
            String strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
            String str2 = singlePriceItem.pricePrefix;
            String str3 = singlePriceItem.discountFormat;
            AnonymousClass1844 anonymousClass1844LIZ = AnonymousClass1843.LIZ(singlePriceItem);
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null && flashSaleAtmosphere.status == 3) {
                z = true;
            }
            boolean zS1 = anonymousClass1853.s1();
            Integer num = singlePriceItem.priceDisplayMode;
            SinglePriceHideInfo singlePriceHideInfo = singlePriceItem.priceHideInfo;
            if (singlePriceHideInfo != null) {
                str = singlePriceHideInfo.displayText;
            } else {
                str = null;
            }
            anonymousClass1862.LJIJJLI(new C185I(strLIZJ, strLIZLLL, "", str2, str3, anonymousClass1844LIZ, z, zS1, num, str));
        }
        ((AnonymousClass1853) aLAdapterS5S0210000_32.l0).F0((PopupCardVO) aLAdapterS5S0210000_32.l1);
    }

    public ALAdapterS5S0210000_32(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
        this.z2 = z;
    }
}
