package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0btz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991250btz<T> extends AbstractC1003980cEW {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C991250btz) && Intrinsics.LJFF(this.LIZ, ((C991250btz) obj).LIZ);
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
        sbLIZ.append("ReceiveMessageFromComponent(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991250btz(T t) {
        this.LIZ = t;
    }
}
