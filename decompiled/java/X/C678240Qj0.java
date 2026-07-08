package X;

import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0Qj0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678240Qj0 extends AbstractC677870QiP {
    public final String LJI;
    public final String LJII;
    public String LJIIIIZZ;
    public final long LJIIIZ;

    public C678240Qj0(k kVar) {
        this.LJI = "";
        this.LJII = "";
        this.LJIIIIZZ = "";
        if (kVar instanceof n) {
            n nVar = (n) kVar;
            String strLIZLLL = C12869051v.LIZLLL(nVar, "lynx_card_key");
            if (strLIZLLL != null) {
                this.LJI = strLIZLLL;
                this.LJII = C677490Qhn.LIZJ(strLIZLLL);
                C677490Qhn.LIZ(strLIZLLL);
            }
            String strLIZLLL2 = C12869051v.LIZLLL(nVar, "raw_data");
            if (strLIZLLL2 != null) {
                this.LJIIIIZZ = strLIZLLL2;
            }
            Long lLIZIZ = C678560QjW.LIZIZ(nVar, "height");
            if (lLIZIZ != null) {
                this.LJIIIZ = lLIZIZ.longValue();
            }
            Long lLIZIZ2 = C678560QjW.LIZIZ(nVar, "width");
            if (lLIZIZ2 != null) {
                lLIZIZ2.longValue();
            }
        }
    }
}
