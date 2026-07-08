package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0dQU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049840dQU {
    public volatile Map<String, InterfaceC1049750dQL> LIZ = new HashMap();

    public final InterfaceC1049750dQL LIZ(String str) {
        if (((HashMap) this.LIZ).containsKey(str) && ((HashMap) this.LIZ).get(str) != null) {
            return (InterfaceC1049750dQL) ((HashMap) this.LIZ).get(str);
        }
        C1049850dQV c1049850dQV = new C1049850dQV();
        ((HashMap) this.LIZ).put(str, c1049850dQV);
        return c1049850dQV;
    }
}
