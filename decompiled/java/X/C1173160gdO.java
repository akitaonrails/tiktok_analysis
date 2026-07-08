package X;

import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173160gdO implements InterfaceC1891350zJl, Serializable {
    public final PoiDetailApi.ChartContent LL;
    public final PoiDetailApi.ChartTab LLILLJJLI;
    public final Integer LLILLL;

    public C1173160gdO() {
        this(null, null, null);
    }

    public final C1173160gdO copy(PoiDetailApi.ChartContent chartContent, PoiDetailApi.ChartTab chartTab, Integer num) {
        return new C1173160gdO(chartContent, chartTab, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1173160gdO)) {
            return false;
        }
        C1173160gdO c1173160gdO = (C1173160gdO) obj;
        return Intrinsics.LJFF(this.LL, c1173160gdO.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1173160gdO.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1173160gdO.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        PoiDetailApi.ChartContent chartContent = this.LL;
        int iHashCode = (chartContent == null ? 0 : chartContent.hashCode()) * 31;
        PoiDetailApi.ChartTab chartTab = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (chartTab == null ? 0 : chartTab.hashCode())) * 31;
        Integer num = this.LLILLL;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailChartsV3PageCardData(chartContent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", chartTab=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", chartUIType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PoiDetailApi.ChartContent getChartContent() {
        return this.LL;
    }

    public final PoiDetailApi.ChartTab getChartTab() {
        return this.LLILLJJLI;
    }

    public final Integer getChartUIType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1173160gdO(PoiDetailApi.ChartContent chartContent, PoiDetailApi.ChartTab chartTab, Integer num) {
        this.LL = chartContent;
        this.LLILLJJLI = chartTab;
        this.LLILLL = num;
    }
}
