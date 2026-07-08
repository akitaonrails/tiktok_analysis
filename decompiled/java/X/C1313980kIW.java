package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kIW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313980kIW {
    public final Map<String, C1313970kIV> LIZ = new HashMap();

    public C1313980kIW(List<C1313970kIV> list) {
        for (C1313970kIV c1313970kIV : (ArrayList) list) {
            if (c1313970kIV != null) {
                String str = c1313970kIV.LIZ;
                ((HashMap) this.LIZ).get(str);
                ((HashMap) this.LIZ).put(str, c1313970kIV);
            }
        }
    }
}
