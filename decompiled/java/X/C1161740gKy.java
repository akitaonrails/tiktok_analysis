package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161740gKy extends FrameLayout {
    public String LL;

    public void setOnRefreshListener(Function0<Unit> function0) {
    }

    public final void LIZ() {
        C1161190gK5.LIZ(this.LL);
    }

    public ViewGroup getViewGroup() {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        return new FrameLayout(C1161970gLL.LIZIZ().LIZJ());
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        super.removeViewAt(i);
    }

    public final void setNameSpace(String str) {
        this.LL = str;
    }

    public C1161740gKy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = "";
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }
}
