package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.longpress.LPPProtocol;
import com.ss.android.ugc.aweme.longpress.LongPressPanelConfig;
import com.ss.android.ugc.aweme.longpress.LongPressPanelMoveTipConfig;

/* JADX INFO: renamed from: X.0lnn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1371810lnn {
    public static final C1371840lnq LIZ = new C1371840lnq();
    public static final C607070NrV<Integer> LIZIZ;
    public static final C607070NrV<Integer> LIZJ;

    static {
        LongPressPanelConfig longPressPanelConfig;
        LongPressPanelMoveTipConfig longPressPanelMoveTipConfig;
        Integer num;
        LongPressPanelConfig longPressPanelConfig2;
        LongPressPanelMoveTipConfig longPressPanelMoveTipConfig2;
        Integer num2;
        Keva repo = Keva.getRepo("long_press_pane_move_tips");
        C1379120lza.LIZ.getClass();
        LPPProtocol lPPProtocolLIZ = C1379120lza.LIZ();
        int iIntValue = 3;
        LIZIZ = new C607070NrV<>(repo, Integer.valueOf((lPPProtocolLIZ == null || (longPressPanelConfig2 = lPPProtocolLIZ.longPressPanelConfig) == null || (longPressPanelMoveTipConfig2 = longPressPanelConfig2.moveTipConfig) == null || (num2 = longPressPanelMoveTipConfig2.moveTipDisplayCount) == null) ? 3 : num2.intValue()), "move_to_share_remaining_total_count");
        Keva repo2 = Keva.getRepo("long_press_pane_move_tips");
        LPPProtocol lPPProtocolLIZ2 = C1379120lza.LIZ();
        if (lPPProtocolLIZ2 != null && (longPressPanelConfig = lPPProtocolLIZ2.longPressPanelConfig) != null && (longPressPanelMoveTipConfig = longPressPanelConfig.moveTipConfig) != null && (num = longPressPanelMoveTipConfig.moveTipDisplayCount) != null) {
            iIntValue = num.intValue();
        }
        LIZJ = new C607070NrV<>(repo2, Integer.valueOf(iIntValue), "move_to_share_remaining_total_count_others");
    }
}
