package X;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VHW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VHW {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C0VI8.LIZIZ("WorkerFactory");
    }

    public final ListenableWorker LIZ(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker listenableWorker = null;
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            if (clsAsSubclass != 0) {
                try {
                    ListenableWorker listenableWorker2 = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    listenableWorker = listenableWorker2;
                    if (listenableWorker2 != null && listenableWorker2.LLILZ) {
                        throw new IllegalStateException(C786410Ut5.j4("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C0VI8 c0vi8LIZ = C0VI8.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Could not instantiate ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c0vi8LIZ.getClass();
                }
            }
            return listenableWorker;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Invalid class: ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            c0vi8LIZ2.getClass();
            return null;
        }
    }
}
