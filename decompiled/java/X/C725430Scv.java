package X;

import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Scv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725430Scv {
    public static final ConcurrentHashMap<C725490Sd1, Long> LIZ = new ConcurrentHashMap<>();
    public static final ArrayList<InterfaceC725440Scw> LIZIZ = new ArrayList<>();

    public static void LIZ(final Function0 function0) {
        Executor executor = C725450Scx.LIZIZ;
        if (executor == null) {
            function0.invoke();
        } else {
            executor.execute(new Runnable() { // from class: X.00kb
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TrackerKt@d5e8.sam$java_lang_Runnable$0");
                    try {
                        function0.invoke();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TrackerKt@d5e8.sam$java_lang_Runnable$0");
                }
            });
        }
    }

    public static void LIZIZ(AbstractC725500Sd2 abstractC725500Sd2, Function0 function0) {
        if (C725450Scx.LIZJ && C725480Sd0.LIZ(abstractC725500Sd2)) {
            LIZ(new AwS412S0200000_11(abstractC725500Sd2, (AbstractC725500Sd2<Object>) function0, (Function0<Object>) 61));
        }
    }

    public static void LJI(AbstractC725500Sd2 abstractC725500Sd2, Function1 function1) {
        ConcurrentHashMap<AbstractC725500Sd2<?>, CopyOnWriteArrayList<Function1<?, Unit>>> concurrentHashMap = C725480Sd0.LIZ;
        CopyOnWriteArrayList<Function1<?, Unit>> copyOnWriteArrayList = concurrentHashMap.get(abstractC725500Sd2);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(function1);
            if (copyOnWriteArrayList.size() == 0) {
                concurrentHashMap.remove(abstractC725500Sd2);
            }
        }
    }

    public static void LIZJ(String str, float f, Function0 function0) {
        InterfaceC725460Scy interfaceC725460Scy;
        if (C732340So4.LIZ(f) && (interfaceC725460Scy = C725450Scx.LIZ) != null) {
            interfaceC725460Scy.report(str, (Map) function0.invoke());
        }
    }

    public static Object LIZLLL(AbstractC725510Sd3 abstractC725510Sd3, C723430SZh c723430SZh, Function0 function0) {
        if (C725450Scx.LIZJ && C725480Sd0.LIZ(abstractC725510Sd3)) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            Object objInvoke = function0.invoke();
            c723430SZh.LIZ = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
            c723430SZh.LIZIZ = Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper());
            LIZ(new C725420Scu(abstractC725510Sd3, c723430SZh));
            return objInvoke;
        }
        return function0.invoke();
    }

    public static boolean LJ(AbstractC725500Sd2 abstractC725500Sd2, float f, Function1 function1) {
        if (C732340So4.LIZ(f)) {
            ConcurrentHashMap<AbstractC725500Sd2<?>, CopyOnWriteArrayList<Function1<?, Unit>>> concurrentHashMap = C725480Sd0.LIZ;
            CopyOnWriteArrayList<Function1<?, Unit>> copyOnWriteArrayList = concurrentHashMap.get(abstractC725500Sd2);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                concurrentHashMap.put(abstractC725500Sd2, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(function1);
            return true;
        }
        return false;
    }
}
