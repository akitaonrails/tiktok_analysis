package Y;

import X.C0GZ2;
import X.C0IPN;
import X.C0KZ1;
import X.C0KZ2;
import X.C0X52;
import X.C1143680frq;
import X.C1515820pY4;
import X.C1C7U;
import X.C20441214yg;
import X.C20642515q3;
import X.C376710Epp;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C497120JeY;
import X.C519480KYw;
import X.C786410Ut5;
import X.C814420VxA;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.follow.widget.FollowBigWidgetProvider;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public class ACallableS239S0200000_7 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS239S0200000_7 aCallableS239S0200000_7) {
        boolean z;
        Bitmap bitmapLIZ;
        C1C7U.LIZ("FollowBigWidgetProvider@e720.updateWidget$1");
        Context context = (Context) aCallableS239S0200000_7.l0;
        if (context != null) {
            FollowBigWidgetProvider followBigWidgetProvider = (FollowBigWidgetProvider) aCallableS239S0200000_7.l1;
            C519480KYw.LIZ.getClass();
            int[] iArrLJI = C519480KYw.LJI(context, true);
            int i = 0;
            if (iArrLJI.length != 0) {
                int length = iArrLJI.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = iArrLJI[i2];
                    followBigWidgetProvider.getClass();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                    RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.dcu);
                    C519480KYw.LIZ.getClass();
                    if (C519480KYw.LIZJ > 0 && C519480KYw.LJII()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        C519480KYw.LJ().storeInt("follow_anchor_live_num", i);
                        Drawable drawableLIZ = C1143680frq.LIZ(C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_outside_demand_1"), "live_big_widget_default_bg.png");
                        if (drawableLIZ != null) {
                            bitmapLIZ = C0GZ2.LIZ(drawableLIZ, drawableLIZ.getIntrinsicWidth(), drawableLIZ.getIntrinsicHeight(), null);
                        } else {
                            bitmapLIZ = null;
                        }
                        remoteViews.setViewVisibility(R.id.ie3, i);
                        remoteViews.setViewVisibility(R.id.ie_, 8);
                        if (bitmapLIZ != null) {
                            remoteViews.setImageViewBitmap(R.id.kbu, bitmapLIZ);
                        }
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZIZ = iLIZIZ;
                        c419910GdJ.LIZJ = iLIZIZ2;
                        c419910GdJ.LIZ = R.raw.icon_color_tiktok_logo_dark;
                        remoteViews.setImageViewBitmap(R.id.kbv, C376710Epp.LIZIZ(c419910GdJ.LIZ(context)));
                        if (!C519480KYw.LJII()) {
                            remoteViews.setTextViewText(R.id.zak, C20642515q3.LJI(R.string.p6l));
                            remoteViews.setTextViewText(R.id.zal, C20642515q3.LJI(R.string.p6k));
                        } else {
                            remoteViews.setTextViewText(R.id.zak, C20642515q3.LJI(R.string.p6g));
                            remoteViews.setTextViewText(R.id.zal, C20642515q3.LJI(R.string.p6h));
                        }
                        remoteViews.setOnClickPendingIntent(R.id.ie3, C519480KYw.LIZJ(context, i, true));
                    } else {
                        remoteViews.setViewVisibility(R.id.ie3, 8);
                        remoteViews.setViewVisibility(R.id.ie_, i);
                        remoteViews.setTextViewText(R.id.zam, C20642515q3.LJI(R.string.p6j));
                        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZIZ = iLIZIZ3;
                        c419910GdJ2.LIZJ = iLIZIZ4;
                        c419910GdJ2.LIZ = R.raw.icon_color_tiktok_logo_dark;
                        remoteViews.setImageViewBitmap(R.id.kbw, C376710Epp.LIZIZ(c419910GdJ2.LIZ(context)));
                        int i4 = C519480KYw.LIZJ;
                        if (i4 == 1) {
                            remoteViews.setViewVisibility(R.id.ie9, i);
                            remoteViews.setViewVisibility(R.id.ie4, 8);
                            C519480KYw.LJIIIIZZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, i)).LIZJ, R.id.kbx, i3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)), remoteViews);
                            remoteViews.setOnClickPendingIntent(R.id.i00, C519480KYw.LIZJ(context, i, true));
                            remoteViews.setTextViewText(R.id.zm0, C20642515q3.LJI(R.string.w9o));
                            remoteViews.setTextViewText(R.id.zmd, ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, i)).LIZLLL);
                            remoteViews.setTextViewText(R.id.zmc, ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, i)).LJ);
                            remoteViews.setOnClickPendingIntent(R.id.zmd, C519480KYw.LIZJ(context, i, true));
                            remoteViews.setOnClickPendingIntent(R.id.zmc, C519480KYw.LIZJ(context, i, true));
                        } else {
                            remoteViews.setViewVisibility(R.id.ie9, 8);
                            remoteViews.setViewVisibility(R.id.ie4, i);
                            C519480KYw.LJIIIIZZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, i)).LIZJ, R.id.kf5, i3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), remoteViews);
                            C519480KYw.LJIIIIZZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 1)).LIZJ, R.id.kf6, i3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), remoteViews);
                            remoteViews.setTextViewText(R.id.kf8, ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, i)).LIZLLL);
                            remoteViews.setTextViewText(R.id.kf_, ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 1)).LIZLLL);
                            remoteViews.setOnClickPendingIntent(R.id.ie6, C519480KYw.LIZJ(context, i, true));
                            remoteViews.setOnClickPendingIntent(R.id.ie8, C519480KYw.LIZJ(context, 1, true));
                            remoteViews.setOnClickPendingIntent(R.id.ie7, C519480KYw.LIZJ(context, 2, true));
                            remoteViews.setOnClickPendingIntent(R.id.ie5, C519480KYw.LIZJ(context, 3, true));
                            remoteViews.setTextViewText(R.id.zao, C20642515q3.LJI(R.string.w9o));
                            remoteViews.setTextViewText(R.id.zaq, C20642515q3.LJI(R.string.w9o));
                            remoteViews.setTextViewText(R.id.zap, C20642515q3.LJI(R.string.w9o));
                            remoteViews.setTextViewText(R.id.zan, C20642515q3.LJI(R.string.w9o));
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    remoteViews.setViewVisibility(R.id.ie7, i);
                                    remoteViews.setViewVisibility(R.id.ie5, i);
                                    C519480KYw.LJIIIIZZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 2)).LIZJ, R.id.kf4, i3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), remoteViews);
                                    remoteViews.setTextViewText(R.id.kf9, ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 2)).LIZLLL);
                                    C519480KYw.LJIIIIZZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 3)).LIZJ, R.id.kf3, i3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), remoteViews);
                                    remoteViews.setTextViewText(R.id.kf7, ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 3)).LIZLLL);
                                } else {
                                    remoteViews.setViewVisibility(R.id.ie7, 0);
                                    remoteViews.setViewVisibility(R.id.ie5, 8);
                                    C519480KYw.LJIIIIZZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 2)).LIZJ, R.id.kf4, i3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), remoteViews);
                                    remoteViews.setTextViewText(R.id.kf9, ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 2)).LIZLLL);
                                }
                            } else {
                                remoteViews.setViewVisibility(R.id.ie7, 4);
                                remoteViews.setViewVisibility(R.id.ie5, 8);
                            }
                        }
                    }
                    try {
                        appWidgetManager.updateAppWidget(i3, remoteViews);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJI("FollowBigWidgetProvider", e);
                    }
                    i2++;
                    i = 0;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowBigWidgetProvider@e720.updateWidget$1");
        return unit;
    }

    public static final Object call$1(ACallableS239S0200000_7 aCallableS239S0200000_7) {
        boolean z;
        Bitmap bitmapLIZ;
        C1C7U.LIZ("FollowSmallWidgetProvider@32ad.updateWidget$1");
        Context context = (Context) aCallableS239S0200000_7.l0;
        if (context != null) {
            C0KZ2 c0kz2 = (C0KZ2) aCallableS239S0200000_7.l1;
            C519480KYw.LIZ.getClass();
            int[] iArrLJI = C519480KYw.LJI(context, false);
            if (iArrLJI.length != 0) {
                for (int i : iArrLJI) {
                    c0kz2.getClass();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                    RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.dcv);
                    C519480KYw.LIZ.getClass();
                    if (C519480KYw.LIZJ > 0 && C519480KYw.LJII()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        C519480KYw.LJ().storeInt("follow_anchor_live_num", 0);
                        Drawable drawableLIZ = C1143680frq.LIZ(C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_outside_demand_1"), "live_samll_widget_default_bg.png");
                        if (drawableLIZ != null) {
                            bitmapLIZ = C0GZ2.LIZ(drawableLIZ, drawableLIZ.getIntrinsicWidth(), drawableLIZ.getIntrinsicHeight(), null);
                        } else {
                            bitmapLIZ = null;
                        }
                        remoteViews.setViewVisibility(R.id.if9, 0);
                        remoteViews.setViewVisibility(R.id.if_, 8);
                        if (bitmapLIZ != null) {
                            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLIZ.getWidth(), bitmapLIZ.getHeight(), Bitmap.Config.ARGB_8888);
                            Paint paint = new Paint();
                            paint.setAntiAlias(true);
                            Rect rect = new Rect(0, 0, bitmapLIZ.getWidth(), bitmapLIZ.getHeight());
                            RectF rectF = new RectF(rect);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            canvas.drawRoundRect(rectF, fLIZIZ, fLIZIZ, paint);
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                            canvas.drawBitmap(bitmapLIZ, rect, rect, paint);
                            remoteViews.setImageViewBitmap(R.id.kek, bitmapCreateBitmap);
                        }
                        if (!C519480KYw.LJII()) {
                            remoteViews.setTextViewText(R.id.tv_samll_widget_desc, C20642515q3.LJI(R.string.p6l));
                            remoteViews.setTextViewText(R.id.tv_samll_watch_live, C20642515q3.LJI(R.string.p6k));
                        } else {
                            remoteViews.setTextViewText(R.id.tv_samll_widget_desc, C20642515q3.LJI(R.string.p6g));
                            remoteViews.setTextViewText(R.id.tv_samll_watch_live, C20642515q3.LJI(R.string.p6h));
                        }
                        remoteViews.setOnClickPendingIntent(R.id.if9, C519480KYw.LIZJ(context, 0, false));
                    } else {
                        remoteViews.setViewVisibility(R.id.if9, 8);
                        remoteViews.setViewVisibility(R.id.if_, 0);
                        remoteViews.setTextViewText(R.id.tv_samll_live_tag, C20642515q3.LJI(R.string.w9o));
                        remoteViews.setOnClickPendingIntent(R.id.if_, C519480KYw.LIZJ(context, 0, false));
                        int i2 = C519480KYw.LIZJ;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                remoteViews.setViewVisibility(R.id.kej, 8);
                                remoteViews.setViewVisibility(R.id.ifb, 8);
                                remoteViews.setViewVisibility(R.id.ifa, 0);
                                C519480KYw.LJIIIIZZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 0)).LIZJ, R.id.kcr, i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), remoteViews);
                                C519480KYw.LJIIIIZZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 1)).LIZJ, R.id.kct, i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), remoteViews);
                                C519480KYw.LJIIIIZZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 2)).LIZJ, R.id.kcs, i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), remoteViews);
                                String strLJI = C20642515q3.LJI(R.string.p6o);
                                if (strLJI != null) {
                                    remoteViews.setTextViewText(R.id.tv_samll_anchor_desc, C786410Ut5.j4(strLJI, Arrays.copyOf(new Object[]{((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 0)).LIZLLL, Integer.valueOf(i2 - 1)}, 2)));
                                }
                            } else {
                                remoteViews.setViewVisibility(R.id.kej, 8);
                                remoteViews.setViewVisibility(R.id.ifb, 0);
                                remoteViews.setViewVisibility(R.id.ifa, 8);
                                C519480KYw.LJIIIIZZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 0)).LIZJ, R.id.kcu, i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), remoteViews);
                                C519480KYw.LJIIIIZZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 1)).LIZJ, R.id.kcv, i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), remoteViews);
                                String strLJI2 = C20642515q3.LJI(R.string.p6n);
                                if (strLJI2 != null) {
                                    remoteViews.setTextViewText(R.id.tv_samll_anchor_desc, C786410Ut5.j4(strLJI2, Arrays.copyOf(new Object[]{((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 0)).LIZLLL, ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 1)).LIZLLL}, 2)));
                                }
                            }
                        } else {
                            remoteViews.setViewVisibility(R.id.kej, 0);
                            remoteViews.setViewVisibility(R.id.ifb, 8);
                            remoteViews.setViewVisibility(R.id.ifa, 8);
                            C519480KYw.LJIIIIZZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)), ((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 0)).LIZJ, R.id.kej, i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)), remoteViews);
                            String strLJI3 = C20642515q3.LJI(R.string.p6m);
                            if (strLJI3 != null) {
                                remoteViews.setTextViewText(R.id.tv_samll_anchor_desc, C786410Ut5.j4(strLJI3, Arrays.copyOf(new Object[]{((C0KZ1) ListProtector.get(C519480KYw.LIZLLL, 0)).LIZLLL}, 1)));
                            }
                        }
                    }
                    try {
                        appWidgetManager.updateAppWidget(i, remoteViews);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJI("FollowSmallWidgetProvider", e);
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowSmallWidgetProvider@32ad.updateWidget$1");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$2(ACallableS239S0200000_7 aCallableS239S0200000_7) {
        Unit unit;
        C1C7U.LIZ("LiveCombineReqeust@92d7.doCombineRequest$1$onResponse$1");
        C1515820pY4 c1515820pY4 = (C1515820pY4) ((C0X52) aCallableS239S0200000_7.l0).LIZIZ;
        if (c1515820pY4 != null) {
            c1515820pY4.LIZLLL(((C497120JeY) aCallableS239S0200000_7.l1).LJIILLIIL);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("LiveCombineReqeust@92d7.doCombineRequest$1$onResponse$1");
        return unit;
    }

    public ACallableS239S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
