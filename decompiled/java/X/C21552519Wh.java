package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.19Wh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21552519Wh extends ListView {
    public final Rect LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public C16GE LLIZ;
    public boolean LLIZLLLIL;
    public final boolean LLJ;
    public boolean LLJI;
    public C19XD LLJIJIL;
    public RunnableC21554319Wz LLJILJIL;

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLJILJIL = null;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.LLJILJIL != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.LLJI && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.LLJ || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.LLJ || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.LLJ || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.LLJ && this.LLIZLLLIL) || super.isInTouchMode();
    }

    private void setSelectorEnabled(boolean z) {
        C16GE c16ge = this.LLIZ;
        if (c16ge != null) {
            c16ge.LLILLJJLI = z;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.LL.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.LL);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.LLJILJIL == null) {
            RunnableC21554319Wz runnableC21554319Wz = new RunnableC21554319Wz(this);
            this.LLJILJIL = runnableC21554319Wz;
            post(runnableC21554319Wz);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i >= 30 && C147O.LIZLLL) {
                        try {
                            C147O.LIZ.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            C147O.LIZIZ.invoke(this, Integer.valueOf(iPointToPosition));
                            C147O.LIZJ.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e) {
                            TryCatchGuardChecker.doCheck(e);
                        } catch (InvocationTargetException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } else {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.LLJI && isPressed()) {
                    selector.setState(getDrawableState());
                    return zOnHoverEvent;
                }
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LLILZLL = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC21554319Wz runnableC21554319Wz = this.LLJILJIL;
        if (runnableC21554319Wz != null) {
            C21552519Wh c21552519Wh = runnableC21554319Wz.LL;
            c21552519Wh.LLJILJIL = null;
            c21552519Wh.removeCallbacks(runnableC21554319Wz);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.LLIZLLLIL = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C16GE c16ge;
        if (drawable != null) {
            c16ge = new C16GE(drawable);
        } else {
            c16ge = null;
        }
        this.LLIZ = c16ge;
        super.setSelector(c16ge);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.LLILLJJLI = rect.left;
        this.LLILLL = rect.top;
        this.LLILZ = rect.right;
        this.LLILZIL = rect.bottom;
    }

    public C21552519Wh(Context context, boolean z) {
        super(context, null, R.attr.bpq);
        this.LL = new Rect();
        this.LLILLJJLI = 0;
        this.LLILLL = 0;
        this.LLILZ = 0;
        this.LLILZIL = 0;
        this.LLJ = z;
        setCacheColorHint(0);
    }

    public final int LIZ(int i, int i2) {
        int iMakeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                C786410Ut5.W5(view, layoutParams);
            }
            int i5 = layoutParams.height;
            if (i5 > 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, iMakeMeasureSpec);
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f A[PHI: r4
      0x000f: PHI (r4v7 boolean) = (r4v3 boolean), (r4v1 boolean), (r4v4 boolean), (r4v9 boolean) binds: [B:74:0x0150, B:21:0x0040, B:25:0x005b, B:8:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(android.view.MotionEvent r15, int r16) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21552519Wh.LIZIZ(android.view.MotionEvent, int):boolean");
    }
}
