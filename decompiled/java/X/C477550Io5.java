package X;

import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.performance.LiveTtsResumePlaySetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Io5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477550Io5 implements InterfaceC1488720oqM {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.InterfaceC1488720oqM
    public final int Yc() {
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService != null) {
            return iPullStreamService.TJ1();
        }
        return 0;
    }

    @Override // X.InterfaceC1488720oqM
    public final Boolean isPlaying() {
        C480680It8 c480680It8YY;
        InterfaceC480510Isr interfaceC480510Isr;
        if (!LiveTtsResumePlaySetting.getValue()) {
            InterfaceC480520Iss interfaceC480520IssLLILZLL = C477570Io7.LIZ.LLILZLL();
            if (interfaceC480520IssLLILZLL != null) {
                return Boolean.valueOf(interfaceC480520IssLLILZLL.isPlaying());
            }
            return null;
        }
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService == null || (c480680It8YY = iPullStreamService.YY()) == null || (interfaceC480510Isr = c480680It8YY.LIZIZ) == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC480510Isr.isPlaying());
    }

    @Override // X.InterfaceC1488720oqM
    public final boolean LIZ(String str) {
        Map<String, Map<String, String>> map;
        Map<String, String> map2;
        String str2 = null;
        C945320ahu c945320ahu = new C945320ahu(null, str);
        if (!C2093608Ic.LIZJ(new JSONObject(str).optString("sub_only_live"), "1")) {
            SeiAppData seiAppDataLJII = C969340bKe.LJII(c945320ahu);
            if (seiAppDataLJII != null && (map = seiAppDataLJII.businessExtraInfo) != null && (map2 = map.get("sub_only_live")) != null) {
                str2 = map2.get("sub_only_live");
            }
            if (!C2093608Ic.LIZJ(String.valueOf(str2), "1")) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC1488720oqM
    public final void LIZIZ(boolean z) {
        InterfaceC480510Isr interfaceC480510Isr;
        if (LiveTtsResumePlaySetting.getValue()) {
            C480680It8 c480680It8YY = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY();
            if (c480680It8YY != null) {
                interfaceC480510Isr = c480680It8YY.LIZIZ;
                if (interfaceC480510Isr != null) {
                    interfaceC480510Isr.G0(interfaceC480510Isr.getPlayerTag());
                }
            } else {
                interfaceC480510Isr = null;
            }
            if (z && interfaceC480510Isr != null) {
                interfaceC480510Isr.LJJLIIIJLLLLLLLZ();
            }
        }
    }

    @Override // X.InterfaceC1488720oqM
    public final void setCurrentPlayerMute(boolean z) {
        InterfaceC480510Isr interfaceC480510Isr;
        C480680It8 c480680It8YY = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY();
        if (c480680It8YY != null && (interfaceC480510Isr = c480680It8YY.LIZIZ) != null) {
            interfaceC480510Isr.t0(interfaceC480510Isr.getPlayerTag(), "", z);
        }
    }
}
