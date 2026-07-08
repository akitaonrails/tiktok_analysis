package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191820h7U extends AbstractC1191910h7d {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191820h7U)) {
            return false;
        }
        C1191820h7U c1191820h7U = (C1191820h7U) obj;
        return Intrinsics.LJFF(this.LIZ, c1191820h7U.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1191820h7U.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitialLetter(nickname=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bgColorToken=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1191820h7U(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
