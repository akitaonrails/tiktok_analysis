package X;

import java.util.List;

/* JADX INFO: renamed from: X.07gF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1924107gF {
    public static final /* synthetic */ int LIZLLL = 0;
    public final List<String> LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(C13LP.LJJLIIIJ(this.LIZ, ",", null, null, 0, null, null, 62));
        sbLIZ.append('|');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('|');
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1924107gF(int i, long j, List list) {
        this.LIZ = list;
        this.LIZIZ = j;
        this.LIZJ = i;
    }
}
