package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H6S, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H6S {
    public final Integer LIZ;
    public final Boolean LIZIZ;

    public C0H6S() {
        this((Integer) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H6S)) {
            return false;
        }
        C0H6S c0h6s = (C0H6S) obj;
        return Intrinsics.LJFF(this.LIZ, c0h6s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0h6s.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.LIZIZ;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Query(elementType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPromoted=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0H6S(Integer num, int i) {
        this((i & 1) != 0 ? null : num, (Boolean) null);
    }

    public C0H6S(Integer num, Boolean bool) {
        this.LIZ = num;
        this.LIZIZ = bool;
    }
}
