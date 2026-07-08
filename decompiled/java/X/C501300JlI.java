package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartDialogV2;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0JlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501300JlI implements InterfaceC773910UXl {
    public View LL;
    public DataChannel LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131841392;
    }

    @Override // X.InterfaceC773910UXl
    public final void onHide() {
    }

    public final void LIZJ() {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        if (C0JFQ.LIZ(this.LLILLJJLI)) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel == null || (fragmentManager2 = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
                return;
            } else {
                C19322110iZ.LJFF(fragmentManager2, C0JFL.LIZ(false, false), "draw_and_guess", null, 0);
            }
        } else {
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (dataChannel2 == null || (fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class)) == null) {
                return;
            } else {
                C19322110iZ.LJFF(fragmentManager, new DrawGuessStartDialogV2(), "draw_and_guess", null, 0);
            }
        }
        DataChannel dataChannel3 = this.LLILLJJLI;
        if (dataChannel3 != null) {
            dataChannel3.FQ2(DismissToolbarPopEvent.class);
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void onShow() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_entrance_show");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        C0JFO.LIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        return LiveHostSettingsUIConfig.v1() ? R.attr.e08 : LiveHostSettingsUIConfig.v2() ? R.attr.e09 : LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine() ? R.attr.dvr : R.attr.daa;
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        InterfaceC941720ac6 interfaceC941720ac6LI = ((ILinkMicInteractAbilityService) C1161920gLG.LIZJ(ILinkMicInteractAbilityService.class)).LI();
        Boolean boolValueOf = null;
        if (interfaceC941720ac6LI != null) {
            boolValueOf = Boolean.valueOf(interfaceC941720ac6LI.LIZJ("draw_guess", new AwS551S0100000_7(this, 786), null));
        }
        C500260Jjc.LJJIFFI(boolValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
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
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L81
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r0.mRoomAuthStatus
            if (r0 == 0) goto L81
            com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission r0 = r0.anchorLevelPermission
            if (r0 == 0) goto L81
            X.0UFF r1 = X.C0UFE.Companion
            int r0 = r0.pictionary
            r1.getClass()
            X.0UFE r1 = X.C0UFF.LIZ(r0)
            X.0UFE r0 = X.C0UFE.OFF
            if (r1 != r0) goto L81
            r4 = 1
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
            if (r9 == 0) goto L7f
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel.class
            java.lang.Object r1 = r9.gg0(r0)
            X.0KX8 r1 = (X.C0KX8) r1
        L59:
            if (r4 == 0) goto L78
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C162100jj.LIZ(r9)
            if (r0 == 0) goto L78
            int r0 = r0.cppVersion
            if (r0 != r3) goto L78
        L65:
            if (r7 == 0) goto L6d
            r0 = 1051595899(0x3eae147b, float:0.34)
            X.C786410Ut5.T4(r7, r0)
        L6d:
            com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L83
            if (r4 == 0) goto L83
            return
        L78:
            if (r1 == 0) goto L6d
            boolean r0 = r1.LIZ
            if (r0 != r3) goto L6d
            goto L65
        L7f:
            r1 = 0
            goto L59
        L81:
            r4 = 0
            goto L4f
        L83:
            X.C488910JFh.LIZ(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C501300JlI.LJI(android.view.View, androidx.lifecycle.LifecycleOwner, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    @Override // X.InterfaceC773910UXl
    public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
        onClick(view);
    }
}
