package X;

import Y.ALAdapterS11S0200000_16;
import Y.ALAdapterS12S0100000_16;
import Y.ALAdapterS6S0300000_16;
import Y.ARunnableS116S0100000_16;
import Y.AUListenerS13S0202000_16;
import Y.AUListenerS223S0200000_16;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0c55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998130c55 implements InterfaceC998200c5C<InterfaceC998270c5J> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final InterfaceC998270c5J LL;
    public boolean LLILLL;
    public final int LLILZLL;
    public final int LLIZ;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS252S0000000_16.get$arr$(564));
    public final C997320c3m LLILZ = new C997320c3m(AFwS252S0000000_16.get$arr$(563));
    public final C997320c3m LLILZIL = new C997320c3m(AFwS252S0000000_16.get$arr$(565));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C998130c55.class, "componentStatus", "getComponentStatus()Lcom/ss/android/ugc/aweme/ad/feed/descriptive/RevampComponentStatus;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C998130c55.class, "animatorProvider", "getAnimatorProvider()Lcom/ss/android/ugc/aweme/ad/feed/descriptive/DescriptiveAnimatorProvider;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C998130c55.class, "logger", "getLogger()Lcom/ss/android/ugc/aweme/ad/feed/descriptive/CommerceFeedDescriptiveLogger;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public final C998110c53 LIZ() {
        C997320c3m c997320c3m = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (C998110c53) c997320c3m.LIZ(this);
    }

    public final C998210c5D LIZIZ() {
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (C998210c5D) c997320c3m.LIZ(this);
    }

    public final C1000590c93 LIZJ() {
        C997320c3m c997320c3m = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (C1000590c93) c997320c3m.LIZ(this);
    }

    @Override // X.InterfaceC998200c5C
    public final void LJLJL() {
        this.LL.LIZ().LLFZ("COMMERCE_DESCRIPTIVE_CARD_FIRST_STAGE_TASK");
        this.LL.LIZ().LLFZ("COMMERCE_DESCRIPTIVE_CARD_SECOND_STAGE_TASK");
        this.LLILLL = false;
    }

    @Override // X.InterfaceC998200c5C
    public final void rk() {
        if (!LIZIZ().LJ || !LIZIZ().LJFF) {
            if (this.LL.LIZIZ().LJ) {
                if (this.LL.LIZJ()) {
                    Animator animatorLJIIJ = this.LL.LIZLLL().LJIIJ();
                    if (animatorLJIIJ != null) {
                        animatorLJIIJ.start();
                    }
                } else {
                    Animator animatorLJIIL = this.LL.LIZLLL().LJIIL();
                    if (animatorLJIIL != null) {
                        animatorLJIIL.start();
                    }
                    LIZIZ().LIZLLL = false;
                }
                LIZIZ().LJ = false;
                return;
            }
            return;
        }
        AnimatorSet animatorSet = null;
        if (this.LL.LIZJ()) {
            C998110c53 c998110c53LIZ = LIZ();
            if (c998110c53LIZ.LJIL == null) {
                AbstractC997340c3o abstractC997340c3o = c998110c53LIZ.LIZJ;
                AbstractC997340c3o abstractC997340c3o2 = c998110c53LIZ.LIZLLL;
                if (abstractC997340c3o != null && abstractC997340c3o2 != null) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, c998110c53LIZ.LJIIIIZZ + c998110c53LIZ.LJIIIZ);
                    valueAnimatorOfInt.addUpdateListener(new AUListenerS13S0202000_16(c998110c53LIZ.LJIIIZ, c998110c53LIZ.LJII, abstractC997340c3o2, abstractC997340c3o, 1));
                    valueAnimatorOfInt.setDuration(400L);
                    valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIIJJI());
                    valueAnimatorOfInt.addListener(new ALAdapterS11S0200000_16(abstractC997340c3o, c998110c53LIZ, 13));
                    Animator animatorLJ = c998110c53LIZ.LJ(true);
                    animatorLJ.setDuration(200L);
                    Animator animatorLIZIZ = c998110c53LIZ.LIZIZ(false);
                    animatorLIZIZ.setDuration(400L);
                    Animator animatorLJIIIIZZ = c998110c53LIZ.LJIIIIZZ(true);
                    animatorLJIIIIZZ.setDuration(650L);
                    animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(valueAnimatorOfInt, animatorLJ);
                    animatorSet.playTogether(valueAnimatorOfInt, animatorLIZIZ, animatorLJIIIIZZ);
                }
                c998110c53LIZ.LJIL = animatorSet;
            }
            Animator animator = c998110c53LIZ.LJIL;
            if (animator != null) {
                animator.addListener(new ALAdapterS12S0100000_16(c998110c53LIZ, 16));
            }
            Animator animator2 = c998110c53LIZ.LJIL;
            if (animator2 != null) {
                animator2.start();
            }
        } else {
            C998110c53 c998110c53LIZ2 = LIZ();
            if (c998110c53LIZ2.LJJ == null) {
                AbstractC997340c3o abstractC997340c3o3 = c998110c53LIZ2.LIZJ;
                AbstractC997340c3o abstractC997340c3o4 = c998110c53LIZ2.LIZLLL;
                if (abstractC997340c3o3 != null && abstractC997340c3o4 != null) {
                    int[] iArr = {c998110c53LIZ2.LJII + c998110c53LIZ2.LJIIIZ, c998110c53LIZ2.LJIIIIZZ};
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, C13LQ.LJJLIIIJ(iArr));
                    valueAnimatorOfInt2.addUpdateListener(new AUListenerS223S0200000_16(new AbstractC997340c3o[]{abstractC997340c3o4, abstractC997340c3o3}, iArr, 6));
                    valueAnimatorOfInt2.setInterpolator(C1619980sG4.LJIIJJI());
                    valueAnimatorOfInt2.setDuration(400L);
                    valueAnimatorOfInt2.addListener(new ALAdapterS11S0200000_16(abstractC997340c3o3, abstractC997340c3o4, 14));
                    Animator animatorLJ2 = c998110c53LIZ2.LJ(true);
                    animatorLJ2.setDuration(200L);
                    Animator animatorLIZIZ2 = c998110c53LIZ2.LIZIZ(false);
                    animatorLIZIZ2.setDuration(400L);
                    Animator animatorLJIIIIZZ2 = c998110c53LIZ2.LJIIIIZZ(true);
                    animatorLJIIIIZZ2.setDuration(400L);
                    animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(valueAnimatorOfInt2, animatorLJ2);
                    animatorSet.playTogether(valueAnimatorOfInt2, animatorLIZIZ2, animatorLJIIIIZZ2);
                }
                c998110c53LIZ2.LJJ = animatorSet;
            }
            Animator animator3 = c998110c53LIZ2.LJJ;
            if (animator3 != null) {
                animator3.addListener(new ALAdapterS12S0100000_16(c998110c53LIZ2, 16));
            }
            Animator animator4 = c998110c53LIZ2.LJJ;
            if (animator4 != null) {
                animator4.start();
            }
            LIZIZ().LIZLLL = false;
        }
        LIZIZ().LJ = false;
        LIZIZ().LJFF = false;
    }

    @Override // X.InterfaceC998200c5C
    public final void l1() {
        AnimatorSet animatorSet = null;
        if (LIZIZ().LIZLLL) {
            C998110c53 c998110c53LIZ = LIZ();
            if (c998110c53LIZ.LJIJ == null) {
                AbstractC997340c3o abstractC997340c3o = c998110c53LIZ.LIZJ;
                AbstractC997340c3o abstractC997340c3o2 = c998110c53LIZ.LIZLLL;
                if (abstractC997340c3o != null && abstractC997340c3o2 != null) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, c998110c53LIZ.LJIIIIZZ + c998110c53LIZ.LJIIIZ);
                    valueAnimatorOfInt.addUpdateListener(new AUListenerS13S0202000_16(c998110c53LIZ.LJIIIIZZ, c998110c53LIZ.LJII, abstractC997340c3o, abstractC997340c3o2, 0));
                    valueAnimatorOfInt.setDuration(650L);
                    valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIIJJI());
                    valueAnimatorOfInt.addListener(new ALAdapterS6S0300000_16(c998110c53LIZ, abstractC997340c3o, abstractC997340c3o2, 1));
                    Animator animatorLJ = c998110c53LIZ.LJ(false);
                    animatorLJ.setDuration(200L);
                    Animator animatorLIZIZ = c998110c53LIZ.LIZIZ(true);
                    animatorLIZIZ.setDuration(650L);
                    Animator animatorLJIIIIZZ = c998110c53LIZ.LJIIIIZZ(false);
                    animatorLJIIIIZZ.setDuration(650L);
                    animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(animatorLJ, valueAnimatorOfInt);
                    animatorSet.playTogether(valueAnimatorOfInt, animatorLIZIZ, animatorLJIIIIZZ);
                }
                c998110c53LIZ.LJIJ = animatorSet;
                if (animatorSet != null) {
                    animatorSet.addListener(new ALAdapterS12S0100000_16(c998110c53LIZ, 16));
                }
            }
            Animator animator = c998110c53LIZ.LJIJ;
            if (animator != null) {
                animator.start();
            }
        } else {
            LIZ().LJIILIIL();
            C998110c53 c998110c53LIZ2 = LIZ();
            if (c998110c53LIZ2.LJIJI == null) {
                AbstractC997340c3o abstractC997340c3o3 = c998110c53LIZ2.LIZJ;
                AbstractC997340c3o abstractC997340c3o4 = c998110c53LIZ2.LIZLLL;
                if (abstractC997340c3o3 != null && abstractC997340c3o4 != null) {
                    int[] iArr = {c998110c53LIZ2.LJIIIIZZ, c998110c53LIZ2.LJII + c998110c53LIZ2.LJIIIZ};
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, C13LQ.LJJLIIIJ(iArr));
                    valueAnimatorOfInt2.addUpdateListener(new AUListenerS223S0200000_16(new AbstractC997340c3o[]{abstractC997340c3o3, abstractC997340c3o4}, iArr, 5));
                    valueAnimatorOfInt2.setInterpolator(C1619980sG4.LJIIJJI());
                    valueAnimatorOfInt2.setDuration(600L);
                    valueAnimatorOfInt2.addListener(new ALAdapterS6S0300000_16(c998110c53LIZ2, abstractC997340c3o3, abstractC997340c3o4, 2));
                    Animator animatorLJ2 = c998110c53LIZ2.LJ(false);
                    animatorLJ2.setDuration(200L);
                    Animator animatorLIZIZ2 = c998110c53LIZ2.LIZIZ(true);
                    animatorLIZIZ2.setDuration(650L);
                    Animator animatorLJIIIIZZ2 = c998110c53LIZ2.LJIIIIZZ(false);
                    animatorLJIIIIZZ2.setDuration(650L);
                    animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(animatorLJ2, valueAnimatorOfInt2);
                    animatorSet.playTogether(valueAnimatorOfInt2, animatorLIZIZ2, animatorLJIIIIZZ2);
                }
                c998110c53LIZ2.LJIJI = animatorSet;
                if (animatorSet != null) {
                    animatorSet.addListener(new ALAdapterS12S0100000_16(c998110c53LIZ2, 16));
                }
            }
            Animator animator2 = c998110c53LIZ2.LJIJI;
            if (animator2 != null) {
                animator2.start();
            }
            LIZIZ().LIZLLL = true;
            C1000590c93 c1000590c93LIZJ = LIZJ();
            C1000560c90.LIZ.getClass();
            c1000590c93LIZJ.logAd(C1000560c90.LIZIZ);
        }
        LIZIZ().LJ = true;
        LIZIZ().LJFF = true;
        C1000590c93 c1000590c93LIZJ2 = LIZJ();
        C1000560c90.LIZ.getClass();
        c1000590c93LIZJ2.logAd(C1000560c90.LIZLLL);
        LIZJ().logAd(C1000560c90.LJI);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC998220c5E Mh() {
        return this.LL;
    }

    public C998130c55(C998170c59 c998170c59) {
        this.LL = c998170c59;
        this.LLILZLL = c998170c59.LIZ;
        this.LLIZ = c998170c59.LIZIZ;
    }

    @Override // X.InterfaceC998200c5C
    public final void wv2(long j) {
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(this, 203);
        IVideoPlayTaskManager iVideoPlayTaskManagerLIZ = this.LL.LIZ();
        C988300bpE c988300bpE = new C988300bpE("COMMERCE_DESCRIPTIVE_CARD_FIRST_STAGE_TASK");
        c988300bpE.LIZIZ(j);
        c988300bpE.LIZJ = this.LLILZLL * LSPassThroughRecordSizeConfig.DEFAULT;
        c988300bpE.LIZLLL = aRunnableS116S0100000_16;
        c988300bpE.LJ = false;
        iVideoPlayTaskManagerLIZ.LLIFFJFJJ(c988300bpE.LIZ());
        IVideoPlayTaskManager iVideoPlayTaskManagerLIZ2 = this.LL.LIZ();
        C988300bpE c988300bpE2 = new C988300bpE("COMMERCE_DESCRIPTIVE_CARD_SECOND_STAGE_TASK");
        c988300bpE2.LIZIZ(j);
        c988300bpE2.LIZJ = this.LLIZ * LSPassThroughRecordSizeConfig.DEFAULT;
        c988300bpE2.LIZLLL = new ARunnableS116S0100000_16(this, 202);
        c988300bpE2.LJ = false;
        iVideoPlayTaskManagerLIZ2.LLIFFJFJJ(c988300bpE2.LIZ());
    }
}
