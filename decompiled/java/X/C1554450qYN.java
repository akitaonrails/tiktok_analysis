package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0qYN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554450qYN implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            default:
                return null;
        }
    }

    public C1554450qYN(SpeedModeServiceImpl speedModeServiceImpl, int i) {
        this.$t = i;
        this.l0 = speedModeServiceImpl;
    }

    public static final Object then$0(C1554450qYN c1554450qYN, C15O7 c15o7) {
        C1C7U.LIZ("SpeedModeServiceImpl@2150.initPlayerSwitchController$1$onMultiNetworkChange$1");
        if (((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getMultiNetworkState() == EnumC1493070oxN.DEFAULT_WIFI_WITH_CELLULAR_UP) {
            ((SpeedModeServiceImpl) c1554450qYN.l0).LJ().LIZLLL();
        } else {
            ((SpeedModeServiceImpl) c1554450qYN.l0).LJ().LJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SpeedModeServiceImpl@2150.initPlayerSwitchController$1$onMultiNetworkChange$1");
        return unit;
    }

    public static final Object then$1(C1554450qYN c1554450qYN, C15O7 c15o7) {
        C1C7U.LIZ("SpeedModeServiceImpl@2150.internalStart$1");
        if (((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getMultiNetworkState() == EnumC1493070oxN.DEFAULT_WIFI_WITH_CELLULAR_UP) {
            ((SpeedModeServiceImpl) c1554450qYN.l0).LJ().LIZLLL();
        } else {
            ((SpeedModeServiceImpl) c1554450qYN.l0).LJ().LJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SpeedModeServiceImpl@2150.internalStart$1");
        return unit;
    }
}
