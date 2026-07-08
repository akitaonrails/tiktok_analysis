package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982680bgA extends AbstractC982860bgS {
    public static final /* synthetic */ int LJI = 0;
    public final C982710bgD LJ;
    public final C981540beK LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982680bgA)) {
            return false;
        }
        C982680bgA c982680bgA = (C982680bgA) obj;
        return Intrinsics.LJFF(this.LJ, c982680bgA.LJ) && Intrinsics.LJFF(this.LJFF, c982680bgA.LJFF);
    }

    public final int hashCode() {
        return (this.LJ.hashCode() * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionSettlementStartResult(initiator=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", countTimeConfig=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982680bgA(C983450bhP c983450bhP) {
        C982710bgD c982710bgD = c983450bhP.LJ;
        C981540beK c981540beK = c983450bhP.LJFF;
        this.LJ = c982710bgD;
        this.LJFF = c981540beK;
    }
}
