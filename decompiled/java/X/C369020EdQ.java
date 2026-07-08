package X;

import android.graphics.Point;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369020EdQ {
    public static int LIZ() {
        if (((Boolean) C275430Aqr.LIZ.getValue()).booleanValue()) {
            return C0FU0.LIZIZ(C0EHL.LIZ()).x / 2;
        }
        Point pointLIZIZ = C0FU0.LIZIZ(C0EHL.LIZ());
        Pair pair = C0F3E.LIZIZ == 2 ? new Pair(Integer.valueOf(pointLIZIZ.y / 2), Integer.valueOf(pointLIZIZ.x / 2)) : new Pair(Integer.valueOf(pointLIZIZ.x / 2), Integer.valueOf(pointLIZIZ.y / 2));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        ((Number) pair.getSecond()).intValue();
        return iIntValue;
    }
}
