package X;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.TtlsLiveProductNumber;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.PaidEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UDM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UDM extends C0UDO {
    public LiveIconView LL;
    public View LLILLJJLI;
    public DataChannel LLILLL;
    public final AFwS245S0000000_12 LLILZ = AFwS245S0000000_12.get$arr$(120);
    public C0UFE LLILZIL;

    public final boolean LIZ() {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        Room room;
        Integer num;
        Room room2;
        PaidEvent paidEvent;
        if (LiveBGMSetting.INSTANCE.inLiveBGMUpgrade() && ((dataChannel = this.LLILLL) == null || (room2 = (Room) dataChannel.gg0(RoomChannel.class)) == null || (paidEvent = room2.paidEvent) == null || paidEvent.paidType != 1)) {
            DataChannel dataChannel3 = this.LLILLL;
            if (C500260Jjc.LJJIFFI(dataChannel3 != null ? (Boolean) dataChannel3.gg0(ECLiveStatusChangeChannel.class) : null) && ((dataChannel2 = this.LLILLL) == null || (num = (Integer) dataChannel2.gg0(TtlsLiveProductNumber.class)) == null || num.intValue() == 0)) {
                DataChannel dataChannel4 = this.LLILLL;
                return dataChannel4 == null || (room = (Room) dataChannel4.gg0(RoomChannel.class)) == null || room.liveSubOnly != 1;
            }
        }
        return false;
    }

    @Override // X.C0UDO, X.InterfaceViewOnClickListenerC1102800enu
    public final boolean dj() {
        if (C0UFE.ON != this.LLILZIL || C781270Ukn.LJI().isUsingAccompanimentBusiness()) {
            return false;
        }
        return ((C768460UCm.LJIIJ() && LIZ()) || C768810UDv.LIZ) ? false : true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C753070TgP.LIZJ(this.LLILLL, this.LLILZ, new AwS591S0100000_12(this, 751), AFwS245S0000000_12.get$arr$(121), C497740JfY.LJIJI(2131842883), Boolean.FALSE);
    }

    @Override // X.C0UDO, X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        super.WH(interfaceC1103130eoR, dataChannel);
        this.LLILLL = dataChannel;
        this.LL = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74);
        this.LLILLJJLI = interfaceC1103130eoR.findViewById(R.id.y7r);
        C753070TgP.LIZJ(null, this.LLILZ, new AwS221S0300000_12(this, dataChannel, interfaceC1103130eoR, 16), null, null, Boolean.TRUE);
        if (LiveLOP0OptSetting.INSTANCE.enable() && this.LLILZIL == C0UFE.OFF) {
            return;
        }
        C768460UCm.LJIIIIZZ();
        if (C761830TuX.LIZJ()) {
            LiveIconView liveIconView = this.LL;
            if (liveIconView != null) {
                liveIconView.setIcon(R.drawable.ez7);
            }
        } else {
            LiveIconView liveIconView2 = this.LL;
            if (liveIconView2 != null) {
                liveIconView2.setIcon(R.drawable.f656ez6);
            }
        }
        if (!C781270Ukn.LJI().isUsingAccompanimentBusiness() && ((!C768460UCm.LJIIJ() || !LIZ()) && !C768810UDv.LIZ)) {
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            if (!C0U3P.LIZ(C0U3Q.VOICE_EFFECT)) {
                return;
            }
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(interfaceC1103130eoR.LJ(), (Property<View, Float>) View.ALPHA, 1.0f, 0.4f);
        objectAnimatorOfFloat.setDuration(100L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
