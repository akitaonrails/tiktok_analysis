package Y;

import X.AnonymousClass0956;
import X.C0CNO;
import X.C0H1O;
import X.C0HAU;
import X.C0PEM;
import X.C13LZ;
import X.C1507930pLL;
import X.C1744700vVE;
import X.C1762010vx9;
import X.C1C7U;
import X.C23250099c;
import X.C418440Gaw;
import X.C424040Gjy;
import X.C631370Opb;
import X.C7727030b;
import X.C817403Hg;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselSparkInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.SparkPageControlColor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselInnerIndicatorAssem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS146S0101000_6;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS0S0303000_6 implements Runnable {
    public final int $t;
    public int i3;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;

    public final void LIZ$0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((C817403Hg) this.l0).element, ((C817403Hg) this.l1).element);
        GradientDrawable gradientDrawable = (GradientDrawable) this.l2;
        int i = this.i3;
        int i2 = this.i4;
        int i3 = this.i5;
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS2S0103000_6(gradientDrawable, i, i2, i3, 1));
        valueAnimatorOfFloat.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        SparkPageControlColor sparkPageControlColor;
        SparkPageControlColor sparkPageControlColor2;
        Aweme awemeLIZ;
        Video video;
        if (((ImageView) this.l0).getParent() == null) {
            return;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(3);
        View viewFindViewById = ((C424040Gjy) this.l1).getRootView().findViewById(R.id.egt);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.getLocationOnScreen(new int[2]);
        ((ImageView) this.l0).getLocationOnScreen(new int[2]);
        float f = (r2[0] - r3[0]) - fLIZIZ;
        float f2 = (r2[1] - r3[1]) - fLIZIZ;
        float f3 = 2 * fLIZIZ;
        float width = ((ImageView) this.l0).getWidth() + f + f3;
        float height = ((ImageView) this.l0).getHeight() + f2 + f3;
        C1762010vx9 c1762010vx9 = (C1762010vx9) C631370Opb.LIZ((PdpCarouselInnerIndicatorAssem) this.l2);
        CarouselElement carouselElement = (CarouselElement) C7727030b.LIZ(this.i3, c1762010vx9 != null ? c1762010vx9.LL : null);
        Integer num = carouselElement != null ? carouselElement.elementType : null;
        int value = C0HAU.IMAGE.getValue();
        if (num != null && num.intValue() == value) {
            LIZIZ$2((PdpCarouselInnerIndicatorAssem) this.l2, (C424040Gjy) this.l1, f, this.i4, f2, this.i5, width, height, this.i3, carouselElement.image);
            return;
        }
        int value2 = C0HAU.VIDEO.getValue();
        if (num == null || num.intValue() != value2) {
            int value3 = C0HAU.SPARK_CONTAINER.getValue();
            if (num == null || num.intValue() != value3) {
                return;
            }
            if (C1744700vVE.LJ(((C424040Gjy) this.l1).getContext(), null)) {
                CarouselSparkInfo carouselSparkInfo = carouselElement.sparkInfo;
                if (carouselSparkInfo != null && (sparkPageControlColor2 = carouselSparkInfo.pageControlColor) != null) {
                    obj = sparkPageControlColor2.darkModeColor;
                }
            } else {
                CarouselSparkInfo carouselSparkInfo2 = carouselElement.sparkInfo;
                if (carouselSparkInfo2 != null && (sparkPageControlColor = carouselSparkInfo2.pageControlColor) != null) {
                    obj = sparkPageControlColor.lightModeColor;
                }
            }
            C424040Gjy c424040Gjy = (C424040Gjy) this.l1;
            HandlerHook.viewPost(c424040Gjy, new ARunnableS13S0201000_6(c424040Gjy, this.i3, obj, 12));
            return;
        }
        com.ss.android.ugc.aweme.ecommerce.base.common.model.Video video2 = carouselElement.video;
        if (video2 == null || (awemeLIZ = video2.LIZ()) == null || (video = awemeLIZ.getVideo()) == null) {
            return;
        }
        int i = this.i3;
        PdpCarouselInnerIndicatorAssem pdpCarouselInnerIndicatorAssem = (PdpCarouselInnerIndicatorAssem) this.l2;
        C424040Gjy c424040Gjy2 = (C424040Gjy) this.l1;
        int i2 = this.i4;
        int i3 = this.i5;
        if (i != 0) {
            C0CNO.LIZLLL(0L, new AwS146S0101000_6(c424040Gjy2, i, 3));
        } else {
            UrlModel cover = video.getCover();
            LIZIZ$2(pdpCarouselInnerIndicatorAssem, c424040Gjy2, f, i2, f2, i3, width, height, i, cover != null ? new Image(Integer.valueOf(cover.getWidth()), Integer.valueOf(cover.getHeight()), "", cover.getUri(), cover.getUrlList(), cover.getUri(), cover.getUrlList(), null, null, null, null, null, null) : null);
        }
    }

    public static final void run$0(ARunnableS0S0303000_6 aRunnableS0S0303000_6) {
        boolean zLIZ;
        C1C7U.LIZ("TakoHighLightAnim@5ac1.animateAlphaChange$1");
        try {
            aRunnableS0S0303000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoHighLightAnim@5ac1.animateAlphaChange$1");
    }

    public static final void run$1(ARunnableS0S0303000_6 aRunnableS0S0303000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PdpCarouselInnerIndicatorAssem@ce2b.updateIndicatorStyleOpt$1$1");
        try {
            aRunnableS0S0303000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpCarouselInnerIndicatorAssem@ce2b.updateIndicatorStyleOpt$1$1");
    }

    public static final float LIZJ$3(float f, int i) {
        if (i <= 0) {
            return 0.0f;
        }
        return C13LZ.LIZLLL(f / i, 0.0f, 1.0f);
    }

    public ARunnableS0S0303000_6(Object obj, Object obj2, Object obj3, int i, int i2, int i3, int i4) {
        this.$t = i4;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
        this.i4 = i2;
        this.i5 = i3;
    }

    public static final void LIZIZ$2(PdpCarouselInnerIndicatorAssem pdpCarouselInnerIndicatorAssem, C424040Gjy c424040Gjy, float f, int i, float f2, int i2, float f3, float f4, int i3, Image image) {
        AnonymousClass0956 anonymousClass0956;
        if (image != null) {
            if (C1507930pLL.LIZIZ && (anonymousClass0956 = pdpCarouselInnerIndicatorAssem.LLJLIL) != null) {
                anonymousClass0956.LIZIZ(null);
            }
            pdpCarouselInnerIndicatorAssem.LLJLIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pdpCarouselInnerIndicatorAssem.sp()), C0PEM.LIZJ, null, new C0H1O(c424040Gjy, image, f, i, f2, i2, f3, f4, i3, null), 2);
        }
    }
}
