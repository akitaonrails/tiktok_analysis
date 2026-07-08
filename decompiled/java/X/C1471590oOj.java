package X;

import Y.ARunnableS123S0100000_23;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471590oOj extends C1469760oLm {
    public Surface LLILLL;
    public boolean LLILZ;

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJIILJJIL() {
        this.LLILLL = null;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472340oPw
    public final Map<String, String> LJIL() {
        return new HashMap();
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJI() {
        final C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        player.LLJJJJJIL(new InterfaceC1469360oL8() { // from class: X.0oOk
            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJI(e eVar) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIILIIL(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIILL(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJ(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJLI(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJII(int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIIJ(int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIJ(Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJL(e eVar, String str) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIIJ(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJ(TTVideoEngine tTVideoEngine) {
                if (C1474810oTv.LLJLILLLLZIIL() && this.LLILLJJLI.LLILZ) {
                    boolean z = true;
                    if (player.LJJJJZI(1071) != 1) {
                        z = false;
                    }
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onRenderStart() isUseNativeRender = ");
                        sbLIZ.append(z);
                        sbLIZ.append(", surface = ");
                        sbLIZ.append(this.LLILLJJLI.LLILLL);
                        sbLIZ.append(", rendertype = ");
                        sbLIZ.append(player.LJJJJZI(1071));
                        C1481110oe5.LIZIZ("EngineRefreshSurfaceHelper", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    Surface surface = this.LLILLJJLI.LLILLL;
                    if (surface != null) {
                        C1471640oOo.LIZLLL.put(surface, Boolean.valueOf(z));
                    }
                }
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJJJJLL(TTVideoEngine tTVideoEngine) {
                Surface surface = this.LLILLJJLI.LLILLL;
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("triggerRefreshSurface() curSurface:");
                    sbLIZ.append(this.LLILLJJLI.LLILLL);
                    C1481110oe5.LIZIZ("EngineRefreshSurfaceHelper", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (surface != null) {
                    C786410Ut5.LJJZZIII(this.LLILLJJLI.LL, new ARunnableS123S0100000_23(surface, 97));
                }
            }
        });
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIJ() {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        int iLJJJJZI = player.LJJJJZI(43);
        boolean z = this.LLILLJJLI.ue().LJJIII;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBeforeStop. codecName = ");
            sbLIZ.append(iLJJJJZI);
            sbLIZ.append(", isConfigNativeWindow = ");
            sbLIZ.append(z);
            C1481110oe5.LIZIZ("EngineRefreshSurfaceHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!z || iLJJJJZI == 2) {
            return;
        }
        Surface surface = this.LLILLL;
        this.LLILLL = null;
        if (surface == null) {
            return;
        }
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("EngineRefreshSurfaceHelper", "onBeforeStop. do refresh surface");
        }
        if ((surface instanceof InterfaceC1471580oOi) || !((Boolean) C1474810oTv.LLIIJLIL.getValue()).booleanValue() || C1474810oTv.LLJLILLLLZIIL()) {
            return;
        }
        SurfaceHolder surfaceHolderLIZ = C1471640oOo.LIZ(surface);
        InterfaceC1471580oOi interfaceC1471580oOi = C1471640oOo.LJ.get(surface);
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onBeforeStop. holder = ");
            sbLIZ2.append(surfaceHolderLIZ);
            sbLIZ2.append(", listener = ");
            sbLIZ2.append(interfaceC1471580oOi);
            C1481110oe5.LIZIZ("EngineRefreshSurfaceHelper", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (surfaceHolderLIZ == null || interfaceC1471580oOi == null) {
            return;
        }
        interfaceC1471580oOi.LJI("EngineRefreshSurfaceHelper: NativeWindow");
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJIILL() {
        C1472150oPd player;
        Surface surface;
        if (!C1474810oTv.LLJLILLLLZIIL() || !this.LLILZ || (player = this.LLILLJJLI.getPlayer()) == null || (surface = this.LLILLL) == null) {
            return;
        }
        Boolean bool = C1471640oOo.LIZLLL.get(surface);
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBeforeStart. last use native render = ");
            sbLIZ.append(bool);
            sbLIZ.append(", curSurface = ");
            sbLIZ.append(this.LLILLL);
            C1481110oe5.LIZIZ("EngineRefreshSurfaceHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        boolean z = this.LLILLJJLI.ue().LJJIII && player.LJJJJZI(43) != 2;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onBeforeStart. this time use native render = ");
            sbLIZ2.append(z);
            C1481110oe5.LIZIZ("EngineRefreshSurfaceHelper", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (z) {
            return;
        }
        SurfaceHolder surfaceHolderLIZ = C1471640oOo.LIZ(this.LLILLL);
        InterfaceC1471580oOi interfaceC1471580oOi = C1471640oOo.LJ.get(this.LLILLL);
        if (surfaceHolderLIZ == null || interfaceC1471580oOi == null) {
            return;
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onBeforeStart. will dorefreshSurface, surface = ");
            sbLIZ3.append(this.LLILLL);
            C1481110oe5.LIZIZ("EngineRefreshSurfaceHelper", C2188811AlT.LIZIZ(sbLIZ3));
        }
        C786410Ut5.LJJZZIII(this.LL, new ARunnableS123S0100000_23(interfaceC1471580oOi, 98));
        C1471640oOo.LIZLLL(this.LLILLL);
    }

    public C1471590oOj(InterfaceC1471960oPK interfaceC1471960oPK) {
        super(interfaceC1471960oPK);
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIFFI(Surface surface) {
        boolean z;
        this.LLILLL = surface;
        if (surface != null) {
            if (C1471640oOo.LIZ(surface) != null) {
                z = true;
            } else {
                z = false;
            }
            this.LLILZ = z;
        }
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIL(boolean z) {
        this.LLILLL = null;
    }
}
