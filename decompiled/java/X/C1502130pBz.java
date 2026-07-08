package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502130pBz {
    public final List<C1502120pBy> LIZ;

    public final C1502140pC0 LIZIZ() {
        return new C1502140pC0(null, this.LIZ, 1);
    }

    public C1502130pBz() {
        this.LIZ = new ArrayList();
    }

    public C1502130pBz(C1502140pC0 c1502140pC0) {
        List<C1502120pBy> list = c1502140pC0.LIZ;
        this.LIZ = new ArrayList(list == null ? null : list);
    }

    public final void LIZJ(JSONObject jSONObject) {
        ((ArrayList) this.LIZ).clear();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                ((ArrayList) this.LIZ).add(new C1502120pBy(next, strOptString));
            }
        }
    }

    public final void LIZ(String str, String str2) {
        ((ArrayList) this.LIZ).add(new C1502120pBy(str, str2));
    }
}
