package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07c6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1898407c6 {
    public final List<C1555830qab> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public C1898407c6() {
        this(null, null, null, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1898407c6)) {
            return false;
        }
        C1898407c6 c1898407c6 = (C1898407c6) obj;
        return Intrinsics.LJFF(this.LIZ, c1898407c6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1898407c6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1898407c6.LIZJ) && this.LIZLLL == c1898407c6.LIZLLL;
    }

    public final int hashCode() {
        List<C1555830qab> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoExternalPaymentProcessResult(elements=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pmDeviceData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", userCanceled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1898407c6(List list, String str, String str2, boolean z, int i) {
        list = (i & 1) != 0 ? null : list;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        z = (i & 8) != 0 ? false : z;
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
    }
}
