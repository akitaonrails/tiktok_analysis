package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XCG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0XCG {
    public abstract JSONObject LIZ();

    public abstract void LIZJ();

    public final void LIZIZ(C844770XBz c844770XBz, String str) {
        JSONObject jSONObjectLIZ = LIZ();
        InterfaceC844540XBc interfaceC844540XBc = c844770XBz.LJJII;
        if (interfaceC844540XBc != null) {
            ((C2210711Bfh) interfaceC844540XBc).LIZ(str, jSONObjectLIZ);
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EventTracking  ");
                sbLIZ.append(str);
                sbLIZ.append(c844770XBz.LIZ);
                sbLIZ.append(", ");
                sbLIZ.append(jSONObjectLIZ);
                C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            LIZJ();
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EventTracking  ");
                sbLIZ2.append(str);
                sbLIZ2.append(c844770XBz.LIZ);
                sbLIZ2.append(" reset.");
                C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }
}
