package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158950gGT implements InterfaceC0148002o {
    public final AbstractC1623806Xk<C1814370xJb> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Boolean> LLILZIL;

    public C1158950gGT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158950gGT)) {
            return false;
        }
        C1158950gGT c1158950gGT = (C1158950gGT) obj;
        return Intrinsics.LJFF(this.LL, c1158950gGT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1158950gGT.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1158950gGT.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1158950gGT.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1158950gGT.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveBoardsUpsertState(upsertState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sponsorDialogState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", fullyCustomizedDialogChecked=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", decorationBoardDialogChecked=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showOrDismissSaveLoadingEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1158950gGT(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        Boolean bool = Boolean.FALSE;
        this(new C291001Au(bool), new C291001Au(bool), new C291001Au(bool), new C291001Au(bool), c491101vh);
    }

    public C1158950gGT(C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, AbstractC1623806Xk abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
    }

    public static C1158950gGT LIZ(C1158950gGT c1158950gGT, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        C291001Au<Boolean> c291001Au3;
        C291001Au c291001Au4 = c291001Au2;
        C291001Au c291001Au5 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk2 = c1158950gGT.LL;
        }
        C291001Au<Boolean> c291001Au6 = null;
        if ((i & 2) != 0) {
            c291001Au3 = c1158950gGT.LLILLJJLI;
        } else {
            c291001Au3 = null;
        }
        if ((i & 4) != 0) {
            c291001Au6 = c1158950gGT.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au5 = c1158950gGT.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au4 = c1158950gGT.LLILZIL;
        }
        c1158950gGT.getClass();
        return new C1158950gGT(c291001Au3, c291001Au6, c291001Au5, c291001Au4, abstractC1623806Xk2);
    }
}
