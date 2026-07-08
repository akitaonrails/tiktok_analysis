package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1BEW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEW {
    public final int LIZ;
    public final String LIZIZ;
    public final Map<String, List<String>> LIZJ;
    public final long LIZLLL = System.currentTimeMillis();
    public final C1BEZ LJ;
    public final Throwable LJFF;

    public static C1BEW LIZ(Throwable th, C1BEZ c1bez) {
        return new C1BEW(-1, th.getMessage(), null, c1bez, th);
    }

    public C1BEW(int i, String str, Map<String, List<String>> map, C1BEZ c1bez, Throwable th) {
        this.LIZ = -1;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LJ = c1bez;
        this.LJFF = th;
    }
}
