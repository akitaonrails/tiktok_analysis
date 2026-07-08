package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982670bg9 extends AbstractC982800bgM {
    public static final /* synthetic */ int LJII = 0;
    public final C982710bgD LJFF;
    public final C981540beK LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982670bg9)) {
            return false;
        }
        C982670bg9 c982670bg9 = (C982670bg9) obj;
        return Intrinsics.LJFF(this.LJFF, c982670bg9.LJFF) && Intrinsics.LJFF(this.LJI, c982670bg9.LJI);
    }

    public final int hashCode() {
        return (this.LJFF.hashCode() * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionSettlementStartMessage(initiator=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", countTimeConfig=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982670bg9(C983440bhO c983440bhO) {
        C982710bgD c982710bgD = c983440bhO.LJFF;
        C981540beK c981540beK = c983440bhO.LJI;
        this.LJFF = c982710bgD;
        this.LJI = c981540beK;
    }
}
