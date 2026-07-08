package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0yzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878910yzh {
    public static final C1878910yzh LIZIZ = new C1878910yzh();
    public final ConcurrentHashMap<String, InterfaceC1878900yzg> LIZ = new ConcurrentHashMap<>();

    public final void LIZ(String str, Map<String, String> map) {
        String strLIZ = C1878610yzD.LIZ(str);
        if (this.LIZ.containsKey(strLIZ)) {
            return;
        }
        this.LIZ.put(strLIZ, new C1881850z4R(str, map));
    }
}
