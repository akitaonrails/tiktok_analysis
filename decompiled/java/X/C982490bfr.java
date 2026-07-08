package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishExtraInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982490bfr extends AbstractC982800bgM {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final List<C982390bfh> LJFF;
    public final EnumC982500bfs LJI;
    public final EnumC982750bgH LJII;
    public final long LJIIIIZZ;
    public final C981540beK LJIIIZ;
    public final MatchPunishExtraInfo LJIIJ;

    public C982490bfr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982490bfr)) {
            return false;
        }
        C982490bfr c982490bfr = (C982490bfr) obj;
        return Intrinsics.LJFF(this.LJFF, c982490bfr.LJFF) && this.LJI == c982490bfr.LJI && this.LJII == c982490bfr.LJII && this.LJIIIIZZ == c982490bfr.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c982490bfr.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c982490bfr.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LJFF.hashCode() * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31;
        MatchPunishExtraInfo matchPunishExtraInfo = this.LJIIJ;
        return iHashCode + (matchPunishExtraInfo == null ? 0 : matchPunishExtraInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionSettlementEndMessage(teamScores=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", leaveUid=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", countTimeConfig=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", matchPunishExtraInfo=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982490bfr(C982780bgK c982780bgK) {
        List<C982390bfh> list = c982780bgK.LJFF;
        EnumC982500bfs enumC982500bfs = c982780bgK.LJI;
        EnumC982750bgH enumC982750bgH = c982780bgK.LJII;
        long j = c982780bgK.LJIIIIZZ;
        C981540beK c981540beK = c982780bgK.LJIIIZ;
        MatchPunishExtraInfo matchPunishExtraInfo = c982780bgK.LJIIJ;
        this.LJFF = list;
        this.LJI = enumC982500bfs;
        this.LJII = enumC982750bgH;
        this.LJIIIIZZ = j;
        this.LJIIIZ = c981540beK;
        this.LJIIJ = matchPunishExtraInfo;
    }
}
