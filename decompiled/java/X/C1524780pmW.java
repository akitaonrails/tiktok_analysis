package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524780pmW {
    public C1525050pmx LIZ;

    public static C2220181Buy LIZ(C1525120pn4 c1525120pn4) {
        if (!c1525120pn4.LIZJ) {
            return new C2220181Buy(new C1525410pnX(true, c1525120pn4.LIZ, null, null), 0);
        }
        JSONObject jSONObject = c1525120pn4.LIZ;
        return new C2220181Buy(new C1525410pnX(false, null, new C1525420pnY(jSONObject.optInt("errNo", jSONObject.optInt("errorCode", EnumC1523070pjl.INTERNAL_ERROR.getCode())), jSONObject.optString("errMsg", "operate fail")), null), 1);
    }

    public final void LIZIZ(JSONObject jSONObject, C1525120pn4 c1525120pn4) throws JSONException {
        InterfaceC1525090pn1 interfaceC1525090pn1;
        InterfaceC1525090pn1 interfaceC1525090pn12;
        int iOptInt = jSONObject.optInt("socketTaskId", 0);
        int iOptInt2 = c1525120pn4.LIZ.optInt("socketTaskId", 0);
        if (iOptInt == 0) {
            iOptInt = iOptInt2;
        }
        JSONObject jSONObject2 = c1525120pn4.LIZ;
        int iOptInt3 = jSONObject2.optInt("errNo", jSONObject2.optInt("errorCode", EnumC1523070pjl.INTERNAL_ERROR.getCode()));
        String strOptString = c1525120pn4.LIZ.optString("errMsg", "operate fail");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("socketTaskId", iOptInt);
        jSONObject3.put("state", "error");
        jSONObject3.put("code", iOptInt3);
        jSONObject3.put("errMsg", strOptString);
        C1525050pmx c1525050pmx = this.LIZ;
        if (c1525050pmx != null && (interfaceC1525090pn12 = c1525050pmx.LIZIZ) != null) {
            interfaceC1525090pn12.emitJSAPIEvent("SocketTaskStateChange", jSONObject3);
        }
        C1525050pmx c1525050pmx2 = this.LIZ;
        if (c1525050pmx2 != null && (interfaceC1525090pn1 = c1525050pmx2.LIZIZ) != null) {
            interfaceC1525090pn1.emitJSAPIEvent("onSocketTaskError", jSONObject3);
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [X.0pmJ] */
    public final C2220181Buy LIZJ(int i, JSONObject jSONObject) throws JSONException {
        C2220181Buy c2220181BuyLIZ;
        InterfaceC1525090pn1 interfaceC1525090pn1;
        InterfaceC1525090pn1 interfaceC1525090pn12;
        final InterfaceC1524590pmD interfaceC1524590pmD;
        try {
            C1525050pmx c1525050pmx = this.LIZ;
            if (c1525050pmx != null) {
                interfaceC1524590pmD = c1525050pmx.LIZ;
            } else {
                interfaceC1524590pmD = null;
            }
            C1525120pn4 c1525120pn4 = new Object(interfaceC1524590pmD) { // from class: X.0pmJ
                public final InterfaceC1524590pmD LIZ;

                {
                    this.LIZ = interfaceC1524590pmD;
                }

                /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C1525180pnA LIZ(org.json.JSONObject r25) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 463
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1524650pmJ.LIZ(org.json.JSONObject):X.0pnA");
                }
            }.LIZ(jSONObject).LIZ;
            if (c1525120pn4 == null) {
                c2220181BuyLIZ = C2220181Buy.LJFF;
            } else {
                if (c1525120pn4.LIZJ) {
                    LIZIZ(jSONObject, c1525120pn4);
                }
                c2220181BuyLIZ = LIZ(c1525120pn4);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("state", "error");
            jSONObject2.put("socketTaskId", jSONObject.optInt("socketTaskId", 0));
            jSONObject2.put("errorCode", -1);
            String message = th.getMessage();
            if (message == null) {
                message = "operate fail";
            }
            jSONObject2.put("errorMsg", message);
            C1525050pmx c1525050pmx2 = this.LIZ;
            if (c1525050pmx2 != null && (interfaceC1525090pn1 = c1525050pmx2.LIZIZ) != null) {
                interfaceC1525090pn1.emitJSAPIEvent("SocketTaskStateChange", jSONObject2);
            }
            c2220181BuyLIZ = C2220181Buy.LJFF;
        }
        C1525050pmx c1525050pmx3 = this.LIZ;
        if (c1525050pmx3 != null && (interfaceC1525090pn12 = c1525050pmx3.LIZIZ) != null) {
            interfaceC1525090pn12.LJJLIIJ(Integer.valueOf(i), c2220181BuyLIZ);
        }
        return c2220181BuyLIZ;
    }
}
