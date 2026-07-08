package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkLevelService;

/* JADX INFO: renamed from: X.0tKi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661300tKi {
    public static final C1661300tKi LIZ = new C1661300tKi();

    public static EnumC1661320tKk LIZ() {
        C1411240mpO nqeNetworkLevel;
        EnumC1661320tKk enumC1661320tKk;
        INetworkLevelService iNetworkLevelService = (INetworkLevelService) PluggableExtentionKt.pluggableSpi$default(INetworkLevelService.class, false, false, false, 14, null);
        return (iNetworkLevelService == null || (nqeNetworkLevel = iNetworkLevelService.getNqeNetworkLevel()) == null || (enumC1661320tKk = nqeNetworkLevel.LIZ) == null) ? EnumC1661320tKk.UNKNOWN : enumC1661320tKk;
    }

    public static boolean LIZIZ() {
        switch (C1661310tKj.LIZ[LIZ().ordinal()]) {
            case 1:
            case 2:
                return C0XF5.LIZIZ() && C036E.LIZ.LIZJ == C0O0L.AVAILABLE;
            case 3:
            case 4:
                return false;
            case 5:
            case 6:
            case 7:
                return true;
            default:
                throw new C1954807lC();
        }
    }
}
