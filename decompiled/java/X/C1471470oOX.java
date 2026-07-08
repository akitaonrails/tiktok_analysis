package X;

import android.os.SystemClock;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.Map;

/* JADX INFO: renamed from: X.0oOX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471470oOX extends C1469760oLm {
    public final C1471500oOa LLILLL;
    public InterfaceC1468030oIz LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJI() {
        this.LLJ = 0;
        final C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        player.LJIJJLI.LIZLLL(new InterfaceC1467760oIY() { // from class: X.0oOY
            @Override // X.InterfaceC1467760oIY
            public final boolean LJJIIZI(C1470240oMY c1470240oMY) {
                this.LL.LLILLL.LJII = new C1474600oTa(c1470240oMY);
                return false;
            }
        });
        player.LLJJJJJIL(new InterfaceC1469360oL8() { // from class: X.0oOZ
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
                if (player != null) {
                    if (!((Boolean) C1474810oTv.g3.getValue()).booleanValue()) {
                        this.LLILLJJLI.LLILLL.LIZ = player.LJJJJZI(43);
                        this.LLILLJJLI.LLILLL.LIZIZ = player.LJJJJZI(45);
                        if (this.LLILLJJLI.LLILLL.LIZIZ < 0 || this.LLILLJJLI.LLILLL.LIZ < 0) {
                            this.LLILLJJLI.LLILLL.LIZIZ = player.LJJJJZI(46);
                            this.LLILLJJLI.LLILLL.LIZ = player.LJJJJZI(44);
                        }
                    }
                    this.LLILLJJLI.LLILLL.LIZJ = player.LJJJJZI(47);
                    this.LLILLJJLI.LLILLL.LJIIIIZZ = player.LJJJJZI(371);
                    C1471470oOX c1471470oOX = this.LLILLJJLI;
                    c1471470oOX.LLILLL.LJIIIZ = c1471470oOX.LLJ;
                    this.LLILLJJLI.LLILLL.LJIIJ = player.LJJJJZI(667);
                    C1468160oJC c1468160oJC = player.LIZ.LLLZIL;
                    if (c1468160oJC != null) {
                        C1471500oOa c1471500oOa = this.LLILLJJLI.LLILLL;
                        c1468160oJC.LJJJI();
                        c1471500oOa.getClass();
                    }
                }
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EngineVideoInfoHelper: onVideoSizeChanged(): ");
                    sbLIZ.append(tTVideoEngine);
                    sbLIZ.append(" -> ");
                    sbLIZ.append(i);
                    sbLIZ.append("X");
                    sbLIZ.append(i2);
                    C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LLILLJJLI.LLILLL.LIZLLL = i;
                this.LLILLJJLI.LLILLL.LJ = i2;
            }
        });
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIIZI() {
        this.LLJ = 1;
        if (this.LLILLJJLI.LJIIIZ().get(51, 0) > 0) {
            this.LLJ = 2;
        }
        this.LLIZLLLIL = SystemClock.elapsedRealtime();
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIZ(Map<String, Object> map) {
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIJ() {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        this.LLIZ = SystemClock.elapsedRealtime();
        this.LLILZ = player.LJJL();
        this.LLILLL.LJFF = player.LJJJLZIJ(315);
        this.LLILLL.LJIIL = player.LJJLIIIJJIZ(1415);
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIJIL() {
        this.LLILZIL = 0L;
        if (this.LLIZ != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.LLIZ;
            this.LLILZIL = jElapsedRealtime - j;
            this.LLILZLL = this.LLIZLLLIL - j;
            this.LLIZ = 0L;
            this.LLIZLLLIL = 0L;
        }
    }

    public C1471470oOX(InterfaceC1471960oPK interfaceC1471960oPK) {
        super(interfaceC1471960oPK);
        this.LLILLL = new C1471500oOa();
        this.LLJ = -1;
        this.LLJI = false;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIIJZLJL(Map<String, Object> map) {
        if (map.get("set_cookie_token") != null) {
            this.LLJI = ((Boolean) map.get("set_cookie_token")).booleanValue();
        } else {
            this.LLJI = false;
        }
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIL(boolean z) {
        if (((Boolean) C1474810oTv.i3.getValue()).booleanValue() && !z) {
            this.LLJ = -1;
        }
    }
}
