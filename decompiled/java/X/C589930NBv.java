package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0NBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589930NBv {
    public final Map<String, Object> LIZ;
    public final Map<String, Object> LIZIZ;
    public final Throwable LIZJ;
    public final boolean LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C589930NBv(Map map, Throwable th, boolean z, int i) {
        Map mapLJ;
        if ((i & 2) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        this((Map<String, ? extends Object>) map, (Map<String, ? extends Object>) mapLJ, (i & 4) != 0 ? null : th, (i & 8) != 0 ? false : z);
    }

    public C589930NBv(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Throwable th, boolean z) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = th;
        this.LIZLLL = z;
    }
}
