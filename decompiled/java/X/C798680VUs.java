package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0VUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798680VUs {
    public Double LIZ;
    public List<C798640VUo> LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public final Map<String, String> LJ = new LinkedHashMap();

    public final synchronized C798690VUt LJFF() {
        Double d = this.LIZ;
        if (d == null) {
            return null;
        }
        double dDoubleValue = d.doubleValue();
        List<C798640VUo> list = this.LIZIZ;
        if (list == null) {
            return null;
        }
        Long l = this.LIZJ;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        Long l2 = this.LIZLLL;
        if (l2 == null) {
            return null;
        }
        long jLongValue2 = l2.longValue();
        long j = jLongValue2 - jLongValue;
        Map<String, String> map = this.LJ;
        if (!(!map.isEmpty())) {
            map = null;
        }
        return new C798690VUt(dDoubleValue, list, jLongValue, jLongValue2, j, map);
    }

    public final synchronized void LIZ(Map<String, String> map) {
        this.LJ.putAll(map);
    }

    public final synchronized boolean LIZIZ(List<C798640VUo> list) {
        if (this.LIZIZ == null) {
            this.LIZIZ = list;
            return true;
        }
        return false;
    }

    public final synchronized void LIZJ(long j) {
        this.LIZLLL = Long.valueOf(j);
    }

    public final synchronized boolean LIZLLL(double d) {
        if (this.LIZ == null) {
            this.LIZ = Double.valueOf(d);
            return true;
        }
        return false;
    }

    public final synchronized void LJ(long j) {
        this.LIZJ = Long.valueOf(j);
    }
}
