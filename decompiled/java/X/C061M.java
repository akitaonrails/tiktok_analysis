package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.061M, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C061M implements InterfaceC111300bX {
    public final PoiButton LL;

    public C061M() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C061M) && Intrinsics.LJFF(this.LL, ((C061M) obj).LL);
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
        sbLIZ.append("PoiRectangleBottomBarCollectHierarchyData(collectBtnData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C061M(PoiButton poiButton) {
        this.LL = poiButton;
    }
}
