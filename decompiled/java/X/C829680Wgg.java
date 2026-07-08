package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Wgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829680Wgg {
    public static final Map<String, InterfaceC829690Wgh> LIZ = new ConcurrentHashMap();

    public static Object LIZ(String str, List<Object> list) {
        InterfaceC829690Wgh interfaceC829690Wgh = (InterfaceC829690Wgh) ((ConcurrentHashMap) LIZ).get(str);
        if (interfaceC829690Wgh == null) {
            return null;
        }
        return interfaceC829690Wgh.LIZ(list);
    }
}
