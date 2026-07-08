package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06de, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1653206de implements InterfaceC346701Wf, InterfaceC1635506an {
    public final /* synthetic */ Function2 LL;

    public C1653206de(Function2 function2) {
        this.LL = function2;
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
