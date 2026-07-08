package X;

import java.util.List;

/* JADX INFO: renamed from: X.0MNS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MNS {
    public final String LIZ;
    public final String LIZIZ;
    public final List<C1EJ2> LIZJ;

    public C0MNS() {
        this(127, null);
    }

    public C0MNS(int i, String str) {
        C13BV c13bv;
        str = (i & 2) != 0 ? null : str;
        if ((i & 64) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this.LIZ = null;
        this.LIZIZ = str;
        this.LIZJ = c13bv;
    }
}
