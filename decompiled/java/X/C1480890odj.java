package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;

/* JADX INFO: renamed from: X.0odj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480890odj implements InterfaceC1473950oSX {
    public final /* synthetic */ VideoViewComponent LL;

    @Override // X.InterfaceC1473950oSX
    public final void LLF(int i, int i2) {
    }

    @Override // X.InterfaceC1473950oSX
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC1473950oSX
    public final void LIZ() {
        if (this.LL.LLILLL.LJIILL() == 1) {
            this.LL.LLILLJJLI.LJJIL(null);
        }
    }

    public C1480890odj(VideoViewComponent videoViewComponent) {
        this.LL = videoViewComponent;
    }

    @Override // X.InterfaceC1473950oSX
    public final void LLILLIZIL(int i, int i2) {
        if (this.LL.LLILLL.LJIILL() == 1 && this.LL.LLILLL.LJIJI()) {
            this.LL.LLILLL.LJIIL();
        }
        VideoViewComponent videoViewComponent = this.LL;
        if (videoViewComponent.LLIZLLLIL) {
            videoViewComponent.LLIZLLLIL = false;
            videoViewComponent.LJII(videoViewComponent.LLILZIL, videoViewComponent.LLJ);
        }
    }
}
