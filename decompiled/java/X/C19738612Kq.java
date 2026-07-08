package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Kq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19738612Kq {
    public final C19738512Kp LIZ;
    public final C19738812Ks LIZIZ;
    public final C19380710s1 LIZJ;

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C19738612Kq.class.getSimpleName());
        sbLIZ.append(" { ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" }");
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
        if (!Intrinsics.LJFF(C19738612Kq.class, cls)) {
            return false;
        }
        C19738612Kq c19738612Kq = (C19738612Kq) obj;
        if (Intrinsics.LJFF(this.LIZ, c19738612Kq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19738612Kq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c19738612Kq.LIZJ)) {
            return true;
        }
        return false;
    }

    public C19738612Kq(C19738512Kp c19738512Kp, C19738812Ks c19738812Ks, C19380710s1 c19380710s1) {
        this.LIZ = c19738512Kp;
        this.LIZIZ = c19738812Ks;
        this.LIZJ = c19380710s1;
        int i = c19738512Kp.LIZJ;
        int i2 = c19738512Kp.LIZ;
        if (i - i2 == 0 && c19738512Kp.LIZLLL - c19738512Kp.LIZIZ == 0) {
            "Bounds must be non zero".toString();
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i2 != 0 && c19738512Kp.LIZIZ != 0) {
            "Bounding rectangle must start at the top or left window edge for folding features".toString();
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }
}
