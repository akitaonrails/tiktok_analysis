package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0xOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817550xOj {
    public final HashMap<String, String> LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;

    public C1817550xOj() {
        this(null, null, null, 15);
    }

    public C1817550xOj(HashMap map, String str, String str2, int i) {
        map = (i & 1) != 0 ? new HashMap() : map;
        str = (i & 2) != 0 ? "" : str;
        str2 = (i & 4) != 0 ? "" : str2;
        this.LIZ = map;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = false;
    }
}
