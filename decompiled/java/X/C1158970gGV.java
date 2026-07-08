package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158970gGV implements InterfaceC0148002o {
    public final C291001Au<Integer> LL;
    public final int LLILLJJLI;
    public final Integer LLILLL;

    public C1158970gGV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158970gGV)) {
            return false;
        }
        C1158970gGV c1158970gGV = (C1158970gGV) obj;
        return Intrinsics.LJFF(this.LL, c1158970gGV.LL) && this.LLILLJJLI == c1158970gGV.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1158970gGV.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        Integer num = this.LLILLL;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemePagerState(currentTab=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sortVideoType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", curPos=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1158970gGV(int i) {
        this(new C291001Au(0), 0, null);
    }

    public C1158970gGV(C291001Au<Integer> c291001Au, int i, Integer num) {
        this.LL = c291001Au;
        this.LLILLJJLI = i;
        this.LLILLL = num;
    }

    public static C1158970gGV LIZ(C1158970gGV c1158970gGV, C291001Au c291001Au, int i, Integer num, int i2) {
        if ((i2 & 1) != 0) {
            c291001Au = c1158970gGV.LL;
        }
        if ((i2 & 2) != 0) {
            i = c1158970gGV.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            num = c1158970gGV.LLILLL;
        }
        c1158970gGV.getClass();
        return new C1158970gGV(c291001Au, i, num);
    }
}
