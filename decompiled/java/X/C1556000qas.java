package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556000qas {
    public final C1177960gl8 LIZ;
    public final boolean LIZIZ;

    public C1556000qas() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556000qas)) {
            return false;
        }
        C1556000qas c1556000qas = (C1556000qas) obj;
        return Intrinsics.LJFF(this.LIZ, c1556000qas.LIZ) && this.LIZIZ == c1556000qas.LIZIZ;
    }

    public final int hashCode() {
        C1177960gl8 c1177960gl8 = this.LIZ;
        return ((c1177960gl8 == null ? 0 : c1177960gl8.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MapLocationVO(updateLocation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isReturnFromAssociate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556000qas(C1177960gl8 c1177960gl8, boolean z) {
        this.LIZ = c1177960gl8;
        this.LIZIZ = z;
    }
}
