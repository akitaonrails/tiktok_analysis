package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516180pYe<R> extends AbstractC1516230pYj<R> {
    public final R LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1516180pYe) && Intrinsics.LJFF(this.LIZ, ((C1516180pYe) obj).LIZ);
    }

    public final int hashCode() {
        R r = this.LIZ;
        if (r == null) {
            return 0;
        }
        return r.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1516180pYe(R r) {
        this.LIZ = r;
    }
}
