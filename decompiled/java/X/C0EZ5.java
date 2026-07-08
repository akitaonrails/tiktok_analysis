package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZ5 {
    public final C0ERA LIZ;
    public final boolean LIZIZ;
    public final C375830EoP<Unit> LIZJ;
    public final C375830EoP<Unit> LIZLLL;
    public final EnumC363350EMj LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EZ5)) {
            return false;
        }
        C0EZ5 c0ez5 = (C0EZ5) obj;
        return Intrinsics.LJFF(this.LIZ, c0ez5.LIZ) && this.LIZIZ == c0ez5.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0ez5.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ez5.LIZLLL) && this.LJ == c0ez5.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        C375830EoP<Unit> c375830EoP = this.LIZJ;
        int iHashCode2 = (iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP2 = this.LIZLLL;
        return ((iHashCode2 + (c375830EoP2 != null ? c375830EoP2.hashCode() : 0)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionFormatContentStates(contextData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isUsingUnsupportedResources=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sheetShownEvent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", selectedStateUpdateEvent=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", selectedCapitalizationState=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EZ5(C0ERA c0era, boolean z, C375830EoP<Unit> c375830EoP, C375830EoP<Unit> c375830EoP2, EnumC363350EMj enumC363350EMj) {
        this.LIZ = c0era;
        this.LIZIZ = z;
        this.LIZJ = c375830EoP;
        this.LIZLLL = c375830EoP2;
        this.LJ = enumC363350EMj;
    }

    public static C0EZ5 LIZ(C0EZ5 c0ez5, boolean z, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        C0ERA c0era;
        C375830EoP c375830EoP3 = c375830EoP2;
        C375830EoP c375830EoP4 = c375830EoP;
        boolean z2 = z;
        EnumC363350EMj enumC363350EMj = null;
        if ((i & 1) != 0) {
            c0era = c0ez5.LIZ;
        } else {
            c0era = null;
        }
        if ((i & 2) != 0) {
            z2 = c0ez5.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP4 = c0ez5.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP3 = c0ez5.LIZLLL;
        }
        if ((i & 16) != 0) {
            enumC363350EMj = c0ez5.LJ;
        }
        c0ez5.getClass();
        return new C0EZ5(c0era, z2, c375830EoP4, c375830EoP3, enumC363350EMj);
    }
}
