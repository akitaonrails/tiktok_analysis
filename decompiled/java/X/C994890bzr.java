package X;

import android.content.Context;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0bzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C994890bzr {
    public static Pair LIZ(int i, int i2, Context context) {
        int i3;
        float f = i;
        if (i2 < 1) {
            i2 = 1;
        }
        float f2 = f / i2;
        double d = f2;
        if (d <= 1.0d) {
            i3 = 77;
        } else {
            i3 = 16;
        }
        int iLIZLLL = C418440Gaw.LIZLLL(context) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))));
        if (d < 1.0d) {
            return new Pair(Integer.valueOf(iLIZLLL), Integer.valueOf((iLIZLLL * 5) / 4));
        }
        if (f2 == 1.0f) {
            return new Pair(Integer.valueOf(iLIZLLL), Integer.valueOf(iLIZLLL));
        }
        return new Pair(Integer.valueOf(iLIZLLL), Integer.valueOf((iLIZLLL * 9) / 16));
    }
}
