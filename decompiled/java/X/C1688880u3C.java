package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688880u3C implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final Function1<C063K, Unit> LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1688880u3C)) {
            return false;
        }
        C1688880u3C c1688880u3C = (C1688880u3C) obj;
        return Intrinsics.LJFF(this.LL, c1688880u3C.LL) && this.LLILLJJLI == c1688880u3C.LLILLJJLI && this.LLILLL == c1688880u3C.LLILLL && this.LLILZ == c1688880u3C.LLILZ && this.LLILZIL == c1688880u3C.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1688880u3C.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1688880u3C.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        String str = this.LLILZLL;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SettingsVmState(navBarTitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showUserInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", eventRecoverLoginSuccess=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", shouldAutoMoveToBottom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", eventSwitchBusinessAccountSuccess=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", scrollToAndHighlightItemKey=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", eventSink=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1688880u3C(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, Function1<? super C063K, Unit> function1) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
        this.LLILZLL = str2;
        this.LLIZ = function1;
    }

    public static C1688880u3C LIZ(C1688880u3C c1688880u3C, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i) {
        Function1<C063K, Unit> function1;
        String str3 = str2;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = c1688880u3C.LL;
        }
        if ((i & 2) != 0) {
            z8 = c1688880u3C.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z7 = c1688880u3C.LLILLL;
        }
        if ((i & 8) != 0) {
            z6 = c1688880u3C.LLILZ;
        }
        if ((i & 16) != 0) {
            z5 = c1688880u3C.LLILZIL;
        }
        if ((i & 32) != 0) {
            str3 = c1688880u3C.LLILZLL;
        }
        if ((i & 64) != 0) {
            function1 = c1688880u3C.LLIZ;
        } else {
            function1 = null;
        }
        c1688880u3C.getClass();
        return new C1688880u3C(str4, z8, z7, z6, z5, str3, function1);
    }
}
