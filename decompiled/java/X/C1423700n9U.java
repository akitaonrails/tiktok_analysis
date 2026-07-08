package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0n9U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423700n9U {
    public final List<Integer> LIZ;
    public final Map<Integer, Integer> LIZIZ;
    public final int LIZJ;

    public final int LIZ(int i) {
        this.LIZIZ.get(Integer.valueOf(i));
        Integer num = this.LIZIZ.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public C1423700n9U(int i, List list, Map map) {
        this.LIZ = list;
        this.LIZIZ = map;
        this.LIZJ = i;
    }
}
