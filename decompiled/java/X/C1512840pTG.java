package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0pTG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512840pTG extends C1702170uOd {
    public final double LIZIZ;
    public final double LIZJ;

    @Override // X.C1702170uOd
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cpu-usage-percent:");
        sbLIZ.append(C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.LIZIZ)}, 1)));
        sbLIZ.append("cpu-speed-percent:");
        sbLIZ.append(C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.LIZJ)}, 1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1512840pTG(double d, double d2) {
        this.LIZIZ = d;
        this.LIZJ = d2;
    }
}
