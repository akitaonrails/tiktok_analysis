package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DFN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DFN extends C0DFS {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DFN) && Intrinsics.LJFF(this.LIZ, ((C0DFN) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DFN(String str) {
        this.LIZ = str;
    }
}
