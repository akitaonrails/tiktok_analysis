package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetProvider;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0xzz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840650xzz {
    public static final Map<String, Bitmap> LIZ = new LinkedHashMap();
    public static final Paint LIZIZ;

    static {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        LIZIZ = paint;
    }

    public static void LIZLLL(Map map) {
        Map<String, Bitmap> map2 = LIZ;
        synchronized (map2) {
            try {
                ((LinkedHashMap) map2).clear();
                map2.putAll(map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJ(Context context) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context.getPackageName(), BonusWidgetProvider.class.getName()));
        if (appWidgetIds.length == 0) {
            return;
        }
        for (int i : appWidgetIds) {
            Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
            int i2 = appWidgetOptions.getInt("appWidgetMinWidth", 158);
            int i3 = appWidgetOptions.getInt("appWidgetMinHeight", 158);
            int i4 = appWidgetOptions.getInt("appWidgetMaxWidth", 0);
            int i5 = appWidgetOptions.getInt("appWidgetMaxHeight", 0);
            if (i4 > i2) {
                i2 = i4;
            }
            if (i5 > i3) {
                i3 = i5;
            }
            appWidgetManager.updateAppWidget(i, LIZJ(Math.min(i2, i3), context));
        }
    }

    public static Bitmap LIZIZ(int i, Context context) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iLIZIZ, iLIZIZ, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = iLIZIZ / 2.0f;
        canvas.drawCircle(f, f, f - fLIZIZ, LIZIZ);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_tiktok_logo_circle_fill;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        tuxIconDrawableLIZ.setBounds(0, 0, iLIZIZ, iLIZIZ);
        tuxIconDrawableLIZ.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a4  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v13, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v37, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v22, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.widget.RemoteViews LIZJ(int r25, android.content.Context r26) {
        /*
            Method dump skipped, instruction units count: 1744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1840650xzz.LIZJ(int, android.content.Context):android.widget.RemoteViews");
    }

    public static void LIZ(RemoteViews remoteViews, int i, int i2, int i3, C1157250gDj c1157250gDj, Map map) {
        boolean z;
        Bitmap bitmap = (Bitmap) map.get(c1157250gDj.LIZJ);
        if (bitmap != null || (bitmap = (Bitmap) map.get("https://sf16-sg.tiktokcdn.com/obj/eden-sg/j_uvpavtvyw_hlz_jjln/ljhwZthlaukjlkulzlp/bonus/widget/BonusWidgetBubble.webp")) != null) {
            remoteViews.setImageViewBitmap(i, bitmap);
        }
        if (c1157250gDj.LIZIZ.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            remoteViews.setViewVisibility(i2, 0);
            remoteViews.setTextViewText(i2, c1157250gDj.LIZIZ);
        } else {
            remoteViews.setViewVisibility(i2, 8);
        }
        if (c1157250gDj.LIZ.length() > 0) {
            remoteViews.setViewVisibility(i3, 0);
            remoteViews.setTextViewText(i3, c1157250gDj.LIZ);
        } else {
            remoteViews.setViewVisibility(i3, 8);
        }
    }
}
