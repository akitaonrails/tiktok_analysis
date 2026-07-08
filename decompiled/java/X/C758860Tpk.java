package X;

import Y.ACListenerS116S0200000_12;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.viewmodule.ToolbarDonationBehavior$onLoadForLiveHostSettings$1;
import com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDonationOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Tpk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758860Tpk implements InterfaceViewOnClickListenerC1102800enu, C0UXZ {
    public final LifecycleOwner LL;
    public InterfaceC1103130eoR LLILLJJLI;
    public View LLILLL;
    public boolean LLILZ;
    public DataChannel LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

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
    public final boolean dj() {
        return !this.LLILZLL;
    }

    public C758860Tpk(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    public final void LIZ(Context context) {
        String string;
        Room room;
        String string2;
        Room room2;
        String str;
        if (this.LLILZLL) {
            C766270U4b.LJFF(2131844170, context);
        } else {
            LiveDonationOptSetting liveDonationOptSetting = LiveDonationOptSetting.INSTANCE;
            if (!liveDonationOptSetting.enable() && this.LLIZ) {
                C766270U4b.LJFF(2131844050, context);
            } else if (liveDonationOptSetting.enable() && this.LLIZLLLIL) {
                C766270U4b.LJFF(2131824891, context);
            } else {
                IDonationStickerOuterService iDonationStickerOuterService = (IDonationStickerOuterService) C1161920gLG.LIZJ(IDonationStickerOuterService.class);
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("enable_simplified_live_donation", "1");
                DataChannel dataChannel = this.LLILZIL;
                String str2 = "";
                if (dataChannel == null || (room2 = (Room) dataChannel.gg0(RoomChannel.class)) == null || (string = Long.valueOf(room2.getId()).toString()) == null) {
                    string = "";
                }
                pairArr[1] = new Pair("item_id_str", string);
                DataChannel dataChannel2 = this.LLILZIL;
                if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null && (string2 = Long.valueOf(room.getId()).toString()) != null) {
                    str2 = string2;
                }
                pairArr[2] = new Pair("item_id", str2);
                iDonationStickerOuterService.Mo2(context, 1, C2097608Jq.LJIIIIZZ(pairArr));
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_donation_click");
        c474500IjALIZ.LJIJJLI(this.LLILZIL);
        c474500IjALIZ.LJIILJJIL("live_take_detail");
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).enableDonationPercentService()) {
            str = "percent";
        } else {
            str = "tiltify";
        }
        c474500IjALIZ.LJJII(str, "powered_by");
        c474500IjALIZ.LIZ();
    }

    public final void LIZJ(DataChannel dataChannel) {
        String str;
        this.LLILZIL = dataChannel;
        LIZLLL(this.LLILZ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_donation_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIILJJIL("live_take_detail");
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).enableDonationPercentService()) {
            str = "percent";
        } else {
            str = "tiltify";
        }
        c474500IjALIZ.LJJII(str, "powered_by");
        c474500IjALIZ.LIZ();
    }

    public final void LIZLLL(boolean z) {
        int i;
        this.LLILZ = z;
        InterfaceC1103130eoR interfaceC1103130eoR = this.LLILLJJLI;
        int i2 = 8;
        if (interfaceC1103130eoR != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            interfaceC1103130eoR.setVisibility(i);
        }
        View view = this.LLILLL;
        if (view != null) {
            if (!z) {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LIZ(view.getContext());
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILLJJLI = interfaceC1103130eoR;
        LIZJ(dataChannel);
    }

    @Override // X.C0UXZ
    public final void LIZIZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        View view = c499640Jic.LIZ;
        this.LLILLL = view;
        C500260Jjc.LLFFF(view);
        LIZJ(dataChannel);
        lifecycleOwner.getLifecycle().addObserver(new ToolbarDonationBehavior$onLoadForLiveHostSettings$1(this, dataChannel));
        View view2 = this.LLILLL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS116S0200000_12(this, dataChannel, 46), view2);
        }
    }
}
