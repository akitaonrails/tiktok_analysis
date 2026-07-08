package X;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: X.0ztt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913750ztt {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final Map<String, String> LJ;

    public C1913750ztt() {
        this(null, null, false, false, 31);
    }

    public C1913750ztt(String str, String str2, boolean z, boolean z2, int i) {
        Map<String, String> mapEmptyMap;
        str = (i & 1) != 0 ? "" : str;
        z = (i & 2) != 0 ? false : z;
        str2 = (i & 4) != 0 ? "" : str2;
        z2 = (i & 8) != 0 ? true : z2;
        if ((i & 16) != 0) {
            mapEmptyMap = Collections.emptyMap();
        } else {
            mapEmptyMap = null;
        }
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = z2;
        this.LJ = mapEmptyMap;
    }
}
