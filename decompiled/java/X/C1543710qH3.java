package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qH3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543710qH3 implements InterfaceC1317280kNq {
    public C1543410qGZ LIZ;

    @Override // X.InterfaceC1317280kNq
    public final void destroy() {
    }

    @Override // X.InterfaceC1317280kNq
    public final void LIZ(String str, String str2, final C1317200kNi c1317200kNi) {
        Object c098200Yq;
        try {
            c098200Yq = new JSONObject(str2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C1543410qGZ c1543410qGZ = this.LIZ;
        if (c1543410qGZ == null) {
            c1543410qGZ = null;
        }
        C1543190qGD c1543190qGD = c1543410qGZ.LIZ.LIZ;
        C1543200qGE c1543200qGE = c1543190qGD.LIZIZ;
        if (c1543200qGE != null) {
            C1543910qHN c1543910qHN = new C1543910qHN(c1543190qGD);
            c1543910qHN.LJ = jSONObject.optString("__callback_id", "prefetch_callback");
            c1543910qHN.LJFF = str;
            c1543910qHN.LJII = jSONObject.optString("__msg_type", "callback");
            c1543910qHN.LJIIIIZZ = jSONObject.optJSONObject("data");
            c1543910qHN.LJIIJ = "";
            c1543910qHN.LJIJ = EnumC1543740qH6.SDUI;
            c1543200qGE.LIZ(c1543910qHN, new InterfaceC1543240qGI() { // from class: X.0qHB
                @Override // X.InterfaceC1543240qGI
                public final void LJFF(C1543440qGc c1543440qGc, C1543910qHN c1543910qHN2) {
                    InterfaceC1317400kO2 interfaceC1317400kO2 = c1317200kNi;
                    if (interfaceC1317400kO2 != null) {
                        interfaceC1317400kO2.LIZ(C786410Ut5.J3(c1543440qGc.LIZIZ()));
                    }
                }
            }, c1543190qGD, null);
        }
    }
}
