package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gH8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159360gH8 implements InterfaceC0148002o {
    public final boolean LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C1817880xPG LLILLL;
    public final C291001Au<Boolean> LLILZ;

    public C1159360gH8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159360gH8)) {
            return false;
        }
        C1159360gH8 c1159360gH8 = (C1159360gH8) obj;
        return this.LL == c1159360gH8.LL && Intrinsics.LJFF(this.LLILLJJLI, c1159360gH8.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1159360gH8.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1159360gH8.LLILZ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        C1817880xPG c1817880xPG = this.LLILLL;
        return ((iZ2 + (c1817880xPG == null ? 0 : c1817880xPG.hashCode())) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomizedBoardTitleDoneState(enableDone=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showOrHideLiveLoadingDialog=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", toShowToast=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", finishUpsertEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1159360gH8(int i) {
        Boolean bool = Boolean.FALSE;
        this(false, new C291001Au(bool), null, new C291001Au(bool));
    }

    public C1159360gH8(boolean z, C291001Au<Boolean> c291001Au, C1817880xPG c1817880xPG, C291001Au<Boolean> c291001Au2) {
        this.LL = z;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c1817880xPG;
        this.LLILZ = c291001Au2;
    }

    public static C1159360gH8 LIZ(C1159360gH8 c1159360gH8, boolean z, C291001Au c291001Au, C1817880xPG c1817880xPG, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            z = c1159360gH8.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1159360gH8.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1817880xPG = c1159360gH8.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c1159360gH8.LLILZ;
        }
        c1159360gH8.getClass();
        return new C1159360gH8(z, c291001Au, c1817880xPG, c291001Au2);
    }
}
