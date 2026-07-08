package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1892907bD {
    public final Integer LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1892907bD) && Intrinsics.LJFF(this.LIZ, ((C1892907bD) obj).LIZ);
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
        sbLIZ.append("ScrollSample(level=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1892907bD(Integer num) {
        this.LIZ = num;
    }
}
