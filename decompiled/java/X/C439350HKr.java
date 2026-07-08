package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439350HKr {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Float LIZ;
    public final Float LIZIZ;
    public final int LIZJ;

    public C439350HKr() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C439350HKr)) {
            return false;
        }
        C439350HKr c439350HKr = (C439350HKr) obj;
        return Intrinsics.LJFF(this.LIZ, c439350HKr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c439350HKr.LIZIZ) && this.LIZJ == c439350HKr.LIZJ;
    }

    public final int hashCode() {
        Float f = this.LIZ;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.LIZIZ;
        return ((iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcSheetHeightOverride(heightRatio=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxHeightRatio=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", peekHeight=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C439350HKr(Float f, Float f2, int i) {
        int i2;
        f = (i & 1) != 0 ? null : f;
        f2 = (i & 2) != 0 ? null : f2;
        if ((i & 4) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = i2;
    }
}
