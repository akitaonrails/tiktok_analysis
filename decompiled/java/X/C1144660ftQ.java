package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ftQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144660ftQ {
    public final UUID LIZ;
    public final int LIZIZ;
    public final BattleUserInfo LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        BattleUserInfo battleUserInfo = this.LIZJ;
        return ((((((((iHashCode + (battleUserInfo == null ? 0 : battleUserInfo.hashCode())) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedBattleItemCardInfo(itemId=");
        sbLIZ.append((Object) this.LIZ.toString());
        sbLIZ.append(", cardType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sendUser=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sendTimeSec=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", targetAnchorId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", effectStartTimeSec=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", effectDurationSec=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1144660ftQ)) {
            return false;
        }
        C1144660ftQ c1144660ftQ = (C1144660ftQ) obj;
        if (Intrinsics.LJFF(this.LIZ, c1144660ftQ.LIZ) && this.LIZIZ == c1144660ftQ.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1144660ftQ.LIZJ) && this.LIZLLL == c1144660ftQ.LIZLLL && this.LJ == c1144660ftQ.LJ && this.LJFF == c1144660ftQ.LJFF && this.LJI == c1144660ftQ.LJI) {
            return true;
        }
        return false;
    }

    public C1144660ftQ(UUID uuid, int i, BattleUserInfo battleUserInfo, long j, long j2, long j3, long j4) {
        this.LIZ = uuid;
        this.LIZIZ = i;
        this.LIZJ = battleUserInfo;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = j3;
        this.LJI = j4;
    }
}
