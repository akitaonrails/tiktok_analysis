package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.notification.NotificationController$mMainThreadHandler$2$1;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AS5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AS5 {
    public final Context LIZ;
    public final C1ARI LIZIZ;
    public final C1ARM LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 336));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(70));
    public final NotificationManager LJFF;
    public final C1AS9 LJI;
    public C2179491ARn LJII;
    public final C1ASC LJIIIIZZ;
    public final C1AS4 LJIIIZ;
    public BinderC805700Vj6 LJIIJ;

    public final void LIZ() {
        if (this.LJIIJ != null) {
            return;
        }
        try {
            C2204961BRm.LJJJJ(this.LIZ, new Intent(this.LIZ, (Class<?>) MediaSessionService.class), this.LJIIIZ, 1, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxEO0QF/PYTXBXau1Qj5rNvEyskdTIrBjnMkQwN8c+E/wg0/CvBXjaOWbh/WKyz7K2FYQY09nbdlHU7mh3VNEBum5pywDOLWHPlL0k25vlyA==", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2178901APg.LIZ("NotificationController", th.getMessage());
        }
    }

    public final NotificationController$mMainThreadHandler$2$1 LIZIZ() {
        return (NotificationController$mMainThreadHandler$2$1) this.LIZLLL.getValue();
    }

    public final C2179541ARs LIZJ() {
        return (C2179541ARs) this.LJ.getValue();
    }

    public final void LIZLLL() {
        try {
            BinderC805700Vj6 binderC805700Vj6 = this.LJIIJ;
            if (binderC805700Vj6 != null) {
                try {
                    binderC805700Vj6.LL.stopForeground(true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.LJFF.cancel(2131858564);
            LIZJ().LIZIZ = false;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hideImmediate: ");
            sbLIZ.append(Log.getStackTraceString(th2));
            C2178901APg.LIZ("NotificationController", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJ() {
        LIZLLL();
        try {
            BinderC805700Vj6 binderC805700Vj6 = this.LJIIJ;
            if (binderC805700Vj6 != null) {
                binderC805700Vj6.unlinkToDeath(this.LJIIIIZZ, 0);
            }
            this.LIZ.unbindService(this.LJIIIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2178901APg.LIZ("NotificationController", th.getMessage());
        }
        this.LJII = null;
    }

    public final void LJFF(C2179491ARn c2179491ARn) {
        if (Intrinsics.LJFF(c2179491ARn.LIZ, Boolean.TRUE) || LIZJ().LIZIZ) {
            LIZIZ().removeMessages(1);
            LIZIZ().removeMessages(2);
            LIZIZ().sendMessageDelayed(Message.obtain(LIZIZ(), 1, c2179491ARn), 150L);
        }
    }

    public final void LJI(C2179491ARn c2179491ARn) {
        int i;
        int i2;
        int i3;
        C1AS9 c1as9 = this.LJI;
        c1as9.getClass();
        try {
            Context context = c1as9.LIZ;
            if (c1as9.LIZJ != -1) {
                C813610Vvr c813610Vvr = new C813610Vvr(context, "X_AUDIO_DEFAULT_PLAY_SERVICE");
                c813610Vvr.LIZLLL(false);
                c813610Vvr.LJJIIZI.icon = c1as9.LIZJ;
                c813610Vvr.LJIIIZ(null);
                c813610Vvr.LJIIJJI = false;
                ((C1ASL) c1as9.LJIIIZ.getValue()).LIZ();
                c813610Vvr.LJJ = 1;
                c813610Vvr.LJI = (PendingIntent) c1as9.LJFF.getValue();
                String str = c2179491ARn.LIZLLL;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                c813610Vvr.LJFF(str);
                String str3 = c2179491ARn.LJ;
                if (str3 == null) {
                    str3 = "";
                }
                c813610Vvr.LJ(str3);
                String str4 = c2179491ARn.LJFF;
                if (str4 != null) {
                    str2 = str4;
                }
                c813610Vvr.LJIILIIL = C813610Vvr.LIZJ(str2);
                c813610Vvr.LJII(2, Intrinsics.LJFF(c2179491ARn.LIZ, Boolean.TRUE));
                c813610Vvr.LJJIIZI.deleteIntent = (PendingIntent) c1as9.LIZLLL.getValue();
                c813610Vvr.LJIIZILJ = "x_audio_default_player_service";
                Bitmap bitmap = c2179491ARn.LJI;
                if (bitmap != null && bitmap.isRecycled()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("coverBitmap(");
                    sbLIZ.append(c2179491ARn.LJI);
                    sbLIZ.append(") already recycled.");
                    C2178901APg.LIZJ("NotificationFactory", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    c813610Vvr.LJIIIIZZ(c2179491ARn.LJI);
                }
                Boolean bool = c2179491ARn.LIZIZ;
                if (bool != null && bool.booleanValue()) {
                    i = R.drawable.fjc;
                } else {
                    i = R.drawable.fjd;
                }
                c813610Vvr.LIZ(i, "SkipToPrevious", (PendingIntent) c1as9.LJI.getValue());
                Boolean bool2 = c2179491ARn.LIZ;
                if (bool2 != null && bool2.booleanValue()) {
                    i2 = R.drawable.fjb;
                } else {
                    i2 = R.drawable.fj9;
                }
                c813610Vvr.LIZ(i2, "PlayOrPause", (PendingIntent) c1as9.LJII.getValue());
                Boolean bool3 = c2179491ARn.LIZJ;
                if (bool3 != null && bool3.booleanValue()) {
                    i3 = R.drawable.fj_;
                } else {
                    i3 = R.drawable.fja;
                }
                c813610Vvr.LIZ(i3, "SkipToNext", (PendingIntent) c1as9.LJIIIIZZ.getValue());
                C814770Vxj c814770Vxj = new C814770Vxj();
                c814770Vxj.LJ = new int[]{0, 1, 2};
                c814770Vxj.LJFF = c1as9.LIZIZ;
                c813610Vvr.LJIIJ(c814770Vxj);
                Notification notificationLIZIZ = c813610Vvr.LIZIZ();
                if (notificationLIZIZ != null) {
                    try {
                        C2179491ARn c2179491ARn2 = this.LJII;
                        if (c2179491ARn2 != null && Intrinsics.LJFF(c2179491ARn2.LIZ, Boolean.TRUE)) {
                            BinderC805700Vj6 binderC805700Vj6 = this.LJIIJ;
                            if (binderC805700Vj6 != null) {
                                binderC805700Vj6.LIZ(notificationLIZIZ);
                            }
                        } else {
                            this.LJFF.notify(2131858564, notificationLIZIZ);
                        }
                        LIZJ().LIZIZ = true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("showImmediate: ");
                        sbLIZ2.append(Log.getStackTraceString(th));
                        C2178901APg.LIZ("NotificationController", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2178901APg.LIZ("NotificationFactory", e.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.1ASC] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1AS4] */
    public C1AS5(Context context, MediaSessionCompat.Token token, C1ARI c1ari, ComponentName componentName, C1ARM c1arm, int i) {
        this.LIZ = context;
        this.LIZIZ = c1ari;
        this.LIZJ = c1arm;
        Object objH2 = C786410Ut5.H2(context, "notification");
        if (objH2 != null) {
            NotificationManager notificationManager = (NotificationManager) objH2;
            this.LJFF = notificationManager;
            this.LJIIIIZZ = new IBinder.DeathRecipient() { // from class: X.1ASC
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    C1AS5 c1as5 = this.LL;
                    BinderC805700Vj6 binderC805700Vj6 = c1as5.LJIIJ;
                    if (binderC805700Vj6 != null) {
                        binderC805700Vj6.unlinkToDeath(c1as5.LJIIIIZZ, 0);
                    }
                    c1as5.LJIIJ = null;
                    c1as5.LIZ();
                }
            };
            this.LJIIIZ = new ServiceConnection() { // from class: X.1AS4
                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName2) {
                    C1AS5 c1as5 = this.LL;
                    BinderC805700Vj6 binderC805700Vj6 = c1as5.LJIIJ;
                    if (binderC805700Vj6 != null) {
                        binderC805700Vj6.unlinkToDeath(c1as5.LJIIIIZZ, 0);
                    }
                    c1as5.LJIIJ = null;
                    c1as5.LIZ();
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName2, IBinder iBinder) throws Throwable {
                    C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/bytedance/ies/xelement/defaultimpl/player/impl/plugin/mediasession/notification/NotificationController$mConnection$1", "onServiceConnected", this, new Object[]{componentName2, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxEO0QF/PYTXBXau1Qj5rNvEyskdTIrBjnMkQwN8c+E/wg0/CvBXjaOWbh/WKyz7K2FYQY09nbdlHU7mh3VNEBum5pywDOLWHPlL0k25vlyA==", null)));
                    if (c0wsuLIZIZ.LIZ) {
                        return;
                    }
                    Object[] objArr = c0wsuLIZIZ.LIZJ;
                    if (objArr != null) {
                        Object obj = objArr[0];
                        Object obj2 = objArr[1];
                        if (obj2 != null) {
                            iBinder = (IBinder) obj2;
                        }
                    }
                    if (iBinder instanceof BinderC805700Vj6) {
                        C1AS5 c1as5 = this.LL;
                        BinderC805700Vj6 binderC805700Vj6 = (BinderC805700Vj6) iBinder;
                        c1as5.LJIIJ = binderC805700Vj6;
                        if (binderC805700Vj6 != null) {
                            binderC805700Vj6.linkToDeath(c1as5.LJIIIIZZ, 0);
                        }
                        C1AS5 c1as52 = this.LL;
                        C2179491ARn c2179491ARn = c1as52.LJII;
                        if (c2179491ARn != null) {
                            c1as52.LJFF(c2179491ARn);
                        }
                    }
                }
            };
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("X_AUDIO_DEFAULT_PLAY_SERVICE", "X_AUDIO_DEFAULT_PLAY_SERVICE_CHANNEL", 2);
                notificationChannel.setSound(null, null);
                notificationChannel.enableVibration(false);
                notificationChannel.setVibrationPattern(null);
                notificationChannel.setDescription("X_AUDIO_DEFAULT_PLAY_SERVICE");
                notificationChannel.setLockscreenVisibility(1);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            this.LJI = new C1AS9(context, token, componentName, i);
            LIZ();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }
}
