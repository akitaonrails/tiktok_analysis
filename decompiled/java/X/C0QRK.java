package X;

import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QRK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QRK extends C09AY implements InterfaceC1631630sYr<String, C0QRQ, JSONObject, Map<String, String>, Unit> {
    public C0QRK() {
        super(4);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, C0QRQ c0qrq, JSONObject jSONObject, Map<String, String> map) {
        int i;
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        Map<String, String> map2 = map;
        C0QRW c0qrw = c0qrq.LIZJ;
        if (c0qrw != null && ((i = C0QRM.LIZ[c0qrw.ordinal()]) == 1 || i == 2 || i == 3)) {
            C0QOK.LIZ.getClass();
            C0QOK.LIZIZ(jSONObject2, str2, map2);
        }
        return Unit.LIZ;
    }
}
