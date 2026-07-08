package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0J5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486270J5d {
    public Map<String, String> LIZ;
    public String LIZIZ;
    public String LIZJ;

    public C486270J5d() {
        this(null, 7);
    }

    public C486270J5d(Map map, int i) {
        String str;
        map = (i & 1) != 0 ? null : map;
        if ((i & 2) != 0) {
            str = "";
        } else {
            str = null;
        }
        this.LIZ = map;
        this.LIZIZ = str;
        this.LIZJ = null;
    }
}
