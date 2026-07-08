package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1890107al {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final Boolean LIZJ;
    public final Float LIZLLL;

    public C1890107al() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1890107al)) {
            return false;
        }
        C1890107al c1890107al = (C1890107al) obj;
        return this.LIZ == c1890107al.LIZ && this.LIZIZ == c1890107al.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1890107al.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1890107al.LIZLLL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        Boolean bool = this.LIZJ;
        int iHashCode = (iZ2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.LIZLLL;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPPanelTopBarState(showOptClose=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showApplyAll=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", applyAllEnable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", applyAllAlpha=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1890107al(int i) {
        this(false, false, null, Float.valueOf(0.0f));
    }

    public C1890107al(boolean z, boolean z2, Boolean bool, Float f) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = bool;
        this.LIZLLL = f;
    }

    public static C1890107al LIZ(C1890107al c1890107al, boolean z, boolean z2, Boolean bool, Float f, int i) {
        if ((i & 1) != 0) {
            z = c1890107al.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c1890107al.LIZIZ;
        }
        if ((i & 4) != 0) {
            bool = c1890107al.LIZJ;
        }
        if ((i & 8) != 0) {
            f = c1890107al.LIZLLL;
        }
        c1890107al.getClass();
        return new C1890107al(z, z2, bool, f);
    }
}
