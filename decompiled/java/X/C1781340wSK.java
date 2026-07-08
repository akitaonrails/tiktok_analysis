package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wSK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781340wSK {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781340wSK)) {
            return false;
        }
        C1781340wSK c1781340wSK = (C1781340wSK) obj;
        return Intrinsics.LJFF(this.LIZ, c1781340wSK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1781340wSK.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameMeta(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781340wSK(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
