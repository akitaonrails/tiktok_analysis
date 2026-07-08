package X;

import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ATA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ATA {
    public final View LIZ;
    public final C1ATH LIZIZ;
    public final Function0<Unit> LIZJ;
    public VideoViewComponent LIZLLL;
    public RemoteImageView LJ;
    public C1ATF LJFF;
    public final C586920N0g LJI = new C586920N0g();
    public boolean LJII;
    public Aweme LJIIIIZZ;
    public boolean LJIIIZ;

    public final void LIZ() {
        C1911410zq7.LIZ("WelcomeVideoViewHolder", "on pause");
        this.LJII = false;
        int i = this.LJI.LIZ;
        if (i == 1 || i == 2 || i == 4) {
            C1ATF c1atf = this.LJFF;
            if (c1atf == null) {
                c1atf = null;
            }
            c1atf.LIZ.pause();
            this.LJI.LIZ = 3;
        }
    }

    public final void LIZIZ() {
        C1911410zq7.LIZ("WelcomeVideoViewHolder", "on resume");
        this.LJII = false;
        int i = this.LJI.LIZ;
        if (i == 0) {
            C1911410zq7.LIZ("WelcomeVideoViewHolder", "resume to start");
            LIZJ();
            return;
        }
        if (i != 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resume else ");
            sbLIZ.append(this.LJI.LIZ);
            C1911410zq7.LIZ("WelcomeVideoViewHolder", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1911410zq7.LIZ("WelcomeVideoViewHolder", "real resume");
        C1ATF c1atf = this.LJFF;
        if (c1atf == null) {
            c1atf = null;
        }
        c1atf.getClass();
        C1911410zq7.LIZ("WelcomeVideoViewHolder", "player resume");
        if (c1atf.LIZJ != null) {
            c1atf.LIZ.LIZ(c1atf.LIZIZ);
            c1atf.LIZ.LJIIL(c1atf.LIZJ.getVideo());
        } else {
            C1911410zq7.LIZ("WelcomeVideoViewHolder", "player resume return");
        }
        this.LJI.LIZ = 4;
    }

    public final void LIZJ() {
        C1911410zq7.LIZ("WelcomeVideoViewHolder", "on start");
        VideoViewComponent videoViewComponent = this.LIZLLL;
        if (videoViewComponent == null) {
            videoViewComponent = null;
        }
        if (!videoViewComponent.LLILLL.Da()) {
            C1911410zq7.LIZ("WelcomeVideoViewHolder", "pending start");
            this.LJII = true;
            return;
        }
        int i = this.LJI.LIZ;
        if (i != 0) {
            if (i == 3) {
                C1911410zq7.LIZ("WelcomeVideoViewHolder", "start to resume");
                LIZIZ();
                return;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start else ");
                sbLIZ.append(this.LJI.LIZ);
                C1911410zq7.LIZ("WelcomeVideoViewHolder", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        C1911410zq7.LIZ("WelcomeVideoViewHolder", "real start");
        C1ATF c1atf = this.LJFF;
        C1ATF c1atf2 = c1atf != null ? c1atf : null;
        c1atf2.getClass();
        C1911410zq7.LIZ("WelcomeVideoViewHolder", "player start");
        if (c1atf2.LIZJ != null) {
            c1atf2.LIZ.LIZ(c1atf2.LIZIZ);
            c1atf2.LIZ.LJII(c1atf2.LIZJ.getVideo(), C0C64.LJIILLIIL().LJIJ(31744, 0, "decoder_type", true));
            c1atf2.LIZ.LJIIJ();
        } else {
            C1911410zq7.LIZ("WelcomeVideoViewHolder", "player start return");
        }
        this.LJII = false;
        this.LJI.LIZ = 2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1ATB] */
    public C1ATA(View view, WelcomeVideoWidget welcomeVideoWidget, final boolean z, Function0 function0) {
        this.LIZ = view;
        this.LIZIZ = welcomeVideoWidget;
        this.LIZJ = function0;
        ?? r3 = new C583590Muj() { // from class: X.1ATB
            @Override // X.C583590Muj, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompletedFirstTime(String str) {
            }

            @Override // X.C583590Muj, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str) {
                this.LL.LIZIZ.aw(str);
            }

            @Override // X.C583590Muj, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(C1481290oeN c1481290oeN) {
                C1911410zq7.LIZ("WelcomeVideoViewHolder", "onPlayFailed:");
                RemoteImageView remoteImageView = this.LL.LJ;
                if (remoteImageView == null) {
                    remoteImageView = null;
                }
                C786410Ut5.l(remoteImageView, 0);
            }

            @Override // X.C583590Muj, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(float f) {
                if (!C1893760zNe.LIZ(C1388190mED.LIZ(this.LL.LIZ.getContext()), false)) {
                    C1ATA c1ata = this.LL;
                    if (c1ata.LJI.LIZ != 3) {
                        c1ata.LIZ();
                    }
                }
                if (z) {
                    this.LL.getClass();
                    if (f >= 85.0f) {
                        C1ATF c1atf = this.LL.LJFF;
                        if (c1atf == null) {
                            c1atf = null;
                        }
                        c1atf.LIZ.LJIIIZ(90.0f);
                        this.LL.LIZIZ.aw(null);
                        this.LL.LIZ();
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                C1911410zq7.LIZ("WelcomeVideoViewHolder", "onRenderFirstFrame:");
            }

            @Override // X.C583590Muj, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderReady(C1480430ocz c1480430ocz) {
                C1911410zq7.LIZ("WelcomeVideoViewHolder", "onRenderReady:");
                C1ATA c1ata = this.LL;
                RemoteImageView remoteImageView = c1ata.LJ;
                if (remoteImageView == null) {
                    remoteImageView = null;
                }
                C786410Ut5.l(remoteImageView, 8);
                Function0<Unit> function02 = c1ata.LIZJ;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // X.C583590Muj, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str) {
                C1911410zq7.LIZ("WelcomeVideoViewHolder", "onResumePlay:");
                C1ATA c1ata = this.LL;
                RemoteImageView remoteImageView = c1ata.LJ;
                if (remoteImageView == null) {
                    remoteImageView = null;
                }
                C786410Ut5.l(remoteImageView, 8);
                Function0<Unit> function02 = c1ata.LIZJ;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        };
        VideoViewComponent videoViewComponent = new VideoViewComponent(0);
        this.LIZLLL = videoViewComponent;
        videoViewComponent.LIZIZ((ViewGroup) view);
        VideoViewComponent videoViewComponent2 = this.LIZLLL;
        (videoViewComponent2 == null ? null : videoViewComponent2).LLILLL.Dn(new InterfaceC1473950oSX() { // from class: X.1ATE
            @Override // X.InterfaceC1473950oSX
            public final void LIZ() {
            }

            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void LLF(int i, int i2) {
            }

            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // X.InterfaceC1473950oSX
            public final void LLILLIZIL(int i, int i2) {
                C1911410zq7.LIZ("WelcomeVideoViewHolder", "surface available");
                C1ATA c1ata = this.LL;
                if (c1ata.LJII) {
                    c1ata.LJII = false;
                    C1911410zq7.LIZ("WelcomeVideoViewHolder", "surface start");
                    this.LL.LIZJ();
                }
            }
        });
        VideoViewComponent videoViewComponent3 = this.LIZLLL;
        this.LJFF = new C1ATF(videoViewComponent3 != null ? videoViewComponent3 : null, r3);
        this.LJ = (RemoteImageView) view.findViewById(R.id.cover);
        view.setTag(this);
    }
}
