package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00dE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C121800dE extends C09AY implements Function1<C923390a8X, Unit> {
    public C121800dE() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C923390a8X c923390a8X) throws JSONException {
        List<C923440a8c> list = c923390a8X.LIZ;
        ArrayList arrayList = new ArrayList();
        for (C923440a8c c923440a8c : list) {
            if (c923440a8c.LIZJ != null) {
                arrayList.add(c923440a8c);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            Long l = ((C923380a8W) obj).LIZJ;
            Object arrayList2 = linkedHashMap.get(l);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(l, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList3.add(String.valueOf(((C923380a8W) it2.next()).LIZ));
            }
            linkedHashMap2.put(key, arrayList3);
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            jSONObject.put(String.valueOf(entry2.getKey()), new JSONArray((Collection) entry2.getValue()));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("roomGuests", jSONObject);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Sending LiveCohostGuestChangedEvent event ");
        sbLIZ.append(jSONObject2);
        C20441214yg.LIZIZ("CoHostEventSender", C2188811AlT.LIZIZ(sbLIZ));
        C389001fE.LIZ("LiveCohostGuestChangedEvent", jSONObject2, System.currentTimeMillis(), false);
        return Unit.LIZ;
    }
}
