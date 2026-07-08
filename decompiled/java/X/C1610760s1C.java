package X;

import Y.ALAdapterS19S0100000_24;
import Y.ALAdapterS3S0101000_24;
import Y.AUListenerS272S0100000_24;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.ab.LiveEntranceAnimCurveConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0s1C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610760s1C {
    public final int LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final EnumC1609040ryQ LJFF;
    public boolean LJII;
    public AnimatorSet LJIIIIZZ;
    public ValueAnimator LJIIIZ;
    public ValueAnimator LJIIJ;
    public final Set<C1610750s1B> LIZ = Collections.synchronizedSet(new HashSet());
    public final String LJI = "tiktok_video_head";
    public final AUListenerS272S0100000_24 LJIIJJI = new AUListenerS272S0100000_24(this, 8);
    public final AUListenerS272S0100000_24 LJIIL = new AUListenerS272S0100000_24(this, 9);
    public final AUListenerS272S0100000_24 LJIILIIL = new AUListenerS272S0100000_24(this, 10);
    public final AUListenerS272S0100000_24 LJIILJJIL = new AUListenerS272S0100000_24(this, 11);
    public final AUListenerS272S0100000_24 LJIILL = new AUListenerS272S0100000_24(this, 7);

    public final void LIZIZ() {
        AnimatorSet animatorSet;
        ValueAnimator c1610820s1I;
        ValueAnimator valueAnimator;
        ValueAnimator c1610820s1I2;
        if (this.LJ || ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().p3() || C1511220pQe.LIZIZ.LIZ()) {
            return;
        }
        if (this.LJIIJ == null) {
            if (C0BKZ.LIZ() == -1) {
                int[] iArr = {0, this.LIZIZ};
                c1610820s1I2 = new C1611030s1d();
                c1610820s1I2.setIntValues(Arrays.copyOf(iArr, 2));
            } else {
                int[] iArr2 = {0, this.LIZIZ};
                c1610820s1I2 = new C1610820s1I();
                c1610820s1I2.setIntValues(Arrays.copyOf(iArr2, 2));
            }
            this.LJIIJ = c1610820s1I2;
            c1610820s1I2.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.LJIIJ;
            if (valueAnimator2 != null) {
                valueAnimator2.setRepeatMode(1);
            }
            int i = C1609050ryR.LIZ[this.LJFF.ordinal()];
            if (i == 1) {
                ValueAnimator valueAnimator3 = this.LJIIJ;
                if (valueAnimator3 != null) {
                    valueAnimator3.addUpdateListener(this.LJIILIIL);
                }
            } else if (i == 2) {
                ValueAnimator valueAnimator4 = this.LJIIJ;
                if (valueAnimator4 != null) {
                    valueAnimator4.addUpdateListener(this.LJIILL);
                }
            } else {
                if (i != 3) {
                    throw new C1954807lC();
                }
                ValueAnimator valueAnimator5 = this.LJIIJ;
                if (valueAnimator5 != null) {
                    valueAnimator5.addUpdateListener(this.LJIIJJI);
                }
            }
        }
        if (((LiveEntranceAnimCurveConfig) C1610780s1E.LIZIZ.getValue()).modifyMultiAvatarNormalAnim && (valueAnimator = this.LJIIJ) != null) {
            valueAnimator.setInterpolator(C1619980sG4.LIZLLL());
        }
        if (this.LJIIIZ == null) {
            if (C0BKZ.LIZ() == -1) {
                int[] iArr3 = {0, this.LIZIZ};
                c1610820s1I = new C1611030s1d();
                c1610820s1I.setIntValues(Arrays.copyOf(iArr3, 2));
            } else {
                int[] iArr4 = {0, this.LIZIZ};
                c1610820s1I = new C1610820s1I();
                c1610820s1I.setIntValues(Arrays.copyOf(iArr4, 2));
            }
            this.LJIIIZ = c1610820s1I;
            c1610820s1I.setRepeatCount(-1);
            ValueAnimator valueAnimator6 = this.LJIIIZ;
            if (valueAnimator6 != null) {
                valueAnimator6.setRepeatMode(1);
            }
            ValueAnimator valueAnimator7 = this.LJIIIZ;
            if (valueAnimator7 != null) {
                valueAnimator7.setDuration(this.LIZIZ);
            }
            int i2 = C1609050ryR.LIZ[this.LJFF.ordinal()];
            if (i2 == 1) {
                ValueAnimator valueAnimator8 = this.LJIIJ;
                if (valueAnimator8 != null) {
                    valueAnimator8.addUpdateListener(this.LJIILJJIL);
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new C1954807lC();
                }
                ValueAnimator valueAnimator9 = this.LJIIJ;
                if (valueAnimator9 != null) {
                    valueAnimator9.addUpdateListener(this.LJIIL);
                }
            }
            ValueAnimator valueAnimator10 = this.LJIIIZ;
            if (valueAnimator10 != null) {
                valueAnimator10.addListener(new ALAdapterS3S0101000_24(this, 0));
            }
        }
        if (this.LJIIIIZZ == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.LJIIIIZZ = animatorSet2;
            animatorSet2.setDuration(this.LIZIZ);
            AnimatorSet animatorSet3 = this.LJIIIIZZ;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new ALAdapterS19S0100000_24(this, 4));
            }
        }
        AnimatorSet animatorSet4 = this.LJIIIIZZ;
        if (animatorSet4 != null) {
            animatorSet4.play(this.LJIIJ);
        }
        this.LJII = true;
        AnimatorSet animatorSet5 = this.LJIIIIZZ;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
        for (C1610750s1B c1610750s1B : this.LIZ) {
            String str = this.LJI;
            C09JN<C1610420s0e> c09jn = c1610750s1B.LJIIIZ;
            if (c09jn != null) {
                c1610750s1B.LJIIJJI(c1610750s1B.LJIIIIZZ, c09jn, str);
            }
        }
        if (this.LIZ.isEmpty() && (animatorSet = this.LJIIIIZZ) != null && animatorSet.isRunning()) {
            animatorSet.pause();
        }
    }

    public C1610760s1C(EnumC1609040ryQ enumC1609040ryQ) {
        this.LIZIZ = 800;
        this.LIZJ = 640;
        this.LJFF = EnumC1609040ryQ.NORMAL;
        this.LJFF = enumC1609040ryQ;
        if (enumC1609040ryQ == EnumC1609040ryQ.SKYLIGHT) {
            this.LIZIZ = 2000;
            this.LIZJ = 1750;
        }
    }

    public final void LIZ(C1610750s1B c1610750s1B) {
        AnimatorSet animatorSet;
        if (this.LIZ.isEmpty() && (animatorSet = this.LJIIIIZZ) != null && animatorSet.isPaused()) {
            animatorSet.resume();
        }
        if (!this.LIZ.contains(c1610750s1B)) {
            this.LIZ.add(c1610750s1B);
        }
    }
}
