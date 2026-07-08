package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156160gBy {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156160gBy)) {
            return false;
        }
        C1156160gBy c1156160gBy = (C1156160gBy) obj;
        return Intrinsics.LJFF(this.LIZ, c1156160gBy.LIZ) && this.LIZIZ == c1156160gBy.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1156160gBy.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkHistoryEntry(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", entrance=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156160gBy(String str, int i, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
    }
}
