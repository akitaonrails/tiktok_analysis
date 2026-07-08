package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0THK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0THK {
    public final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();

    public final void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Interceptor: remove: ");
        sbLIZ.append(str);
        C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.remove(str);
    }
}
