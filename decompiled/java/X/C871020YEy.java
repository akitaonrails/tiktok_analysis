package X;

import java.util.List;

/* JADX INFO: renamed from: X.0YEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871020YEy {
    public final boolean LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final List<Integer> LIZLLL;

    public C871020YEy(boolean z, List list, int i) {
        long j;
        z = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            j = 60;
        } else {
            j = 0;
        }
        long j2 = (i & 4) != 0 ? 300L : 0L;
        list = (i & 8) != 0 ? C13BV.INSTANCE : list;
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = list;
    }
}
