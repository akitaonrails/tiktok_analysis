package X;

import Y.ARunnableS103S0200000_34;
import Y.ARunnableS38S1100000_34;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204721BQo {
    public final /* synthetic */ C1BRI LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C2204701BQm LIZJ;

    public final void LIZ(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fetch configurations failed, url: ");
        sbLIZ.append(this.LIZJ.LJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZJ.LJIIIZ.incrementAndGet() < 3) {
            C2204701BQm c2204701BQm = this.LIZJ;
            C1BRI c1bri = this.LIZ;
            String str = this.LIZIZ;
            c2204701BQm.LIZJ.LJI(c2204701BQm.LJ, str.getBytes(), new C2204721BQo(c2204701BQm, c1bri, str));
            return;
        }
        C1542840qFe c1542840qFe = C1543850qHH.LJIILIIL;
        c1542840qFe.LIZ = Boolean.FALSE;
        c1542840qFe.LIZIZ = th.getMessage();
        C2204811BQx c2204811BQx = new C2204811BQx();
        c2204811BQx.LIZJ(this.LIZJ.LJ, "url");
        c2204811BQx.LIZJ(this.LIZIZ, "param");
        c2204811BQx.LIZJ(th.getClass().getSimpleName(), "exception_name");
        c2204811BQx.LIZJ(th.getMessage(), "exception_message");
        c2204811BQx.LIZ("label_fetch_on_failed", C2204711BQn.LJII);
        C2204701BQm c2204701BQm2 = this.LIZJ;
        c2204701BQm2.LJFF.execute(new ARunnableS103S0200000_34(c2204701BQm2, this.LIZ, 0));
    }

    public final void LIZIZ(String str) {
        C2204701BQm c2204701BQm = this.LIZJ;
        c2204701BQm.getClass();
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "data"), "packages"), c2204701BQm.LIZJ.W2());
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (JSONObjectProtectorUtils.getJSONObject(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), "content").length() > 0) {
                    }
                }
                C1543850qHH.LJIILIIL.LIZ = Boolean.TRUE;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Fetch configurations succeed, url: ");
                sbLIZ.append(this.LIZJ.LJ);
                C2188811AlT.LIZIZ(sbLIZ);
                this.LIZJ.LJFF.execute(new ARunnableS38S1100000_34(this, str, 2));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("check response format failed, url: ");
            sbLIZ2.append(c2204701BQm.LJ);
            sbLIZ2.append(", response: ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("check response format failed, url: ");
        sbLIZ3.append(this.LIZJ.LJ);
        sbLIZ3.append(", response: ");
        sbLIZ3.append(str);
        LIZ(new Throwable(C2188811AlT.LIZIZ(sbLIZ3)));
    }

    public C2204721BQo(C2204701BQm c2204701BQm, C1BRI c1bri, String str) {
        this.LIZJ = c2204701BQm;
        this.LIZ = c1bri;
        this.LIZIZ = str;
    }
}
