package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0qC8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540660qC8 {
    public final String LIZ;
    public final Map<String, C1540670qC9> LIZIZ;
    public final InterfaceC1540710qCD LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public C1540660qC8() {
        this(null, null, null, 63);
    }

    public C1540660qC8(String str, Map map, InterfaceC1540710qCD interfaceC1540710qCD, int i) {
        long j;
        str = (i & 1) != 0 ? null : str;
        map = (i & 2) != 0 ? new LinkedHashMap() : map;
        interfaceC1540710qCD = (i & 4) != 0 ? null : interfaceC1540710qCD;
        if ((i & 8) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        this.LIZ = str;
        this.LIZIZ = map;
        this.LIZJ = interfaceC1540710qCD;
        this.LIZLLL = j;
        this.LJ = false;
        this.LJFF = false;
    }
}
