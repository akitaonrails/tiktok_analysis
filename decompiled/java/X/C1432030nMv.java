package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0nMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432030nMv {
    public final boolean LIZ;
    public final Boolean LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;
    public final boolean LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1432030nMv(Boolean bool, String str, Map map, int i) {
        boolean z;
        boolean z2;
        Map mapLJ = map;
        Boolean bool2 = bool;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        bool2 = (i & 2) != 0 ? null : bool2;
        String str2 = (i & 4) == 0 ? str : null;
        mapLJ = (i & 8) != 0 ? C2097608Jq.LJ() : mapLJ;
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(z, bool2, str2, mapLJ, z2);
    }

    public C1432030nMv(boolean z, Boolean bool, String str, Map<String, String> map, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = bool;
        this.LIZJ = str;
        this.LIZLLL = map;
        this.LJ = z2;
    }
}
