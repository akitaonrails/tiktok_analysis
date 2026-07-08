package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0DF9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DF9 {
    public static final ConcurrentHashMap<String, InterfaceC334930DBb> LIZ = new ConcurrentHashMap<>();

    public static InterfaceC334930DBb LIZ(String str) {
        boolean z;
        InterfaceC334930DBb interfaceC334930DBb = LIZ.get(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get: containerId=");
        sbLIZ.append(str);
        sbLIZ.append(", hit=");
        if (interfaceC334930DBb != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return interfaceC334930DBb;
    }
}
