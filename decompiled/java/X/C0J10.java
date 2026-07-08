package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0J10, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J10<T> {
    public static final C0J10 LJ = new C0J10(Collections.emptyList());
    public static final C0J10 LJFF = new C0J10(Collections.emptyList());
    public final List<T> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Result ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", offset ");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0J10(List list) {
        this.LIZ = list;
        this.LIZLLL = 0;
    }

    public C0J10(List list, int i) {
        this.LIZ = list;
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = i;
    }
}
