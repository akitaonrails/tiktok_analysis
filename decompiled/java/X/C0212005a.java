package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0212005a implements InterfaceC0148002o {
    public final String LL;

    public C0212005a() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0212005a) && Intrinsics.LJFF(this.LL, ((C0212005a) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemberVMState(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0212005a(int i) {
        this.LL = "";
    }
}
