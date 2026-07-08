package X;

import java.util.List;

/* JADX INFO: renamed from: X.0wFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773560wFm {
    public final C1773550wFl LIZ;
    public final List<C1773550wFl> LIZIZ;

    public C1773560wFm() {
        C1773550wFl c1773550wFl = new C1773550wFl(0, 0, 31);
        this.LIZ = c1773550wFl;
        this.LIZIZ = C1697810uHb.LJIILJJIL(c1773550wFl);
    }

    public final C1773550wFl LIZ(int i, int i2) {
        for (C1773550wFl c1773550wFl : this.LIZIZ) {
            if (c1773550wFl.LIZ == i && c1773550wFl.LIZIZ == i2) {
                return c1773550wFl;
            }
        }
        C1773550wFl c1773550wFl2 = new C1773550wFl(i, i2, 28);
        this.LIZIZ.add(c1773550wFl2);
        return c1773550wFl2;
    }
}
