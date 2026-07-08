package X;

import java.util.List;

/* JADX INFO: renamed from: X.0HNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440130HNr {
    public final List<C0NPA> LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoRainEffectState(entityList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pendingConsumeIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", triggerId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440130HNr(List<C0NPA> list, List<String> list2, String str) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = str;
    }
}
