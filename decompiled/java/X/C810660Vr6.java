package X;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Vr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810660Vr6<T> implements C09JN {
    public final /* synthetic */ Context LL;

    public C810660Vr6(Context context) {
        this.LL = context;
    }

    @Override // X.C09JN
    public final void accept(Object obj) {
        C1C7U.LIZ("LagencyDeviceUpdateKt@232b.lagencyDeviceUpdate$2");
        final Context context = this.LL;
        if (!C2206241BWk.LIZIZ() && C2214201BlK.LJFF() == null) {
            System.currentTimeMillis();
        }
        C827070WcT.LIZ.getClass();
        if (!C2093608Ic.LJ(AppLog.getClientId()) && !C2093608Ic.LJ(C827070WcT.LIZJ())) {
            try {
                C0WP3.LIZLLL(new PthreadAsyncTask<Void, Void, Void>() { // from class: X.0Vpy
                    @Override // android.os.AsyncTask
                    public final Object doInBackground(Object[] objArr) {
                        Context context2 = context;
                        C827070WcT.LIZ.getClass();
                        HashMap map = new HashMap();
                        AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getSSIDs(map);
                        if (context2 != null) {
                            Logger.debug();
                            try {
                                C842230X2f.LIZIZ(context2, 1, C2093608Ic.LJFF(map));
                                return null;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return null;
                            }
                        }
                        return null;
                    }
                }, C2126108Up.LIZ, new Void[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C1C7U.LIZIZ("LagencyDeviceUpdateKt@232b.lagencyDeviceUpdate$2");
    }
}
