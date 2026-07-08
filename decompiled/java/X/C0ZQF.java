package X;

import java.util.List;

/* JADX INFO: renamed from: X.0ZQF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZQF {
    public static final List<C1562980qm8<C0ZL0>> LIZ(C869590Y9l c869590Y9l, C0ZQI c0zqi) {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (c0zqi.LJI(c869590Y9l) && c869590Y9l.getMsgId() > 0) {
            c13dvLIZIZ.add(c0zqi.LJIIL(c869590Y9l));
        }
        if (c0zqi.LJIIJ(c869590Y9l)) {
            c13dvLIZIZ.addAll(c0zqi.LJIIIIZZ(c869590Y9l));
        }
        if (c0zqi.LJFF(c869590Y9l)) {
            c13dvLIZIZ.add(c0zqi.LJIIIZ(c869590Y9l));
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }
}
