package X;

import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.keva.KevaImpl;

/* JADX INFO: renamed from: X.0klo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332140klo {
    public static final int LIZ;
    public static final int LIZIZ;
    public static volatile int LIZJ;

    static {
        LIZ = KevaImpl.getRepoSync("lighten_alog_verbose", 1).getBoolean("is_enable_lighten_alog_verbose", false) ? 2 : 3;
        LIZIZ = KevaImpl.getRepoSync("lighten_alog_verbose", 1).getBoolean("is_enable_lighten_alog_verbose", false) ? 2 : 5;
        LIZJ = -1;
    }

    public static long LIZ(float f, Context context) {
        long j;
        long jMin = Math.min(((ActivityManager) C786410Ut5.H2(context, "activity")).getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (jMin < 33554432) {
            j = 4194304;
        } else if (jMin < 67108864) {
            j = 6291456;
        } else {
            j = jMin / 8;
        }
        return (long) (j * f);
    }

    public static long LIZIZ(float f, Context context) {
        if (LIZJ == -1) {
            LIZJ = Math.min(Integer.MAX_VALUE, ((ActivityManager) C786410Ut5.H2(context, "activity")).getLargeMemoryClass() * 1048576);
        }
        return (long) Math.min(LIZJ * C2222891BzL.LIZ.LJIILJJIL(), f * 1048576.0f);
    }
}
