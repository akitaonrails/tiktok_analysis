package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HET, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HET extends C0HEU {
    public final Exception LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0HET) && Intrinsics.LJFF(this.LIZ, ((C0HET) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(exception=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HET(Exception exc) {
        this.LIZ = exc;
    }
}
