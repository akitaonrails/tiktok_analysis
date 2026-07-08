package X;

import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.CountdownContent;
import webcast.data.multi_guest_play.CountdownUser;

/* JADX INFO: renamed from: X.01E5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01E5 {
    public final CountdownContent LIZ;
    public final boolean LIZIZ;
    public final LinkerMediaChangeOperator LIZJ;
    public Boolean LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountdownRecord(linkmicId:");
        CountdownUser countdownUser = this.LIZ.countdownUser;
        sbLIZ.append(countdownUser != null ? countdownUser.linkmicId : null);
        sbLIZ.append(", status= ");
        sbLIZ.append(this.LIZ.status);
        sbLIZ.append(", countdownId='");
        sbLIZ.append(this.LIZ.countdownId);
        sbLIZ.append("', isFromSei = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("), isFinishCountdown = ");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01E5(CountdownContent countdownContent, boolean z, LinkerMediaChangeOperator linkerMediaChangeOperator, int i) {
        z = (i & 2) != 0 ? false : z;
        linkerMediaChangeOperator = (i & 4) != 0 ? null : linkerMediaChangeOperator;
        this.LIZ = countdownContent;
        this.LIZIZ = z;
        this.LIZJ = linkerMediaChangeOperator;
        this.LIZLLL = null;
    }
}
