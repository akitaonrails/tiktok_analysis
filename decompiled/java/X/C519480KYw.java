package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.widget.RemoteViews;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.follow.widget.FollowBigWidgetProvider;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.tablet.api.IDeviceCapability;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0KYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519480KYw {
    public static long LIZIZ;
    public static long LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static final C519480KYw LIZ = new C519480KYw();
    public static int LIZJ = -1;
    public static List<C0KZ1> LIZLLL = new ArrayList();
    public static String LJ = "";
    public static int LJFF = -1;
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(120));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(119));

    public static int LIZLLL() {
        int i = LIZJ;
        if (i <= 0) {
            i = LJ().getInt("follow_anchor_live_num", 0);
        }
        return "small".equals(LJ) ? Math.min(i, 3) : Math.min(i, 4);
    }

    public static Keva LJ() {
        return (Keva) LJIIIZ.getValue();
    }

    public static int LIZIZ() {
        return ((Number) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(0, "tiktok_live_following_widget_type")).intValue();
    }

    public static boolean LJII() {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin();
    }

    public static void LJIIIZ() throws Throwable {
        Activity activityLJFF;
        if (System.currentTimeMillis() - LIZIZ >= Mp4ScreenVideoLoadTimeout.CONTROL && (activityLJFF = C2214201BlK.LJFF()) != null) {
            LIZIZ = System.currentTimeMillis();
            LIZ.getClass();
            LJIIJ(activityLJFF);
        }
    }

    public static boolean LIZ(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 26) {
            return AppWidgetManager.getInstance(context).isRequestPinAppWidgetSupported();
        }
        return false;
    }

    public static void LJIIJ(Context context) throws Throwable {
        boolean z;
        if (LJI(context, true).length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Intent intent = new Intent();
            intent.setAction("com.ss.android.ugc.aweme.follow.BIG_WIDGET_UPDATE");
            intent.setPackage(context.getPackageName());
            C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOynb5PBy3wBFZdR75YAR1UnOXB9nlvc0neuWZc=", null));
        }
        if (LJI(context, false).length != 0) {
            Intent intent2 = new Intent();
            intent2.setAction("com.ss.android.ugc.aweme.follow.SAMLL_WIDGET_UPDATE");
            intent2.setPackage(context.getPackageName());
            C2204961BRm.LJJJJI(context, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOynb5PBy3wBFZdR75YAR1UnOXB9nlvc0neuWZc=", null));
        }
    }

    public static void LJIIJJI(Context context) {
        if (!LJII) {
            return;
        }
        int iLIZLLL = LIZLLL();
        if (iLIZLLL > 0) {
            FollowFeedServiceImpl.LJIL().LIZJ(context);
            LJII = false;
        } else {
            InterfaceC519500KYy interfaceC519500KYyO4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(true);
            if (interfaceC519500KYyO4.LJIIIZ()) {
                interfaceC519500KYyO4.LJIILJJIL(context);
                String str = LJ;
                boolean z = C486660J6q.LIZ;
                HashMap map = new HashMap();
                map.put("enter_from_merge", "follow_widget");
                map.put("enter_method", "live_merge");
                map.put("_param_live_platform", "live");
                map.put("widget_type", str);
                C20684815ws.LJIILLIIL("livesdk_enter_live_merge", map);
            }
        }
        String str2 = LJ;
        int i = LJFF;
        boolean z2 = C486660J6q.LIZ;
        HashMap map2 = new HashMap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iLIZLLL);
        sbLIZ.append("");
        map2.put("widget_anchor_num", C2188811AlT.LIZIZ(sbLIZ));
        map2.put("widget_type", str2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(i);
        sbLIZ2.append("");
        map2.put("anchor_position", C2188811AlT.LIZIZ(sbLIZ2));
        C20684815ws.LJIILLIIL("livesdk_widget_enter", map2);
    }

    public static int[] LJI(Context context, boolean z) {
        Class cls;
        try {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (appWidgetManager != null) {
                if (z) {
                    cls = FollowBigWidgetProvider.class;
                } else {
                    cls = C0KZ2.class;
                }
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) cls));
                if (appWidgetIds != null) {
                    return appWidgetIds;
                }
            }
            return new int[0];
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("FollowAddWidgetGuideUtil", th);
            return new int[0];
        }
    }

    public static PendingIntent LIZJ(Context context, int i, boolean z) {
        IDeviceCapability iDeviceCapability;
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        if (z) {
            intent.putExtra("follow_widget_click_type", "medium");
        } else {
            intent.putExtra("follow_widget_click_type", "small");
        }
        intent.putExtra("follow_widget_click_position", i);
        intent.putExtra("follow_widget_enter_from_merge", "follow_widget");
        intent.putExtra("tab", 0);
        if ((!LIZLLL.isEmpty()) && LIZLLL.size() > i) {
            intent.putExtra("follow_widget_click_room_id", ((C0KZ1) ListProtector.get(LIZLLL, i)).LIZ);
            intent.putExtra("follow_widget_click_anchor_id", ((C0KZ1) ListProtector.get(LIZLLL, i)).LIZIZ);
        }
        int iIntValue = ((Number) LJIIJ.getValue()).intValue();
        if (Build.VERSION.SDK_INT >= 26 && (iDeviceCapability = (IDeviceCapability) PluggableExtentionKt.pluggableSpi$default(IDeviceCapability.class, false, false, false, 14, null)) != null && iDeviceCapability.l()) {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            activityOptionsMakeBasic.setLaunchDisplayId(0);
            return PendingIntent.getActivity(context, i, intent, iIntValue, activityOptionsMakeBasic.toBundle());
        }
        return PendingIntent.getActivity(context, i, intent, iIntValue);
    }

    public static Bitmap LJFF(float f, int i, int i2, Bitmap bitmap) {
        if (i < bitmap.getWidth()) {
            bitmap = ThumbnailUtils.extractThumbnail(bitmap, i, i2);
        }
        int[] iArr = {bitmap.getWidth(), bitmap.getHeight()};
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, iArr[0], iArr[1]);
        RectF rectF = new RectF(new Rect(0, 0, iArr[0], iArr[1]));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    public static void LJIIIIZZ(final Context context, final int i, final int i2, String str, final int i3, final int i4, final float f, final RemoteViews remoteViews) {
        AbstractC468201s0 abstractC468201s0 = new AbstractC468201s0() { // from class: X.0KYx
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap != null) {
                    RemoteViews remoteViews2 = remoteViews;
                    int i5 = i3;
                    int i6 = i;
                    int i7 = i2;
                    float f2 = f;
                    Context context2 = context;
                    int i8 = i4;
                    try {
                        C519480KYw.LIZ.getClass();
                        remoteViews2.setImageViewBitmap(i5, C519480KYw.LJFF(f2, i6, i7, bitmap));
                        AppWidgetManager.getInstance(context2).updateAppWidget(i8, remoteViews2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C20441214yg.LJI("FollowAddWidgetGuideUtil", th);
                    }
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                C20441214yg.LJI("FollowAddWidgetGuideUtil", th);
            }
        };
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJIJL(context);
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.RGB_565;
        c1331670kl3LJIIIZ.LJJII(abstractC468201s0);
    }
}
