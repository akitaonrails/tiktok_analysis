package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;

/* JADX INFO: renamed from: X.0U30, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U30 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context, InterfaceC769940UIe interfaceC769940UIe) {
        AudioManager audioManager;
        if (Build.VERSION.SDK_INT >= 29 && interfaceC769940UIe != null) {
            AudioDeviceModule audioDeviceModuleE3 = interfaceC769940UIe.E3();
            if (audioDeviceModuleE3 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("adm, isMicOccupiedSilenced: ");
                sbLIZ.append(audioDeviceModuleE3.isMicOccupiedSilenced());
                C20441214yg.LJIIIZ("MicrophoneStateDetectionUtil", C2188811AlT.LIZIZ(sbLIZ));
                return audioDeviceModuleE3.isMicOccupiedSilenced();
            }
            C20441214yg.LJIIIZ("MicrophoneStateDetectionUtil", "adm is null");
            return false;
        }
        if (context == null) {
            return false;
        }
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService.w9() | iInteractService.o1()) {
            return false;
        }
        Object objH2 = C786410Ut5.H2(context, "audio");
        if (!(objH2 instanceof AudioManager) || (audioManager = (AudioManager) objH2) == null) {
            return false;
        }
        if (audioManager.getMode() != 3 && audioManager.getMode() != 2) {
            return false;
        }
        return true;
    }
}
