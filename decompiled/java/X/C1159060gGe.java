package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159060gGe implements InterfaceC0148002o {
    public C291001Au<Integer> LL;
    public C291001Au<Boolean> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    public C1159060gGe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159060gGe)) {
            return false;
        }
        C1159060gGe c1159060gGe = (C1159060gGe) obj;
        return Intrinsics.LJFF(this.LL, c1159060gGe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1159060gGe.LLILLJJLI) && this.LLILLL == c1159060gGe.LLILLL && this.LLILZ == c1159060gGe.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentManagementVMState(selectedCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", manageStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isTabSelected=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isShowManageButton=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1159060gGe(int i) {
        this(new C291001Au(0), new C291001Au(Boolean.FALSE), true, false);
    }

    public C1159060gGe(C291001Au<Integer> c291001Au, C291001Au<Boolean> c291001Au2, boolean z, boolean z2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    public static C1159060gGe LIZ(C1159060gGe c1159060gGe, C291001Au c291001Au, C291001Au c291001Au2, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1159060gGe.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c1159060gGe.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c1159060gGe.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c1159060gGe.LLILZ;
        }
        c1159060gGe.getClass();
        return new C1159060gGe(c291001Au, c291001Au2, z, z2);
    }
}
