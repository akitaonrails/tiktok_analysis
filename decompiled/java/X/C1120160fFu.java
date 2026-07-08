package X;

import Y.ACListenerS152S0100000_17;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120160fFu implements InterfaceViewOnClickListenerC1102800enu {
    public final Room LL;
    public final DataChannel LLILLJJLI;
    public Long LLILLL;
    public Long LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(376));

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
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

    public final Keva LIZ() {
        return (Keva) this.LLILZIL.getValue();
    }

    public final void LIZIZ() {
        C1121570fIB c1121570fIB = new C1121570fIB((User) null);
        if (this.LLILLJJLI != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_gift_panel_entrance_click");
            C1133640fbe.LIZ(c474500IjALIZ);
            c474500IjALIZ.LIZ();
            C1133640fbe.LJIIL(2, null, null, null, 14);
            c1121570fIB.LIZJ = "live_gifts";
            c1121570fIB.LJII = C1128450fTH.LIZ.kD1();
            c1121570fIB.LJIILIIL = SystemClock.uptimeMillis();
            this.LLILLJJLI.LC0(SendGiftEvent.class, c1121570fIB);
        }
        RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_GIFT);
        Long l = this.LLILLL;
        if (l != null) {
            LIZ().storeLong("activity_event_id", l.longValue());
        }
        Long l2 = this.LLILZ;
        if (l2 != null) {
            LIZ().storeLong("last_recommend_activity_click_room_id", l2.longValue());
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C500260Jjc.LJJJIL(this.LLILLJJLI) && C474650IjP.LIZ() && InterfaceC772600USk.Ef.LIZIZ().booleanValue()) {
            LiveDialogFragment liveDialogFragmentCreateTryModeEducationDialogFragment = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createTryModeEducationDialogFragment("gift", new ACListenerS152S0100000_17(this, 181));
            FragmentManager fragmentManagerLJII = C500260Jjc.LJII(this.LLILLJJLI);
            if (fragmentManagerLJII != null) {
                liveDialogFragmentCreateTryModeEducationDialogFragment.show(fragmentManagerLJII, "try_mode_gift_anchor_manage_dialog");
            }
        } else {
            LIZIZ();
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.FQ2(ResetSilentTimerEvent.class);
            if (Intrinsics.LJFF(this.LLILLJJLI.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_gift_click");
                c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
                c474500IjALIZ.LJJII(C354201Zc.LIZ(this.LL.getStreamType()), "live_type");
                c474500IjALIZ.LIZ();
            }
        }
    }

    public C1120160fFu(Room room, DataChannel dataChannel) {
        this.LL = room;
        this.LLILLJJLI = dataChannel;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        LiveIconView liveIconView;
        TextView textView = (TextView) interfaceC1103130eoR.findViewById(R.id.y7t);
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131852615));
        }
        if (LiveHostSettingsUIConfig.enable() && C500260Jjc.LJIIZILJ(this.LLILLJJLI) && (liveIconView = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74)) != null) {
            liveIconView.setIconAttr(R.attr.dt_);
        }
        LifecycleOwner lifecycleOwnerLJJII = C520010KaN.LJJII(interfaceC1103130eoR.getContentView(), false);
        if (lifecycleOwnerLJJII != null) {
            RedDotExtensionKt.LJI(interfaceC1103130eoR.findViewById(R.id.y7r), lifecycleOwnerLJJII, null, C0UX6.LIVE_BROADCAST_GIFT, new C01B3(this, interfaceC1103130eoR, dataChannel));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_gift_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII("outside", "position");
        c474500IjALIZ.LIZ();
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && Intrinsics.LJFF(dataChannel2.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_creator_gift_panel_entrance_show");
            C1133640fbe.LIZ(c474500IjALIZ2);
            c474500IjALIZ2.LIZ();
            C1133640fbe.LJIIL(1, null, null, null, 14);
        }
    }
}
