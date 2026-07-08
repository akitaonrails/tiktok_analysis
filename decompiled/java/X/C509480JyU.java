package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509480JyU implements InterfaceC0148002o {
    public C291001Au<? extends AbstractC510000JzK> LL;

    public C509480JyU() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C509480JyU) && Intrinsics.LJFF(this.LL, ((C509480JyU) obj).LL);
    }

    public final int hashCode() {
        C291001Au<? extends AbstractC510000JzK> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivilegePageVMState(privilegeStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C509480JyU(C291001Au<? extends AbstractC510000JzK> c291001Au) {
        this.LL = c291001Au;
    }
}
