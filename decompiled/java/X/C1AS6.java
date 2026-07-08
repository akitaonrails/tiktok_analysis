package X;

import android.R;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.mediabox.bgplay.model.BgPlayAbilityConfig;
import com.ss.android.ugc.mediabox.bgplay.model.BgPlayDataModel;
import com.ss.android.ugc.mediabox.bgplay.notification.BgPlayService;
import com.ss.android.ugc.mediabox.bgplay.notification.NotificationParams;

/* JADX INFO: renamed from: X.1AS6, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AS6 {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final BgPlayService LIZ;
    public final MediaSessionCompat.Token LIZIZ;
    public final NotificationManager LIZJ;
    public final boolean LIZLLL;
    public final NotificationParams LJ;
    public final BPEAHandler LJFF;
    public InterfaceC1528040prm LJI;
    public final C1487450ooJ LJII;

    public final Notification LIZ() {
        PendingIntent pendingIntentLIZ;
        if (this.LIZLLL) {
            return null;
        }
        NotificationParams notificationParams = this.LJ;
        BgPlayService bgPlayService = this.LIZ;
        MediaSessionCompat.Token token = this.LIZIZ;
        try {
            ComponentName componentName = new ComponentName(bgPlayService, bgPlayService.getClass());
            C813610Vvr c813610Vvr = new C813610Vvr(bgPlayService, "background_audio_play_service");
            c813610Vvr.LIZLLL(false);
            c813610Vvr.LJJIIZI.icon = notificationParams.notificationSmallIconRes;
            c813610Vvr.LJIIIZ(null);
            c813610Vvr.LJIIJJI = false;
            c813610Vvr.LJJ = 1;
            InterfaceC2179601ARy interfaceC2179601ARy = C1487370ooB.LIZLLL;
            Activity activityLIZIZ = interfaceC2179601ARy != null ? interfaceC2179601ARy.LIZIZ() : null;
            int i = Build.VERSION.SDK_INT;
            if (i < 31 || activityLIZIZ == null) {
                pendingIntentLIZ = C1AS0.LIZ(4, componentName, bgPlayService);
            } else {
                Intent intent = new Intent(bgPlayService, activityLIZIZ.getClass());
                intent.setFlags(536870912);
                pendingIntentLIZ = PendingIntent.getActivity(bgPlayService, 4, intent, 201326592);
            }
            c813610Vvr.LJI = pendingIntentLIZ;
            c813610Vvr.LJFF(notificationParams.description);
            c813610Vvr.LJ(notificationParams.authorName);
            c813610Vvr.LJJIIZI.deleteIntent = C1AS0.LIZ(5, componentName, bgPlayService);
            c813610Vvr.LJIIZILJ = "background_audio_play_service";
            Bitmap bitmap = notificationParams.coverBitmap;
            if (((bitmap == null || bitmap.isRecycled()) ? false : true) && (i < 33 || notificationParams.isPlaying)) {
                c813610Vvr.LJIIIIZZ(notificationParams.coverBitmap);
            }
            c813610Vvr.LJII(2, notificationParams.isPlaying);
            boolean z = notificationParams.canPlayPrevious;
            if (z || notificationParams.canPlayNext) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PreviousVideo");
                sbLIZ.append(z ? "" : "，unavailable");
                c813610Vvr.LIZ(R.drawable.ic_media_previous, C2188811AlT.LIZIZ(sbLIZ), C1AS0.LIZ(7, componentName, bgPlayService));
                c813610Vvr.LIZ(notificationParams.isPlaying ? R.drawable.ic_media_pause : R.drawable.ic_media_play, "PlayOrPause", C1AS0.LIZ(2, componentName, bgPlayService));
                boolean z2 = notificationParams.canPlayNext;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("NextVideo");
                sbLIZ2.append(z2 ? "" : " unavailable");
                c813610Vvr.LIZ(R.drawable.ic_media_next, C2188811AlT.LIZIZ(sbLIZ2), C1AS0.LIZ(6, componentName, bgPlayService));
            } else {
                InterfaceC2179601ARy interfaceC2179601ARy2 = C1487370ooB.LIZLLL;
                if (interfaceC2179601ARy2 != null) {
                    interfaceC2179601ARy2.LIZJ();
                }
                c813610Vvr.LIZ(R.drawable.ic_media_rew, "moveBackward", C1AS0.LIZ(1, componentName, bgPlayService));
                c813610Vvr.LIZ(notificationParams.isPlaying ? R.drawable.ic_media_pause : R.drawable.ic_media_play, "PlayOrPause", C1AS0.LIZ(2, componentName, bgPlayService));
                InterfaceC2179601ARy interfaceC2179601ARy3 = C1487370ooB.LIZLLL;
                if (interfaceC2179601ARy3 != null) {
                    interfaceC2179601ARy3.LIZ();
                }
                c813610Vvr.LIZ(R.drawable.ic_media_ff, "moveForward", C1AS0.LIZ(3, componentName, bgPlayService));
            }
            C814770Vxj c814770Vxj = new C814770Vxj(c813610Vvr);
            c814770Vxj.LJ = new int[]{0, 1, 2};
            c814770Vxj.LJFF = token;
            c813610Vvr.LJIIJ(c814770Vxj);
            return c813610Vvr.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final void LIZIZ() {
        NotificationManager notificationManager;
        if (!this.LIZ.LLILZ || this.LIZLLL) {
            return;
        }
        Notification notificationLIZ = LIZ();
        try {
            if (Build.VERSION.SDK_INT < 26 || !((notificationManager = this.LIZJ) == null || notificationManager.getNotificationChannel("background_audio_play_service") == null)) {
                this.LIZJ.notify(com.zhiliaoapp.musically.R.id.o5i, notificationLIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZJ(BgPlayDataModel bgPlayDataModel) {
        boolean z;
        boolean z2;
        boolean z3;
        NotificationParams notificationParams = this.LJ;
        notificationParams.aid = bgPlayDataModel.aid;
        notificationParams.coverBitmap = null;
        notificationParams.description = bgPlayDataModel.desc;
        notificationParams.authorName = bgPlayDataModel.userName;
        notificationParams.isPlaying = C1487370ooB.LJI.isPlaying();
        notificationParams.notificationSmallIconRes = bgPlayDataModel.notificationSmallIconRes;
        BgPlayAbilityConfig bgPlayAbilityConfig = bgPlayDataModel.bgPlayAbilityConfig;
        boolean z4 = false;
        if (bgPlayAbilityConfig != null) {
            z = bgPlayAbilityConfig.canPlayNext;
        } else {
            z = false;
        }
        notificationParams.canPlayNext = z;
        if (bgPlayAbilityConfig != null) {
            z2 = bgPlayAbilityConfig.canPlayPrevious;
        } else {
            z2 = false;
        }
        notificationParams.canPlayPrevious = z2;
        if (bgPlayAbilityConfig != null) {
            z3 = bgPlayAbilityConfig.canPlayFastBackWard;
        } else {
            z3 = false;
        }
        notificationParams.canPlayFastBackWard = z3;
        if (bgPlayAbilityConfig != null) {
            z4 = bgPlayAbilityConfig.canPlayFastForward;
        }
        notificationParams.canPlayFastForward = z4;
    }

    public final void LIZLLL(boolean z) {
        if (!this.LIZ.LLILZ) {
            return;
        }
        this.LJ.isPlaying = z;
        LIZIZ();
    }

    public C1AS6(BgPlayService bgPlayService, MediaSessionCompat.Token token) {
        this.LIZ = bgPlayService;
        this.LIZIZ = token;
        int i = Build.VERSION.SDK_INT;
        NotificationManager notificationManager = (NotificationManager) bgPlayService.getSystemService("notification");
        this.LIZJ = notificationManager;
        NotificationParams.Companion.getClass();
        this.LJ = new NotificationParams("", null, "", "", false, false, false, false, false, 0, 0);
        this.LJFF = new BPEAHandler(Looper.getMainLooper());
        this.LJII = C1487370ooB.LJFF;
        if (i >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("background_audio_play_service", "background_audio_play_service", 2);
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(null);
            notificationChannel.setDescription("background_audio_play_service");
            notificationChannel.setLockscreenVisibility(1);
            try {
                notificationManager.createNotificationChannel(notificationChannel);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZLLL = true;
            }
        }
    }
}
