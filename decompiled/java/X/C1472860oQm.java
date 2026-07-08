package X;

import android.os.SystemClock;
import android.view.Surface;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.Map;

/* JADX INFO: renamed from: X.0oQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472860oQm extends C1469760oLm {
    public boolean LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public InterfaceC1472880oQo LLJ;

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJIILIIL() {
        this.LLILLL = true;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJIJ() {
        this.LLILLL = false;
        this.LLILZ = false;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJI() {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        player.LLJJJJJIL(new InterfaceC1469360oL8() { // from class: X.0oQn
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
                C1472860oQm c1472860oQm = this.LL;
                if (c1472860oQm.LLILZ) {
                    c1472860oQm.LLILZ = false;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C1472860oQm c1472860oQm2 = this.LL;
                    long j = jElapsedRealtime - c1472860oQm2.LLILZIL;
                    InterfaceC1472880oQo interfaceC1472880oQo = c1472860oQm2.LLJ;
                    if (interfaceC1472880oQo != null) {
                        interfaceC1472880oQo.LJLIL(j);
                        this.LL.LLJ.LJLJL();
                    }
                }
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
                if (this.LL.LLILZ) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C1472860oQm c1472860oQm = this.LL;
                    long j = jElapsedRealtime - c1472860oQm.LLILZIL;
                    InterfaceC1472880oQo interfaceC1472880oQo = c1472860oQm.LLJ;
                    if (interfaceC1472880oQo != null) {
                        interfaceC1472880oQo.LJLJJL(j);
                        this.LL.LLJ.LJLJI();
                    }
                }
            }
        });
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIJIIJIL() {
        if (this.LLILZ && this.LLILZLL == 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILZIL;
            this.LLILZLL = jElapsedRealtime;
            InterfaceC1472880oQo interfaceC1472880oQo = this.LLJ;
            if (interfaceC1472880oQo != null) {
                interfaceC1472880oQo.LJLL(jElapsedRealtime);
            }
        }
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIJLIJ() {
        if (this.LLILZ) {
            this.LLIZLLLIL = SystemClock.elapsedRealtime() - this.LLILZIL;
            InterfaceC1472880oQo interfaceC1472880oQo = this.LLJ;
            if (interfaceC1472880oQo != null) {
                interfaceC1472880oQo.LJLJJLL(this.LLIZ);
                this.LLJ.LJLIIL(this.LLIZLLLIL);
                this.LLJ.LJLIIIL();
            }
        }
    }

    public C1472860oQm(InterfaceC1471960oPK interfaceC1471960oPK) {
        super(interfaceC1471960oPK);
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJII(Surface surface) {
        if (this.LLILZ) {
            this.LLIZ = SystemClock.elapsedRealtime() - this.LLILZIL;
            InterfaceC1472880oQo interfaceC1472880oQo = this.LLJ;
            if (interfaceC1472880oQo != null) {
                interfaceC1472880oQo.LJLJJI();
            }
        }
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIIJZLJL(Map<String, Object> map) {
        if (this.LLILLL) {
            this.LLILZ = true;
            this.LLILZIL = SystemClock.elapsedRealtime();
        }
        this.LLILLL = false;
    }
}
