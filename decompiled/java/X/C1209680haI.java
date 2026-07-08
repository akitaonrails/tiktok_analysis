package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0haI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209680haI {
    public final Object LIZ;
    public final JSONObject LIZIZ;
    public final Map<String, Object> LIZJ;
    public List<? extends Class<? extends InterfaceC1063710dmr>> LIZLLL;
    public boolean LJ;

    public final C1209690haJ LIZ() {
        return new C1209690haJ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    public C1209680haI(JSONObject jSONObject, int i) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        jSONObject = (i & 2) != 0 ? null : jSONObject;
        if ((i & 4) != 0) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = null;
        }
        if ((i & 8) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        this.LIZ = null;
        this.LIZIZ = jSONObject;
        this.LIZJ = linkedHashMap;
        this.LIZLLL = arrayList;
        this.LJ = false;
    }
}
