package X;

import com.bytedance.android.livesdk.livesetting.game.GameFloatWindowMsgStrategySetting;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Tf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752210Tf1 {
    public static final C752210Tf1 LIZ = new C752210Tf1();

    static {
        if (GameFloatWindowMsgStrategySetting.INSTANCE.getConfig().enableStrategyChat) {
            Iterator<EnumC752200Tf0> it2 = EnumC752200Tf0.getEntries().iterator();
            while (it2.hasNext()) {
                ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).WC0(it2.next().getKey());
            }
        }
        LIZ.getClass();
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).WC0("gp_anchor_restriction_android");
    }

    public static boolean LIZ(int i) {
        if (!((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).e92("gp_anchor_restriction_android")) {
            return true;
        }
        int iCq2 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).cq2(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runPartnershipStrategy value:");
        sbLIZ.append(i);
        sbLIZ.append(" partnerShipResult:");
        sbLIZ.append(iCq2);
        C20441214yg.LIZIZ("GameLiveClientAiManager", C2188811AlT.LIZIZ(sbLIZ));
        if (iCq2 != 0) {
            return true;
        }
        return false;
    }
}
