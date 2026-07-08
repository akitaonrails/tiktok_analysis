package X;

import java.util.List;

/* JADX INFO: renamed from: X.0E4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358620E4e {
    public final boolean LIZ;
    public final List<String> LIZIZ;
    public boolean LIZJ;
    public final int LIZLLL;

    public C358620E4e() {
        this(false, null, 0, 63);
    }

    public C358620E4e(boolean z, List list, int i, int i2) {
        z = (i2 & 1) != 0 ? true : z;
        list = (i2 & 2) != 0 ? null : list;
        i = (i2 & 16) != 0 ? 0 : i;
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = false;
        this.LIZLLL = i;
    }
}
