package X;

import java.util.Set;
import webcast.data.multi_guest_play.ActivePlaybook;

/* JADX INFO: renamed from: X.01x5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C499701x5 {
    public final Set<ActivePlaybook> LIZ;
    public final C499501x3 LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActivePlaybookData(activePlaybook=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C499701x5(Set<ActivePlaybook> set, C499501x3 c499501x3) {
        this.LIZ = set;
        this.LIZIZ = c499501x3;
    }
}
