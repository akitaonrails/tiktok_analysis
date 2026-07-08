package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.ss.android.ugc.aweme.core.SmallAppWidgetProvider;

/* JADX INFO: renamed from: X.0y0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841180y0q {
    public static final /* synthetic */ int LIZ = 0;

    public static int[] LIZ(Context context) {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context.getPackageName(), SmallAppWidgetProvider.class.getName()));
    }
}
