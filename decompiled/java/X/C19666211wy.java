package X;

import java.lang.Exception;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19666211wy<E extends Exception> extends AbstractC19666311wz {
    public final E LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Failure: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19666211wy(E e) {
        this.LIZIZ = e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19666211wy) && Intrinsics.LJFF(this.LIZIZ, ((C19666211wy) obj).LIZIZ)) {
            return true;
        }
        return false;
    }
}
