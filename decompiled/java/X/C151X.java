package X;

import com.bytedance.android.livesdk.livesetting.game.GameFusionIdModifyConfidenceThresholdSetting;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import java.util.Map;

/* JADX INFO: renamed from: X.151X, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C151X {
    public final InterfaceC204520151a LIZ;
    public C11JF LIZIZ;
    public String LIZJ = "";
    public final long LIZLLL = GameFusionIdModifyConfidenceThresholdSetting.INSTANCE.getValue();

    public static String LIZ() {
        Map<String, Object> map = C1338270kvh.LIZ;
        return String.valueOf(((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).getFeature("g_interaction_fusion_tag_id"));
    }

    public C151X(C151Z c151z) {
        this.LIZ = c151z;
    }
}
