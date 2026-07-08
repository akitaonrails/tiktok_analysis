package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788820Uwy extends AbstractC788840Ux0 {
    public final Integer LIZ;

    public C788820Uwy() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C788820Uwy) && Intrinsics.LJFF(this.LIZ, ((C788820Uwy) obj).LIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowSuccess(instanceHashCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC788840Ux0
    public final Integer LIZ() {
        return this.LIZ;
    }

    public C788820Uwy(Integer num) {
        this.LIZ = num;
    }
}
