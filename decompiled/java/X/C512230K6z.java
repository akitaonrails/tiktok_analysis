package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512230K6z implements InterfaceC0148002o {
    public final C291001Au<? extends C0K7H> LL;

    public C512230K6z() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C512230K6z) && Intrinsics.LJFF(this.LL, ((C512230K6z) obj).LL);
    }

    public final int hashCode() {
        C291001Au<? extends C0K7H> c291001Au = this.LL;
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

    public C512230K6z(C291001Au<? extends C0K7H> c291001Au) {
        this.LL = c291001Au;
    }
}
