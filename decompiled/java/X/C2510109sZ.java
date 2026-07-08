package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09sZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2510109sZ {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ() {
        long jLJFF = 60;
        try {
            SettingsManager.LIZLLL().getClass();
            jLJFF = SettingsManager.LJFF("im_voice_message_recording_max_length_seconds", 60L);
            return jLJFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jLJFF;
        }
    }

    public static int LIZIZ() {
        int iLJ = 44100;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("im_voice_message_recording_sample_rate", 44100);
            return iLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return iLJ;
        }
    }
}
