package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import j27.s;

/* JADX INFO: renamed from: X.0kFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1311980kFI extends ViewGroup implements InterfaceC1311940kFE {
    public C1311970kFH LL;

    @Override // X.InterfaceC1311940kFE
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH getRenderer() {
        return this.LL;
    }

    public C1311980kFI(s sVar) {
        super(sVar);
        setWillNotDraw(false);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.LL.LIZ(canvas);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.LL.LJ(canvas);
    }

    @Override // X.InterfaceC1311940kFE
    public void setRenderer(C1311970kFH c1311970kFH) {
        this.LL = c1311970kFH;
    }

    public C1311970kFH createRenderer(PlatformRendererContext platformRendererContext, int i) {
        return new C1311970kFH(platformRendererContext, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Rect rect = this.LL.LIZ;
        setMeasuredDimension(rect.width(), rect.height());
        View view = this.LL.LJI.getView();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt instanceof InterfaceC1311940kFE) {
                    Rect rect2 = ((InterfaceC1311940kFE) childAt).getRenderer().LIZ;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(rect2.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(rect2.height(), 1073741824));
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        this.LL.LIZIZ(canvas, view);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        this.LL.getClass();
        canvas.restore();
        return zDrawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.LL.LJFF();
    }
}
