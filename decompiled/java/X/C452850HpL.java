package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452850HpL {
    public final C452860HpM LIZ;
    public final C447970HhT LIZIZ;
    public final EnumC452890HpP LIZJ;
    public final EnumC452890HpP LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final InterfaceC452960HpW LJIIIIZZ;

    public C452850HpL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C452850HpL)) {
            return false;
        }
        C452850HpL c452850HpL = (C452850HpL) obj;
        return Intrinsics.LJFF(this.LIZ, c452850HpL.LIZ) && Intrinsics.LJFF(this.LIZIZ, c452850HpL.LIZIZ) && this.LIZJ == c452850HpL.LIZJ && this.LIZLLL == c452850HpL.LIZLLL && this.LJ == c452850HpL.LJ && this.LJFF == c452850HpL.LJFF && this.LJI == c452850HpL.LJI && this.LJII == c452850HpL.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c452850HpL.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisibilityMachineState(input=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", candidateWaitState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", draftWaitState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasLoadedDefaultStickers=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", dismissedByClick=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", replyCandidateConsumed=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", suppressUntilNewData=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", display=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C452850HpL(int i) {
        C452860HpM c452860HpM = new C452860HpM(0);
        C447970HhT c447970HhT = new C447970HhT(0);
        EnumC452890HpP enumC452890HpP = EnumC452890HpP.LL;
        this(c452860HpM, c447970HhT, enumC452890HpP, enumC452890HpP, false, false, false, false, C453060Hpg.LIZ);
    }

    public C452850HpL(C452860HpM c452860HpM, C447970HhT c447970HhT, EnumC452890HpP enumC452890HpP, EnumC452890HpP enumC452890HpP2, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC452960HpW interfaceC452960HpW) {
        this.LIZ = c452860HpM;
        this.LIZIZ = c447970HhT;
        this.LIZJ = enumC452890HpP;
        this.LIZLLL = enumC452890HpP2;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = z4;
        this.LJIIIIZZ = interfaceC452960HpW;
    }

    public static C452850HpL LIZ(C452850HpL c452850HpL, C452860HpM c452860HpM, C447970HhT c447970HhT, EnumC452890HpP enumC452890HpP, EnumC452890HpP enumC452890HpP2, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC452960HpW interfaceC452960HpW, int i) {
        InterfaceC452960HpW interfaceC452960HpW2 = interfaceC452960HpW;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        EnumC452890HpP enumC452890HpP3 = enumC452890HpP2;
        EnumC452890HpP enumC452890HpP4 = enumC452890HpP;
        C447970HhT c447970HhT2 = c447970HhT;
        C452860HpM c452860HpM2 = c452860HpM;
        if ((i & 1) != 0) {
            c452860HpM2 = c452850HpL.LIZ;
        }
        if ((i & 2) != 0) {
            c447970HhT2 = c452850HpL.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC452890HpP4 = c452850HpL.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC452890HpP3 = c452850HpL.LIZLLL;
        }
        if ((i & 16) != 0) {
            z8 = c452850HpL.LJ;
        }
        if ((i & 32) != 0) {
            z7 = c452850HpL.LJFF;
        }
        if ((i & 64) != 0) {
            z6 = c452850HpL.LJI;
        }
        if ((i & 128) != 0) {
            z5 = c452850HpL.LJII;
        }
        if ((i & 256) != 0) {
            interfaceC452960HpW2 = c452850HpL.LJIIIIZZ;
        }
        c452850HpL.getClass();
        return new C452850HpL(c452860HpM2, c447970HhT2, enumC452890HpP4, enumC452890HpP3, z8, z7, z6, z5, interfaceC452960HpW2);
    }
}
