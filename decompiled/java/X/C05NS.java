package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05NS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05NS<T> implements C05NR<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C05NS) && Intrinsics.LJFF(this.LIZ, ((C05NS) obj).LIZ);
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
        sbLIZ.append("Success(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C05NS(Unit unit) {
        this.LIZ = unit;
    }
}
