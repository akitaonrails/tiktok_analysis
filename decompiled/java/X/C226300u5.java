package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00u5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C226300u5<T> extends AbstractC401801hI<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C226300u5) && Intrinsics.LJFF(this.LIZ, ((C226300u5) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemDownloadStart(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C226300u5(T t) {
        this.LIZ = t;
    }
}
