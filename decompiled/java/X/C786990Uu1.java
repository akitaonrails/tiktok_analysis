package X;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.AwS22S0002000_13;
import kotlin.jvm.internal.AwS56S0001000_13;
import kotlin.jvm.internal.AwS56S0010000_13;

/* JADX INFO: renamed from: X.0Uu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786990Uu1 extends ViewOnAttachStateChangeListenerC20604515jv {
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void stopNestedScroll() {
        super.stopNestedScroll();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean startNestedScroll(int i) {
        new AwS56S0001000_13(i, 2);
        return super.startNestedScroll(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        new AwS56S0001000_13(i, 3);
        super.stopNestedScroll(i);
    }

    public C786990Uu1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        new C786980Uu0(f, f2);
        boolean zDispatchNestedPreFling = super.dispatchNestedPreFling(f, f2);
        new AwS56S0010000_13(zDispatchNestedPreFling, 2);
        return zDispatchNestedPreFling;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        new AwS22S0002000_13(i, i2, 1);
        boolean zFling = super.fling(i, i2);
        new AwS56S0010000_13(zFling, 3);
        return zFling;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, X.InterfaceC20097013kG
    public final boolean startNestedScroll(int i, int i2) {
        new AwS22S0002000_13(i, i2, 2);
        return super.startNestedScroll(i, i2);
    }

    public C786990Uu1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOverScrollMode(2);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        new C787000Uu2(f, f2, z);
        boolean zDispatchNestedFling = super.dispatchNestedFling(f, f2, z);
        new AwS56S0010000_13(zDispatchNestedFling, 1);
        return zDispatchNestedFling;
    }
}
