package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EZP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZP {
    public final Boolean LIZ;
    public final boolean LIZIZ;
    public final EnumC373600Eko LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public C0EZP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EZP)) {
            return false;
        }
        C0EZP c0ezp = (C0EZP) obj;
        return Intrinsics.LJFF(this.LIZ, c0ezp.LIZ) && this.LIZIZ == c0ezp.LIZIZ && this.LIZJ == c0ezp.LIZJ && this.LIZLLL == c0ezp.LIZLLL && this.LJ == c0ezp.LJ;
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        return ((((((((bool == null ? 0 : bool.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FullScreenStates(isShowing=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enableControlBar=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", playState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", currentPlayTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", totalPlayTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0EZP(int i) {
        this(null, false, EnumC373600Eko.PAUSE, 0, 1);
    }

    public C0EZP(Boolean bool, boolean z, EnumC373600Eko enumC373600Eko, int i, int i2) {
        this.LIZ = bool;
        this.LIZIZ = z;
        this.LIZJ = enumC373600Eko;
        this.LIZLLL = i;
        this.LJ = i2;
    }

    public static C0EZP LIZ(C0EZP c0ezp, Boolean bool, EnumC373600Eko enumC373600Eko, int i, int i2, int i3) {
        boolean z;
        int i4 = i2;
        int i5 = i;
        EnumC373600Eko enumC373600Eko2 = enumC373600Eko;
        Boolean bool2 = bool;
        if ((i3 & 1) != 0) {
            bool2 = c0ezp.LIZ;
        }
        if ((i3 & 2) != 0) {
            z = c0ezp.LIZIZ;
        } else {
            z = false;
        }
        if ((i3 & 4) != 0) {
            enumC373600Eko2 = c0ezp.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i5 = c0ezp.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            i4 = c0ezp.LJ;
        }
        c0ezp.getClass();
        return new C0EZP(bool2, z, enumC373600Eko2, i5, i4);
    }
}
