package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BYE, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BYE {
    public static C1BYB LJIIIIZZ;
    public static int LJIIL;
    public static final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final HashMap<String, C1BYC> LIZJ = new HashMap<>();
    public static final HashMap<String, C1BYM> LIZLLL = new HashMap<>();
    public static final HashMap<String, HashSet<String>> LJ = new HashMap<>();
    public static final ConcurrentHashMap<Integer, C1BYJ> LJFF = new ConcurrentHashMap<>();
    public static final HashMap<String, C1BYJ> LJI = new HashMap<>();
    public static final HashMap<Integer, HashSet<Integer>> LJII = new HashMap<>();
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public static final Map<String, C1BYL> LJIIJ = new LinkedHashMap();
    public static final C1BYK LJIIJJI = new Object() { // from class: X.1BYK
    };

    public static void LIZ(String str) {
        if (!LJIIIZ.get()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endDyeing blood:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZ.remove(C786410Ut5.u3().getName());
        C1BYB c1byb = LJIIIIZZ;
        String str2 = null;
        if (c1byb == null) {
            c1byb = null;
        }
        if (c1byb.LIZ != C1BYH.TRACK_MODE) {
            C1BYB c1byb2 = LJIIIIZZ;
            if (c1byb2 == null) {
                c1byb2 = null;
            }
            if (c1byb2.LIZ != C1BYH.TRACK_MODE_AUTO) {
                return;
            }
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) LJIIJ;
        C1BYL c1byl = (C1BYL) linkedHashMap.get(str);
        if (c1byl != null) {
            str2 = c1byl.LIZ;
        }
        if (Intrinsics.LJFF(str2, C786410Ut5.u3().getName())) {
            if (linkedHashMap.get(str) != null) {
                System.currentTimeMillis();
            }
            if (linkedHashMap.get(str) != null) {
                SystemClock.currentThreadTimeMillis();
            }
        }
    }

    public static void LIZIZ(String str) {
        if (!LJIIIZ.get()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startDyeing blood:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, String> concurrentHashMap = LIZIZ;
        if (!concurrentHashMap.containsKey(str)) {
            concurrentHashMap.put(str, C786410Ut5.u3().getName());
        }
        HashSet<String> hashSet = LJ.get(str);
        if (hashSet != null && hashSet.contains(C786410Ut5.u3().getName())) {
            return;
        }
        LIZ.put(C786410Ut5.u3().getName(), str);
        C1BYB c1byb = LJIIIIZZ;
        C1BYB c1byb2 = null;
        if (c1byb == null) {
            c1byb = null;
        }
        if (c1byb.LIZ != C1BYH.TRACK_MODE) {
            C1BYB c1byb3 = LJIIIIZZ;
            if (c1byb3 != null) {
                c1byb2 = c1byb3;
            }
            if (c1byb2.LIZ != C1BYH.TRACK_MODE_AUTO) {
                return;
            }
        }
        Map<String, C1BYL> map = LJIIJ;
        if (!map.containsKey(str)) {
            String name = C786410Ut5.u3().getName();
            System.currentTimeMillis();
            SystemClock.currentThreadTimeMillis();
            map.put(str, new C1BYL(name, 10));
        }
    }
}
