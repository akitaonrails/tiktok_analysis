package X;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEPlayerPreviewMode;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS101S0210000_22;
import kotlin.jvm.internal.AwS140S0400000_11;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452870nuX implements InterfaceC19647211tu {
    public final CreativeInfo LIZ;
    public final TextureView LIZIZ;
    public C1452890nuZ LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 821));

    public final C1463670oBx LIZJ() {
        return (C1463670oBx) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC19647211tu
    public final long LIZIZ() {
        return LIZJ().LIZLLL().LIZIZ.getPlayerApi().getDuration();
    }

    @Override // X.InterfaceC19647211tu
    public final void Li() {
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        C348100Dkm c348100DkmLIZLLL = LIZJ().LIZLLL();
        if (c348100DkmLIZLLL == null || (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) {
            return;
        }
        playerApi.pause();
    }

    @Override // X.InterfaceC19647211tu
    public final long getCurrentPosition() {
        return LIZJ().LIZLLL().LIZIZ.getPlayerApi().getCurrentPosition();
    }

    @Override // X.InterfaceC19647211tu
    public final void release() {
        LIZJ().Xe();
        LIZJ().destroy();
    }

    @Override // X.InterfaceC19647211tu
    public final void rl() {
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        C348100Dkm c348100DkmLIZLLL = LIZJ().LIZLLL();
        if (c348100DkmLIZLLL == null || (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) {
            return;
        }
        playerApi.play();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0nuZ, com.bytedance.ies.nle.editor_jni.INLEPurePlayer$INLEPurePlayerInfoListener] */
    public final C19475111Hh LIZLLL(final INLEPurePlayer.INLEPurePlayerInfoListener iNLEPurePlayerInfoListener) {
        final C11RK c11rk = new C11RK();
        C1452890nuZ c1452890nuZ = this.LIZJ;
        if (c1452890nuZ != null) {
            LIZJ().LIZLLL().LIZIZ.getPlayerApi().removePlayerInfoListener(c1452890nuZ);
        }
        ?? r1 = new INLEPurePlayer.INLEPurePlayerInfoListener() { // from class: X.0nuZ
            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onPlayEnd() {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayEnd(this);
                C1452870nuX c1452870nuX = this.LIZ;
                C1452890nuZ c1452890nuZ2 = c1452870nuX.LIZJ;
                if (c1452890nuZ2 != null) {
                    c1452870nuX.LIZJ().LIZLLL().LIZIZ.getPlayerApi().removePlayerInfoListener(c1452890nuZ2);
                }
                c11rk.onNext(Unit.LIZ);
                c11rk.onComplete();
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onFirstFrameRender() {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onFirstFrameRender(this);
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onPlayerPause() {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayerPause(this);
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onPrepared() {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPrepared(this);
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onPlayTime(int i, long j) {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayTime(this, i, j);
                INLEPurePlayer.INLEPurePlayerInfoListener iNLEPurePlayerInfoListener2 = iNLEPurePlayerInfoListener;
                if (iNLEPurePlayerInfoListener2 != null) {
                    iNLEPurePlayerInfoListener2.onPlayTime(i, j);
                }
            }
        };
        this.LIZJ = r1;
        LIZJ().LIZLLL().LIZIZ.getPlayerApi().addPlayerInfoListener(r1);
        return new C19475111Hh(c11rk);
    }

    public C1452870nuX(Context context, CreativeInfo creativeInfo) {
        this.LIZ = creativeInfo;
        this.LIZIZ = new TextureView(context);
    }

    @Override // X.InterfaceC19647211tu
    public final void LIZ(SingleImageData singleImageData, ImageAlbumData imageAlbumData, CreativeModel creativeModel, final FrameLayout frameLayout, final float f, final LivePhotoPreviewMode livePhotoPreviewMode, final boolean z, final boolean z2, final AwS140S0400000_11 awS140S0400000_11) {
        C1449990npt c1449990npt = C1449990npt.LIZ;
        CreativeInfo creativeInfo = this.LIZ;
        C1463670oBx c1463670oBxLIZJ = LIZJ();
        c1449990npt.getClass();
        c1463670oBxLIZJ.jf();
        c1463670oBxLIZJ.Ve(new NLEModel());
        C443120HZe c443120HZeLJII = C1449990npt.LJII(c1449990npt, singleImageData, imageAlbumData, creativeModel, new C1432030nMv(null, C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.VE_PREVIEW_WORKSPACE, null, false, 12), creativeModel.imageEditModel.map, 19), c1463670oBxLIZJ, true, null, 64);
        if (c443120HZeLJII != null) {
            new C443120HZe(c443120HZeLJII.getFirst(), Integer.valueOf(((Number) c443120HZeLJII.getSecond()).intValue()), Integer.valueOf(((Number) c443120HZeLJII.getThird()).intValue()));
        }
        if (z2) {
            C786410Ut5.LJLLLLLL(8, frameLayout);
        }
        HandlerHook.viewPost(frameLayout, new Runnable() { // from class: X.0nuY
            public final void LIZ() {
                View view;
                INLEMediaSession iNLEMediaSession;
                INLEPlayer playerApi;
                INLEMediaSession iNLEMediaSession2;
                INLEMediaRuntime mediaRuntimeApi;
                ViewGroup viewGroup;
                C1452870nuX c1452870nuX = this.LL;
                FrameLayout frameLayout2 = frameLayout;
                if (c1452870nuX.LIZIZ.getParent() != null) {
                    ViewParent parent = c1452870nuX.LIZIZ.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        C786410Ut5.LJJJLZIJ(c1452870nuX.LIZIZ, viewGroup);
                    }
                }
                C786410Ut5.LJJJJIZL(frameLayout2);
                frameLayout2.addView(c1452870nuX.LIZIZ);
                C348100Dkm c348100DkmLIZLLL = c1452870nuX.LIZJ().LIZLLL();
                if (c348100DkmLIZLLL != null && (iNLEMediaSession2 = c348100DkmLIZLLL.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession2.getMediaRuntimeApi()) != null) {
                    mediaRuntimeApi.setPreviewFillMode(NLEPlayerPreviewMode.FILL);
                }
                C348100Dkm c348100DkmLIZLLL2 = c1452870nuX.LIZJ().LIZLLL();
                if (c348100DkmLIZLLL2 != null && (iNLEMediaSession = c348100DkmLIZLLL2.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                    playerApi.bindTextureView(c1452870nuX.LIZIZ, true);
                }
                if (frameLayout.getParent() == null) {
                    return;
                }
                if (z && C295810Bid.LIZ()) {
                    C1452870nuX c1452870nuX2 = this.LL;
                    C1452890nuZ c1452890nuZ = c1452870nuX2.LIZJ;
                    if (c1452890nuZ != null) {
                        c1452870nuX2.LIZJ().LIZLLL().LIZIZ.getPlayerApi().removePlayerInfoListener(c1452890nuZ);
                    }
                    LivePhotoPreviewMode livePhotoPreviewMode2 = livePhotoPreviewMode;
                    if (livePhotoPreviewMode2 == LivePhotoPreviewMode.LOOP) {
                        this.LL.LIZJ().setLoopPlay(true);
                    } else if (livePhotoPreviewMode2 == LivePhotoPreviewMode.LIVE_PHOTO) {
                        this.LL.LIZJ().setLoopPlay(false);
                        this.LL.LIZJ().LIZLLL().LIZIZ.getPlayerApi().addPlayerInfoListener(new C1452910nub(this.LL.LIZJ(), AFwS210S0000000_22.get$arr$(303)));
                    }
                } else {
                    this.LL.LIZJ().setLoopPlay(false);
                }
                this.LL.LIZJ().LIZLLL().LIZIZ.getMediaRuntimeApi().setPreviewFillMode(NLEPlayerPreviewMode.FILL);
                this.LL.LIZJ().LIZLLL().LIZIZ.getPlayerApi().prepare();
                C1452870nuX c1452870nuX3 = this.LL;
                FrameLayout frameLayout3 = frameLayout;
                float f2 = f;
                c1452870nuX3.getClass();
                Object parent2 = frameLayout3.getParent();
                if ((parent2 instanceof View) && (view = (View) parent2) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    float f3 = width;
                    float f4 = height;
                    if (f3 / f4 > f2) {
                        width = (int) (f4 * f2);
                    } else {
                        height = (int) (f3 / f2);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
                    layoutParams.gravity = 17;
                    C786410Ut5.a6(frameLayout3, layoutParams);
                    C786410Ut5.LJLLLLLL(0, frameLayout3);
                    frameLayout3.requestLayout();
                }
                C1463670oBx c1463670oBxLIZJ2 = this.LL.LIZJ();
                final Function0<Unit> function0 = awS140S0400000_11;
                final C1452870nuX c1452870nuX4 = this.LL;
                final boolean z3 = z2;
                c1463670oBxLIZJ2.bg(0, new InterfaceC1464140oCi() { // from class: X.0nua
                    @Override // X.InterfaceC1464140oCi
                    public final int onGetImageData(byte[] bArr, int i, int i2, int i3, float f5) {
                        C0CNO.LIZLLL(0L, new AwS101S0210000_22((Function0) function0, (Function0<Unit>) c1452870nuX4, (C1452870nuX) z3, true));
                        return 0;
                    }
                });
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PreviewVideoNlePlayer@9fc2.playByNleModel$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PreviewVideoNlePlayer@9fc2.playByNleModel$1");
            }
        });
    }
}
