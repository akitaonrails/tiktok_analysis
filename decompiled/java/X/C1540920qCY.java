package X;

import android.content.Context;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS637S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qCY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540920qCY {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final Function2<C1532720pzK, C1532720pzK, Boolean> LJI;
    public final InterfaceC1631620sYq<Context, String, C1537480q70, InterfaceC1540940qCa> LJII;

    public C1540920qCY() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1540920qCY)) {
            return false;
        }
        C1540920qCY c1540920qCY = (C1540920qCY) obj;
        return Intrinsics.LJFF(this.LIZ, c1540920qCY.LIZ) && this.LIZIZ == c1540920qCY.LIZIZ && this.LIZJ == c1540920qCY.LIZJ && this.LIZLLL == c1540920qCY.LIZLLL && this.LJ == c1540920qCY.LJ && this.LJFF == c1540920qCY.LJFF && Intrinsics.LJFF(this.LJI, c1540920qCY.LJI) && Intrinsics.LJFF(this.LJII, c1540920qCY.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF) * 31;
        Function2<C1532720pzK, C1532720pzK, Boolean> function2 = this.LJI;
        int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        InterfaceC1631620sYq<Context, String, C1537480q70, InterfaceC1540940qCa> interfaceC1631620sYq = this.LJII;
        return iHashCode2 + (interfaceC1631620sYq != null ? interfaceC1631620sYq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkPreViewConfig(biz=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", keepAlive=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pendingLoad=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", processUITasksImmediately=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", freshTimeMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", maxCacheCountPerKey=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", matchFn=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", viewFactory=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1540920qCY(String str, boolean z, boolean z2, long j, int i, AwS637S0100000_23 awS637S0100000_23, InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = false;
        this.LJ = j;
        this.LJFF = i;
        this.LJI = awS637S0100000_23;
        this.LJII = interfaceC1631620sYq;
    }
}
