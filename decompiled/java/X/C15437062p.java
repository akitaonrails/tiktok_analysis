package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.062p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15437062p {
    public final Object LIZ;
    public final long LIZIZ;

    public final int hashCode() {
        return (C189200o6.m6hashCodeimpl(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResultCacheEntry(result=");
        sbLIZ.append((Object) C189200o6.m9toStringimpl(this.LIZ));
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15437062p)) {
            return false;
        }
        C15437062p c15437062p = (C15437062p) obj;
        if (Intrinsics.LJFF(this.LIZ, c15437062p.LIZ) && this.LIZIZ == c15437062p.LIZIZ) {
            return true;
        }
        return false;
    }

    public C15437062p(Object obj, long j) {
        this.LIZ = obj;
        this.LIZIZ = j;
    }
}
