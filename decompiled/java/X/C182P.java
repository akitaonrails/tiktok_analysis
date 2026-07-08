package X;

import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.api.FeedProductResp;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.182P, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182P {
    public final FeedProductResp LIZ;
    public final LiveRoomStruct LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C182P)) {
            return false;
        }
        C182P c182p = (C182P) obj;
        return Intrinsics.LJFF(this.LIZ, c182p.LIZ) && Intrinsics.LJFF(this.LIZIZ, c182p.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c182p.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c182p.LIZLLL) && Intrinsics.LJFF(this.LJ, c182p.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaFeedProductLynxBuildInput(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomStruct=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", previewRespData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trackParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enterFromMerge=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C182P(FeedProductResp feedProductResp, LiveRoomStruct liveRoomStruct, String str, Map<String, String> map, String str2) {
        this.LIZ = feedProductResp;
        this.LIZIZ = liveRoomStruct;
        this.LIZJ = str;
        this.LIZLLL = map;
        this.LJ = str2;
    }
}
