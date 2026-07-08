package Y;

import X.C1077790e9Z;
import X.EnumC1087640ePS;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AObjectS34S0100100_17 implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS34S0100100_17 aObjectS34S0100100_17, Object obj) {
        ((AbsAudienceInteractionFragment) aObjectS34S0100100_17.l0).LT(aObjectS34S0100100_17.j1, false);
        return null;
    }

    public static final Object invoke$1(AObjectS34S0100100_17 aObjectS34S0100100_17, Object obj) {
        LikeMessage likeMessage;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS34S0100100_17.l0;
        long j = aObjectS34S0100100_17.j1;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.getClass();
        if (((C1077790e9Z) obj).LIZIZ.ordinal() < EnumC1087640ePS.LEVEL_HIGH.ordinal()) {
            liveRoomUserInfoWidget.e = j;
            return null;
        }
        liveRoomUserInfoWidget.e = 0L;
        if (!liveRoomUserInfoWidget.f || (likeMessage = liveRoomUserInfoWidget.LLZZZZ) == null) {
            return null;
        }
        liveRoomUserInfoWidget.R2(likeMessage.total);
        return null;
    }

    public AObjectS34S0100100_17(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
