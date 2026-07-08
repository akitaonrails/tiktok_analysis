package X;

import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172380gc8 implements InterfaceC0148002o {
    public final PoiDetailApi.ChartsBasicData LL;

    public C1172380gc8() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1172380gc8) && Intrinsics.LJFF(this.LL, ((C1172380gc8) obj).LL);
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
        sbLIZ.append("PoiDetailChartsState(charts=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1172380gc8(PoiDetailApi.ChartsBasicData chartsBasicData) {
        this.LL = chartsBasicData;
    }
}
