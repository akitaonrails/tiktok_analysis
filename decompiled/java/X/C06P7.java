package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06P7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06P7 {
    public static final C06P7 LIZ = new C06P7();
    public static final Set<String> LIZIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final CopyOnWriteArraySet<Runnable> LIZJ = new CopyOnWriteArraySet<>();

    public static boolean LIZ(String str) {
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        return LIZIZ.contains(str);
    }
}
