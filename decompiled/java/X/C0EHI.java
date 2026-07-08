package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EHI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EHI {
    public final C0EHJ LIZ;
    public final C361890EGt LIZIZ;
    public final C0E8A LIZJ;
    public final C0EL0 LIZLLL;
    public final C0ELJ LJ;
    public final boolean LJFF;
    public final C0EL8 LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EHI)) {
            return false;
        }
        C0EHI c0ehi = (C0EHI) obj;
        return Intrinsics.LJFF(this.LIZ, c0ehi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ehi.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ehi.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ehi.LIZLLL) && Intrinsics.LJFF(this.LJ, c0ehi.LJ) && this.LJFF == c0ehi.LJFF && Intrinsics.LJFF(this.LJI, c0ehi.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TempInitResult(modelData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bottomData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trackPanelData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", musicData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", editorProInitData=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", backFromPublish=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", uiData=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EHI(C0EHJ c0ehj, C361890EGt c361890EGt, C0E8A c0e8a, C0EL0 c0el0, C0ELJ c0elj, boolean z, C0EL8 c0el8) {
        this.LIZ = c0ehj;
        this.LIZIZ = c361890EGt;
        this.LIZJ = c0e8a;
        this.LIZLLL = c0el0;
        this.LJ = c0elj;
        this.LJFF = z;
        this.LJI = c0el8;
    }
}
