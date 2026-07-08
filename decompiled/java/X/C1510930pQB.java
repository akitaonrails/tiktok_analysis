package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0pQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510930pQB {
    public static Object LIZ(String str, Map map) {
        Object obj = map.get(str);
        if (obj == null) {
            InterfaceC1510920pQA interfaceC1510920pQA = C1510860pQ4.LIZ;
            if (interfaceC1510920pQA != null) {
                return interfaceC1510920pQA.getFeature(str);
            }
            return null;
        }
        return obj;
    }
}
