package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.widget.core.ui.SearchMiddleWidget;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QSK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0QSK extends C0KZC {
    public int LIZ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

    public abstract void LIZIZ(Intent intent, int i, Map map);

    public abstract void LJ();

    public abstract void LJFF(Context context, AppWidgetManager appWidgetManager, int[] iArr);

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(Context context) {
        LJ();
        if (Intrinsics.LJFF("function_entry_medium", "function_entry_medium")) {
            C0QDB c0qdb = C0QDB.LIZ;
            Map mapLJ = C2097608Jq.LJ();
            c0qdb.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("widget_type", "function_entry_medium");
            c2344009Gk.LJIIIIZZ("add_widget_type", C669420QNo.LIZ("function_entry_medium"));
            c2344009Gk.LJIIIIZZ("event_type", "search_widget_delete");
            C0QDB.LIZ(c2344009Gk, mapLJ);
            C20684815ws.LJIILLIIL("search_widget", c2344009Gk.LIZ);
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("widget_type", "function_entry_medium");
            c2344009Gk2.LJIIIIZZ("action_type", "deleted");
            C0QDB.LIZ(c2344009Gk2, mapLJ);
            C20684815ws.LJIILLIIL("widget_action", c2344009Gk2.LIZ);
        }
        C0QSL.LIZ(context, getClass().getName());
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        String str;
        LJ();
        if (Intrinsics.LJFF("function_entry_medium", "function_entry_medium")) {
            C0QDB c0qdb = C0QDB.LIZ;
            Map mapLJ = C2097608Jq.LJ();
            c0qdb.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("widget_type", "function_entry_medium");
            c2344009Gk.LJIIIIZZ("add_widget_type", C669420QNo.LIZ("function_entry_medium"));
            c2344009Gk.LJIIIIZZ("event_type", "search_widget_create");
            C0QDB.LIZ(c2344009Gk, mapLJ);
            C20684815ws.LJIILLIIL("search_widget", c2344009Gk.LIZ);
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("widget_kind", "search");
            c2344009Gk2.LJIIIIZZ("widget_type", "function_entry_medium");
            c2344009Gk2.LJIIIIZZ("add_widget_type", C669420QNo.LIZ("function_entry_medium"));
            if (Intrinsics.LJFF("function_entry_medium", "function_entry_medium")) {
                str = "1";
            } else {
                str = "";
            }
            c2344009Gk2.LJFF("widget_size", str);
            C0QDB.LIZ(c2344009Gk2, mapLJ);
            C20684815ws.LJIILLIIL("widget_added", c2344009Gk2.LIZ);
        }
    }

    public final void LIZJ(Context context, Intent intent) {
        int[] appWidgetIds;
        Class cls;
        super.onReceive(context, intent);
        if (context == null) {
            return;
        }
        if (Intrinsics.LJFF(intent.getAction(), "com.ss.android.ugc.tiktok.app.widget.SEARCH_WIDGET_CHECK_STATE") || Intrinsics.LJFF(intent.getAction(), "android.appwidget.action.APPWIDGET_ENABLED")) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            C0QL4 c0ql4 = C0QL4.LIZ;
            LJ();
            c0ql4.getClass();
            try {
                if (Intrinsics.LJFF("function_entry_medium", "function_entry_medium")) {
                    cls = SearchMiddleWidget.class;
                } else {
                    cls = C0QSK.class;
                }
                appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) cls));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                appWidgetIds = new int[0];
            }
            if (appWidgetIds.length == 0) {
                return;
            }
            LJFF(context, appWidgetManager, appWidgetIds);
        }
    }

    @Override // X.C0KZC, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZJ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZJ(context, intent);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        long j;
        AlarmManager alarmManager;
        C0QNM.LIZLLL(C0QNM.LIZ, context);
        if (C2214201BlK.LJIIJJI) {
            j = C2518709tx.LIZ;
        } else {
            j = C2518809ty.LIZ;
        }
        String name = getClass().getName();
        if (iArr.length != 0) {
            C0QSL.LIZ(context, name);
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setClassName(context, name);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            Bundle bundle = new Bundle();
            bundle.putIntArray("appWidgetIds", iArr);
            intent.putExtras(bundle);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, name.hashCode(), intent, 335544320);
            long jElapsedRealtime = SystemClock.elapsedRealtime() + C13LZ.LJIIJJI(AbstractC19994813Le.Default, new C354710DvR(LSPassThroughRecordSizeConfig.DEFAULT, j));
            Object objH2 = C786410Ut5.H2(context, "alarm");
            if ((objH2 instanceof AlarmManager) && (alarmManager = (AlarmManager) objH2) != null) {
                alarmManager.setRepeating(3, jElapsedRealtime, j, broadcast);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.app.PendingIntent LIZLLL(X.C0QSK r11, int r12, android.content.Context r13, java.util.Map r14, int r15) {
        /*
            r0 = r15 & 8
            if (r0 == 0) goto L8
            java.util.Map r14 = X.C2097608Jq.LJ()
        L8:
            r11.getClass()
            java.lang.Class<com.ss.android.ugc.aweme.IAppWidgetService> r0 = com.ss.android.ugc.aweme.IAppWidgetService.class
            r1 = 0
            r6 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.IAppWidgetService r0 = (com.ss.android.ugc.aweme.IAppWidgetService) r0
            r10 = 0
            if (r0 == 0) goto L5a
            r11.LJ()
            java.lang.String r1 = "function_entry_medium"
            android.content.Intent r2 = r0.LJIIIZ(r13, r1)
            if (r2 == 0) goto L5a
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.addFlags(r0)
            r11.LIZIZ(r2, r12, r14)
            r11.LJ()
            java.lang.String r0 = "widget_type"
            r2.putExtra(r0, r1)
        L3d:
            int r0 = r11.LIZ
            int r0 = r0 + 1
            r11.LIZ = r0
            if (r2 == 0) goto L59
            java.lang.Class<com.ss.android.ugc.aweme.IAppWidgetService> r5 = com.ss.android.ugc.aweme.IAppWidgetService.class
            r9 = 14
            r7 = r6
            r8 = r6
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.IAppWidgetService r1 = (com.ss.android.ugc.aweme.IAppWidgetService) r1
            if (r1 == 0) goto L59
            int r0 = r11.LIZ
            android.app.PendingIntent r10 = r1.LJ(r13, r0, r2)
        L59:
            return r10
        L5a:
            r2 = r5
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QSK.LIZLLL(X.0QSK, int, android.content.Context, java.util.Map, int):android.app.PendingIntent");
    }
}
