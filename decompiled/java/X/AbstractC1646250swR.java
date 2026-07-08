package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0swR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1646250swR implements InterfaceC1646450swl {
    public final C1646620sx2 LL;
    public final LifecycleOwner LLILLJJLI;
    public final C1DRG LLILLL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI.getLifecycle();
    }

    @Override // X.InterfaceC1646450swl
    public final C1646620sx2 YJ1() {
        return this.LL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public AbstractC1646250swR(C1646620sx2 c1646620sx2, LifecycleOwner lifecycleOwner, C1DRG c1drg) {
        this.LL = c1646620sx2;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = c1drg;
    }
}
