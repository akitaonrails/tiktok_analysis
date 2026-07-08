package X;

import android.view.Surface;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.livereplay.ECVideoPlaybackController;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0vpZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757310vpZ implements InterfaceC1483820oiS {
    public final /* synthetic */ ECVideoPlaybackController LL;

    @Override // X.InterfaceC1483820oiS
    public final boolean bn() {
        return true;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ Surface getSurface() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void hj() {
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void pe() {
    }

    @Override // X.InterfaceC1483820oiS
    public final HashMap getParams() {
        return new HashMap();
    }

    @Override // X.InterfaceC1483820oiS
    public final FrameLayout getPlayViewContainer() {
        return this.LL.LL;
    }

    public C1757310vpZ(ECVideoPlaybackController eCVideoPlaybackController) {
        this.LL = eCVideoPlaybackController;
    }
}
