package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V8F, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V8F implements Comparable {
    public final String LL;
    public final long LLILLJJLI;
    public final int LLILLL;

    public JSONObject LIZJ() {
        try {
            JSONObject jSONObject = new JSONObject();
            String strReplace = this.LL;
            if (strReplace.contains(C0V8C.LLJLILLLLZIIL)) {
                strReplace = strReplace.replace(C0V8C.LLJLILLLLZIIL, "internal");
            } else if (strReplace.contains(C0V8C.LLJLL)) {
                strReplace = strReplace.replace(C0V8C.LLJLL, "external");
            }
            jSONObject.put("name", strReplace);
            jSONObject.put("size", this.LLILLJJLI);
            int i = this.LLILLL;
            if (i <= 0) {
                return jSONObject;
            }
            jSONObject.put("num", i);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C0V8F() {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        long j = this.LLILLJJLI;
        long j2 = ((C0V8F) obj).LLILLJJLI;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return 1;
        }
        return -1;
    }

    public C0V8F(String str, long j, int i) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = i;
    }
}
