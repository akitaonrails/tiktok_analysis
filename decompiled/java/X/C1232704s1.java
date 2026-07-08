package X;

import java.util.List;

/* JADX INFO: renamed from: X.04s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1232704s1 {
    public final int LIZ;
    public final List<Integer> LIZIZ;
    public final List<Integer> LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1232704s1() {
        C13BV c13bv = C13BV.INSTANCE;
        this(0, c13bv, c13bv);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("curTemplate = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scrollUpNextTemplates = ");
        sbLIZ.append(C13LP.LJJLIIIJ(this.LIZIZ, null, null, null, 0, null, null, 63));
        sbLIZ.append(", scrollDownNextTemplates = ");
        sbLIZ.append(C13LP.LJJLIIIJ(this.LIZJ, null, null, null, 0, null, null, 63));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1232704s1(int i, List<Integer> list, List<Integer> list2) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = list2;
    }
}
