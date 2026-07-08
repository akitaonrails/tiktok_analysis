package X;

import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0phP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521610phP implements InterfaceC1521900phs {
    public final AbstractC1514820pWS<?> LIZ;
    public final boolean LIZIZ;

    public C1521610phP(AbstractC1514820pWS<?> abstractC1514820pWS, boolean z) {
        this.LIZ = abstractC1514820pWS;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC1521900phs
    public final void LIZ(final Object obj, final AbstractC1521830phl abstractC1521830phl) {
        if (obj != null && (obj instanceof JSONObject)) {
            C1491570oux.LJI(C1491570oux.LIZ, this.LIZ.LLILZIL, new InterfaceC1491630ov3() { // from class: X.0phS
                @Override // X.InterfaceC1491630ov3
                public final void onReceiveValue(Object obj2) {
                    C1491690ov9 c1491690ov9 = (C1491690ov9) obj2;
                    if (c1491690ov9 != null) {
                        if (!this.LIZ.LIZIZ) {
                            C1521610phP.LIZIZ(c1491690ov9, (JSONObject) obj, "user");
                            return;
                        } else {
                            C1521610phP.LIZIZ(c1491690ov9, ((JSONObject) obj).optJSONObject("value"), ((JSONObject) obj).optString("path"));
                            return;
                        }
                    }
                    abstractC1521830phl.LIZ();
                }
            });
        } else {
            abstractC1521830phl.LIZ();
        }
    }

    public static void LIZIZ(C1491690ov9 c1491690ov9, JSONObject jSONObject, String str) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null && ((objOpt instanceof Long) || (objOpt instanceof Integer) || (objOpt instanceof Float) || (objOpt instanceof Double) || (objOpt instanceof String) || (objOpt instanceof Boolean))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(next);
                c1491690ov9.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(objOpt));
            }
        }
    }
}
