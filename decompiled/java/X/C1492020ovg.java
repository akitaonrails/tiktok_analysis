package X;

import Y.ARunnableS98S0000000_23;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ovg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492020ovg {
    public static long LIZJ;
    public static long LIZLLL;
    public static String LJ;
    public static final C1492020ovg LIZ = new C1492020ovg();
    public static final EnumC1492040ovi LIZIZ = EnumC1492040ovi.REGULAR;
    public static final CopyOnWriteArrayList<Function0<Unit>> LJFF = new CopyOnWriteArrayList<>();

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[PHI: r4
      0x0066: PHI (r4v6 long) = (r4v4 long), (r4v5 long), (r4v8 long) binds: [B:33:0x0082, B:35:0x008a, B:25:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            java.util.concurrent.CopyOnWriteArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> r6 = X.C1492020ovg.LJFF
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = X.C1492020ovg.LJ
            if (r0 == 0) goto L1d
            X.0ovc r0 = X.C1491980ovc.LIZ
            r0.getClass()
            X.0ovS r0 = X.C1491980ovc.LJI
            if (r0 == 0) goto L1d
            r0.LIZ()
        L1d:
            r0 = 0
            java.lang.Object r0 = r6.remove(r0)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r0.invoke()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            java.lang.String r0 = X.C1492020ovg.LJ
            if (r0 == 0) goto L3c
            X.0ovc r0 = X.C1491980ovc.LIZ
            r0.getClass()
            X.0ovS r0 = X.C1491980ovc.LJI
            if (r0 == 0) goto L3c
            r0.end()
        L3c:
            long r0 = X.C1492020ovg.LIZJ
            long r0 = r0 + r2
            X.C1492020ovg.LIZJ = r0
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L7b
            X.0ovi r0 = X.C1492020ovg.LIZIZ
            int[] r1 = X.C1492030ovh.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L8d
            r0 = 2
            if (r1 == r0) goto L7c
            r0 = 3
            r2 = 0
            if (r1 != r0) goto L67
            long r4 = X.C1492020ovg.LIZJ
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L67
            long r4 = X.C1492020ovg.LIZLLL
            X.C1492020ovg.LIZJ = r2
        L66:
            r2 = r4
        L67:
            X.0ovc r0 = X.C1491980ovc.LIZ
            r0.getClass()
            android.os.Handler r4 = X.C1491980ovc.LJ
            if (r4 != 0) goto L71
            r4 = 0
        L71:
            Y.ARunnableS98S0000000_23 r1 = new Y.ARunnableS98S0000000_23
            r0 = 11
            r1.<init>(r0)
            X.C786410Ut5.LJLIIL(r2, r4, r1)
        L7b:
            return
        L7c:
            long r0 = (long) r0
            long r2 = r2 * r0
            long r4 = X.C1492020ovg.LIZLLL
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L66
            r0 = 10
            long r0 = (long) r0
            long r4 = r4 / r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L67
            goto L66
        L8d:
            long r2 = X.C1492020ovg.LIZLLL
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1492020ovg.LIZ():void");
    }

    public static final void LIZIZ(Integer num, String str, List list) {
        if (num != null) {
            LIZLLL = num.intValue();
        }
        LJ = str;
        LJFF.addAll(list);
        C1491980ovc.LIZ.getClass();
        Handler handler = C1491980ovc.LJ;
        if (handler == null) {
            handler = null;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS98S0000000_23(10));
    }
}
