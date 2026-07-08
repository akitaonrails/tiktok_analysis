package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Esb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378430Esb {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    public C378430Esb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C378430Esb)) {
            return false;
        }
        C378430Esb c378430Esb = (C378430Esb) obj;
        return Intrinsics.LJFF(this.LIZ, c378430Esb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c378430Esb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c378430Esb.LIZJ) && this.LIZLLL == c378430Esb.LIZLLL && this.LJ == c378430Esb.LJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITransitionGenerateCondition(firstFramePath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", secondFramePath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", prompt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", quota=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isNetConnect=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C378430Esb(int i) {
        this(null, null, null, 0, false);
    }

    public C378430Esb(String str, String str2, String str3, int i, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = z;
    }

    public static C378430Esb LIZ(C378430Esb c378430Esb, String str, String str2, String str3, int i, boolean z, int i2) {
        boolean z2 = z;
        int i3 = i;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        if ((i2 & 1) != 0) {
            str6 = c378430Esb.LIZ;
        }
        if ((i2 & 2) != 0) {
            str5 = c378430Esb.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            str4 = c378430Esb.LIZJ;
        }
        if ((i2 & 8) != 0) {
            i3 = c378430Esb.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            z2 = c378430Esb.LJ;
        }
        c378430Esb.getClass();
        return new C378430Esb(str6, str5, str4, i3, z2);
    }
}
