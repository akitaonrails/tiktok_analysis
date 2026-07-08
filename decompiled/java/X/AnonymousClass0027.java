package X;

import java.util.List;

/* JADX INFO: renamed from: X.0027, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0027 {
    public final int LIZ;
    public final int LIZIZ;
    public final List<String> LIZJ;

    public AnonymousClass0027() {
        this(0, 0, 7);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaveTaskConfigParams(tabListPageCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabResourcePageCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fetchAllListCategories=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnonymousClass0027(int i, int i2, int i3) {
        C13BV c13bv;
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        if ((i3 & 4) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(i, i2, c13bv);
    }

    public AnonymousClass0027(int i, int i2, List<String> list) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = list;
    }
}
