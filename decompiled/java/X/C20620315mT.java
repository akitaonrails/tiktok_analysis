package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.15mT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20620315mT {
    public final String LIZ;
    public int LIZIZ;
    public long LIZJ;
    public final Map<String, Long> LIZLLL;
    public final Map<String, Integer> LJ;
    public final boolean LJFF;

    public C20620315mT(String str, boolean z, int i) {
        long j;
        LinkedHashMap linkedHashMap;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 4) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        if ((i & 8) != 0) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = null;
        }
        LinkedHashMap linkedHashMap2 = (i & 16) != 0 ? new LinkedHashMap() : null;
        z = (i & 32) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = 0;
        this.LIZJ = j;
        this.LIZLLL = linkedHashMap;
        this.LJ = linkedHashMap2;
        this.LJFF = z;
    }
}
