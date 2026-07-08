package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0P6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639500P6m {
    public static long LIZ = -1;
    public static boolean LIZIZ = true;
    public static String LIZJ = "";
    public static Function0<Unit> LIZLLL;

    public static void LIZ(boolean z) {
        Function0<Unit> function0;
        if (LIZ >= 0 && LIZIZ) {
            long jCurrentTimeMillis = System.currentTimeMillis() - LIZ;
            if (jCurrentTimeMillis < 0) {
                return;
            }
            C0Q2Q<C639520P6o> c0q2q = new C0Q2Q<C639520P6o>() { // from class: X.0P6o
            };
            c0q2q.LJIIZILJ("first_frame_duration", String.valueOf(jCurrentTimeMillis));
            c0q2q.LJIIZILJ("is_show_first_frame", String.valueOf(z));
            c0q2q.LJIIZILJ("chunk_type", LIZJ);
            c0q2q.LJIILJJIL();
            LIZ = -1L;
            LIZIZ = false;
            LIZJ = "";
            if (z && (function0 = LIZLLL) != null) {
                function0.invoke();
            }
        }
    }
}
