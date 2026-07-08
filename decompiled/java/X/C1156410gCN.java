package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156410gCN<T> extends AbstractC1156400gCM<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1156410gCN) && Intrinsics.LJFF(this.LIZ, ((C1156410gCN) obj).LIZ);
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

    public C1156410gCN(T t) {
        this.LIZ = t;
    }
}
