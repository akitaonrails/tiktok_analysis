package X;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S85, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S85 implements Observer, InterfaceC1635506an {
    public final /* synthetic */ Function1 LL;

    public C0S85(AwS377S0200000_11 awS377S0200000_11) {
        this.LL = awS377S0200000_11;
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
