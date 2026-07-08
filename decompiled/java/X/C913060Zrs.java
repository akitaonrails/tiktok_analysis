package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zrs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913060Zrs {
    public static C913020Zro LIZ;
    public static boolean LIZIZ = true;

    public static void LIZIZ(String str) {
        C913020Zro c913020Zro;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str != null && (c913020Zro = LIZ) != null && Intrinsics.LJFF(c913020Zro.LIZ, str)) {
            c913020Zro.LIZLLL = jCurrentTimeMillis - c913020Zro.LIZJ;
        }
    }

    public static void LIZ(String str, int i, int i2) {
        long jCurrentTimeMillis;
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        if (str != null) {
            LIZ = new C913020Zro(str, i, jCurrentTimeMillis);
        }
    }
}
