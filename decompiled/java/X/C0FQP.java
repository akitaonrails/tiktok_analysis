package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0FQP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQP {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final Map<String, String> LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C0FQP() {
        int i = 63;
        this(i, 0L, null, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0FQP(int i, long j, String str, Map map) {
        int i2;
        int i3;
        long j2 = j;
        String str2 = (i & 1) != 0 ? "" : str;
        j2 = (i & 2) != 0 ? 0L : j2;
        if ((i & 4) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this(i2, i3, j2, str2, (i & 16) == 0 ? null : "", (i & 32) == 0 ? map : null);
    }

    public C0FQP(int i, int i2, long j, String str, String str2, Map map) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = str2;
        this.LJFF = map;
    }
}
