package Y;

import X.C1161920gLG;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.widget.LiveTopShareWidget;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.widget.PcsServicePlusWidget;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AObjectS70S0000000_17 implements Function0 {
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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public AObjectS70S0000000_17(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS70S0000000_17 aObjectS70S0000000_17) {
        return String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getChannelId());
    }

    public static final Object invoke$1(AObjectS70S0000000_17 aObjectS70S0000000_17) {
        return String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getChannelId());
    }

    public static final Object invoke$2(AObjectS70S0000000_17 aObjectS70S0000000_17) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        return ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).P10();
    }

    public static final Object invoke$3(AObjectS70S0000000_17 aObjectS70S0000000_17) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        return new LiveTopShareWidget();
    }

    public static final Object invoke$4(AObjectS70S0000000_17 aObjectS70S0000000_17) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        return ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).yO1();
    }

    public static final Object invoke$5(AObjectS70S0000000_17 aObjectS70S0000000_17) {
        String str = LiveRoomUserInfoWidget.Q;
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).pa().getClass();
        return new PcsServicePlusWidget();
    }

    public static final Object invoke$6(AObjectS70S0000000_17 aObjectS70S0000000_17) {
        String str = LiveRoomUserInfoWidget.Q;
        return ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).pa2();
    }

    public static final Object invoke$7(AObjectS70S0000000_17 aObjectS70S0000000_17) {
        String str = LiveRoomUserInfoWidget.Q;
        return ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).aq2();
    }
}
