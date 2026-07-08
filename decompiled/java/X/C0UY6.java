package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UY6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UY6 implements InterfaceViewOnClickListenerC1102800enu {
    public final DataChannel LL;
    public InterfaceC1103130eoR LLILLJJLI;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    public C0UY6(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1104600eqo.LIZIZ(this.LL);
        if (C500260Jjc.LJJJIL(this.LL)) {
            C766270U4b.LIZLLL(2131842613);
        }
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LL, AFwS245S0000000_12.get$arr$(183), new AwS591S0100000_12(this, 958), AFwS245S0000000_12.get$arr$(184), C497740JfY.LJIJI(2131842036), Boolean.TRUE);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        int i;
        int i2;
        Context context;
        Integer numLIZJ;
        Context context2;
        Integer numLIZJ2;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        this.LLILLJJLI = interfaceC1103130eoR;
        Room room = (Room) this.LL.gg0(RoomChannel.class);
        if (room != null) {
            i = room.cppVersion;
        } else {
            i = 0;
        }
        Room room2 = (Room) this.LL.gg0(RoomChannel.class);
        if (room2 != null && (roomAuthStatus = room2.getRoomAuthStatus()) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
            i2 = anchorLevelPermission.goodyBag;
        } else {
            i2 = 1;
        }
        InterfaceC1103130eoR interfaceC1103130eoR2 = this.LLILLJJLI;
        if (interfaceC1103130eoR2 != null) {
            LiveIconView liveIconView = (LiveIconView) interfaceC1103130eoR2.findViewById(R.id.y74);
            TextView textView = (TextView) interfaceC1103130eoR2.findViewById(R.id.y7t);
            C16FV c16fv = (C16FV) interfaceC1103130eoR2.findViewById(R.id.y70);
            if (i == 2 && i2 == 0) {
                InterfaceC1103130eoR interfaceC1103130eoR3 = this.LLILLJJLI;
                if (interfaceC1103130eoR3 != null && (context2 = interfaceC1103130eoR3.getContext()) != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context2)) != null) {
                    int iIntValue = numLIZJ2.intValue();
                    if (liveIconView != null) {
                        liveIconView.setIcon(R.drawable.em5);
                    }
                    if (textView != null) {
                        textView.setTextColor(iIntValue);
                    }
                }
                if (c16fv != null) {
                    C786410Ut5.LLJJJJJIL(c16fv, 0);
                    C1143680frq.LJFF(c16fv, "tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v3.png", ImageView.ScaleType.CENTER_CROP, null);
                }
            } else {
                InterfaceC1103130eoR interfaceC1103130eoR4 = this.LLILLJJLI;
                if (interfaceC1103130eoR4 != null && (context = interfaceC1103130eoR4.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                    int iIntValue2 = numLIZJ.intValue();
                    if (liveIconView != null) {
                        liveIconView.setIcon(R.drawable.em5);
                    }
                    if (textView != null) {
                        textView.setTextColor(iIntValue2);
                    }
                }
                if (i != 2) {
                    ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(null, AFwS245S0000000_12.get$arr$(182), new AwS591S0100000_12(this, 957), null, null, null);
                }
            }
        }
        if (dataChannel != null) {
            Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
            if (bool != null) {
                bool.booleanValue();
            }
            dataChannel.gg0(RoomChannel.class);
        }
        C1104600eqo.LIZJ(dataChannel);
    }
}
