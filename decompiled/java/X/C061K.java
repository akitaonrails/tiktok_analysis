package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.061K, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C061K implements InterfaceC111300bX {
    public final PoiButton LL;

    public C061K() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C061K) && Intrinsics.LJFF(this.LL, ((C061K) obj).LL);
    }

    public final int hashCode() {
        PoiButton poiButton = this.LL;
        if (poiButton == null) {
            return 0;
        }
        return poiButton.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiHeaderDynamicCollectHierarchyData(collectBtnData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C061K(PoiButton poiButton) {
        this.LL = poiButton;
    }
}
