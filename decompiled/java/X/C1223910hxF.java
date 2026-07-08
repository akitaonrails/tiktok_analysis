package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1223910hxF implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C291001Au<Unit> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Unit> LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1223910hxF)) {
            return false;
        }
        C1223910hxF c1223910hxF = (C1223910hxF) obj;
        return Intrinsics.LJFF(this.LL, c1223910hxF.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1223910hxF.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1223910hxF.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1223910hxF.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1223910hxF.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1223910hxF.LLILZLL);
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorSearchBarVMState(searchKeyword=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dismissKeyboardEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", autoShowKeyboardEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", canAutoShowKeyboardEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", updateVisibilityEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", jumpToContentPageEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1223910hxF(String str, C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<Boolean> c291001Au4, C291001Au<Unit> c291001Au5) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
        this.LLILZLL = c291001Au5;
    }

    public static C1223910hxF LIZ(C1223910hxF c1223910hxF, String str, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, int i) {
        C291001Au c291001Au6 = c291001Au5;
        C291001Au c291001Au7 = c291001Au4;
        C291001Au c291001Au8 = c291001Au3;
        C291001Au c291001Au9 = c291001Au2;
        C291001Au c291001Au10 = c291001Au;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = c1223910hxF.LL;
        }
        if ((i & 2) != 0) {
            c291001Au10 = c1223910hxF.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au9 = c1223910hxF.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au8 = c1223910hxF.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au7 = c1223910hxF.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au6 = c1223910hxF.LLILZLL;
        }
        c1223910hxF.getClass();
        return new C1223910hxF(str2, c291001Au10, c291001Au9, c291001Au8, c291001Au7, c291001Au6);
    }
}
