package X;

import android.graphics.ColorSpace;
import android.util.Pair;

/* JADX INFO: renamed from: X.0ke3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327330ke3 {
    public final Pair<Integer, Integer> LIZ;

    public C1327330ke3(int i, int i2, ColorSpace colorSpace) {
        Pair<Integer, Integer> pair;
        if (i != -1 && i2 != -1) {
            pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            pair = null;
        }
        this.LIZ = pair;
    }
}
