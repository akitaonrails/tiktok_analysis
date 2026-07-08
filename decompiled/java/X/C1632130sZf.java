package X;

/* JADX INFO: renamed from: X.0sZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632130sZf {
    public static final void LIZ(C1662850tND c1662850tND, EnumC1641420soe enumC1641420soe, Integer num) {
        int i = C1632140sZg.LIZ[enumC1641420soe.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            if (i == 5) {
                if (num == null) {
                    c1662850tND.LJIIL(2, 0);
                    return;
                } else {
                    c1662850tND.LJIIL(5, num.intValue());
                    return;
                }
            }
            throw new C1954807lC();
        }
        c1662850tND.LJIIL(1, 0);
    }
}
