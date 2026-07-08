package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r1Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572540r1Y implements InterfaceC0148002o {
    public final C291001Au<C1572570r1b> LL;
    public final C291001Au<C1572110r0r> LLILLJJLI;
    public final C291001Au<C1572580r1c> LLILLL;

    public C1572540r1Y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1572540r1Y)) {
            return false;
        }
        C1572540r1Y c1572540r1Y = (C1572540r1Y) obj;
        return Intrinsics.LJFF(this.LL, c1572540r1Y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1572540r1Y.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1572540r1Y.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollabEditPageState(collabSearchEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", statusViewState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", collaboratorSelectEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1572540r1Y(int i) {
        this(new C291001Au(new C1572570r1b(0)), new C291001Au(new C1572110r0r(false, 0)), new C291001Au(new C1572580r1c(0)));
    }

    public C1572540r1Y(C291001Au<C1572570r1b> c291001Au, C291001Au<C1572110r0r> c291001Au2, C291001Au<C1572580r1c> c291001Au3) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
    }

    public static C1572540r1Y LIZ(C1572540r1Y c1572540r1Y, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1572540r1Y.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c1572540r1Y.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au3 = c1572540r1Y.LLILLL;
        }
        c1572540r1Y.getClass();
        return new C1572540r1Y(c291001Au, c291001Au2, c291001Au3);
    }
}
