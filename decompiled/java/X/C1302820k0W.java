package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.List;

/* JADX INFO: renamed from: X.0k0W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302820k0W {
    public static final List<AudioDeviceInfo> LIZ(AudioManager audioManager) {
        return C13LQ.LJJLL(audioManager.getDevices(2));
    }
}
