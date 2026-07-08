package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10rD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19375710rD implements Cloneable {
    public int LL;
    public JSONObject LLILLJJLI;

    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C19375710rD clone() {
        C19375710rD c19375710rD = (C19375710rD) super.clone();
        c19375710rD.LL = this.LL;
        try {
            c19375710rD.LLILLJJLI = new JSONObject(C786410Ut5.J3(this.LLILLJJLI));
            return c19375710rD;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return c19375710rD;
        }
    }
}
