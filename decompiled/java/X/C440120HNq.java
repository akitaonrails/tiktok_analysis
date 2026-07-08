package X;

import java.util.List;

/* JADX INFO: renamed from: X.0HNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440120HNq {
    public final C0NPA LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExplosionEffectState(entity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pendingConsumeIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", triggerId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440120HNq(C0NPA c0npa, List<String> list, String str) {
        this.LIZ = c0npa;
        this.LIZIZ = list;
        this.LIZJ = str;
    }
}
