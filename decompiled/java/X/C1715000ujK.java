package X;

import com.bytedance.pipo.verify.base.model.StatusReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ujK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715000ujK implements InterfaceC1715120ujW {
    public final Integer LIZ;
    public final String LIZIZ;
    public final StatusReason LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1715000ujK)) {
            return false;
        }
        C1715000ujK c1715000ujK = (C1715000ujK) obj;
        return Intrinsics.LJFF(this.LIZ, c1715000ujK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1715000ujK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1715000ujK.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        StatusReason statusReason = this.LIZJ;
        return iHashCode2 + (statusReason != null ? statusReason.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Pending(reasonCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reasonMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", statusReason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1715000ujK(Integer num, String str, StatusReason statusReason) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = statusReason;
    }
}
