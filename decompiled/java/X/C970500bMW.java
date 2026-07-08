package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bMW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970500bMW extends AbstractC970470bMT {
    public final EnumC919170a1j LIZ;
    public final CompetitionInfo LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C970500bMW)) {
            return false;
        }
        C970500bMW c970500bMW = (C970500bMW) obj;
        return this.LIZ == c970500bMW.LIZ && Intrinsics.LJFF(this.LIZIZ, c970500bMW.LIZIZ) && this.LIZJ == c970500bMW.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        CompetitionInfo competitionInfo = this.LIZIZ;
        return ((iHashCode + (competitionInfo == null ? 0 : competitionInfo.hashCode())) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Competition(matchType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", info=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C970500bMW(EnumC919170a1j enumC919170a1j, CompetitionInfo competitionInfo, int i) {
        this.LIZ = enumC919170a1j;
        this.LIZIZ = competitionInfo;
        this.LIZJ = i;
    }
}
