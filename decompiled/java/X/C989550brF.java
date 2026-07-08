package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989550brF<T> extends AbstractC991610buZ {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C989550brF) && Intrinsics.LJFF(this.LIZ, ((C989550brF) obj).LIZ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessCustomized(payload=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989550brF(T t) {
        this.LIZ = t;
    }
}
