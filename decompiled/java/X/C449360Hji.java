package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449360Hji implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C291001Au<Unit> LLILZ;

    public C449360Hji() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C449360Hji)) {
            return false;
        }
        C449360Hji c449360Hji = (C449360Hji) obj;
        return Intrinsics.LJFF(this.LL, c449360Hji.LL) && Intrinsics.LJFF(this.LLILLJJLI, c449360Hji.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c449360Hji.LLILLL) && Intrinsics.LJFF(this.LLILZ, c449360Hji.LLILZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentSevenSheetState(expandEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", foldEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", expandView=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", foldView=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C449360Hji(int i) {
        this(new C291001Au(null), new C291001Au(null), new C291001Au(null), new C291001Au(null));
    }

    public C449360Hji(C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<Unit> c291001Au4) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
    }

    public static C449360Hji LIZ(C449360Hji c449360Hji, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, int i) {
        if ((i & 1) != 0) {
            c291001Au = c449360Hji.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c449360Hji.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au3 = c449360Hji.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au4 = c449360Hji.LLILZ;
        }
        c449360Hji.getClass();
        return new C449360Hji(c291001Au, c291001Au2, c291001Au3, c291001Au4);
    }
}
