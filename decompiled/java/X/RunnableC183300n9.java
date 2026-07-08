package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.00n9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC183300n9 implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    public RunnableC183300n9(String str, Map<String, String> map, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = map;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    public final void LIZ() throws JSONException {
        Set<Map.Entry<String, String>> setEntrySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("bizType", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("slotId", str2);
        w.LIZ.getClass();
        linkedHashMap.put("enter_from_merge", w.LJIIIZ());
        linkedHashMap.put("enter_method", w.LJIIL());
        linkedHashMap.put("action_type", w.LIZLLL());
        linkedHashMap.put("room_id", String.valueOf(w.LJIJJ()));
        linkedHashMap.put("anchor_id", String.valueOf(w.LJ()));
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = this.LLILLJJLI;
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            jSONObject.put((String) entry2.getKey(), entry2.getValue());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttlive_");
        sbLIZ.append(this.LL);
        C1CC2.LJIIL(0, C2188811AlT.LIZIZ(sbLIZ), jSONObject);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("livesdk_");
        sbLIZ2.append(this.LL);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c474500IjALIZ.LJJIIZI(this.LLILLJJLI);
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SlotLogger@c9a.monitorLog$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SlotLogger@c9a.monitorLog$1");
    }
}
