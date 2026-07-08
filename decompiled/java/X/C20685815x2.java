package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15x2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20685815x2 implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C1075800e6M LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;

    public C20685815x2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20685815x2)) {
            return false;
        }
        C20685815x2 c20685815x2 = (C20685815x2) obj;
        return this.LL == c20685815x2.LL && this.LLILLJJLI == c20685815x2.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c20685815x2.LLILLL) && Intrinsics.LJFF(this.LLILZ, c20685815x2.LLILZ) && this.LLILZIL == c20685815x2.LLILZIL && this.LLILZLL == c20685815x2.LLILZLL && this.LLIZ == c20685815x2.LLIZ;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C291001Au<Unit> c291001Au = this.LLILLL;
        return ((((((((iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoUserCardState(isVisible=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", withAnimation=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", triggerLoad=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", userCardState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isFollowClick=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isShown=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C20685815x2(int i) {
        this(false, true, null, new C1075800e6M(null, 7), true, false, false);
    }

    public C20685815x2(boolean z, boolean z2, C291001Au<Unit> c291001Au, C1075800e6M c1075800e6M, boolean z3, boolean z4, boolean z5) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = c291001Au;
        this.LLILZ = c1075800e6M;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
        this.LLIZ = z5;
    }

    public static C20685815x2 LIZ(C20685815x2 c20685815x2, boolean z, boolean z2, C291001Au c291001Au, C1075800e6M c1075800e6M, boolean z3, boolean z4, boolean z5, int i) {
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        C1075800e6M c1075800e6M2 = c1075800e6M;
        C291001Au c291001Au2 = c291001Au;
        boolean z9 = z2;
        boolean z10 = z;
        if ((i & 1) != 0) {
            z10 = c20685815x2.LL;
        }
        if ((i & 2) != 0) {
            z9 = c20685815x2.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c20685815x2.LLILLL;
        }
        if ((i & 8) != 0) {
            c1075800e6M2 = c20685815x2.LLILZ;
        }
        if ((i & 16) != 0) {
            z8 = c20685815x2.LLILZIL;
        }
        if ((i & 32) != 0) {
            z7 = c20685815x2.LLILZLL;
        }
        if ((i & 64) != 0) {
            z6 = c20685815x2.LLIZ;
        }
        c20685815x2.getClass();
        return new C20685815x2(z10, z9, c291001Au2, c1075800e6M2, z8, z7, z6);
    }
}
