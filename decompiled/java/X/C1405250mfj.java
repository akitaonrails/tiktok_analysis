package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405250mfj implements InterfaceC1405230mfh, InterfaceC1635506an {
    public final /* synthetic */ Function1 LL;

    public C1405250mfj(Function1 function1) {
        this.LL = function1;
    }

    @Override // X.InterfaceC1405230mfh
    public final /* synthetic */ void LIZ(EnumC1404590mef enumC1404590mef) {
        this.LL.invoke(enumC1404590mef);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC1405230mfh) && (obj instanceof InterfaceC1635506an)) {
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
