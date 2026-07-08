package X;

import android.view.Surface;
import com.lynx.canvas.player.PlayerContext;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.a4;
import cxo.s0;
import fyo.e;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oM7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469970oM7 implements InterfaceC1304250k2p, a4, s0 {
    public final TTVideoEngine LL;
    public InterfaceC1304230k2n LLILLJJLI;

    @Override // cxo.a4
    public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // cxo.a4
    public final void LIZJ(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC1304250k2p
    public final /* synthetic */ void LJFF(double d) {
    }

    @Override // cxo.a4
    public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // cxo.a4
    public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC1304250k2p
    public final /* synthetic */ double LJIIJ() {
        return 1.0d;
    }

    @Override // cxo.a4
    public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    @Override // cxo.a4
    public final void LJIIL(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // cxo.a4
    public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // cxo.a4
    public final void LJIJI(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // cxo.a4
    public final void LJIJJLI(int i) {
    }

    @Override // X.InterfaceC1304250k2p
    public final void getRotation() {
    }

    @Override // X.InterfaceC1304250k2p
    public final double LIZLLL() {
        return ((double) this.LL.LJJJIL()) * 0.001d;
    }

    @Override // X.InterfaceC1304250k2p
    public final boolean LJIILJJIL() {
        return this.LL.LJJZZI();
    }

    @Override // X.InterfaceC1304250k2p
    public final int getDuration() {
        return this.LL.LJJJJL();
    }

    @Override // X.InterfaceC1304250k2p
    public final int getVideoHeight() {
        return this.LL.LJJLIIIJLLLLLLLZ();
    }

    @Override // X.InterfaceC1304250k2p
    public final int getVideoWidth() {
        return this.LL.LJJLJ();
    }

    @Override // X.InterfaceC1304250k2p
    public final boolean isPlaying() {
        return this.LL.LJLI() || (this.LL.LJLIIIL() && this.LL.LJJLIIIJILLIZJL() == 1);
    }

    @Override // X.InterfaceC1304250k2p
    public final void pause() {
        this.LL.pause();
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZ(6, null);
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void play() {
        this.LL.play();
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZ(5, null);
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void prepare() {
        this.LL.prepare();
    }

    @Override // X.InterfaceC1304250k2p
    public final void release() {
        this.LL.release();
    }

    @Override // X.InterfaceC1304250k2p
    public final void LIZ(double d) {
        float f;
        float fLJJJZ = this.LL.LJJJZ();
        if (d > 1.0d) {
            f = 1.0f;
        } else if (d < 0.0d) {
            f = 0.0f;
        } else {
            f = (float) d;
        }
        float f2 = f * fLJJJZ;
        this.LL.LJIILLIIL(f2, f2);
    }

    @Override // cxo.a4
    public final void LJ(TTVideoEngine tTVideoEngine) {
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZ(3, null);
        }
    }

    @Override // cxo.a4
    public final void LJI(final e eVar) {
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZIZ(new e(eVar) { // from class: X.0oKR
                public final e LJFF;

                @Override // fyo.e
                public final String toString() {
                    int i = 0;
                    if (this.LJFF == null) {
                        return C786410Ut5.J3(new JSONObject().put("errCode", 0).put("errMsg", ""));
                    }
                    JSONObject jSONObject = new JSONObject();
                    int iLIZJ = LIZJ();
                    if (iLIZJ != 0) {
                        i = 1;
                        if (iLIZJ != 1 && iLIZJ != 2) {
                            i = iLIZJ != 3 ? -1 : 2;
                        }
                    }
                    return C786410Ut5.J3(jSONObject.put("errCode", i).put("errMsg", this.LJFF.toString()));
                }

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    int i;
                    String str;
                    String str2 = (eVar == null || (str2 = eVar.LIZJ) == null) ? "" : str2;
                    int i2 = 0;
                    if (eVar != null) {
                        i = eVar.LIZ;
                        i2 = eVar.LIZIZ;
                        str = eVar.LIZLLL;
                        if (str == null) {
                        }
                        super(str2, i, i2, str);
                        this.LJFF = eVar;
                        if (eVar == null && eVar.LJ != null) {
                            this.LJ = eVar.LJ;
                            return;
                        }
                    }
                    i = 0;
                    str = "Internal error";
                    super(str2, i, i2, str);
                    this.LJFF = eVar;
                    if (eVar == null) {
                    }
                }
            });
        }
    }

    @Override // cxo.s0
    public final void LJII(boolean z) {
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZ(4, null);
        }
    }

    @Override // cxo.a4
    public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            PlayerContext playerContext = (PlayerContext) interfaceC1304230k2n;
            playerContext.LJ = true;
            playerContext.LIZ(0, null);
        }
    }

    @Override // cxo.a4
    public final void LJIILL(TTVideoEngine tTVideoEngine) {
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZ(1, null);
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void LJIILLIIL(InterfaceC1304230k2n interfaceC1304230k2n) {
        this.LLILLJJLI = interfaceC1304230k2n;
        if (interfaceC1304230k2n == null) {
            this.LL.LLI(null);
        } else {
            this.LL.LLI(this);
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void LJIIZILJ(double d) {
        this.LL.LJIJJLI((int) (d * ((double) LSPassThroughRecordSizeConfig.DEFAULT)), this);
    }

    @Override // X.InterfaceC1304250k2p
    public final void setDataSource(String str) {
        this.LL.LJIJI(str);
    }

    @Override // X.InterfaceC1304250k2p
    public final void setLooping(boolean z) {
        this.LL.setLooping(z);
    }

    @Override // X.InterfaceC1304250k2p
    public final void setSurface(Surface surface) {
        this.LL.setSurface(surface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1469970oM7(C1524970pmp c1524970pmp, Map<String, String> map) {
        String str;
        Boolean boolLJLI;
        boolean zBooleanValue = 0;
        zBooleanValue = 0;
        zBooleanValue = 0;
        TTVideoEngine tTVideoEngine = new TTVideoEngine(c1524970pmp.LIZ(), 0);
        this.LL = tTVideoEngine;
        tTVideoEngine.LIZJ(110, 1);
        tTVideoEngine.LIZJ(509, 1);
        tTVideoEngine.LIZJ(402, 1);
        tTVideoEngine.LLJIJIL("minigame");
        C1304160k2g c1304160k2g = c1524970pmp.LIZ;
        tTVideoEngine.LLILZIL("minigame_app:" + c1304160k2g.LIZLLL + "_sdk:" + c1304160k2g.LJFF);
        tTVideoEngine.LIZJ(415, 1);
        if (map != null && (str = map.get("disable_tt_engine_hardware_decode")) != null && (boolLJLI = a0.LJLI(str)) != null) {
            zBooleanValue = boolLJLI.booleanValue();
        }
        tTVideoEngine.LIZJ(7, !zBooleanValue);
    }
}
