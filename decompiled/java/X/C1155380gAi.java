package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155380gAi implements InterfaceC111300bX {
    public final PoiButton LL;
    public final Boolean LLILLJJLI;

    public C1155380gAi() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155380gAi)) {
            return false;
        }
        C1155380gAi c1155380gAi = (C1155380gAi) obj;
        return Intrinsics.LJFF(this.LL, c1155380gAi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1155380gAi.LLILLJJLI);
    }

    public final int hashCode() {
        PoiButton poiButton = this.LL;
        int iHashCode = (poiButton == null ? 0 : poiButton.hashCode()) * 31;
        Boolean bool = this.LLILLJJLI;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDynamicNavBarCollectHierarchyData(collectBtnData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isImmersion=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155380gAi(PoiButton poiButton, Boolean bool) {
        this.LL = poiButton;
        this.LLILLJJLI = bool;
    }
}
