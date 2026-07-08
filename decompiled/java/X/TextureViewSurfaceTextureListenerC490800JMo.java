package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class TextureViewSurfaceTextureListenerC490800JMo implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C490810JMp LL;
    public final /* synthetic */ C0JO7 LLILLJJLI;
    public final /* synthetic */ Video LLILLL;
    public final /* synthetic */ int LLILZ = 0;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC490800JMo(C490810JMp c490810JMp, C0JO7 c0jo7, Video video) {
        this.LL = c490810JMp;
        this.LLILLJJLI = c0jo7;
        this.LLILLL = video;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        String currentSourceID;
        C490810JMp c490810JMp = this.LL;
        C0JO7 c0jo7 = this.LLILLJJLI;
        Video video = this.LLILLL;
        int i3 = this.LLILZ;
        C0JO7 c0jo72 = c490810JMp.LL;
        if (c0jo72 != null) {
            currentSourceID = c0jo72.getCurrentSourceID();
        } else {
            currentSourceID = null;
        }
        if (Intrinsics.LJFF(currentSourceID, c0jo7.getCurrentSourceID())) {
            c490810JMp.LJI(surfaceTexture, c0jo7, video, i3, false);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        C1479720obq c1479720obq = new C1479720obq();
        C1479530obX c1479530obX = c1479720obq.LIZ;
        c1479530obX.LJJIJLIJ = true;
        c1479530obX.LJIILJJIL = surface;
        c1479530obX.LJJJLL = true;
        c1479720obq.LIZ.LIZLLL = C1481230oeH.LJI(video);
        boolean zIsNeedSetCookie = video.isNeedSetCookie();
        C1479530obX c1479530obX2 = c1479720obq.LIZ;
        c1479530obX2.LJIL = zIsNeedSetCookie;
        c1479530obX2.LJIIJ = true;
        C1479530obX c1479530obXLIZ = c1479720obq.LIZ();
        C0N0Y c0n0yLIZLLL = c490810JMp.LIZLLL(c0jo7.getCurrentSourceID());
        if (c0n0yLIZLLL == null) {
            return;
        }
        C490750JMj.LJ(c0n0yLIZLLL, c490810JMp.LLILZ, new C490790JMn(c1479530obXLIZ, null));
    }
}
