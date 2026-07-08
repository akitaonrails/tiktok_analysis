package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158820gGG implements InterfaceC0148002o {
    public final AbstractC1623806Xk<List<CollectionDetailModel>> LL;
    public final String LLILLJJLI;
    public final C291001Au<CollectionDetailModel> LLILLL;

    public C1158820gGG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158820gGG)) {
            return false;
        }
        C1158820gGG c1158820gGG = (C1158820gGG) obj;
        return Intrinsics.LJFF(this.LL, c1158820gGG.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1158820gGG.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1158820gGG.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C291001Au<CollectionDetailModel> c291001Au = this.LLILLL;
        return iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidSeriesConfirmationPanelState(livePurchasedPaidSeriesList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ownerId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", openSeriesDetailEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1158820gGG(int i) {
        this(C491101vh.LIZ, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1158820gGG(AbstractC1623806Xk<? extends List<CollectionDetailModel>> abstractC1623806Xk, String str, C291001Au<CollectionDetailModel> c291001Au) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = str;
        this.LLILLL = c291001Au;
    }

    public static C1158820gGG LIZ(C1158820gGG c1158820gGG, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au, int i) {
        String str;
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1158820gGG.LL;
        }
        if ((i & 2) != 0) {
            str = c1158820gGG.LLILLJJLI;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            c291001Au = c1158820gGG.LLILLL;
        }
        c1158820gGG.getClass();
        return new C1158820gGG(abstractC1623806Xk, str, c291001Au);
    }
}
