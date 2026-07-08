package X;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20641415ps {
    public final Map<C01CG, C20641515pt> LIZ = new HashMap(10);
    public final PriorityQueue<Pair<Long, C01CG>> LIZIZ = new PriorityQueue<>(10, new Comparator() { // from class: X.083T
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Intrinsics.LJII(((Number) ((Pair) obj).getFirst()).longValue(), ((Number) ((Pair) obj2).getFirst()).longValue());
        }
    });
}
