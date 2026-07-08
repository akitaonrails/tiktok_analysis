package X;

import com.bytedance.android.live.base.model.LiveSurveyState;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.other.LiveSurveyFeaturesSetting;
import java.util.List;

/* JADX INFO: renamed from: X.0IxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483380IxU implements InterfaceC1572350r1F {
    public static final C483380IxU LIZ = new C483380IxU();

    @Override // X.InterfaceC1572350r1F
    public final boolean LJ() {
        LiveSurveyFeaturesSetting liveSurveyFeaturesSetting = LiveSurveyFeaturesSetting.INSTANCE;
        return liveSurveyFeaturesSetting.enableGlobalSurvey() || liveSurveyFeaturesSetting.enableFullScreenSurvey() || liveSurveyFeaturesSetting.enableLightSurvey();
    }

    @Override // X.InterfaceC1572350r1F
    public final void LIZ() {
        InterfaceC483370IxT interfaceC483370IxTKu;
        C1AKK liteService = Live.getLiteService();
        if (liteService == null || (interfaceC483370IxTKu = liteService.ku()) == null) {
            return;
        }
        interfaceC483370IxTKu.LIZ();
    }

    @Override // X.InterfaceC1572350r1F
    public final List<LiveSurveyState> LIZJ() {
        InterfaceC483310IxN interfaceC483310IxNLb;
        List<LiveSurveyState> listLIZJ;
        C1AKK liteService = Live.getLiteService();
        return (liteService == null || (interfaceC483310IxNLb = liteService.Lb()) == null || (listLIZJ = interfaceC483310IxNLb.LIZJ()) == null) ? C13BV.INSTANCE : listLIZJ;
    }

    @Override // X.InterfaceC1572350r1F
    public final boolean LIZLLL() {
        InterfaceC483310IxN interfaceC483310IxNLb;
        C1AKK liteService = Live.getLiteService();
        if (liteService == null || (interfaceC483310IxNLb = liteService.Lb()) == null) {
            return false;
        }
        return interfaceC483310IxNLb.LIZLLL();
    }

    @Override // X.InterfaceC1572350r1F
    public final void LIZIZ(String str) {
        InterfaceC483370IxT interfaceC483370IxTKu;
        C1AKK liteService = Live.getLiteService();
        if (liteService != null && (interfaceC483370IxTKu = liteService.ku()) != null) {
            interfaceC483370IxTKu.LIZIZ(str);
        }
    }
}
