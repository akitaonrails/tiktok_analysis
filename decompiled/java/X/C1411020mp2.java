package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SupportedServiceInfo;

/* JADX INFO: renamed from: X.0mp2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411020mp2 extends AbstractC878300Ycu {
    public final boolean LIZ;
    public final List<SupportedServiceInfo> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1411020mp2)) {
            return false;
        }
        C1411020mp2 c1411020mp2 = (C1411020mp2) obj;
        return this.LIZ == c1411020mp2.LIZ && Intrinsics.LJFF(this.LIZIZ, c1411020mp2.LIZIZ) && this.LIZJ == c1411020mp2.LIZJ && this.LIZLLL == c1411020mp2.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceSwitchInfoResult(isSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", supportedServices=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", canEveryoneSendDm=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFromCache=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1411020mp2(List list, boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }
}
