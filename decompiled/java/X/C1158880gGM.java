package X;

import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158880gGM implements InterfaceC0148002o {
    public final AbstractC1623806Xk<PoiDetailApi.PoiDetailDataModel> LL;
    public final boolean LLILLJJLI;
    public final C1193740hAa LLILLL;

    public C1158880gGM() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158880gGM)) {
            return false;
        }
        C1158880gGM c1158880gGM = (C1158880gGM) obj;
        return Intrinsics.LJFF(this.LL, c1158880gGM.LL) && this.LLILLJJLI == c1158880gGM.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1158880gGM.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C1193740hAa c1193740hAa = this.LLILLL;
        return iHashCode + (c1193740hAa == null ? 0 : c1193740hAa.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailDataState(detailResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isReusedAnchorName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", prfNetworkData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158880gGM(Object obj) {
        this.LL = C491101vh.LIZ;
        this.LLILLJJLI = false;
        this.LLILLL = null;
    }
}
