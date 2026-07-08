package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361520EFi {
    public final C0ECF LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final C375830EoP<Unit> LIZLLL;
    public final C375830EoP<Unit> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C361520EFi)) {
            return false;
        }
        C361520EFi c361520EFi = (C361520EFi) obj;
        return Intrinsics.LJFF(this.LIZ, c361520EFi.LIZ) && this.LIZIZ == c361520EFi.LIZIZ && this.LIZJ == c361520EFi.LIZJ && Intrinsics.LJFF(this.LIZLLL, c361520EFi.LIZLLL) && Intrinsics.LJFF(this.LJ, c361520EFi.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        C375830EoP<Unit> c375830EoP = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP2 = this.LJ;
        return iHashCode2 + (c375830EoP2 != null ? c375830EoP2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioFadePanelContentStates(contextData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", curFadeInLength=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", curFadeOutLength=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sheetShownEvent=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sliderUpdateEvent=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C361520EFi(C0ECF c0ecf, int i, int i2, C375830EoP<Unit> c375830EoP, C375830EoP<Unit> c375830EoP2) {
        this.LIZ = c0ecf;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = c375830EoP;
        this.LJ = c375830EoP2;
    }

    public static C361520EFi LIZ(C361520EFi c361520EFi, int i, int i2, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i3) {
        C0ECF c0ecf;
        C375830EoP c375830EoP3 = c375830EoP2;
        C375830EoP c375830EoP4 = c375830EoP;
        int i4 = i2;
        int i5 = i;
        if ((i3 & 1) != 0) {
            c0ecf = c361520EFi.LIZ;
        } else {
            c0ecf = null;
        }
        if ((i3 & 2) != 0) {
            i5 = c361520EFi.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            i4 = c361520EFi.LIZJ;
        }
        if ((i3 & 8) != 0) {
            c375830EoP4 = c361520EFi.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            c375830EoP3 = c361520EFi.LJ;
        }
        c361520EFi.getClass();
        return new C361520EFi(c0ecf, i5, i4, c375830EoP4, c375830EoP3);
    }
}
