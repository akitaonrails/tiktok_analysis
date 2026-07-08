package X;

import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1G0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2325371G0p implements InterfaceC2211931Bhf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2211931Bhf
    public final void LIZ(View view, String str) throws JSONException {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view, str);
                break;
            case 1:
                LIZ$1(this, view, str);
                break;
        }
    }

    public C2325371G0p(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C2325371G0p c2325371G0p, View view, String str) {
        ((C1AWL) c2325371G0p.l0).LIZ(true);
    }

    public static final void LIZ$1(C2325371G0p c2325371G0p, View view, String str) throws JSONException {
        C1537720q7O c1537720q7O = (C1537720q7O) c2325371G0p.l0;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("visible", true);
        c1537720q7O.LIZ("visibilityChange", jSONObject);
    }
}
