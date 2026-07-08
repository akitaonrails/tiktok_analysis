package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IuJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481410IuJ {
    public final RecommendedRoom LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C481410IuJ)) {
            return false;
        }
        C481410IuJ c481410IuJ = (C481410IuJ) obj;
        return Intrinsics.LJFF(this.LIZ, c481410IuJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c481410IuJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c481410IuJ.LIZJ) && this.LIZLLL == c481410IuJ.LIZLLL && this.LJ == c481410IuJ.LJ;
    }

    public final int hashCode() {
        RecommendedRoom recommendedRoom = this.LIZ;
        int iHashCode = (((recommendedRoom == null ? 0 : recommendedRoom.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RandomMatchSuccessInfo(matchedRoom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timeStamp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isExpired=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C481410IuJ(RecommendedRoom recommendedRoom, String str, String str2, boolean z, int i) {
        long jCurrentTimeMillis;
        if ((i & 8) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        z = (i & 16) != 0 ? false : z;
        this.LIZ = recommendedRoom;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = jCurrentTimeMillis;
        this.LJ = z;
    }
}
