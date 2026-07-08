package X;

import android.media.AudioAttributes;
import android.media.SoundPool;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.110d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194305110d {
    public static SoundPool LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;

    public static void LIZ() {
        try {
            if (LIZ == null) {
                SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).setLegacyStreamType(3).build()).build();
                LIZ = soundPoolBuild;
                LIZIZ = soundPoolBuild != null ? C1143680frq.LIZJ(soundPoolBuild, "tiktok_live_broadcast_demand_7", "ttlive_finish_encourage_upgrade.mp3") : 0;
                SoundPool soundPool = LIZ;
                LIZJ = soundPool != null ? C1143680frq.LIZJ(soundPool, "tiktok_live_broadcast_demand_7", "ttlive_finish_encourage_task.wav") : 0;
                SoundPool soundPool2 = LIZ;
                LIZLLL = soundPool2 != null ? C1143680frq.LIZJ(soundPool2, "tiktok_live_broadcast_demand_7", "ttlive_finish_encourage_lop.mp3") : 0;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ() {
        if (LIZJ == 0) {
            LIZLLL();
        }
        try {
            SoundPool soundPool = LIZ;
            if (soundPool != null) {
                soundPool.play(LIZJ, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ() {
        if (LIZIZ == 0) {
            LIZLLL();
        }
        try {
            SoundPool soundPool = LIZ;
            if (soundPool != null) {
                soundPool.play(LIZIZ, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL() {
        SoundPool soundPool = LIZ;
        LIZIZ = soundPool != null ? C1143680frq.LIZJ(soundPool, "tiktok_live_broadcast_demand_7", "ttlive_finish_encourage_upgrade.mp3") : 0;
        SoundPool soundPool2 = LIZ;
        LIZJ = soundPool2 != null ? C1143680frq.LIZJ(soundPool2, "tiktok_live_broadcast_demand_7", "ttlive_finish_encourage_task.wav") : 0;
        SoundPool soundPool3 = LIZ;
        LIZLLL = soundPool3 != null ? C1143680frq.LIZJ(soundPool3, "tiktok_live_broadcast_demand_7", "ttlive_finish_encourage_lop.mp3") : 0;
    }

    public static void LJ() {
        try {
            SoundPool soundPool = LIZ;
            if (soundPool != null) {
                soundPool.release();
            }
            LIZ = null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
