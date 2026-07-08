package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982550bfx extends AbstractC982860bgS {
    public static final /* synthetic */ int LJII = 0;
    public final C981540beK LJ;
    public final EnumC982750bgH LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982550bfx)) {
            return false;
        }
        C982550bfx c982550bfx = (C982550bfx) obj;
        return Intrinsics.LJFF(this.LJ, c982550bfx.LJ) && this.LJFF == c982550bfx.LJFF && this.LJI == c982550bfx.LJI;
    }

    public final int hashCode() {
        return (((this.LJ.hashCode() * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionFinishResult(countTimeConfig=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", leaveUid=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982550bfx(C983360bhG c983360bhG) {
        C981540beK c981540beK = c983360bhG.LJ;
        EnumC982750bgH enumC982750bgH = c983360bhG.LJFF;
        long j = c983360bhG.LJI;
        this.LJ = c981540beK;
        this.LJFF = enumC982750bgH;
        this.LJI = j;
    }
}
