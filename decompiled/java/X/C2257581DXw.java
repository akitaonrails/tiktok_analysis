package X;

import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageComponentConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageComponentStateConfig;

/* JADX INFO: renamed from: X.1DXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257581DXw extends AbstractC2257561DXu {
    @Override // X.AbstractC2257561DXu
    public final AdOneStopLandingPageComponentStateConfig LIZJ(AdOneStopLandingPageComponentConfig adOneStopLandingPageComponentConfig) {
        return adOneStopLandingPageComponentConfig.getLoading();
    }

    @Override // X.AbstractC2257561DXu
    public final InterfaceC2257411DXf LIZIZ(final AdOneStopLandingPageComponentStateConfig adOneStopLandingPageComponentStateConfig, final C2257611DXz c2257611DXz) {
        return new AbstractC2257541DXs(adOneStopLandingPageComponentStateConfig, c2257611DXz) { // from class: X.1DXx
            @Override // X.InterfaceC2257411DXf
            public final EnumC1781620wSm LIZ() {
                return EnumC1781620wSm.LOADING;
            }
        };
    }
}
