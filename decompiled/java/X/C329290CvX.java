package X;

import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329290CvX implements InterfaceC0148002o {
    public final AbstractC1623806Xk<BatchDetailList> LL;
    public AbstractC1623806Xk<BatchDetailList> LLILLJJLI;

    public C329290CvX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C329290CvX)) {
            return false;
        }
        C329290CvX c329290CvX = (C329290CvX) obj;
        return Intrinsics.LJFF(this.LL, c329290CvX.LL) && Intrinsics.LJFF(this.LLILLJJLI, c329290CvX.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoInnerState(enterAwemes=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadMoreAwemes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C329290CvX(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh);
    }

    public C329290CvX(AbstractC1623806Xk<BatchDetailList> abstractC1623806Xk, AbstractC1623806Xk<BatchDetailList> abstractC1623806Xk2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
    }

    public static C329290CvX LIZ(C329290CvX c329290CvX, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c329290CvX.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c329290CvX.LLILLJJLI;
        }
        c329290CvX.getClass();
        return new C329290CvX(abstractC1623806Xk, abstractC1623806Xk2);
    }
}
