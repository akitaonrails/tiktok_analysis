package X;

import Y.ARunnableS60S0300000_27;
import Y.ARunnableS96S0200000_27;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.widget.AppWidgetSchedulerService;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0y0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1841200y0s extends C0KZC {
    public abstract String LIZJ();

    public final void LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ());
        sbLIZ.append(": ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        super.onDisabled(context);
        IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService != null) {
            iAppWidgetService.LIZJ("disabled", LIZJ());
        }
        LIZLLL("onDisabled");
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        super.onEnabled(context);
        IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService != null) {
            iAppWidgetService.LIZJ("enable", LIZJ());
        }
        LIZLLL("onEnabled");
    }

    public final void LIZIZ(Context context, Intent intent) {
        LIZLLL("received check widgets state broadcast!");
        super.onReceive(context, intent);
        if (context == null) {
            return;
        }
        LIZLLL("onReceive");
        String action = intent.getAction();
        if (action != null && action.hashCode() == -1388051852 && action.equals("com.ss.android.ugc.tiktok.app.widget.CHECK_STATE")) {
            LIZLLL("received check widgets state broadcast: ACTION_CHECK_STATE");
            IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
            if (iAppWidgetService != null && iAppWidgetService.LJII()) {
                C823050WQl.LJFF().execute(new ARunnableS96S0200000_27(this, context, 19));
            } else {
                LJ(context, true, C1841180y0q.LIZ(context));
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService != null) {
            iAppWidgetService.LIZJ("delete", LIZJ());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDeleted - ");
        sbLIZ.append(iArr[0]);
        LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0KZC, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZIZ(context, intent);
        }
    }

    public final void LJ(Context context, boolean z, int[] iArr) {
        boolean zLIZIZ;
        LIZLLL("tryUpdateWidget");
        AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(context, 110);
        boolean zBooleanValue = ((Boolean) C07AX.LIZ.getValue()).booleanValue();
        if (zBooleanValue) {
            C1841030y0b.LIZ.getClass();
            zLIZIZ = C1841030y0b.LJFF(context, iArr, awS582S0100000_3, z);
        } else {
            zLIZIZ = C1841010y0Z.LIZIZ(C1841010y0Z.LIZ, context, iArr, awS582S0100000_3);
        }
        if (!zLIZIZ || C10EU.LJIILIIL()) {
            return;
        }
        try {
            JobInfo.Builder builder = new JobInfo.Builder(11, new ComponentName(context, (Class<?>) AppWidgetSchedulerService.class));
            builder.setMinimumLatency(3000L);
            PersistableBundle persistableBundle = new PersistableBundle();
            int i = 1;
            persistableBundle.putInt("app_widget_action_type", 1);
            if (zBooleanValue) {
                i = 5;
            }
            persistableBundle.putInt("app_widget_type", i);
            if (iArr == null) {
                iArr = C1841180y0q.LIZ(context);
            }
            persistableBundle.putIntArray("app_widget_ids", iArr);
            if (zBooleanValue) {
                persistableBundle.putBoolean("app_widget_force_update", z);
            }
            builder.setExtras(persistableBundle);
            ((JobScheduler) C786410Ut5.H2(context, "jobscheduler")).schedule(builder.build());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        LIZLLL("onUpdate");
        IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService != null) {
            iAppWidgetService.LIZJ("update", LIZJ());
        }
        IAppWidgetService iAppWidgetService2 = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService2 != null && iAppWidgetService2.LJII()) {
            C823050WQl.LJFF().execute(new ARunnableS60S0300000_27(this, context, iArr, 9));
        } else {
            LJ(context, false, iArr);
        }
    }
}
