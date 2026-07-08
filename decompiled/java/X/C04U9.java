package X;

import com.ss.android.ugc.aweme.audiomode.legoimpl.AudioSDKABLegoLauncherTaskImpl;
import com.ss.android.ugc.aweme.launcher.service.audiosdk.IAudioSDKABLegoLaunchTaskApi;

/* JADX INFO: renamed from: X.04U9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04U9 implements IAudioSDKABLegoLaunchTaskApi {
    public static final C04U9 LIZIZ = new C04U9();
    public final /* synthetic */ IAudioSDKABLegoLaunchTaskApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.audiosdk.IAudioSDKABLegoLaunchTaskApi
    public final C0CCZ LIZ() {
        return this.LIZ.LIZ();
    }

    public C04U9() {
        IAudioSDKABLegoLaunchTaskApi iAudioSDKABLegoLaunchTaskApi;
        Object objLIZ = C04TD.LIZ(IAudioSDKABLegoLaunchTaskApi.class, false);
        if (objLIZ != null) {
            iAudioSDKABLegoLaunchTaskApi = (IAudioSDKABLegoLaunchTaskApi) objLIZ;
        } else {
            if (C04TD.LLIIIL == null) {
                synchronized (IAudioSDKABLegoLaunchTaskApi.class) {
                    if (C04TD.LLIIIL == null) {
                        C04TD.LLIIIL = new AudioSDKABLegoLauncherTaskImpl();
                    }
                }
            }
            iAudioSDKABLegoLaunchTaskApi = C04TD.LLIIIL;
        }
        this.LIZ = iAudioSDKABLegoLaunchTaskApi;
    }
}
