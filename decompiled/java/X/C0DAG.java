package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DAG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DAG extends C0DAZ {
    public final C334470D9h LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DAG) && Intrinsics.LJFF(this.LIZ, ((C0DAG) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Proceed(input=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DAG(C334470D9h c334470D9h) {
        this.LIZ = c334470D9h;
    }
}
