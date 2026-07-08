package X;

import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524940pmm {
    public C1525020pmu LIZ;
    public C1525000pms LIZIZ;
    public final C1524990pmr LIZJ = new C09BR() { // from class: X.0pmr
        @Override // X.C09BR
        public final void LIZIZ(int i) throws JSONException {
            C1524940pmm c1524940pmm = this.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("socketId", i);
            jSONObject.put("state", "close");
            c1524940pmm.LIZJ(jSONObject);
        }

        @Override // X.C09BR
        public final void LIZJ(int i) throws JSONException {
            C1524940pmm c1524940pmm = this.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("socketId", i);
            jSONObject.put("state", "listening");
            c1524940pmm.LIZJ(jSONObject);
        }

        @Override // X.C09BR
        public final void onError(int i, int i2, String str) throws JSONException {
            this.LIZ.LIZIZ(i, i2, str);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // X.C09BR
        public final void LIZLLL(int i, int i2, int i3, int i4, String str, String str2, String str3) throws JSONException {
            String str4;
            if (a0.LJJIIZI(str2, ":", false)) {
                str4 = "IPv6";
            } else {
                str4 = "IPv4";
            }
            C1524940pmm c1524940pmm = this.LIZ;
            JSONObject jSONObject = new JSONObject();
            C1524940pmm c1524940pmm2 = this.LIZ;
            jSONObject.put("socketId", i);
            jSONObject.put("state", "message");
            jSONObject.put("message", str);
            jSONObject.put("messageType", "arraybuffer");
            c1524940pmm2.getClass();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("address", str2);
            jSONObject2.put("port", i2);
            jSONObject2.put("family", str4);
            jSONObject2.put("size", i4);
            jSONObject.put("remoteInfo", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("address", str3);
            jSONObject3.put("port", i3);
            jSONObject3.put("family", str4);
            jSONObject.put("localInfo", jSONObject3);
            c1524940pmm.LIZJ(jSONObject);
        }
    };

    public static C2220181Buy LIZ(C1525120pn4 c1525120pn4) {
        if (!c1525120pn4.LIZJ) {
            return new C2220181Buy(new C1525410pnX(true, c1525120pn4.LIZ, null, null), 0);
        }
        JSONObject jSONObject = c1525120pn4.LIZ;
        return new C2220181Buy(new C1525410pnX(false, null, new C1525420pnY(jSONObject.optInt("errNo", EnumC1523070pjl.INTERNAL_ERROR.getCode()), jSONObject.optString("errMsg", "operate fail")), null), 1);
    }

    public final void LIZJ(JSONObject jSONObject) {
        InterfaceC1525090pn1 interfaceC1525090pn1;
        C1525020pmu c1525020pmu = this.LIZ;
        if (c1525020pmu != null && (interfaceC1525090pn1 = c1525020pmu.LIZJ) != null) {
            interfaceC1525090pn1.emitJSAPIEvent("UDPSocketTaskStateChange", jSONObject);
        }
    }

    public final void LIZIZ(int i, int i2, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("socketId", i);
        jSONObject.put("state", "error");
        jSONObject.put("errCode", i2);
        jSONObject.put("errMsg", str);
        LIZJ(jSONObject);
    }
}
