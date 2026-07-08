package X;

import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085110eLN {
    public static final HashMap<Pair<Integer, Integer>, String> LIZ = new HashMap<>();
    public static final HashMap<Integer, Long> LIZIZ = new HashMap<>();

    public static void LIZIZ() {
        LIZ.clear();
        LIZIZ.clear();
    }

    public static String LIZ(int i, int i2, boolean z) {
        if (!z) {
            return LIZ.get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return LIZ.get(new Pair(Integer.valueOf(-i), Integer.valueOf(i2)));
    }

    public static void LIZJ(int i, int i2, String str, boolean z, boolean z2) {
        if (!z) {
            LIZ.put(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)), str);
            if (i != RankTypeV2.LJIILLIIL.type && !z2) {
                LIZIZ.put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()));
                return;
            }
            return;
        }
        LIZ.put(new Pair<>(Integer.valueOf(-i), Integer.valueOf(i2)), str);
    }
}
