package X;

import android.os.Bundle;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iJH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1237570iJH implements Observer, InterfaceC1635506an {
    public final /* synthetic */ AbstractActivityC1237560iJG LL;

    public C1237570iJH(AbstractActivityC1237560iJG abstractActivityC1237560iJG) {
        this.LL = abstractActivityC1237560iJG;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, AbstractActivityC1237560iJG.class, "handleSuccess", "handleSuccess(Landroid/os/Bundle;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.LL.LLLLZLLLI((Bundle) obj);
    }
}
