package X;

import Y.ALAdapterS3S0100000_6;
import Y.ARunnableS126S0100000_26;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0vqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757850vqR extends AbstractC1757860vqS {
    public SellingPointGroup LJIIJ;
    public PdpViewModel LJIIJJI;
    public C043B<?> LJIIL;
    public final ARunnableS126S0100000_26 LJIILIIL = new ARunnableS126S0100000_26(this, 95);

    public final void LIZIZ() {
        this.LIZIZ.removeCallbacks(this.LJIILIIL);
        C419400GcU c419400GcU = this.LIZ;
        if (c419400GcU != null) {
            ObjectAnimator objectAnimator = c419400GcU.LLILZ;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            AnimatorSet animatorSet = c419400GcU.LLILZIL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
        C419400GcU c419400GcU2 = this.LIZ;
        if (c419400GcU2 != null) {
            c419400GcU2.LLILZ = null;
            c419400GcU2.LLILZIL = null;
            C03DZ.LIZ(c419400GcU2);
        }
        this.LIZ = null;
        this.LIZJ = 0L;
        this.LIZLLL = 2200L;
        this.LJ = 1800L;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJII = 0;
    }

    public static void LIZ(C1757850vqR c1757850vqR, SellingPointGroup sellingPointGroup, C419400GcU c419400GcU, PdpViewModel pdpViewModel, Integer num, Integer num2, List list, SkuPanelAssemVM skuPanelAssemVM, int i) {
        boolean z;
        boolean z2;
        List<PdpSellingPoint> list2 = list;
        PdpViewModel pdpViewModel2 = pdpViewModel;
        SkuPanelAssemVM skuPanelAssemVM2 = null;
        if ((i & 4) != 0) {
            pdpViewModel2 = null;
        }
        if ((i & 32) != 0) {
            list2 = null;
        }
        if ((i & 64) == 0) {
            skuPanelAssemVM2 = skuPanelAssemVM;
        }
        c1757850vqR.LIZ = c419400GcU;
        c1757850vqR.LJIIJ = sellingPointGroup;
        c1757850vqR.LJIIJJI = pdpViewModel2;
        c1757850vqR.LJIIL = skuPanelAssemVM2;
        if (num != null) {
            c1757850vqR.LIZJ = num.intValue() * LSPassThroughRecordSizeConfig.DEFAULT;
        }
        if (num2 != null) {
            long jIntValue = num2.intValue() * LSPassThroughRecordSizeConfig.DEFAULT;
            c1757850vqR.LJ = jIntValue - c1757850vqR.LJFF;
            c1757850vqR.LIZLLL = jIntValue + c1757850vqR.LJI;
        }
        if (list2 != null) {
            long j = c1757850vqR.LJFF;
            long j2 = c1757850vqR.LJI;
            long j3 = c1757850vqR.LJ;
            if (list2.size() <= 1) {
                z = true;
            } else {
                z = false;
            }
            c419400GcU.getClass();
            Interpolator interpolatorLJI = C1619980sG4.LJI();
            ObjectAnimator duration = ObjectAnimator.ofFloat(c419400GcU, (Property<C419400GcU, Float>) View.TRANSLATION_Y, C418440Gaw.LIZIZ(26), 0.0f).setDuration(j);
            duration.setInterpolator(interpolatorLJI);
            c419400GcU.LLILZ = duration;
            duration.setStartDelay(0L);
            ObjectAnimator objectAnimator = c419400GcU.LLILZ;
            if (objectAnimator != null) {
                objectAnimator.addListener(new ALAdapterS3S0100000_6(c419400GcU, 43));
            }
            if (!z) {
                c419400GcU.LLILZIL = new AnimatorSet();
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(c419400GcU, (Property<C419400GcU, Float>) View.ALPHA, 1.0f, 0.2f).setDuration(j2);
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(c419400GcU, (Property<C419400GcU, Float>) View.TRANSLATION_Y, 0.0f, -C418440Gaw.LIZIZ(26)).setDuration(j2);
                AnimatorSet animatorSet = c419400GcU.LLILZIL;
                if (animatorSet != null) {
                    animatorSet.playTogether(duration3, duration2);
                }
                AnimatorSet animatorSet2 = c419400GcU.LLILZIL;
                if (animatorSet2 != null) {
                    animatorSet2.setStartDelay(j3);
                }
                AnimatorSet animatorSet3 = c419400GcU.LLILZIL;
                if (animatorSet3 != null) {
                    animatorSet3.addListener(new ALAdapterS3S0100000_6(c419400GcU, 44));
                }
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (PdpSellingPoint pdpSellingPoint : list2) {
                pdpSellingPoint.getClass();
                ECRichText eCRichText = pdpSellingPoint.text;
                Integer num3 = pdpSellingPoint.clickAction;
                Image image = pdpSellingPoint.image;
                CommonColor commonColor = pdpSellingPoint.backgroundColor;
                if (num3 != null && num3.intValue() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(new C1757870vqT(eCRichText, num3, image, commonColor, z2, pdpSellingPoint.daInfo));
            }
            c1757850vqR.LJIIIIZZ = arrayList;
        }
        C12ES.LJIILL(0, c419400GcU);
    }
}
