package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pC0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502140pC0 {
    public static final C1502140pC0 LIZIZ = new C1502130pBz().LIZIZ();
    public List<C1502120pBy> LIZ;

    public C1502140pC0() {
        this(null, null, 3);
    }

    public final JSONObject LIZIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        List<C1502120pBy> list = this.LIZ;
        if (list == null) {
            list = null;
        }
        for (C1502120pBy c1502120pBy : list) {
            jSONObject.put(c1502120pBy.LIZ, c1502120pBy.LIZIZ);
        }
        return jSONObject;
    }

    public final List<String> LIZ(String str) {
        List<C1502120pBy> list = this.LIZ;
        if (list == null) {
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        for (C1502120pBy c1502120pBy : list) {
            if (u.LJIJI(c1502120pBy.LIZ, str, true)) {
                arrayList.add(c1502120pBy);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C1502120pBy) it2.next()).LIZIZ);
        }
        return arrayList2;
    }

    public C1502140pC0(JSONObject jSONObject, List list, int i) {
        String string;
        jSONObject = (i & 1) != 0 ? null : jSONObject;
        list = (i & 2) != 0 ? null : list;
        if (jSONObject != null) {
            try {
                this.LIZ = new ArrayList();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    if (objOpt != null && (string = objOpt.toString()) != null) {
                        C1502120pBy c1502120pBy = new C1502120pBy(next, string);
                        List<C1502120pBy> list2 = this.LIZ;
                        (list2 == null ? null : list2).add(c1502120pBy);
                    }
                }
                return;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (list != null) {
            this.LIZ = list;
        } else {
            this.LIZ = new ArrayList();
        }
    }
}
