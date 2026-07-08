package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pa3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647210Pa3<T> implements InterfaceC0148002o {
    public final AbstractC1623806Xk<T> LL;
    public final AbstractC1623806Xk<T> LLILLJJLI;

    public C647210Pa3() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C647210Pa3)) {
            return false;
        }
        C647210Pa3 c647210Pa3 = (C647210Pa3) obj;
        return Intrinsics.LJFF(this.LL, c647210Pa3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c647210Pa3.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchDynamicTabFragmentState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listLoadMoreState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C647210Pa3(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C647210Pa3(AbstractC1623806Xk<? extends T> abstractC1623806Xk, AbstractC1623806Xk<? extends T> abstractC1623806Xk2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
    }

    public static C647210Pa3 LIZ(C647210Pa3 c647210Pa3, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c647210Pa3.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c647210Pa3.LLILLJJLI;
        }
        c647210Pa3.getClass();
        return new C647210Pa3(abstractC1623806Xk, abstractC1623806Xk2);
    }
}
