package X;

import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.OpenLowAgeDialogEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.List;
import webcast.data.RechargeCustomError;

/* JADX INFO: renamed from: X.0etv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106530etv implements InterfaceViewOnClickListenerC1102800enu {
    public final DataChannel LL;
    public LiveIconView LLILLJJLI;
    public final IGiftService LLILLL = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
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

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
        C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_demand_11", "ttlive_icon_gift_full_color.png");
        C786410Ut5.i5(this.LLILLJJLI, 0.5f);
    }

    public C1106530etv(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Room room;
        boolean zBooleanValue;
        DataChannel dataChannel = this.LL;
        boolean z = false;
        if (dataChannel != null) {
            zBooleanValue = ((Boolean) dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue();
            room = (Room) this.LL.gg0(RoomChannel.class);
        } else {
            room = null;
            zBooleanValue = false;
        }
        if (zBooleanValue && room != null && room.getOwner() != null && room.getOwner().getSecret() == 1) {
            C766270U4b.LIZLLL(2131855412);
            return;
        }
        if (C1129070fUH.LIZIZ(this.LL)) {
            C1129070fUH.LIZLLL(C1388190mED.LIZ(view.getContext()), this.LL);
            return;
        }
        if (room == null) {
            return;
        }
        if (!room.getRoomAuthStatus().isEnableGift() && this.LL != null) {
            C20441214yg.LIZIZ("FGW", "Transaction banned, show custom error");
            RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
            if (roomAuthStatus == null) {
                return;
            }
            RechargeCustomError rechargeCustomError = roomAuthStatus.customErrorForGiftSetting;
            if (rechargeCustomError != null) {
                try {
                    Gson gson = C19748512Ol.LIZIZ;
                    ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().mO0(view.getContext(), (CustomErrorExtra) gson.LJII(gson.LJIILL(rechargeCustomError), CustomErrorExtra.class), rechargeCustomError.errCode, Boolean.TRUE);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJ("FGW", e.getMessage());
                }
            }
        }
        if (this.LLILLL.isNewsAccount(this.LL)) {
            this.LLILLL.showGiftBannedPopup(view.getContext(), false);
            return;
        }
        if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().isEnableGift()) {
            z = true;
        }
        if (C1118280fCs.LIZ(zBooleanValue, true, z) == EnumC1118290fCt.TOAST) {
            if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().getRoomAuthOffReasons() != null && room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() != null) {
                C766270U4b.LJIIJJI(room.getRoomAuthStatus().getRoomAuthOffReasons().getGift());
                DataChannel dataChannel2 = this.LL;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(LogGiftCloseToastShowEvent.class, Boolean.TRUE);
                    return;
                }
                return;
            }
            return;
        }
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.FQ2(OpenLowAgeDialogEvent.class);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        View viewFindViewById = interfaceC1103130eoR.findViewById(R.id.y7t);
        if (viewFindViewById != null) {
            C786410Ut5.T4(viewFindViewById, 0.5f);
        }
        View viewFindViewById2 = interfaceC1103130eoR.findViewById(R.id.y7s);
        if (viewFindViewById2 != null) {
            C786410Ut5.T4(viewFindViewById2, 0.3f);
        }
        this.LLILLJJLI = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74);
        C20441214yg.LIZIZ("ToolbarDummyGiftBehavior", "onLoad, iconView = $iconView");
        int i = C1103050eoJ.LIZ[C1102950eo9.LIZIZ(dataChannel).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (this.LLILLJJLI != null && Boolean.FALSE.equals(dataChannel.gg0(C0TZM.class))) {
                            C786410Ut5.i5(this.LLILLJJLI, 1.0f);
                            this.LLILLJJLI.setIcon(R.drawable.eud);
                        }
                        if (this.LLILLJJLI != null && Boolean.FALSE.equals(dataChannel.gg0(C780690Ujr.class))) {
                            C786410Ut5.i5(this.LLILLJJLI, 1.0f);
                            this.LLILLJJLI.setIcon(R.drawable.eud);
                        }
                    }
                } else {
                    List list = (List) dataChannel.gg0(C1102520enS.class);
                    if (list != null && list.contains(EnumC1102740eno.DUMMY_GIFT)) {
                        C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_demand_11", "ttlive_icon_gift_full_color.png");
                        C786410Ut5.i5(this.LLILLJJLI, 0.5f);
                    } else {
                        C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_demand_11", "ttlive_icon_gift_gray.png");
                        C786410Ut5.i5(this.LLILLJJLI, 0.5f);
                    }
                }
            } else {
                C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_demand_11", "ttlive_icon_gift_full_color.png");
                C786410Ut5.i5(this.LLILLJJLI, 0.5f);
            }
        } else {
            C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_demand_11", "ttlive_icon_gift_gray.png");
            C786410Ut5.i5(this.LLILLJJLI, 0.5f);
        }
        C1080370eDj.LIZ((Room) this.LL.gg0(RoomChannel.class), this.LL);
    }
}
