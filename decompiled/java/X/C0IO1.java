package X;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IO1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IO1 {
    public static final C0IO1 LIZ = new C0IO1();
    public static final Set<C0IO0> LIZIZ = new LinkedHashSet();

    public static final Pair LIZ() {
        Set<C0IO0> set = LIZIZ;
        if (!(!set.isEmpty())) {
            return null;
        }
        C0IO0 c0io0 = (C0IO0) C13LP.LJJLIIIJJIZ(set);
        set.clear();
        if (c0io0 != null) {
            return new Pair(Long.valueOf(c0io0.LIZIZ), c0io0.LIZJ);
        }
        return null;
    }
}
