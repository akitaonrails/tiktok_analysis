package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982630bg5 extends AbstractC982860bgS {
    public static final /* synthetic */ int LJI = 0;
    public final C981540beK LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982630bg5)) {
            return false;
        }
        C982630bg5 c982630bg5 = (C982630bg5) obj;
        return Intrinsics.LJFF(this.LJ, c982630bg5.LJ) && this.LJFF == c982630bg5.LJFF;
    }

    public final int hashCode() {
        return (this.LJ.hashCode() * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakeStageSwitchTurnResult(countTimeConfig=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", initiateAutoFinalCall=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982630bg5(C983590bhd c983590bhd) {
        C981540beK c981540beK = c983590bhd.LJ;
        boolean z = c983590bhd.LJFF;
        this.LJ = c981540beK;
        this.LJFF = z;
    }
}
