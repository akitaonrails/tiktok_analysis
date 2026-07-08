package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20487815Eu {
    public final C20486515Eh LIZ;
    public final boolean LIZIZ;
    public final C1867990yi5 LIZJ;
    public final boolean LIZLLL;
    public final C20486515Eh LJ;
    public final EnumC994560bzK LJFF;
    public final String LJI;
    public final Long LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20487815Eu)) {
            return false;
        }
        C20487815Eu c20487815Eu = (C20487815Eu) obj;
        return Intrinsics.LJFF(this.LIZ, c20487815Eu.LIZ) && this.LIZIZ == c20487815Eu.LIZIZ && Intrinsics.LJFF(this.LIZJ, c20487815Eu.LIZJ) && this.LIZLLL == c20487815Eu.LIZLLL && Intrinsics.LJFF(this.LJ, c20487815Eu.LJ) && this.LJFF == c20487815Eu.LJFF && Intrinsics.LJFF(this.LJI, c20487815Eu.LJI) && Intrinsics.LJFF(this.LJII, c20487815Eu.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        C20486515Eh c20486515Eh = this.LJ;
        int iHashCode2 = (iHashCode + (c20486515Eh == null ? 0 : c20486515Eh.hashCode())) * 31;
        EnumC994560bzK enumC994560bzK = this.LJFF;
        int iHashCode3 = (iHashCode2 + (enumC994560bzK == null ? 0 : enumC994560bzK.hashCode())) * 31;
        String str = this.LJI;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LJII;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchStartContent(imageSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showCountDown=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", countDownText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", arrowVisible=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", arrowImageSource=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", jumpTarget=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", jumpSchema=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", countdownTimeStamp=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20487815Eu(C20486515Eh c20486515Eh, boolean z, C1867990yi5 c1867990yi5, boolean z2, C20486515Eh c20486515Eh2, EnumC994560bzK enumC994560bzK, String str, Long l, int i) {
        c20486515Eh2 = (i & 16) != 0 ? null : c20486515Eh2;
        str = (i & 64) != 0 ? null : str;
        l = (i & 128) != 0 ? null : l;
        this.LIZ = c20486515Eh;
        this.LIZIZ = z;
        this.LIZJ = c1867990yi5;
        this.LIZLLL = z2;
        this.LJ = c20486515Eh2;
        this.LJFF = enumC994560bzK;
        this.LJI = str;
        this.LJII = l;
    }
}
