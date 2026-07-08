package X;

import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174180gf2 implements InterfaceC1891350zJl, Serializable {
    public final PoiDetailApi.ChartPoi LL;
    public final Integer LLILLJJLI;
    public final Integer LLILLL;

    public C1174180gf2() {
        this(null, null, null);
    }

    public final C1174180gf2 copy(PoiDetailApi.ChartPoi chartPoi, Integer num, Integer num2) {
        return new C1174180gf2(chartPoi, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1174180gf2)) {
            return false;
        }
        C1174180gf2 c1174180gf2 = (C1174180gf2) obj;
        return Intrinsics.LJFF(this.LL, c1174180gf2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1174180gf2.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1174180gf2.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        PoiDetailApi.ChartPoi chartPoi = this.LL;
        int iHashCode = (chartPoi == null ? 0 : chartPoi.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILLL;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailChartsV3SmallCardData(chartPoi=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", chartUIType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", chartType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PoiDetailApi.ChartPoi getChartPoi() {
        return this.LL;
    }

    public final Integer getChartType() {
        return this.LLILLL;
    }

    public final Integer getChartUIType() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1174180gf2(PoiDetailApi.ChartPoi chartPoi, Integer num, Integer num2) {
        this.LL = chartPoi;
        this.LLILLJJLI = num;
        this.LLILLL = num2;
    }
}
