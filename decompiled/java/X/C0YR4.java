package X;

import java.util.List;

/* JADX INFO: renamed from: X.0YR4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YR4 {
    public final boolean LIZ;
    public final List<C869590Y9l> LIZIZ;

    public C0YR4() {
        this(3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0YR4(int i) {
        boolean z;
        C13BV c13bv;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(z, c13bv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0YR4(boolean z, List<? extends C869590Y9l> list) {
        this.LIZ = z;
        this.LIZIZ = list;
    }
}
