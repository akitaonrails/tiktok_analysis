package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073710e2z {
    public final int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final List<C1073690e2x> LIZLLL;
    public final float LJ;
    public final boolean LJFF;

    public C1073710e2z() {
        this(0, 0.0f, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1073710e2z)) {
            return false;
        }
        C1073710e2z c1073710e2z = (C1073710e2z) obj;
        return this.LIZ == c1073710e2z.LIZ && this.LIZIZ == c1073710e2z.LIZIZ && Float.compare(this.LIZJ, c1073710e2z.LIZJ) == 0 && Intrinsics.LJFF(this.LIZLLL, c1073710e2z.LIZLLL) && Float.compare(this.LJ, c1073710e2z.LJ) == 0 && this.LJFF == c1073710e2z.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmptyPageTopState(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", marginTop=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", titleSizeDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", buttonListState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", marginTopPercent=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showRecUserBg=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1073710e2z LIZ(C1073710e2z c1073710e2z, List list) {
        int i = c1073710e2z.LIZ;
        int i2 = c1073710e2z.LIZIZ;
        float f = c1073710e2z.LIZJ;
        float f2 = c1073710e2z.LJ;
        boolean z = c1073710e2z.LJFF;
        c1073710e2z.getClass();
        return new C1073710e2z(i, i2, f, list, f2, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1073710e2z(int i, float f, int i2) {
        int i3;
        C13BV c13bv;
        float f2;
        float f3 = f;
        int iLIZIZ = i;
        if ((i2 & 1) != 0) {
            i3 = 2131830729;
        } else {
            i3 = 0;
        }
        iLIZIZ = (i2 & 2) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)) : iLIZIZ;
        f3 = (i2 & 4) != 0 ? 32.0f : f3;
        if ((i2 & 8) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i2 & 16) != 0) {
            f2 = -1.0f;
        } else {
            f2 = 0.0f;
        }
        this(i3, iLIZIZ, f3, c13bv, f2, false);
    }

    public C1073710e2z(int i, int i2, float f, List<C1073690e2x> list, float f2, boolean z) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = f;
        this.LIZLLL = list;
        this.LJ = f2;
        this.LJFF = z;
    }
}
