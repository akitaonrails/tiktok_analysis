package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.1D6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250521D6s {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5253));
    public static final String LIZIZ = "show_count";
    public static final String LIZJ = "last_show_time";
    public static final boolean LIZLLL;
    public static int LJ;
    public static long LJFF;

    static {
        LIZLLL = (C0CNZ.LIZLLL() & 32) > 0;
        LJ = -1;
        LJFF = -1L;
    }

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ() {
        /*
            com.ss.android.ugc.aweme.comment.experiment.CommentSurveyDataItem r0 = X.C1911270zpt.LIZIZ()
            r5 = 0
            if (r0 == 0) goto L79
            int r11 = r0.frequencyDay
        L9:
            com.ss.android.ugc.aweme.comment.experiment.CommentSurveyDataItem r0 = X.C1911270zpt.LIZIZ()
            if (r0 == 0) goto L77
            int r4 = r0.frequencyTimes
        L11:
            boolean r10 = X.C2250521D6s.LIZLLL
            if (r10 == 0) goto L68
            long r8 = X.C2250521D6s.LJFF
            r1 = -1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L68
        L1d:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r8
            int r0 = r11 * 24
            int r0 = r0 * 60
            int r0 = r0 * 60
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L5a
            if (r10 == 0) goto L5b
            int r3 = X.C2250521D6s.LJ
            r0 = -1
            if (r3 == r0) goto L5b
        L37:
            X.0lXi r2 = X.C1361840lXi.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isHitFrequency shownCount="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", frequencyTimes="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C1361840lXi.LIZ(r0)
            if (r3 < r4) goto L5a
            r5 = 1
        L5a:
            return r5
        L5b:
            com.bytedance.keva.Keva r1 = LIZ()
            java.lang.String r0 = X.C2250521D6s.LIZIZ
            int r3 = r1.getInt(r0, r5)
            X.C2250521D6s.LJ = r3
            goto L37
        L68:
            com.bytedance.keva.Keva r3 = LIZ()
            java.lang.String r2 = X.C2250521D6s.LIZJ
            r0 = 0
            long r8 = r3.getLong(r2, r0)
            X.C2250521D6s.LJFF = r8
            goto L1d
        L77:
            r4 = 0
            goto L11
        L79:
            r11 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250521D6s.LIZIZ():boolean");
    }
}
