package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0flx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140030flx extends AbstractC1140560fmo<C1139800fla, C1140030flx> {
    public C1140030flx() {
        super(new C1139800fla());
    }

    public final void LIZIZ(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys;
        if (jSONObject == null || (itKeys = jSONObject.keys()) == null) {
            return;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            ((C1139800fla) this.LIZ).LJIILLIIL.put(next, jSONObject.opt(next));
        }
    }
}
