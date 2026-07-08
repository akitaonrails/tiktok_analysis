package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903390ZcH extends AbstractC903430ZcL {
    public final boolean LIZIZ;
    public final C163T LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final C903380ZcG LJI;
    public final Integer LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C903390ZcH)) {
            return false;
        }
        C903390ZcH c903390ZcH = (C903390ZcH) obj;
        return this.LIZIZ == c903390ZcH.LIZIZ && this.LIZJ == c903390ZcH.LIZJ && Intrinsics.LJFF(this.LIZLLL, c903390ZcH.LIZLLL) && Intrinsics.LJFF(this.LJ, c903390ZcH.LJ) && this.LJFF == c903390ZcH.LJFF && Intrinsics.LJFF(this.LJI, c903390ZcH.LJI) && Intrinsics.LJFF(this.LJII, c903390ZcH.LJII);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZIZ) * 31;
        C163T c163t = this.LIZJ;
        int iHashCode = (iZ2 + (c163t == null ? 0 : c163t.hashCode())) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        C903380ZcG c903380ZcG = this.LJI;
        int iHashCode3 = (iHashCode2 + (c903380ZcG == null ? 0 : c903380ZcG.hashCode())) * 31;
        Integer num = this.LJII;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Original(showUI=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", translationErrorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", translationLang=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", autoTranslate=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", bizCompData=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", nuance=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C903390ZcH(boolean z, C163T c163t, String str, String str2, boolean z2, C903380ZcG c903380ZcG, Integer num) {
        super(C0SKK.ORIGINAL);
        this.LIZIZ = z;
        this.LIZJ = c163t;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = z2;
        this.LJI = c903380ZcG;
        this.LJII = num;
    }
}
