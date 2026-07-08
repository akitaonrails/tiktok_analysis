package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01PO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01PO<T> extends AbstractC401801hI<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C01PO) && Intrinsics.LJFF(this.LIZ, ((C01PO) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemDownloadSuccess(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01PO(T t) {
        this.LIZ = t;
    }
}
