package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hX7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207710hX7 {
    public static final C1207710hX7 LIZLLL = new C1207710hX7(-1, "not_found", -1.0d);
    public static final C1207710hX7 LJ = new C1207710hX7(-3, "feature_disabled", -1.0d);
    public static final C1207710hX7 LJFF = new C1207710hX7(-4, "not_initialized", -1.0d);
    public final double LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1207710hX7)) {
            return false;
        }
        C1207710hX7 c1207710hX7 = (C1207710hX7) obj;
        return Double.compare(this.LIZ, c1207710hX7.LIZ) == 0 && this.LIZIZ == c1207710hX7.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1207710hX7.LIZJ);
    }

    public final int hashCode() {
        int iX2 = ((C786410Ut5.X2(this.LIZ) * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return iX2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupProbability(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1207710hX7(int i, String str, double d) {
        this.LIZ = d;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
