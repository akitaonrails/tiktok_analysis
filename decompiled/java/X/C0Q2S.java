package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2S, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q2S implements InterfaceC663970Q2p {
    public final String LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C0Q2S() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q2S)) {
            return false;
        }
        C0Q2S c0q2s = (C0Q2S) obj;
        return Intrinsics.LJFF(this.LIZ, c0q2s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0q2s.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0q2s.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0q2s.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchCorrectWordState(newSugSessionID=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", correctWordType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", correctWord=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lastEnterMethod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Q2S(String str, Integer num, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }

    public static C0Q2S LIZ(C0Q2S c0q2s, String str, Integer num, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = c0q2s.LIZ;
        }
        if ((i & 2) != 0) {
            num = c0q2s.LIZIZ;
        }
        if ((i & 4) != 0) {
            str2 = c0q2s.LIZJ;
        }
        if ((i & 8) != 0) {
            str3 = c0q2s.LIZLLL;
        }
        c0q2s.getClass();
        return new C0Q2S(str, num, str2, str3);
    }
}
