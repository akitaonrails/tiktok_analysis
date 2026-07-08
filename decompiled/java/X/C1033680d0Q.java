package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d0Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033680d0Q extends AbstractC1033670d0P {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1033680d0Q) && Intrinsics.LJFF(this.LIZ, ((C1033680d0Q) obj).LIZ);
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

    public C1033680d0Q(String str) {
        this.LIZ = str;
    }
}
