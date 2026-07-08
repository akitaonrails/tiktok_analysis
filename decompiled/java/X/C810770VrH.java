package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: renamed from: X.0VrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810770VrH {
    public final String LIZ;
    public CharSequence LIZIZ;
    public final int LIZJ;
    public String LIZLLL;
    public final String LJ;
    public boolean LJFF;
    public Uri LJI;
    public AudioAttributes LJII;
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;
    public boolean LJIIJ;
    public long[] LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;

    public C810770VrH(NotificationChannel notificationChannel) {
        this(C810760VrG.LJIIIIZZ(notificationChannel), C810760VrG.LJIIIZ(notificationChannel));
        this.LIZIZ = C810760VrG.LJIIL(notificationChannel);
        this.LIZLLL = C810760VrG.LJI(notificationChannel);
        this.LJ = C810760VrG.LJII(notificationChannel);
        this.LJFF = C810760VrG.LIZIZ(notificationChannel);
        this.LJI = C810760VrG.LJIILIIL(notificationChannel);
        this.LJII = C810760VrG.LJFF(notificationChannel);
        this.LJIIIIZZ = C810760VrG.LJIJJLI(notificationChannel);
        this.LJIIIZ = C810760VrG.LJIIJ(notificationChannel);
        this.LJIIJ = C810760VrG.LJIL(notificationChannel);
        this.LJIIJJI = C810760VrG.LJIILJJIL(notificationChannel);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LJIIL = C810780VrI.LIZIZ(notificationChannel);
            this.LJIILIIL = C810780VrI.LIZ(notificationChannel);
        }
        C810760VrG.LIZ(notificationChannel);
        C810760VrG.LJIIJJI(notificationChannel);
        if (i >= 29) {
            C810790VrJ.LIZ(notificationChannel);
            if (i >= 30) {
                C810780VrI.LIZJ(notificationChannel);
            }
        }
    }

    public C810770VrH(String str, int i) {
        this.LJFF = true;
        this.LJI = Settings.System.DEFAULT_NOTIFICATION_URI;
        str.getClass();
        this.LIZ = str;
        this.LIZJ = i;
        this.LJII = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }
}
