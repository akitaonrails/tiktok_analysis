package X;

import android.util.SparseArray;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901060ZWm {
    public static final Map<String, String> LIZ(C869590Y9l c869590Y9l) {
        Map<String, String> map;
        Object localCache = c869590Y9l.getLocalCache(511);
        if (!C19719512Dh.LJII(localCache) || (map = (Map) localCache) == null) {
            return new LinkedHashMap();
        }
        return map;
    }

    public static final boolean LIZIZ(C869590Y9l c869590Y9l) {
        return Intrinsics.LJFF(c869590Y9l.getLocalCache(507), Boolean.TRUE);
    }

    public static final boolean LIZJ(C869590Y9l c869590Y9l) {
        return Intrinsics.LJFF(c869590Y9l.getLocalCache(505), Boolean.TRUE);
    }

    public static final <K, V> SparseArray<Object> LJ(Map<K, ? extends V> map) {
        if (map == null) {
            return null;
        }
        SparseArray<Object> sparseArray = new SparseArray<>(1);
        sparseArray.put(511, map);
        return sparseArray;
    }

    public static final void LIZLLL(C869590Y9l c869590Y9l, boolean z) {
        c869590Y9l.putLocalCache(505, Boolean.valueOf(z));
    }
}
