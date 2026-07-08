package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0weU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788880weU<T> {
    public final T LIZ;
    public final Exception LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1788880weU)) {
            return false;
        }
        C1788880weU c1788880weU = (C1788880weU) obj;
        return Intrinsics.LJFF(this.LIZ, c1788880weU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1788880weU.LIZIZ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EngineError(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1788880weU(T t, Exception exc) {
        this.LIZ = t;
        this.LIZIZ = exc;
    }
}
