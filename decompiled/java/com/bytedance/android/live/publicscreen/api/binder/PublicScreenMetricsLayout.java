package com.bytedance.android.live.publicscreen.api.binder;

import X.AbstractC1111020f1A;
import X.AbstractC1111810f2R;
import X.C1111860f2W;
import X.InterfaceC1111830f2T;
import X.InterfaceC1112060f2q;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes18.dex */
public final class PublicScreenMetricsLayout extends FrameLayout implements InterfaceC1111830f2T {
    public final C1111860f2W LL;

    public PublicScreenMetricsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.InterfaceC1111830f2T
    public AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> getViewBinder() {
        return this.LL.LIZ;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
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

    @Override // android.widget.FrameLayout, android.view.View
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

    public PublicScreenMetricsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = new C1111860f2W();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
