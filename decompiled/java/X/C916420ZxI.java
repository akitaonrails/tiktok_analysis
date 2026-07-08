package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916420ZxI {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final Integer[] LIZ() {
        return new Integer[]{Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL)};
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C916420ZxI.class, cls)) {
            return false;
        }
        C916420ZxI c916420ZxI = (C916420ZxI) obj;
        if (this.LIZ == c916420ZxI.LIZ && this.LIZIZ == c916420ZxI.LIZIZ && this.LIZJ == c916420ZxI.LIZJ && this.LIZLLL == c916420ZxI.LIZLLL) {
            return true;
        }
        return false;
    }

    public C916420ZxI(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}
