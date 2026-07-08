package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0JlR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501390JlR implements InterfaceC773910UXl {
    public final boolean LL;
    public DataChannel LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131842482;
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
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        return LiveHostSettingsUIConfig.v1() ? R.attr.clw : LiveHostSettingsUIConfig.v2() ? R.attr.clx : LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine() ? R.attr.cmk : R.attr.cml;
    }

    public C501390JlR(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
            C766270U4b.LIZLLL(2131842491);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toast_msg_show");
            c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
            c474500IjALIZ.LJJII("pm_liveAiWallpaper_onboardingPage_halfSheet_toast", "msg_id");
            c474500IjALIZ.LIZ();
            return;
        }
        Room roomLIZ = C162100jj.LIZ(this.LLILLJJLI);
        if (roomLIZ != null && !roomLIZ.hasMultiLivePermissionAnchorSide()) {
            C766270U4b.LIZLLL(2131853187);
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_toast_msg_show");
            c474500IjALIZ2.LJIJJLI(this.LLILLJJLI);
            c474500IjALIZ2.LJJII("pm_liveAiWallpaper_onboardingPage_halfSheet_toast", "msg_id");
            c474500IjALIZ2.LIZ();
            return;
        }
        InterfaceC941720ac6 interfaceC941720ac6LI = ((ILinkMicInteractAbilityService) C1161920gLG.LIZJ(ILinkMicInteractAbilityService.class)).LI();
        Boolean boolValueOf = null;
        if (interfaceC941720ac6LI != null) {
            boolValueOf = Boolean.valueOf(interfaceC941720ac6LI.LIZJ("aigc", new AwS551S0100000_7(this, 784), null));
        }
        C500260Jjc.LJJIFFI(boolValueOf);
    }

    @Override // X.InterfaceC773910UXl
    public final void LJI(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        Room roomLIZ;
        View viewFindViewById;
        this.LLILLJJLI = dataChannel;
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9() || ((roomLIZ = C162100jj.LIZ(dataChannel)) != null && !roomLIZ.hasMultiLivePermissionAnchorSide())) {
            if (view != null) {
                C786410Ut5.T4(view, 0.34f);
            }
        } else if (view != null && (viewFindViewById = view.findViewById(R.id.t16)) != null) {
            RedDotExtensionKt.LJI(viewFindViewById, lifecycleOwner, null, C0UX6.AIGC_WALLPAPER_REDDOT, null);
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
        onClick(view);
    }
}
