package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DAF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DAF extends C0DAZ {
    public final C0DAN LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DAF) && Intrinsics.LJFF(this.LIZ, ((C0DAF) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Block(blocked=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DAF(C0DAN c0dan) {
        this.LIZ = c0dan;
    }
}
