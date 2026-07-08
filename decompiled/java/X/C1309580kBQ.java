package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kBQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309580kBQ extends AbstractC1309590kBR {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final C2400709av LIZLLL;

    public C1309580kBQ() {
        this(0, 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1309580kBQ)) {
            return false;
        }
        C1309580kBQ c1309580kBQ = (C1309580kBQ) obj;
        return this.LIZ == c1309580kBQ.LIZ && this.LIZIZ == c1309580kBQ.LIZIZ && this.LIZJ == c1309580kBQ.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1309580kBQ.LIZLLL);
    }

    public final int hashCode() {
        int i = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        C2400709av c2400709av = this.LIZLLL;
        return i + (c2400709av == null ? 0 : c2400709av.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageChooseConfig(queryScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", page=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", queryParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1309580kBQ(int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        i = (i3 & 2) != 0 ? 50 : i;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        this.LIZ = i4;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = null;
    }
}
