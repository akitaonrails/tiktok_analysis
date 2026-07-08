package X;

import com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveRoomReplayApi;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.188G, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C188G extends AbstractC1572300r1A {
    public final String LIZ;
    public final Video LIZIZ;
    public final long LIZJ;
    public final ECLiveRoomReplayApi.LiveRoomInfo LIZLLL;
    public final Map<String, Object> LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C188G)) {
            return false;
        }
        C188G c188g = (C188G) obj;
        return Intrinsics.LJFF(this.LIZ, c188g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c188g.LIZIZ) && this.LIZJ == c188g.LIZJ && Intrinsics.LJFF(this.LIZLLL, c188g.LIZLLL) && Intrinsics.LJFF(this.LJ, c188g.LJ) && this.LJFF == c188g.LJFF;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        ECLiveRoomReplayApi.LiveRoomInfo liveRoomInfo = this.LIZLLL;
        int iHashCode2 = (iHashCode + (liveRoomInfo == null ? 0 : liveRoomInfo.hashCode())) * 31;
        Map<String, Object> map = this.LJ;
        return ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(videoId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", video=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", liveRoomInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", daInfoMap=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", apiDurationMs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C188G(String str, Video video, long j, ECLiveRoomReplayApi.LiveRoomInfo liveRoomInfo, Map<String, ? extends Object> map, int i) {
        this.LIZ = str;
        this.LIZIZ = video;
        this.LIZJ = j;
        this.LIZLLL = liveRoomInfo;
        this.LJ = map;
        this.LJFF = i;
    }
}
