package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0kQ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318680kQ6 extends RecyclerView {
    public final WeakReference<s> LL;
    public final WeakReference<UIList> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final C1318690kQ7 LLILZLL;
    public Boolean LLIZ;
    public Boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        LynxLog.i("UIList", "PrivateRecyclerView onAttachedToWindow");
        super.onAttachedToWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        LynxLog.i("UIList", "PrivateRecyclerView onDetachedFromWindow");
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void computeScroll() {
        C1311400kEM gestureArenaManager;
        super.computeScroll();
        UIList uIList = this.LLILLJJLI.get();
        if (uIList == null || !uIList.isEnableNewGesture() || (gestureArenaManager = uIList.getGestureArenaManager()) == null) {
            return;
        }
        gestureArenaManager.LIZ();
    }

    public final void LIZJ(boolean z) {
        C1311380kEK c1311380kEK;
        HashSet<Integer> hashSet;
        WeakReference<s> weakReference = this.LL;
        if (weakReference != null && this.LLILLJJLI != null) {
            s sVar = weakReference.get();
            UIList uIList = this.LLILLJJLI.get();
            if (z && sVar != null && uIList != null && (c1311380kEK = sVar.LLIZLLLIL) != null && (hashSet = c1311380kEK.LJIJJ) != null) {
                hashSet.add(Integer.valueOf(uIList.getSign()));
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        UIList uIList = this.LLILLJJLI.get();
        if (uIList != null && uIList.LLLILZ) {
            if (i < 0) {
                if (uIList.LJJJ() == 0) {
                    return false;
                }
                return super.canScrollHorizontally(i);
            }
            if (i > 0) {
                if (uIList.LJJJIL() >= getAdapter().getItemCount() - 1) {
                    return false;
                }
                return super.canScrollHorizontally(i);
            }
        }
        return super.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        UIList uIList = this.LLILLJJLI.get();
        if (uIList != null && uIList.LLLILZ) {
            if (i < 0) {
                if (uIList.LJJJ() == 0) {
                    return false;
                }
                return super.canScrollVertically(i);
            }
            if (i > 0) {
                int iLJJJIL = uIList.LJJJIL();
                if (getAdapter() != null) {
                    if (iLJJJIL >= getAdapter().getItemCount() - 1) {
                        return false;
                    }
                    return super.canScrollVertically(i);
                }
            }
        }
        return super.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!this.LLILZIL) {
            super.dispatchDraw(canvas);
            return;
        }
        C1318690kQ7 c1318690kQ7 = this.LLILZLL;
        c1318690kQ7.getClass();
        Path path = new Path();
        Drawable background = getBackground();
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int width = getWidth();
        int height = getHeight();
        if (background instanceof BackgroundDrawable) {
            BackgroundDrawable backgroundDrawable = (BackgroundDrawable) background;
            RectF rectFLIZIZ = backgroundDrawable.LIZIZ();
            C1313900kIO c1313900kIO = backgroundDrawable.LJJII;
            Rect bounds = c1318690kQ7.LIZ;
            if (bounds == null) {
                bounds = background.getBounds();
            }
            RectF rectF = new RectF(bounds.left + scrollX + rectFLIZIZ.left, bounds.top + scrollY + rectFLIZIZ.top, (scrollX + bounds.right) - rectFLIZIZ.right, (scrollY + bounds.bottom) - rectFLIZIZ.bottom);
            if (c1313900kIO == null) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, C1312750kGX.LIZJ(c1313900kIO.LIZ(), rectFLIZIZ, 1.0f), Path.Direction.CW);
            }
        } else {
            Rect rect = c1318690kQ7.LIZ;
            if (rect == null) {
                rect = new Rect(0, 0, width, height);
            }
            path.addRect(new RectF(rect.left + scrollX, rect.top + scrollY, scrollX + rect.right, scrollY + rect.bottom), Path.Direction.CW);
        }
        int iSave = canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        UIList uIList = this.LLILLJJLI.get();
        if (uIList == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (uIList.isEnableNewGesture()) {
            if (Boolean.FALSE.equals(this.LLIZ)) {
                return true;
            }
            if (motionEvent.getActionMasked() == 2 && this.LLIZ != null && !this.LLJ) {
                motionEvent.setAction(0);
                this.LLJ = true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Boolean bool;
        if (this.LLJIJIL) {
            return true;
        }
        if (this.LLILZ) {
            requestDisallowInterceptTouchEvent(true);
        }
        UIList uIList = this.LLILLJJLI.get();
        if (uIList == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (uIList.isEnableNewGesture() && !uIList.mIncludeNativeGesture) {
            return false;
        }
        if (uIList.isEnableNewGesture() && (bool = this.LLIZ) != null && !bool.booleanValue() && motionEvent.getActionMasked() != 0) {
            return false;
        }
        if (uIList.isEnableNewGesture() && this.LLIZLLLIL != null && this.LLIZLLLIL.booleanValue()) {
            return this.LLIZLLLIL.booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Boolean bool;
        UIList uIList = this.LLILLJJLI.get();
        if (uIList == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.LLJI) {
            return false;
        }
        if (uIList.isEnableNewGesture() && !uIList.mIncludeNativeGesture) {
            return false;
        }
        if (uIList.isEnableNewGesture() && (bool = this.LLIZ) != null && !bool.booleanValue() && motionEvent.getActionMasked() != 0) {
            return false;
        }
        if (uIList.isEnableNewGesture() && this.LLIZLLLIL != null) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                if (motionEvent.getAction() == 2) {
                    getParent().requestDisallowInterceptTouchEvent(this.LLIZLLLIL.booleanValue());
                    boolean zBooleanValue = this.LLIZLLLIL.booleanValue();
                    if (!this.LLIZLLLIL.booleanValue()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return zBooleanValue;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.LLIZLLLIL = null;
                }
            }
        }
        if (!this.LLILLL) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setClipBounds(Rect rect) {
        if (!this.LLILZIL) {
            super.setClipBounds(rect);
        } else {
            this.LLILZLL.LIZ = rect;
        }
    }

    public C1318680kQ6(Context context, UIList uIList) {
        super(context);
        this.LLILLL = true;
        this.LLILZLL = new C1318690kQ7();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = true;
        this.LLJI = false;
        this.LLJIJIL = false;
        if (context != null && (context instanceof s)) {
            this.LL = new WeakReference<>(context);
            this.LLILLJJLI = new WeakReference<>(uIList);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        UIList uIList = this.LLILLJJLI.get();
        if (uIList == null) {
            super.fling(i, i2);
        }
        float f = uIList.LLLIILIL;
        if (f > 0.0f && f < 1.0f) {
            if (uIList.LLJJJJJIL) {
                i2 = (int) C419990GdR.LIZ(i2, (-getMaxFlingVelocity()) * uIList.LLLIILIL, getMaxFlingVelocity() * uIList.LLLIILIL);
            } else {
                i = (int) C419990GdR.LIZ(i, (-getMaxFlingVelocity()) * uIList.LLLIILIL, getMaxFlingVelocity() * uIList.LLLIILIL);
            }
        }
        return super.fling(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        WeakReference<UIList> weakReference = this.LLILLJJLI;
        if (weakReference != null && weakReference.get() != null && !this.LLILLJJLI.get().LLLILZJ && (i == 130 || i == 33)) {
            return view;
        }
        return super.focusSearch(view, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C1310360kCg c1310360kCgLJIIL;
        WeakReference<s> weakReference = this.LL;
        if (weakReference != null && weakReference.get() != null && (c1310360kCgLJIIL = this.LL.get().LJIIL()) != null && c1310360kCgLJIIL.LJ()) {
            return super.requestChildRectangleOnScreen(view, rect, false);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        boolean zDispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        LIZJ(zDispatchNestedPreScroll);
        return zDispatchNestedPreScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        boolean zDispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        LIZJ(zDispatchNestedPreScroll);
        return zDispatchNestedPreScroll;
    }
}
