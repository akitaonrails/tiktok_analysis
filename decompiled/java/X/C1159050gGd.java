package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159050gGd implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C291001Au<AbstractC1862080yYY> LLILZ;

    public C1159050gGd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159050gGd)) {
            return false;
        }
        C1159050gGd c1159050gGd = (C1159050gGd) obj;
        return Intrinsics.LJFF(this.LL, c1159050gGd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1159050gGd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1159050gGd.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1159050gGd.LLILZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSheetState(expandEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", finishExpandEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dismissEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", dismissEventWithType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1159050gGd(int i) {
        this(new C291001Au(null), new C291001Au(null), new C291001Au(null), new C291001Au(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1159050gGd(C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<? extends AbstractC1862080yYY> c291001Au4) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
    }

    public static C1159050gGd LIZ(C1159050gGd c1159050gGd, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        C291001Au<Unit> c291001Au4;
        if ((i & 1) != 0) {
            c291001Au = c1159050gGd.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c1159050gGd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au4 = c1159050gGd.LLILLL;
        } else {
            c291001Au4 = null;
        }
        if ((i & 8) != 0) {
            c291001Au3 = c1159050gGd.LLILZ;
        }
        c1159050gGd.getClass();
        return new C1159050gGd(c291001Au, c291001Au2, c291001Au4, c291001Au3);
    }
}
