package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556340qbQ implements InterfaceC1777220wLg {
    public final String LIZ;
    public final boolean LIZIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556340qbQ)) {
            return false;
        }
        C1556340qbQ c1556340qbQ = (C1556340qbQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1556340qbQ.LIZ) && this.LIZIZ == c1556340qbQ.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenSchema(schema=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", portraitModeOnly=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556340qbQ(String str) {
        this.LIZ = str;
    }
}
