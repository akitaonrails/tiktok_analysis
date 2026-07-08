package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NUE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NUE {
    public final C0NUU LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NUE)) {
            return false;
        }
        C0NUE c0nue = (C0NUE) obj;
        return Intrinsics.LJFF(this.LIZ, c0nue.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0nue.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Object obj = this.LIZIZ;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public C0NUE(C0NUU c0nuu, Object obj) {
        this.LIZ = c0nuu;
        this.LIZIZ = obj;
    }
}
