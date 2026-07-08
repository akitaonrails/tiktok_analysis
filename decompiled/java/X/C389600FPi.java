package X;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389600FPi implements Observer, InterfaceC1635506an {
    public final /* synthetic */ Function1 LL;

    public C389600FPi(C228900uV c228900uV) {
        this.LL = c228900uV;
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
