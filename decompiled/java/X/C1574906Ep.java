package X;

import java.util.HashSet;

/* JADX INFO: renamed from: X.06Ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1574906Ep {
    public final long LIZ;
    public final int LIZIZ;
    public final HashSet<String> LIZJ;

    public C1574906Ep() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountdownInfo(timestamp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", updateIds=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1574906Ep(long j, int i) {
        HashSet<String> hashSet = new HashSet<>();
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = hashSet;
    }
}
