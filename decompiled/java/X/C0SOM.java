package X;

import Y.ARunnableS111S0100000_11;
import Y.AUListenerS261S0100000_11;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SOM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SOM extends C21599719g3 implements InterfaceC719500SKe {
    public static final /* synthetic */ int LLZIL = 0;
    public float LLLLZI;
    public boolean LLLLZIL;
    public boolean LLLLZLL;
    public boolean LLLLZLLIL;
    public boolean LLLLZLLLI;
    public boolean LLLZ;
    public Function1<? super Boolean, Boolean> LLLZI;
    public boolean LLLZIIL;
    public List<Rect> LLLZIL;
    public final int LLLZL;
    public boolean LLLZLL;
    public boolean LLLZLZ;
    public float LLLZZ;
    public final int LLLZZIL;
    public ValueAnimator LLZ;

    @Override // X.C21600219g8, android.view.View
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    @Override // X.InterfaceC719500SKe
    public final void n5(int i, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC719500SKe
    public final void u6(SlidesImageLoadParams slidesImageLoadParams) {
    }

    public final void LJJJIL() {
        ArrayList arrayList;
        if (this.LLLZ && this.LLLZIL == null) {
            if (Build.VERSION.SDK_INT < 29) {
                arrayList = null;
            } else {
                getBottom();
                arrayList = new ArrayList();
                setSystemGestureExclusionRects(arrayList);
            }
            this.LLLZIL = arrayList;
        }
    }

    public final void LJJJI() {
        float translationX = getTranslationX();
        if (translationX == 0.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.LLZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationX, 0.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS261S0100000_11(this, 4));
        valueAnimatorOfFloat.start();
        this.LLZ = valueAnimatorOfFloat;
    }

    public final InterfaceC719460SKa getCurrentViewHolder() {
        C0SMK c0smk;
        Object adapter = getAdapter();
        if (!(adapter instanceof C0SMK) || (c0smk = (C0SMK) adapter) == null) {
            return null;
        }
        return c0smk.LJFF(getCurrentItem());
    }

    @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
    }

    public final boolean getCanBlockSystemBackGesture() {
        return this.LLLZ;
    }

    public final boolean getEnableRecordUserAction() {
        return this.LLLLZLL;
    }

    public final float getMStartDragX() {
        return this.LLLLZI;
    }

    public final Function1<Boolean, Boolean> getOnFirstPageSwipeOutIntercept() {
        return this.LLLZI;
    }

    public final boolean getSwipedRightAtFirstPosition() {
        return this.LLLLZLLIL;
    }

    private final void setPageOffsetOnTouch(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2) {
            return;
        }
        float x = motionEvent.getX();
        float fAbs = Math.abs(x - this.LLLLZI);
        int i = this.LLLZL;
        if (fAbs > i && x < this.LLLLZI) {
            setPageOffset(0.1f);
        } else {
            if (fAbs <= i || x <= this.LLLLZI) {
                return;
            }
            setPageOffset(-0.1f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    @Override // X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SOM.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLLZLL) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.LLLZLL = false;
                        this.LLLZLZ = false;
                        LJJJI();
                    }
                    return true;
                }
                float x = (motionEvent.getX() - this.LLLZZ) * 0.4f;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setTranslationX(x);
                return true;
            }
            this.LLLZLL = false;
            this.LLLZLZ = false;
            if (Math.abs(motionEvent.getX() - this.LLLZZ) > this.LLLZZIL) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setTranslationX(0.0f);
                HandlerHook.viewPost(this, new ARunnableS111S0100000_11(this, 65));
                return true;
            }
            LJJJI();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC719500SKe
    public final void p2(SlidesImageLoadParams slidesImageLoadParams) {
        if (this.LLLZIIL) {
            this.LLLZIIL = false;
        }
    }

    public final void setCanBlockSystemBackGesture(boolean z) {
        this.LLLZ = z;
    }

    public final void setEnableRecordUserAction(boolean z) {
        this.LLLLZLL = z;
    }

    public final void setMStartDragX(float f) {
        this.LLLLZI = f;
    }

    public final void setOnFirstPageSwipeOutIntercept(Function1<? super Boolean, Boolean> function1) {
        this.LLLZI = function1;
    }

    public final void setSwipedRightAtFirstPosition(boolean z) {
        this.LLLLZLLIL = z;
    }

    public final void setUnderUserAction(boolean z) {
        this.LLLLZIL = z;
    }

    public final void setWithinExclusionArea(boolean z) {
        this.LLLLZLLLI = z;
    }

    public C0SOM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLLZLL = true;
        this.LLLZIIL = true;
        this.LLLZL = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLLZZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
    }
}
