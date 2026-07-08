package X;

import java.util.Map;

/* JADX INFO: renamed from: X.10G5, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10G5 {
    public static final /* synthetic */ int LJ = 0;
    public final boolean LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final long LIZLLL;

    public C10G5(boolean z, String str, Map map, int i) {
        long jCurrentTimeMillis;
        str = (i & 2) != 0 ? null : str;
        map = (i & 4) != 0 ? null : map;
        if ((i & 8) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LIZLLL = jCurrentTimeMillis;
    }
}
