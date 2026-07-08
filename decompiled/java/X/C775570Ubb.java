package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ubb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775570Ubb extends AbstractC775560Uba implements InterfaceViewOnClickListenerC1102800enu {
    public String LLILLL;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean dj() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    @Override // X.AbstractC775560Uba
    public final String LIZ() {
        return this.LLILLL;
    }

    public C775570Ubb(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        this.LLILLL = "streaming_manually";
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        C773830UXd c773830UXd;
        String str;
        if (dataChannel == null || (c773830UXd = (C773830UXd) dataChannel.gg0(C0UXK.class)) == null) {
            c773830UXd = new C773830UXd("");
        }
        if (Intrinsics.LJFF(c773830UXd.LIZ, "NOISE_SUPPRESSION")) {
            str = "live_capsule";
        } else {
            str = "streaming_manually";
        }
        this.LLILLL = str;
        C1813280xHq.LIZ(this, AbstractC775560Uba.LIZIZ(), this.LL);
        LIZJ((C20743716Ff) interfaceC1103130eoR.getContentView().findViewById(R.id.pav));
        AbstractC775560Uba.LIZIZ().vQ2(C775550UbZ.LIZ);
        if (LiveHostSettingsUIConfig.enable()) {
            LiveIconView liveIconView = (LiveIconView) interfaceC1103130eoR.getContentView().findViewById(R.id.y74);
            if (liveIconView != null) {
                ViewGroup.LayoutParams layoutParams = liveIconView.getLayoutParams();
                if (layoutParams != null) {
                    float f = 20;
                    layoutParams.width = (int) C497740JfY.LIZIZ(f);
                    layoutParams.height = (int) C497740JfY.LIZIZ(f);
                } else {
                    layoutParams = null;
                }
                C786410Ut5.w6(liveIconView, layoutParams);
                liveIconView.setIconAttr(R.attr.enl);
                liveIconView.setIconWidthRatio(1.0f);
                liveIconView.setIconHeightRatio(1.0f);
            }
            View viewFindViewById = interfaceC1103130eoR.getContentView().findViewById(R.id.pat);
            if (viewFindViewById != null) {
                C500260Jjc.LJIILIIL(viewFindViewById);
            }
        }
    }
}
