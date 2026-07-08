package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0np1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449450np1 implements InterfaceC1449460np2 {
    public static final C1449450np1 LIZ = new C1449450np1();
    public static final Map<String, Long> LIZIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ = linkedHashMap;
        linkedHashMap.put("application_init", Long.valueOf(C202094145s.LJII));
    }

    public final long LIZJ() {
        long jLIZIZ = LIZIZ("application_init");
        if (jLIZIZ <= 0) {
            return 0L;
        }
        return SystemClock.uptimeMillis() - jLIZIZ;
    }

    public final long LIZLLL() {
        long jLIZIZ = LIZIZ("application_init");
        long jLIZIZ2 = LIZIZ("load_so_start");
        if (jLIZIZ <= 0 || jLIZIZ2 <= 0) {
            return 0L;
        }
        return jLIZIZ2 - jLIZIZ;
    }

    public static final long LIZIZ(String str) {
        Long l = (Long) ((LinkedHashMap) LIZIZ).get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // X.InterfaceC1449460np2
    public final void LIZ(long j, String str) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordStaticEvent, eventName=");
        sbLIZ.append(str);
        sbLIZ.append(", happenTime=");
        sbLIZ.append(j);
        C201955140j.LIZLLL(c201967140v, "RecordStaticEventHelperImpl", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ.put(str, Long.valueOf(j));
    }
}
