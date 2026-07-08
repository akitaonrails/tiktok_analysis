package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.06OB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06OB extends LinearLayout implements InterfaceC1632106aF, GenericLifecycleObserver {
    public final InterfaceC1632106aF LL;

    @Override // X.InterfaceC1632106aF
    public final void LJIILIIL() {
        this.LL.LJIILIIL();
    }

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public C06OB(Context context, AttributeSet attributeSet) {
        C1631706aB c1631706aB = new C1631706aB();
        super(context, attributeSet, 0);
        this.LL = c1631706aB;
    }
}
