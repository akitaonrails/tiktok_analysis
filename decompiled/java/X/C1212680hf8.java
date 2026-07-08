package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212680hf8 implements InterfaceC1212660hf6 {
    public final C2216071BoL LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1212680hf8) && Intrinsics.LJFF(this.LIZ, ((C1212680hf8) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OperationGet(operationGetReentrantLockWrapper=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1212680hf8(C2216071BoL c2216071BoL) {
        this.LIZ = c2216071BoL;
    }
}
