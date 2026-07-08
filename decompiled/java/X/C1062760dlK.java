package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dlK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1062760dlK implements InterfaceC1051760dTa {
    public final WeakReference<Context> LL;

    public C1062760dlK(WeakReference<Context> weakReference) {
        this.LL = weakReference;
    }

    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        JSONObject jSONObject2;
        Activity activityLIZ;
        if (C086J.LIZIZ(this.LL) == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "h5");
        C20684815ws.LJIILLIIL("qr_code_scan_enter", c2344009Gk.LIZ);
        if (c1058910df7.LIZLLL.has("args")) {
            jSONObject2 = JSONObjectProtectorUtils.getJSONObject(c1058910df7.LIZLLL, "args");
        } else {
            jSONObject2 = null;
        }
        C19286910ct.LIZIZ.LIZLLL(C086J.LIZIZ(this.LL));
        if (jSONObject2 != null && jSONObject2.has("should_close_self")) {
            try {
                if (JSONObjectProtectorUtils.getBoolean(jSONObject2, "should_close_self") && (activityLIZ = C1388190mED.LIZ(C086J.LIZIZ(this.LL))) != null) {
                    activityLIZ.finish();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
