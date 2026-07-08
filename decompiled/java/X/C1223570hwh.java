package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hwh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1223570hwh implements InterfaceC0148002o {
    public final boolean LL;
    public final EnumC1223630hwn LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1223570hwh)) {
            return false;
        }
        C1223570hwh c1223570hwh = (C1223570hwh) obj;
        return this.LL == c1223570hwh.LL && this.LLILLJJLI == c1223570hwh.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1223570hwh.LLILLL);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorContainerVMState(blockInteractionState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", contentConstraintToWidgetEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1223570hwh(boolean z, EnumC1223630hwn enumC1223630hwn, C291001Au<Boolean> c291001Au) {
        this.LL = z;
        this.LLILLJJLI = enumC1223630hwn;
        this.LLILLL = c291001Au;
    }

    public static C1223570hwh LIZ(C1223570hwh c1223570hwh, boolean z, EnumC1223630hwn enumC1223630hwn, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            z = c1223570hwh.LL;
        }
        if ((i & 2) != 0) {
            enumC1223630hwn = c1223570hwh.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c1223570hwh.LLILLL;
        }
        c1223570hwh.getClass();
        return new C1223570hwh(z, enumC1223630hwn, c291001Au);
    }
}
