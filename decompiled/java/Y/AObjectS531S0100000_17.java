package Y;

import X.C1077790e9Z;
import X.C1111930f2d;
import X.C20441214yg;
import X.C2188811AlT;
import X.EnumC1087640ePS;
import com.bytedance.android.live.slot.SlotBarrageWidget;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public class AObjectS531S0100000_17 implements Function2 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS531S0100000_17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS531S0100000_17 aObjectS531S0100000_17, Object obj, Object obj2) {
        ((SlotBarrageWidget) aObjectS531S0100000_17.l0).LLIZ.LJJIIJZLJL = ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS531S0100000_17 aObjectS531S0100000_17, Object obj, Object obj2) {
        EnumC1087640ePS enumC1087640ePS = (EnumC1087640ePS) obj;
        EnumC1087640ePS enumC1087640ePS2 = (EnumC1087640ePS) obj2;
        ((AbsAudienceInteractionFragment) aObjectS531S0100000_17.l0).LLJIJIL.zW(LowDevicePerfScalableChannel.class, new C1077790e9Z(enumC1087640ePS, enumC1087640ePS2));
        if (enumC1087640ePS != enumC1087640ePS2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Downgrade changed: ");
            sbLIZ.append(enumC1087640ePS.name());
            sbLIZ.append(" -> ");
            sbLIZ.append(enumC1087640ePS2.name());
            C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        return null;
    }

    public static final Object invoke$2(AObjectS531S0100000_17 aObjectS531S0100000_17, Object obj, Object obj2) {
        EnumC1087640ePS enumC1087640ePS = (EnumC1087640ePS) obj;
        EnumC1087640ePS enumC1087640ePS2 = (EnumC1087640ePS) obj2;
        ((AbsAudienceInteractionFragment) aObjectS531S0100000_17.l0).LLJIJIL.zW(LowDevicePerfScalableChannel.class, new C1077790e9Z(enumC1087640ePS, enumC1087640ePS2));
        if (enumC1087640ePS != enumC1087640ePS2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Downgrade changed: ");
            sbLIZ.append(enumC1087640ePS.name());
            sbLIZ.append(" -> ");
            sbLIZ.append(enumC1087640ePS2.name());
            C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        return null;
    }

    public static final Object invoke$3(AObjectS531S0100000_17 aObjectS531S0100000_17, Object obj, Object obj2) {
        EnumC1087640ePS enumC1087640ePS = (EnumC1087640ePS) obj;
        EnumC1087640ePS enumC1087640ePS2 = (EnumC1087640ePS) obj2;
        ((AbsAudienceInteractionFragment) aObjectS531S0100000_17.l0).LLJIJIL.zW(LowDevicePerfScalableChannel.class, new C1077790e9Z(enumC1087640ePS, enumC1087640ePS2));
        if (enumC1087640ePS != enumC1087640ePS2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Downgrade changed: ");
            sbLIZ.append(enumC1087640ePS.name());
            sbLIZ.append(" -> ");
            sbLIZ.append(enumC1087640ePS2.name());
            C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        return null;
    }

    public static final Object invoke$4(AObjectS531S0100000_17 aObjectS531S0100000_17, Object obj, Object obj2) {
        int iFloatValue;
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS531S0100000_17.l0;
        Float f = (Float) obj2;
        c1111930f2d.getClass();
        if (((Boolean) obj).booleanValue() && f.floatValue() != 0.0f) {
            iFloatValue = (int) (c1111930f2d.LLJJ / f.floatValue());
        } else {
            iFloatValue = c1111930f2d.LLJJ;
        }
        if (c1111930f2d.LLJILLL != iFloatValue) {
            c1111930f2d.LLJILLL = iFloatValue;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS531S0100000_17 aObjectS531S0100000_17, Object obj, Object obj2) {
        LikeMessage likeMessage;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS531S0100000_17.l0;
        Long l = (Long) obj2;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.getClass();
        if (((Boolean) obj).booleanValue()) {
            liveRoomUserInfoWidget.e = l.longValue();
        } else {
            liveRoomUserInfoWidget.e = 0L;
            if (liveRoomUserInfoWidget.f && (likeMessage = liveRoomUserInfoWidget.LLZZZZ) != null) {
                liveRoomUserInfoWidget.R2(likeMessage.total);
            }
        }
        return Unit.LIZ;
    }
}
