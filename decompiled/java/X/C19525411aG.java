package X;

import java.util.Map;

/* JADX INFO: renamed from: X.11aG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19525411aG extends AbstractC19524811aA<Long> {
    public final Map<String, Long> LIZIZ;

    public C19525411aG(Map<String, Long> map) {
        super(map);
        this.LIZIZ = map;
    }

    @Override // X.AbstractC19524811aA
    public final void LIZ(InterfaceC19526611aS interfaceC19526611aS, C19525911aL c19525911aL) {
        long jLongValue;
        long j = c19525911aL.LIZLLL - c19525911aL.LJ;
        Map<String, Long> map = this.LIZIZ;
        String str = c19525911aL.LIZ;
        Long l = map.get(str);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        map.put(str, Long.valueOf(Math.max(j, jLongValue)));
    }
}
