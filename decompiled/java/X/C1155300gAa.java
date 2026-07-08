package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155300gAa {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;

    public C1155300gAa() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155300gAa)) {
            return false;
        }
        C1155300gAa c1155300gAa = (C1155300gAa) obj;
        return Intrinsics.LJFF(this.LIZ, c1155300gAa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1155300gAa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1155300gAa.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZJ;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICoverEntryMobParams(functionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", usedPicCnt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155300gAa(String str, String str2, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
    }
}
