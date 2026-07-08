package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Br7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217791Br7 extends AudioDeviceCallback {
    public final AudioManager LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2217821BrA());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C2217811Br9());

    public final Map<String, Boolean> LIZ() {
        return (Map) this.LIZJ.getValue();
    }

    public C2217791Br7(AudioManager audioManager) {
        this.LIZ = audioManager;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (audioDeviceInfoArr != null) {
            C089E c089e = new C089E(audioDeviceInfoArr);
            while (c089e.hasNext()) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) c089e.next();
                int type = audioDeviceInfo.getType();
                C01GW c01gw = C1857207Pe.LIZ;
                boolean zContains = ((List) c01gw.getValue()).contains(Integer.valueOf(type));
                C722900SXg c722900SXgLIZ = C722880SXe.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("audio device connected, is supported device: ");
                sbLIZ.append(zContains);
                c722900SXgLIZ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                AudioManager audioManager = this.LIZ;
                if (audioManager != null) {
                    try {
                        C20286614Zk.LIZ.getClass();
                        if (C20286614Zk.LJII || audioManager.getMode() != 0 || !audioDeviceInfo.isSink() || !((List) c01gw.getValue()).contains(Integer.valueOf(audioDeviceInfo.getType())) || (audioDeviceInfo.getType() == 7 && (!audioManager.isBluetoothScoOn() || !audioManager.isBluetoothScoAvailableOffCall()))) {
                        }
                        ((IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class)).LIZLLL(false);
                        for (InterfaceC2217831BrB interfaceC2217831BrB : (Set) this.LIZIZ.getValue()) {
                            C722880SXe.LIZIZ(LIZ().get(interfaceC2217831BrB.getScenario()), interfaceC2217831BrB.getScenario());
                            if (Intrinsics.LJFF(LIZ().get(interfaceC2217831BrB.getScenario()), Boolean.TRUE)) {
                                interfaceC2217831BrB.LIZ();
                            }
                        }
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C722900SXg c722900SXgLIZ2 = C722880SXe.LIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("exception: ");
                        sbLIZ2.append(e);
                        c722900SXgLIZ2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
        }
    }
}
