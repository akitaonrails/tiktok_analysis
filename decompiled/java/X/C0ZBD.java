package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZBD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBD implements InterfaceC1891350zJl, InterfaceC1890700zIi {
    public final Unit LL;

    public C0ZBD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZBD) && Intrinsics.LJFF(this.LL, ((C0ZBD) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return "top_place_holder";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationTopItem(mockData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C0ZBC.LIZIZ;
    }

    public C0ZBD(int i) {
        this.LL = Unit.LIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C0ZBD;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1600110rk1.LIZJ();
    }
}
