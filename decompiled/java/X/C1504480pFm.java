package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0pFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504480pFm {
    public static final C1504480pFm LJFF = new C1504480pFm(null, null, null, null, "Current Minis instance clientKey not found", 15);
    public static final C1504480pFm LJI = new C1504480pFm(null, null, null, null, "Minis prefetch resource not found", 15);
    public static final C1504480pFm LJII = new C1504480pFm(null, null, null, null, "Minis prefetch is disabled", 15);
    public static final C1504480pFm LJIIIIZZ = new C1504480pFm(null, null, null, null, "Prefetch data for request ID is already provided", 15);
    public final Map<?, ?> LIZ;
    public final Map<String, ? extends Object> LIZIZ;
    public final Integer LIZJ;
    public final Throwable LIZLLL;
    public final String LJ;

    public C1504480pFm() {
        this(null, null, null, null, null, 31);
    }

    public C1504480pFm(Map map, Map map2, Integer num, Throwable th, String str, int i) {
        map = (i & 1) != 0 ? null : map;
        map2 = (i & 2) != 0 ? null : map2;
        num = (i & 4) != 0 ? null : num;
        th = (i & 8) != 0 ? null : th;
        str = (i & 16) != 0 ? null : str;
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = num;
        this.LIZLLL = th;
        this.LJ = str;
    }
}
