package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982570bfz extends AbstractC982800bgM {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final List<C982390bfh> LJFF;
    public final boolean LJI;
    public final EnumC983380bhI LJII;

    public C982570bfz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982570bfz)) {
            return false;
        }
        C982570bfz c982570bfz = (C982570bfz) obj;
        return Intrinsics.LJFF(this.LJFF, c982570bfz.LJFF) && this.LJI == c982570bfz.LJI && this.LJII == c982570bfz.LJII;
    }

    public final int hashCode() {
        return (((this.LJFF.hashCode() * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionScoreChangeMessage(teamScores=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", canUpdateInPunishment=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", triggerReason=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982570bfz(C983370bhH c983370bhH) {
        List<C982390bfh> list = c983370bhH.LJFF;
        EnumC983380bhI enumC983380bhI = c983370bhH.LJI;
        this.LJFF = list;
        this.LJI = false;
        this.LJII = enumC983380bhI;
    }
}
