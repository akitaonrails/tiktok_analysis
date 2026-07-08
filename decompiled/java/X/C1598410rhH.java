package X;

import Y.AComparatorS521S0100000_24;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0rhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598410rhH {
    public final HashMap<Integer, Integer> LIZ;
    public int LIZIZ;
    public final AComparatorS521S0100000_24 LIZJ;

    public C1598410rhH() {
        HashMap<Integer, Integer> map = new HashMap<>();
        this.LIZ = map;
        this.LIZIZ = -1;
        map.put(6, 6000);
        if (C1601110rld.LIZ()) {
            map.put(5, 5000);
            map.put(9, 5500);
            map.put(10, 5499);
        } else {
            map.put(5, 7000);
        }
        this.LIZJ = new AComparatorS521S0100000_24(this, 0);
    }

    public final int LIZ(int i) {
        Integer num = this.LIZ.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 100000;
    }
}
