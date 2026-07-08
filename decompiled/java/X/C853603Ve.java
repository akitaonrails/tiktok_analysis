package X;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarousel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent;
import java.util.List;

/* JADX INFO: renamed from: X.03Ve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C853603Ve extends ViewPager {
    public PageHeaderCarousel LL;
    public final C803103Bt LLILLJJLI;
    public final BPEAHandler LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public C853603Ve(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = new BPEAHandler(Looper.getMainLooper());
        this.LLILZ = 350L;
        this.LLILZIL = 2350L;
        this.LLILZLL = 3350L;
        ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
        setPageTransformer(true, new C15D7() { // from class: X.03Vg
            @Override // X.C15D7
            public final void LIZ(View view, float f) {
                if (f < -1.0f) {
                    C786410Ut5.T4(view, 0.0f);
                } else {
                    if (f <= 1.0f) {
                        C786410Ut5.T4(view, 1.0f);
                        C786410Ut5.Jc(view, view.getWidth() * (-f));
                        C786410Ut5.ed(view, f * view.getHeight());
                        return;
                    }
                    C786410Ut5.T4(view, 0.0f);
                }
            }
        });
        C803103Bt c803103Bt = new C803103Bt();
        this.LLILLJJLI = c803103Bt;
        setAdapter(c803103Bt);
        addOnPageChangeListener(new InterfaceC469360Ias() { // from class: X.03Vf
            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                PageHeaderCarousel pageHeaderCarousel;
                List<PageHeaderCarouselContent> list;
                PageHeaderCarousel pageHeaderCarousel2;
                List<PageHeaderCarouselContent> list2;
                if (i == 0 && (pageHeaderCarousel = this.LL.LL) != null && (list = pageHeaderCarousel.carouselContent) != null && !list.isEmpty() && (pageHeaderCarousel2 = this.LL.LL) != null && (list2 = pageHeaderCarousel2.carouselContent) != null) {
                    int size = list2.size();
                    if (this.LL.getCurrentItem() == 0) {
                        this.LL.setCurrentItem(size, false);
                    } else {
                        if (this.LL.getCurrentItem() != size + 1) {
                            return;
                        }
                        this.LL.setCurrentItem(1, false);
                    }
                }
            }
        });
    }
}
