package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494110oz3 {
    public final List<C825090WYh> LIZ;
    public int LIZIZ;
    public final List<C1494130oz5> LIZJ;

    public final JSONObject LIZ() {
        if (((CopyOnWriteArrayList) this.LIZJ).isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (C1494130oz5 c1494130oz5 : (CopyOnWriteArrayList) this.LIZJ) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("callback_duration", c1494130oz5.LIZLLL);
                jSONObject2.put("request_duration", c1494130oz5.LJ);
                jSONObject2.put("code", c1494130oz5.LIZJ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1494130oz5.LIZ);
                sbLIZ.append(c1494130oz5.LIZIZ);
                jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), jSONObject2);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public C1494110oz3(List<C825090WYh> list) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        this.LIZIZ = 0;
        this.LIZJ = new CopyOnWriteArrayList();
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
    }

    public final void LIZIZ(String str, String str2, int i, long j, C1494320ozO c1494320ozO, C1494600ozq c1494600ozq) {
        boolean z;
        if (c1494320ozO != null && c1494320ozO.LIZ) {
            z = true;
        } else {
            z = false;
        }
        long j2 = c1494600ozq.LJJJJLI;
        if (j2 <= 0) {
            j2 = c1494600ozq.LJI;
        }
        ((CopyOnWriteArrayList) this.LIZJ).add(new C1494130oz5(i, str, z, str2, j, System.currentTimeMillis() - j2));
        C1494570ozn c1494570ozn = c1494600ozq.LIZLLL;
        if (c1494570ozn != null) {
            JSONObject jSONObjectLIZ = LIZ();
            c1494570ozn.LJLJI.LJ.LIZ = jSONObjectLIZ;
            c1494570ozn.LJLI = jSONObjectLIZ;
        }
    }
}
