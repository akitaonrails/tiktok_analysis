package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JBB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JBB implements InterfaceC0148002o {
    public final int LL;
    public final AbstractC1623806Xk<Boolean> LLILLJJLI;
    public final C493830JYf LLILLL;
    public final List<C493820JYe> LLILZ;
    public final int LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final List<String> LLIZ;

    public C0JBB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JBB)) {
            return false;
        }
        C0JBB c0jbb = (C0JBB) obj;
        return this.LL == c0jbb.LL && Intrinsics.LJFF(this.LLILLJJLI, c0jbb.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0jbb.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0jbb.LLILZ) && this.LLILZIL == c0jbb.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c0jbb.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0jbb.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31;
        C493830JYf c493830JYf = this.LLILLL;
        return ((((((((iHashCode + (c493830JYf == null ? 0 : c493830JYf.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlyLiveVipListState(curPage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", apiStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", initialLocalChoice=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", currentVipList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedPosition=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", closeDialog=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", pagesTypes=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0JBB(int i) {
        this(-1, C491101vh.LIZ, null, new ArrayList(), 0, new C291001Au(Boolean.FALSE), new ArrayList());
    }

    public C0JBB(int i, AbstractC1623806Xk<Boolean> abstractC1623806Xk, C493830JYf c493830JYf, List<C493820JYe> list, int i2, C291001Au<Boolean> c291001Au, List<String> list2) {
        this.LL = i;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = c493830JYf;
        this.LLILZ = list;
        this.LLILZIL = i2;
        this.LLILZLL = c291001Au;
        this.LLIZ = list2;
    }

    public static C0JBB LIZ(C0JBB c0jbb, int i, AbstractC1623806Xk abstractC1623806Xk, C493830JYf c493830JYf, List list, int i2, C291001Au c291001Au, List list2, int i3) {
        List list3 = list2;
        C291001Au c291001Au2 = c291001Au;
        int i4 = i2;
        List list4 = list;
        C493830JYf c493830JYf2 = c493830JYf;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        int i5 = i;
        if ((i3 & 1) != 0) {
            i5 = c0jbb.LL;
        }
        if ((i3 & 2) != 0) {
            abstractC1623806Xk2 = c0jbb.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            c493830JYf2 = c0jbb.LLILLL;
        }
        if ((i3 & 8) != 0) {
            list4 = c0jbb.LLILZ;
        }
        if ((i3 & 16) != 0) {
            i4 = c0jbb.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            c291001Au2 = c0jbb.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            list3 = c0jbb.LLIZ;
        }
        c0jbb.getClass();
        return new C0JBB(i5, abstractC1623806Xk2, c493830JYf2, list4, i4, c291001Au2, list3);
    }
}
