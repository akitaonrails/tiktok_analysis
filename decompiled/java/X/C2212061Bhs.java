package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212061Bhs {
    public static volatile C2212061Bhs LJIIL;
    public volatile List<C2212201Bi6> LIZ;
    public volatile List<C2212201Bi6> LIZIZ;
    public long LJI;
    public volatile boolean LJIIIIZZ;
    public volatile C2349409Im LJIIIZ;
    public long LIZJ = 1800000;
    public long LIZLLL = 300000;
    public volatile long LJ = -1;
    public volatile long LJFF = -1;
    public final String LJII = "";
    public String LJIIJJI = "{}";
    public final List<String> LJIIJ = new ArrayList();

    public static C2212061Bhs LIZIZ() {
        if (LJIIL == null) {
            synchronized (C2212061Bhs.class) {
                try {
                    if (LJIIL == null) {
                        LJIIL = new C2212061Bhs();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIL;
    }

    public final String LIZJ() {
        if (!TextUtils.isEmpty(this.LJII) && !this.LJIIIIZZ) {
            synchronized (this) {
                try {
                    if (!this.LJIIIIZZ) {
                        try {
                            JSONObject jSONObject = new JSONObject(this.LJIIJJI);
                            jSONObject.put("vid", this.LJII);
                            this.LJIIJJI = C786410Ut5.J3(jSONObject);
                            this.LJIIIIZZ = true;
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJIIJJI;
    }

    public final void LIZ(int i, long j) {
        if (C2212231Bi9.LJIIIIZZ().LJIILJJIL) {
            List<String> list = this.LJIIJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j);
            sbLIZ.append(":");
            sbLIZ.append(i);
            ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
