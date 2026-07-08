package X;

import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gdW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173240gdW implements InterfaceC0148002o {
    public final PoiDetailApi.ChartsBasicData LL;

    public C1173240gdW() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1173240gdW) && Intrinsics.LJFF(this.LL, ((C1173240gdW) obj).LL);
    }

    public final int hashCode() {
        PoiDetailApi.ChartsBasicData chartsBasicData = this.LL;
        if (chartsBasicData == null) {
            return 0;
        }
        return chartsBasicData.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailChartsV3State(chartsData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1173240gdW(PoiDetailApi.ChartsBasicData chartsBasicData) {
        this.LL = chartsBasicData;
    }
}
