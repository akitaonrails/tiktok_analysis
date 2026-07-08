package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F86, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F86 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0F86)) {
            return false;
        }
        C0F86 c0f86 = (C0F86) obj;
        return Intrinsics.LJFF(this.LIZ, c0f86.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0f86.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0f86.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0f86.LIZLLL) && this.LJ == c0f86.LJ && this.LJFF == c0f86.LJFF && this.LJI == c0f86.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NleResolvedFontData(fontName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fileName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", localPath=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enableBgColor=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enableMaskBlurLightColor=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isFromVGlobal=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0F86(String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
    }
}
