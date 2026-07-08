package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0erB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104830erB {
    public final String LIZ;
    public final int LIZIZ = R.drawable.est;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final Function1<Context, Unit> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1104830erB)) {
            return false;
        }
        C1104830erB c1104830erB = (C1104830erB) obj;
        return Intrinsics.LJFF(this.LIZ, c1104830erB.LIZ) && this.LIZIZ == c1104830erB.LIZIZ && this.LIZJ == c1104830erB.LIZJ && this.LIZLLL == c1104830erB.LIZLLL && this.LJ == c1104830erB.LJ && Intrinsics.LJFF(this.LJFF, c1104830erB.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VirtualTicketCrossRoomClaimTipData(displayContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", leftIconRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetRoomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", envelopeId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1104830erB(String str, long j, long j2, long j3, C1104840erC c1104840erC) {
        this.LIZ = str;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = c1104840erC;
    }
}
