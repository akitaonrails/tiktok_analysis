package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198150hHh<T> extends AbstractC1198100hHc<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1198150hHh) && Intrinsics.LJFF(this.LIZ, ((C1198150hHh) obj).LIZ);
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

    @Override // X.AbstractC1198100hHc
    public final T LIZ() {
        return this.LIZ;
    }

    public C1198150hHh(T t) {
        this.LIZ = t;
    }
}
