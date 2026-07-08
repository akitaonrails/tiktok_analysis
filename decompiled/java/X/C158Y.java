package X;

import com.bytedance.android.livesdk.model.message.AnchorPair;
import com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.158Y, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C158Y {
    public final UUID LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final CommunityHeartMeInfo LJ;
    public final String LJFF;
    public final List<AnchorPair> LJI;

    public C158Y() {
        throw null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31;
        CommunityHeartMeInfo communityHeartMeInfo = this.LJ;
        return ((((iHashCode + (communityHeartMeInfo == null ? 0 : communityHeartMeInfo.hashCode())) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanHammerEvent(matchItemId=");
        sbLIZ.append((Object) this.LIZ.toString());
        sbLIZ.append(", isSelfSide=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fansAnchorId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hammerCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", communityHeartMeInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", communityHeartMeInfoStr=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", affectedAnchorPairs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C158Y)) {
            return false;
        }
        C158Y c158y = (C158Y) obj;
        if (Intrinsics.LJFF(this.LIZ, c158y.LIZ) && this.LIZIZ == c158y.LIZIZ && this.LIZJ == c158y.LIZJ && this.LIZLLL == c158y.LIZLLL && Intrinsics.LJFF(this.LJ, c158y.LJ) && Intrinsics.LJFF(this.LJFF, c158y.LJFF) && Intrinsics.LJFF(this.LJI, c158y.LJI)) {
            return true;
        }
        return false;
    }

    public C158Y(UUID uuid, boolean z, long j, int i, CommunityHeartMeInfo communityHeartMeInfo, String str, List list) {
        this.LIZ = uuid;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = communityHeartMeInfo;
        this.LJFF = str;
        this.LJI = list;
    }
}
