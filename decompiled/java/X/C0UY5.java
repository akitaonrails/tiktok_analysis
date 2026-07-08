package X;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UY5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UY5 implements InterfaceC773910UXl {
    public View LL;
    public DataChannel LLILLJJLI;
    public LifecycleOwner LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131842036;
    }

    @Override // X.InterfaceC773910UXl
    public final void onHide() {
    }

    @Override // X.InterfaceC773910UXl
    public final void onShow() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        C1104600eqo.LIZJ(this.LLILLJJLI);
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        return LiveHostSettingsUIConfig.v1() ? R.attr.e0c : LiveHostSettingsUIConfig.v2() ? R.attr.e0d : LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine() ? R.attr.dta : R.attr.d_r;
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        LJFF(view, "more", null, this.LLILLJJLI, this.LLILZIL, 0);
    }

    @Override // X.InterfaceC773910UXl
    public final void LJI(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        boolean zBooleanValue;
        int i;
        int i2;
        Room room;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        Room room2;
        Boolean bool;
        this.LLILLJJLI = dataChannel;
        this.LL = view;
        this.LLILLL = lifecycleOwner;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILZIL = zBooleanValue;
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && (room2 = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            i = room2.cppVersion;
        } else {
            i = 0;
        }
        DataChannel dataChannel3 = this.LLILLJJLI;
        if (dataChannel3 != null && (room = (Room) dataChannel3.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
            i2 = anchorLevelPermission.goodyBag;
        } else {
            i2 = 1;
        }
        View view2 = this.LL;
        if (view2 != null) {
            C16FV c16fv = (C16FV) view2.findViewById(R.id.y70);
            if (i == 2) {
                if (i2 == 0 && c16fv != null) {
                    C786410Ut5.LLJJJJJIL(c16fv, 0);
                    C1143680frq.LJFF(c16fv, "tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v3.png", ImageView.ScaleType.CENTER_CROP, null);
                    return;
                }
                return;
            }
            if (i == 2) {
                return;
            }
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(null, AFwS245S0000000_12.get$arr$(181), new AwS591S0100000_12(this, 956), null, null, null);
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
        C1104600eqo.LIZIZ(dataChannel);
        if (C500260Jjc.LJJJIL(dataChannel)) {
            C0U4R c0u4r = new C0U4R();
            c0u4r.LJII = dataChannel;
            c0u4r.LIZJ = "pm_liveTryMode_tryModePage_goodyBagToast";
            c0u4r.LIZLLL = 2131842613;
            c0u4r.LJFF = true;
            C766270U4b.LJIIJ(c0u4r);
            return;
        }
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(179);
        AwS378S0200000_12 awS378S0200000_12 = new AwS378S0200000_12(dataChannel, str, weakReference, 82);
        AFwS245S0000000_12 aFwS245S0000000_122 = AFwS245S0000000_12.get$arr$(180);
        String strLJIJI = C497740JfY.LJIJI(2131842036);
        Boolean bool = Boolean.TRUE;
        iBroadcastService.disableFunctionAccordingLevel(dataChannel, aFwS245S0000000_12, awS378S0200000_12, aFwS245S0000000_122, strLJIJI, bool, weakReference, bool);
    }
}
