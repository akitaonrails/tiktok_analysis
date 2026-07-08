package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WZ0 {
    public static final C0WZ0 LJ = new C0WZ0(null, 0, null);
    public final boolean LIZ = true;
    public final Object LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0WZ0)) {
            return false;
        }
        C0WZ0 c0wz0 = (C0WZ0) obj;
        return this.LIZ == c0wz0.LIZ && Intrinsics.LJFF(this.LIZIZ, c0wz0.LIZIZ) && this.LIZJ == c0wz0.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0wz0.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Object obj = this.LIZIZ;
        int iHashCode = (((i + (obj == null ? 0 : obj.hashCode())) * 31) + this.LIZJ) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Result(intercept=" + this.LIZ + ", returnValue=" + this.LIZIZ + ", code=" + this.LIZJ + ", msg=" + this.LIZLLL + ")";
    }

    public C0WZ0(String str, int i, Object obj) {
        this.LIZIZ = obj;
        this.LIZJ = i;
        this.LIZLLL = str;
    }
}
