package X;

import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.LoadMoreResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cv9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329050Cv9 implements InterfaceC0148002o {
    public final AbstractC1623806Xk<LoadMoreResponse> LL;
    public final AbstractC1623806Xk<BatchDetailList> LLILLJJLI;

    public C329050Cv9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C329050Cv9)) {
            return false;
        }
        C329050Cv9 c329050Cv9 = (C329050Cv9) obj;
        return Intrinsics.LJFF(this.LL, c329050Cv9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c329050Cv9.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoNimbleDate(loadMoreAwemes=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", awemes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C329050Cv9(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh);
    }

    public C329050Cv9(AbstractC1623806Xk<LoadMoreResponse> abstractC1623806Xk, AbstractC1623806Xk<BatchDetailList> abstractC1623806Xk2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
    }

    public static C329050Cv9 LIZ(C329050Cv9 c329050Cv9, AbstractC1623806Xk abstractC1623806Xk) {
        AbstractC1623806Xk<LoadMoreResponse> abstractC1623806Xk2 = c329050Cv9.LL;
        c329050Cv9.getClass();
        return new C329050Cv9(abstractC1623806Xk2, abstractC1623806Xk);
    }
}
