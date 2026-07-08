package X;

import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0yav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863550yav {
    public static final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(572));

    public static String LIZ(String str) {
        String string = UUID.randomUUID().toString();
        LIZIZ.put(str, string);
        return string;
    }

    public static void LIZJ(String str) {
        LIZ.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public static String LIZIZ(String str, boolean z) {
        if (z) {
            return LIZ(str);
        }
        Long l = LIZ.get(str);
        if (l == null) {
            return LIZ(str);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        ITakoDebugService iTakoDebugService = (ITakoDebugService) LIZJ.getValue();
        if (iTakoDebugService != null) {
            iTakoDebugService.LJII();
        }
        C14E1.LIZ.getClass();
        if (jCurrentTimeMillis > ((long) (((Number) C14E1.LIZJ.getValue()).intValue() * 60)) * 1000) {
            return LIZ(str);
        }
        String str2 = LIZIZ.get(str);
        if (str2 != null) {
            return str2;
        }
        return LIZ(str);
    }
}
