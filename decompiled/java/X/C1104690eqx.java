package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.event.TreasureBoxStatusChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104690eqx implements InterfaceC773910UXl {
    public final LifecycleOwner LL;
    public DataChannel LLILLJJLI;
    public View LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131844585;
    }

    @Override // X.InterfaceC773910UXl
    public final void onHide() {
    }

    public final void LIZJ() {
        Context context;
        Integer numLIZJ;
        Room room;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        Room room2;
        DataChannel dataChannel = this.LLILLJJLI;
        int i = (dataChannel == null || (room2 = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? 0 : room2.cppVersion;
        DataChannel dataChannel2 = this.LLILLJJLI;
        int i2 = (dataChannel2 == null || (room = (Room) dataChannel2.gg0(RoomChannel.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) == null) ? 1 : anchorLevelPermission.treasureBox;
        View view = this.LLILLL;
        if (view != null) {
            LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.jxe);
            TextView textView = (TextView) view.findViewById(R.id.title);
            C16FV c16fv = (C16FV) view.findViewById(R.id.y70);
            if (i == 2 && i2 == 0) {
                View view2 = this.LLILLL;
                if (view2 != null && (context = view2.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                    int iIntValue = numLIZJ.intValue();
                    if (textView != null) {
                        textView.setTextColor(iIntValue);
                    }
                }
                if (c16fv != null) {
                    C786410Ut5.LLJJJJJIL(c16fv, 0);
                    C1143680frq.LJFF(c16fv, "tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v3.png", ImageView.ScaleType.CENTER_CROP, null);
                    return;
                }
                return;
            }
            if (this.LLILZ == 1) {
                if (liveIconView != null) {
                    C786410Ut5.i5(liveIconView, 0.34f);
                }
                if (textView != null) {
                    textView.setTextColor(R.attr.ewz);
                    return;
                }
                return;
            }
            if (liveIconView != null) {
                C786410Ut5.i5(liveIconView, 1.0f);
            }
            if (textView != null) {
                textView.setTextColor(R.attr.ewy);
            }
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void onShow() {
        String str;
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_redpacket_entrance_show");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        if (C0UIM.LIZ()) {
            InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.LLILLJJLI);
            str = (interfaceC1088880eRSMn1 == null || !interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) ? "interaction" : "more_interaction";
        } else {
            str = "more";
        }
        c474500IjALIZ.LJJII(str, "entrance");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        return LiveHostSettingsUIConfig.v1() ? R.attr.e13 : LiveHostSettingsUIConfig.v2() ? R.attr.e14 : LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine() ? R.attr.el5 : R.attr.dhs;
    }

    public C1104690eqx(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        LJFF(view, "more", null, this.LLILLJJLI, this.LLILZLL, this.LLILZ);
    }

    @Override // X.InterfaceC773910UXl
    public final void LJI(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        boolean zBooleanValue;
        Boolean bool;
        this.LLILLJJLI = dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILZLL = zBooleanValue;
        this.LLILLL = view;
        LIZJ();
        if (dataChannel != null) {
            dataChannel.BQ2(this.LL, TreasureBoxStatusChannel.class, new AwS596S0100000_17(this, 274));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166 A[PHI: r2
      0x0166: PHI (r2v2 int) = (r2v1 int), (r2v10 int), (r2v10 int), (r2v10 int) binds: [B:63:0x0162, B:12:0x004f, B:14:0x0055, B:16:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC773910UXl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.view.View r18, java.lang.String r19, java.lang.ref.WeakReference<X.InterfaceC978780bZs> r20, com.bytedance.ies.sdk.datachannel.DataChannel r21, boolean r22, int r23) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1104690eqx.LJFF(android.view.View, java.lang.String, java.lang.ref.WeakReference, com.bytedance.ies.sdk.datachannel.DataChannel, boolean, int):void");
    }
}
