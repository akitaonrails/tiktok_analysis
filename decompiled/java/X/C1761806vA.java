package X;

import android.util.ArrayMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06vA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1761806vA {
    public static final Map<String, String> LIZ(Pair<String, String>... pairArr) {
        ArrayMap arrayMap = new ArrayMap();
        for (Pair<String, String> pair : pairArr) {
            arrayMap.put(pair.getFirst(), pair.getSecond());
        }
        return arrayMap;
    }
}
