package X;

import Y.AAListenerS342S0100000_32;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.settings.ECSurpriseSetAnimDebugInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.oec_msg.CarouselCfg;

/* JADX INFO: renamed from: X.1873, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1873 extends AbstractC212220183e<FrameLayout, AnonymousClass1872> {
    public final int LJ;
    public C430270Gu1 LJFF;
    public C430270Gu1 LJI;
    public final float LJII;
    public AnimatorSet LJIIIIZZ;
    public C430280Gu2 LJIIIZ;
    public final C054G LJIIJ;
    public AnonymousClass0956 LJIIJJI;
    public final boolean LJIIL;

    public final void LJIIJJI() {
        C430270Gu1 c430270Gu1 = this.LJFF;
        if (c430270Gu1 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430270Gu1);
            c430270Gu1.setAlpha(1.0f);
        }
        C430270Gu1 c430270Gu12 = this.LJFF;
        if (c430270Gu12 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430270Gu12);
            c430270Gu12.setY(0.0f);
        }
        C430270Gu1 c430270Gu13 = this.LJI;
        if (c430270Gu13 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430270Gu13);
            c430270Gu13.setAlpha(0.0f);
        }
        C430270Gu1 c430270Gu14 = this.LJI;
        if (c430270Gu14 != null) {
            float f = this.LJII;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430270Gu14);
            c430270Gu14.setTranslationY(f);
        }
    }

    public final void LJIIL(AnonymousClass1872 anonymousClass1872) {
        int i;
        long j;
        List<Integer> list;
        C12ES.LJIILL(0, this.LIZ);
        if (this.LJI == null) {
            C430270Gu1 c430270Gu1 = new C430270Gu1(this.LJ, this.LIZLLL);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430270Gu1);
            c430270Gu1.setLayoutParams(layoutParams);
            if (this.LJIIL) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1u);
                c430270Gu1.setBackground(c384050F3z.LIZ(c430270Gu1.getContext()));
            }
            this.LJI = c430270Gu1;
            ((ViewGroup) this.LIZ).addView(c430270Gu1);
        }
        if (this.LJFF == null) {
            C430270Gu1 c430270Gu12 = new C430270Gu1(this.LJ, this.LIZLLL);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430270Gu12);
            c430270Gu12.setLayoutParams(layoutParams2);
            if (this.LJIIL) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a1x);
                c430270Gu12.setBackground(c384050F3z2.LIZ(c430270Gu12.getContext()));
            }
            this.LJFF = c430270Gu12;
            ((ViewGroup) this.LIZ).addView(c430270Gu12);
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIIJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (anonymousClass1872.LJIIIZ) {
            CarouselCfg carouselCfg = anonymousClass1872.LJIIJ;
            if (carouselCfg != null) {
                i = carouselCfg.times;
            } else {
                i = -1;
            }
            if (carouselCfg != null) {
                j = carouselCfg.intervalMs;
            } else {
                j = 2000;
            }
            if (carouselCfg != null) {
                list = carouselCfg.textStatusList;
            } else {
                list = null;
            }
            if (C756302xN.LIZ(list)) {
                this.LJIIJJI = C23250099c.LIZLLL(this.LJIIJ, null, null, new AnonymousClass1874(i, list, this, anonymousClass1872, j, null), 3);
                return;
            }
            return;
        }
        LJIILIIL(new C430280Gu2(anonymousClass1872.LIZ, anonymousClass1872.LIZIZ, anonymousClass1872.LIZJ, anonymousClass1872.LIZLLL, anonymousClass1872.LJ, anonymousClass1872.LJFF, anonymousClass1872.LJI, anonymousClass1872.LJIIIIZZ));
    }

    public final void LJIILIIL(C430280Gu2 c430280Gu2) {
        boolean z;
        boolean z2;
        C430280Gu2 c430280Gu22 = this.LJIIIZ;
        if (c430280Gu22 != null && Intrinsics.LJFF(c430280Gu22.LIZIZ, c430280Gu2.LIZIZ) && c430280Gu22.LJFF == c430280Gu2.LJFF) {
            Long l = c430280Gu22.LIZ;
            if (!Intrinsics.LJFF(l, l) && !Intrinsics.LJFF(c430280Gu22.LIZLLL, Boolean.TRUE)) {
                z = false;
            } else {
                z = true;
            }
            Long l2 = c430280Gu2.LIZ;
            if (!Intrinsics.LJFF(l2, l2) && !Intrinsics.LJFF(c430280Gu2.LIZLLL, Boolean.TRUE)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2) {
                return;
            }
        }
        if (this.LJIIIZ != null && c430280Gu2.LJII) {
            this.LJIIIZ = c430280Gu2;
            C430270Gu1 c430270Gu1 = this.LJI;
            if (c430270Gu1 != null) {
                c430270Gu1.LIZ(c430280Gu2);
            }
            this.LJIIIIZZ.cancel();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJFF, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(260L);
            objectAnimatorOfFloat.setStartDelay(320L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJFF, "translationY", 0.0f, -this.LJII);
            objectAnimatorOfFloat2.setDuration(580L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LJI, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat3.setDuration(260L);
            objectAnimatorOfFloat3.setStartDelay(320L);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LJI, "translationY", this.LJII, 0.0f);
            objectAnimatorOfFloat4.setDuration(580L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.LJIIIIZZ = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            this.LJIIIIZZ.addListener(new AAListenerS342S0100000_32(this, 6));
            this.LJIIIIZZ.start();
            return;
        }
        LJIIJJI();
        C430270Gu1 c430270Gu12 = this.LJFF;
        if (c430270Gu12 != null) {
            c430270Gu12.LIZ(c430280Gu2);
        }
        C430270Gu1 c430270Gu13 = this.LJI;
        if (c430270Gu13 != null) {
            c430270Gu13.LIZ(c430280Gu2);
        }
        this.LJIIIZ = c430280Gu2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnonymousClass1873(FrameLayout frameLayout, int i, int i2) {
        String str;
        if ((i2 & 2) != 0) {
            str = "auction_winner_info";
        } else {
            str = null;
        }
        boolean z = false;
        i = (i2 & 4) != 0 ? 0 : i;
        super(frameLayout, str);
        this.LJ = i;
        this.LJII = C418440Gaw.LIZIZ(18);
        this.LJIIIIZZ = new AnimatorSet();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJIIJ = C2296808zG.LIZ(C2107308Nj.LIZ);
        ECSurpriseSetAnimDebugInfo eCSurpriseSetAnimDebugInfoLIZ = AnonymousClass1876.LIZ();
        if (eCSurpriseSetAnimDebugInfoLIZ != null && eCSurpriseSetAnimDebugInfoLIZ.isDebug) {
            z = true;
        }
        this.LJIIL = z;
    }
}
