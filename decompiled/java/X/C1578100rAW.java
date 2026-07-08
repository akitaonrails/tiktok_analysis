package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0rAW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578100rAW implements InterfaceC20660715sz {
    public static volatile C1578100rAW LLILLL;
    public final C19EG LL;
    public final LifecycleOwner LLILLJJLI;

    @Override // X.InterfaceC20660715sz
    public final boolean t2() {
        return false;
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return this.LL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(this.LL, this.LLILLJJLI, null);
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return C634060Otw.LIZ(this);
    }

    public C1578100rAW(C19EG c19eg, LifecycleOwner lifecycleOwner) {
        this.LL = c19eg;
        this.LLILLJJLI = lifecycleOwner;
    }
}
