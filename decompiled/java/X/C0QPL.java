package X;

import java.util.HashSet;

/* JADX INFO: renamed from: X.0QPL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QPL {
    public final String LIZ;
    public final HashSet<String> LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public C0QPL() {
        this(null, false, 63);
    }

    public /* synthetic */ C0QPL(String str, boolean z, int i) {
        HashSet hashSet;
        boolean z2 = z;
        String str2 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            hashSet = new HashSet();
        } else {
            hashSet = null;
        }
        this(str2, hashSet, 0L, false, false, (i & 32) != 0 ? false : z2);
    }

    public C0QPL(String str, HashSet<String> hashSet, long j, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = hashSet;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
    }
}
