package X;

import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472840oQk extends C1469760oLm {
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJIIJJI() {
        this.LLILZLL = true;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJIIL() {
        this.LLILZLL = false;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIJIL() {
        this.LLILLL = 0;
        this.LLILZ = 0;
        this.LLILZIL = 0;
        this.LLILZLL = false;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJI() {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player != null) {
            player.LLJJJJJIL(new InterfaceC1469360oL8() { // from class: X.0oQl
                public boolean LL;

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
                    this.LL = true;
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJJJLIIL(int i, int i2, int i3) {
                    if (i == 0) {
                        C1472840oQk c1472840oQk = this.LLILLJJLI;
                        c1472840oQk.LLILLL++;
                        if (!this.LL) {
                            c1472840oQk.LLILZ++;
                        }
                        if (c1472840oQk.LLILZLL) {
                            c1472840oQk.LLILZIL++;
                        }
                    }
                }
            });
        }
    }

    @Override // X.C1469760oLm, X.InterfaceC1472340oPw
    public final Map<String, String> LJJIII() {
        int i = (this.LLILLL - this.LLILZIL) - this.LLILZ;
        if (i < 0) {
            i = 0;
        }
        HashMap map = new HashMap();
        map.put("block_cnt_exclude_render_seeking", String.valueOf(i));
        return map;
    }

    public C1472840oQk(InterfaceC1471960oPK interfaceC1471960oPK) {
        super(interfaceC1471960oPK);
    }
}
