package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gE8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157500gE8<T> extends AbstractC1157490gE7<T> {
    public final C0KQW LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1157500gE8) && Intrinsics.LJFF(this.LIZ, ((C1157500gE8) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157500gE8(C0KQW c0kqw) {
        this.LIZ = c0kqw;
    }
}
