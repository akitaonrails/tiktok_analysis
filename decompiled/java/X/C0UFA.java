package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.dataChannel.TurnOnVisualRelatedFunctionEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBackgroundPhase2;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectBackgroundCoexistSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UFA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UFA extends C0UDO {
    public final LifecycleOwner LL;
    public DataChannel LLILLJJLI;
    public View LLILLL;
    public final long LLILZ;
    public boolean LLILZIL;
    public final C768950UEj LLILZLL;

    @Override // X.C0UDO, X.InterfaceViewOnClickListenerC1102800enu
    public final boolean dj() {
        return (!C781270Ukn.LJIILJJIL().o1() || C781270Ukn.LJIILJJIL().rl2(C924810aAp.LJ().LJIILJJIL)) && this.LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0UEj] */
    public C0UFA(LifecycleOwner lifecycleOwner) {
        long id;
        this.LL = lifecycleOwner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LLILZ = id;
        this.LLILZIL = true;
        this.LLILZLL = new InterfaceC767730U9r() { // from class: X.0UEj
            @Override // X.InterfaceC767730U9r
            public final void LJIIL(LiveEffect liveEffect) {
            }

            @Override // X.InterfaceC767730U9r
            public final int LJIILIIL(String str, String str2) {
                return -1;
            }

            @Override // X.InterfaceC767730U9r
            public final int LJIILLIIL(String str, String str2) {
                return -1;
            }

            @Override // X.InterfaceC767730U9r
            public final void LJIIZILJ(String str, String str2) {
            }

            @Override // X.InterfaceC767730U9r
            public final void onDestroy() {
                InterfaceC768930UEh interfaceC768930UEh;
                DataChannel dataChannel = this.LIZ.LLILLJJLI;
                if (dataChannel != null && (interfaceC768930UEh = (InterfaceC768930UEh) dataChannel.gg0(C0UA3.class)) != null) {
                    interfaceC768930UEh.onDestroy();
                }
                C781270Ukn.LJI().getLiveGoalEffectHelper().getClass();
                C0UFI.LJIIIZ = null;
                C0UFI.LJIIJ = null;
            }

            @Override // X.InterfaceC767730U9r
            public final void LJ(String str) {
                InterfaceC768930UEh interfaceC768930UEh;
                DataChannel dataChannel = this.LIZ.LLILLJJLI;
                if (dataChannel != null && (interfaceC768930UEh = (InterfaceC768930UEh) dataChannel.gg0(C0UA3.class)) != null) {
                    interfaceC768930UEh.LJ(str);
                }
            }

            @Override // X.InterfaceC767730U9r
            public final void LJFF(LiveEffect liveEffect) {
                InterfaceC768930UEh interfaceC768930UEh;
                DataChannel dataChannel = this.LIZ.LLILLJJLI;
                if (dataChannel != null && (interfaceC768930UEh = (InterfaceC768930UEh) dataChannel.gg0(C0UA3.class)) != null) {
                    if (interfaceC768930UEh.LJIIIIZZ(liveEffect)) {
                        interfaceC768930UEh.LJFF(liveEffect);
                    } else {
                        interfaceC768930UEh.LIZJ();
                    }
                }
                DataChannel dataChannel2 = this.LIZ.LLILLJJLI;
                if (dataChannel2 != null) {
                    dataChannel2.SX0(C768940UEi.class, Boolean.valueOf(((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).usingSlideGestureEffect()));
                }
                C1276840jKc c1276840jKc = C1276840jKc.LIZ;
                String strValueOf = String.valueOf(liveEffect.getEffectId());
                c1276840jKc.getClass();
                C1276840jKc.LJIIL(strValueOf);
                C1276840jKc.LJIILL(liveEffect.getResourceId());
                C1276840jKc.LJIIJ(liveEffect, false);
            }

            @Override // X.InterfaceC767730U9r
            public final void LJIIJJI(String str) {
                InterfaceC768930UEh interfaceC768930UEh;
                DataChannel dataChannel = this.LIZ.LLILLJJLI;
                if (dataChannel != null && (interfaceC768930UEh = (InterfaceC768930UEh) dataChannel.gg0(C0UA3.class)) != null) {
                    interfaceC768930UEh.LJI(null, str);
                }
            }

            @Override // X.InterfaceC767730U9r
            public final void LJIILJJIL(LiveEffect liveEffect) {
                InterfaceC768930UEh interfaceC768930UEh;
                DataChannel dataChannel = this.LIZ.LLILLJJLI;
                if (dataChannel != null && (interfaceC768930UEh = (InterfaceC768930UEh) dataChannel.gg0(C0UA3.class)) != null && interfaceC768930UEh.LJIIIIZZ(liveEffect)) {
                    interfaceC768930UEh.LIZJ();
                }
                DataChannel dataChannel2 = this.LIZ.LLILLJJLI;
                if (dataChannel2 != null) {
                    dataChannel2.SX0(C768940UEi.class, Boolean.valueOf(((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).usingSlideGestureEffect()));
                }
                C1276840jKc.LIZ.getClass();
                C1276840jKc.LJIIL("");
                C1276840jKc.LJIILL("");
                C1276840jKc.LJIIJ(liveEffect, true);
            }

            @Override // X.InterfaceC767730U9r
            public final void LJIILL(ViewGroup viewGroup) {
                InterfaceC768930UEh interfaceC768930UEh;
                DataChannel dataChannel = this.LIZ.LLILLJJLI;
                if (dataChannel != null && (interfaceC768930UEh = (InterfaceC768930UEh) dataChannel.gg0(C0UA3.class)) != null) {
                    interfaceC768930UEh.LJIIIZ(viewGroup, false);
                }
            }
        };
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        if (LiveBroadcastBackgroundPhase2.enable()) {
            C781270Ukn.LJ().openBackgroundPanelDialog(this.LLILLJJLI, view.getContext(), false);
            return;
        }
        AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(119);
        if (!C781270Ukn.LJIILJJIL().rl2(C924810aAp.LJ().LJIILJJIL) && C781270Ukn.LJIILJJIL().o1()) {
            return;
        }
        C753070TgP.LIZJ(this.LLILLJJLI, aFwS245S0000000_12, new AwS378S0200000_12(this, view, 48), AFwS245S0000000_12.get$arr$(118), C497740JfY.LJIJI(2131842511), Boolean.FALSE);
    }

    @Override // X.C0UDO, X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        AnchorLevelPermission anchorLevelPermission;
        RoomAuthStatus roomAuthStatus;
        super.WH(interfaceC1103130eoR, dataChannel);
        this.LLILLJJLI = dataChannel;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null) {
            anchorLevelPermission = roomAuthStatus.anchorLevelPermission;
        } else {
            anchorLevelPermission = null;
        }
        if (LiveLOP0OptSetting.INSTANCE.enable() && anchorLevelPermission != null && anchorLevelPermission.liveBackground == C0UFE.OFF.getValue()) {
            return;
        }
        View viewFindViewById = interfaceC1103130eoR.findViewById(R.id.y7r);
        this.LLILLL = viewFindViewById;
        RedDotExtensionKt.LJI(viewFindViewById, this.LL, null, C0UX6.LIVE_BROADCAST_ENHANCE_BACKGROUND, new AwS591S0100000_12(dataChannel, 734));
        if (LiveEffectBackgroundCoexistSetting.INSTANCE.enable()) {
            C781270Ukn.LJI().getLiveGoalEffectHelper();
            if (C0UFI.LJIIIIZZ()) {
                interfaceC1103130eoR.setAlpha(0.34f);
            } else {
                interfaceC1103130eoR.setAlpha(1.0f);
            }
            C0U6C liveGoalEffectHelper = C781270Ukn.LJI().getLiveGoalEffectHelper();
            AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(interfaceC1103130eoR, 724);
            AwS556S0100000_12 awS556S0100000_122 = new AwS556S0100000_12(interfaceC1103130eoR, 725);
            liveGoalEffectHelper.getClass();
            C0UFI.LJIIIZ = awS556S0100000_12;
            C0UFI.LJIIJ = awS556S0100000_122;
        }
        if (!C781270Ukn.LJIILJJIL().rl2(C924810aAp.LJ().LJIILJJIL) && C781270Ukn.LJIILJJIL().o1()) {
            interfaceC1103130eoR.setAlpha(0.34f);
        }
        if (dataChannel != null) {
            dataChannel.BQ2(this.LL, TurnOnVisualRelatedFunctionEvent.class, new AwS591S0100000_12(interfaceC1103130eoR, 735));
        }
    }
}
