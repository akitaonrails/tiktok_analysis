package X;

import android.os.Build;
import android.os.Process;
import com.bytedance.android.livesdk.livesetting.other.LiveThreadPriorityFix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08MB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MB {
    public static Field LJFF;
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public Integer LIZLLL;
    public final C01GW LJ;

    public C08MB(Thread thread) {
        int iLIZ;
        int threadPriority;
        long jLongValue;
        int iIntValue;
        this.LIZ = thread.getName();
        try {
            try {
                Field declaredField = LJFF;
                if (declaredField == null) {
                    declaredField = Thread.class.getDeclaredField("nativePeer");
                    declaredField.setAccessible(true);
                    LJFF = declaredField;
                }
                jLongValue = ((Long) declaredField.get(thread)).longValue();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (jLongValue != 0) {
            if (!LiveThreadPriorityFix.INSTANCE.enable()) {
                iIntValue = ((Number) this.LJ.getValue()).intValue();
            } else {
                Integer num = this.LIZLLL;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        iIntValue = 12;
                    } else {
                        iIntValue = 16;
                    }
                    this.LIZLLL = Integer.valueOf(iIntValue);
                }
            }
            iLIZ = C1960607m8.LIZ(jLongValue + ((long) iIntValue));
        } else {
            iLIZ = 0;
        }
        this.LIZIZ = iLIZ;
        if (iLIZ != 0) {
            try {
                threadPriority = Process.getThreadPriority(iLIZ);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                threadPriority = -100;
            }
        } else {
            threadPriority = -100;
        }
        this.LIZJ = threadPriority;
        this.LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1293));
    }
}
