package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.event.TreasureBoxStatusChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104700eqy implements InterfaceC773910UXl {
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
        return 2131853075;
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
            if (this.LLILZ == 1) {
                if (liveIconView != null) {
                    C786410Ut5.i5(liveIconView, 0.34f);
                }
                if (textView != null) {
                    textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ewz, textView.getContext()));
                    return;
                }
                return;
            }
            if (i != 2 || i2 != 0) {
                if (liveIconView != null) {
                    C786410Ut5.i5(liveIconView, 1.0f);
                }
                if (textView != null) {
                    textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, textView.getContext()));
                    return;
                }
                return;
            }
            View view2 = this.LLILLL;
            if (view2 != null && (context = view2.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ezq, context)) != null) {
                int iIntValue = numLIZJ.intValue();
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
        return LiveHostSettingsUIConfig.v2() ? R.attr.egk : R.attr.egj;
    }

    public C1104700eqy(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        LJFF(view, "more", null, this.LLILLJJLI, this.LLILZLL, this.LLILZ);
    }

    @Override // X.InterfaceC773910UXl
    public final void LJI(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        boolean zBooleanValue;
        View viewFindViewById;
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
            dataChannel.BQ2(this.LL, TreasureBoxStatusChannel.class, new AwS596S0100000_17(this, 277));
        }
        C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_SUPER_FAN_TREASURE_BOX;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.t16);
        } else {
            viewFindViewById = null;
        }
        RedDotExtensionKt.LJI(viewFindViewById, lifecycleOwner, null, c0ux6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f A[PHI: r2
      0x017f: PHI (r2v2 int) = (r2v1 int), (r2v8 int), (r2v8 int), (r2v8 int) binds: [B:68:0x017b, B:12:0x004f, B:14:0x0055, B:16:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC773910UXl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.view.View r20, java.lang.String r21, java.lang.ref.WeakReference<X.InterfaceC978780bZs> r22, com.bytedance.ies.sdk.datachannel.DataChannel r23, boolean r24, int r25) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1104700eqy.LJFF(android.view.View, java.lang.String, java.lang.ref.WeakReference, com.bytedance.ies.sdk.datachannel.DataChannel, boolean, int):void");
    }
}
