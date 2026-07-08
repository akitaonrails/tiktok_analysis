package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LN7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LN7<T> implements C0LN4<T> {
    public final T LIZ;
    public final C0LNA LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LN7)) {
            return false;
        }
        C0LN7 c0ln7 = (C0LN7) obj;
        return Intrinsics.LJFF(this.LIZ, c0ln7.LIZ) && this.LIZIZ == c0ln7.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LN7(T t, C0LNA c0lna) {
        this.LIZ = t;
        this.LIZIZ = c0lna;
    }
}
