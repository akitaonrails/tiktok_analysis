package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989300bqq<T> extends AbstractC989320bqs<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C989300bqq) && Intrinsics.LJFF(this.LIZ, ((C989300bqq) obj).LIZ);
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
        sbLIZ.append("Data(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989300bqq(T t) {
        this.LIZ = t;
    }
}
