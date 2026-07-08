package X;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0djf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1061730djf extends AbstractC1061750djh {
    public final EnumC1059790dgX LIZ = EnumC1059790dgX.WEB;

    @Override // X.AbstractC1061750djh
    public final EnumC1059790dgX LIZ() {
        return this.LIZ;
    }

    public static C1323860kYS LIZLLL(Map map) {
        if (map == null) {
            return null;
        }
        return new C1323860kYS(C2348409Ic.LIZLLL(map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0djg] */
    public final void LIZJ(final InterfaceC1061790djl interfaceC1061790djl, final C1061110dif c1061110dif) {
        Iterator it2 = C2097608Jq.LJIIZILJ(((C1061100die) c1061110dif.LIZ.getValue()).LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            interfaceC1061790djl.LIZ((String) ((Map.Entry) it2.next()).getKey(), new InterfaceC1051760dTa() { // from class: X.0djg
                @Override // X.InterfaceC1051760dTa
                public final void call(final C1058910df7 c1058910df7, JSONObject jSONObject) throws JSONException {
                    JSONObject jSONObject2 = c1058910df7.LIZLLL;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    jSONObject2.put("func", c1058910df7.LIZJ);
                    c1058910df7.LJIIJJI = false;
                    C1061730djf c1061730djf = this.LL;
                    String str = c1058910df7.LIZJ;
                    C1323860kYS c1323860kYS = new C1323860kYS(jSONObject2);
                    final InterfaceC1061790djl interfaceC1061790djl2 = interfaceC1061790djl;
                    c1061730djf.LIZIZ(str, c1323860kYS, new InterfaceC1063920dnC() { // from class: X.0dji
                        @Override // X.InterfaceC1063920dnC
                        public final void LIZ(Map<String, Object> map) {
                            interfaceC1061790djl2.LIZIZ(c1058910df7.LIZIZ, new JSONObject(map));
                        }
                    }, c1061110dif);
                }
            });
        }
    }
}
