package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0dQ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049570dQ3 {
    public static C1049550dQ1 LIZ(String str) {
        HashMap<String, C1049550dQ1> map = C1049550dQ1.LIZLLL;
        C1049550dQ1 c1049550dQ1 = map.get(str);
        if (c1049550dQ1 == null) {
            c1049550dQ1 = new C1049550dQ1();
            map.put(str, c1049550dQ1);
        }
        return c1049550dQ1;
    }
}
