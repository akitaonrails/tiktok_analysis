package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557120qcg extends AbstractC1557160qck {
    public final Object LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1557120qcg) && Intrinsics.LJFF(this.LIZ, ((C1557120qcg) obj).LIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Literal(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557120qcg(Object obj) {
        this.LIZ = obj;
    }
}
