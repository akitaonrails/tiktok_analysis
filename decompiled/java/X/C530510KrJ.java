package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530510KrJ {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final C530500KrI LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C530510KrJ)) {
            return false;
        }
        C530510KrJ c530510KrJ = (C530510KrJ) obj;
        return this.LIZ == c530510KrJ.LIZ && this.LIZIZ == c530510KrJ.LIZIZ && this.LIZJ == c530510KrJ.LIZJ && this.LIZLLL == c530510KrJ.LIZLLL && Intrinsics.LJFF(this.LJ, c530510KrJ.LJ);
    }

    public final int hashCode() {
        int i = ((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        C530500KrI c530500KrI = this.LJ;
        return i + (c530500KrI == null ? 0 : c530500KrI.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIContentResourceConfig(exploreViewHolderLabel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", emptyTitleRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", emptyDescRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", emptyCtaRes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", geckoResourceKey=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C530510KrJ(int i, int i2, int i3, int i4, C530500KrI c530500KrI) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = c530500KrI;
    }
}
