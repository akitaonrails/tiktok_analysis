package X;

import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;

/* JADX INFO: renamed from: X.0VrG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C810760VrG {
    public static boolean LIZ(NotificationChannel notificationChannel) {
        return notificationChannel.canBypassDnd();
    }

    public static boolean LIZIZ(NotificationChannel notificationChannel) {
        return notificationChannel.canShowBadge();
    }

    public static AudioAttributes LJFF(NotificationChannel notificationChannel) {
        return notificationChannel.getAudioAttributes();
    }

    public static String LJI(NotificationChannel notificationChannel) {
        return notificationChannel.getDescription();
    }

    public static String LJII(NotificationChannel notificationChannel) {
        return notificationChannel.getGroup();
    }

    public static String LJIIIIZZ(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    public static int LJIIIZ(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance();
    }

    public static int LJIIJ(NotificationChannel notificationChannel) {
        return notificationChannel.getLightColor();
    }

    public static int LJIIJJI(NotificationChannel notificationChannel) {
        return notificationChannel.getLockscreenVisibility();
    }

    public static CharSequence LJIIL(NotificationChannel notificationChannel) {
        return notificationChannel.getName();
    }

    public static Uri LJIILIIL(NotificationChannel notificationChannel) {
        return notificationChannel.getSound();
    }

    public static long[] LJIILJJIL(NotificationChannel notificationChannel) {
        return notificationChannel.getVibrationPattern();
    }

    public static boolean LJIJJLI(NotificationChannel notificationChannel) {
        return notificationChannel.shouldShowLights();
    }

    public static boolean LJIL(NotificationChannel notificationChannel) {
        return notificationChannel.shouldVibrate();
    }

    public static void LIZLLL(NotificationChannel notificationChannel, boolean z) {
        notificationChannel.enableLights(z);
    }

    public static void LJ(NotificationChannel notificationChannel, boolean z) {
        notificationChannel.enableVibration(z);
    }

    public static void LJIILL(NotificationChannel notificationChannel, String str) {
        notificationChannel.setDescription(str);
    }

    public static void LJIILLIIL(NotificationChannel notificationChannel, String str) {
        notificationChannel.setGroup(str);
    }

    public static void LJIIZILJ(NotificationChannel notificationChannel, int i) {
        notificationChannel.setLightColor(i);
    }

    public static void LJIJ(NotificationChannel notificationChannel, boolean z) {
        notificationChannel.setShowBadge(z);
    }

    public static void LJIJJ(NotificationChannel notificationChannel, long[] jArr) {
        notificationChannel.setVibrationPattern(jArr);
    }

    public static NotificationChannel LIZJ(String str, CharSequence charSequence, int i) {
        return new NotificationChannel(str, charSequence, i);
    }

    public static void LJIJI(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }
}
