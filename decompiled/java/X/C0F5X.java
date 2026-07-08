package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F5X, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F5X {
    public final int LIZ;
    public final Long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0F5X)) {
            return false;
        }
        C0F5X c0f5x = (C0F5X) obj;
        return this.LIZ == c0f5x.LIZ && Intrinsics.LJFF(this.LIZIZ, c0f5x.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Long l = this.LIZIZ;
        return i + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdapterDataSnapshot(highLightPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTimeAtPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0F5X(int i, Long l) {
        this.LIZ = i;
        this.LIZIZ = l;
    }
}
