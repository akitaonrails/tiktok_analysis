package X;

import android.media.MediaPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15I0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15I0 {
    public static volatile MediaPlayer LIZ;

    public static MediaPlayer LIZ() {
        if (LIZ == null) {
            synchronized (C15I0.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new MediaPlayer();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
