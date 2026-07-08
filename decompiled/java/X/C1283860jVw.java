package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1283860jVw {
    public int[] LIZJ;
    public final Map<String, String> LIZ = new HashMap();
    public String LIZIZ = "";
    public final int LIZLLL = 1;

    public final C1283850jVv LIZ() throws C1283920jW2 {
        if (!((HashMap) this.LIZ).containsKey("host") || !((HashMap) this.LIZ).containsKey("accessKey") || TextUtils.isEmpty((CharSequence) ((HashMap) this.LIZ).get("host")) || TextUtils.isEmpty((CharSequence) ((HashMap) this.LIZ).get("accessKey"))) {
            throw new C1283920jW2(-100020, "host or accessKey is null");
        }
        int[] iArr = this.LIZJ;
        if (iArr == null || iArr.length == 0) {
            throw new C1283920jW2(-100020, "groupIds is null");
        }
        String str = this.LIZIZ;
        if (str == null || str.isEmpty()) {
            throw new C1283920jW2(-100020, "modelNamePrefix is null");
        }
        C1283850jVv c1283850jVv = new C1283850jVv(this.LIZ);
        c1283850jVv.LIZIZ = this.LIZIZ;
        c1283850jVv.LIZJ = this.LIZJ;
        c1283850jVv.LIZLLL = this.LIZLLL;
        return c1283850jVv;
    }
}
