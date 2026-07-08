package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AI3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AI3 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1AI3)) {
            return false;
        }
        C1AI3 c1ai3 = (C1AI3) obj;
        return Intrinsics.LJFF(this.LIZ, c1ai3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1ai3.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1ai3.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1ai3.LIZLLL) && Intrinsics.LJFF(this.LJ, c1ai3.LJ) && Intrinsics.LJFF(this.LJFF, c1ai3.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewerWishesGameEventContext(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", interactiveGameId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", interactiveGameName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", gameTagId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", gameTagName=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1AI3(String str, String str2, String str3, String str4, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
    }
}
