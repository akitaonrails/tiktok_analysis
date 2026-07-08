package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982530bfv extends AbstractC982800bgM {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final EnumC982750bgH LJFF;
    public final long LJI;
    public final C981540beK LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982530bfv)) {
            return false;
        }
        C982530bfv c982530bfv = (C982530bfv) obj;
        return this.LJFF == c982530bfv.LJFF && this.LJI == c982530bfv.LJI && Intrinsics.LJFF(this.LJII, c982530bfv.LJII);
    }

    public final int hashCode() {
        return (((this.LJFF.hashCode() * 31) + C786410Ut5.Y2(this.LJI)) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionFinishMessage(reason=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", leaveUid=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", countTimeConfig=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982530bfv(C983350bhF c983350bhF) {
        EnumC982750bgH enumC982750bgH = c983350bhF.LJFF;
        long j = c983350bhF.LJI;
        C981540beK c981540beK = c983350bhF.LJII;
        this.LJFF = enumC982750bgH;
        this.LJI = j;
        this.LJII = c981540beK;
    }
}
