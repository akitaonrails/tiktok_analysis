package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434100H0m {
    public final boolean LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    public C434100H0m() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C434100H0m)) {
            return false;
        }
        C434100H0m c434100H0m = (C434100H0m) obj;
        return this.LIZ == c434100H0m.LIZ && Intrinsics.LJFF(this.LIZIZ, c434100H0m.LIZIZ) && this.LIZJ == c434100H0m.LIZJ && this.LIZLLL == c434100H0m.LIZLLL && this.LJ == c434100H0m.LJ;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return ((((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMImageBtnUiState(visible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", radiusDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isDefaultIcon=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C434100H0m(int i) {
        this(0, 0, null, false, true);
    }

    public C434100H0m(int i, int i2, String str, boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = z2;
    }
}
