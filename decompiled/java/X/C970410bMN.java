package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bMN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970410bMN extends AbstractC970470bMT {
    public final EnumC919170a1j LIZ;
    public final BattleInfoResponse LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C970410bMN)) {
            return false;
        }
        C970410bMN c970410bMN = (C970410bMN) obj;
        return this.LIZ == c970410bMN.LIZ && Intrinsics.LJFF(this.LIZIZ, c970410bMN.LIZIZ) && this.LIZJ == c970410bMN.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        BattleInfoResponse battleInfoResponse = this.LIZIZ;
        return ((iHashCode + (battleInfoResponse == null ? 0 : battleInfoResponse.hashCode())) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Match(matchType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", info=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C970410bMN(EnumC919170a1j enumC919170a1j, BattleInfoResponse battleInfoResponse, int i) {
        this.LIZ = enumC919170a1j;
        this.LIZIZ = battleInfoResponse;
        this.LIZJ = i;
    }
}
