package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866730XzL {
    public final InterfaceC866920Xze LIZ;
    public final InterfaceC866920Xze LIZIZ;
    public final InterfaceC867280Y0o LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C866730XzL)) {
            return false;
        }
        C866730XzL c866730XzL = (C866730XzL) obj;
        return Intrinsics.LJFF(this.LIZ, c866730XzL.LIZ) && Intrinsics.LJFF(this.LIZIZ, c866730XzL.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c866730XzL.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalRegistration(conversationSubscription=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", memberSubscription=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", queryLegacyAdapter=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C866730XzL(InterfaceC866920Xze interfaceC866920Xze, InterfaceC866920Xze interfaceC866920Xze2, C866840XzW c866840XzW) {
        this.LIZ = interfaceC866920Xze;
        this.LIZIZ = interfaceC866920Xze2;
        this.LIZJ = c866840XzW;
    }
}
