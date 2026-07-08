package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0MzF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586390MzF {
    public static final C586390MzF LIZ = new C586390MzF();
    public static long LIZIZ = -1;
    public static long LIZJ = -1;

    public static void LIZ(Aweme aweme, String str, float f, long j, String str2) {
        long j2;
        C589960NBy.LIZ.getClass();
        if (C589960NBy.LIZ(aweme) && aweme != null && !TextUtils.isEmpty(aweme.getAid()) && !TextUtils.isEmpty(str)) {
            long j3 = LIZIZ;
            if (j3 != -1 && j > j3) {
                long j4 = j - j3;
                long j5 = LIZJ;
                if (j5 > 0) {
                    j2 = j - j5;
                } else {
                    j2 = -1;
                }
                if (f == 1.0f) {
                    if (C299550Bof.LIZ()) {
                        C1386110mAr.LIZ.getClass();
                        C1386110mAr.LIZIZ = null;
                    }
                } else {
                    if (str2 != null) {
                        C1386110mAr.LIZ.getClass();
                        C1386110mAr.LJ(j4, j2, aweme, str, C1386110mAr.LIZ(f), str2);
                    } else {
                        C1386110mAr.LIZ.getClass();
                        C1386110mAr.LJ(j4, j2, aweme, str, C1386110mAr.LIZ(f), C1386110mAr.LIZIZ);
                    }
                    LIZJ = -1L;
                }
                LIZIZ = j;
            }
        }
    }
}
