package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.api.LivePreviewGuestLayoutZoomOutFinish;
import com.bytedance.android.live.broadcast.api.ResetLivePreviewSurfaceViewLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixSurfaceViewResumeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0ZyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917080ZyM extends AbstractC939360aYI {
    public final ViewGroup LLILZ;
    public final ViewGroup LLILZIL;
    public final DataChannel LLILZLL;

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void onDetach() {
        super.onDetach();
        if (C940770aaZ.LIZ().getDataSource().getPanelLayoutType() != 1 || BugFixSurfaceViewResumeSetting.INSTANCE.isEnable()) {
            return;
        }
        this.LLILZLL.FQ2(ResetLivePreviewSurfaceViewLayout.class);
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
        super.LJIJ(interfaceC940060aZQ);
        this.LLILZLL.BQ2(this, LivePreviewGuestLayoutZoomOutFinish.class, new AwS594S0100000_15(this, 941));
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIL(C942080acg c942080acg) {
        if (BugFixSurfaceViewResumeSetting.INSTANCE.isEnable() && C940770aaZ.LIZ().getDataSource().getPanelLayoutType() == 1) {
            this.LLILZLL.FQ2(ResetLivePreviewSurfaceViewLayout.class);
        }
        for (C957020b0m c957020b0m : c942080acg.LIZ.LIZLLL) {
            if (c957020b0m.LLJIJIL) {
                ViewParent parent = c957020b0m.getParent();
                if (!(parent instanceof FrameLayout)) {
                    parent = null;
                }
                C0UPW.LIZJ = new WeakReference<>(parent);
            }
        }
    }

    public C917080ZyM(ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel) {
        this.LLILZ = viewGroup;
        this.LLILZIL = viewGroup2;
        this.LLILZLL = dataChannel;
    }
}
