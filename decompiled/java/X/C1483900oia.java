package X;

import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483900oia implements InterfaceC1483770oiN {
    public final InterfaceC1483670oiD LIZ;
    public final C1482590ogT LIZIZ;
    public final C1483920oic LIZJ;
    public InterfaceC1483990oij LIZLLL;
    public final C339460DSm LJ;
    public OnPreRenderListener LJFF;
    public String LJI;
    public final LruCache<String, WeakReference<InterfaceC1483820oiS>> LJII;

    public C1483900oia() {
        throw null;
    }

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

    public C1483900oia(InterfaceC1483670oiD interfaceC1483670oiD) {
        C1482590ogT c1482590ogT = new C1482590ogT();
        C339460DSm c339460DSm = new C339460DSm();
        LruCache<String, WeakReference<InterfaceC1483820oiS>> lruCache = new LruCache<>(10);
        this.LIZ = interfaceC1483670oiD;
        this.LIZIZ = c1482590ogT;
        this.LJ = c339460DSm;
        this.LJII = lruCache;
        this.LIZJ = new C1483920oic(interfaceC1483670oiD);
    }

    @Override // X.InterfaceC1483770oiN
    public final void LIZIZ(C1482520ogM c1482520ogM) {
        this.LJFF = c1482520ogM;
    }

    @Override // X.InterfaceC1483770oiN
    public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
        this.LJ.LIZ(interfaceC1483820oiS.getPlayViewContainer());
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
        boolean z = c1484040oio.LIZIZ;
        int i = c1484040oio.LIZJ;
        FrameLayout frameLayoutLIZIZ = this.LJ.LIZIZ(z);
        if (frameLayoutLIZIZ == null && (frameLayoutLIZIZ = c1484040oio.LIZLLL) == null && (weakReference = this.LJII.get(c1484040oio.LIZ.getKey())) != null && (interfaceC1483820oiS = weakReference.get()) != null) {
            frameLayoutLIZIZ = interfaceC1483820oiS.getPlayViewContainer();
        }
        if (frameLayoutLIZIZ == null) {
            C786410Ut5.j4("preRender nearbyContainer null, return. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        if (TextUtils.equals(interfaceC1479620obg.getKey(), this.LJI)) {
            C786410Ut5.j4("triggerPreRender. mPreparingAid exists, return. mPreparingAid:%s, type:%s, isBelowCurrent:%s", new Object[]{this.LJI, Integer.valueOf(i), Boolean.valueOf(z)});
            return;
        }
        this.LJI = interfaceC1479620obg.getKey();
        View viewFindViewWithTag = frameLayoutLIZIZ.findViewWithTag("VIDEO_VIEW_TAG");
        if (viewFindViewWithTag == null) {
            C786410Ut5.j4("do preRender when videoView null. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
            interfaceC1483990oijLIZLLL = this.LIZIZ.LIZ(frameLayoutLIZIZ);
            interfaceC1483990oijLIZLLL.LJIJJ(frameLayoutLIZIZ);
        } else {
            C786410Ut5.j4("do preRender when videoView attached. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
            interfaceC1483990oijLIZLLL = this.LIZIZ.LIZLLL(viewFindViewWithTag);
            if (interfaceC1483990oijLIZLLL == null) {
                C786410Ut5.j4("do preRender error:surfaceHolder null. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
                return;
            }
        }
        EnumC1481210oeF.INS.recordPreRenderAction(this.LJI, i);
        C786410Ut5.j4("really do preRender. aid:%s, type:%s, isBelowCurrent:%s", new Object[]{interfaceC1479620obg.getKey(), Integer.valueOf(i), Boolean.valueOf(z)});
        if (interfaceC1479620obg.LIZLLL() != null && interfaceC1479620obg.LIZLLL().LIZ == null) {
            interfaceC1479620obg.LIZLLL().LIZ = this.LJFF;
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
}
