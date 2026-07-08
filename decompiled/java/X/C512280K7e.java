package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0K7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512280K7e {
    public static final /* synthetic */ int LJ = 0;
    public String LIZ = "";
    public final Map<String, Object> LIZIZ = new LinkedHashMap();
    public final Map<String, Object> LIZJ = new LinkedHashMap();
    public final Map<String, String> LIZLLL = new LinkedHashMap();

    public final void LIZ(Throwable th) {
        if (th == null) {
            return;
        }
        Map<String, String> map = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String strLIZLLL = C512300K7g.LIZLLL(th);
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(th);
        map.put("error_message", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LIZIZ.containsKey("error_code")) {
            this.LIZIZ.put("error_code", Integer.valueOf(C512300K7g.LIZIZ(th)));
        }
        this.LIZIZ.put("error_type", C512300K7g.LIZJ(th));
        this.LIZLLL.put("log_id", C512300K7g.LJ(th));
    }

    public final void LIZLLL(C0K6J c0k6j) {
        C0K6K.LIZ("", this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, c0k6j);
    }

    public final void LJ(C0K6J c0k6j) {
        C0K6K.LIZ("subscription_payment", this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, c0k6j);
    }

    public final void LIZIZ(Object obj, String str) {
        this.LIZLLL.put(str, obj.toString());
    }

    public final void LIZJ(Object obj, String str) {
        this.LIZLLL.put(str, obj.toString());
    }
}
