package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0irn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258970irn implements InterfaceC726980SfQ {
    public final LifecycleOwner LL;
    public C1259180is8 LLILLJJLI;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.getLifecycle();
    }

    public C1258970irn(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }
}
