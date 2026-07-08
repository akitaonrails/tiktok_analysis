package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104670eqv implements InterfaceViewOnClickListenerC1102800enu {
    public final DataChannel LL;
    public InterfaceC1103130eoR LLILLJJLI;
    public boolean LLILLL;
    public Room LLILZ;
    public int LLILZIL;

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

    public final void LIZ() {
        Context context;
        Integer numLIZJ;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        Room room = (Room) this.LL.gg0(RoomChannel.class);
        int i = room != null ? room.cppVersion : 0;
        Room room2 = (Room) this.LL.gg0(RoomChannel.class);
        int i2 = (room2 == null || (roomAuthStatus = room2.getRoomAuthStatus()) == null || (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) == null) ? 1 : anchorLevelPermission.treasureBox;
        InterfaceC1103130eoR interfaceC1103130eoR = this.LLILLJJLI;
        if (interfaceC1103130eoR != null) {
            LiveIconView liveIconView = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74);
            TextView textView = (TextView) interfaceC1103130eoR.findViewById(R.id.y7t);
            C16FV c16fv = (C16FV) interfaceC1103130eoR.findViewById(R.id.y70);
            if (this.LLILZIL == 1) {
                if (liveIconView != null) {
                    liveIconView.setIcon(R.drawable.esg);
                }
                if (textView != null) {
                    textView.setTextColor(C497740JfY.LJFF(R.color.f571dc));
                    return;
                }
                return;
            }
            if (i != 2 || i2 != 0) {
                if (liveIconView != null) {
                    liveIconView.setIcon(R.drawable.esg);
                }
                if (textView != null) {
                    textView.setTextColor(C497740JfY.LJFF(R.color.da));
                    return;
                }
                return;
            }
            InterfaceC1103130eoR interfaceC1103130eoR2 = this.LLILLJJLI;
            if (interfaceC1103130eoR2 != null && (context = interfaceC1103130eoR2.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                int iIntValue = numLIZJ.intValue();
                if (liveIconView != null) {
                    liveIconView.setIcon(R.drawable.esg);
                }
                if (textView != null) {
                    textView.setTextColor(iIntValue);
                }
            }
            if (c16fv != null) {
                C786410Ut5.LLJJJJJIL(c16fv, 0);
                C1143680frq.LJFF(c16fv, "tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v3.png", ImageView.ScaleType.CENTER_CROP, null);
            }
        }
    }

    public C1104670eqv(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[PHI: r2
      0x0096: PHI (r2v12 long) = (r2v6 long), (r2v15 long), (r2v15 long) binds: [B:23:0x006c, B:25:0x008e, B:27:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1104670eqv.onClick(android.view.View):void");
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        String str;
        Room room;
        Boolean bool;
        this.LLILLJJLI = interfaceC1103130eoR;
        LIZ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_redpacket_entrance_show");
        c474500IjALIZ.LJIJJLI(this.LL);
        boolean zBooleanValue = false;
        if (C0UIM.LIZ()) {
            InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.LL);
            if (interfaceC1088880eRSMn1 != null && interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) {
                str = "more_interaction";
            } else {
                str = "interaction";
            }
        } else {
            str = "more";
        }
        c474500IjALIZ.LJJII(str, "entrance");
        c474500IjALIZ.LIZ();
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.LLILLL = zBooleanValue;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILZ = room;
    }
}
