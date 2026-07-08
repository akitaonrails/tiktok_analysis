package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Pu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659640Pu6 {
    public final Float LIZ;
    public final Float LIZIZ;
    public final Map<String, String> LIZJ;
    public final boolean LIZLLL;
    public final Map<String, String> LJ;

    public C659640Pu6(Float f, Float f2, Map map, boolean z, Map map2, int i) {
        f = (i & 1) != 0 ? null : f;
        f2 = (i & 2) != 0 ? null : f2;
        z = (i & 8) != 0 ? false : z;
        map2 = (i & 16) != 0 ? null : map2;
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = map;
        this.LIZLLL = z;
        this.LJ = map2;
    }
}
