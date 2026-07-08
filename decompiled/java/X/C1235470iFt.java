package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235470iFt implements InterfaceC0148002o {
    public final List<C0TN4> LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;

    public C1235470iFt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1235470iFt)) {
            return false;
        }
        C1235470iFt c1235470iFt = (C1235470iFt) obj;
        return Intrinsics.LJFF(this.LL, c1235470iFt.LL) && this.LLILLJJLI == c1235470iFt.LLILLJJLI && this.LLILLL == c1235470iFt.LLILLL && this.LLILZ == c1235470iFt.LLILZ && this.LLILZIL == c1235470iFt.LLILZIL && this.LLILZLL == c1235470iFt.LLILZLL;
    }

    public final int hashCode() {
        List<C0TN4> list = this.LL;
        return ((((((((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SecurityCheckUpState(securityCheckUpItems=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", useAdaptiveIllustrations=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFetchingData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showPasskeyDialog=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showSecurityDialog=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", shouldDismissActivity=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1235470iFt(int i) {
        this(null, false, false, false, false, false);
    }

    public C1235470iFt(List<C0TN4> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
        this.LLILZLL = z5;
    }

    public static C1235470iFt LIZ(C1235470iFt c1235470iFt, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = c1235470iFt.LL;
        }
        if ((i & 2) != 0) {
            z10 = c1235470iFt.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z9 = c1235470iFt.LLILLL;
        }
        if ((i & 8) != 0) {
            z8 = c1235470iFt.LLILZ;
        }
        if ((i & 16) != 0) {
            z7 = c1235470iFt.LLILZIL;
        }
        if ((i & 32) != 0) {
            z6 = c1235470iFt.LLILZLL;
        }
        c1235470iFt.getClass();
        return new C1235470iFt(list2, z10, z9, z8, z7, z6);
    }
}
