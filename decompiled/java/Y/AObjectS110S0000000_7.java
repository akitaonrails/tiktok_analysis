package Y;

import X.C06W2;
import X.C0J0Q;
import X.C0UFE;
import X.C1094360eaI;
import X.C1161920gLG;
import X.C1397660mTU;
import X.C466240IQc;
import X.C474500IjA;
import X.C500380Jjo;
import X.C925600aC6;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AObjectS110S0000000_7 implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public AObjectS110S0000000_7(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS110S0000000_7 aObjectS110S0000000_7, Object obj) {
        Map<String, String> map = ((C500380Jjo) obj).LIZ;
        HashMap map2 = new HashMap();
        map2.put("enter_from", "league_campaign_rank");
        map2.put("connection_type", "anchor");
        map2.put("notice_type", "normal_notice");
        map2.putAll(map);
        C925600aC6.LJJIJL("livesdk_guest_connection_anchor", "show", map2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS110S0000000_7 aObjectS110S0000000_7, Object obj) {
        String str = LivePlayFragment._pnsPageId;
        if (((Boolean) obj).booleanValue()) {
            C466240IQc.LIZIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS110S0000000_7 aObjectS110S0000000_7, Object obj) {
        String str = LivePlayFragment._pnsPageId;
        ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).bg(C0J0Q.APP, "current_user_level", Integer.valueOf(((C1094360eaI) obj).LIZ), "user_info", false);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS110S0000000_7 aObjectS110S0000000_7, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS110S0000000_7 aObjectS110S0000000_7, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS110S0000000_7 aObjectS110S0000000_7, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS110S0000000_7 aObjectS110S0000000_7, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII("intro", "features");
        return c474500IjA;
    }

    public static final Object invoke$7(AObjectS110S0000000_7 aObjectS110S0000000_7, Object obj) {
        return C0UFE.fromInt(((AnchorLevelPermission) obj).liveIntro);
    }

    public static final Object invoke$8(AObjectS110S0000000_7 aObjectS110S0000000_7, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(new AObjectS60S0000000_7(24));
        c06w2.Dw2(new AObjectS60S0000000_7(25));
        return null;
    }
}
