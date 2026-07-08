package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qdM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557540qdM {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557540qdM)) {
            return false;
        }
        C1557540qdM c1557540qdM = (C1557540qdM) obj;
        return Intrinsics.LJFF(this.LIZ, c1557540qdM.LIZ) && this.LIZIZ == c1557540qdM.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonState(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557540qdM(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
