package X;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.android.livesdk.livesetting.gift.LiveComboVibrationAmplitude;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGiftingSoundFeedbackSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.110h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194309110h {
    public static final SoundPool LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static int LJ;

    static {
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).setLegacyStreamType(3).build()).build();
        LIZ = soundPoolBuild;
        LIZIZ = C1143680frq.LIZJ(soundPoolBuild, "tiktok_live_gift_send_sound", "tiktok_live_gift_send_sound.mp3");
        LIZJ = C1143680frq.LIZJ(soundPoolBuild, "tiktok_live_gift_send_sound", "tiktok_live_gift_combo_sound.mp3");
        LIZLLL = C1143680frq.LIZJ(soundPoolBuild, "tiktok_live_gift_send_sound", "tiktok_live_gift_send_sound.mp3");
        LJ = C1143680frq.LIZJ(soundPoolBuild, "tiktok_live_gift_send_sound", "tiktok_live_gift_combo_sound.mp3");
        C1143680frq.LIZJ(soundPoolBuild, "tiktok_live_gift_send_sound", "tiktok_live_gift_recharge_sound.mp3");
    }

    public static void LIZ() {
        SoundPool soundPool = LIZ;
        LIZIZ = C1143680frq.LIZJ(soundPool, "tiktok_live_gift_send_sound", "tiktok_live_gift_send_sound.mp3");
        LIZJ = C1143680frq.LIZJ(soundPool, "tiktok_live_gift_send_sound", "tiktok_live_gift_combo_sound.mp3");
        LIZLLL = C1143680frq.LIZJ(soundPool, "tiktok_live_gift_send_sound", "tiktok_live_gift_send_sound.mp3");
        LJ = C1143680frq.LIZJ(soundPool, "tiktok_live_gift_send_sound", "tiktok_live_gift_combo_sound.mp3");
        C1143680frq.LIZJ(soundPool, "tiktok_live_gift_send_sound", "tiktok_live_gift_recharge_sound.mp3");
    }

    public static void LIZIZ(int i) {
        try {
            Vibrator vibrator = (Vibrator) C786410Ut5.G2(C1202420hOa.LIZ(), "vibrator");
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(30L, LiveComboVibrationAmplitude.INSTANCE.getValue()));
            } else {
                vibrator.vibrate(50L);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("SoundPoolManager", "soundAndVibrate exception");
        }
        System.currentTimeMillis();
        if (i == 1) {
            if (LIZIZ != 0 && LIZLLL != 0) {
                int value = LiveGiftGiftingSoundFeedbackSetting.INSTANCE.getValue();
                if (value != 1) {
                    if (value == 2) {
                        LIZ.play(LIZLLL, 1.0f, 1.0f, 1, 0, 1.0f);
                        return;
                    }
                    return;
                }
                LIZ.play(LIZIZ, 1.0f, 1.0f, 1, 0, 1.0f);
                return;
            }
            LIZ();
            return;
        }
        if (LIZIZ != 0 && LIZLLL != 0) {
            int value2 = LiveGiftGiftingSoundFeedbackSetting.INSTANCE.getValue();
            if (value2 != 1) {
                if (value2 != 2) {
                    return;
                }
                LIZ.play(LJ, 1.0f, 1.0f, 1, 0, 1.0f);
                return;
            }
            LIZ.play(LIZJ, 1.0f, 1.0f, 1, 0, 1.0f);
            return;
        }
        LIZ();
    }
}
