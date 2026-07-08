package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.widget.core.ui.SearchMiddleWidget;

/* JADX INFO: renamed from: X.0QL4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QL4 {
    public static final C0QL4 LIZ = new C0QL4();

    public static boolean LIZIZ(Context context) {
        int[] appWidgetIds;
        boolean z = false;
        try {
            appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) SearchMiddleWidget.class));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            appWidgetIds = new int[0];
        }
        if (appWidgetIds.length == 0) {
            z = true;
        }
        return !z;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
