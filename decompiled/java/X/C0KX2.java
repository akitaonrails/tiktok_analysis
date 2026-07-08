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
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0KX2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KX2 implements InterfaceC773910UXl {
    public View LL;
    public DataChannel LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 785));
    public final C0KX3 LLILZIL = new AbstractC518790KWf() { // from class: X.0KX3
        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LIZ(C01C1 c01c1) {
            C500260Jjc.LLFFF((View) this.LIZ.LLILZ.getValue());
        }

        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LJ(C01C1 c01c1) {
            if (c01c1.LJI == EnumC1085350eLl.CANCEL) {
                C500260Jjc.LJIILIIL((View) this.LIZ.LLILZ.getValue());
            }
        }
    };

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131841312;
    }

    @Override // X.InterfaceC773910UXl
    public final void onHide() {
    }

    @Override // X.InterfaceC773910UXl
    public final void onShow() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        C01C3.LJ(this.LLILLJJLI, "interaction_panel", "video_live", false, false, false);
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        return (LiveHostSettingsUIConfig.v1() || (!LiveHostSettingsUIConfig.v2() && LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine())) ? R.attr.dv4 : R.attr.da_;
    }

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
        Room room;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C1086960eOM c1086960eOM = C1086960eOM.LL;
            C1086960eOM.LJIJ(room.getId(), this.LLILZIL);
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LLILLJJLI, AFwS237S0000000_7.get$arr$(344), new AwS586S0100000_7(this, 535), AFwS237S0000000_7.get$arr$(345), C497740JfY.LJIJI(2131841312), Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    @Override // X.InterfaceC773910UXl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.view.View r7, androidx.lifecycle.LifecycleOwner r8, com.bytedance.ies.sdk.datachannel.DataChannel r9) {
        /*
            r6 = this;
            r6.LL = r7
            r6.LLILLJJLI = r9
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L84
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r0.mRoomAuthStatus
            if (r0 == 0) goto L84
            com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission r0 = r0.anchorLevelPermission
            if (r0 == 0) goto L84
            X.0UFF r1 = X.C0UFE.Companion
            int r0 = r0.poll
            r1.getClass()
            X.0UFE r1 = X.C0UFF.LIZ(r0)
            X.0UFE r0 = X.C0UFE.ON
            if (r1 == r0) goto L84
            r4 = 0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C162100jj.LIZ(r9)
            if (r0 == 0) goto L4f
            int r1 = r0.cppVersion
            r0 = 2
            if (r1 != r0) goto L4f
            if (r7 == 0) goto L4f
            r0 = 2131395066(0x7f0a81fa, float:1.8410834E38)
            android.view.View r2 = r7.findViewById(r0)
            X.16FV r2 = (X.C16FV) r2
            java.lang.String r1 = "tiktok_live_broadcast_demand_4"
            java.lang.String r0 = "ttlive_ic_cpp_lock_v3.png"
            java.lang.String r1 = X.C1143780fs0.LJIIJ(r1, r0)
            r0 = 0
            X.C1143680frq.LJI(r2, r1, r0, r3)
            X.C786410Ut5.LLJJJJJIL(r2, r5)
        L4f:
            if (r9 == 0) goto L82
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel.class
            java.lang.Object r1 = r9.gg0(r0)
            X.0KX8 r1 = (X.C0KX8) r1
        L59:
            if (r7 == 0) goto L6d
            if (r4 != 0) goto L78
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C162100jj.LIZ(r9)
            if (r0 == 0) goto L78
            int r0 = r0.cppVersion
            if (r0 != r3) goto L78
        L67:
            r0 = 1051595899(0x3eae147b, float:0.34)
        L6a:
            X.C786410Ut5.T4(r7, r0)
        L6d:
            com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L86
            if (r4 != 0) goto L86
            return
        L78:
            if (r1 == 0) goto L7f
            boolean r0 = r1.LIZLLL
            if (r0 != r3) goto L7f
            goto L67
        L7f:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L6a
        L82:
            r1 = 0
            goto L59
        L84:
            r4 = 1
            goto L4f
        L86:
            if (r9 == 0) goto Lb2
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r3 = r9.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r3
            if (r3 == 0) goto Lb2
            X.0eOM r2 = X.C1086960eOM.LL
            long r0 = r3.getId()
            boolean r0 = r2.LJIIIZ(r0)
            if (r0 == 0) goto Lb3
            X.01GW r0 = r6.LLILZ
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C500260Jjc.LLFFF(r0)
        La9:
            long r1 = r3.getId()
            X.0KX3 r0 = r6.LLILZIL
            X.C1086960eOM.LJIILL(r1, r0)
        Lb2:
            return
        Lb3:
            X.01GW r0 = r6.LLILZ
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C500260Jjc.LJIILIIL(r0)
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KX2.LJI(android.view.View, androidx.lifecycle.LifecycleOwner, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    @Override // X.InterfaceC773910UXl
    public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
        onClick(view);
    }
}
