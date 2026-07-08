package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EEO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EEO {
    public final Boolean LIZ;
    public final Boolean LIZIZ;
    public final Boolean LIZJ;
    public final C0EEV LIZLLL;
    public final String LJ;

    public C0EEO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EEO)) {
            return false;
        }
        C0EEO c0eeo = (C0EEO) obj;
        return Intrinsics.LJFF(this.LIZ, c0eeo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0eeo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0eeo.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0eeo.LIZLLL) && Intrinsics.LJFF(this.LJ, c0eeo.LJ);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        C0EEV c0eev = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (c0eev == null ? 0 : c0eev.hashCode())) * 31;
        String str = this.LJ;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HSLAdjustPanelSceneState(hslSlideHueEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hslSlideSaturationEnable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hslSlideLightnessEnable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", slideBarData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lastExtra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0EEO(int i) {
        this(null, null, null, null, null);
    }

    public C0EEO(Boolean bool, Boolean bool2, Boolean bool3, C0EEV c0eev, String str) {
        this.LIZ = bool;
        this.LIZIZ = bool2;
        this.LIZJ = bool3;
        this.LIZLLL = c0eev;
        this.LJ = str;
    }

    public static C0EEO LIZ(C0EEO c0eeo, Boolean bool, Boolean bool2, Boolean bool3, C0EEV c0eev, String str, int i) {
        String str2 = str;
        C0EEV c0eev2 = c0eev;
        Boolean bool4 = bool3;
        Boolean bool5 = bool2;
        Boolean bool6 = bool;
        if ((i & 1) != 0) {
            bool6 = c0eeo.LIZ;
        }
        if ((i & 2) != 0) {
            bool5 = c0eeo.LIZIZ;
        }
        if ((i & 4) != 0) {
            bool4 = c0eeo.LIZJ;
        }
        if ((i & 8) != 0) {
            c0eev2 = c0eeo.LIZLLL;
        }
        if ((i & 16) != 0) {
            str2 = c0eeo.LJ;
        }
        c0eeo.getClass();
        return new C0EEO(bool6, bool5, bool4, c0eev2, str2);
    }
}
