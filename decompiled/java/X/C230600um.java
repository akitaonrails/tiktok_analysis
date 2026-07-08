package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00um, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C230600um implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Pair<Boolean, Integer>> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public C230600um() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C230600um)) {
            return false;
        }
        C230600um c230600um = (C230600um) obj;
        return Intrinsics.LJFF(this.LL, c230600um.LL) && Intrinsics.LJFF(this.LLILLJJLI, c230600um.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c230600um.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomizedBoardEditFragmentState(fragmentResumeAction=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", softKeyboardStateChangedAction=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onViewDismissAction=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C230600um(int i) {
        Boolean bool = Boolean.FALSE;
        this(new C291001Au(bool), new C291001Au(new Pair(bool, 0)), new C291001Au(bool));
    }

    public C230600um(C291001Au<Boolean> c291001Au, C291001Au<Pair<Boolean, Integer>> c291001Au2, C291001Au<Boolean> c291001Au3) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
    }

    public static C230600um LIZ(C230600um c230600um, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        if ((i & 1) != 0) {
            c291001Au = c230600um.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c230600um.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au3 = c230600um.LLILLL;
        }
        c230600um.getClass();
        return new C230600um(c291001Au, c291001Au2, c291001Au3);
    }
}
