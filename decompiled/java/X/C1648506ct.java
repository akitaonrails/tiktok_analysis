package X;

import android.util.ArrayMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1648506ct {
    public static final ArrayMap<String, String> LIZ(Pair<String, String>... pairArr) {
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        for (Pair<String, String> pair : pairArr) {
            arrayMap.put(pair.getFirst(), pair.getSecond());
        }
        return arrayMap;
    }
}
