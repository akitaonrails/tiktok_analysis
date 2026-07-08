package X;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.widget.LargeStoryWidget;
import com.ss.android.ugc.aweme.story.widget.SmallStoryWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS78S0210000_27;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0xzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840380xzY {
    public static boolean LJI;
    public static final C1840380xzY LIZ = new C1840380xzY();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()).plus(new C1864950ydB(CoroutineExceptionHandler.LJJLIL, 0)));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(226));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(227));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(225));
    public static final String LJFF = "";
    public static final Set<Integer> LJII = new LinkedHashSet();

    public static int[] LIZ(Context context) {
        int[] iArrLIZIZ = LIZIZ(context, true);
        int[] iArrLIZIZ2 = LIZIZ(context, false);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(C13LQ.LJJLJ(iArrLIZIZ));
        linkedHashSet.addAll(C13LQ.LJJLJ(iArrLIZIZ2));
        return C13LP.LLII(linkedHashSet);
    }

    public static int[] LIZIZ(Context context, boolean z) {
        Class cls;
        try {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (appWidgetManager != null) {
                if (z) {
                    cls = LargeStoryWidget.class;
                } else {
                    cls = SmallStoryWidget.class;
                }
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) cls));
                if (appWidgetIds != null) {
                    return appWidgetIds;
                }
            }
            return new int[0];
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new int[0];
        }
    }

    public static void LIZJ(Context context, List list) {
        if (LIZ(context).length == 0 || LJI) {
            return;
        }
        LJI = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceUpdateToEmpty=[");
        sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z = !((ArrayList) list).isEmpty();
        C1838770xwx c1838770xwx = new C1838770xwx();
        C23250099c.LIZLLL(LIZIZ, c1838770xwx, null, new C1840290xzP("StoryWidgetMgr-refreshWidgetInternal", z, context, list, c1838770xwx, null), 2).LJII(new AwS78S0210000_27(context, c1838770xwx, z, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public static void LIZLLL(Context context, C13BV c13bv, boolean z) {
        int i;
        Class cls;
        int[] appWidgetIds;
        ?? LJJLJ;
        Intent intentLJIIIZ;
        PendingIntent pendingIntentLJ;
        if (z) {
            i = R.layout.r0;
            cls = LargeStoryWidget.class;
        } else {
            i = R.layout.r2;
            cls = SmallStoryWidget.class;
        }
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (appWidgetManager == null || (appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) cls))) == null) {
            appWidgetIds = new int[0];
        }
        if (!c13bv.isEmpty()) {
            LJJLJ = new ArrayList();
            for (Object obj : c13bv) {
                if (C13LQ.LJJIJ(((Number) obj).intValue(), appWidgetIds) >= 0) {
                    LJJLJ.add(obj);
                }
            }
        } else {
            LJJLJ = C13LQ.LJJLJ(appWidgetIds);
        }
        ?? LIZ2 = C2188811AlT.LIZ();
        LIZ2.append("updateSingleWidgetToStoryCamera [");
        LIZ2.append(C13LQ.LJJIL(appWidgetIds, ",", null, 62));
        LIZ2.append("] ");
        LIZ2.append(LJJLJ);
        C2188811AlT.LIZIZ(LIZ2);
        if (LJJLJ.isEmpty()) {
            return;
        }
        int[] iArrLLII = C13LP.LLII(LJJLJ);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
        IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService != null && (intentLJIIIZ = iAppWidgetService.LJIIIZ(context, "story_s")) != null) {
            intentLJIIIZ.putExtra("extra_jump_type", 6);
            intentLJIIIZ.setFlags(268435456);
            intentLJIIIZ.addFlags(67108864);
            IAppWidgetService iAppWidgetService2 = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
            if (iAppWidgetService2 != null && (pendingIntentLJ = iAppWidgetService2.LJ(context, 1, intentLJIIIZ)) != null) {
                remoteViews.setOnClickPendingIntent(R.id.f5b, pendingIntentLJ);
            }
        }
        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context);
        if (appWidgetManager2 != null) {
            appWidgetManager2.updateAppWidget(iArrLLII, remoteViews);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateWidgetToCameraInternal widgetType=");
        sbLIZ.append("story_s");
        sbLIZ.append(" widgetIDs=");
        sbLIZ.append(Arrays.toString(iArrLLII));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    public static void LJ(Context context, List list, boolean z, boolean z2) {
        int i;
        Class cls;
        int[] appWidgetIds;
        ?? LJJLJ;
        String str;
        Intent intentLJIIIZ;
        PendingIntent pendingIntentLJ;
        Intent intentLJIIIZ2;
        PendingIntent pendingIntentLJ2;
        if (z) {
            i = R.layout.qz;
            cls = LargeStoryWidget.class;
        } else {
            i = R.layout.r1;
            cls = SmallStoryWidget.class;
        }
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (appWidgetManager == null || (appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) cls))) == null) {
            appWidgetIds = new int[0];
        }
        if (!list.isEmpty()) {
            LJJLJ = new ArrayList();
            for (Object obj : list) {
                if (C13LQ.LJJIJ(((Number) obj).intValue(), appWidgetIds) >= 0) {
                    LJJLJ.add(obj);
                }
            }
        } else {
            LJJLJ = C13LQ.LJJLJ(appWidgetIds);
        }
        ?? LIZ2 = C2188811AlT.LIZ();
        LIZ2.append("updateSpecificWidgetToEmpty [");
        LIZ2.append(C13LQ.LJJIL(appWidgetIds, ",", null, 62));
        LIZ2.append("] ");
        LIZ2.append(LJJLJ);
        C2188811AlT.LIZIZ(LIZ2);
        if (LJJLJ.isEmpty()) {
            return;
        }
        int[] iArrLLII = C13LP.LLII(LJJLJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryWidgetMgr:updateWidgetToEmptyInternal, ");
        sbLIZ.append(Arrays.toString(iArrLLII));
        C2188811AlT.LIZIZ(sbLIZ);
        if (i == R.layout.qz) {
            str = "story_l";
        } else {
            str = "story_s";
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
        remoteViews.setViewVisibility(R.id.xwa, 8);
        remoteViews.setViewVisibility(R.id.f5b, 0);
        remoteViews.setImageViewResource(R.id.f5b, R.drawable.c6m);
        if (z2) {
            IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
            if (iAppWidgetService != null && (intentLJIIIZ2 = iAppWidgetService.LJIIIZ(context, str)) != null) {
                intentLJIIIZ2.putExtra("extra_jump_type", 3);
                intentLJIIIZ2.setFlags(268435456);
                intentLJIIIZ2.addFlags(67108864);
                IAppWidgetService iAppWidgetService2 = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
                if (iAppWidgetService2 != null && (pendingIntentLJ2 = iAppWidgetService2.LJ(context, 1, intentLJIIIZ2)) != null) {
                    remoteViews.setOnClickPendingIntent(R.id.f5b, pendingIntentLJ2);
                }
            }
        } else {
            IAppWidgetService iAppWidgetService3 = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
            if (iAppWidgetService3 != null && (intentLJIIIZ = iAppWidgetService3.LJIIIZ(context, str)) != null) {
                intentLJIIIZ.putExtra("extra_jump_type", 0);
                intentLJIIIZ.setFlags(268435456);
                intentLJIIIZ.addFlags(67108864);
                IAppWidgetService iAppWidgetService4 = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
                if (iAppWidgetService4 != null && (pendingIntentLJ = iAppWidgetService4.LJ(context, 1, intentLJIIIZ)) != null) {
                    remoteViews.setOnClickPendingIntent(R.id.f5b, pendingIntentLJ);
                }
            }
        }
        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context);
        if (appWidgetManager2 != null) {
            appWidgetManager2.updateAppWidget(iArrLLII, remoteViews);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateWidgetToEmptyInternal widgetType=");
        sbLIZ2.append(str);
        sbLIZ2.append(" widgetIDs=");
        sbLIZ2.append(Arrays.toString(iArrLLII));
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LJFF(Context context, C1838770xwx c1838770xwx, int[] iArr, int i, Bitmap bitmap) {
        String str;
        String string;
        int i2;
        Intent intentLJIIIZ;
        PendingIntent pendingIntentLJ;
        long j;
        C1840320xzS c1840320xzS = c1838770xwx.LL;
        if (c1840320xzS == null) {
            return;
        }
        if (i == R.layout.qz) {
            str = "story_l";
        } else {
            str = "story_s";
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
        remoteViews.setImageViewBitmap(R.id.f5b, bitmap);
        long j2 = c1840320xzS.LIZLLL;
        if (j2 < 3600000) {
            if (j2 < 60000) {
                j = 1;
            } else {
                j = j2 / 60000;
            }
            string = context.getString(2131836242, Long.valueOf(j));
        } else {
            string = context.getString(2131836241, Long.valueOf(j2 / 3600000));
        }
        remoteViews.setTextViewText(R.id.xwo, string);
        remoteViews.setViewVisibility(R.id.f5b, 0);
        remoteViews.setViewVisibility(R.id.xwa, 0);
        String str2 = c1840320xzS.LIZ;
        String str3 = c1840320xzS.LIZIZ;
        if (C1618440sDa.LIZIZ.LJJIIZI().canShowStoryCell()) {
            i2 = 7;
        } else {
            i2 = 8;
        }
        IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService != null && (intentLJIIIZ = iAppWidgetService.LJIIIZ(context, str)) != null) {
            intentLJIIIZ.putExtra("extra_jump_type", i2);
            intentLJIIIZ.putExtra("extra_uid", str2);
            intentLJIIIZ.putExtra("extra_story_id", str3);
            intentLJIIIZ.setFlags(268435456);
            intentLJIIIZ.addFlags(67108864);
            IAppWidgetService iAppWidgetService2 = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
            if (iAppWidgetService2 != null && (pendingIntentLJ = iAppWidgetService2.LJ(context, 1, intentLJIIIZ)) != null) {
                remoteViews.setOnClickPendingIntent(R.id.f5b, pendingIntentLJ);
            }
        }
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (appWidgetManager != null) {
            appWidgetManager.updateAppWidget(iArr, remoteViews);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateWidgetWithAwemeInternal, widgetTypeName=");
        sbLIZ.append(str);
        sbLIZ.append(", refreshWidgetContext=");
        sbLIZ.append(c1838770xwx);
        sbLIZ.append(", widgetIDs=");
        sbLIZ.append(Arrays.toString(iArr));
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
