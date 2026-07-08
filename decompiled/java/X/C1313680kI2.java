package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0kI2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1313680kI2 extends ViewGroup implements InterfaceC1314700kJg {
    public String LL;
    public InterfaceC1314190kIr LLILLJJLI;
    public boolean LLILLL;

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        InterfaceC1314190kIr interfaceC1314190kIr = this.LLILLJJLI;
        return interfaceC1314190kIr != null ? interfaceC1314190kIr.hasOverlappingRendering() : super.hasOverlappingRendering();
    }

    public String getImpressionId() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C1313680kI2(AbstractC1317090kNX abstractC1317090kNX) {
        super(abstractC1317090kNX);
    }

    @Override // X.InterfaceC1314700kJg
    public final void bindDrawChildHook(InterfaceC1314190kIr interfaceC1314190kIr) {
        this.LLILLJJLI = interfaceC1314190kIr;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        InterfaceC1314190kIr interfaceC1314190kIr = this.LLILLJJLI;
        if (interfaceC1314190kIr != null) {
            interfaceC1314190kIr.beforeDispatchDraw(canvas);
        }
        super.dispatchDraw(canvas);
        InterfaceC1314190kIr interfaceC1314190kIr2 = this.LLILLJJLI;
        if (interfaceC1314190kIr2 != null) {
            interfaceC1314190kIr2.afterDispatchDraw(canvas);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        InterfaceC1314190kIr interfaceC1314190kIr = this.LLILLJJLI;
        if (interfaceC1314190kIr != null) {
            interfaceC1314190kIr.beforeDraw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLILLL) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setImpressionId(String str) {
        this.LL = str;
    }

    public void setNativeInteractionEnabled(boolean z) {
        this.LLILLL = z;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        InterfaceC1314190kIr interfaceC1314190kIr = this.LLILLJJLI;
        if (interfaceC1314190kIr != null) {
            return interfaceC1314190kIr.getChildDrawingOrder(i, i2);
        }
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        InterfaceC1314190kIr interfaceC1314190kIr;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (!getRootView().isLayoutRequested() && (interfaceC1314190kIr = this.LLILLJJLI) != null) {
            interfaceC1314190kIr.performMeasureChildrenUI();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zDrawChild;
        Rect rectBeforeDrawChild;
        InterfaceC1314190kIr interfaceC1314190kIr = this.LLILLJJLI;
        if (interfaceC1314190kIr != null && (rectBeforeDrawChild = interfaceC1314190kIr.beforeDrawChild(canvas, view, j)) != null) {
            canvas.save();
            canvas.clipRect(rectBeforeDrawChild);
            zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
        } else {
            zDrawChild = super.drawChild(canvas, view, j);
        }
        InterfaceC1314190kIr interfaceC1314190kIr2 = this.LLILLJJLI;
        if (interfaceC1314190kIr2 != null) {
            interfaceC1314190kIr2.afterDrawChild(canvas, view, j);
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC1314190kIr interfaceC1314190kIr;
        if (!getRootView().isLayoutRequested() && (interfaceC1314190kIr = this.LLILLJJLI) != null) {
            interfaceC1314190kIr.performLayoutChildrenUI();
        }
    }
}
