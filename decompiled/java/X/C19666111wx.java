package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19666111wx<V> extends AbstractC19666311wz {
    public final V LIZIZ;

    public final int hashCode() {
        V v = this.LIZIZ;
        if (v != null) {
            return v.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Success: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19666111wx(C2222611Byt c2222611Byt) {
        this.LIZIZ = c2222611Byt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19666111wx) && Intrinsics.LJFF(this.LIZIZ, ((C19666111wx) obj).LIZIZ)) {
            return true;
        }
        return false;
    }
}
