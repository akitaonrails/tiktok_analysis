package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235970iGh implements InterfaceC0148002o {
    public final long LL;
    public final AbstractC1623806Xk<C1236040iGo> LLILLJJLI;
    public final AbstractC1623806Xk<C1235990iGj> LLILLL;
    public final C291001Au<CollectionDetailModel> LLILZ;

    public C1235970iGh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1235970iGh)) {
            return false;
        }
        C1235970iGh c1235970iGh = (C1235970iGh) obj;
        return this.LL == c1235970iGh.LL && Intrinsics.LJFF(this.LLILLJJLI, c1235970iGh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1235970iGh.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1235970iGh.LLILZ);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<CollectionDetailModel> c291001Au = this.LLILZ;
        return iY2 + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidSeriesAddSeriesToLiveState(roomId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", creatorSeriesData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", seriesAddOrRemoveResult=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", loadingEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1235970iGh(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(0L, c491101vh, c491101vh, null);
    }

    public C1235970iGh(long j, AbstractC1623806Xk<C1236040iGo> abstractC1623806Xk, AbstractC1623806Xk<C1235990iGj> abstractC1623806Xk2, C291001Au<CollectionDetailModel> c291001Au) {
        this.LL = j;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
        this.LLILZ = c291001Au;
    }

    public static C1235970iGh LIZ(C1235970iGh c1235970iGh, long j, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk3 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk;
        long j2 = j;
        if ((i & 1) != 0) {
            j2 = c1235970iGh.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk4 = c1235970iGh.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk3 = c1235970iGh.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c1235970iGh.LLILZ;
        }
        c1235970iGh.getClass();
        return new C1235970iGh(j2, abstractC1623806Xk4, abstractC1623806Xk3, c291001Au2);
    }
}
