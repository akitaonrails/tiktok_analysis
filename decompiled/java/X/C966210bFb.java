package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0bFb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966210bFb {
    public final EnumC972970bQV LIZ;
    public final Map<String, String> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicTask(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C966210bFb(EnumC972970bQV enumC972970bQV, Map<String, String> map) {
        this.LIZ = enumC972970bQV;
        this.LIZIZ = map;
    }
}
