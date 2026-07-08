package X;

import Y.AAListenerS278S0200000_32;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1871, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1871 extends AbstractC212220183e<FrameLayout, AnonymousClass1872> {
    public C212310186q LJ;
    public C212310186q LJFF;
    public final float LJI;
    public AnimatorSet LJII;
    public AnonymousClass1872 LJIIIIZZ;
    public final boolean LJIIIZ;

    public final void LJIIL() {
        C212310186q c212310186q = this.LJ;
        if (c212310186q != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212310186q);
            c212310186q.setAlpha(1.0f);
        }
        C212310186q c212310186q2 = this.LJ;
        if (c212310186q2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212310186q2);
            c212310186q2.setY(0.0f);
        }
        C212310186q c212310186q3 = this.LJFF;
        if (c212310186q3 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212310186q3);
            c212310186q3.setAlpha(0.0f);
        }
        C212310186q c212310186q4 = this.LJFF;
        if (c212310186q4 != null) {
            float f = this.LJI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212310186q4);
            c212310186q4.setTranslationY(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass1871(android.widget.FrameLayout r3) {
        /*
            r2 = this;
            java.lang.String r0 = "auction_winner_info"
            r2.<init>(r3, r0)
            r0 = 18
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            r2.LJI = r0
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r2.LJII = r0
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.settings.ECSurpriseSetAnimDebugInfo r0 = X.AnonymousClass1876.LIZ()
            if (r0 == 0) goto L29
            boolean r1 = r0.isDebug
            r0 = 1
            if (r1 != r0) goto L29
        L23:
            r2.LJIIIZ = r0
            X.C786410Ut5.LJJJJIZL(r3)
            return
        L29:
            r0 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1871.<init>(android.widget.FrameLayout):void");
    }

    public final void LJIILIIL(AnonymousClass1872 anonymousClass1872) {
        boolean z;
        boolean z2;
        AnonymousClass1872 anonymousClass18722;
        C12ES.LJIILL(0, this.LIZ);
        if (this.LJFF == null) {
            C212310186q c212310186q = new C212310186q(this.LIZLLL);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212310186q);
            c212310186q.setLayoutParams(layoutParams);
            if (this.LJIIIZ) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1q);
                c212310186q.setBackground(c384050F3z.LIZ(c212310186q.getContext()));
            }
            this.LJFF = c212310186q;
            ((ViewGroup) this.LIZ).addView(c212310186q);
        }
        if (this.LJ == null) {
            C212310186q c212310186q2 = new C212310186q(this.LIZLLL);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212310186q2);
            c212310186q2.setLayoutParams(layoutParams2);
            if (this.LJIIIZ) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a1o);
                c212310186q2.setBackground(c384050F3z2.LIZ(c212310186q2.getContext()));
            }
            this.LJ = c212310186q2;
            ((ViewGroup) this.LIZ).addView(c212310186q2);
        }
        AnonymousClass1872 anonymousClass18723 = this.LJIIIIZZ;
        if (anonymousClass18723 == null) {
            LJIIL();
            C212310186q c212310186q3 = this.LJ;
            if (c212310186q3 != null) {
                c212310186q3.LIZ(anonymousClass1872);
            }
            C212310186q c212310186q4 = this.LJFF;
            if (c212310186q4 != null) {
                c212310186q4.LIZ(anonymousClass1872);
            }
            this.LJIIIIZZ = anonymousClass1872;
            return;
        }
        if (Intrinsics.LJFF(anonymousClass18723.LIZIZ, anonymousClass1872.LIZIZ) && anonymousClass18723.LJFF == anonymousClass1872.LJFF) {
            Long l = anonymousClass18723.LIZ;
            if (!Intrinsics.LJFF(l, l) && !Intrinsics.LJFF(anonymousClass18723.LIZLLL, Boolean.TRUE)) {
                z = false;
            } else {
                z = true;
            }
            Long l2 = anonymousClass1872.LIZ;
            if (!Intrinsics.LJFF(l2, l2) && !Intrinsics.LJFF(anonymousClass1872.LIZLLL, Boolean.TRUE)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z == z2 && (anonymousClass18722 = this.LJIIIIZZ) != null && LJIIJJI(anonymousClass18722, anonymousClass1872)) {
                return;
            }
        }
        AnonymousClass1872 anonymousClass18724 = this.LJIIIIZZ;
        if (anonymousClass18724 != null && !LJIIJJI(anonymousClass18724, anonymousClass1872)) {
            anonymousClass1872.LJIIIIZZ = false;
            C212310186q c212310186q5 = this.LJFF;
            if (c212310186q5 != null) {
                c212310186q5.LIZ(anonymousClass1872);
            }
            this.LJII.cancel();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJ, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(260L);
            objectAnimatorOfFloat.setStartDelay(320L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJ, "translationY", 0.0f, -this.LJI);
            objectAnimatorOfFloat2.setDuration(580L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LJFF, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat3.setDuration(260L);
            objectAnimatorOfFloat3.setStartDelay(320L);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LJFF, "translationY", this.LJI, 0.0f);
            objectAnimatorOfFloat4.setDuration(580L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.LJII = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            this.LJII.addListener(new AAListenerS278S0200000_32(this, anonymousClass1872, 5));
            this.LJII.start();
        } else {
            this.LJII.cancel();
            C212310186q c212310186q6 = this.LJ;
            if (c212310186q6 != null) {
                c212310186q6.LIZ(anonymousClass1872);
            }
            C212310186q c212310186q7 = this.LJFF;
            if (c212310186q7 != null) {
                c212310186q7.LIZ(anonymousClass1872);
            }
        }
        this.LJIIIIZZ = anonymousClass1872;
    }

    public static boolean LJIIJJI(AnonymousClass1872 anonymousClass1872, AnonymousClass1872 anonymousClass18722) {
        String str;
        String str2;
        String str3;
        C212294186a c212294186a = anonymousClass1872.LJII;
        String str4 = null;
        if (c212294186a != null) {
            str = c212294186a.LIZ;
        } else {
            str = null;
        }
        C212294186a c212294186a2 = anonymousClass18722.LJII;
        if (c212294186a2 != null) {
            str2 = c212294186a2.LIZ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2)) {
            C212294186a c212294186a3 = anonymousClass1872.LJII;
            if (c212294186a3 != null) {
                str3 = c212294186a3.LIZIZ;
            } else {
                str3 = null;
            }
            C212294186a c212294186a4 = anonymousClass18722.LJII;
            if (c212294186a4 != null) {
                str4 = c212294186a4.LIZIZ;
            }
            if (Intrinsics.LJFF(str3, str4)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
