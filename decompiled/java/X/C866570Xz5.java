package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866570Xz5 {
    public final InterfaceC866920Xze LIZ;
    public final InterfaceC866920Xze LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C866570Xz5)) {
            return false;
        }
        C866570Xz5 c866570Xz5 = (C866570Xz5) obj;
        return Intrinsics.LJFF(this.LIZ, c866570Xz5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c866570Xz5.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerConversationRegistration(conversationSubscription=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", memberSubscription=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C866570Xz5(InterfaceC866920Xze interfaceC866920Xze, InterfaceC866920Xze interfaceC866920Xze2) {
        this.LIZ = interfaceC866920Xze;
        this.LIZIZ = interfaceC866920Xze2;
    }
}
