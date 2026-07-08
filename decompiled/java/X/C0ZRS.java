package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZRS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZRS {
    public final Boolean LIZ;
    public final Long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZRS)) {
            return false;
        }
        C0ZRS c0zrs = (C0ZRS) obj;
        return Intrinsics.LJFF(this.LIZ, c0zrs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zrs.LIZIZ);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.LIZIZ;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public C0ZRS(Boolean bool, Long l) {
        this.LIZ = bool;
        this.LIZIZ = l;
    }
}
