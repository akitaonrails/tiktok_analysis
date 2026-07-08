package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zoC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910220zoC implements InterfaceC0148002o {
    public final C05RV LL;
    public final boolean LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public C1910220zoC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1910220zoC)) {
            return false;
        }
        C1910220zoC c1910220zoC = (C1910220zoC) obj;
        return this.LL == c1910220zoC.LL && this.LLILLJJLI == c1910220zoC.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1910220zoC.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C291001Au<Boolean> c291001Au = this.LLILLL;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchCreatorInboxPageState(selectedInboxType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSwitching=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", switchFinish=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1910220zoC(int i) {
        this(C19212010Ec.LIZJ.LIZJ(), false, null);
    }

    public C1910220zoC(C05RV c05rv, boolean z, C291001Au<Boolean> c291001Au) {
        this.LL = c05rv;
        this.LLILLJJLI = z;
        this.LLILLL = c291001Au;
    }

    public static C1910220zoC LIZ(C1910220zoC c1910220zoC, C05RV c05rv, boolean z, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            c05rv = c1910220zoC.LL;
        }
        if ((i & 2) != 0) {
            z = c1910220zoC.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c1910220zoC.LLILLL;
        }
        c1910220zoC.getClass();
        return new C1910220zoC(c05rv, z, c291001Au);
    }
}
