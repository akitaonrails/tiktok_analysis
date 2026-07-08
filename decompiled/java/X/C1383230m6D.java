package X;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m6D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383230m6D implements InterfaceC1365770le3 {
    public final C1389920mH0 LIZ;
    public boolean LIZIZ;
    public Integer LIZJ;
    public boolean LIZLLL;
    public Function1<? super FrameLayout, Unit> LJ;

    public C1383230m6D() {
        this(null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1383230m6D)) {
            return false;
        }
        C1383230m6D c1383230m6D = (C1383230m6D) obj;
        return Intrinsics.LJFF(this.LIZ, c1383230m6D.LIZ) && this.LIZIZ == c1383230m6D.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1383230m6D.LIZJ) && this.LIZLLL == c1383230m6D.LIZLLL && Intrinsics.LJFF(this.LJ, c1383230m6D.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        Integer num = this.LIZJ;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Function1<? super FrameLayout, Unit> function1 = this.LJ;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxToastBundle(baseBundle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enableTouchClose=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", topMarginDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cancelMarginRestrict=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", customSlot=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1365770le3
    public final C1389920mH0 LIZ() {
        return this.LIZ;
    }

    public C1383230m6D(C1389920mH0 c1389920mH0, int i) {
        this.LIZ = (i & 1) != 0 ? new C1389920mH0(null, null, null, 8191) : c1389920mH0;
        this.LIZIZ = false;
        this.LIZJ = null;
        this.LIZLLL = false;
        this.LJ = null;
    }
}
