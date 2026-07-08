package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0h3D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189170h3D {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public VideoViewComponent LIZLLL;
    public long LJ;
    public long LJFF;
    public volatile boolean LJI;
    public volatile Video LJII;
    public volatile boolean LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public volatile boolean LJIIJ;
    public volatile boolean LJIIL;
    public volatile float LJIIJJI = -1.0f;
    public final C1189180h3E LJIILIIL = new C583590Muj() { // from class: X.0h3E
        @Override // X.C583590Muj, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompleted(String str) {
            C1189170h3D c1189170h3D = this.LL;
            if (c1189170h3D.LJFF <= 0 && c1189170h3D.LJI) {
                this.LL.LIZJ.invoke();
                this.LL.LIZIZ.invoke();
            }
        }

        @Override // X.C583590Muj, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayProgressChange(float f) {
            String aid;
            VideoViewComponent videoViewComponent = this.LL.LIZLLL;
            if (videoViewComponent != null) {
                long jLJ = videoViewComponent.LJ();
                if (jLJ <= 0 || this.LL.LJIIJJI == f) {
                    return;
                }
                this.LL.LJIIJJI = f;
                if (!this.LL.LJIIIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPlayProgressChange firstFrame fallback: aid=");
                    Video video = this.LL.LJII;
                    if (video != null) {
                        aid = video.getAid();
                    } else {
                        aid = null;
                    }
                    sbLIZ.append(aid);
                    sbLIZ.append(", progress=");
                    sbLIZ.append(f);
                    sbLIZ.append(", isPlaying=");
                    sbLIZ.append(this.LL.LJI);
                    C2188811AlT.LIZIZ(sbLIZ);
                    this.LL.LJIIIIZZ = true;
                    this.LL.LJIIIZ = true;
                    if (this.LL.LJI) {
                        this.LL.LIZ.invoke();
                        this.LL.LIZIZ.invoke();
                    }
                }
                long j = (long) ((f * jLJ) / 100);
                C1189170h3D c1189170h3D = this.LL;
                long j2 = c1189170h3D.LJFF;
                if (1 <= j2 && j2 <= j) {
                    if (!c1189170h3D.LJIIL) {
                        this.LL.LJIIL = true;
                        if (this.LL.LJI) {
                            this.LL.LIZJ.invoke();
                        }
                        this.LL.LIZIZ();
                        if (this.LL.LJI) {
                            this.LL.LIZIZ.invoke();
                            return;
                        }
                        return;
                    }
                    return;
                }
                c1189170h3D.LJIIL = false;
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
            String aid;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRenderFirstFrame: aid=");
            Video video = this.LL.LJII;
            if (video != null) {
                aid = video.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append(", hasRendered=");
            sbLIZ.append(this.LL.LJIIIIZZ);
            sbLIZ.append(", isPlaying=");
            sbLIZ.append(this.LL.LJI);
            C2188811AlT.LIZIZ(sbLIZ);
            boolean z = !this.LL.LJIIIZ;
            this.LL.LJIIIIZZ = true;
            this.LL.LJIIIZ = true;
            if (this.LL.LJI) {
                this.LL.LIZ.invoke();
                if (z) {
                    this.LL.LIZIZ.invoke();
                }
            }
            this.LL.LIZIZ();
        }
    };

    public final void LIZ() {
        VideoViewComponent videoViewComponent = this.LIZLLL;
        if (videoViewComponent != null) {
            videoViewComponent.H1(this.LJIILIIL);
        }
        VideoViewComponent videoViewComponent2 = this.LIZLLL;
        if (videoViewComponent2 != null) {
            videoViewComponent2.LIZ(this.LJIILIIL);
        }
        VideoViewComponent videoViewComponent3 = this.LIZLLL;
        if (videoViewComponent3 != null) {
            videoViewComponent3.LJI();
        }
        VideoViewComponent videoViewComponent4 = this.LIZLLL;
        if (videoViewComponent4 != null) {
            videoViewComponent4.LJII(this.LJII, C0C64.LJIILLIIL().LJIJ(31744, 0, "decoder_type", true));
        }
        VideoViewComponent videoViewComponent5 = this.LIZLLL;
        if (videoViewComponent5 != null) {
            videoViewComponent5.LJIIJ();
        }
    }

    public final void LIZIZ() {
        VideoViewComponent videoViewComponent = this.LIZLLL;
        if (videoViewComponent != null) {
            long jLJ = videoViewComponent.LJ();
            if (jLJ > 0) {
                float f = (this.LJ / jLJ) * 100;
                VideoViewComponent videoViewComponent2 = this.LIZLLL;
                if (videoViewComponent2 != null) {
                    videoViewComponent2.LJIIIZ(f);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0h3E] */
    public C1189170h3D(C1473870oSP c1473870oSP, AwS562S0100000_18 awS562S0100000_18, AwS562S0100000_18 awS562S0100000_182, AwS562S0100000_18 awS562S0100000_183) {
        C1482640ogY c1482640ogY;
        this.LIZ = awS562S0100000_18;
        this.LIZIZ = awS562S0100000_182;
        this.LIZJ = awS562S0100000_183;
        VideoViewComponent videoViewComponent = new VideoViewComponent(0);
        this.LIZLLL = videoViewComponent;
        videoViewComponent.LJIILJJIL(c1473870oSP);
        VideoViewComponent videoViewComponent2 = this.LIZLLL;
        if (videoViewComponent2 != null && (c1482640ogY = videoViewComponent2.LLILLL) != null) {
            c1482640ogY.Dn(new InterfaceC1473950oSX() { // from class: X.0h3C
                @Override // X.InterfaceC1473950oSX
                public final /* synthetic */ void LLF(int i, int i2) {
                }

                @Override // X.InterfaceC1473950oSX
                public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // X.InterfaceC1473950oSX
                public final void LIZ() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSurfaceDestroyed: isPlaying=");
                    sbLIZ.append(this.LL.LJI);
                    sbLIZ.append(", hasRendered=");
                    sbLIZ.append(this.LL.LJIIIIZZ);
                    sbLIZ.append(", aid=");
                    Video video = this.LL.LJII;
                    sbLIZ.append(video != null ? video.getAid() : null);
                    C2188811AlT.LIZIZ(sbLIZ);
                    this.LL.LJIIIIZZ = false;
                    this.LL.LJIIIZ = false;
                    C1189170h3D c1189170h3D = this.LL;
                    c1189170h3D.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("stop(): aid=");
                    Video video2 = c1189170h3D.LJII;
                    sbLIZ2.append(video2 != null ? video2.getAid() : null);
                    sbLIZ2.append(", isPlaying=");
                    sbLIZ2.append(c1189170h3D.LJI);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c1189170h3D.LJI = false;
                    c1189170h3D.LJIIJ = false;
                    VideoViewComponent videoViewComponent3 = c1189170h3D.LIZLLL;
                    if (videoViewComponent3 != null) {
                        videoViewComponent3.LJIIJJI();
                    }
                    VideoViewComponent videoViewComponent4 = c1189170h3D.LIZLLL;
                    if (videoViewComponent4 != null) {
                        videoViewComponent4.release();
                    }
                    VideoViewComponent videoViewComponent5 = c1189170h3D.LIZLLL;
                    if (videoViewComponent5 != null) {
                        videoViewComponent5.H1(c1189170h3D.LJIILIIL);
                    }
                }

                @Override // X.InterfaceC1473950oSX
                public final void LLILLIZIL(int i, int i2) {
                    String aid;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSurfaceAvailable: isPending=");
                    sbLIZ.append(this.LL.LJIIJ);
                    sbLIZ.append(", isPlaying=");
                    sbLIZ.append(this.LL.LJI);
                    sbLIZ.append(", hasRendered=");
                    sbLIZ.append(this.LL.LJIIIIZZ);
                    sbLIZ.append(", aid=");
                    Video video = this.LL.LJII;
                    if (video != null) {
                        aid = video.getAid();
                    } else {
                        aid = null;
                    }
                    sbLIZ.append(aid);
                    C2188811AlT.LIZIZ(sbLIZ);
                    this.LL.LJIIIIZZ = false;
                    if (this.LL.LJIIJ && this.LL.LJII != null && this.LL.LJI) {
                        this.LL.LIZ();
                    }
                }
            });
        }
        this.LJIIJ = false;
        this.LJIIIZ = false;
    }
}
