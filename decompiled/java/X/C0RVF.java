package X;

import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;

/* JADX INFO: renamed from: X.0RVF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RVF implements C0ST4 {
    public ValueAnimator LIZ;
    public Integer LIZIZ;
    public Float LIZJ;
    public final /* synthetic */ C0RVE LIZLLL;

    @Override // X.C0ST4
    public final void LIZIZ(int i) {
    }

    public C0RVF(C0RVE c0rve) {
        this.LIZLLL = c0rve;
    }

    @Override // X.C0ST4
    public final void LIZ(int i) {
        if (i == this.LIZLLL.LJ()) {
            ValueAnimator valueAnimator = this.LIZ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LIZIZ = null;
            this.LIZJ = null;
        }
    }

    public final void LIZLLL(float f, int i) {
        this.LIZIZ = Integer.valueOf(i);
        this.LIZJ = Float.valueOf(f);
        C0RVE c0rve = this.LIZLLL;
        ISlideIndicatorAbility iSlideIndicatorAbilityInvoke = c0rve.LJ.invoke();
        if (iSlideIndicatorAbilityInvoke != null) {
            iSlideIndicatorAbilityInvoke.Od(f, i);
        }
        BottomSlideIndicatorAbility bottomSlideIndicatorAbilityInvoke = c0rve.LJFF.invoke();
        if (bottomSlideIndicatorAbilityInvoke != null) {
            bottomSlideIndicatorAbilityInvoke.Od(f, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r4 >= 0.95f) goto L20;
     */
    @Override // X.C0ST4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(final int r6, long r7, long r9) {
        /*
            r5 = this;
            X.0RVE r0 = r5.LIZLLL
            int r0 = r0.LJ()
            if (r6 == r0) goto L9
            return
        L9:
            float r1 = (float) r7     // Catch: java.lang.Throwable -> L14
            float r0 = (float) r9     // Catch: java.lang.Throwable -> L14
            float r1 = r1 / r0
            java.lang.Float r2 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Throwable -> L14
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L14
            goto L20
        L14:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L20:
            boolean r1 = X.C189200o6.m7isFailureimpl(r2)
            r0 = 0
            if (r1 == 0) goto L28
            r2 = r0
        L28:
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 != 0) goto L2d
            return
        L2d:
            float r0 = r2.floatValue()
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L56
            float r0 = r2.floatValue()
            r4 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L4b
            float r4 = r2.floatValue()
            r0 = 1064514355(0x3f733333, float:0.95)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L56
        L4b:
            android.animation.ValueAnimator r0 = r5.LIZ
            if (r0 == 0) goto L52
            r0.cancel()
        L52:
            r5.LIZLLL(r4, r6)
            return
        L56:
            android.animation.ValueAnimator r0 = r5.LIZ
            if (r0 == 0) goto L5d
            r0.cancel()
        L5d:
            java.lang.Integer r0 = r5.LIZIZ
            if (r0 == 0) goto La1
            int r0 = r0.intValue()
            if (r6 != r0) goto La1
            java.lang.Float r3 = r5.LIZJ
            if (r3 == 0) goto La1
            float r0 = r3.floatValue()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto La1
            r0 = 2
            float[] r2 = new float[r0]
            r1 = 0
            float r0 = r3.floatValue()
            r2[r1] = r0
            r0 = 1
            r2[r0] = r4
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r2)
            X.0RVE r2 = r5.LIZLLL
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r3.setInterpolator(r0)
            r0 = 280(0x118, double:1.383E-321)
            r3.setDuration(r0)
            X.0RVG r0 = new X.0RVG
            r0.<init>()
            r3.addUpdateListener(r0)
            r5.LIZ = r3
            r3.start()
            return
        La1:
            r5.LIZLLL(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RVF.LIZJ(int, long, long):void");
    }
}
