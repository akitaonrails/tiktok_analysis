package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.os.Build;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UWF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UWF extends C09AY implements Function1<C773210UUt, Unit> {
    public C0UWF() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C773210UUt c773210UUt) {
        C773210UUt c773210UUt2 = c773210UUt;
        c773210UUt2.getClass();
        if (!C773220UUu.LJIIL) {
            int i = C773220UUu.LJIILL;
            if ((i == 1 || i == 2) && Build.VERSION.SDK_INT >= 30) {
                try {
                    ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) C13LP.LJJJLL(((ActivityManager) C786410Ut5.H2(GlobalContext.getApplicationContext(), "activity")).getHistoricalProcessExitReasons(GlobalContext.getApplicationContext().getPackageName(), 0, 1));
                    if (applicationExitInfo != null) {
                        c773210UUt2.LIZJ.put("app_exit_reason", String.valueOf(applicationExitInfo.getReason()));
                        ConcurrentHashMap<String, String> concurrentHashMap = c773210UUt2.LIZJ;
                        String description = applicationExitInfo.getDescription();
                        if (description == null) {
                            description = "";
                        }
                        concurrentHashMap.put("app_kill_reason", description);
                        c773210UUt2.LIZJ.put("app_exit_timestamp", String.valueOf(applicationExitInfo.getTimestamp()));
                        c773210UUt2.LIZJ.put("app_exit_process_importance", String.valueOf(applicationExitInfo.getImportance()));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            c773210UUt2.LIZJ("system_exit_enter_room", "");
            C773210UUt.LJI().LJIILL("system_enter_prepare_pushing");
            C773220UUu.LJIIL = true;
        }
        return Unit.LIZ;
    }
}
