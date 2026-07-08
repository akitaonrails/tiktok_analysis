package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0W38, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W38 {
    public static final <K, V> C830490Whz<K, V> LIZ(Pair<? extends K, ? extends V>... pairArr) {
        C830490Whz<K, V> c830490Whz = new C830490Whz<>(pairArr.length);
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            c830490Whz.put(pair.getFirst(), pair.getSecond());
        }
        return c830490Whz;
    }
}
