package X;

import com.bytedance.android.live.base.model.user.SubscribeBadge;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512140K6q {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final SubscribeBadge LJ;
    public final boolean LJFF;
    public final Map<String, String> LJI;

    public C512140K6q() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C512140K6q)) {
            return false;
        }
        C512140K6q c512140K6q = (C512140K6q) obj;
        return Intrinsics.LJFF(this.LIZ, c512140K6q.LIZ) && Intrinsics.LJFF(this.LIZIZ, c512140K6q.LIZIZ) && this.LIZJ == c512140K6q.LIZJ && this.LIZLLL == c512140K6q.LIZLLL && Intrinsics.LJFF(this.LJ, c512140K6q.LJ) && this.LJFF == c512140K6q.LJFF && Intrinsics.LJFF(this.LJI, c512140K6q.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        SubscribeBadge subscribeBadge = this.LJ;
        return ((((iHashCode + (subscribeBadge == null ? 0 : subscribeBadge.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcSubscribeSuccessData(secUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subscribePackageId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isAutoRenewSub=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", needOpenOnBoarding=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", subscribeBadge=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isGiftSub=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", iapTrackingData=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C512140K6q(String str, String str2, boolean z, boolean z2, SubscribeBadge subscribeBadge, boolean z3, Map map, int i) {
        z2 = (i & 8) != 0 ? false : z2;
        subscribeBadge = (i & 16) != 0 ? null : subscribeBadge;
        z3 = (i & 32) != 0 ? false : z3;
        map = (i & 64) != 0 ? C2097608Jq.LJ() : map;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = subscribeBadge;
        this.LJFF = z3;
        this.LJI = map;
    }
}
