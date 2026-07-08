package X;

import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0Qjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678760Qjq extends AbstractC677870QiP {
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;

    public C678760Qjq(k kVar) {
        this.LJI = "";
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIIZ = EnumC678770Qjr.LEVEL_NO.getValue();
        if (kVar instanceof n) {
            n nVar = (n) kVar;
            String strLIZLLL = C12869051v.LIZLLL(nVar, "uncorrected_text");
            if (strLIZLLL != null) {
                this.LJI = strLIZLLL;
            }
            String strLIZLLL2 = C12869051v.LIZLLL(nVar, "replace_text");
            if (strLIZLLL2 != null) {
                this.LJII = strLIZLLL2;
            }
            String strLIZLLL3 = C12869051v.LIZLLL(nVar, "correct_keyword");
            if (strLIZLLL3 != null) {
                this.LJIIIIZZ = strLIZLLL3;
            }
            Long lLIZJ = C12869051v.LIZJ(nVar, "correct_level");
            if (lLIZJ != null) {
                this.LJIIIZ = (int) lLIZJ.longValue();
            }
        }
    }
}
