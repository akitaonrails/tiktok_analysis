package X;

import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ssg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735200Ssg {
    public final int LIZ;
    public final String LIZIZ;
    public final CarrierType LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C735200Ssg)) {
            return false;
        }
        C735200Ssg c735200Ssg = (C735200Ssg) obj;
        return this.LIZ == c735200Ssg.LIZ && Intrinsics.LJFF(this.LIZIZ, c735200Ssg.LIZIZ) && this.LIZJ == c735200Ssg.LIZJ && this.LIZLLL == c735200Ssg.LIZLLL && this.LJ == c735200Ssg.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        CarrierType carrierType = this.LIZJ;
        return ((((iHashCode + (carrierType == null ? 0 : carrierType.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvotePublishEventPayload(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", carrierType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isVideoAffected=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", textWasEmpty=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C735200Ssg(int i, String str, CarrierType carrierType, boolean z) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = carrierType;
        this.LIZLLL = z;
    }
}
