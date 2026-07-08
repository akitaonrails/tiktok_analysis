package X;

/* JADX INFO: renamed from: X.1Apr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191531Apr extends AbstractC2191611Apz {
    public static final long LIZ(C1513780pUm<C2191511App, Long> c1513780pUm, int i, InterfaceC2190291Anr interfaceC2190291Anr, Long l) {
        boolean z;
        int i2 = 0;
        if (((Number) C2191131ApD.LIZJ.getValue()).longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLongValue = 0;
        for (C1513780pUm<C2191511App, Long>.a aVar : c1513780pUm.LIZ(i)) {
            Long l2 = aVar.LIZIZ;
            if (l2 != null) {
                l2.longValue();
                C2191511App c2191511App = aVar.LIZ;
                if (c2191511App != null) {
                    if (z && jCurrentTimeMillis - c2191511App.getTimeStamp() > ((Number) C2191131ApD.LIZJ.getValue()).longValue()) {
                        break;
                    }
                    i2++;
                    jLongValue += aVar.LIZIZ.longValue();
                } else {
                    continue;
                }
            }
        }
        if (i2 == 0) {
            return 0L;
        }
        if (interfaceC2190291Anr != null) {
            interfaceC2190291Anr.LIZ(Float.valueOf(i2 / i), "available_sample_ratio");
            interfaceC2190291Anr.LIZ(Integer.valueOf(i2), "sample_count");
        }
        return jLongValue / ((long) i2);
    }
}
