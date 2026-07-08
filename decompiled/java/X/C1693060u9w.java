package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693060u9w {
    public final C1693450uAZ LIZ;
    public final C1693450uAZ LIZIZ;
    public final C1693450uAZ LIZJ;
    public final C1693450uAZ LIZLLL;

    public C1693060u9w() {
        this(null, null, null, null);
    }

    public final int hashCode() {
        C1693450uAZ c1693450uAZ = this.LIZ;
        int iHashCode = (c1693450uAZ != null ? c1693450uAZ.hashCode() : 0) * 31;
        C1693450uAZ c1693450uAZ2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c1693450uAZ2 != null ? c1693450uAZ2.hashCode() : 0)) * 31;
        C1693450uAZ c1693450uAZ3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c1693450uAZ3 != null ? c1693450uAZ3.hashCode() : 0)) * 31;
        C1693450uAZ c1693450uAZ4 = this.LIZLLL;
        return iHashCode3 + (c1693450uAZ4 != null ? c1693450uAZ4.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1693060u9w)) {
            return false;
        }
        C1693060u9w c1693060u9w = (C1693060u9w) obj;
        if (Intrinsics.LJFF(this.LIZ, c1693060u9w.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1693060u9w.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1693060u9w.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1693060u9w.LIZLLL)) {
            return true;
        }
        return false;
    }

    public C1693060u9w(C1693450uAZ c1693450uAZ, C1693450uAZ c1693450uAZ2, C1693450uAZ c1693450uAZ3, C1693450uAZ c1693450uAZ4) {
        this.LIZ = c1693450uAZ;
        this.LIZIZ = c1693450uAZ2;
        this.LIZJ = c1693450uAZ3;
        this.LIZLLL = c1693450uAZ4;
    }
}
