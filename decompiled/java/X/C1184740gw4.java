package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184740gw4 implements InterfaceC1891350zJl {
    public final Integer LL;
    public final ChartInfo LLILLJJLI;
    public final Integer LLILLL;
    public final Integer LLILZ;
    public final Integer LLILZIL;
    public final Integer LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1184740gw4)) {
            return false;
        }
        C1184740gw4 c1184740gw4 = (C1184740gw4) obj;
        return Intrinsics.LJFF(this.LL, c1184740gw4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1184740gw4.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1184740gw4.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1184740gw4.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1184740gw4.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1184740gw4.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ChartInfo chartInfo = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (chartInfo == null ? 0 : chartInfo.hashCode())) * 31;
        Integer num2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.LLILZLL;
        return iHashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiChartItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", chartTag=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", contentFont=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", paddingY=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", arrowHeight=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", arrowWidth=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public /* synthetic */ C1184740gw4(Integer num, ChartInfo chartInfo) {
        this(num, chartInfo, null, null, null, null);
    }

    public C1184740gw4(Integer num, ChartInfo chartInfo, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.LL = num;
        this.LLILLJJLI = chartInfo;
        this.LLILLL = num2;
        this.LLILZ = num3;
        this.LLILZIL = num4;
        this.LLILZLL = num5;
    }
}
