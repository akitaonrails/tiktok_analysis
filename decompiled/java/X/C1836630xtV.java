package X;

import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS606S0100000_27;
import org.json.JSONObject;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.0xtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836630xtV {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final Function1<Long, Unit> LIZ;
    public boolean LIZIZ;
    public C1838930xxD LIZJ;
    public LiveFragmentDetail LIZLLL;
    public LiveFragmentDetail LJ;
    public C1836620xtU LJFF;
    public InterfaceC1484830ok5 LJI;
    public final C830490Whz<String, C1836640xtW> LJII = new C830490Whz<>();

    public C1836630xtV(AwS606S0100000_27 awS606S0100000_27) {
        this.LIZ = awS606S0100000_27;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0xtU] */
    public final void LIZLLL(final C1838930xxD c1838930xxD, final LiveFragmentDetail liveFragmentDetail) {
        int i;
        long j;
        long j2;
        InterfaceC1484830ok5 interfaceC1484830ok5;
        InterfaceC1484830ok5 interfaceC1484830ok52;
        C1836620xtU c1836620xtU = this.LJFF;
        if (c1836620xtU != null && (interfaceC1484830ok52 = this.LJI) != null) {
            interfaceC1484830ok52.LJJIIZ(c1836620xtU);
        }
        this.LJFF = new InterfaceC1482530ogN() { // from class: X.0xtU
            public long LL;

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
            public final /* synthetic */ void onBufferedPercent(String str, long j3, int i2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedTimeMs(String str, long j3) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onFrameAboutToBeRendered(int i2, long j3, long j4, Map map) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
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
            public final /* synthetic */ void onPlayRelease(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
            public final /* synthetic */ void onPreRenderReady(String str) {
                C490850JMt.LIZ(this, str);
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreRenderSessionMissed(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekEnd(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekStart(String str, int i2, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSpeedChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSecondFrame(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void uv(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onStopPlay(String str) {
                C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", "onStopPlay");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onLoopPlay(String str, int i2) {
                if (str == null) {
                    C1836630xtV c1836630xtV = this;
                    LiveFragmentDetail liveFragmentDetail2 = liveFragmentDetail;
                    C1838930xxD c1838930xxD2 = c1838930xxD;
                    c1836630xtV.getClass();
                    str = C1836630xtV.LIZIZ(liveFragmentDetail2, c1838930xxD2, 0);
                }
                C1836640xtW c1836640xtW = this.LJII.get(str);
                if (c1836640xtW != null) {
                    c1836640xtW.LIZIZ = 0L;
                    c1836640xtW.LIZLLL++;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLoopPlay, playCount: ");
                sbLIZ.append(i2);
                C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
                C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", "onPausePlay");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompleted(String str, int i2) {
                C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", "onPlayCompleted");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlaying(String str, C1480430ocz c1480430ocz) {
                C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", "onPlaying");
                C500260Jjc.LJIILLIIL(c1838930xxD.LLILZLL);
            }

            @Override // X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                InterfaceC1484830ok5 interfaceC1484830ok53;
                InterfaceC1483420oho interfaceC1483420ohoLJIIIZ;
                InterfaceC1483420oho interfaceC1483420ohoLJIIIZ2;
                C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", "onRenderFirstFrame");
                if (str == null) {
                    C1836630xtV c1836630xtV = this;
                    LiveFragmentDetail liveFragmentDetail2 = liveFragmentDetail;
                    C1838930xxD c1838930xxD2 = c1838930xxD;
                    c1836630xtV.getClass();
                    str = C1836630xtV.LIZIZ(liveFragmentDetail2, c1838930xxD2, 0);
                }
                C1836630xtV c1836630xtV2 = this;
                C1838930xxD c1838930xxD3 = c1838930xxD;
                c1836630xtV2.getClass();
                View childAt = c1838930xxD3.LLILZ.getChildAt(0);
                if (childAt != null && (interfaceC1484830ok53 = c1836630xtV2.LJI) != null && (interfaceC1483420ohoLJIIIZ = interfaceC1484830ok53.LJIIIZ()) != null) {
                    int width = interfaceC1483420ohoLJIIIZ.getWidth();
                    InterfaceC1484830ok5 interfaceC1484830ok54 = c1836630xtV2.LJI;
                    if (interfaceC1484830ok54 != null && (interfaceC1483420ohoLJIIIZ2 = interfaceC1484830ok54.LJIIIZ()) != null) {
                        int height = interfaceC1483420ohoLJIIIZ2.getHeight();
                        int width2 = c1838930xxD3.LLILZ.getWidth();
                        int height2 = c1838930xxD3.LLILZ.getHeight();
                        C500260Jjc.LJIILLIIL(c1838930xxD3.LLILZIL);
                        if (width > 0 && height > 0 && width2 > 0 && height2 > 0) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.width = -1;
                            layoutParams.height = (int) (width2 / (width / height));
                            layoutParams.gravity = 17;
                            C786410Ut5.W5(childAt, layoutParams);
                        }
                    }
                }
                C1836640xtW c1836640xtW = this.LJII.get(str);
                if (c1836640xtW == null) {
                    c1836640xtW = new C1836640xtW(0);
                    this.LJII.put(str, c1836640xtW);
                }
                c1836640xtW.LIZLLL = 0;
                c1838930xxD.LLJI = true;
                this.LL = 0L;
            }

            @Override // X.InterfaceC1482530ogN
            public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", "onBuffering");
                if (z) {
                    C1246020iWu.LIZ(c1838930xxD.LLILZLL);
                    System.currentTimeMillis();
                } else {
                    C500260Jjc.LJIILLIIL(c1838930xxD.LLILZLL);
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", "onPlayFailed");
                C1836630xtV c1836630xtV = this;
                C1838930xxD c1838930xxD2 = c1838930xxD;
                InterfaceC1484830ok5 interfaceC1484830ok53 = c1836630xtV.LJI;
                if (interfaceC1484830ok53 != null) {
                    interfaceC1484830ok53.stop();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resetCurrentVideoUi, viewHolder: ");
                sbLIZ.append(c1838930xxD2);
                C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", C2188811AlT.LIZIZ(sbLIZ));
                C500260Jjc.LJIILLIIL(c1838930xxD2.LLILZLL);
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayProgressChange(String str, long j3, long j4) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayProgressChange, sourceId: ");
                sbLIZ.append(str);
                sbLIZ.append(", position: ");
                sbLIZ.append(j3);
                sbLIZ.append(", duration: ");
                sbLIZ.append(j4);
                C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", C2188811AlT.LIZIZ(sbLIZ));
                if (str == null) {
                    C1836630xtV c1836630xtV = this;
                    LiveFragmentDetail liveFragmentDetail2 = liveFragmentDetail;
                    C1838930xxD c1838930xxD2 = c1838930xxD;
                    c1836630xtV.getClass();
                    str = C1836630xtV.LIZIZ(liveFragmentDetail2, c1838930xxD2, 0);
                }
                if (this.LL != j3) {
                    this.LL = j3;
                }
                C1836640xtW c1836640xtW = this.LJII.get(str);
                if (c1836640xtW == null) {
                    c1836640xtW = new C1836640xtW(0);
                    this.LJII.put(str, c1836640xtW);
                }
                if (c1836640xtW.LIZIZ == 0 && j4 > 10000 && j4 - j3 < 1000) {
                    return;
                }
                c1836640xtW.LIZJ = j4;
                c1836640xtW.LIZIZ = j3;
                this.LIZ.invoke(Long.valueOf(c1836640xtW.LIZ()));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onVideoSizeChanged(String str, int i2, int i3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onVideoSizeChanged, width: ");
                sbLIZ.append(i2);
                sbLIZ.append(", height: ");
                sbLIZ.append(i3);
                C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", C2188811AlT.LIZIZ(sbLIZ));
                C1056690dbX.LIZ(c1838930xxD.LLILZ, i2, i3);
            }
        };
        InterfaceC1484830ok5 interfaceC1484830ok53 = this.LJI;
        if (interfaceC1484830ok53 != null) {
            interfaceC1484830ok53.setSpeed(1.0f);
        }
        C1836620xtU c1836620xtU2 = this.LJFF;
        if (c1836620xtU2 != null && (interfaceC1484830ok5 = this.LJI) != null) {
            interfaceC1484830ok5.LJIIZILJ(c1836620xtU2);
        }
        if (c1838930xxD.LLILZ.getChildCount() == 0) {
            InterfaceC1484830ok5 interfaceC1484830ok54 = this.LJI;
            if (interfaceC1484830ok54 != null) {
                interfaceC1484830ok54.LIZJ(new InterfaceC1483820oiS() { // from class: X.0xtX
                    @Override // X.InterfaceC1483820oiS
                    public final /* synthetic */ boolean bn() {
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
                        return c1838930xxD.LLILZ;
                    }
                });
            }
        } else {
            InterfaceC1484830ok5 interfaceC1484830ok55 = this.LJI;
            if (interfaceC1484830ok55 != null) {
                interfaceC1484830ok55.LIZLLL(new InterfaceC1483820oiS() { // from class: X.0xtY
                    @Override // X.InterfaceC1483820oiS
                    public final /* synthetic */ boolean bn() {
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
                        return c1838930xxD.LLILZ;
                    }
                });
            }
        }
        C1246020iWu.LIZ(c1838930xxD.LLILZ);
        C830490Whz<String, C1836640xtW> c830490Whz = this.LJII;
        getClass();
        C1836640xtW c1836640xtW = c830490Whz.get(LIZIZ(liveFragmentDetail, c1838930xxD, 0));
        if (c1836640xtW != null) {
            i = (int) c1836640xtW.LIZIZ;
            c1836640xtW.LIZ = i;
            c1836640xtW.LIZLLL = 0;
        } else {
            i = 0;
        }
        C1482560ogQ c1482560ogQLIZ = LIZ(liveFragmentDetail, c1838930xxD.getPosition(), i);
        this.LIZLLL = liveFragmentDetail;
        InterfaceC1484830ok5 interfaceC1484830ok56 = this.LJI;
        if (interfaceC1484830ok56 != null) {
            interfaceC1484830ok56.LJ(c1482560ogQLIZ);
        }
        FrameLayout frameLayout = c1838930xxD.LLILZ;
        VideoMetaInfo videoMetaInfo = liveFragmentDetail.mp4VideoMetaInfo;
        if (videoMetaInfo != null) {
            j = videoMetaInfo.width;
        } else {
            j = liveFragmentDetail.witdh;
        }
        int i2 = (int) j;
        if (videoMetaInfo != null) {
            j2 = videoMetaInfo.height;
        } else {
            j2 = liveFragmentDetail.height;
        }
        C1056690dbX.LIZ(frameLayout, i2, (int) j2);
    }

    public static C1482560ogQ LIZ(LiveFragmentDetail liveFragmentDetail, int i, int i2) {
        String strLIZ = C2254508sR.LIZ(String.valueOf(liveFragmentDetail.fragmentId));
        C1482580ogS c1482580ogS = new C1482580ogS();
        String str = null;
        c1482580ogS.LIZ = LIZIZ(liveFragmentDetail, null, i);
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        VideoMetaInfo videoMetaInfo = liveFragmentDetail.mp4VideoMetaInfo;
        if (videoMetaInfo != null) {
            str = videoMetaInfo.url;
        }
        c1058540deW.LIZIZ(str);
        c1058540deW.LIZIZ = strLIZ;
        C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
        C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
        c1479570obb.LJIIIZ = i2;
        c1479570obb.LJJIIZ = "mp4";
        c1479570obb.LJIILL = "sfv_special_card";
        c1479570obb.LJIILLIIL = "sfv_special_card";
        c1479570obb.LJJ = false;
        c1479570obb.LIZIZ = true;
        C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
        c1482580ogS2.LJ = c1482570ogRLIZ;
        return new C1484680ojq(c1482580ogS2).LIZ();
    }

    public static String LIZIZ(LiveFragmentDetail liveFragmentDetail, C1838930xxD c1838930xxD, int i) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (liveFragmentDetail != null) {
            lValueOf = Long.valueOf(liveFragmentDetail.fragmentId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append('_');
        if (c1838930xxD != null) {
            i = c1838930xxD.getPosition();
        }
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
