package X;

import android.view.View;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0KWZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KWZ implements InterfaceC773910UXl, InterfaceC1086820eO8 {
    public DataChannel LL;
    public View LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 783));

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131843888;
    }

    @Override // X.InterfaceC773910UXl
    public final void onHide() {
    }

    @Override // X.InterfaceC1086820eO8
    public final void LIZLLL() {
        C500260Jjc.LJIILIIL((View) this.LLILZ.getValue());
        C1086800eO6.LIZIZ(this);
    }

    @Override // X.InterfaceC773910UXl
    public final void onShow() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        C1086790eO5.LJIIIIZZ();
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        return (LiveHostSettingsUIConfig.v1() || (!LiveHostSettingsUIConfig.v2() && LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine())) ? R.attr.d2h : R.attr.d7s;
    }

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
        C1086800eO6.LIZIZ(this);
    }

    @Override // X.InterfaceC1086820eO8
    public final void LJJI(long j) {
        C500260Jjc.LLFFF((View) this.LLILZ.getValue());
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LL, AFwS237S0000000_7.get$arr$(342), new AwS586S0100000_7(this, 534), AFwS237S0000000_7.get$arr$(343), C497740JfY.LJIJI(2131843888), Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // X.InterfaceC773910UXl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.view.View r7, androidx.lifecycle.LifecycleOwner r8, com.bytedance.ies.sdk.datachannel.DataChannel r9) {
        /*
            r6 = this;
            r6.LL = r9
            r6.LLILLJJLI = r7
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L58
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r0.mRoomAuthStatus
            if (r0 == 0) goto L58
            com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission r0 = r0.anchorLevelPermission
            if (r0 == 0) goto L58
            X.0UFF r1 = X.C0UFE.Companion
            int r0 = r0.poll
            r1.getClass()
            X.0UFE r1 = X.C0UFF.LIZ(r0)
            X.0UFE r0 = X.C0UFE.ON
            if (r1 == r0) goto L58
            r4 = 0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C162100jj.LIZ(r9)
            if (r0 == 0) goto L59
            int r1 = r0.cppVersion
            r0 = 2
            if (r1 != r0) goto L59
            if (r7 == 0) goto L59
            r0 = 2131395066(0x7f0a81fa, float:1.8410834E38)
            android.view.View r2 = r7.findViewById(r0)
            X.16FV r2 = (X.C16FV) r2
            java.lang.String r1 = "tiktok_live_broadcast_demand_4"
            java.lang.String r0 = "ttlive_ic_cpp_lock_v3.png"
            java.lang.String r1 = X.C1143780fs0.LJIIJ(r1, r0)
            r0 = 0
            X.C1143680frq.LJI(r2, r1, r0, r3)
            X.C786410Ut5.LLJJJJJIL(r2, r5)
            com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L59
            return
        L58:
            r4 = 1
        L59:
            if (r9 == 0) goto La3
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel.class
            java.lang.Object r1 = r9.gg0(r0)
            X.0KX8 r1 = (X.C0KX8) r1
        L63:
            if (r4 != 0) goto L94
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C162100jj.LIZ(r9)
            if (r0 == 0) goto L94
            int r0 = r0.cppVersion
            if (r0 != r3) goto L94
        L6f:
            if (r7 == 0) goto L77
            r0 = 1051595899(0x3eae147b, float:0.34)
            X.C786410Ut5.T4(r7, r0)
        L77:
            boolean r0 = X.C1086830eO9.LIZJ()
            if (r0 != 0) goto L83
            boolean r0 = X.C1086830eO9.LIZLLL()
            if (r0 == 0) goto L8e
        L83:
            X.01GW r0 = r6.LLILZ
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C500260Jjc.LLFFF(r0)
        L8e:
            java.util.HashSet<X.0eO8> r0 = X.C1086800eO6.LJFF
            r0.add(r6)
            return
        L94:
            if (r1 == 0) goto L9b
            boolean r0 = r1.LIZLLL
            if (r0 != r3) goto L9b
            goto L6f
        L9b:
            if (r7 == 0) goto L77
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.T4(r7, r0)
            goto L77
        La3:
            r1 = 0
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KWZ.LJI(android.view.View, androidx.lifecycle.LifecycleOwner, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    @Override // X.InterfaceC773910UXl
    public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
        onClick(view);
    }
}
