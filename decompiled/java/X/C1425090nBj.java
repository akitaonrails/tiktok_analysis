package X;

import Y.ARunnableS7S0100001_22;
import Y.ARunnableS9S0102000_22;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.Scene;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425090nBj extends FrameLayout {
    public static final /* synthetic */ int LLL = 0;
    public final C19EG LL;
    public final Scene LLILLJJLI;
    public final C1419590n2r LLILLL;
    public final int LLILZ;
    public final InterfaceC1425260nC0 LLILZIL;
    public final View LLILZLL;
    public final SmartImageView LLIZ;
    public final FrameLayout LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;
    public final FrameLayout LLJIJIL;
    public final ImageView LLJILJIL;
    public final C11FU LLJILJILJ;
    public final C01GW LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public C0P0T LLJJIJIIJIL;
    public final CutsameDataItem LLJJIJIL;
    public boolean LLJJJ;
    public C1DRG LLJJJIL;
    public C1425160nBq LLJJJJ;
    public final C01GW LLJJJJJIL;
    public TextureView LLJJJJLIIL;
    public boolean LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public float LLJLIL;
    public boolean LLJLILLLLZIIL;
    public long LLJLL;
    public boolean LLJLLIL;
    public final C1425140nBo LLJLLL;
    public final C01GW LLJZ;
    public final C1425190nBt LLJZIJLIL;

    private final InterfaceC524950KiL getAvListenableActivityRegistry() {
        return (InterfaceC524950KiL) this.LLJZ.getValue();
    }

    private final C1361400lX0 getDarkModeContextWrapper() {
        return (C1361400lX0) this.LLJJIII.getValue();
    }

    private final boolean getTemplateFavoriteEnabled() {
        return ((Boolean) this.LLJJI.getValue()).booleanValue();
    }

    private final Pair<TuxIconDrawable, TuxIconDrawable> getTemplateFavoriteIcons() {
        return (Pair) this.LLJILLL.getValue();
    }

    public final void LIZJ() {
        if (this.LLJJLIIIJLLLLLLLZ == 0) {
            return;
        }
        System.currentTimeMillis();
        C1425160nBq c1425160nBq = this.LLJJJJ;
        if (c1425160nBq != null && c1425160nBq.getVideoDuration() > 0) {
            c1425160nBq.getVideoDuration();
        }
        this.LLILZIL.LIZLLL(this.LLILZ, this.LLILLL, System.currentTimeMillis() - this.LLJJLIIIJLLLLLLLZ);
        this.LLJJLIIIJLLLLLLLZ = 0L;
    }

    public final void LJIIJJI() {
        this.LLJILJILJ.setImageDrawable(this.LLJJ ? getTemplateFavoriteIcons().getSecond() : getTemplateFavoriteIcons().getFirst());
    }

    public final C1484970okJ getPlayRequest() {
        CutsameDataItem cutsameDataItem = this.LLJJIJIL;
        if (cutsameDataItem == null) {
            return null;
        }
        String str = cutsameDataItem.templateId;
        Pair pair = new Pair(this.LLILLL.LIZ, cutsameDataItem);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("template_feed");
        sbLIZ.append('/');
        sbLIZ.append(hashCode());
        return new C1484970okJ(str, pair, new C1425280nC2(C2188811AlT.LIZIZ(sbLIZ)), this.LLILZ, cutsameDataItem.LIZJ());
    }

    public final InterfaceC1425150nBp getPlayerManager() {
        return (InterfaceC1425150nBp) this.LLJJJJJIL.getValue();
    }

    public final void LIZIZ() {
        C1425160nBq c1425160nBq;
        if (C299160Bo2.LIZ() || this.LLJJJ) {
            return;
        }
        this.LLJJJ = true;
        C1DRG c1drg = this.LLJJJIL;
        if (c1drg != null) {
            this.LLJJJJ = new C1425160nBq(c1drg);
            this.LLJJJJLIIL = ((InterfaceC1424960nBW) c1drg.LJII(InterfaceC1424960nBW.class, null)).LIZIZ().create(this.LL);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
            TextureView textureView = this.LLJJJJLIIL;
            if (textureView != null) {
                C786410Ut5.V5(textureView, layoutParams);
            }
            this.LLIZLLLIL.addView(this.LLJJJJLIIL, 0);
            TextureView textureView2 = this.LLJJJJLIIL;
            if (textureView2 != null && (c1425160nBq = this.LLJJJJ) != null) {
                c1425160nBq.wrap(textureView2);
            }
            C1425160nBq c1425160nBq2 = this.LLJJJJ;
            if (c1425160nBq2 != null) {
                c1425160nBq2.addPlayerListener(new InterfaceC1425250nBz() { // from class: X.0nBn
                    @Override // X.InterfaceC1425250nBz
                    public final void LIZIZ(InterfaceC1425020nBc interfaceC1425020nBc) {
                        String id;
                        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("TemplateFeedItemView onRenderFirstFrame: video: ");
                        sbLIZ.append(this.LIZ.LLIZLLLIL.getVisibility());
                        sbLIZ.append(", cover = ");
                        sbLIZ.append(this.LIZ.LLIZ.getVisibility());
                        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                        this.LIZ.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
                        C1425090nBj c1425090nBj = this.LIZ;
                        float f = c1425090nBj.LLJLIL;
                        if (f > 0.0f) {
                            C1425160nBq c1425160nBq3 = c1425090nBj.LLJJJJ;
                            if (c1425160nBq3 != null) {
                                c1425160nBq3.seek(f);
                            }
                            this.LIZ.LLJLIL = 0.0f;
                        } else {
                            if (interfaceC1425020nBc != null) {
                                id = interfaceC1425020nBc.getId();
                            } else {
                                id = null;
                            }
                            c1425090nBj.LIZLLL(0, id);
                            C786410Ut5.LLFF(8, this.LIZ.LLIZ);
                        }
                        C1425090nBj c1425090nBj2 = this.LIZ;
                        c1425090nBj2.LJIIJ(0, 0, null, c1425090nBj2.LLJJIJIL);
                    }

                    @Override // X.InterfaceC1425250nBz
                    public final void LIZJ(InterfaceC1425330nC7 interfaceC1425330nC7) {
                        int errorCode;
                        Object extraInfo;
                        C1425090nBj c1425090nBj = this.LIZ;
                        if (interfaceC1425330nC7 != null) {
                            errorCode = interfaceC1425330nC7.getErrorCode();
                            extraInfo = interfaceC1425330nC7.getExtraInfo();
                        } else {
                            errorCode = 0;
                            extraInfo = null;
                        }
                        c1425090nBj.LJIIJ(1, errorCode, String.valueOf(extraInfo), this.LIZ.LLJJIJIL);
                    }

                    @Override // X.InterfaceC1425250nBz
                    public final void LJL(boolean z) {
                        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("TemplateFeedItemView onSeekEnd: video: ");
                        sbLIZ.append(this.LIZ.LLIZLLLIL.getVisibility());
                        sbLIZ.append(", cover = ");
                        sbLIZ.append(this.LIZ.LLIZ.getVisibility());
                        sbLIZ.append(", progress = ");
                        sbLIZ.append(this.LIZ.getVideoProgress());
                        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                        C786410Ut5.LLFF(8, this.LIZ.LLIZ);
                        C1425160nBq c1425160nBq3 = this.LIZ.LLJJJJ;
                        if (c1425160nBq3 != null) {
                            c1425160nBq3.unmute();
                        }
                    }

                    @Override // X.InterfaceC1425250nBz
                    public final void onPlayCompleted(String str) {
                        this.LIZ.LIZLLL(4, str);
                    }

                    @Override // X.InterfaceC1425250nBz
                    public final void onPlayPause(String str) {
                        this.LIZ.LIZLLL(2, str);
                    }

                    @Override // X.InterfaceC1425250nBz
                    public final void onPlayStop(String str) {
                        this.LIZ.LIZLLL(3, str);
                    }

                    @Override // X.InterfaceC1425250nBz
                    public final void onResumePlay(String str) {
                        this.LIZ.LIZLLL(1, str);
                    }

                    @Override // X.InterfaceC1425250nBz
                    public final void onVideoSizeChanged(int i, int i2) {
                        TextureView textureView3;
                        if (C299140Bo0.LIZ() && i > 0 && i2 > 0 && (textureView3 = this.LIZ.LLJJJJLIIL) != null) {
                            HandlerHook.viewPost(textureView3, new ARunnableS9S0102000_22(textureView3, i2, i, 0));
                        }
                    }
                });
            }
        }
    }

    public final void LJIIIIZZ() {
        InterfaceC1425150nBp playerManager;
        if (C299160Bo2.LIZ()) {
            C1484970okJ playRequest = getPlayRequest();
            if (playRequest == null || (playerManager = getPlayerManager()) == null) {
                return;
            }
            playerManager.LJIILIIL(playRequest);
            return;
        }
        CutsameDataItem cutsameDataItem = this.LLJJIJIL;
        if (cutsameDataItem != null) {
            Video videoLIZ = C1419160n2A.LIZ(cutsameDataItem);
            LIZIZ();
            C1425160nBq c1425160nBq = this.LLJJJJ;
            if (c1425160nBq != null) {
                c1425160nBq.preloadVideo(videoLIZ, 819200);
            }
        }
    }

    public final float getVideoProgress() {
        if (C299160Bo2.LIZ()) {
            InterfaceC1425150nBp playerManager = getPlayerManager();
            if (playerManager != null) {
                return playerManager.LIZIZ();
            }
            return 0.0f;
        }
        C1425160nBq c1425160nBq = this.LLJJJJ;
        if (c1425160nBq == null) {
            return 0.0f;
        }
        long videoDuration = c1425160nBq.getVideoDuration();
        if (videoDuration != 0) {
            return (c1425160nBq.getCurrentPosition() * 100.0f) / videoDuration;
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC524950KiL avListenableActivityRegistry;
        super.onAttachedToWindow();
        if (C299160Bo2.LIZ() && C299150Bo1.LIZ() && (avListenableActivityRegistry = getAvListenableActivityRegistry()) != null) {
            avListenableActivityRegistry.kF(this.LLJZIJLIL);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC524950KiL avListenableActivityRegistry = getAvListenableActivityRegistry();
        if (avListenableActivityRegistry != null) {
            avListenableActivityRegistry.b8(this.LLJZIJLIL);
        }
    }

    public final C1419590n2r getAsset() {
        return this.LLILLL;
    }

    public final Scene getParentScene() {
        return this.LLILLJJLI;
    }

    public final TuxIconDrawable LIZ(boolean z) {
        int i;
        int i2;
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (!z) {
            i = R.raw.icon_bookmark;
        } else {
            i = R.raw.icon_bookmark_fill;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        if (!z) {
            i2 = R.attr.a1h;
        } else {
            i2 = R.attr.ny;
        }
        c419910GdJ.LJ = Integer.valueOf(i2);
        return c419910GdJ.LIZ(getDarkModeContextWrapper());
    }

    public final void LJ(float f) {
        CutsameDataItem cutsameDataItem;
        InterfaceC1425150nBp playerManager;
        if (C299160Bo2.LIZ()) {
            if (C299160Bo2.LIZ() && (cutsameDataItem = this.LLJJIJIL) != null && cutsameDataItem.LIZLLL() && this.LLILLJJLI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TemplateFeedItemView playVideoNew: progress = ");
                sbLIZ.append(f);
                C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                this.LLJJL = false;
                C337180DJs.LIZ(this.LLJ);
                C1484970okJ playRequest = getPlayRequest();
                if (playRequest != null && (playerManager = getPlayerManager()) != null) {
                    playerManager.LJI(playRequest, this.LLIZLLLIL, f, this.LLJLLL);
                    return;
                }
                return;
            }
            return;
        }
        LIZIZ();
        TextureView textureView = this.LLJJJJLIIL;
        if (textureView != null) {
            HandlerHook.viewPost(textureView, new ARunnableS7S0100001_22(f, this, 0));
        }
    }

    public final void LJFF(boolean z) {
        if (C299160Bo2.LIZ()) {
            this.LLJL = getVideoProgress();
            C1484970okJ playRequest = getPlayRequest();
            if (playRequest != null) {
                if (z) {
                    InterfaceC1425150nBp playerManager = getPlayerManager();
                    if (playerManager != null) {
                        playerManager.LJIIIIZZ(playRequest);
                    }
                } else {
                    InterfaceC1425150nBp playerManager2 = getPlayerManager();
                    if (playerManager2 == null) {
                        return;
                    }
                    playerManager2.LJ(playRequest);
                    return;
                }
            }
            LIZJ();
        }
        C1425160nBq c1425160nBq = this.LLJJJJ;
        if (c1425160nBq != null) {
            c1425160nBq.pause();
        }
        LJIIJ(2, 0, null, this.LLJJIJIL);
        if (!z) {
            return;
        }
        LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(boolean r8) {
        /*
            r7 = this;
            if (r8 == 0) goto Ld
            long r0 = java.lang.System.currentTimeMillis()
            r7.LLJJLIIIJLLLLLLLZ = r0
            boolean r0 = r7.LLJJL
            if (r0 == 0) goto Ld
            return
        Ld:
            boolean r0 = X.C299160Bo2.LIZ()
            if (r0 == 0) goto L2a
            X.0okJ r4 = r7.getPlayRequest()
            if (r4 != 0) goto L1a
            return
        L1a:
            X.0nBp r3 = r7.getPlayerManager()
            if (r3 == 0) goto L29
            android.widget.FrameLayout r2 = r7.LLIZLLLIL
            float r1 = r7.LLJL
            X.0nBo r0 = r7.LLJLLL
            r3.LJIILJJIL(r4, r2, r1, r0)
        L29:
            return
        L2a:
            X.0nBq r5 = r7.LLJJJJ
            if (r5 == 0) goto L8d
            boolean r0 = r5.isPlaying()
            if (r0 != 0) goto L8d
            com.ss.android.ugc.aweme.cutsame.CutsameDataItem r0 = r7.LLJJIJIL
            if (r0 == 0) goto L8d
            com.ss.android.ugc.aweme.feed.model.Video r4 = X.C1419160n2A.LIZ(r0)
            com.ss.android.ugc.aweme.cutsame.CutsameDataItem r0 = r7.LLJJIJIL
            r7.LJIIL(r0)
            X.0nBq r0 = r7.LLJJJJ
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L8e
            X.1DRG r2 = r0.LIZ
            r1 = 0
            if (r2 == 0) goto L8e
            java.lang.Class<X.0nBW> r0 = X.InterfaceC1424960nBW.class
            java.lang.Object r0 = r2.LJIIL(r1, r0)
            X.0nBW r0 = (X.InterfaceC1424960nBW) r0
            if (r0 == 0) goto L8e
            com.ss.android.ugc.aweme.services.mvtemplate.AVVideoViewComponentFactoryImpl r0 = r0.LIZ()
            if (r0 == 0) goto L8e
            kotlin.Pair r0 = r0.getLastTryResumeVideoInfo()
            if (r0 == 0) goto L8e
            java.lang.Object r2 = r0.getFirst()
            java.lang.Object r1 = r0.getSecond()
            java.lang.String r0 = r4.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L8e
            java.lang.String r0 = X.C1425240nBy.LIZ(r7, r6)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L8e
            float r0 = r7.getVideoProgress()
            r7.LJ(r0)
        L85:
            r7.LLJLILLLLZIIL = r3
            long r0 = java.lang.System.currentTimeMillis()
            r7.LLJLL = r0
        L8d:
            return
        L8e:
            java.lang.String r0 = X.C1425240nBy.LIZ(r7, r6)
            r5.tryResume(r4, r0)
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1425090nBj.LJI(boolean):void");
    }

    public final void LJII(boolean z) {
        this.LLJJL = false;
        C337180DJs.LIZ(this.LLJ);
        if (C299160Bo2.LIZ()) {
            C1484970okJ playRequest = getPlayRequest();
            if (playRequest != null) {
                InterfaceC1425150nBp playerManager = getPlayerManager();
                if (playerManager != null) {
                    playerManager.LJIIJJI(playRequest);
                }
                InterfaceC1425150nBp playerManager2 = getPlayerManager();
                if (playerManager2 != null) {
                    playerManager2.LJII(playRequest, this.LLJLLL);
                }
            }
        } else {
            C1425160nBq c1425160nBq = this.LLJJJJ;
            if (c1425160nBq != null) {
                c1425160nBq.stop();
            }
            LJIIJ(2, 0, null, this.LLJJIJIL);
        }
        C337180DJs.LIZ(this.LLIZLLLIL);
        C337180DJs.LIZJ(this.LLIZ);
        if (!z) {
            LIZJ();
        }
    }

    public final void LJIIIZ(boolean z) {
        int i;
        SmartImageView smartImageView = this.LLIZ;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LLFF(i, smartImageView);
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (!z) {
            i2 = 4;
        }
        C786410Ut5.LJZ(i2, frameLayout);
    }

    public final void LJIIL(CutsameDataItem cutsameDataItem) {
        boolean z;
        Integer numValueOf;
        if (cutsameDataItem == null) {
            return;
        }
        C1425160nBq c1425160nBq = this.LLJJJJ;
        if (c1425160nBq != null && (numValueOf = Integer.valueOf(c1425160nBq.getCacheSize(C1419160n2A.LIZ(cutsameDataItem)))) != null && numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLLIL = z;
    }

    public final void setDiContainer(C1DRG c1drg) {
        this.LLJJJIL = c1drg;
    }

    public final void LIZLLL(int i, String str) {
        long currentPosition;
        long videoDuration;
        InterfaceC1425260nC0 interfaceC1425260nC0 = this.LLILZIL;
        int i2 = this.LLILZ;
        C1419590n2r c1419590n2r = this.LLILLL;
        C1425160nBq c1425160nBq = this.LLJJJJ;
        if (c1425160nBq != null) {
            currentPosition = c1425160nBq.getCurrentPosition();
        } else {
            currentPosition = 0;
        }
        C1425160nBq c1425160nBq2 = this.LLJJJJ;
        if (c1425160nBq2 != null) {
            videoDuration = c1425160nBq2.getVideoDuration();
        } else {
            videoDuration = 0;
        }
        interfaceC1425260nC0.F1(new C1422540n7c(i, str, i2, null, currentPosition, videoDuration, 1, c1419590n2r));
    }

    public final void LJIIJ(int i, int i2, String str, CutsameDataItem cutsameDataItem) {
        String str2;
        VideoUrlModel playAddr;
        List<String> urlList;
        if (!this.LLJLILLLLZIIL && this.LLJLL > 0) {
            this.LLJLILLLLZIIL = true;
            if (cutsameDataItem != null && (playAddr = C1419160n2A.LIZ(cutsameDataItem).getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null) {
                str2 = (String) C13LP.LJJJLL(urlList);
            } else {
                str2 = null;
            }
            C1419580n2q.LJI(i, cutsameDataItem, System.currentTimeMillis() - this.LLJLL, i2, str, str2, 2, this.LLJLLIL, this.LLILZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0248  */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.0nBo] */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.0nBt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1425090nBj(X.C19EG r14, com.bytedance.scene.Scene r15, X.C1419590n2r r16, int r17, X.InterfaceC1425040nBe r18) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1425090nBj.<init>(X.19EG, com.bytedance.scene.Scene, X.0n2r, int, X.0nBe):void");
    }
}
