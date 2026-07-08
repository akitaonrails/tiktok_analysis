package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.Build;
import android.os.UserHandle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0W0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816360W0s {
    public static final Method LIZIZ;
    public static final Method LIZJ;
    public final JobScheduler LIZ;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                declaredMethod = null;
            }
        } else {
            declaredMethod = null;
        }
        LIZIZ = declaredMethod;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        LIZJ = declaredMethod2;
    }

    public C816360W0s(JobScheduler jobScheduler) {
        this.LIZ = jobScheduler;
    }
}
