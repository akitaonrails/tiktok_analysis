package X;

import Y.ARunnableS111S0100000_11;
import Y.AUListenerS68S0101000_11;
import android.animation.ValueAnimator;
import android.os.Handler;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoAutoScrollAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RVE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RVE {
    public final ReusedAssem<? extends C03H5> LIZ;
    public final IPhotoAutoScrollAbility LIZIZ;
    public final PhotoViewModelV2 LIZJ;
    public final Function0<IPhotoSlidesAbility> LIZLLL;
    public final Function0<ISlideIndicatorAbility> LJ;
    public final Function0<BottomSlideIndicatorAbility> LJFF;
    public boolean LJI;
    public Boolean LJIIJ;
    public Integer LJIIJJI;
    public final C01GW LJII = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(654));
    public final AUListenerS68S0101000_11 LJIIIIZZ = new AUListenerS68S0101000_11(this, 4);
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1675));
    public final C0RVH LJIIL = new C0ST4() { // from class: X.0RVH
        @Override // X.C0ST4
        public final void LIZIZ(int i) {
        }

        @Override // X.C0ST4
        public final void LIZJ(int i, long j, long j2) {
        }

        @Override // X.C0ST4
        public final void LIZ(int i) {
            if (i == this.LIZ.LJ()) {
                C786410Ut5.LJJZZIII((Handler) this.LIZ.LJII.getValue(), this.LIZ.LJIILJJIL);
            }
        }
    };
    public final C0RVF LJIILIIL = new C0RVF(this);
    public final ARunnableS111S0100000_11 LJIILJJIL = new ARunnableS111S0100000_11(this, 201);

    public final boolean LIZ() {
        PhotoCarouselInfoStruct photoCarouselInfo;
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(((VideoItemParams) this.LIZ.bo()).getAweme());
        return (awemeRawAdLJJIJLIJ == null || (photoCarouselInfo = awemeRawAdLJJIJLIJ.getPhotoCarouselInfo()) == null || !photoCarouselInfo.enableLivePhotoAutoPlay()) ? false : true;
    }

    public final boolean LIZIZ() {
        PhotoCarouselInfoStruct photoCarouselInfo;
        Integer carouselIndicatorType;
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(((VideoItemParams) this.LIZ.bo()).getAweme());
        return (awemeRawAdLJJIJLIJ == null || (photoCarouselInfo = awemeRawAdLJJIJLIJ.getPhotoCarouselInfo()) == null || (carouselIndicatorType = photoCarouselInfo.getCarouselIndicatorType()) == null || carouselIndicatorType.intValue() != 2) ? false : true;
    }

    public final long LIZJ() {
        PhotoCarouselInfoStruct photoCarouselInfo;
        Long carouselPhotoAutoPageSlideDuration;
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(((VideoItemParams) this.LIZ.bo()).getAweme());
        if (awemeRawAdLJJIJLIJ == null || (photoCarouselInfo = awemeRawAdLJJIJLIJ.getPhotoCarouselInfo()) == null || (carouselPhotoAutoPageSlideDuration = photoCarouselInfo.getCarouselPhotoAutoPageSlideDuration()) == null) {
            return 2150L;
        }
        return carouselPhotoAutoPageSlideDuration.longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZLLL() {
        Boolean bool = ((C0S9P) this.LIZJ.getState()).LLIZ;
        Boolean bool2 = Boolean.TRUE;
        return !Intrinsics.LJFF(bool, bool2) && Intrinsics.LJFF(this.LJIIJ, bool2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LJ() {
        return ((C0S9P) this.LIZJ.getState()).LL;
    }

    public final ValueAnimator LJI() {
        return (ValueAnimator) this.LJIIIZ.getValue();
    }

    public final C0S7U LJFF(int i) {
        InterfaceC719460SKa interfaceC719460SKaRq2;
        IPhotoSlidesAbility iPhotoSlidesAbilityInvoke = this.LIZLLL.invoke();
        if (iPhotoSlidesAbilityInvoke != null) {
            interfaceC719460SKaRq2 = iPhotoSlidesAbilityInvoke.rq2(i);
        } else {
            interfaceC719460SKaRq2 = null;
        }
        if (!(interfaceC719460SKaRq2 instanceof C0S7U)) {
            return null;
        }
        return (C0S7U) interfaceC719460SKaRq2;
    }

    public final void LJII(int i, boolean z) {
        Float f;
        C0S7U c0s7uLJFF = LJFF(i);
        if (LIZ()) {
            ((Handler) this.LJII.getValue()).removeCallbacks(this.LJIILJJIL);
            if (this.LJI && c0s7uLJFF != null) {
                c0s7uLJFF.Ji(this.LJIIL);
            }
        }
        if (LIZIZ()) {
            if (c0s7uLJFF != null) {
                LJI().cancel();
                c0s7uLJFF.Ji(this.LJIILIIL);
            } else {
                Integer num = this.LJIIJJI;
                float fFloatValue = 0.0f;
                if (num != null && i == num.intValue()) {
                    if (z) {
                        Object animatedValue = LJI().getAnimatedValue();
                        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                            fFloatValue = f.floatValue();
                        }
                        LJIIIIZZ(fFloatValue, i);
                    }
                } else {
                    LJIIIIZZ(0.0f, i);
                }
            }
        }
        this.LJIIJJI = Integer.valueOf(i);
    }

    public final void LJIIIIZZ(float f, int i) {
        LJI().cancel();
        LJI().setFloatValues(f, 1.0f);
        LJI().setDuration(LIZJ());
        this.LJIIIIZZ.i1 = i;
        LJI().start();
        if (!LIZLLL()) {
            LJI().pause();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0RVH] */
    public C0RVE(ReusedAssem reusedAssem, IPhotoAutoScrollAbility iPhotoAutoScrollAbility, PhotoViewModelV2 photoViewModelV2, C0RVC c0rvc, C0RVD c0rvd, C0RVI c0rvi) {
        this.LIZ = reusedAssem;
        this.LIZIZ = iPhotoAutoScrollAbility;
        this.LIZJ = photoViewModelV2;
        this.LIZLLL = c0rvc;
        this.LJ = c0rvd;
        this.LJFF = c0rvi;
    }
}
