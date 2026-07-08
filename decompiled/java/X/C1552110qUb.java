package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0qUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552110qUb {
    public final Map<String, C1552830qVl> LIZ = new HashMap();
    public AbstractC1552800qVi LIZIZ;

    public final C1552500qVE LIZ(Class<? extends AbstractC1552160qUg> cls) {
        C1552860qVo c1552860qVo = new C1552860qVo();
        c1552860qVo.LIZ = cls;
        c1552860qVo.LIZJ = new Object[]{this.LIZ};
        c1552860qVo.LIZIZ = this.LIZIZ;
        return new C1552500qVE(c1552860qVo);
    }

    public final C1552830qVl LIZIZ(String str) {
        if (!((HashMap) this.LIZ).containsKey(str)) {
            C1552830qVl c1552830qVl = new C1552830qVl();
            ((HashMap) this.LIZ).put(str, c1552830qVl);
            return c1552830qVl;
        }
        throw new IllegalArgumentException("duplicated branch name");
    }
}
