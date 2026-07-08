package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.background.AudioMediaSessionService;
import com.ss.android.ugc.aweme.feed.background.NotificationController$mainThreadHandler$2$1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AS1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AS1 {
    public final Context LIZ;
    public final C1ARK LIZIZ;
    public final InterfaceC2179551ARt LIZJ;
    public final C1ARI LIZLLL;
    public final C1ARM LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4107));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(298));
    public final NotificationManager LJII;
    public final C1AS7 LJIIIIZZ;
    public C2179451ARj LJIIIZ;
    public final C1AS3 LJIIJ;
    public final C1AS2 LJIIJJI;
    public BinderC808440VnW LJIIL;
    public final C01GW LJIILIIL;

    public final void LIZ() {
        if (this.LJIIL != null) {
            return;
        }
        try {
            C2204961BRm.LJJJJ(this.LIZ, new Intent(this.LIZ, (Class<?>) AudioMediaSessionService.class), this.LJIIJJI, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3jN/K6A6F2JESnNHYeVa+Ifre5IdAaRT9giOLrt56lMT", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2178901APg.LIZ("NotificationController", th.getMessage());
        }
    }

    public final NotificationController$mainThreadHandler$2$1 LIZIZ() {
        return (NotificationController$mainThreadHandler$2$1) this.LJFF.getValue();
    }

    public final C2179401ARe LIZJ() {
        return (C2179401ARe) this.LJI.getValue();
    }

    public final void LIZLLL() {
        try {
            BinderC808440VnW binderC808440VnW = this.LJIIL;
            if (binderC808440VnW != null) {
                try {
                    binderC808440VnW.LL.stopForeground(true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.LJII.cancel(((Number) this.LJIILIIL.getValue()).intValue());
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
            BinderC808440VnW binderC808440VnW = this.LJIIL;
            if (binderC808440VnW != null) {
                binderC808440VnW.unlinkToDeath(this.LJIIJ, 0);
            }
            this.LIZ.unbindService(this.LJIIJJI);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2178901APg.LIZ("NotificationController", th.getMessage());
        }
    }

    public final void LJFF(C2179451ARj c2179451ARj) {
        if (Intrinsics.LJFF(c2179451ARj.LIZ, Boolean.TRUE) || LIZJ().LIZIZ) {
            LIZIZ().removeMessages(1);
            LIZIZ().removeMessages(2);
            LIZIZ().sendMessageDelayed(Message.obtain(LIZIZ(), 1, c2179451ARj), 150L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.1AS3] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1AS2] */
    public C1AS1(Context context, MediaSessionCompat.Token token, C0NIP c0nip, C591760NIw c591760NIw, C2179441ARi c2179441ARi, ComponentName componentName, C1ARX c1arx, int i) {
        this.LIZ = context;
        this.LIZIZ = c0nip;
        this.LIZJ = c591760NIw;
        this.LIZLLL = c2179441ARi;
        this.LJ = c1arx;
        NotificationManager notificationManager = (NotificationManager) C786410Ut5.H2(context, "notification");
        this.LJII = notificationManager;
        this.LJIIIZ = new C2179451ARj();
        this.LJIIJ = new IBinder.DeathRecipient() { // from class: X.1AS3
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                C1AS1 c1as1 = this.LL;
                BinderC808440VnW binderC808440VnW = c1as1.LJIIL;
                if (binderC808440VnW != null) {
                    binderC808440VnW.unlinkToDeath(c1as1.LJIIJ, 0);
                }
                c1as1.LJIIL = null;
                c1as1.LIZ();
            }
        };
        this.LJIIJJI = new ServiceConnection() { // from class: X.1AS2
            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName2) {
                C1AS1 c1as1 = this.LL;
                BinderC808440VnW binderC808440VnW = c1as1.LJIIL;
                if (binderC808440VnW != null) {
                    binderC808440VnW.unlinkToDeath(c1as1.LJIIJ, 0);
                }
                c1as1.LJIIL = null;
                c1as1.LIZ();
            }

            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName2, IBinder iBinder) throws Throwable {
                C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/ss/android/ugc/aweme/feed/background/NotificationController$connection$1", "onServiceConnected", this, new Object[]{componentName2, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3jN/K6A6F2JESnNHYeVa+Ifre5IdAaRT9giOLrt56lMT", null)));
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
                if (iBinder instanceof BinderC808440VnW) {
                    C1AS1 c1as1 = this.LL;
                    BinderC808440VnW binderC808440VnW = (BinderC808440VnW) iBinder;
                    c1as1.LJIIL = binderC808440VnW;
                    if (binderC808440VnW != null) {
                        binderC808440VnW.linkToDeath(c1as1.LJIIJ, 0);
                    }
                    C1AS1 c1as12 = this.LL;
                    c1as12.LJFF(c1as12.LJIIIZ);
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
        this.LJIIIIZZ = new C1AS7(context, token, componentName, i);
        LIZ();
        this.LJIILIIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1439));
    }
}
