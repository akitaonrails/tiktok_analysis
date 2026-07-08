package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.10dQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class GestureDetectorOnGestureListenerC19290210dQ extends FrameLayout implements GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, GestureDetector.OnDoubleTapListener {
    public final ImageView LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    private final AnimatorSet getFocusIconAnimator() {
        return (AnimatorSet) this.LLILZLL.getValue();
    }

    private final C19290410dS getGestureDetector() {
        return (C19290410dS) this.LLILLL.getValue();
    }

    private final ScaleGestureDetector getScaleGestureDetector() {
        return (ScaleGestureDetector) this.LLILLJJLI.getValue();
    }

    public final List<GestureDetector.SimpleOnGestureListener> getGestureListeners() {
        return (List) this.LLILZ.getValue();
    }

    public final List<ScaleGestureDetector.OnScaleGestureListener> getScaleGestureListeners() {
        return (List) this.LLILZIL.getValue();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        Object c098200Yq;
        try {
            Iterator<GestureDetector.SimpleOnGestureListener> it2 = getGestureListeners().iterator();
            while (it2.hasNext()) {
                if (it2.next().onDoubleTap(motionEvent)) {
                    return true;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        Object c098200Yq;
        try {
            Iterator<GestureDetector.SimpleOnGestureListener> it2 = getGestureListeners().iterator();
            while (it2.hasNext()) {
                if (it2.next().onDoubleTapEvent(motionEvent)) {
                    return true;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        Object c098200Yq;
        try {
            Iterator<ScaleGestureDetector.OnScaleGestureListener> it2 = getScaleGestureListeners().iterator();
            while (it2.hasNext()) {
                if (it2.next().onScale(scaleGestureDetector)) {
                    return true;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        Object c098200Yq;
        try {
            Iterator<ScaleGestureDetector.OnScaleGestureListener> it2 = getScaleGestureListeners().iterator();
            while (it2.hasNext()) {
                if (it2.next().onScaleBegin(scaleGestureDetector)) {
                    return true;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        try {
            Iterator<ScaleGestureDetector.OnScaleGestureListener> it2 = getScaleGestureListeners().iterator();
            while (it2.hasNext()) {
                it2.next().onScaleEnd(scaleGestureDetector);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Object c098200Yq;
        try {
            Iterator<GestureDetector.SimpleOnGestureListener> it2 = getGestureListeners().iterator();
            while (it2.hasNext()) {
                if (it2.next().onSingleTapConfirmed(motionEvent)) {
                    return true;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        Object c098200Yq;
        try {
            Iterator<GestureDetector.SimpleOnGestureListener> it2 = getGestureListeners().iterator();
            while (it2.hasNext()) {
                if (it2.next().onSingleTapUp(motionEvent)) {
                    return true;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        getScaleGestureDetector().onTouchEvent(motionEvent);
        return getGestureDetector().LIZ(motionEvent);
    }

    public GestureDetectorOnGestureListenerC19290210dQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.bsu);
        C339190DRl.LIZIZ(imageView);
        this.LL = imageView;
        addView(imageView, new FrameLayout.LayoutParams(0, 0));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS429S0200000_28(context, this, 158));
        this.LLILLL = C452501pT.LIZIZ(new AwS429S0200000_28(context, this, 157));
        this.LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(719));
        this.LLILZIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(720));
        this.LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1493));
    }

    public final void LIZ(int i, int i2, View view) {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = this.LL.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = null;
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        ImageView imageView = this.LL;
        if (layoutParams != null) {
            int iLIZJ = (int) C12ES.LIZJ(65.0f, getContext());
            layoutParams.width = iLIZJ;
            layoutParams.height = iLIZJ;
            layoutParams.leftMargin = (int) (i - (C12ES.LIZJ(65.0f, getContext()) / 2));
            if (getLayoutDirection() == 1) {
                layoutParams.rightMargin = (getWidth() - layoutParams.leftMargin) - iLIZJ;
            }
            layoutParams.topMargin = i2 - (((int) C12ES.LIZJ(65.0f, getContext())) / 2);
            if (layoutParams.leftMargin > getWidth() - iLIZJ) {
                layoutParams.leftMargin = getWidth() - iLIZJ;
            }
            if (getLayoutDirection() == 1 && layoutParams.rightMargin > view.getWidth() - iLIZJ) {
                layoutParams.rightMargin = view.getWidth() - iLIZJ;
            }
            if (layoutParams.leftMargin < 0) {
                layoutParams.leftMargin = 0;
            }
            if (getLayoutDirection() == 1 && layoutParams.rightMargin < 0) {
                layoutParams.rightMargin = 0;
            }
            if (layoutParams.topMargin > view.getHeight() - iLIZJ) {
                layoutParams.topMargin = view.getHeight() - iLIZJ;
            }
            if (layoutParams.topMargin < 0) {
                layoutParams.topMargin = 0;
            }
            layoutParams3 = layoutParams;
        }
        C786410Ut5.c6(imageView, layoutParams3);
        getFocusIconAnimator().start();
    }
}
