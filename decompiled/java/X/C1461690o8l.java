package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import kotlin.jvm.internal.AwS566S0100000_22;
import nv7.c0;

/* JADX INFO: renamed from: X.0o8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461690o8l implements InterfaceC1456650o0d {
    public final Scene LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1080));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1079));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1078));

    public C1461690o8l(Scene scene) {
        this.LL = scene;
    }

    @Override // X.InterfaceC1456650o0d
    public final void S3(boolean z) {
        int iP2 = c0.LIZ.p2();
        FTCEditCornerViewModel fTCEditCornerViewModel = (FTCEditCornerViewModel) this.LLILZ.getValue();
        if (!z) {
            iP2 = 0;
        }
        fTCEditCornerViewModel.LLLIIL(iP2);
    }

    @Override // X.InterfaceC1456650o0d
    public final void p2(boolean z) {
        int statusBarHeight;
        FTCEditCornerViewModel fTCEditCornerViewModel = (FTCEditCornerViewModel) this.LLILZ.getValue();
        if (z) {
            statusBarHeight = ScreenUtils.getStatusBarHeight(this.LL.requireActivity());
        } else {
            statusBarHeight = 0;
        }
        fTCEditCornerViewModel.Kj(statusBarHeight);
    }

    @Override // X.InterfaceC1456650o0d
    public final void LIZ(int i, int i2) {
        ((FTCEditToolbarViewModel) this.LLILLJJLI.getValue()).Kj(i);
        ((FTCEditToolbarViewModel) this.LLILLJJLI.getValue()).Wb2(i2);
    }
}
