package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11HF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11HF implements InterfaceC346701Wf, InterfaceC1635506an {
    public final /* synthetic */ Function2 LL;

    public C11HF(C1055770da3 c1055770da3) {
        this.LL = c1055770da3;
    }

    @Override // X.InterfaceC346701Wf
    public final /* synthetic */ Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return this.LL.invoke(obj, interfaceC1364105Vn);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC346701Wf) && (obj instanceof InterfaceC1635506an)) {
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
