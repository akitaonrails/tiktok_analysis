package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0qlt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562830qlt {
    public final String LIZ;
    public final HashMap<Integer, C1562870qlx> LIZIZ = new HashMap<>();
    public final C1562840qlu LIZJ = new C1562840qlu(this);
    public final C1562860qlw LIZLLL = new C1562860qlw(this);

    public C1562830qlt(String str) {
        this.LIZ = str;
    }

    public final C1562870qlx LIZ(int i) {
        HashMap<Integer, C1562870qlx> map = this.LIZIZ;
        Integer numValueOf = Integer.valueOf(i);
        C1562870qlx c1562870qlx = map.get(numValueOf);
        if (c1562870qlx == null) {
            c1562870qlx = new C1562870qlx();
            map.put(numValueOf, c1562870qlx);
        }
        return c1562870qlx;
    }
}
