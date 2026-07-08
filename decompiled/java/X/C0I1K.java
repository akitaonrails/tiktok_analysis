package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I1K, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I1K {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public C0I1L LIZLLL;

    public final int hashCode() {
        String str = this.LIZIZ;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZ) * 31;
        C0I1L c0i1l = this.LIZLLL;
        return iHashCode2 + (c0i1l != null ? c0i1l.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I1K)) {
            return false;
        }
        C0I1K c0i1k = (C0I1K) obj;
        if (this.LIZ == c0i1k.LIZ && Intrinsics.LJFF(this.LIZJ, c0i1k.LIZJ) && Intrinsics.LJFF(this.LIZIZ, c0i1k.LIZIZ) && Intrinsics.LJFF(this.LIZLLL, c0i1k.LIZLLL)) {
            return true;
        }
        return false;
    }

    public C0I1K(String str, String str2, int i) {
        this.LIZIZ = str2;
        this.LIZJ = str;
        this.LIZ = i;
    }
}
