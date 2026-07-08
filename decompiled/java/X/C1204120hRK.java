package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hRK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204120hRK<T> extends AbstractC1204360hRi<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1204120hRK) && Intrinsics.LJFF(this.LIZ, ((C1204120hRK) obj).LIZ);
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

    @Override // X.AbstractC1204360hRi
    public final T LIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1204120hRK(C1204080hRG c1204080hRG) {
        this.LIZ = c1204080hRG;
    }
}
