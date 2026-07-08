package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aoJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949290aoJ<S, E> {
    public final S LIZ;
    public final S LIZIZ;
    public final E LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C949290aoJ)) {
            return false;
        }
        C949290aoJ c949290aoJ = (C949290aoJ) obj;
        return Intrinsics.LJFF(this.LIZ, c949290aoJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c949290aoJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c949290aoJ.LIZJ);
    }

    public final int hashCode() {
        S s = this.LIZ;
        int iHashCode = (s == null ? 0 : s.hashCode()) * 31;
        S s2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (s2 == null ? 0 : s2.hashCode())) * 31;
        E e = this.LIZJ;
        return iHashCode2 + (e != null ? e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StateChange(previous=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", current=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cause=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C949290aoJ(S s, S s2, E e) {
        this.LIZ = s;
        this.LIZIZ = s2;
        this.LIZJ = e;
    }
}
