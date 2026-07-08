package X;

import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518310pc5 {
    public final NetworkUniversalPopupDispatchResponse LIZ;
    public final int LIZIZ;
    public final Map<String, Object> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1518310pc5)) {
            return false;
        }
        C1518310pc5 c1518310pc5 = (C1518310pc5) obj;
        return Intrinsics.LJFF(this.LIZ, c1518310pc5.LIZ) && this.LIZIZ == c1518310pc5.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1518310pc5.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        Map<String, Object> map = this.LIZJ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedShowRequest(response=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1518310pc5(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse, int i, Map<String, ? extends Object> map) {
        this.LIZ = networkUniversalPopupDispatchResponse;
        this.LIZIZ = i;
        this.LIZJ = map;
    }
}
