package X;

import java.util.Map;
import webcast.data.multi_guest_play.ActivePlaybook;

/* JADX INFO: renamed from: X.01x3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C499501x3 {
    public final EnumC499601x4 LIZ;
    public final ActivePlaybook LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final Map<String, Object> LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActivePlaybookAction(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lastActivePlaybook=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C499501x3(EnumC499601x4 enumC499601x4, ActivePlaybook activePlaybook, String str, long j, int i) {
        activePlaybook = (i & 2) != 0 ? null : activePlaybook;
        str = (i & 4) != 0 ? "" : str;
        j = (i & 8) != 0 ? 0L : j;
        this.LIZ = enumC499601x4;
        this.LIZIZ = activePlaybook;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = null;
    }
}
