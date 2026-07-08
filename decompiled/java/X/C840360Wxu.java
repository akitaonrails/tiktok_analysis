package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840360Wxu {
    public final Object LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C840360Wxu)) {
            return false;
        }
        C840360Wxu c840360Wxu = (C840360Wxu) obj;
        return Intrinsics.LJFF(this.LIZ, c840360Wxu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c840360Wxu.LIZIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.LIZIZ;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerformanceHandle(tracker=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", node=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C840360Wxu(C0WSB c0wsb, C0WS7 c0ws7) {
        this.LIZ = c0wsb;
        this.LIZIZ = c0ws7;
    }
}
