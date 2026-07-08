package X;

import com.bytedance.pipo.verify.base.model.response.AlertMsg;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ujI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714980ujI implements InterfaceC1715120ujW {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final AlertMsg LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1714980ujI)) {
            return false;
        }
        C1714980ujI c1714980ujI = (C1714980ujI) obj;
        return Intrinsics.LJFF(this.LIZ, c1714980ujI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1714980ujI.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1714980ujI.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1714980ujI.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        AlertMsg alertMsg = this.LIZLLL;
        return iHashCode3 + (alertMsg != null ? alertMsg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Reject(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reasonCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", alertMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1714980ujI(AlertMsg alertMsg, Integer num, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = alertMsg;
    }
}
