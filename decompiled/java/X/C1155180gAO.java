package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155180gAO {
    public final PopupCardVO LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155180gAO)) {
            return false;
        }
        C1155180gAO c1155180gAO = (C1155180gAO) obj;
        return Intrinsics.LJFF(this.LIZ, c1155180gAO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1155180gAO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1155180gAO.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaFeedLynxCardBinding(popupCardVO=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", previewTrackParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155180gAO(PopupCardVO popupCardVO, String str, Map<String, ? extends Object> map) {
        this.LIZ = popupCardVO;
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}
