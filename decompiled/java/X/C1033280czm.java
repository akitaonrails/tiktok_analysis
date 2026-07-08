package X;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0czm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033280czm {
    public final EnumC1033270czl LIZ;
    public final List<C1033460d04> LIZIZ;

    public final String LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (C1033460d04 c1033460d04 : this.LIZIZ) {
            jSONObject.put(c1033460d04.LIZ, c1033460d04.LIZIZ);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C1033280czm(EnumC1033270czl enumC1033270czl, List<C1033460d04> list) {
        this.LIZ = enumC1033270czl;
        this.LIZIZ = list;
    }
}
