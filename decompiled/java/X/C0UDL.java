package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.KaraokeTriggerEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorWidgetLazyInit;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UDL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UDL implements InterfaceC773910UXl {
    public DataChannel LL;
    public boolean LLILLJJLI;
    public View LLILLL;

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131840648;
    }

    @Override // X.InterfaceC773910UXl
    public final void onHide() {
    }

    public final void LIZLLL() {
        DataChannel dataChannel;
        if (LiveAnchorWidgetLazyInit.INSTANCE.enable() && (dataChannel = this.LL) != null) {
            dataChannel.LC0(KaraokeTriggerEvent.class, Boolean.TRUE);
        }
        InterfaceC765730U1z karaokeModule = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getKaraokeModule();
        if (karaokeModule != null) {
            ((C765720U1y) karaokeModule).LIZIZ(this.LL, false);
        }
        LIZJ(true);
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(DismissToolbarPopEvent.class);
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void onShow() {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        HashMap map = new HashMap();
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).RA0(map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_show");
        c474500IjALIZ.LJIJJLI(this.LL);
        c474500IjALIZ.LJJIIZI(map);
        View view = this.LLILLL;
        c474500IjALIZ.LJJII(Intrinsics.LIZLLL(view != null ? Float.valueOf(view.getAlpha()) : null, 1.0f) ? "clickable" : "unclickable", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        return (LiveHostSettingsUIConfig.v1() || (!LiveHostSettingsUIConfig.v2() && LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine())) ? R.attr.e3z : R.attr.dcc;
    }

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
    }

    public final void LIZJ(boolean z) {
        String str;
        HashMap map = new HashMap();
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).RA0(map);
        if (z) {
            str = "clickable";
        } else {
            str = "unclickable";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_click");
        c474500IjALIZ.LJIJJLI(this.LL);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LL, AFwS245S0000000_12.get$arr$(227), new AwS591S0100000_12(this, 1122), AFwS245S0000000_12.get$arr$(228), C497740JfY.LJIJI(2131840648), Boolean.TRUE);
    }

    @Override // X.InterfaceC773910UXl
    public final void LJI(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LL = dataChannel;
        this.LLILLL = view;
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(null, AFwS245S0000000_12.get$arr$(226), new AwS221S0300000_12(view, this, lifecycleOwner, 27), null, null, null);
    }

    @Override // X.InterfaceC773910UXl
    public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
        onClick(view);
    }
}
