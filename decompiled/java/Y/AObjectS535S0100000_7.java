package Y;

import X.C0IJV;
import X.InterfaceC1631620sYq;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.live.model.LiveScrollConfig;
import com.bytedance.android.livesdk.liveroom.InnerFlowHotRefreshController;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAdjustScrollConfigSetting;

/* JADX INFO: loaded from: classes8.dex */
public class AObjectS535S0100000_7 implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public AObjectS535S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS535S0100000_7 aObjectS535S0100000_7, Object obj, Object obj2, Object obj3) {
        float turnPageValue;
        C0IJV c0ijv = (C0IJV) aObjectS535S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        float fFloatValue3 = ((Float) obj3).floatValue();
        if (c0ijv.LJII()) {
            LiveScrollConfig value = LiveAdjustScrollConfigSetting.INSTANCE.getValue();
            float f = c0ijv.LIZIZ.getResources().getDisplayMetrics().density;
            float minDistanceForFling = value.getMinDistanceForFling() * f;
            float minFlingVelocity = value.getMinFlingVelocity() * f;
            float turnPageValue2 = value.getTurnPageValue();
            float f2 = 0.0f;
            if (0.0f <= turnPageValue2 && turnPageValue2 <= 1.0f && value.getTurnPageValue() != 0.0f && value.getTurnPageValue() != 1.0f) {
                turnPageValue = value.getTurnPageValue();
            } else {
                turnPageValue = 0.4f;
            }
            if (Math.abs(fFloatValue3 * 1.0f) <= minDistanceForFling || Math.abs(fFloatValue2) <= minFlingVelocity ? !(fFloatValue3 >= 0.0f ? fFloatValue3 <= 0.0f ? fFloatValue < 0.5f : fFloatValue <= 1.0f - turnPageValue : fFloatValue < turnPageValue) : fFloatValue2 > 0.0f) {
                f2 = 1.0f;
            }
            c0ijv.LIZ(f2, null);
        }
        return null;
    }

    public static final Object invoke$1(AObjectS535S0100000_7 aObjectS535S0100000_7, Object obj, Object obj2, Object obj3) {
        Long l = (Long) obj;
        Long l2 = (Long) obj2;
        Long l3 = (Long) obj3;
        InnerFlowHotRefreshController innerFlowHotRefreshController = ((LiveRoomFragment) aObjectS535S0100000_7.l0).LLILZ;
        if (innerFlowHotRefreshController == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(innerFlowHotRefreshController.onNegativeSignal(l.longValue(), l2.longValue(), l3.longValue()));
    }
}
