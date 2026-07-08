package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005Y, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C005Y implements InterfaceC0148002o {
    public final String LL;

    public C005Y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C005Y) && Intrinsics.LJFF(this.LL, ((C005Y) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollMemberVMState(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C005Y(int i) {
        this.LL = "";
    }
}
