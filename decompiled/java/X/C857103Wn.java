package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.03Wn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C857103Wn {
    public static C03WX LIZ(String str) {
        HashMap<String, C03WX> map = C03WX.LJIIL;
        C03WX c03wx = map.get(str);
        if (c03wx == null) {
            C03WX c03wx2 = new C03WX();
            map.put(str, c03wx2);
            return c03wx2;
        }
        return c03wx;
    }
}
