package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R09, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R09 {
    public final Integer LIZ;
    public final Integer LIZIZ;

    public C0R09() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0R09)) {
            return false;
        }
        C0R09 c0r09 = (C0R09) obj;
        return Intrinsics.LJFF(this.LIZ, c0r09.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0r09.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageConfig(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0R09(Integer num, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = num2;
    }
}
