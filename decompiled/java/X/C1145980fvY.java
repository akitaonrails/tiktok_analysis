package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145980fvY implements InterfaceC0148002o {
    public final AbstractC1623806Xk<Integer> LL;
    public final C1146010fvb LLILLJJLI;
    public final C1146090fvj LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1145980fvY)) {
            return false;
        }
        C1145980fvY c1145980fvY = (C1145980fvY) obj;
        return Intrinsics.LJFF(this.LL, c1145980fvY.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1145980fvY.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1145980fvY.LLILLL) && this.LLILZ == c1145980fvY.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftAnchorPanelRecordPageState(initFetchingData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", recordData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", notificationData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showTotalDiamonds=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1145980fvY(AbstractC1623806Xk<Integer> abstractC1623806Xk, C1146010fvb c1146010fvb, C1146090fvj c1146090fvj, boolean z) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = c1146010fvb;
        this.LLILLL = c1146090fvj;
        this.LLILZ = z;
    }

    public static C1145980fvY LIZ(C1145980fvY c1145980fvY, AbstractC1623806Xk abstractC1623806Xk, C1146010fvb c1146010fvb, C1146090fvj c1146090fvj, boolean z, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1145980fvY.LL;
        }
        if ((i & 2) != 0) {
            c1146010fvb = c1145980fvY.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1146090fvj = c1145980fvY.LLILLL;
        }
        if ((i & 8) != 0) {
            z = c1145980fvY.LLILZ;
        }
        c1145980fvY.getClass();
        return new C1145980fvY(abstractC1623806Xk, c1146010fvb, c1146090fvj, z);
    }
}
