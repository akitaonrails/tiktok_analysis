package X;

import Y.ALAdapterS26S0100000_32;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.provider.Settings;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.195F, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C195F {
    public final Animation LIZ;
    public final Animator LIZIZ;
    public C195H LIZJ;

    public final void LIZJ() {
        Animation animation = this.LIZ;
        if (animation == null) {
            Animator animator = this.LIZIZ;
            if (animator != null) {
                animator.end();
                return;
            }
            return;
        }
        animation.cancel();
        this.LIZ.reset();
        C195H c195h = this.LIZJ;
        if (c195h == null || c195h.LIZIZ) {
            return;
        }
        c195h.LIZIZ = true;
        c195h.LIZ.run();
    }

    public final long LIZLLL() {
        Animation animation = this.LIZ;
        if (animation != null) {
            return animation.getDuration();
        }
        Animator animator = this.LIZIZ;
        if (animator != null) {
            return animator.getDuration();
        }
        throw new IllegalStateException("Animation or Animator not found");
    }

    public final void LJFF() {
        Animation animation = this.LIZ;
        if (animation != null) {
            LJI(animation);
            return;
        }
        Animator animator = this.LIZIZ;
        if (animator == null || !(animator instanceof ValueAnimator)) {
            return;
        }
        ((ValueAnimator) animator).reverse();
    }

    public C195F(Animator animator) {
        this.LIZIZ = animator;
    }

    public static void LJI(Animation animation) {
        Interpolator interpolator = animation.getInterpolator();
        if (interpolator != null) {
            if (interpolator instanceof C195G) {
                animation.setInterpolator(((C195G) interpolator).LIZ);
            } else {
                animation.setInterpolator(new C195G(interpolator));
            }
        } else {
            animation.setInterpolator(new C195G());
        }
        if (animation instanceof AnimationSet) {
            List<Animation> animations = ((AnimationSet) animation).getAnimations();
            for (int i = 0; i < animations.size(); i++) {
                LJI((Animation) ListProtector.get(animations, i));
            }
        }
    }

    public final void LIZ(Runnable runnable) {
        this.LIZJ = new C195H(runnable);
        Animation animation = this.LIZ;
        if (animation != null) {
            animation.setAnimationListener(new C19LR(this, 9));
            return;
        }
        Animator animator = this.LIZIZ;
        if (animator == null) {
            return;
        }
        animator.addListener(new ALAdapterS26S0100000_32(this, 25));
    }

    public final void LIZIZ(View view) {
        if (this.LIZ != null) {
            float fMax = Math.max(0.0f, Settings.Global.getFloat(view.getContext().getContentResolver(), "transition_animation_scale", 1.0f));
            if (fMax == 1.0f) {
                return;
            }
            this.LIZ.scaleCurrentDuration(fMax);
        }
    }

    public final void LJII(View view) {
        Animation animation = this.LIZ;
        if (animation != null) {
            view.startAnimation(animation);
            return;
        }
        Animator animator = this.LIZIZ;
        if (animator == null) {
            return;
        }
        animator.setTarget(view);
        this.LIZIZ.start();
    }

    public C195F(Animation animation) {
        this.LIZ = animation;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: RuntimeException -> 0x0032, TryCatch #0 {RuntimeException -> 0x0032, blocks: (B:13:0x0026, B:15:0x002c), top: B:27:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C195F LJ(int r3, android.app.Activity r4) {
        /*
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = r0.getResourceTypeName(r3)
            java.lang.String r0 = "anim"
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L26
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r4, r3)     // Catch: java.lang.RuntimeException -> L1c android.content.res.Resources.NotFoundException -> L21
            if (r1 == 0) goto L44
            X.195F r0 = new X.195F     // Catch: java.lang.RuntimeException -> L1c android.content.res.Resources.NotFoundException -> L21
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L1c android.content.res.Resources.NotFoundException -> L21
            return r0
        L1c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L26
        L21:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L26:
            android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r4, r3)     // Catch: java.lang.RuntimeException -> L32
            if (r1 == 0) goto L44
            X.195F r0 = new X.195F     // Catch: java.lang.RuntimeException -> L32
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L32
            return r0
        L32:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r2 != 0) goto L4c
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r4, r3)
            if (r1 == 0) goto L44
            X.195F r0 = new X.195F
            r0.<init>(r1)
            return r0
        L44:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "resource is error"
            r1.<init>(r0)
            throw r1
        L4c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195F.LJ(int, android.app.Activity):X.195F");
    }
}
