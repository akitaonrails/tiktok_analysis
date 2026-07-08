package X;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0fP3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125830fP3 {
    public final C1125860fP6 LIZ;
    public final C1125850fP5 LIZIZ;
    public final HashSet<Long> LIZJ;
    public final HashMap<Integer, C1125860fP6> LIZLLL;

    public C1125830fP3() {
        this(null, 15);
    }

    public /* synthetic */ C1125830fP3(C1125850fP5 c1125850fP5, int i) {
        HashSet hashSet;
        HashMap map;
        c1125850fP5 = (i & 2) != 0 ? null : c1125850fP5;
        if ((i & 4) != 0) {
            hashSet = new HashSet();
        } else {
            hashSet = null;
        }
        if ((i & 8) != 0) {
            map = new HashMap();
        } else {
            map = null;
        }
        this(null, c1125850fP5, hashSet, map);
    }

    public C1125830fP3(C1125860fP6 c1125860fP6, C1125850fP5 c1125850fP5, HashSet<Long> hashSet, HashMap<Integer, C1125860fP6> map) {
        this.LIZ = c1125860fP6;
        this.LIZIZ = c1125850fP5;
        this.LIZJ = hashSet;
        this.LIZLLL = map;
    }

    public static C1125830fP3 LIZ(C1125830fP3 c1125830fP3, C1125860fP6 c1125860fP6, C1125850fP5 c1125850fP5, HashSet hashSet, HashMap map, int i) {
        if ((i & 1) != 0) {
            c1125860fP6 = c1125830fP3.LIZ;
        }
        if ((i & 2) != 0) {
            c1125850fP5 = c1125830fP3.LIZIZ;
        }
        if ((i & 4) != 0) {
            hashSet = c1125830fP3.LIZJ;
        }
        if ((i & 8) != 0) {
            map = c1125830fP3.LIZLLL;
        }
        return new C1125830fP3(c1125860fP6, c1125850fP5, hashSet, map);
    }
}
