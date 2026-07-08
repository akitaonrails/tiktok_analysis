package X;

import com.ss.android.ugc.aweme.model.PaidSeriesLiveListResponse;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158800gGE implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C291001Au<PaidSeriesLiveListResponse> LLILLJJLI;
    public final C291001Au<Throwable> LLILLL;
    public final AbstractC1623806Xk<Long> LLILZ;
    public final AbstractC1623806Xk<Long> LLILZIL;
    public final AbstractC1623806Xk<Long> LLILZLL;
    public final AbstractC1623806Xk<Long> LLIZ;

    public C1158800gGE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158800gGE)) {
            return false;
        }
        C1158800gGE c1158800gGE = (C1158800gGE) obj;
        return Intrinsics.LJFF(this.LL, c1158800gGE.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1158800gGE.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1158800gGE.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1158800gGE.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1158800gGE.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1158800gGE.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1158800gGE.LLIZ);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<PaidSeriesLiveListResponse> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Throwable> c291001Au3 = this.LLILLL;
        return ((((((((iHashCode2 + (c291001Au3 != null ? c291001Au3.hashCode() : 0)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidSeriesBeforeLiveState(showEmptyNoSeries=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showCanAddSeries=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showError=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", removeSeriesFromListResponse=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", topSeriesFromListResponse=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", pinSeriesResponse=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", unpinSeriesResponse=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1158800gGE(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(null, null, null, c491101vh, c491101vh, c491101vh, c491101vh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1158800gGE(C291001Au<Unit> c291001Au, C291001Au<PaidSeriesLiveListResponse> c291001Au2, C291001Au<? extends Throwable> c291001Au3, AbstractC1623806Xk<Long> abstractC1623806Xk, AbstractC1623806Xk<Long> abstractC1623806Xk2, AbstractC1623806Xk<Long> abstractC1623806Xk3, AbstractC1623806Xk<Long> abstractC1623806Xk4) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = abstractC1623806Xk;
        this.LLILZIL = abstractC1623806Xk2;
        this.LLILZLL = abstractC1623806Xk3;
        this.LLIZ = abstractC1623806Xk4;
    }

    public static C1158800gGE LIZ(C1158800gGE c1158800gGE, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, AbstractC1623806Xk abstractC1623806Xk3, AbstractC1623806Xk abstractC1623806Xk4, int i) {
        AbstractC1623806Xk abstractC1623806Xk5 = abstractC1623806Xk4;
        AbstractC1623806Xk abstractC1623806Xk6 = abstractC1623806Xk3;
        AbstractC1623806Xk abstractC1623806Xk7 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk8 = abstractC1623806Xk;
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au6 = c1158800gGE.LL;
        }
        if ((i & 2) != 0) {
            c291001Au5 = c1158800gGE.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au4 = c1158800gGE.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk8 = c1158800gGE.LLILZ;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk7 = c1158800gGE.LLILZIL;
        }
        if ((i & 32) != 0) {
            abstractC1623806Xk6 = c1158800gGE.LLILZLL;
        }
        if ((i & 64) != 0) {
            abstractC1623806Xk5 = c1158800gGE.LLIZ;
        }
        c1158800gGE.getClass();
        return new C1158800gGE(c291001Au6, c291001Au5, c291001Au4, abstractC1623806Xk8, abstractC1623806Xk7, abstractC1623806Xk6, abstractC1623806Xk5);
    }
}
