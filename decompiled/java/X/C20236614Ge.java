package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20236614Ge extends C20236514Gd {
    public int LLJ;
    public final C01GW LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public final int LLJJIII;
    public int LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    private final View getDraggableView() {
        return (View) this.LLJI.getValue();
    }

    private final Paint getIllegalLinePaint() {
        return (Paint) this.LLJJIJIL.getValue();
    }

    private final Rect getIllegalLineRect() {
        return (Rect) this.LLJJIJIIJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(boolean r9) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20236614Ge.i0(boolean):void");
    }

    @Override // X.C20236514Gd, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null && this.LLJJIJI != 0 && getHighlightRect() != null) {
            canvas.drawLine(getIllegalLineRect().left, getIllegalLineRect().top, getIllegalLineRect().right, getIllegalLineRect().bottom, getIllegalLinePaint());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View draggableView = getDraggableView();
        if (draggableView != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (!this.LLJILJIL && !super.onInterceptTouchEvent(motionEvent)) {
                                return false;
                            }
                            return true;
                        }
                    } else {
                        if (this.LLJILJIL) {
                            return true;
                        }
                        if (!this.LLJIJIL) {
                            return super.onInterceptTouchEvent(motionEvent);
                        }
                        float fAbs = Math.abs(motionEvent.getX() - this.LLJILJILJ);
                        float fAbs2 = Math.abs(motionEvent.getY() - this.LLJILLL);
                        float f = this.LLJJIII;
                        if (fAbs >= f || fAbs2 >= f) {
                            this.LLJJ = motionEvent.getX();
                            this.LLJJI = motionEvent.getY();
                            this.LLJILJIL = true;
                        }
                        if (!this.LLJILJIL && !super.onInterceptTouchEvent(motionEvent)) {
                            return false;
                        }
                        return true;
                    }
                }
                if (!this.LLJILJIL) {
                    this.LLJJI = -1.0f;
                    this.LLJJ = -1.0f;
                    this.LLJILLL = -1.0f;
                    this.LLJILJILJ = -1.0f;
                    this.LLJILJIL = false;
                    this.LLJIJIL = false;
                }
                if (!this.LLJILJIL && !super.onInterceptTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            }
            this.LLJJI = -1.0f;
            this.LLJJ = -1.0f;
            this.LLJILLL = -1.0f;
            this.LLJILJILJ = -1.0f;
            this.LLJILJIL = false;
            this.LLJIJIL = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= draggableView.getX() && x <= draggableView.getX() + draggableView.getMeasuredWidth() && y >= draggableView.getY() && y <= draggableView.getY() + draggableView.getMeasuredHeight()) {
                this.LLJILJILJ = motionEvent.getX();
                this.LLJILLL = motionEvent.getY();
                this.LLJIJIL = true;
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Rect highlightRect;
        View draggableView;
        if (this.LLJILJIL) {
            highlightRect = getHighlightRect();
        } else {
            highlightRect = null;
        }
        if (this.LLJILJIL && highlightRect != null && (draggableView = getDraggableView()) != null) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return true;
                    }
                } else {
                    float x = motionEvent.getX() - this.LLJJ;
                    float y = motionEvent.getY() - this.LLJJI;
                    float x2 = draggableView.getX() + x;
                    float f = highlightRect.left;
                    if (x2 < f) {
                        x2 = f;
                    }
                    float measuredWidth = draggableView.getMeasuredWidth() + x2;
                    int i = highlightRect.right;
                    if (measuredWidth > i) {
                        x2 = i - draggableView.getMeasuredWidth();
                    }
                    if (x2 != draggableView.getX()) {
                        C786410Ut5.Fd(draggableView, x2);
                        this.LLJJ = motionEvent.getX();
                    }
                    float y2 = draggableView.getY() + y;
                    float f2 = highlightRect.top;
                    if (y2 < f2) {
                        y2 = f2;
                    }
                    float measuredHeight = draggableView.getMeasuredHeight() + y2;
                    int i2 = highlightRect.bottom;
                    if (measuredHeight > i2) {
                        y2 = i2 - draggableView.getMeasuredHeight();
                    }
                    if (y2 != draggableView.getY()) {
                        C786410Ut5.Ld(draggableView, y2);
                        this.LLJJI = motionEvent.getY();
                    }
                    i0(true);
                    return true;
                }
            }
            this.LLJJI = -1.0f;
            this.LLJJ = -1.0f;
            this.LLJILLL = -1.0f;
            this.LLJILJILJ = -1.0f;
            this.LLJILJIL = false;
            this.LLJIJIL = false;
            i0(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public C20236614Ge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJ = -1;
        this.LLJI = C452501pT.LIZIZ(new AwS574S0100000_30(this, 62));
        this.LLJJIII = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(78));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 63));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DragChildLayout);
            this.LLJ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.DragChildLayout_dragView, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // X.C20236514Gd
    public final boolean e0(int i, Rect rect) {
        View draggableView;
        if (rect != null && !Intrinsics.LJFF(getHighlightRect(), rect) && (draggableView = getDraggableView()) != null && (draggableView.getX() != 0.0f || draggableView.getY() != 0.0f)) {
            float x = draggableView.getX();
            float f = rect.left;
            if (x < f) {
                x = f;
            }
            float measuredWidth = draggableView.getMeasuredWidth() + x;
            int i2 = rect.right;
            if (measuredWidth > i2) {
                x = i2 - draggableView.getMeasuredWidth();
            }
            if (x != draggableView.getX()) {
                C786410Ut5.Fd(draggableView, x);
            }
            float y = draggableView.getY();
            float f2 = rect.top;
            if (y < f2) {
                y = f2;
            }
            float measuredHeight = draggableView.getMeasuredHeight() + y;
            int i3 = rect.bottom;
            if (measuredHeight > i3) {
                y = i3 - draggableView.getMeasuredHeight();
            }
            if (y != draggableView.getY()) {
                C786410Ut5.Ld(draggableView, y);
            }
        }
        return super.e0(i, rect);
    }
}
