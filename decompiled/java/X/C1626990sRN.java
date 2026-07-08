package X;

import android.content.Context;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0sRN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1626990sRN {
    public static long LIZ = -1;

    public static final Pair<String, String> LIZ(Context context) {
        Pair pair;
        C20510015Ni c20510015Ni = C20510015Ni.LIZ;
        if (c20510015Ni.LIZIZ()) {
            return new Pair<>(context.getString(2131829437), context.getString(2131829441));
        }
        int i = C1626960sRK.LIZ[c20510015Ni.LJI().ordinal()];
        if (i != 1) {
            if (i != 2) {
                pair = new Pair(2131838916, 2131838915);
            } else {
                pair = new Pair(2131829437, 2131838914);
            }
        } else {
            pair = new Pair(2131829437, 2131829435);
        }
        return new Pair<>(context.getString(((Number) pair.getFirst()).intValue()), context.getString(((Number) pair.getSecond()).intValue()));
    }

    public static void LIZIZ(Context context) {
        int i;
        String string;
        if (context != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - LIZ >= ((Number) C0ATM.LIZ.getValue()).longValue()) {
                LIZ = jCurrentTimeMillis;
                C20510015Ni c20510015Ni = C20510015Ni.LIZ;
                if (c20510015Ni.LIZIZ()) {
                    string = context.getString(2131829441);
                } else {
                    int i2 = C1626960sRK.LIZ[c20510015Ni.LJI().ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            i = 2131829445;
                        } else {
                            i = 2131829436;
                        }
                    } else {
                        i = 2131829438;
                    }
                    string = context.getString(i);
                }
                C21366318jV.LIZLLL.getClass();
                new C21366318jV(context, string, 0, 2).LIZ();
            }
        }
    }
}
