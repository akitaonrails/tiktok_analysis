package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V8L, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V8L extends C0V8K {
    public final String LLILZIL;
    public final long LLILZLL;
    public final int LLIZ;
    public final long LLIZLLLIL;
    public final /* synthetic */ C0V8I LLJ;

    private String LIZJ() {
        String str = this.LLILZIL;
        String strLJII = this.LLJ.LJII(str);
        if (strLJII != null) {
            str = strLJII;
        }
        return str.contains(this.LLJ.LIZ) ? str.replace(this.LLJ.LIZ, "internal") : str.contains(this.LLJ.LIZJ) ? str.replace(this.LLJ.LIZJ, "external") : str;
    }

    @Override // X.C0V8K
    public final JSONObject LJFF() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", LIZJ());
            jSONObject.put("size", this.LLILZLL);
            int i = this.LLIZ;
            if (i > 0) {
                jSONObject.put("num", i);
            }
            jSONObject.put("outdate_interval", this.LLIZLLLIL);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C0V8K, java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.LLIZLLLIL;
        long j2 = ((C0V8L) obj).LLIZLLLIL;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return 1;
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0V8L(C0V8I c0v8i, String str, long j, int i, long j2) {
        super(c0v8i);
        this.LLJ = c0v8i;
        this.LLILZIL = str;
        this.LLILZLL = j;
        this.LLIZ = i;
        this.LLIZLLLIL = j2;
    }
}
