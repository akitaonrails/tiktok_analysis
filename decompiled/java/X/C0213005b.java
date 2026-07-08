package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0213005b implements InterfaceC0148002o {
    public final String LL;

    public C0213005b() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0213005b) && Intrinsics.LJFF(this.LL, ((C0213005b) obj).LL);
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

    public C0213005b(int i) {
        this.LL = "";
    }
}
