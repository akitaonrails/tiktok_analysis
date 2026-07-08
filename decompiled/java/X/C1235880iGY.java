package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iGY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235880iGY implements InterfaceC1235890iGZ {
    public static final /* synthetic */ int LJII = 0;
    public final C1749280vcc LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public String LJI = C2211631BhB.LJII();

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C1749280vcc c1749280vcc = this.LIZ;
        Boolean boolValueOf = null;
        if (c1749280vcc.LLJILJIL) {
            C197039127h c197039127h = c1749280vcc.LLIZ;
            C197039127h c197039127h2 = c197039127h != null ? c197039127h : null;
            boolean z = c197039127h2.LLLIIIIL;
            c197039127h2.LLLIIIIL = false;
            boolValueOf = Boolean.valueOf(z);
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            jSONObject.put("retry_method", "click_retry_button");
        } else {
            jSONObject.put("retry_method", "tap_to_retry");
        }
        long j = this.LIZJ - this.LIZLLL;
        this.LJ += j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZLLL = jCurrentTimeMillis;
        jSONObject.put("retry_duration", jCurrentTimeMillis - this.LIZJ).put("retry_wait", j);
        return jSONObject;
    }

    public final void LIZJ() {
        if (this.LJFF > 0) {
            try {
                JSONObject jSONObjectPut = new JSONObject().put("retry_result", 0).put("retry_time_count", this.LIZIZ).put("stay_duration", System.currentTimeMillis() - this.LJFF);
                int i = this.LIZIZ;
                LIZIZ("prf_leave_network_error_page", jSONObjectPut.put("retry_wait_avg", i != 0 ? this.LJ / ((long) i) : 0L));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LJ();
    }

    public final void LJ() {
        C1749280vcc c1749280vcc = this.LIZ;
        c1749280vcc.getClass();
        c1749280vcc.LLJJJJLIIL = C618310OMz.LIZ;
        this.LIZIZ = 0;
        C1749280vcc c1749280vcc2 = this.LIZ;
        if (c1749280vcc2.LLJILJIL) {
            C197039127h c197039127h = c1749280vcc2.LLIZ;
            if (c197039127h == null) {
                c197039127h = null;
            }
            c197039127h.LLLIIIIL = false;
        }
        this.LIZJ = 0L;
        this.LJ = 0L;
        this.LJFF = 0L;
        this.LIZLLL = 0L;
    }

    public C1235880iGY(C1749280vcc c1749280vcc) {
        this.LIZ = c1749280vcc;
    }

    public final void LIZLLL(boolean z) {
        long j = 0;
        try {
            if (z) {
                if (this.LJFF > 0) {
                    LIZIZ("prf_network_error_page_retry", LIZ().put("retry_result", 1));
                    JSONObject jSONObjectPut = new JSONObject().put("retry_result", 1).put("retry_time_count", this.LIZIZ).put("stay_duration", System.currentTimeMillis() - this.LJFF);
                    int i = this.LIZIZ;
                    if (i != 0) {
                        j = this.LJ / ((long) i);
                    }
                    LIZIZ("prf_leave_network_error_page", jSONObjectPut.put("retry_wait_avg", j));
                    LJ();
                    return;
                }
                return;
            }
            if (this.LJFF > 0) {
                LIZIZ("prf_network_error_page_retry", LIZ().put("retry_result", 0));
                return;
            }
            LJ();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.LJFF = jCurrentTimeMillis;
            this.LIZLLL = jCurrentTimeMillis;
            LIZIZ("prf_enter_network_error_page", new JSONObject());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        if (this.LJI == null) {
            this.LJI = C2211631BhB.LJII();
        }
        C845850XGd.LIZ(this.LIZ.getContext(), str, this.LJI, jSONObject);
    }
}
