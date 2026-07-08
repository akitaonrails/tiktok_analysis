package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774690wHb {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1774690wHb)) {
            return false;
        }
        C1774690wHb c1774690wHb = (C1774690wHb) obj;
        return Intrinsics.LJFF(this.LIZ, c1774690wHb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1774690wHb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1774690wHb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1774690wHb.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingTargetInfo(bizKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tabId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", elementName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1774690wHb(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
