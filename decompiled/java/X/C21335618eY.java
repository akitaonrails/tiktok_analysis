package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.render.render.bindinfo.MynaBindForConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.18eY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21335618eY extends ViewGroup {
    public C21335518eX LL;

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final void measureChildren(int i, int i2) {
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final C21335518eX getViewManager() {
        C21335518eX c21335518eX = this.LL;
        if (c21335518eX != null) {
            return c21335518eX;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewManager().LJLLL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewManager().LL();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        getViewManager().LJLLL();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        getViewManager().LL();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!isLayoutRequested()) {
            super.requestLayout();
            if (this.LL != null && (getChildCount() > 0 || getViewManager().LLIIII())) {
                getViewManager().LJZ();
            }
        }
        invalidate();
    }

    public C21335618eY(Context context) {
        super(context, null, 0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (getImportantForAutofill() == 0) {
                setImportantForAutofill(1);
            }
            if (i >= 30 && getImportantForContentCapture() == 0) {
                setImportantForContentCapture(1);
            }
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        getViewManager().LJJ(canvas);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C21335518eX viewManager = getViewManager();
        List<? extends InterfaceC21337118en> list = viewManager.v;
        if (list != null) {
            Iterator<? extends InterfaceC21337118en> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ() == drawable) {
                    viewManager.LJJJJJL();
                    return;
                }
            }
        }
        List<? extends InterfaceC21337118en> list2 = viewManager.z;
        if (list2 != null) {
            Iterator<? extends InterfaceC21337118en> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (it3.next().LIZ() == drawable) {
                    viewManager.LJJJJJL();
                    return;
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            C21335518eX viewManager = getViewManager();
            if (viewManager.u || (viewManager.A && viewManager.y)) {
                final C21335518eX viewManager2 = getViewManager();
                GestureDetector gestureDetector = viewManager2.U;
                if (gestureDetector == null) {
                    gestureDetector = new GestureDetector(viewManager2.LJJIJLIJ(), new C21648719nx() { // from class: X.18ev
                        @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                        public final boolean onDown(MotionEvent motionEvent2) {
                            Spannable spannable;
                            if (motionEvent2 == null) {
                                return false;
                            }
                            viewManager2.getClass();
                            C21335518eX c21335518eX = viewManager2;
                            CharSequence charSequence = c21335518eX.G;
                            if (charSequence instanceof Spannable) {
                                spannable = (Spannable) charSequence;
                            } else {
                                spannable = null;
                            }
                            C21338018ew c21338018ewLLFF = c21335518eX.LLFF(motionEvent2, spannable);
                            if (c21338018ewLLFF == null) {
                                return false;
                            }
                            if (c21338018ewLLFF.LLILLJJLI == null && c21338018ewLLFF.LLILZIL == null) {
                                return false;
                            }
                            return true;
                        }

                        @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                        public final void onLongPress(MotionEvent motionEvent2) {
                            Spannable spannable;
                            MynaBindForConfig mynaBindForConfig;
                            if (motionEvent2 == null) {
                                return;
                            }
                            C21335518eX c21335518eX = viewManager2;
                            CharSequence charSequence = c21335518eX.G;
                            if (charSequence instanceof Spannable) {
                                spannable = (Spannable) charSequence;
                            } else {
                                spannable = null;
                            }
                            C21338018ew c21338018ewLLFF = c21335518eX.LLFF(motionEvent2, spannable);
                            if (c21338018ewLLFF != null && c21338018ewLLFF.LLILZIL != null) {
                                viewManager2.getView().performHapticFeedback(0);
                                viewManager2.getView();
                                InterfaceC1547330qMt interfaceC1547330qMt = c21338018ewLLFF.LLILZIL;
                                if (interfaceC1547330qMt != null) {
                                    AbstractC21333318eB<?> abstractC21333318eB = c21338018ewLLFF.LL;
                                    C21325918cz c21325918cz = abstractC21333318eB.LL;
                                    View view = abstractC21333318eB.getView();
                                    C21329618da c21329618da = c21338018ewLLFF.LLILLL;
                                    C21330518dj c21330518dj = c21338018ewLLFF.LLILZ;
                                    Map<String, ? extends Object> mapLIZJ = c21338018ewLLFF.LLILZLL;
                                    if (c21329618da != null && (mynaBindForConfig = c21329618da.LJ) != null) {
                                        mapLIZJ = C21330418di.LIZJ(mapLIZJ, mynaBindForConfig, c21330518dj);
                                    }
                                    c21325918cz.LJ(interfaceC1547330qMt, view, mapLIZJ, null);
                                    return;
                                }
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                viewManager2.getView().performLongClick(motionEvent2.getX(), motionEvent2.getY());
                            } else {
                                viewManager2.getView().performLongClick();
                            }
                        }

                        @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                        public final boolean onSingleTapConfirmed(MotionEvent motionEvent2) {
                            Spannable spannable;
                            if (motionEvent2 == null) {
                                return false;
                            }
                            C21335518eX c21335518eX = viewManager2;
                            CharSequence charSequence = c21335518eX.G;
                            InterfaceC1547330qMt interfaceC1547330qMt = null;
                            if (charSequence instanceof Spannable) {
                                spannable = (Spannable) charSequence;
                            } else {
                                spannable = null;
                            }
                            C21338018ew c21338018ewLLFF = c21335518eX.LLFF(motionEvent2, spannable);
                            if (c21338018ewLLFF != null) {
                                interfaceC1547330qMt = c21338018ewLLFF.LLILLJJLI;
                            }
                            if (interfaceC1547330qMt != null) {
                                c21338018ewLLFF.onClick(viewManager2.getView());
                                return true;
                            }
                            if (!viewManager2.getView().hasOnClickListeners()) {
                                return false;
                            }
                            viewManager2.getView().performClick();
                            return true;
                        }
                    });
                    viewManager2.U = gestureDetector;
                }
                return gestureDetector.onTouchEvent(motionEvent);
            }
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1325860kbg.LJFF(th, "myna text onTouchEvent method happen exception");
            return super.onTouchEvent(motionEvent);
        }
    }

    public final void setViewManager(C21335518eX c21335518eX) {
        this.LL = c21335518eX;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (getViewManager().LLIIIILZ(drawable)) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }

    public final boolean LIZ(Canvas canvas, View view) {
        return drawChild(canvas, view, getDrawingTime());
    }

    public final void LIZIZ(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (rect != null) {
            rect.set(getLeft(), getTop(), getRight(), getBottom());
        }
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C21335518eX viewManager = getViewManager();
        C21335518eX viewManager2 = getViewManager();
        viewManager.LLD(i, i2, viewManager2.LLFII() + Math.round(viewManager2.LLILZLL.getLayoutPadding(EnumC1321440kUY.RIGHT)) + viewManager2.LLFFF(), getViewManager().LLII());
        setMeasuredDimension(getViewManager().D, getViewManager().E);
    }
}
