package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0A0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C255670A0f {
    public static final int LIZ;

    static {
        SettingsManager.LIZLLL().getClass();
        LIZ = SettingsManager.LJ("photo_mode_max_bitmap_size", SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
    }

    public static final int LIZ() {
        try {
            return LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        }
    }
}
