package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zZS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1901080zZS {
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public volatile AtomicInteger LIZ = new AtomicInteger(0);
    public String LJ = "";
    public String LJFF = "";

    public abstract JSONObject LIZ();

    public abstract JSONObject LIZIZ();

    public abstract JSONObject LIZJ();

    public void LIZLLL() {
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = "";
        this.LJFF = "";
        this.LIZ.set(0);
    }

    public abstract String LJ();

    public final boolean LJFF() {
        return this.LIZ.get() == 1;
    }

    public final void LJI() throws JSONException {
        if (this.LIZ.compareAndSet(1, 2)) {
            C793770VBv.LJII(LJ(), LIZ(), LIZJ(), LIZIZ());
            int i = 0;
            JSONObject[] jSONObjectArr = {LIZIZ(), LIZJ(), LIZ()};
            JSONObject jSONObject = new JSONObject();
            do {
                JSONObject jSONObject2 = jSONObjectArr[i];
                if (jSONObject2 != null) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObject2.get(next));
                    }
                }
                i++;
            } while (i < 3);
            if (jSONObject.length() > 0) {
                String str = C0NBD.LIZ;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("inbox_session_id", str);
                C20684815ws.LJIJ(LJ(), jSONObject);
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SLI EventName: ");
            sbLIZ.append(LJ());
            sbLIZ.append(" \n Category: ");
            sbLIZ.append(LIZ());
            sbLIZ.append(" \n Metric: ");
            sbLIZ.append(LIZJ());
            sbLIZ.append("  ExtraLog: ");
            sbLIZ.append(LIZIZ());
            C2188811AlT.LIZIZ(sbLIZ);
            LIZLLL();
        }
    }
}
