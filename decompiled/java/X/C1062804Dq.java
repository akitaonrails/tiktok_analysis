package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1062804Dq {
    public final Integer LIZ;
    public final String LIZIZ;

    public C1062804Dq() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1062804Dq)) {
            return false;
        }
        C1062804Dq c1062804Dq = (C1062804Dq) obj;
        return Intrinsics.LJFF(this.LIZ, c1062804Dq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1062804Dq.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBtnInterestItemVO(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1062804Dq(Integer num, String str) {
        this.LIZ = num;
        this.LIZIZ = str;
    }
}
