package Y;

import X.AbstractC21386218mi;
import X.C19LP;
import X.C21386018mg;
import X.InterfaceC587190N1h;
import Y.ARunnableS132S0100000_32;
import Y.ARunnableS28S1100000_23;
import Y.ARunnableS36S1100000_32;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class AObjectS406S0100000_32 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS406S0100000_32 aObjectS406S0100000_32) throws Throwable {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) ((C19LP) aObjectS406S0100000_32.l0).l0;
        videoPublishContainerScene.LLLLIILL.creativeModel.postPageModel.draftPanelModel.isFromSaveDraftPopup = true;
        videoPublishContainerScene.w();
        return null;
    }

    public static final Object invoke$1(AObjectS406S0100000_32 aObjectS406S0100000_32) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) ((C19LP) aObjectS406S0100000_32.l0).l0;
        videoPublishContainerScene.LLLLIILL.creativeModel.postPageModel.draftPanelModel.isFromSaveDraftPopup = true;
        videoPublishContainerScene.LLLLLLLZIL();
        return null;
    }

    public static final Object invoke$2(AObjectS406S0100000_32 aObjectS406S0100000_32) {
        return ((AbstractC21386218mi) aObjectS406S0100000_32.l0).LJFF().findViewById(R.id.qtd);
    }

    public static final Object invoke$3(AObjectS406S0100000_32 aObjectS406S0100000_32) {
        return ((C21386018mg) aObjectS406S0100000_32.l0).LJFF().findViewById(R.id.c4n);
    }

    public static final Object invoke$4(AObjectS406S0100000_32 aObjectS406S0100000_32) {
        final C21386018mg c21386018mg = (C21386018mg) aObjectS406S0100000_32.l0;
        return new OnUIPlayListener() { // from class: X.18mZ
            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
                return C583620Mum.LIZ(this);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
                C583620Mum.LIZIZ(this, str, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
                C583620Mum.LIZJ(this, str, j, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
                C583620Mum.LIZLLL(this, str, j);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(String str, boolean z) {
                C583620Mum.LJ(this, str, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                C583620Mum.LJFF(this, str, z, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(boolean z) {
                C583620Mum.LJI(this, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
                C583620Mum.LJII(this, str, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCrosstalkHappened(String str) {
                C583620Mum.LJIIIIZZ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
                C583620Mum.LJIIIZ(this, str, list);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
                C583620Mum.LJIIJ(this, str, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(boolean z) {
                C583620Mum.LJIIL(this, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
                C583620Mum.LJIILIIL(this, i, j, j2, map);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                C583620Mum.LJIILJJIL(this, str, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLoopPlay(String str, int i) {
                C583620Mum.LJIILL(this, str, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
                C583620Mum.LJIILLIIL(this, str, c1480290ocl);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPausePlay(String str) {
                C583620Mum.LJIIZILJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJIJ(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompleted(String str) {
                C583620Mum.LJIJI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompleted(String str, int i) {
                C583620Mum.LJIJJ(this, str, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
                C583620Mum.LJIJJLI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJIL(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
                C583620Mum.LJJIFFI(this, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
                C583620Mum.LJJ(this, str, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPause(String str) {
                C583620Mum.LJJII(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPrepare(String str) {
                C583620Mum.LJJIII(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPrepared(String str) {
                C583620Mum.LJJIIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayProgressChange(float f) {
                C583620Mum.LJJIIJZLJL(this, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
                C583620Mum.LJJIIZ(this, str, j, j2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayRelease(String str) {
                C583620Mum.LJJIIZI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str) {
                C583620Mum.LJJIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
                C583620Mum.LJJIJIIJI(this, str, jSONObject);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str, boolean z) {
                C583620Mum.LJJIJIL(this, str, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
                C583620Mum.LJJIJL(this, str, i, jSONObject);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlaying(String str) {
                C583620Mum.LJJIJLIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJIL(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPreRenderSessionMissed(String str) {
                C583620Mum.LJJIZ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPreparePlay(String str) {
                C583620Mum.LJJJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                C583620Mum.LJJJJ(this, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
                C583620Mum.LJJJJI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJIZL(this, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onResumePlay(String str) {
                C583620Mum.LJJJJJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJJL(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJLI(this, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJL(this, str, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSeekEnd(String str, boolean z) {
                C583620Mum.LJJJJLL(this, str, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSeekStart(String str, int i, float f) {
                C583620Mum.LJJJJZ(this, str, i, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSpeedChanged(String str, float f) {
                C583620Mum.LJJJJZI(this, str, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onStopPlay(String str) {
                C583620Mum.LJJJLIIL(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
                C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoSecondFrame(String str) {
                C583620Mum.LJJJLZIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
                C583620Mum.LJJJZ(this, str, i, i2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
                String sourceId;
                ExecutorService executorService;
                C583620Mum.LJJJI(this, str, c1480430ocz);
                if (!TextUtils.isEmpty(str)) {
                    InterfaceC21385618mc interfaceC21385618mc = c21386018mg.LJIILIIL;
                    if (interfaceC21385618mc != null) {
                        sourceId = interfaceC21385618mc.getSourceId();
                    } else {
                        sourceId = null;
                    }
                    if (Intrinsics.LJFF(sourceId, str)) {
                        c21386018mg.LJIIIZ = 1;
                        if (C1474810oTv.LJLL() && (executorService = C1475000oUE.LIZLLL) != null) {
                            executorService.execute(new ARunnableS28S1100000_23(c21386018mg, str, 30));
                        }
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                String sourceId;
                C714880S2k c714880S2kLIZIZ;
                InterfaceC1483670oiD interfaceC1483670oiD;
                InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
                InterfaceC21385618mc interfaceC21385618mc;
                ImageView imageViewLJIJ;
                if (!TextUtils.isEmpty(str)) {
                    InterfaceC21385618mc interfaceC21385618mc2 = c21386018mg.LJIILIIL;
                    if (interfaceC21385618mc2 != null) {
                        sourceId = interfaceC21385618mc2.getSourceId();
                    } else {
                        sourceId = null;
                    }
                    if (Intrinsics.LJFF(sourceId, str)) {
                        C21386018mg c21386018mg2 = c21386018mg;
                        c21386018mg2.LJIIIZ = 2;
                        c21386018mg2.LJIJI(false);
                        C21386018mg c21386018mg3 = c21386018mg;
                        C21385918mf c21385918mf = c21386018mg3.LJIIL;
                        if (c21385918mf != null && c21385918mf.LJ && (imageViewLJIJ = c21386018mg3.LJIJ()) != null && imageViewLJIJ.getVisibility() == 0 && c21386018mg.LJIIL.LJFF > 0) {
                            View viewLJIIIZ = c21386018mg.LJIIIZ();
                            if (viewLJIIIZ != null) {
                                C786410Ut5.LJLLLLLL(4, viewLJIIIZ);
                            }
                            c21386018mg.LJIIZILJ();
                        } else {
                            C786410Ut5.LJLLLLLL(8, c21386018mg.LJFF());
                        }
                        c21386018mg.LJIIJJI();
                        C21386018mg c21386018mg4 = c21386018mg;
                        C21385918mf c21385918mf2 = c21386018mg4.LJIIL;
                        if (c21385918mf2 != null && c21385918mf2.LJI) {
                            c21386018mg4.LJIJI = null;
                            ARunnableS132S0100000_32 aRunnableS132S0100000_32 = new ARunnableS132S0100000_32(c21386018mg4, 85);
                            boolean z = C587180N1g.LIZ;
                            if (C587180N1g.LIZ) {
                                c21386018mg.LJIJJ = aRunnableS132S0100000_32;
                                return;
                            } else {
                                aRunnableS132S0100000_32.run();
                                c21386018mg.LJIJJ = null;
                                return;
                            }
                        }
                        InterfaceC690370R6d interfaceC690370R6d = c21386018mg4.LJ;
                        if (interfaceC690370R6d == null || (c714880S2kLIZIZ = interfaceC690370R6d.LIZIZ()) == null || (interfaceC1483670oiD = c714880S2kLIZIZ.LIZLLL) == null || (interfaceC1481730of5LJIIIZ = interfaceC1483670oiD.LJIIIZ()) == null || (interfaceC21385618mc = c21386018mg.LJIILIIL) == null) {
                            return;
                        }
                        interfaceC21385618mc.LIZ(interfaceC1481730of5LJIIIZ.getWidth(), interfaceC1481730of5LJIIIZ.getHeight());
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                String sourceId;
                if (!TextUtils.isEmpty(str)) {
                    InterfaceC21385618mc interfaceC21385618mc = c21386018mg.LJIILIIL;
                    if (interfaceC21385618mc != null) {
                        sourceId = interfaceC21385618mc.getSourceId();
                    } else {
                        sourceId = null;
                    }
                    if (Intrinsics.LJFF(sourceId, str)) {
                        C21386018mg c21386018mg2 = c21386018mg;
                        c21386018mg2.LJIIIZ = 0;
                        C21385918mf c21385918mf = c21386018mg2.LJIIL;
                        if (c21385918mf != null && c21385918mf.LJI) {
                            c21386018mg2.LJIJJ = null;
                            ARunnableS36S1100000_32 aRunnableS36S1100000_32 = new ARunnableS36S1100000_32(c21386018mg2, str, 6);
                            boolean z = C587180N1g.LIZ;
                            if (C587180N1g.LIZ) {
                                c21386018mg.LJIJI = aRunnableS36S1100000_32;
                                return;
                            } else {
                                aRunnableS36S1100000_32.run();
                                c21386018mg.LJIJI = null;
                                return;
                            }
                        }
                        C21386018mg c21386018mg3 = c21386018mg;
                        if (!c21386018mg3.LJIILL(c21386018mg3.LJI) || u.LJIJI(str, c21386018mg.LJIILJJIL, false)) {
                            return;
                        }
                        C21386018mg c21386018mg4 = c21386018mg;
                        c21386018mg4.LJIIJ(c21386018mg4.LJI);
                    }
                }
            }
        };
    }

    public static final Object invoke$5(AObjectS406S0100000_32 aObjectS406S0100000_32) {
        return new ARunnableS132S0100000_32((C21386018mg) aObjectS406S0100000_32.l0, 84);
    }

    public static final Object invoke$6(AObjectS406S0100000_32 aObjectS406S0100000_32) {
        final C21386018mg c21386018mg = (C21386018mg) aObjectS406S0100000_32.l0;
        return new InterfaceC587190N1h() { // from class: X.18mb
            @Override // X.InterfaceC587190N1h
            public final void LIZ(boolean z) {
                if (!z) {
                    ARunnableS132S0100000_32 aRunnableS132S0100000_32 = c21386018mg.LJIJJ;
                    if (aRunnableS132S0100000_32 != null) {
                        aRunnableS132S0100000_32.run();
                    }
                    C21386018mg c21386018mg2 = c21386018mg;
                    c21386018mg2.LJIJJ = null;
                    ARunnableS36S1100000_32 aRunnableS36S1100000_32 = c21386018mg2.LJIJI;
                    if (aRunnableS36S1100000_32 != null) {
                        aRunnableS36S1100000_32.run();
                    }
                    c21386018mg.LJIJI = null;
                }
            }
        };
    }

    public AObjectS406S0100000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
