package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Observable;

/* JADX INFO: renamed from: X.0VvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813210VvD extends Observable {
    public static volatile C813210VvD LIZ;

    public static C813210VvD LIZ() {
        if (LIZ == null) {
            synchronized (C813210VvD.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C813210VvD();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public final void LIZIZ(long j, long j2, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("sent_bytes", Long.valueOf(j));
        map.put("received_bytes", Long.valueOf(j2));
        map.put("content_type", str2);
        map.put("request_log", str3);
        setChanged();
        notifyObservers(map);
    }
}
