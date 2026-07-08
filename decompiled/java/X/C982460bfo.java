package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionABInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982460bfo extends AbstractC982860bgS {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final EnumC974260bSa LJ;
    public final EnumC982500bfs LJFF;
    public final List<C981870ber> LJI;
    public final List<C982390bfh> LJII;
    public final C981540beK LJIIIIZZ;
    public final Map<Long, CompetitionABInfo> LJIIIZ;
    public final BattleTask LJIIJ;

    public C982460bfo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982460bfo)) {
            return false;
        }
        C982460bfo c982460bfo = (C982460bfo) obj;
        return this.LJ == c982460bfo.LJ && this.LJFF == c982460bfo.LJFF && Intrinsics.LJFF(this.LJI, c982460bfo.LJI) && Intrinsics.LJFF(this.LJII, c982460bfo.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c982460bfo.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c982460bfo.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c982460bfo.LJIIJ);
    }

    public final int hashCode() {
        return (((((((((((this.LJ.hashCode() * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionInfoResult(bizStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", teams=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", teamScores=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", countTimeConfig=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", abInfos=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", battleTask=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982460bfo(C982560bfy c982560bfy) {
        EnumC974260bSa enumC974260bSa = c982560bfy.LJ;
        EnumC982500bfs enumC982500bfs = c982560bfy.LJFF;
        List<C981870ber> list = c982560bfy.LJI;
        List<C982390bfh> list2 = c982560bfy.LJII;
        C981540beK c981540beK = c982560bfy.LJIIIIZZ;
        Map<Long, CompetitionABInfo> map = c982560bfy.LJIIIZ;
        BattleTask battleTask = c982560bfy.LJIIJ;
        this.LJ = enumC974260bSa;
        this.LJFF = enumC982500bfs;
        this.LJI = list;
        this.LJII = list2;
        this.LJIIIIZZ = c981540beK;
        this.LJIIIZ = map;
        this.LJIIJ = battleTask;
    }
}
