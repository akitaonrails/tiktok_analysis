package X;

import android.widget.FrameLayout;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* JADX INFO: renamed from: X.0crj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028290crj implements InterfaceC1029800cuA {
    public final /* synthetic */ FrameLayout LIZ;
    public final /* synthetic */ C1035340d36 LIZIZ;
    public final /* synthetic */ C1025100cma LIZJ;

    @Override // X.InterfaceC1029800cuA
    public final void LIZ() {
        WebKitView adWebSparkView = this.LIZIZ.getAdWebSparkView();
        if (adWebSparkView != null) {
            adWebSparkView.destroy();
        }
    }

    public final void LIZIZ() {
        FrameLayout frameLayout = this.LIZ;
        if (frameLayout != null) {
            C786410Ut5.LJZ(4, frameLayout);
        }
    }

    @Override // X.InterfaceC1029800cuA
    public final int getProgress() {
        WebKitView adWebSparkView = this.LIZIZ.getAdWebSparkView();
        if (adWebSparkView != null) {
            return adWebSparkView.getProgress();
        }
        return -1;
    }

    @Override // X.InterfaceC1029800cuA
    public final void show() {
        FrameLayout frameLayout = this.LIZ;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        this.LIZIZ.LJJIFFI(this.LIZJ);
    }

    public C1028290crj(FrameLayout frameLayout, C1035340d36 c1035340d36, C1025100cma c1025100cma) {
        this.LIZ = frameLayout;
        this.LIZIZ = c1035340d36;
        this.LIZJ = c1025100cma;
    }
}
