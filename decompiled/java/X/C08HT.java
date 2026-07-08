package X;

import android.util.ArrayMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08HT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08HT {
    public static final ArrayMap<String, String> LIZ(Pair<String, String>... pairArr) {
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        for (Pair<String, String> pair : pairArr) {
            String first = pair.getFirst();
            String second = pair.getSecond();
            if (second == null) {
                second = "";
            }
            arrayMap.put(first, second);
        }
        return arrayMap;
    }
}
