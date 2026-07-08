package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0f2V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111850f2V extends ConstraintLayout implements InterfaceC1111830f2T {
    public final C1111860f2W LL;

    @Override // X.InterfaceC1111830f2T
    public AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> getViewBinder() {
        return this.LL.LIZ;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R = this.LL.LIZ;
        if (abstractC1111810f2R != null) {
            abstractC1111810f2R.LJIIJJI().LJIIJJI.LJJIFFI(abstractC1111810f2R);
        }
        super.dispatchDraw(canvas);
        AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R2 = this.LL.LIZ;
        if (abstractC1111810f2R2 != null) {
            abstractC1111810f2R2.LJIIJJI().LJIIJJI.LJIJJLI(abstractC1111810f2R2);
        }
    }

    @Override // X.InterfaceC1111830f2T
    public void setViewBinder(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) {
        this.LL.LIZ = abstractC1111810f2R;
    }

    public C1111850f2V(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R = this.LL.LIZ;
        if (abstractC1111810f2R != null) {
            abstractC1111810f2R.LJIIJJI().LJIIJJI.LJJI(abstractC1111810f2R);
        }
        super.onMeasure(i, i2);
        this.LL.LIZ(getMeasuredHeight());
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        if (obj != null && !(obj instanceof Fragment)) {
            super.setTag(i, obj);
        }
    }

    public C1111850f2V(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new C1111860f2W();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R = this.LL.LIZ;
        if (abstractC1111810f2R != null) {
            abstractC1111810f2R.LJIIJJI().LJIIJJI.LJIJ(abstractC1111810f2R);
        }
        super.onLayout(z, i, i2, i3, i4);
        AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R2 = this.LL.LIZ;
        if (abstractC1111810f2R2 != null) {
            abstractC1111810f2R2.LJIIJJI().LJIIJJI.LJIIIIZZ(abstractC1111810f2R2);
        }
    }
}
