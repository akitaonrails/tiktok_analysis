package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17pT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21148517pT extends AbstractC21148617pU {
    public final InterfaceC21374418ko LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21148517pT) && Intrinsics.LJFF(this.LIZ, ((C21148517pT) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Live(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21148517pT(InterfaceC21374418ko interfaceC21374418ko) {
        this.LIZ = interfaceC21374418ko;
    }
}
