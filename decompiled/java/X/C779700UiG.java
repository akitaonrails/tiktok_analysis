package X;

import Y.ACListenerS79S0300000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseTimeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UiG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779700UiG implements InterfaceViewOnClickListenerC1102800enu, C0UXZ {
    public DataChannel LL;
    public final int LLILLJJLI = LivePauseTimeSetting.INSTANCE.getPauseTimes();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 734));

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

    public final boolean LIZ() {
        String str;
        C1081600eFi c1081600eFi;
        C782680Un4 c782680Un4;
        DataChannel dataChannel = this.LL;
        if (dataChannel == null || (c782680Un4 = (C782680Un4) dataChannel.gg0(LinkStateForH5Event.class)) == null || (str = c782680Un4.LIZ) == null) {
            str = "normal";
        }
        DataChannel dataChannel2 = this.LL;
        Boolean boolValueOf = null;
        boolean z = true;
        boolean z2 = (dataChannel2 != null ? dataChannel2.gg0(LiveModeChannel.class) : null) == LiveMode.LIVE_VOICE;
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 != null && (c1081600eFi = (C1081600eFi) dataChannel3.gg0(MultiLiveRTCLayoutChannel.class)) != null) {
            boolValueOf = Boolean.valueOf(c1081600eFi.LIZIZ());
        }
        C500260Jjc.LJJJI(boolValueOf);
        if (Intrinsics.LJFF(str, "normal") && !((IMicRoomService) C781270Ukn.LJJIJL.getValue()).zS() && !z2) {
            z = false;
        }
        return C500260Jjc.LJLLJ(Boolean.valueOf(z), AFwS199S0000000_12.get$arr$(263));
    }

    public final String LIZJ() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue() ? "video_live" : "screen_share";
    }

    public final void LIZLLL() {
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zW(PauseLiveChannel.class, Boolean.TRUE);
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.zW(GameBroadcastStateChannel.class, C0TD3.STATE_PAUSE);
        }
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 != null) {
            Integer num = (Integer) dataChannel3.gg0(C750110Tbd.class);
            dataChannel3.SX0(C750110Tbd.class, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
        C781270Ukn.LJI().pauseBGM(Boolean.TRUE);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iIntValue;
        int i;
        Context context;
        Integer num;
        if (C500260Jjc.LJJJIL(this.LL)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trymode_live_pause_click");
            c474500IjALIZ.LJIJJLI(this.LL);
            c474500IjALIZ.LIZ();
            C0U4R c0u4r = new C0U4R();
            c0u4r.LJII = this.LL;
            c0u4r.LIZJ = "pm_mt_liveTryMode_tryModePage_pauseToast";
            c0u4r.LIZLLL = 2131842636;
            c0u4r.LJFF = true;
            C766270U4b.LJIIJ(c0u4r);
            return;
        }
        if (LIZ()) {
            return;
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(C750110Tbd.class)) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue >= this.LLILLJJLI) {
            i = 1;
        } else {
            i = 0;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_pause_click");
        c474500IjALIZ2.LJJII(LIZJ(), "live_type");
        c474500IjALIZ2.LJIJJLI(this.LL);
        c474500IjALIZ2.LJJII(Integer.valueOf(i), "is_max_pause_num");
        C20337914i1<Boolean> c20337914i1 = InterfaceC772190UQv.l3;
        c474500IjALIZ2.LJJII(Integer.valueOf(c20337914i1.LIZIZ().booleanValue() ? 1 : 0), "is_first");
        c474500IjALIZ2.LJJII(1, "in_app");
        c474500IjALIZ2.LJJII(0, "is_floating");
        c474500IjALIZ2.LIZ();
        if (i != 0) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131855019, Integer.valueOf(this.LLILLJJLI)));
            return;
        }
        String strLJIJJ = C497740JfY.LJIJJ(2131855018, Integer.valueOf(this.LLILLJJLI), 5);
        if (c20337914i1.LIZIZ().booleanValue()) {
            c20337914i1.LJFF(Boolean.FALSE);
            if (view != null && (context = view.getContext()) != null) {
                C19GO c19go = new C19GO(context);
                c19go.LJI(2131840959);
                c19go.LJII = strLJIJJ;
                c19go.LJ(2131840957, new DialogInterfaceOnClickListenerC786020UsS(this, 4), false);
                c19go.LIZJ(2131840958, new DialogInterface.OnClickListener() { // from class: X.0UiH
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        dialogInterface.dismiss();
                    }
                }, false);
                C786410Ut5.M4(c19go.LIZ());
            }
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_live_anchor_pause_confirm_show");
            c474500IjALIZ3.LJJII(LIZJ(), "live_type");
            c474500IjALIZ3.LJIJJLI(this.LL);
            c474500IjALIZ3.LIZ();
            return;
        }
        LIZLLL();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LL = dataChannel;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_pause_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    @Override // X.C0UXZ
    public final void LIZIZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        this.LL = dataChannel;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_pause_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
        View view = c499640Jic.LIZ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS79S0300000_12(this, c499640Jic, dataChannel, 14), view);
        }
    }
}
