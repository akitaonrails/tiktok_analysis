package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zZI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900980zZI implements InterfaceC1891350zJl, InterfaceC1890700zIi {
    public final Function0<Unit> LL;
    public final EnumC1906270zhp LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1900980zZI)) {
            return false;
        }
        C1900980zZI c1900980zZI = (C1900980zZI) obj;
        return Intrinsics.LJFF(this.LL, c1900980zZI.LL) && this.LLILLJJLI == c1900980zZI.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationErrorStatusItem(retry=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", scenario=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return this.LLILLJJLI.name();
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C0ZBC.LIZIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1900980zZI;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1600110rk1.LIZJ();
    }

    public C1900980zZI(Function0<Unit> function0, EnumC1906270zhp enumC1906270zhp) {
        this.LL = function0;
        this.LLILLJJLI = enumC1906270zhp;
    }
}
