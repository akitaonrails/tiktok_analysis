package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.10FS, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10FS {
    public static final String LIZIZ(float f) {
        String strValueOf;
        String strValueOf2;
        long jLIZJ = C814420VxA.LIZJ(f);
        long j = 60;
        long j2 = jLIZJ / j;
        long j3 = jLIZJ % j;
        if (j2 < 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('0');
            sbLIZ.append(j2);
            strValueOf = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strValueOf = String.valueOf(j2);
        }
        if (j3 < 10) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('0');
            sbLIZ2.append(j3);
            strValueOf2 = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strValueOf2 = String.valueOf(j3);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strValueOf);
        sbLIZ3.append(':');
        sbLIZ3.append(strValueOf2);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static final long LIZJ(float f) {
        return TimeUnit.SECONDS.toMillis(C814420VxA.LIZJ(f));
    }

    public static final float LIZLLL(int i) {
        return TimeUnit.MILLISECONDS.toSeconds(i);
    }

    public static final float LJ(long j) {
        return TimeUnit.MILLISECONDS.toSeconds(j);
    }

    public static final C443120HZe LIZ(boolean z, Float f) {
        String strValueOf;
        String strValueOf2 = CardStruct.IStatusCode.DEFAULT;
        if (f == null) {
            return new C443120HZe("", "", CardStruct.IStatusCode.DEFAULT);
        }
        int iLIZIZ = C814420VxA.LIZIZ(f.floatValue());
        int i = iLIZIZ / 3600;
        int i2 = (iLIZIZ % 3600) / 60;
        int i3 = iLIZIZ % 60;
        if (i <= 0) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(i);
        }
        if (i2 > 0) {
            strValueOf2 = String.valueOf(i2);
        } else if (!z) {
            strValueOf2 = "";
        }
        return new C443120HZe(strValueOf, strValueOf2, String.valueOf(i3));
    }
}
