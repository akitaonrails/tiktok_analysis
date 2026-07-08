package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kwL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338670kwL extends AbstractC1163040gN4 {
    public static final Gson LJFF = new e().LIZ();
    public final EnumC1325870kbh LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Object LJ;

    @Override // X.AbstractC1163040gN4
    public final String LIZ() {
        return "myna_sdk_error";
    }

    @Override // X.AbstractC1163040gN4
    public final Map<String, Object> LIZIZ(Map<String, ? extends Object> map) {
        Object c098200Yq;
        HashMap map2 = new HashMap();
        map2.put("error_domain", this.LIZ.getValue());
        map2.put("error_code", Integer.valueOf(this.LIZIZ));
        map2.put("error_msg", this.LIZJ);
        String str = this.LIZLLL;
        if (str != null) {
            map2.put("error_type", str);
        }
        Object obj = this.LJ;
        if (obj != null) {
            try {
                c098200Yq = LJFF.LJIILL(obj);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            if (c098200Yq == null) {
                c098200Yq = "";
            }
            map2.put("extra_params", c098200Yq);
        }
        if (map != null) {
            map2.putAll(map);
        }
        return map2;
    }

    public C1338670kwL(EnumC1325870kbh enumC1325870kbh, int i, String str, Object obj, int i2) {
        obj = (i2 & 16) != 0 ? null : obj;
        this.LIZ = enumC1325870kbh;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = null;
        this.LJ = obj;
    }
}
