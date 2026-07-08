package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556360qbS implements InterfaceC1785530wZ5 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556360qbS)) {
            return false;
        }
        C1556360qbS c1556360qbS = (C1556360qbS) obj;
        return Intrinsics.LJFF(this.LIZ, c1556360qbS.LIZ) && this.LIZIZ == c1556360qbS.LIZIZ && this.LIZJ == c1556360qbS.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenSchema(schema=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", portraitModeOnly=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dismissAfterOpen=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556360qbS(String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
