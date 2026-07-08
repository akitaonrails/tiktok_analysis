package Y;

import X.C496500JdY;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AObjectS41S1300000_17 implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS41S1300000_17 aObjectS41S1300000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS41S1300000_17.l1;
        String str = aObjectS41S1300000_17.s0;
        C496500JdY c496500JdY = (C496500JdY) aObjectS41S1300000_17.l2;
        Function0<Unit> function0 = (Function0) aObjectS41S1300000_17.l3;
        String str2 = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.x2(false);
        liveRoomUserInfoWidget.LLLLLZIL.LJ(str, liveRoomUserInfoWidget.LLLZL, c496500JdY.LIZIZ, liveRoomUserInfoWidget.LLZLL, function0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS41S1300000_17 aObjectS41S1300000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS41S1300000_17.l1;
        String str = aObjectS41S1300000_17.s0;
        C496500JdY c496500JdY = (C496500JdY) aObjectS41S1300000_17.l2;
        Function0<Unit> function0 = (Function0) aObjectS41S1300000_17.l3;
        String str2 = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.x2(false);
        liveRoomUserInfoWidget.LLLLLZIL.LJ(str, liveRoomUserInfoWidget.LLLZL, c496500JdY.LIZIZ, c496500JdY.LIZIZ, function0);
        return Unit.LIZ;
    }

    public AObjectS41S1300000_17(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
