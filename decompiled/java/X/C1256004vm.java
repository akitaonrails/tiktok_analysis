package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.04vm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1256004vm implements C0IGS {
    public static final C1256004vm LIZ = new C1256004vm();
    public static final Map<String, Long> LIZIZ = new LinkedHashMap();

    public static long LIZIZ(String str) {
        Long l = (Long) ((LinkedHashMap) LIZIZ).get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // X.C0IGS
    public final void LIZ(String str) {
        LIZIZ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
