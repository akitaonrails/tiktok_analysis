package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382680EzS {
    public final C380190EvR LIZ;
    public final C375830EoP<Unit> LIZIZ;
    public final EnumC382750EzZ LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final boolean LJI;
    public final boolean LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    public C382680EzS() {
        boolean z = false;
        this(null, z, z, z, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382680EzS)) {
            return false;
        }
        C382680EzS c382680EzS = (C382680EzS) obj;
        return Intrinsics.LJFF(this.LIZ, c382680EzS.LIZ) && Intrinsics.LJFF(this.LIZIZ, c382680EzS.LIZIZ) && this.LIZJ == c382680EzS.LIZJ && this.LIZLLL == c382680EzS.LIZLLL && this.LJ == c382680EzS.LJ && Intrinsics.LJFF(this.LJFF, c382680EzS.LJFF) && this.LJI == c382680EzS.LJI && this.LJII == c382680EzS.LJII;
    }

    public final int hashCode() {
        C380190EvR c380190EvR = this.LIZ;
        int iHashCode = (c380190EvR == null ? 0 : c380190EvR.hashCode()) * 31;
        C375830EoP<Unit> c375830EoP = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAICreateTopBarStates(currentModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showFaceDetectionTooltip=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentMode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFromPUGC=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showModelPanel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", modeTitleOverride=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isChevronVisible=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isModelPanelClickable=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C382680EzS(EnumC382750EzZ enumC382750EzZ, boolean z, boolean z2, boolean z3, int i) {
        this(null, null, (i & 4) != 0 ? EnumC382750EzZ.VIDEO : enumC382750EzZ, (i & 8) != 0 ? false : z, false, null, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? true : z3);
    }

    public C382680EzS(C380190EvR c380190EvR, C375830EoP<Unit> c375830EoP, EnumC382750EzZ enumC382750EzZ, boolean z, boolean z2, String str, boolean z3, boolean z4) {
        this.LIZ = c380190EvR;
        this.LIZIZ = c375830EoP;
        this.LIZJ = enumC382750EzZ;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = str;
        this.LJI = z3;
        this.LJII = z4;
    }

    public static C382680EzS LIZ(C382680EzS c382680EzS, C380190EvR c380190EvR, C375830EoP c375830EoP, EnumC382750EzZ enumC382750EzZ, boolean z, String str, boolean z2, boolean z3, int i) {
        boolean z4;
        boolean z5 = z3;
        boolean z6 = z2;
        String str2 = str;
        boolean z7 = z;
        EnumC382750EzZ enumC382750EzZ2 = enumC382750EzZ;
        C375830EoP c375830EoP2 = c375830EoP;
        C380190EvR c380190EvR2 = c380190EvR;
        if ((i & 1) != 0) {
            c380190EvR2 = c382680EzS.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP2 = c382680EzS.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC382750EzZ2 = c382680EzS.LIZJ;
        }
        if ((i & 8) != 0) {
            z4 = c382680EzS.LIZLLL;
        } else {
            z4 = false;
        }
        if ((i & 16) != 0) {
            z7 = c382680EzS.LJ;
        }
        if ((i & 32) != 0) {
            str2 = c382680EzS.LJFF;
        }
        if ((i & 64) != 0) {
            z6 = c382680EzS.LJI;
        }
        if ((i & 128) != 0) {
            z5 = c382680EzS.LJII;
        }
        c382680EzS.getClass();
        return new C382680EzS(c380190EvR2, c375830EoP2, enumC382750EzZ2, z4, z7, str2, z6, z5);
    }
}
