package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;

/* JADX INFO: renamed from: X.0Qnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC681090Qnb extends AbstractViewOnTouchListenerC19382810sM {
    public boolean LL = true;

    public abstract void LIZLLL(View view);

    @Override // X.AbstractViewOnTouchListenerC19382810sM
    public Animator LIZ(View view) {
        if (!this.LL) {
            return ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.5f);
        objectAnimatorOfFloat.setDuration(150L);
        return objectAnimatorOfFloat;
    }

    @Override // X.AbstractViewOnTouchListenerC19382810sM
    public final Animator LIZJ(View view) {
        if (!this.LL) {
            return ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.5f, 1.0f);
        objectAnimatorOfFloat.setDuration(150L);
        return objectAnimatorOfFloat;
    }

    @Override // X.AbstractViewOnTouchListenerC19382810sM
    public final void LIZIZ(MotionEvent motionEvent, View view) {
        boolean zLJI = MethodIDManager.LJI(71958);
        LIZLLL(view);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // X.AbstractViewOnTouchListenerC19382810sM, android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            int r2 = r5.getAction()
            r1 = 1
            if (r2 == 0) goto L19
            if (r2 == r1) goto L14
            r0 = 2
            if (r2 == r0) goto L19
            r0 = 3
            if (r2 == r0) goto L14
        Lf:
            boolean r0 = super.onTouch(r4, r5)
            return r0
        L14:
            r0 = 0
            r4.setPressed(r0)
            goto Lf
        L19:
            r4.setPressed(r1)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC681090Qnb.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
