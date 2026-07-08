package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Sd0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725480Sd0 {
    public static final ConcurrentHashMap<AbstractC725500Sd2<?>, CopyOnWriteArrayList<Function1<?, Unit>>> LIZ = new ConcurrentHashMap<>();

    public static boolean LIZ(AbstractC725500Sd2 abstractC725500Sd2) {
        ConcurrentHashMap<AbstractC725500Sd2<?>, CopyOnWriteArrayList<Function1<?, Unit>>> concurrentHashMap = LIZ;
        if (concurrentHashMap.isEmpty()) {
            return false;
        }
        return concurrentHashMap.containsKey(abstractC725500Sd2);
    }

    public static void LIZIZ(AbstractC725500Sd2 abstractC725500Sd2, C07XB c07xb) {
        CopyOnWriteArrayList<Function1<?, Unit>> copyOnWriteArrayList = LIZ.get(abstractC725500Sd2);
        if (copyOnWriteArrayList != null) {
            for (Function1<?, Unit> function1 : copyOnWriteArrayList) {
                C19719512Dh.LJ(1, function1);
                function1.invoke(c07xb);
            }
        }
    }
}
