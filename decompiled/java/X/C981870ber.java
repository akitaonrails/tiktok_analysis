package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ber, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981870ber {
    public static final /* synthetic */ int LIZJ = 0;
    public final long LIZ;
    public List<C982710bgD> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C981870ber)) {
            return false;
        }
        C981870ber c981870ber = (C981870ber) obj;
        return this.LIZ == c981870ber.LIZ && Intrinsics.LJFF(this.LIZIZ, c981870ber.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionTeamBase(teamId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", members=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C981870ber(long j, List<C982710bgD> list) {
        this.LIZ = j;
        this.LIZIZ = list;
    }
}
