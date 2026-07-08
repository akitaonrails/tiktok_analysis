package X;

import android.view.View;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0KWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518840KWk implements InterfaceC773910UXl, InterfaceC1086820eO8 {
    public View LL;
    public DataChannel LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 782));
    public final C518850KWl LLILZLL = new AbstractC518790KWf() { // from class: X.0KWl
        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LIZ(C01C1 c01c1) {
            C500260Jjc.LLFFF(this.LIZ.LIZJ());
        }

        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LJ(C01C1 c01c1) {
            if (c01c1.LJI == EnumC1085350eLl.CANCEL) {
                C500260Jjc.LJIILIIL(this.LIZ.LIZJ());
            }
        }
    };

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131852592;
    }

    @Override // X.InterfaceC773910UXl
    public final void onHide() {
    }

    public final View LIZJ() {
        return (View) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC773910UXl
    public final void onShow() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
    }

    @Override // X.InterfaceC1086820eO8
    public final void LIZLLL() {
        C500260Jjc.LJIILIIL(LIZJ());
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        return LiveHostSettingsUIConfig.v1() ? R.attr.dv4 : LiveHostSettingsUIConfig.v2() ? R.attr.da_ : LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine() ? R.attr.d2h : R.attr.d7s;
    }

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
        Room room;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C1086960eOM c1086960eOM = C1086960eOM.LL;
            C1086960eOM.LJIJ(room.getId(), this.LLILZLL);
        }
        C1086800eO6.LIZIZ(this);
    }

    @Override // X.InterfaceC1086820eO8
    public final void LJJI(long j) {
        C500260Jjc.LLFFF(LIZJ());
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        String str;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || (str = (String) dataChannel.gg0(C753250Tgh.class)) == null) {
            str = "other";
        }
        C0KWU.LIZJ(dataChannel, str);
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LLILLJJLI, AFwS237S0000000_7.get$arr$(339), new AwS373S0200000_7(view, this, 82), AFwS237S0000000_7.get$arr$(340), C497740JfY.LJIJI(2131852592), Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    @Override // X.InterfaceC773910UXl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.view.View r7, androidx.lifecycle.LifecycleOwner r8, com.bytedance.ies.sdk.datachannel.DataChannel r9) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C518840KWk.LJI(android.view.View, androidx.lifecycle.LifecycleOwner, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    @Override // X.InterfaceC773910UXl
    public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
        onClick(view);
    }
}
