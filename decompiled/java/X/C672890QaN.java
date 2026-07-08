package X;

import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672890QaN implements InterfaceC2753014t {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final CopyOnWriteArrayList<C672880QaM> LL = new CopyOnWriteArrayList<>();

    public C672890QaN() {
        UUID.randomUUID().toString();
    }

    public final void LIZJ(EnumC669620QOi enumC669620QOi) {
        LIZ(enumC669620QOi, "network_not_available");
    }

    public static void LIZIZ(C672880QaM c672880QaM, String str) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("log_scene", str);
        jSONObject.put("search_id", c672880QaM.LIZJ);
        jSONObject.put("group_id", c672880QaM.LIZLLL);
        jSONObject.put("search_type", c672880QaM.LIZIZ);
        jSONObject.put("search_keyword", c672880QaM.LJ);
        jSONObject.put("enter_from", c672880QaM.LJFF);
        jSONObject.put("enter_method", c672880QaM.LJI);
        jSONObject.put("duration", System.currentTimeMillis() - c672880QaM.LJII);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("ecom_search_id_stay_time", jSONObject);
    }

    public final void LIZ(EnumC669620QOi enumC669620QOi, String str) {
        C672880QaM next;
        Iterator<C672880QaM> it2 = this.LL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == enumC669620QOi) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C672880QaM c672880QaM = next;
        if (c672880QaM != null) {
            LIZIZ(c672880QaM, str);
            this.LL.remove(c672880QaM);
        }
    }
}
