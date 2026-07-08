package X;

import Y.ARunnableS92S0200000_23;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oi7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483610oi7 extends AbstractC1483760oiM {
    public InterfaceC1483670oiD LIZIZ;
    public InterfaceC1482530ogN LIZJ;
    public C1482520ogM LIZLLL;
    public final C1024680clu LJ;
    public final InterfaceC1483770oiN LJFF;
    public final C1483310ohd LJI;
    public InterfaceC1479620obg LJII;

    @Override // X.InterfaceC1484830ok5
    public final void LJIIIIZZ(String str, List<? extends InterfaceC1479620obg> list) {
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1483420oho LJIIIZ() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        return new C1481770of9(interfaceC1483670oiD != null ? interfaceC1483670oiD.LJIIIZ() : null);
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1488100opM LJIILIIL() {
        return new C1483800oiQ(this.LIZIZ);
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC650720Pfi getLegacy() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            return interfaceC1483670oiD.getLegacy();
        }
        return null;
    }

    @Override // X.InterfaceC1484830ok5
    public final InterfaceC1483850oiV getPlayState() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        return new C1484060oiq(interfaceC1483670oiD != null ? interfaceC1483670oiD.getPlayState() : null);
    }

    @Override // X.InterfaceC1484830ok5
    public final void pause() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.pause();
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void reset() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.reset();
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void resume() {
        if (this.LIZ.LIZ == 3) {
            InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
            if (interfaceC1483670oiD != null) {
                interfaceC1483670oiD.resume();
                return;
            }
            return;
        }
        if (LJIIJ(this.LJII)) {
            InterfaceC1483670oiD interfaceC1483670oiD2 = this.LIZIZ;
            if (interfaceC1483670oiD2 != null) {
                interfaceC1483670oiD2.resume();
                return;
            }
            return;
        }
        InterfaceC1483770oiN interfaceC1483770oiN = this.LJFF;
        if (interfaceC1483770oiN != null) {
            interfaceC1483770oiN.resume();
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void stop() {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.stop();
        }
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void release() {
        super.release();
        C1482520ogM c1482520ogM = this.LIZLLL;
        if (c1482520ogM != null) {
            c1482520ogM.LIZLLL(this.LJI);
        }
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.LJJIJ(null);
        }
        this.LIZLLL = null;
        InterfaceC1483670oiD interfaceC1483670oiD2 = this.LIZIZ;
        if (interfaceC1483670oiD2 != null) {
            interfaceC1483670oiD2.release();
        }
        InterfaceC1483770oiN interfaceC1483770oiN = this.LJFF;
        if (interfaceC1483770oiN != null) {
            interfaceC1483770oiN.release();
        }
    }

    @Override // X.InterfaceC1484830ok5
    @InterfaceC1294060jmO
    public final InterfaceC1483670oiD LJIILL() {
        return this.LIZIZ;
    }

    public C1483610oi7(C1478410oZj c1478410oZj) {
        InterfaceC1483670oiD interfaceC1483670oiD;
        InterfaceC1483810oiR interfaceC1483810oiRLJIILIIL;
        InterfaceC1483810oiR interfaceC1483810oiRLJIILIIL2;
        InterfaceC1483810oiR interfaceC1483810oiRLJIILIIL3;
        C1024680clu c1024680clu = new C1024680clu();
        this.LJ = c1024680clu;
        if (C582130MsN.LIZ().getConfig().getSimPlayerExperiment().isOpenPlayerReleaseOpt()) {
            this.LIZIZ = new C1483660oiC(c1478410oZj);
        } else if (c1478410oZj.LIZLLL) {
            this.LIZIZ = ISimPlayerService.LIZ.get().LJIIIIZZ(new C1476570oWl(c1478410oZj.LJFF, c1478410oZj.LJ, 8));
        } else {
            this.LIZIZ = ISimPlayerService.LIZ.get().LJFF();
        }
        this.LIZ = c1478410oZj;
        if (c1478410oZj.LIZ == 3) {
            InterfaceC1483670oiD interfaceC1483670oiD2 = this.LIZIZ;
            if (interfaceC1483670oiD2 != null && (interfaceC1483810oiRLJIILIIL3 = interfaceC1483670oiD2.LJIILIIL()) != null) {
                interfaceC1483810oiRLJIILIIL3.LIZIZ(new C1481200oeE());
                return;
            }
            return;
        }
        C1482520ogM c1482520ogM = new C1482520ogM(this.LIZJ, this.LIZIZ);
        this.LIZLLL = c1482520ogM;
        c1482520ogM.LLJILJIL = c1024680clu;
        InterfaceC1483670oiD interfaceC1483670oiD3 = this.LIZIZ;
        if (interfaceC1483670oiD3 != null) {
            interfaceC1483670oiD3.LJJIJ(c1482520ogM);
        }
        InterfaceC1483670oiD interfaceC1483670oiD4 = this.LIZIZ;
        if (interfaceC1483670oiD4 != null) {
            interfaceC1483670oiD4.LJIL(C1475000oUE.LJIIIIZZ());
        }
        if ((C582130MsN.LIZ().getConfig().getSimPlayerConfig().perfEventEnabled() || C582130MsN.LIZ().getConfig().getSimPlayerConfig().perfEventEnabledInPlayRequest()) && (interfaceC1483670oiD = this.LIZIZ) != null && (interfaceC1483810oiRLJIILIIL = interfaceC1483670oiD.LJIILIIL()) != null) {
            interfaceC1483810oiRLJIILIIL.LIZ(new C588740N7g());
        }
        InterfaceC1483670oiD interfaceC1483670oiD5 = this.LIZIZ;
        if (interfaceC1483670oiD5 != null && (interfaceC1483810oiRLJIILIIL2 = interfaceC1483670oiD5.LJIILIIL()) != null) {
            interfaceC1483810oiRLJIILIIL2.LIZIZ(new C1481200oeE());
        }
        if (((Boolean) C1474810oTv.g2.getValue()).booleanValue()) {
            final InterfaceC1483670oiD interfaceC1483670oiD6 = this.LIZIZ;
            this.LJFF = new InterfaceC1483770oiN(interfaceC1483670oiD6) { // from class: X.0oib
                public final InterfaceC1483670oiD LIZ;
                public final C1482590ogT LIZIZ;
                public final C1483920oic LIZJ;
                public InterfaceC1483990oij LIZLLL;
                public OnPreRenderListener LJ;
                public final LruCache<String, WeakReference<InterfaceC1483820oiS>> LJFF;

                @Override // X.InterfaceC1483770oiN
                public final void LJIIJJI(InterfaceC1483820oiS interfaceC1483820oiS) {
                }

                @Override // X.InterfaceC1483770oiN
                public final void LIZ() {
                    InterfaceC1483990oij interfaceC1483990oij = this.LIZLLL;
                    if (interfaceC1483990oij != null) {
                        interfaceC1483990oij.LJIJ();
                    }
                }

                @Override // X.InterfaceC1483770oiN
                public final void release() {
                    this.LIZIZ.LJFF();
                }

                @Override // X.InterfaceC1483770oiN
                public final void resume() {
                    C1483920oic c1483920oic = this.LIZJ;
                    if (c1483920oic != null) {
                        c1483920oic.LIZJ();
                    } else {
                        this.LIZ.resume();
                    }
                }

                {
                    C1482590ogT c1482590ogT = new C1482590ogT();
                    LruCache<String, WeakReference<InterfaceC1483820oiS>> lruCache = new LruCache<>(10);
                    this.LIZ = interfaceC1483670oiD6;
                    this.LIZIZ = c1482590ogT;
                    this.LJFF = lruCache;
                    this.LIZJ = new C1483920oic(interfaceC1483670oiD6);
                }

                @Override // X.InterfaceC1483770oiN
                public final void LIZIZ(C1482520ogM c1482520ogM2) {
                    this.LJ = c1482520ogM2;
                }

                @Override // X.InterfaceC1483770oiN
                public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
                    this.LIZLLL = LJI(interfaceC1483820oiS);
                }

                @Override // X.InterfaceC1483770oiN
                public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
                    SimRadar.keyScan("SurfaceBinder", "changePlayerHost", interfaceC1483820oiS);
                    InterfaceC1483990oij interfaceC1483990oijLJI = LJI(interfaceC1483820oiS);
                    this.LIZLLL = interfaceC1483990oijLJI;
                    this.LIZIZ.LJ(interfaceC1483990oijLJI);
                    C1483920oic c1483920oic = this.LIZJ;
                    InterfaceC1483990oij interfaceC1483990oij = this.LIZLLL;
                    c1483920oic.LIZIZ = interfaceC1483990oij;
                    interfaceC1483990oij.LJII(new C1483980oii(c1483920oic, interfaceC1483990oij));
                    new RunnableC1483950oif(this.LIZ, this.LIZLLL).run();
                }

                @Override // X.InterfaceC1483770oiN
                public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
                    interfaceC1479620obg.LJIIJ();
                    SimRadar.keyScan("ContainerBinder", "play", null);
                    this.LIZIZ.LJ(this.LIZLLL);
                    this.LIZJ.LIZ(interfaceC1479620obg, this.LIZLLL);
                    C786410Ut5.j4("play when videoView attached. aid:%s", new Object[]{interfaceC1479620obg.getKey()});
                }

                @Override // X.InterfaceC1483770oiN
                public final void LJFF(C1484040oio c1484040oio) {
                    InterfaceC1483990oij interfaceC1483990oijLIZLLL;
                    WeakReference<InterfaceC1483820oiS> weakReference;
                    InterfaceC1483820oiS interfaceC1483820oiS;
                    InterfaceC1479620obg interfaceC1479620obg = c1484040oio.LIZ;
                    int i = c1484040oio.LIZJ;
                    boolean z = c1484040oio.LIZIZ;
                    FrameLayout playViewContainer = c1484040oio.LIZLLL;
                    if (playViewContainer == null && (weakReference = this.LJFF.get(interfaceC1479620obg.getKey())) != null && (interfaceC1483820oiS = weakReference.get()) != null) {
                        playViewContainer = interfaceC1483820oiS.getPlayViewContainer();
                    }
                    if (playViewContainer == null) {
                        C786410Ut5.j4("do preRender when prerender container null. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
                        return;
                    }
                    View viewFindViewWithTag = playViewContainer.findViewWithTag("VIDEO_VIEW_TAG");
                    if (viewFindViewWithTag == null) {
                        C786410Ut5.j4("do preRender when videoView null. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
                        interfaceC1483990oijLIZLLL = this.LIZIZ.LIZ(playViewContainer);
                        interfaceC1483990oijLIZLLL.LJIJJ(playViewContainer);
                    } else {
                        C786410Ut5.j4("do preRender when videoView attached. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
                        interfaceC1483990oijLIZLLL = this.LIZIZ.LIZLLL(viewFindViewWithTag);
                        if (interfaceC1483990oijLIZLLL == null) {
                            C786410Ut5.j4("do preRender error:surfaceHolder null. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
                            return;
                        }
                    }
                    EnumC1481210oeF.INS.recordPreRenderAction(null, i);
                    C786410Ut5.j4("really do preRender. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
                    if (interfaceC1479620obg.LIZLLL() != null && interfaceC1479620obg.LIZLLL().LIZ == null) {
                        interfaceC1479620obg.LIZLLL().LIZ = this.LJ;
                    }
                    new C1483970oih(this.LIZ, interfaceC1483990oijLIZLLL, interfaceC1479620obg).run();
                }

                public final InterfaceC1483990oij LJI(InterfaceC1483820oiS interfaceC1483820oiS) {
                    FrameLayout playViewContainer = interfaceC1483820oiS.getPlayViewContainer();
                    View viewFindViewWithTag = playViewContainer.findViewWithTag("VIDEO_VIEW_TAG");
                    Boolean boolValueOf = Boolean.valueOf(interfaceC1483820oiS.bn());
                    interfaceC1483820oiS.hj();
                    if (viewFindViewWithTag == null) {
                        InterfaceC1483990oij interfaceC1483990oijLIZIZ = this.LIZIZ.LIZIZ(playViewContainer, boolValueOf, false);
                        if (interfaceC1483820oiS.getCustomSurfaceLifecycleListener() != null) {
                            interfaceC1483990oijLIZIZ.LJIIJJI(interfaceC1483820oiS.getCustomSurfaceLifecycleListener());
                        }
                        interfaceC1483990oijLIZIZ.LJIJJ(playViewContainer);
                        C786410Ut5.j4("attach when videoView null. container:%s", new Object[]{playViewContainer});
                        return interfaceC1483990oijLIZIZ;
                    }
                    return this.LIZIZ.LIZLLL(viewFindViewWithTag);
                }
            };
        } else {
            this.LJFF = new C1483680oiE(this.LIZIZ);
        }
        C1483310ohd c1483310ohd = new C1483310ohd(this.LIZIZ, this.LJFF);
        this.LJI = c1483310ohd;
        C1482520ogM c1482520ogM2 = this.LIZLLL;
        if (c1482520ogM2 != null) {
            c1482520ogM2.LIZ(c1483310ohd);
        }
        InterfaceC1483770oiN interfaceC1483770oiN = this.LJFF;
        if (interfaceC1483770oiN == null) {
            return;
        }
        interfaceC1483770oiN.LIZIZ(this.LIZLLL);
    }

    public static boolean LJIIJ(InterfaceC1479620obg interfaceC1479620obg) {
        C1479570obb c1479570obbLIZLLL;
        String format = null;
        if (interfaceC1479620obg != null) {
            format = interfaceC1479620obg.getFormat();
        }
        if (TextUtils.equals(format, "mp3") || (interfaceC1479620obg != null && (c1479570obbLIZLLL = interfaceC1479620obg.LIZLLL()) != null && c1479570obbLIZLLL.LJI && Intrinsics.LJFF("mp4", interfaceC1479620obg.getFormat()))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1484830ok5
    public final void LIZ(boolean z) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.LIZ(z);
        }
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final <T> T LIZIZ(AbstractC586270Mz3<T> abstractC586270Mz3) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            return (T) interfaceC1483670oiD.LIZIZ(abstractC586270Mz3);
        }
        return null;
    }

    @Override // X.InterfaceC1484830ok5
    public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
        String simpleName;
        if (this.LIZ.LIZ == 3) {
            return;
        }
        Object[] objArr = new Object[2];
        FrameLayout playViewContainer = interfaceC1483820oiS.getPlayViewContainer();
        if (playViewContainer != null) {
            simpleName = playViewContainer.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        objArr[0] = simpleName;
        objArr[1] = interfaceC1483820oiS.getSurface();
        SimRadar.keyScan("PlayerImpl", "attach", objArr);
        InterfaceC1483770oiN interfaceC1483770oiN = this.LJFF;
        if (interfaceC1483770oiN != null) {
            interfaceC1483770oiN.LIZJ(interfaceC1483820oiS);
        }
        C0NBW.LIZIZ().LIZ(interfaceC1483820oiS, "SimKitPlayer_ATTACH");
    }

    @Override // X.InterfaceC1484830ok5
    public final void LIZLLL(InterfaceC1483820oiS interfaceC1483820oiS) {
        InterfaceC1483770oiN interfaceC1483770oiN = this.LJFF;
        if (interfaceC1483770oiN != null) {
            interfaceC1483770oiN.LIZLLL(interfaceC1483820oiS);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        Runnable runnable;
        if (this.LIZ.LIZ == 3) {
            this.LJII = interfaceC1479620obg;
            if (interfaceC1479620obg.getRequest() != null) {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlayerImplMB", "play request PLAYER_TYPE_VOD_DEPRECATED !");
                }
                interfaceC1479620obg.getRequest().LJLLI = true;
                InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
                if (interfaceC1483670oiD != null) {
                    interfaceC1483670oiD.LJJJJJL(interfaceC1479620obg.getRequest());
                }
            }
        } else {
            interfaceC1479620obg.LJIIJ();
            SimRadar.keyScan("PlayerImpl", "play", null, interfaceC1479620obg.getKey());
            C1024680clu c1024680clu = this.LJ;
            c1024680clu.getClass();
            c1024680clu.LIZIZ = interfaceC1479620obg.getKey();
            this.LJII = interfaceC1479620obg;
            C1479570obb c1479570obbLIZLLL = interfaceC1479620obg.LIZLLL();
            if (c1479570obbLIZLLL != null) {
                c1479570obbLIZLLL.LJJIIZI = true;
            }
            C1479570obb c1479570obbLIZLLL2 = interfaceC1479620obg.LIZLLL();
            if (c1479570obbLIZLLL2 != null) {
                c1479570obbLIZLLL2.LJJIFFI = new ARunnableS92S0200000_23(this, interfaceC1479620obg, 115);
            }
            if (LJIIJ(interfaceC1479620obg)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("play audio:");
                sbLIZ.append(interfaceC1479620obg.getKey());
                C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC1483670oiD interfaceC1483670oiD2 = this.LIZIZ;
                if (interfaceC1483670oiD2 != null) {
                    interfaceC1483670oiD2.LJJJJJL(C1479540obY.LIZ(interfaceC1479620obg, null));
                }
                C1479570obb c1479570obbLIZLLL3 = interfaceC1479620obg.LIZLLL();
                if (c1479570obbLIZLLL3 != null && (runnable = c1479570obbLIZLLL3.LJJIFFI) != null) {
                    runnable.run();
                }
            } else {
                InterfaceC1483770oiN interfaceC1483770oiN = this.LJFF;
                if (interfaceC1483770oiN != null) {
                    interfaceC1483770oiN.LJ(interfaceC1479620obg);
                }
            }
            C0NBW.LIZIZ().LIZ(interfaceC1479620obg, "SimKitPlayer_PLAY");
        }
        C1479990ocH.LIZ.LIZ(this);
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJFF(C1484040oio c1484040oio) {
        InterfaceC1483770oiN interfaceC1483770oiN;
        if (this.LIZ.LIZ != 3 && (interfaceC1483770oiN = this.LJFF) != null) {
            interfaceC1483770oiN.LJFF(c1484040oio);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIIJJI(InterfaceC1483820oiS interfaceC1483820oiS) {
        InterfaceC1483770oiN interfaceC1483770oiN = this.LJFF;
        if (interfaceC1483770oiN != null) {
            interfaceC1483770oiN.LJIIJJI(interfaceC1483820oiS);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJIILLIIL(InterfaceC1482530ogN interfaceC1482530ogN) {
        if (this.LIZ.LIZ == 3) {
            return;
        }
        this.LIZJ = interfaceC1482530ogN;
        C1482520ogM c1482520ogM = this.LIZLLL;
        if (c1482520ogM != null) {
            c1482520ogM.LLILLJJLI = interfaceC1482530ogN;
        }
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJIIZILJ(InterfaceC1482530ogN interfaceC1482530ogN) {
        C1482520ogM c1482520ogM;
        if (this.LIZ.LIZ != 3 && (c1482520ogM = this.LIZLLL) != null) {
            c1482520ogM.LIZ(interfaceC1482530ogN);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJII(String str) {
        SimRadar.keyScan("PlayerImpl", "clearPlayList", "sceneID", str);
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJJIIZ(InterfaceC1482530ogN interfaceC1482530ogN) {
        C1482520ogM c1482520ogM;
        if (this.LIZ.LIZ != 3 && (c1482520ogM = this.LIZLLL) != null) {
            c1482520ogM.LIZLLL(interfaceC1482530ogN);
        }
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJJIIZI(InterfaceC1481870ofJ interfaceC1481870ofJ) {
        C1482520ogM c1482520ogM;
        if (this.LIZ.LIZ != 3 && (c1482520ogM = this.LIZLLL) != null) {
            c1482520ogM.LLILZ = interfaceC1481870ofJ;
        }
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJJJI(InterfaceC1483670oiD interfaceC1483670oiD) {
        this.LIZIZ = interfaceC1483670oiD;
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJJIL(InterfaceC1479620obg interfaceC1479620obg) {
        InterfaceC1483670oiD interfaceC1483670oiD;
        if (this.LIZ.LIZ == 3) {
            if (interfaceC1479620obg.getRequest() != null && (interfaceC1483670oiD = this.LIZIZ) != null) {
                interfaceC1483670oiD.LJJJLZIJ(interfaceC1479620obg.getRequest());
            }
        } else {
            InterfaceC1483670oiD interfaceC1483670oiD2 = this.LIZIZ;
            if (interfaceC1483670oiD2 != null) {
                interfaceC1483670oiD2.LJJJLZIJ(C1479540obY.LIZ(interfaceC1479620obg, null));
            }
        }
        C1479990ocH.LIZ.LIZ(this);
    }

    @Override // X.InterfaceC1484830ok5
    public final void LJJJLIIL(InterfaceC1472880oQo interfaceC1472880oQo) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.LJJZZI(interfaceC1472880oQo);
        }
    }

    @Override // X.AbstractC1483760oiM, X.InterfaceC1484830ok5
    public final void LJJLIIIJL(InterfaceC585470Mxl interfaceC585470Mxl) {
        InterfaceC1483810oiR interfaceC1483810oiRLJIILIIL;
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null && (interfaceC1483810oiRLJIILIIL = interfaceC1483670oiD.LJIILIIL()) != null) {
            interfaceC1483810oiRLJIILIIL.LIZ(interfaceC585470Mxl);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void seek(float f) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.seek(f);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void setLoop(boolean z) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.setLoop(z);
        }
    }

    @Override // X.InterfaceC1484830ok5
    public final void setSpeed(float f) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.setSpeed(f);
        }
        this.LJ.LIZ(f);
    }

    @Override // X.InterfaceC1484830ok5
    public final void stop(String str) {
        InterfaceC1483670oiD interfaceC1483670oiD = this.LIZIZ;
        if (interfaceC1483670oiD != null) {
            interfaceC1483670oiD.stop();
        }
        C1482520ogM c1482520ogM = this.LIZLLL;
        if (c1482520ogM != null) {
            c1482520ogM.LLIZ = false;
            c1482520ogM.LLIZLLLIL = str;
        }
    }
}
