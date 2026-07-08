package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.08Zk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2138608Zk {
    public static final C2138608Zk LIZ = new C2138608Zk();
    public static AudioDeviceInfo[] LIZIZ;
    public static final AudioManager LIZJ;

    static {
        AudioManager audioManager = (AudioManager) C786410Ut5.H2(((IAppContextManagerService) ServiceManager.get().getService(IAppContextManagerService.class)).getApplicationContext(), "audio");
        LIZJ = audioManager;
        LIZ();
        audioManager.registerAudioDeviceCallback(new AudioDeviceCallback() { // from class: X.08Zl
            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                C2138608Zk.LIZ.getClass();
                C2138608Zk.LIZ();
            }

            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                C2138608Zk.LIZ.getClass();
                C2138608Zk.LIZ();
            }
        }, null);
    }

    public static void LIZ() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2138508Zj(null), 3);
    }
}
