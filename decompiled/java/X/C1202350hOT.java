package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselPromotionBannerAssem;

/* JADX INFO: renamed from: X.0hOT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202350hOT extends AbstractC712240Rwk {
    public int LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public final /* synthetic */ PdpCarouselPromotionBannerAssem LLILZ;

    public C1202350hOT(PdpCarouselPromotionBannerAssem pdpCarouselPromotionBannerAssem) {
        this.LLILZ = pdpCarouselPromotionBannerAssem;
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLILZ.LLJLL;
        if (viewOnAttachStateChangeListenerC20631115oD == null) {
            return;
        }
        this.LLILLJJLI = i;
        if (i != 0 && i != 1) {
            return;
        }
        this.LLILLL = false;
        if (i != 0) {
            return;
        }
        if (viewOnAttachStateChangeListenerC20631115oD.isFakeDragging()) {
            viewOnAttachStateChangeListenerC20631115oD.endFakeDrag();
        }
        viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(this.LL, false);
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLILZ.LLJLL;
        if (viewOnAttachStateChangeListenerC20631115oD == null) {
            return;
        }
        this.LL = i;
        if (this.LLILLJJLI != 0) {
            return;
        }
        if (viewOnAttachStateChangeListenerC20631115oD.isFakeDragging()) {
            viewOnAttachStateChangeListenerC20631115oD.endFakeDrag();
        }
        viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(this.LL, false);
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        C20632315oP c20632315oP;
        RecyclerView recyclerView;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLILZ.LLJLL;
        if (viewOnAttachStateChangeListenerC20631115oD == null || this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        try {
            int width = viewOnAttachStateChangeListenerC20631115oD.getWidth();
            if (width <= 0) {
                this.LLILLL = false;
                return;
            }
            float f2 = f * width;
            if (!viewOnAttachStateChangeListenerC20631115oD.isFakeDragging()) {
                viewOnAttachStateChangeListenerC20631115oD.beginFakeDrag();
            }
            View childAt = viewOnAttachStateChangeListenerC20631115oD.getChildAt(0);
            if ((childAt instanceof C20632315oP) && (c20632315oP = (C20632315oP) childAt) != null) {
                View childAt2 = c20632315oP.getChildAt(0);
                if ((childAt2 instanceof RecyclerView) && (recyclerView = (RecyclerView) childAt2) != null) {
                    viewOnAttachStateChangeListenerC20631115oD.fakeDragBy(-(((i * width) + f2) - recyclerView.computeHorizontalScrollOffset()));
                    this.LLILLL = false;
                    return;
                } else {
                    this.LLILLL = false;
                    return;
                }
            }
            this.LLILLL = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL = false;
            throw th;
        }
    }
}
