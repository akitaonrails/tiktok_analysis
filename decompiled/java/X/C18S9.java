package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18S9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18S9 {
    public final boolean LIZ;
    public final EnumC559620LxA LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final C18S6 LJ;
    public final C1777880wMk LJFF;
    public final C18S4 LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C18S9() {
        this(null, 0 == true ? 1 : 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18S9)) {
            return false;
        }
        C18S9 c18s9 = (C18S9) obj;
        return this.LIZ == c18s9.LIZ && this.LIZIZ == c18s9.LIZIZ && this.LIZJ == c18s9.LIZJ && Float.compare(this.LIZLLL, c18s9.LIZLLL) == 0 && this.LJ == c18s9.LJ && Intrinsics.LJFF(this.LJFF, c18s9.LJFF) && this.LJI == c18s9.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceBoxStates(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isCanceling=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", wavePoint=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", talkingState=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", countdownTipRes=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", errorType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31;
        C1777880wMk c1777880wMk = this.LJFF;
        int iHashCode = (iZ2 + (c1777880wMk == null ? 0 : c1777880wMk.hashCode())) * 31;
        C18S4 c18s4 = this.LJI;
        return iHashCode + (c18s4 != null ? c18s4.hashCode() : 0);
    }

    public /* synthetic */ C18S9(EnumC559620LxA enumC559620LxA, C18S6 c18s6, int i) {
        this(false, (i & 2) != 0 ? EnumC559620LxA.CLICK : enumC559620LxA, false, 0.0f, (i & 16) != 0 ? C18S6.STOP : c18s6, null, null);
    }

    public C18S9(boolean z, EnumC559620LxA enumC559620LxA, boolean z2, float f, C18S6 c18s6, C1777880wMk c1777880wMk, C18S4 c18s4) {
        this.LIZ = z;
        this.LIZIZ = enumC559620LxA;
        this.LIZJ = z2;
        this.LIZLLL = f;
        this.LJ = c18s6;
        this.LJFF = c1777880wMk;
        this.LJI = c18s4;
    }

    public static C18S9 LIZ(C18S9 c18s9, boolean z, EnumC559620LxA enumC559620LxA, boolean z2, float f, C18S6 c18s6, C1777880wMk c1777880wMk, C18S4 c18s4, int i) {
        C18S4 c18s42 = c18s4;
        C1777880wMk c1777880wMk2 = c1777880wMk;
        C18S6 c18s62 = c18s6;
        float f2 = f;
        boolean z3 = z2;
        EnumC559620LxA enumC559620LxA2 = enumC559620LxA;
        boolean z4 = z;
        if ((i & 1) != 0) {
            z4 = c18s9.LIZ;
        }
        if ((i & 2) != 0) {
            enumC559620LxA2 = c18s9.LIZIZ;
        }
        if ((i & 4) != 0) {
            z3 = c18s9.LIZJ;
        }
        if ((i & 8) != 0) {
            f2 = c18s9.LIZLLL;
        }
        if ((i & 16) != 0) {
            c18s62 = c18s9.LJ;
        }
        if ((i & 32) != 0) {
            c1777880wMk2 = c18s9.LJFF;
        }
        if ((i & 64) != 0) {
            c18s42 = c18s9.LJI;
        }
        c18s9.getClass();
        return new C18S9(z4, enumC559620LxA2, z3, f2, c18s62, c1777880wMk2, c18s42);
    }
}
