package X;

import Y.ARunnableS111S0100000_11;
import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS160S1100000_11;
import kotlin.jvm.internal.AwS18S1110000_11;
import kotlin.jvm.internal.AwS54S2100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0RjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703870RjF {
    public static final ConcurrentHashMap<String, C703900RjI> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Function1<String, String>> LIZIZ = new ConcurrentHashMap<>();

    public static C703900RjI LIZ(String str) {
        C703900RjI c703900RjIPutIfAbsent;
        String strLIZIZ = LIZIZ(str);
        ConcurrentHashMap<String, C703900RjI> concurrentHashMap = LIZ;
        C703900RjI c703900RjI = concurrentHashMap.get(strLIZIZ);
        if (c703900RjI == null && (c703900RjIPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZIZ, (c703900RjI = new C703900RjI()))) != null) {
            c703900RjI = c703900RjIPutIfAbsent;
        }
        return c703900RjI;
    }

    public static String LIZIZ(String str) {
        if (str == null || a0.LJJJIL(str)) {
            return "__default_slot_metric_owner__";
        }
        return str;
    }

    public static void LIZJ(String str) {
        String strLIZIZ = LIZIZ(str);
        LIZIZ.remove(strLIZIZ);
        C703900RjI c703900RjIRemove = LIZ.remove(strLIZIZ);
        if (c703900RjIRemove != null) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                c703900RjIRemove.LIZ();
            } else {
                C786410Ut5.LJJZZIII(c703900RjIRemove.LIZ, new ARunnableS111S0100000_11(c703900RjIRemove, 136));
            }
        }
    }

    public static void LJ(String str, Map map) {
        C703900RjI c703900RjILIZ = LIZ(str);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            c703900RjILIZ.LJFF.clear();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (str2.length() > 0) {
                    c703900RjILIZ.LJFF.put(str2, (Set<String>) value);
                }
            }
            return;
        }
        C786410Ut5.LJJZZIII(c703900RjILIZ.LIZ, new RunnableC514501zT(c703900RjILIZ, map, 34));
    }

    public static void LJFF(String str, final String str2, final boolean z) {
        final C703900RjI c703900RjILIZ = LIZ(str);
        if (str2 != null && str2.length() != 0) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                c703900RjILIZ.LIZJ();
                new AwS18S1110000_11(c703900RjILIZ, str2, z, 3);
                C0T6L.LIZLLL();
                c703900RjILIZ.LJFF(str2, z);
                return;
            }
            C786410Ut5.LJJZZIII(c703900RjILIZ.LIZ, new Runnable() { // from class: X.0RjH
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FcpSlotMetricSession@d56d.updateSlotVisibility$$inlined$runOnMainThread$1");
                    try {
                        c703900RjILIZ.LIZJ();
                        new AwS18S1110000_11(c703900RjILIZ, str2, z, 3);
                        C0T6L.LIZLLL();
                        c703900RjILIZ.LJFF(str2, z);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FcpSlotMetricSession@d56d.updateSlotVisibility$$inlined$runOnMainThread$1");
                }
            });
        }
    }

    public static void LIZLLL(String str, final Function0 function0, String str2, final String str3) {
        if (str2 != null && str2.length() != 0) {
            LIZIZ(str);
            Function1<String, String> function1 = LIZIZ.get(LIZIZ(str));
            if (function1 == null) {
                function0.invoke();
                return;
            }
            final String strInvoke = function1.invoke(str2);
            if (strInvoke == null) {
                function0.invoke();
                return;
            }
            final C703900RjI c703900RjILIZ = LIZ(str);
            if (!C299710Bov.LIZ()) {
                new AwS54S2100000_11(c703900RjILIZ, strInvoke, str3, 2);
                C0T6L.LIZLLL();
                function0.invoke();
                return;
            }
            if (strInvoke.length() == 0) {
                new AwS160S1100000_11(c703900RjILIZ, str3, 10);
                C0T6L.LIZLLL();
                function0.invoke();
                return;
            } else {
                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    c703900RjILIZ.LIZJ();
                    if (Intrinsics.LJFF(c703900RjILIZ.LIZLLL.get(strInvoke), Boolean.TRUE)) {
                        new AwS54S2100000_11(c703900RjILIZ, strInvoke, str3, 3);
                        C0T6L.LIZLLL();
                        function0.invoke();
                        return;
                    } else {
                        new AwS54S2100000_11(c703900RjILIZ, strInvoke, str3, 4);
                        C0T6L.LIZLLL();
                        c703900RjILIZ.LIZIZ(strInvoke, str3, function0);
                        return;
                    }
                }
                C786410Ut5.LJJZZIII(c703900RjILIZ.LIZ, new Runnable() { // from class: X.0RjG
                    public final void LIZ() {
                        c703900RjILIZ.LIZJ();
                        if (Intrinsics.LJFF(c703900RjILIZ.LIZLLL.get(strInvoke), Boolean.TRUE)) {
                            new AwS54S2100000_11(c703900RjILIZ, strInvoke, str3, 3);
                            C0T6L.LIZLLL();
                            function0.invoke();
                        } else {
                            new AwS54S2100000_11(c703900RjILIZ, strInvoke, str3, 4);
                            C0T6L.LIZLLL();
                            c703900RjILIZ.LIZIZ(strInvoke, str3, function0);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FcpSlotMetricSession@d56d.runWhenSlotVisibleOrPend$$inlined$runOnMainThread$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FcpSlotMetricSession@d56d.runWhenSlotVisibleOrPend$$inlined$runOnMainThread$1");
                    }
                });
                return;
            }
        }
        function0.invoke();
    }
}
