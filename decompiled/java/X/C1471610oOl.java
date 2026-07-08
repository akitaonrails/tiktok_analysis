package X;

import Y.ARunnableS28S1100000_23;
import android.view.Surface;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oOl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471610oOl extends C1469760oLm {
    public Surface LLILLL;
    public boolean LLILZ;

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJIILJJIL() {
        this.LLILLL = null;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJIILL() {
        Surface surface;
        boolean z;
        Boolean bool;
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player != null) {
            if (!this.LLILLJJLI.ue().LJJIII || player.LJJJJZI(43) == 2) {
                Surface surface2 = this.LLILLL;
                if (!((Boolean) C1474810oTv.U.getValue()).booleanValue()) {
                    surface = this.LLILLL;
                    z = this.LLILZ;
                } else {
                    if (surface2 == null || C1471640oOo.LIZ(surface2) != null) {
                        return;
                    }
                    z = false;
                    surface = surface2;
                }
                if (z || surface2 == null || !Intrinsics.LJFF(surface, surface2) || surface == null || (bool = C1471640oOo.LIZLLL.get(surface)) == null || !bool.booleanValue() || !((Boolean) C1474810oTv.T.getValue()).booleanValue() || !(surface2 instanceof InterfaceC1471580oOi)) {
                    return;
                }
                C786410Ut5.LJJZZIII(this.LL, new ARunnableS28S1100000_23(surface2, 19));
            }
        }
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJI() {
        final C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player != null) {
            player.LLJJJJJIL(new InterfaceC1469360oL8() { // from class: X.0oOm
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
                public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
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
                    C1471610oOl c1471610oOl = this.LL;
                    C1472150oPd c1472150oPd = player;
                    c1471610oOl.getClass();
                    int iLJJJJZI = c1472150oPd.LJJJJZI(1071);
                    boolean z = true;
                    if (iLJJJJZI != 1) {
                        z = false;
                    }
                    Surface surface = this.LL.LLILLL;
                    if (surface != null) {
                        C1471640oOo.LIZLLL.put(surface, Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    public C1471610oOl(InterfaceC1471960oPK interfaceC1471960oPK) {
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
