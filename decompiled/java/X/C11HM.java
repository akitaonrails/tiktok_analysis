package X;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11HM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11HM implements Observer, InterfaceC1635506an {
    public final /* synthetic */ Function1 LL;

    public C11HM(AwS608S0100000_29 awS608S0100000_29) {
        this.LL = awS608S0100000_29;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return this.LL;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.LL.invoke(obj);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Observer) || !(obj instanceof InterfaceC1635506an)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((InterfaceC1635506an) obj).getFunctionDelegate());
    }
}
