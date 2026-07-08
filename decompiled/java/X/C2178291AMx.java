package X;

import Y.ARunnableS133S0100000_33;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.a4;
import fyo.e;

/* JADX INFO: renamed from: X.1AMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178291AMx implements a4 {
    public final C2178261AMu LL;
    public final InterfaceC2178301AMy LLILLJJLI;
    public long LLILLL = Long.MIN_VALUE;
    public long LLILZ = Long.MIN_VALUE;
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());

    @Override // cxo.a4
    public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // cxo.a4
    public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // cxo.a4
    public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    @Override // cxo.a4
    public final void LJIJJLI(int i) {
    }

    public final void LIZ() {
        long jLIZIZ = this.LL.LIZIZ();
        if (jLIZIZ != this.LLILLL) {
            this.LLILLJJLI.LJIIJJI(jLIZIZ);
            if (Math.abs(jLIZIZ - this.LLILZ) >= 500) {
                this.LLILLJJLI.LJIIJ(jLIZIZ);
                this.LLILZ = jLIZIZ;
            }
            this.LLILLL = jLIZIZ;
        }
        C786410Ut5.LJLIIIL(this.LLILZIL, new ARunnableS133S0100000_33(this, 111), this, SystemClock.uptimeMillis() + 50);
    }

    @Override // cxo.a4
    public final void LJ(TTVideoEngine tTVideoEngine) {
        this.LLILLJJLI.LJII();
        this.LLILLJJLI.LJIIIIZZ(C1ANF.PLAYBACK_STATE_START);
        C2178261AMu c2178261AMu = this.LL;
        long j = c2178261AMu.LJI;
        c2178261AMu.LJI = 0L;
        if (j > 0) {
            c2178261AMu.LJI(j, null);
        }
    }

    @Override // cxo.a4
    public final void LJI(e eVar) {
        C1AN0 c1an0;
        if (eVar == null) {
            c1an0 = C1AN0.UNKNOWN;
        } else if (eVar.LIZLLL() != 1001 && eVar.LIZLLL() != 1003 && eVar.LIZLLL() != 1000) {
            c1an0 = C1AN0.UNKNOWN;
        } else {
            c1an0 = C1AN0.NETWORK_ERROR;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> onError()  internal  --- errorCode is ");
        sbLIZ.append(c1an0.name());
        C2178901APg.LIZ("TTAudioEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.LJFF(c1an0);
    }

    @Override // cxo.a4
    public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
        this.LLILLJJLI.LJIIIZ();
    }

    @Override // cxo.a4
    public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
        this.LLILLJJLI.LJI();
        C2178261AMu c2178261AMu = this.LL;
        c2178261AMu.LJ = true;
        if (c2178261AMu.LJFF) {
            c2178261AMu.LIZLLL(-1L);
        }
    }

    @Override // cxo.a4
    public final void LJIILL(TTVideoEngine tTVideoEngine) {
        this.LLILLJJLI.LJIILL();
    }

    public C2178291AMx(C2178261AMu c2178261AMu, InterfaceC2178301AMy interfaceC2178301AMy) {
        this.LL = c2178261AMu;
        this.LLILLJJLI = interfaceC2178301AMy;
    }

    @Override // cxo.a4
    public final void LIZJ(TTVideoEngine tTVideoEngine, int i) {
        if (i == 1 || i == 2) {
            this.LL.LJFF = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> onPlaybackStateChanged()  internal  ---  current state is ");
        sbLIZ.append(C1AND.LIZ(i).name());
        C2188811AlT.LIZIZ(sbLIZ);
        if (i == 1) {
            C786410Ut5.LJLIIIL(this.LLILZIL, new ARunnableS133S0100000_33(this, 110), this, SystemClock.uptimeMillis() + 50);
        } else {
            this.LLILLJJLI.LJIIJ(this.LL.LIZIZ());
            this.LLILZIL.removeCallbacksAndMessages(this);
        }
        this.LLILLJJLI.LJIIIIZZ(C1AND.LIZ(i));
    }

    @Override // cxo.a4
    public final void LJIIL(TTVideoEngine tTVideoEngine, int i) {
        this.LLILLJJLI.LJIILIIL();
    }

    @Override // cxo.a4
    public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
        EnumC1782190wTh enumC1782190wTh;
        if (i != 1) {
            if (i != 2) {
                enumC1782190wTh = EnumC1782190wTh.LOAD_STATE_ERROR;
            } else {
                enumC1782190wTh = EnumC1782190wTh.LOAD_STATE_STALLED;
            }
        } else {
            enumC1782190wTh = EnumC1782190wTh.LOAD_STATE_PLAYABLE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> onLoadStateChanged()  internal --- state is ");
        sbLIZ.append(enumC1782190wTh.name());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI.LJIILJJIL(enumC1782190wTh);
    }

    @Override // cxo.a4
    public final void LJIJI(TTVideoEngine tTVideoEngine, int i) {
        this.LLILLJJLI.LJIIL();
    }
}
