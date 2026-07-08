package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vtF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759590vtF {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1759590vtF)) {
            return false;
        }
        C1759590vtF c1759590vtF = (C1759590vtF) obj;
        return Intrinsics.LJFF(this.LIZ, c1759590vtF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1759590vtF.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxPopupData(schema=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateStr=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1759590vtF(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
