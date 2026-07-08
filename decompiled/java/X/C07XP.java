package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07XP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XP extends C07XQ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07XP)) {
            return false;
        }
        C07XP c07xp = (C07XP) obj;
        return Intrinsics.LJFF(this.LIZ, c07xp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07xp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c07xp.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Header(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subtitlePrefix=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", subtitleHighlight=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07XP(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        String[] strArr = new String[3];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3 == null ? "" : str3;
        C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strArr), "|", null, null, 0, null, null, 62).getClass();
    }
}
