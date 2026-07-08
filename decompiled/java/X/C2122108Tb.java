package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08Tb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2122108Tb {
    public static final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public static volatile boolean LIZJ;
    public static volatile int LIZLLL;

    public static boolean LIZIZ(String str) {
        String name;
        if (str == null || str.length() == 0 || u.LJJIIJZLJL(str, e3.c, false) || Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()) || (name = C786410Ut5.u3().getName()) == null || name.length() == 0) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (!a0.LJJIIZI(lowerCase, "milo", false) && !a0.LJJIIZI(lowerCase, "resaltas", false)) {
            return true;
        }
        return false;
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(':');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(Long l, String str, String str2) {
        String name;
        Object obj;
        try {
            C08TH.LIZ.getClass();
            C08TH c08th = C08TI.LIZIZ;
            if (c08th == null) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(4);
            linkedHashMap.put("runnable_name", str2);
            linkedHashMap.put("thread_name", C786410Ut5.u3().getName());
            try {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                name = "empty";
                if (abstractC1387200mCcLJ != null && (obj = abstractC1387200mCcLJ.LIZ) != null) {
                    name = obj.getClass().getName();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                name = "unknown";
            }
            linkedHashMap.put("top_page", name);
            if (l != null) {
                linkedHashMap.put("cost_ms", l);
            }
            c08th.LIZ("runnable_execute", str, linkedHashMap);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
