package X;

import android.util.ArrayMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.01at, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C362101at {
    public static final ArrayMap<String, String> LIZ(Pair<String, String>... pairArr) {
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        for (Pair<String, String> pair : pairArr) {
            arrayMap.put(pair.getFirst(), pair.getSecond());
        }
        return arrayMap;
    }
}
