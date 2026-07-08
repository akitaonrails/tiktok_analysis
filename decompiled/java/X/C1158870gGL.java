package X;

import com.ss.android.ugc.aweme.poi.detail.nearby.PoiNearbyModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158870gGL implements InterfaceC0148002o {
    public final AbstractC1623806Xk<PoiNearbyModel> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1158870gGL) && Intrinsics.LJFF(this.LL, ((C1158870gGL) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailNearbyState(response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158870gGL() {
        this(C491101vh.LIZ);
    }

    public C1158870gGL(AbstractC1623806Xk<PoiNearbyModel> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
