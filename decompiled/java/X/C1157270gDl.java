package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157270gDl {
    public final C1157260gDk LIZ;
    public final C1157260gDk LIZIZ;
    public final C1157260gDk LIZJ;
    public final C1157260gDk LIZLLL;
    public final C1157280gDm LJ;
    public final C1157300gDo LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157270gDl)) {
            return false;
        }
        C1157270gDl c1157270gDl = (C1157270gDl) obj;
        return Intrinsics.LJFF(this.LIZ, c1157270gDl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1157270gDl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1157270gDl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1157270gDl.LIZLLL) && Intrinsics.LJFF(this.LJ, c1157270gDl.LJ) && Intrinsics.LJFF(this.LJFF, c1157270gDl.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UIConfig(cashierTitleFont=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", poNameFont=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", viewAllFont=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tipsFont=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", poIcon=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cashierMainPadding=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157270gDl(C1157260gDk c1157260gDk, C1157260gDk c1157260gDk2, C1157260gDk c1157260gDk3, C1157260gDk c1157260gDk4, C1157280gDm c1157280gDm, C1157300gDo c1157300gDo) {
        this.LIZ = c1157260gDk;
        this.LIZIZ = c1157260gDk2;
        this.LIZJ = c1157260gDk3;
        this.LIZLLL = c1157260gDk4;
        this.LJ = c1157280gDm;
        this.LJFF = c1157300gDo;
    }
}
