package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604620rrI extends FrameLayout {
    public AbstractC1604610rrH LL;
    public Function0<? extends AbstractC1604610rrH> LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public final C01GW LLJ;

    public C1604620rrI(Context context) {
        this(context, null, 6);
    }

    public C1604620rrI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final VelocityTracker getVelocityTracker() {
        return (VelocityTracker) this.LLJ.getValue();
    }

    public final float getYVelocity() {
        getVelocityTracker().computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
        return getVelocityTracker().getYVelocity();
    }

    public final float getDeltaX() {
        return this.LLILZLL;
    }

    public final float getDeltaY() {
        return this.LLIZ;
    }

    public final float getDownTranslationY() {
        return this.LLILZIL;
    }

    public final float getDownX() {
        return this.LLILLL;
    }

    public final float getDownY() {
        return this.LLILZ;
    }

    public final AbstractC1604610rrH getManager() {
        return this.LL;
    }

    public final Function0<AbstractC1604610rrH> getManagerProvider() {
        return this.LLILLJJLI;
    }

    public final float getMaxMoveDistance() {
        return this.LLIZLLLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(2);
        AbstractC1604610rrH abstractC1604610rrH = this.LL;
        if (abstractC1604610rrH != null && !abstractC1604610rrH.LJFF(motionEvent)) {
            return false;
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (zDispatchTouchEvent && this.LL != null && motionEvent != null && motionEvent.getAction() == 0) {
            super.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        } else {
            motionEventObtain.recycle();
        }
        if (motionEvent != null && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.LLIZLLLIL = 0.0f;
            getVelocityTracker().clear();
        }
        return zDispatchTouchEvent;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC1604610rrH abstractC1604610rrHInvoke;
        boolean zLIZIZ = false;
        if (motionEvent.getAction() == 0) {
            this.LLILLL = motionEvent.getRawX();
            this.LLILZ = motionEvent.getRawY();
            this.LLILZIL = getTranslationY();
            AbstractC1604610rrH abstractC1604610rrH = this.LL;
            if (abstractC1604610rrH == null || !abstractC1604610rrH.LIZ()) {
                Function0<? extends AbstractC1604610rrH> function0 = this.LLILLJJLI;
                if (function0 != null) {
                    abstractC1604610rrHInvoke = function0.invoke();
                } else {
                    abstractC1604610rrHInvoke = null;
                }
                setManager(abstractC1604610rrHInvoke);
            }
            getVelocityTracker().addMovement(motionEvent);
        }
        this.LLILZLL = motionEvent.getRawX() - this.LLILLL;
        float rawY = motionEvent.getRawY() - this.LLILZ;
        this.LLIZ = rawY;
        this.LLIZLLLIL = Math.max(Math.abs(rawY), this.LLIZLLLIL);
        AbstractC1604610rrH abstractC1604610rrH2 = this.LL;
        if (abstractC1604610rrH2 != null) {
            zLIZIZ = abstractC1604610rrH2.LIZIZ(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 1 && action != 3) {
            return zLIZIZ;
        }
        this.LLIZLLLIL = 0.0f;
        getVelocityTracker().clear();
        return zLIZIZ;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zLJ;
        this.LLILZLL = motionEvent.getRawX() - this.LLILLL;
        float rawY = motionEvent.getRawY() - this.LLILZ;
        this.LLIZ = rawY;
        this.LLIZLLLIL = Math.max(Math.abs(rawY), this.LLIZLLLIL);
        getVelocityTracker().addMovement(motionEvent);
        AbstractC1604610rrH abstractC1604610rrH = this.LL;
        if (abstractC1604610rrH != null) {
            zLJ = abstractC1604610rrH.LJ(motionEvent);
        } else {
            zLJ = false;
        }
        int action = motionEvent.getAction();
        if (action != 1 && action != 3) {
            return zLJ;
        }
        this.LLIZLLLIL = 0.0f;
        getVelocityTracker().clear();
        return zLJ;
    }

    public final void setDeltaX(float f) {
        this.LLILZLL = f;
    }

    public final void setDeltaY(float f) {
        this.LLIZ = f;
    }

    public final void setDownTranslationY(float f) {
        this.LLILZIL = f;
    }

    public final void setDownX(float f) {
        this.LLILLL = f;
    }

    public final void setDownY(float f) {
        this.LLILZ = f;
    }

    public final void setManager(AbstractC1604610rrH abstractC1604610rrH) {
        AbstractC1604610rrH abstractC1604610rrH2;
        if (!Intrinsics.LJFF(this.LL, abstractC1604610rrH) && (abstractC1604610rrH2 = this.LL) != null) {
            abstractC1604610rrH2.LIZJ();
        }
        this.LL = abstractC1604610rrH;
    }

    public final void setManagerProvider(Function0<? extends AbstractC1604610rrH> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setMaxMoveDistance(float f) {
        this.LLIZLLLIL = f;
    }

    public C1604620rrI(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LLJJIJIL.getValue());
        this.LLILLL = Float.MAX_VALUE;
        this.LLILZ = Float.MAX_VALUE;
        this.LLJ = C452501pT.LIZIZ(new C1604640rrK());
    }
}
