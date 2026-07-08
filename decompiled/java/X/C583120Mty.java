package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0Mty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583120Mty {
    public final Map<String, String> LIZ = new ConcurrentHashMap();

    public final void LIZ(String str) {
        C583140Mu0 c583140Mu0 = C583130Mtz.LIZ;
        Object objQuery = ((ConcurrentHashMap) c583140Mu0.LIZ).get(str);
        if (objQuery == null) {
            Iterator it2 = ((CopyOnWriteArrayList) c583140Mu0.LIZLLL).iterator();
            while (it2.hasNext()) {
                objQuery = ((InterfaceC582400Mso) it2.next()).query(str);
                if (objQuery != null) {
                }
            }
            return;
        }
        ((ConcurrentHashMap) this.LIZ).put(str, String.valueOf(objQuery));
    }
}
