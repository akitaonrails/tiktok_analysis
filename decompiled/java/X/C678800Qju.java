package X;

import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0Qju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678800Qju extends AbstractC677870QiP {
    public final String LJI;
    public final String LJII;

    public C678800Qju(k kVar) {
        this.LJI = "";
        this.LJII = "";
        if (kVar instanceof n) {
            n nVar = (n) kVar;
            String strLIZLLL = C12869051v.LIZLLL(nVar, "title");
            if (strLIZLLL != null) {
                this.LJI = strLIZLLL;
            }
            String strLIZLLL2 = C12869051v.LIZLLL(nVar, "content");
            if (strLIZLLL2 != null) {
                this.LJII = strLIZLLL2;
            }
            C12869051v.LIZLLL(nVar, "button");
        }
    }
}
