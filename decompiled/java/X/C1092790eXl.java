package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS32S0000100_17;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092790eXl {
    public static final C1092790eXl LIZ = new C1092790eXl();

    public static List LIZIZ() {
        C1092800eXm c1092800eXm;
        List<String> listLIZ = InterfaceC1093700eZE.Of.LIZ();
        if (listLIZ == null) {
            listLIZ = C13BV.INSTANCE;
        }
        C13DV c13dv = new C13DV(listLIZ.size());
        Iterator<String> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            try {
                JSONObject jSONObject = new JSONObject(it2.next());
                c1092800eXm = new C1092800eXm(jSONObject.optString("uid", ""), jSONObject.optString("anchor_id", ""), jSONObject.optLong("time_ts", 0L), jSONObject.optString("guidance_key", ""));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1092800eXm = null;
            }
            if (c1092800eXm != null) {
                c13dv.add(c1092800eXm);
            }
        }
        return C1697820uHc.LIZ(c13dv);
    }

    public static void LIZ(List list) throws JSONException {
        C0JT6<List<String>> c0jt6 = InterfaceC1093700eZE.Of;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1092800eXm c1092800eXm : (ArrayList) list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", c1092800eXm.LIZ);
            jSONObject.put("anchor_id", c1092800eXm.LIZIZ);
            jSONObject.put("time_ts", c1092800eXm.LIZJ);
            jSONObject.put("guidance_key", c1092800eXm.LIZLLL);
            arrayList.add(C786410Ut5.J3(jSONObject));
        }
        c0jt6.LIZJ(arrayList);
    }

    public static List LIZJ(long j, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            C1092800eXm c1092800eXm = (C1092800eXm) obj;
            if (c1092800eXm.LIZ.length() > 0 && c1092800eXm.LIZIZ.length() > 0 && c1092800eXm.LIZLLL.length() > 0 && c1092800eXm.LIZJ > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.size() > 40) {
            C19719612Di.LJJIIJ(arrayList2, new AwS32S0000100_17(j, 2), true);
        }
        return arrayList2;
    }
}
