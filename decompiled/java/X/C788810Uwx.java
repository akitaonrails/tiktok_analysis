package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788810Uwx extends AbstractC788840Ux0 {
    public final Integer LIZ;

    public C788810Uwx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C788810Uwx) && Intrinsics.LJFF(this.LIZ, ((C788810Uwx) obj).LIZ);
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
        sbLIZ.append("PageHide(instanceHashCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC788840Ux0
    public final Integer LIZ() {
        return this.LIZ;
    }

    public C788810Uwx(int i) {
        this.LIZ = null;
    }
}
