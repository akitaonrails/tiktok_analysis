package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OYC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OYC implements InterfaceC0148002o {
    public AbstractC1623806Xk<? extends List<? extends InterfaceC1891350zJl>> LL;
    public AbstractC1623806Xk<? extends C0OYE> LLILLJJLI;
    public AbstractC1623806Xk<Integer> LLILLL;
    public final C291001Au<C0OTS> LLILZ;
    public final long LLILZIL;

    public C0OYC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OYC)) {
            return false;
        }
        C0OYC c0oyc = (C0OYC) obj;
        return Intrinsics.LJFF(this.LL, c0oyc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0oyc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0oyc.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0oyc.LLILZ) && this.LLILZIL == c0oyc.LLILZIL;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<C0OTS> c291001Au = this.LLILZ;
        return ((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + C786410Ut5.Y2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentListState(commentListState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", commentFooterState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scrollEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", bbItemId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0OYC(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, c491101vh, null, 0L);
    }

    public C0OYC(AbstractC1623806Xk<? extends List<? extends InterfaceC1891350zJl>> abstractC1623806Xk, AbstractC1623806Xk<? extends C0OYE> abstractC1623806Xk2, AbstractC1623806Xk<Integer> abstractC1623806Xk3, C291001Au<C0OTS> c291001Au, long j) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = abstractC1623806Xk3;
        this.LLILZ = c291001Au;
        this.LLILZIL = j;
    }

    public static C0OYC LIZ(C0OYC c0oyc, C1623606Xi c1623606Xi, C1623606Xi c1623606Xi2, C1623606Xi c1623606Xi3, C291001Au c291001Au, long j, int i) {
        long j2 = j;
        C291001Au c291001Au2 = c291001Au;
        AbstractC1623806Xk<Integer> abstractC1623806Xk = c1623606Xi3;
        AbstractC1623806Xk<? extends C0OYE> abstractC1623806Xk2 = c1623606Xi2;
        AbstractC1623806Xk<? extends List<? extends InterfaceC1891350zJl>> abstractC1623806Xk3 = c1623606Xi;
        if ((i & 1) != 0) {
            abstractC1623806Xk3 = c0oyc.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c0oyc.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk = c0oyc.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c0oyc.LLILZ;
        }
        if ((i & 16) != 0) {
            j2 = c0oyc.LLILZIL;
        }
        c0oyc.getClass();
        return new C0OYC(abstractC1623806Xk3, abstractC1623806Xk2, abstractC1623806Xk, c291001Au2, j2);
    }
}
