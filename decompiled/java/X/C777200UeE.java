package X;

import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.game.LiveGameSafetyReporterSetting;
import com.bytedance.android.livesdk.livesetting.game.LiveGameSafetyReporterSetting2;
import com.bytedance.android.livesdk.livesetting.game.LiveGameSafetyReporterSettingConfig2;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import java.util.Map;
import webcast.api.game.TnsPiracyDetail;

/* JADX INFO: renamed from: X.0UeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777200UeE implements InterfaceC471501sX {
    public final GameBroadcastFragment LIZ;
    public boolean LIZIZ;
    public final LiveGameSafetyReporterSettingConfig2.GameLiveSafetyReporterConfig2 LIZJ = LiveGameSafetyReporterSettingConfig2.INSTANCE.getValue();

    @Override // X.InterfaceC471501sX
    public final void start() {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // X.InterfaceC471501sX
    public final void stop() {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public C777200UeE(GameBroadcastFragment gameBroadcastFragment) {
        this.LIZ = gameBroadcastFragment;
    }

    @Override // X.InterfaceC471501sX
    public final void LIZ(TnsPiracyDetail tnsPiracyDetail) {
        long jLIZIZ;
        Map<String, Object> map = C1338270kvh.LIZ;
        C774940Uaa c774940Uaa = this.LIZ.LLJJIJIIJIL;
        if (c774940Uaa == null) {
            c774940Uaa = null;
        }
        InterfaceC769940UIe interfaceC769940UIe = c774940Uaa.LLILZ;
        if (interfaceC769940UIe == null) {
            jLIZIZ = 0;
        } else {
            jLIZIZ = interfaceC769940UIe.LIZIZ();
        }
        tnsPiracyDetail.microSound = jLIZIZ;
        if (LiveGameSafetyReporterSetting2.INSTANCE.isDefault()) {
            if (!this.LIZIZ && jLIZIZ > this.LIZJ.voiceDB) {
                tnsPiracyDetail.microphoneInputDetected = true;
            } else {
                tnsPiracyDetail.microphoneInputDetected = false;
            }
        }
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(Long.valueOf(jLIZIZ), "g_broadcast_mic_db");
        boolean z = C777230UeH.LIZJ;
        if (LiveGameSafetyReporterSetting.INSTANCE.getValue().f29switch) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCollectMicDb, db: ");
            sbLIZ.append(jLIZIZ);
            C20441214yg.LIZIZ("SafetyFeatureCollector", C2188811AlT.LIZIZ(sbLIZ));
            if (jLIZIZ > 95) {
                C777230UeH.LIZ = System.currentTimeMillis();
            }
            if (System.currentTimeMillis() - C777230UeH.LIZ < 30000) {
                C777230UeH.LIZ(Boolean.TRUE, "g_anchor_microphone_human_voice_period");
                C777230UeH.LIZLLL = true;
            } else {
                C777230UeH.LIZ(Boolean.FALSE, "g_anchor_microphone_human_voice_period");
                C777230UeH.LIZLLL = false;
            }
        }
    }
}
