package X;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0347, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0347 {
    public static final Map<Integer, Integer> LIZ = C2097608Jq.LJIIIIZZ(new Pair(1, 1), new Pair(2, 2), new Pair(0, 3));
    public static final AnonymousClass0348 LIZIZ = AnonymousClass0348.LL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.00u0] */
    public static final C225800u0 LIZ(final List list) {
        return new Comparator() { // from class: X.00u0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return list.indexOf(obj) - list.indexOf(obj2);
            }
        };
    }
}
