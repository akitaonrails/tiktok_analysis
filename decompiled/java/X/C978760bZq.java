package X;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS102S0110000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bZq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978760bZq implements Observer, InterfaceC1635506an {
    public final /* synthetic */ Function1 LL;

    public C978760bZq(AwS102S0110000_15 awS102S0110000_15) {
        this.LL = awS102S0110000_15;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return this.LL;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.LL.invoke(obj);
    }
}
