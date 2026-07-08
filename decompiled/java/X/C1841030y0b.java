package X;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.RemoteViews;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.widget.model.SuggestedVideoWidgetData;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0y0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841030y0b {
    public static final C1841030y0b LIZ = new C1841030y0b();
    public static final long LIZIZ = TimeUnit.MINUTES.toMillis(30);
    public static final long LIZJ = TimeUnit.HOURS.toMillis(3);

    static {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0Vzy
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                C1841030y0b c1841030y0b = C1841030y0b.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLogin(");
                sbLIZ.append(z);
                sbLIZ.append(", ");
                sbLIZ.append(i);
                sbLIZ.append(", ");
                sbLIZ.append(user);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                c1841030y0b.getClass();
                if (z) {
                    ((Keva) C816170Vzz.LIZ.getValue()).clear();
                    try {
                        Intent intent = new Intent("com.ss.android.ugc.tiktok.app.widget.CHECK_STATE");
                        Context context = C1383370m6R.LIZ;
                        intent.setComponent(new ComponentName(context, "com.ss.android.ugc.aweme.core.SmallAppWidgetProvider"));
                        C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2hZ5jLyHxAlIQfsAKgJ4q9XQmVJvHzC7XfFV5hrHNGIvQnooGhKZmIIM4=", null));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("tryUpdateAllWidgets failed, type=suggest_video_s, t=");
                        sbLIZ2.append(th);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
            }
        });
    }

    public static PendingIntent LIZIZ(Context context, boolean z) {
        Intent intentLJIIIZ;
        int i;
        IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService != null && (intentLJIIIZ = iAppWidgetService.LJIIIZ(context, "suggest_video_s")) != null) {
            if (z) {
                i = 15;
            } else {
                i = 0;
            }
            intentLJIIIZ.putExtra("extra_jump_type", i);
            IAppWidgetService iAppWidgetService2 = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
            if (iAppWidgetService2 != null) {
                return iAppWidgetService2.LJ(context, 7, intentLJIIIZ);
            }
            return null;
        }
        return null;
    }

    public static void LIZ(final Context context, final int i, SuggestedVideoWidgetData suggestedVideoWidgetData) {
        PendingIntent pendingIntentLIZIZ;
        Intent intentLJIIIZ;
        String lastPathSegment;
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.r9);
        remoteViews.setViewVisibility(R.id.mg2, 0);
        remoteViews.setViewVisibility(R.id.mh7, 8);
        remoteViews.setViewVisibility(R.id.mh6, 8);
        remoteViews.setViewVisibility(R.id.mag, 8);
        remoteViews.setViewVisibility(R.id.z9w, 8);
        LIZLLL(remoteViews, R.id.tv_suggest_tag, suggestedVideoWidgetData.itemTag);
        remoteViews.setTextViewText(R.id.tv_suggest_title, suggestedVideoWidgetData.caption);
        String str = suggestedVideoWidgetData.deepLink;
        if (str != null && str.length() != 0) {
            IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
            if (iAppWidgetService != null && (intentLJIIIZ = iAppWidgetService.LJIIIZ(context, "suggest_video_s")) != null) {
                intentLJIIIZ.putExtra("extra_jump_type", 16);
                intentLJIIIZ.putExtra("extra_ug_launch_url", str);
                Uri uri = UriProtector.parse(str);
                if (uri != null && (lastPathSegment = uri.getLastPathSegment()) != null) {
                    intentLJIIIZ.putExtra("extra_aweme_id", lastPathSegment);
                }
                IAppWidgetService iAppWidgetService2 = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
                if (iAppWidgetService2 != null) {
                    pendingIntentLIZIZ = iAppWidgetService2.LJ(context, 7, intentLJIIIZ);
                }
            }
            AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
            String str2 = suggestedVideoWidgetData.coverUrl;
            AbstractC468201s0 abstractC468201s0 = new AbstractC468201s0() { // from class: X.0y0c
                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    try {
                        remoteViews.setImageViewBitmap(R.id.lwh, bitmap);
                        AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            };
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
            c1331670kl3LJIIIZ.LJJIJL(context);
            c1331670kl3LJIIIZ.LJIL = Bitmap.Config.RGB_565;
            c1331670kl3LJIIIZ.LJJII(abstractC468201s0);
        }
        pendingIntentLIZIZ = LIZIZ(context, false);
        if (pendingIntentLIZIZ != null) {
            remoteViews.setOnClickPendingIntent(R.id.tqy, pendingIntentLIZIZ);
        }
        AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
        String str22 = suggestedVideoWidgetData.coverUrl;
        AbstractC468201s0 abstractC468201s02 = new AbstractC468201s0() { // from class: X.0y0c
            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                try {
                    remoteViews.setImageViewBitmap(R.id.lwh, bitmap);
                    AppWidgetManager.getInstance(context).updateAppWidget(i, remoteViews);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        };
        C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str22);
        c1331670kl3LJIIIZ2.LJJIJL(context);
        c1331670kl3LJIIIZ2.LJIL = Bitmap.Config.RGB_565;
        c1331670kl3LJIIIZ2.LJJII(abstractC468201s02);
    }

    public static void LIZLLL(RemoteViews remoteViews, int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<b>");
        sbLIZ.append(str);
        sbLIZ.append("</b>");
        remoteViews.setTextViewText(i, C19298910ep.LIZ(C2188811AlT.LIZIZ(sbLIZ), 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.content.Context r16, boolean r17, int[] r18) {
        /*
            r6 = r18
            int r5 = r6.length
            r9 = 0
            r4 = 0
        L5:
            if (r4 >= r5) goto L92
            r3 = r6[r4]
            android.widget.RemoteViews r2 = new android.widget.RemoteViews
            r7 = r16
            java.lang.String r1 = r7.getPackageName()
            r0 = 2131558826(0x7f0d01aa, float:1.8742979E38)
            r2.<init>(r1, r0)
            r0 = 2131379012(0x7f0a4344, float:1.8378273E38)
            r1 = 8
            r2.setViewVisibility(r0, r1)
            r0 = 2131379054(0x7f0a436e, float:1.8378358E38)
            r2.setViewVisibility(r0, r1)
            r0 = 2131378805(0x7f0a4275, float:1.8377853E38)
            r2.setViewVisibility(r0, r1)
            r0 = 2131379053(0x7f0a436d, float:1.8378356E38)
            r2.setViewVisibility(r0, r9)
            r8 = 2131396542(0x7f0a87be, float:1.8413828E38)
            r2.setViewVisibility(r8, r9)
            X.0y0b r1 = X.C1841030y0b.LIZ
            r0 = 2131826606(0x7f1117ae, float:1.9286101E38)
            java.lang.String r0 = X.C1383370m6R.LJIIJ(r0)
            r1.getClass()
            LIZLLL(r2, r8, r0)
            if (r17 == 0) goto L8d
            java.lang.Class<com.ss.android.ugc.aweme.IAppWidgetService> r8 = com.ss.android.ugc.aweme.IAppWidgetService.class
            r12 = 14
            r13 = 0
            r10 = r9
            r11 = r9
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.IAppWidgetService r1 = (com.ss.android.ugc.aweme.IAppWidgetService) r1
            if (r1 == 0) goto L8b
            java.lang.String r0 = "suggest_video_s"
            android.content.Intent r8 = r1.LJIIIZ(r7, r0)
            if (r8 == 0) goto L8b
            java.lang.String r1 = "extra_jump_type"
            r0 = 3
            r8.putExtra(r1, r0)
            java.lang.Class<com.ss.android.ugc.aweme.IAppWidgetService> r10 = com.ss.android.ugc.aweme.IAppWidgetService.class
            r14 = 14
            r15 = 0
            r11 = r9
            r12 = r9
            r13 = r9
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r10, r11, r12, r13, r14, r15)
            com.ss.android.ugc.aweme.IAppWidgetService r1 = (com.ss.android.ugc.aweme.IAppWidgetService) r1
            if (r1 == 0) goto L8b
            r0 = 7
            android.app.PendingIntent r1 = r1.LJ(r7, r0, r8)
        L7a:
            r0 = 2131388996(0x7f0a6a44, float:1.8398523E38)
            r2.setOnClickPendingIntent(r0, r1)
            android.appwidget.AppWidgetManager r0 = android.appwidget.AppWidgetManager.getInstance(r7)
            r0.updateAppWidget(r3, r2)
            int r4 = r4 + 1
            goto L5
        L8b:
            r1 = 0
            goto L7a
        L8d:
            android.app.PendingIntent r1 = LIZIZ(r7, r9)
            goto L7a
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1841030y0b.LJ(android.content.Context, boolean, int[]):void");
    }

    public static boolean LJFF(Context context, int[] iArr, Function1 function1, boolean z) {
        if (iArr != null && iArr.length != 0) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1841020y0a(context, iArr, function1, z, null), 3);
            return true;
        }
        function1.invoke(Boolean.FALSE);
        return false;
    }

    public static void LIZJ(long j, SuggestedVideoWidgetData suggestedVideoWidgetData, int[] iArr, Context context, Exception exc) {
        if (1 <= j && j < LIZJ && suggestedVideoWidgetData != null) {
            for (int i : iArr) {
                LIZ.getClass();
                LIZ(context, i, suggestedVideoWidgetData);
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("suggest_video_widget handleNoData, ex: ");
        sbLIZ.append(exc);
        C2188811AlT.LIZIZ(sbLIZ);
        for (int i2 : iArr) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.r9);
            remoteViews.setViewVisibility(R.id.mg2, 8);
            remoteViews.setViewVisibility(R.id.mh7, 8);
            remoteViews.setViewVisibility(R.id.mh6, 8);
            remoteViews.setViewVisibility(R.id.mag, 0);
            LIZ.getClass();
            PendingIntent pendingIntentLIZIZ = LIZIZ(context, false);
            if (pendingIntentLIZIZ != null) {
                remoteViews.setOnClickPendingIntent(R.id.tqy, pendingIntentLIZIZ);
            }
            AppWidgetManager.getInstance(context).updateAppWidget(i2, remoteViews);
        }
    }
}
