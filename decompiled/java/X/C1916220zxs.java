package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916220zxs implements C100F, InterfaceC1635506an {
    public final /* synthetic */ Function1 LL;

    public C1916220zxs(AwS392S0200000_26 awS392S0200000_26) {
        this.LL = awS392S0200000_26;
    }

    @Override // X.C100F
    public final /* synthetic */ void LIZIZ(boolean z) {
        this.LL.invoke(Boolean.valueOf(z));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C100F) && (obj instanceof InterfaceC1635506an)) {
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
}
