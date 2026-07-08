package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982510bft extends AbstractC982860bgS {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final EnumC982500bfs LJ;
    public final List<C982390bfh> LJFF;
    public final boolean LJI;
    public final C981540beK LJII;

    public C982510bft() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982510bft)) {
            return false;
        }
        C982510bft c982510bft = (C982510bft) obj;
        return this.LJ == c982510bft.LJ && Intrinsics.LJFF(this.LJFF, c982510bft.LJFF) && this.LJI == c982510bft.LJI && Intrinsics.LJFF(this.LJII, c982510bft.LJII);
    }

    public final int hashCode() {
        return (((((this.LJ.hashCode() * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionSettlementEndResult(result=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", teamScores=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hasFinished=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", countTimeConfig=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982510bft(C983070bgn c983070bgn) {
        EnumC982500bfs enumC982500bfs = c983070bgn.LJ;
        List<C982390bfh> list = c983070bgn.LJFF;
        C981540beK c981540beK = c983070bgn.LJI;
        this.LJ = enumC982500bfs;
        this.LJFF = list;
        this.LJI = false;
        this.LJII = c981540beK;
    }
}
