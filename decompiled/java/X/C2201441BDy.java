package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201441BDy {
    public int LIZ;
    public String LIZLLL;
    public String LJ;
    public List<String> LJII;
    public long LIZIZ = 60000;
    public final Set<String> LIZJ = new HashSet();
    public int LJFF = 0;
    public final List<String> LJI = new ArrayList();

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.LIZ);
            jSONObject.put("interval", this.LIZIZ);
            jSONObject.put("forward_report_path", this.LJ);
            jSONObject.put("forward_report_host", this.LIZLLL);
            jSONObject.put("forward_open", this.LJFF);
            JSONArray jSONArray = new JSONArray();
            for (String str : (ArrayList) this.LJI) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("forward_report_url", str);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("forward_list", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = ((HashSet) this.LIZJ).iterator();
            while (it2.hasNext()) {
                jSONArray2.put((String) it2.next());
            }
            jSONObject.put("events", jSONArray2);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2209791BeD.LJIJJ().LJIILL("put json object for event forward failed", th, new Object[0]);
            return jSONObject;
        }
    }

    public final List<String> LIZIZ() {
        if (this.LJFF == 0) {
            return null;
        }
        if (this.LJII == null) {
            ArrayList arrayList = new ArrayList();
            if (!((ArrayList) this.LJI).isEmpty()) {
                for (String str : (ArrayList) this.LJI) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            } else if (!TextUtils.isEmpty(this.LIZLLL) && this.LIZLLL.startsWith("https://") && !this.LIZLLL.endsWith("/")) {
                String str2 = this.LIZLLL;
                String str3 = (!TextUtils.isEmpty(this.LJ) && this.LJ.startsWith("/") && this.LJ.endsWith("/")) ? this.LJ : "/service/2/app_log/";
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(str3);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LJII = arrayList;
        }
        return this.LJII;
    }

    public final boolean LIZJ() {
        return (this.LJFF != 1 || ((HashSet) this.LIZJ).isEmpty() || this.LIZIZ <= 0 || LIZIZ() == null || LIZIZ().isEmpty()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2201441BDy) {
            C2201441BDy c2201441BDy = (C2201441BDy) obj;
            if (c2201441BDy.LIZ == this.LIZ && c2201441BDy.LIZIZ == this.LIZIZ && TextUtils.equals(c2201441BDy.LIZLLL, this.LIZLLL) && TextUtils.equals(c2201441BDy.LJ, this.LJ) && c2201441BDy.LJFF == this.LJFF) {
                if (((ArrayList) c2201441BDy.LJI).equals(this.LJI) && c2201441BDy.LIZJ.containsAll(this.LIZJ) && this.LIZJ.containsAll(c2201441BDy.LIZJ)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return super.equals(obj);
    }
}
