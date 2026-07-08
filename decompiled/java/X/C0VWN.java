package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0VWN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VWN {
    public static InterfaceC1602960roc LIZIZ(String str) {
        if (C305530ByJ.LIZ(str)) {
            return C585110MxB.LIZIZ.get(str);
        }
        return C585110MxB.LIZ.get(str);
    }

    public static InterfaceC1602960roc LIZ(String str, boolean z) {
        InterfaceC1602960roc interfaceC1602960roc;
        if (C305530ByJ.LIZ(str)) {
            HashMap<String, C0VWH> map = C585110MxB.LIZIZ;
            C0VWH c0vwh = map.get(str);
            if (c0vwh == null) {
                C0VWH c0vwh2 = new C0VWH(str);
                map.put(str, c0vwh2);
                return c0vwh2;
            }
            return c0vwh;
        }
        if (!z && (interfaceC1602960roc = C585110MxB.LIZ.get(str)) != null) {
            return interfaceC1602960roc;
        }
        C798970VVv c798970VVv = new C798970VVv(str);
        if (!z) {
            C585110MxB.LIZ.put(str, c798970VVv);
        }
        return c798970VVv;
    }
}
