package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V8K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V8K implements Comparable {
    public final String LL;
    public final long LLILLJJLI;
    public final int LLILLL;
    public final /* synthetic */ C0V8I LLILZ;

    public final String LIZJ() {
        String str = this.LL;
        String strLJII = this.LLILZ.LJII(str);
        if (strLJII != null) {
            str = strLJII;
        }
        return str.contains(this.LLILZ.LIZ) ? str.replace(this.LLILZ.LIZ, "internal") : str.contains(this.LLILZ.LIZJ) ? str.replace(this.LLILZ.LIZJ, "external") : str;
    }

    public JSONObject LJFF() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", LIZJ());
            jSONObject.put("size", this.LLILLJJLI);
            int i = this.LLILLL;
            if (i > 0) {
                jSONObject.put("num", i);
            }
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C0V8K(C0V8I c0v8i) {
        this.LLILZ = c0v8i;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        long j = this.LLILLJJLI;
        long j2 = ((C0V8K) obj).LLILLJJLI;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return 1;
        }
        return -1;
    }

    public C0V8K(C0V8I c0v8i, String str, long j, int i) {
        this.LLILZ = c0v8i;
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = i;
    }
}
