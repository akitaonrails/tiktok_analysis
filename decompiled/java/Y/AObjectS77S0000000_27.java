package Y;

import X.C1161920gLG;
import X.C1566230qrN;
import X.C1568590qvB;
import X.C1570060qxY;
import X.C1796830wrJ;
import X.C1804400x3W;
import X.C1804610x3r;
import X.C1805070x4b;
import X.C1807670x8n;
import X.InterfaceC2217461Bqa;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.walletclean.presentation.assem.header.view.RechargePanelHeaderAssem;
import com.bytedance.android.live.walletclean.presentation.assem.header.view.RechargePanelNoticeAssem;
import com.bytedance.android.live.walletclean.presentation.assem.header.view.RechargePanelTitleBarAssem;
import com.ss.android.ugc.aweme.tako.camera.record.TakoRecordCoreViewModel;
import com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoRecordUIAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AObjectS77S0000000_27 implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS77S0000000_27 aObjectS77S0000000_27) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoRecordUIAssem.LLJZ;
        return new TakoRecordCoreViewModel();
    }

    public static final Object invoke$1(AObjectS77S0000000_27 aObjectS77S0000000_27) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RechargePanelHeaderAssem.LLJJ;
        return C1807670x8n.LJJIIJ(new C1566230qrN(), new C1568590qvB((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), C1807670x8n.LJJI(), C1807670x8n.LJJ())), new C1796830wrJ(), new C1570060qxY(), (IapService) C1161920gLG.LIZJ(IapService.class));
    }

    public static final Object invoke$2(AObjectS77S0000000_27 aObjectS77S0000000_27) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RechargePanelNoticeAssem.LLJLLIL;
        return C1807670x8n.LJJIIJ(new C1566230qrN(), new C1568590qvB((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), C1807670x8n.LJJI(), C1807670x8n.LJJ())), new C1796830wrJ(), new C1570060qxY(), (IapService) C1161920gLG.LIZJ(IapService.class));
    }

    public static final Object invoke$3(AObjectS77S0000000_27 aObjectS77S0000000_27) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RechargePanelTitleBarAssem.LLJLILLLLZIIL;
        return C1807670x8n.LJJIIJ(new C1566230qrN(), new C1568590qvB((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), C1807670x8n.LJJI(), C1807670x8n.LJJ())), new C1796830wrJ(), new C1570060qxY(), (IapService) C1161920gLG.LIZJ(IapService.class));
    }

    public AObjectS77S0000000_27(RechargePanelHeaderAssem rechargePanelHeaderAssem, int i) {
        this.$t = i;
    }

    public AObjectS77S0000000_27(RechargePanelNoticeAssem rechargePanelNoticeAssem, int i) {
        this.$t = i;
    }

    public AObjectS77S0000000_27(RechargePanelTitleBarAssem rechargePanelTitleBarAssem, int i) {
        this.$t = i;
    }

    public AObjectS77S0000000_27(TakoRecordUIAssem takoRecordUIAssem, int i) {
        this.$t = i;
    }
}
