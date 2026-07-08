package X;

import android.content.res.Resources;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS66S0200000_29;
import irm.AkS95S0100000_29;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.129X, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C129X extends RecyclerView.ViewHolder implements InterfaceC379610EuV {
    public static final C129T LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C1DRG LL;
    public final AnonymousClass1297 LLILLJJLI;
    public final C1664740tQG LLILLL;
    public final RelativeLayout LLILZ;
    public final FrameLayout LLILZIL;
    public final SmartImageView LLILZLL;
    public final C12P4 LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final View LLJ;
    public final TuxTextView LLJI;
    public final TuxIconView LLJIJIL;
    public final TuxTextView LLJILJIL;
    public final TuxIconView LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public VideoMusicModel LLJJI;
    public int LLJJIII;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.129T] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C129X.class, "videoPlayerComponent", "getVideoPlayerComponent()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/player/VideoPlayerComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJI = new Object() { // from class: X.129T
        };
    }

    public final void I5() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int screenWidth = ScreenUtils.getScreenWidth(this.itemView.getContext());
        if (screenWidth == this.LLJJIII) {
            return;
        }
        this.LLJJIII = screenWidth;
        int iLIZIZ = (screenWidth - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))) / 2;
        this.LLJILLL = iLIZIZ;
        this.LLJJ = (iLIZIZ * 224) / 173;
        RelativeLayout relativeLayout = this.LLILZ;
        if (relativeLayout != null && (layoutParams2 = relativeLayout.getLayoutParams()) != null) {
            layoutParams2.width = this.LLJILLL;
            layoutParams2.height = this.LLJJ;
            RelativeLayout relativeLayout2 = this.LLILZ;
            if (relativeLayout2 != null) {
                C786410Ut5.e6(relativeLayout2, layoutParams2);
            }
        }
        RelativeLayout relativeLayout3 = this.LLILZ;
        if (relativeLayout3 != null) {
            relativeLayout3.setOutlineProvider(new C0MRE(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
            relativeLayout3.setClipToOutline(true);
        }
        C12P4 c12p4 = this.LLIZ;
        if (c12p4 == null || (layoutParams = c12p4.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = (int) (((double) this.LLJJ) * 0.25d);
        C12P4 c12p42 = this.LLIZ;
        if (c12p42 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12p42);
            c12p42.setLayoutParams(layoutParams);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public final void N5(boolean z) {
        Integer numValueOf = Integer.valueOf(R.attr.zl);
        if (z) {
            TuxIconView tuxIconView = this.LLJILJILJ;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_spinner_normal;
                c419910GdJ.LJ = numValueOf;
                tuxIconView.setTuxIcon(c419910GdJ);
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.fc);
                    if (animationLoadAnimation != null) {
                        animationLoadAnimation.setInterpolator(new LinearInterpolator());
                        tuxIconView.startAnimation(animationLoadAnimation);
                        return;
                    }
                    return;
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLJILJILJ;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_play_fill;
            c419910GdJ2.LJ = numValueOf;
            tuxIconView2.setTuxIcon(c419910GdJ2);
            tuxIconView2.clearAnimation();
        }
    }

    public final void P5(boolean z) {
        InterfaceC1484830ok5 interfaceC1484830ok5LIZIZ;
        VideoMusicModel videoMusicModel;
        Aweme aweme;
        Video video;
        VideoPlayerComponent videoPlayerComponent;
        final InterfaceC1484830ok5 interfaceC1484830ok5LIZIZ2;
        VideoUrlModel h264PlayAddr;
        String urlKey;
        List<String> urlList;
        if (z) {
            if (this.LLILZIL != null && (videoMusicModel = this.LLJJI) != null && (aweme = videoMusicModel.getAweme()) != null && (video = aweme.getVideo()) != null && (videoPlayerComponent = (VideoPlayerComponent) this.LLILLL.getValue(this, LLJJIJIIJIL[0])) != null && (interfaceC1484830ok5LIZIZ2 = videoPlayerComponent.LIZIZ()) != null) {
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                if (video.checkVideo(video.getPlayAddr())) {
                    h264PlayAddr = video.getPlayAddr();
                } else {
                    h264PlayAddr = video.getH264PlayAddr();
                }
                C1482580ogS c1482580ogS = new C1482580ogS();
                c1482580ogS.LIZ = aid;
                C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
                if (h264PlayAddr != null) {
                    urlKey = h264PlayAddr.getUrlKey();
                } else {
                    urlKey = null;
                }
                c1058540deW.LIZIZ = urlKey;
                if (h264PlayAddr == null || (urlList = h264PlayAddr.getUrlList()) == null) {
                    urlList = C13BV.INSTANCE;
                }
                c1058540deW.LIZLLL = urlList;
                c1058540deW.LIZ();
                interfaceC1484830ok5LIZIZ2.LIZJ(new InterfaceC1483820oiS() { // from class: X.129W
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
                        return this.LL.LLILZIL;
                    }
                });
                L5(this.LLILZIL, video);
                interfaceC1484830ok5LIZIZ2.LJ(new C1484680ojq(c1482580ogS).LIZ());
                interfaceC1484830ok5LIZIZ2.setLoop(true);
                interfaceC1484830ok5LIZIZ2.LJIIZILJ(new InterfaceC1482530ogN() { // from class: X.129Y
                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void Au(Surface surface) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void VK() {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void W1(String str) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onBuffering(String str, boolean z2, C1480430ocz c1480430ocz) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onCompleteLoaded(String str, boolean z2) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onDecoderBuffering(String str, boolean z2, C1480430ocz c1480430ocz) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onLoopPlay(String str, int i) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPlayCompleted(String str, int i) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPlayPause(String str) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPlayPrepare(String str) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPlayPrepared(String str) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPlayRelease(String str) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
                    }

                    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
                    public final /* synthetic */ void onPreRenderReady(String str) {
                        C490850JMt.LIZ(this, str);
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onSeekEnd(String str, boolean z2) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onSpeedChanged(String str, float f) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onStopPlay(String str) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onVideoSecondFrame(String str) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final /* synthetic */ void uv(JSONObject jSONObject) {
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                        String aid2;
                        interfaceC1484830ok5LIZIZ2.LJJIIZ(this);
                        VideoMusicModel videoMusicModel2 = this.LLJJI;
                        if (videoMusicModel2 != null) {
                            Aweme aweme2 = videoMusicModel2.getAweme();
                            if (aweme2 != null) {
                                aid2 = aweme2.getAid();
                            } else {
                                aid2 = null;
                            }
                            if (Intrinsics.LJFF(aid2, str)) {
                                int adapterPosition = 0;
                                this.N5(false);
                                this.R5(true);
                                C129X c129x = this;
                                AnonymousClass1297 anonymousClass1297 = c129x.LLILLJJLI;
                                VideoMusicModel videoMusicModel3 = c129x.LLJJI;
                                if (c129x.getBindingAdapter() != null) {
                                    adapterPosition = this.getAdapterPosition();
                                }
                                anonymousClass1297.LJIIJJI(videoMusicModel3, adapterPosition);
                            }
                        }
                    }

                    @Override // X.InterfaceC1482530ogN
                    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                        String aid2;
                        interfaceC1484830ok5LIZIZ2.LJJIIZ(this);
                        VideoMusicModel videoMusicModel2 = this.LLJJI;
                        if (videoMusicModel2 != null) {
                            Aweme aweme2 = videoMusicModel2.getAweme();
                            if (aweme2 != null) {
                                aid2 = aweme2.getAid();
                            } else {
                                aid2 = null;
                            }
                            if (Intrinsics.LJFF(aid2, str)) {
                                this.N5(false);
                                this.R5(false);
                                C129X c129x = this;
                                c129x.LLILLJJLI.LJIILJJIL(c129x.LLJJI);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        VideoPlayerComponent videoPlayerComponent2 = (VideoPlayerComponent) this.LLILLL.getValue(this, LLJJIJIIJIL[0]);
        if (videoPlayerComponent2 != null && (interfaceC1484830ok5LIZIZ = videoPlayerComponent2.LIZIZ()) != null) {
            interfaceC1484830ok5LIZIZ.stop();
        }
        N5(false);
        R5(false);
    }

    public final void R5(boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            i = 0;
            i2 = 8;
        } else {
            i = 8;
        }
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
        }
        TuxTextView tuxTextView = this.LLJILJIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        TuxTextView tuxTextView2 = this.LLIZLLLIL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, i2);
        }
        View view = this.LLJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(i2, view);
        }
        TuxTextView tuxTextView3 = this.LLJI;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, i2);
        }
        SmartImageView smartImageView = this.LLILZLL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(i2, smartImageView);
        }
        TuxIconView tuxIconView2 = this.LLJILJILJ;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, i2);
        }
    }

    public final void L5(FrameLayout frameLayout, Video video) {
        TextureView textureView;
        FrameLayout.LayoutParams layoutParams;
        if (frameLayout == null || frameLayout.getChildCount() == 0) {
            return;
        }
        View childAt = frameLayout.getChildAt(0);
        if ((childAt instanceof TextureView) && (textureView = (TextureView) childAt) != null) {
            ViewGroup.LayoutParams layoutParams2 = textureView.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                if (video.getWidth() > 0 && video.getHeight() > 0) {
                    Pair pairLIZ = C425050Glb.LIZ(video.getWidth(), video.getHeight(), this.LLJILLL, this.LLJJ);
                    layoutParams.width = ((Number) pairLIZ.getFirst()).intValue();
                    layoutParams.height = ((Number) pairLIZ.getSecond()).intValue();
                } else {
                    layoutParams.width = this.LLJILLL;
                    layoutParams.height = this.LLJJ;
                }
                layoutParams.gravity = 17;
                C786410Ut5.V5(textureView, layoutParams);
            }
        }
    }

    public C129X(C1DRG c1drg, View view, AnonymousClass1297 anonymousClass1297) {
        super(view);
        this.LL = c1drg;
        this.LLILLJJLI = anonymousClass1297;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, VideoPlayerComponent.class, null);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.df9);
        this.LLILZ = relativeLayout;
        this.LLILZIL = (FrameLayout) view.findViewById(R.id.video_container);
        this.LLILZLL = (SmartImageView) view.findViewById(R.id.ld7);
        this.LLIZ = (C12P4) view.findViewById(R.id.o1o);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.zjf);
        this.LLJ = view.findViewById(R.id.fz3);
        this.LLJI = (TuxTextView) view.findViewById(R.id.tv_posts);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.le3);
        this.LLJIJIL = tuxIconView;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_use);
        this.LLJILJIL = tuxTextView;
        this.LLJILJILJ = (TuxIconView) view.findViewById(R.id.lr1);
        I5();
        N5(false);
        R5(false);
        if (relativeLayout != null) {
            C786410Ut5.I7(new AkS95S0100000_29(this, 96), relativeLayout);
        }
        if (tuxIconView != null) {
            C786410Ut5.I7(new AkS66S0200000_29(this, view, 12), tuxIconView);
        }
        if (tuxTextView != null) {
            C786410Ut5.I7(new AkS95S0100000_29(this, 97), tuxTextView);
        }
    }
}
