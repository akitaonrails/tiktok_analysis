package X;

import android.content.Context;
import android.view.Surface;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.player.PlayerContext;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.a4;
import cxo.s0;
import fyo.e;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oM8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469980oM8 implements InterfaceC1304250k2p, a4, s0 {
    public static final /* synthetic */ int LLILLL = 0;
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
        TTVideoEngine tTVideoEngine = this.LL;
        return ((double) (tTVideoEngine != null ? tTVideoEngine.LJJJIL() : 0)) * 0.001d;
    }

    @Override // X.InterfaceC1304250k2p
    public final boolean LJIILJJIL() {
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJZZI();
        }
        return false;
    }

    @Override // X.InterfaceC1304250k2p
    public final int getDuration() {
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJJL();
        }
        return 0;
    }

    @Override // X.InterfaceC1304250k2p
    public final int getVideoHeight() {
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJLIIIJLLLLLLLZ();
        }
        return 0;
    }

    @Override // X.InterfaceC1304250k2p
    public final int getVideoWidth() {
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJLJ();
        }
        return 0;
    }

    @Override // X.InterfaceC1304250k2p
    public final boolean isPlaying() {
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine == null) {
            return false;
        }
        if (tTVideoEngine.LJLI()) {
            return true;
        }
        return tTVideoEngine.LJLIIIL() && tTVideoEngine.LJJLIIIJILLIZJL() == 1;
    }

    @Override // X.InterfaceC1304250k2p
    public final void pause() {
        InterfaceC1304230k2n interfaceC1304230k2n;
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            tTVideoEngine.pause();
        }
        if (this.LL == null || (interfaceC1304230k2n = this.LLILLJJLI) == null) {
            return;
        }
        ((PlayerContext) interfaceC1304230k2n).LIZ(6, null);
    }

    @Override // X.InterfaceC1304250k2p
    public final void play() {
        InterfaceC1304230k2n interfaceC1304230k2n;
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            tTVideoEngine.play();
        }
        if (this.LL == null || (interfaceC1304230k2n = this.LLILLJJLI) == null) {
            return;
        }
        ((PlayerContext) interfaceC1304230k2n).LIZ(5, null);
    }

    @Override // X.InterfaceC1304250k2p
    public final void prepare() {
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            tTVideoEngine.prepare();
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void release() {
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void LIZ(double d) {
        float fLJJJZ;
        TTVideoEngine tTVideoEngine = this.LL;
        float f = 0.0f;
        if (tTVideoEngine != null) {
            fLJJJZ = tTVideoEngine.LJJJZ();
        } else {
            fLJJJZ = 0.0f;
        }
        if (d > 1.0d) {
            f = 1.0f;
        } else if (d >= 0.0d) {
            f = (float) d;
        }
        TTVideoEngine tTVideoEngine2 = this.LL;
        if (tTVideoEngine2 != null) {
            float f2 = f * fLJJJZ;
            tTVideoEngine2.LJIILLIIL(f2, f2);
        }
    }

    @Override // cxo.a4
    public final void LJ(TTVideoEngine tTVideoEngine) {
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZ(3, null);
        }
    }

    @Override // cxo.a4
    public final void LJI(e eVar) {
        InterfaceC1304230k2n interfaceC1304230k2n = this.LLILLJJLI;
        if (interfaceC1304230k2n != null) {
            ((PlayerContext) interfaceC1304230k2n).LIZIZ(eVar);
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
            TTVideoEngine tTVideoEngine = this.LL;
            if (tTVideoEngine != null) {
                tTVideoEngine.LLI(null);
                return;
            }
            return;
        }
        TTVideoEngine tTVideoEngine2 = this.LL;
        if (tTVideoEngine2 == null) {
            return;
        }
        tTVideoEngine2.LLI(this);
    }

    @Override // X.InterfaceC1304250k2p
    public final void LJIIZILJ(double d) {
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJIJJLI((int) (d * ((double) LSPassThroughRecordSizeConfig.DEFAULT)), this);
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void setDataSource(String str) {
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJIJI(str);
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void setLooping(boolean z) {
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            tTVideoEngine.setLooping(z);
        }
    }

    @Override // X.InterfaceC1304250k2p
    public final void setSurface(Surface surface) {
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            tTVideoEngine.setSurface(surface);
        }
    }

    public C1469980oM8(Context context, Map<String, String> map) {
        String str;
        C1490740otc c1490740otc = C1490740otc.LIZ;
        EnumC1490770otf enumC1490770otf = EnumC1490770otf.I;
        c1490740otc.LIZ("init lynx video player with tt-engine impl", enumC1490770otf, "LynxCanvasTTPlayer");
        TTVideoEngine tTVideoEngine = new TTVideoEngine(context, 0);
        tTVideoEngine.LIZJ(110, 1);
        tTVideoEngine.LLJIJIL("lynx_krypton");
        tTVideoEngine.LLILZIL("lynx_krypton_for_tiktok");
        tTVideoEngine.LIZJ(415, 1);
        if (map != null && (str = (String) C2097608Jq.LJFF("disable_tt_engine_hardware_decode", map)) != null && Boolean.parseBoolean(str)) {
            c1490740otc.LIZ("Lynx options disable hardware decode", enumC1490770otf, "LynxCanvasTTPlayer");
        } else {
            try {
                JSONObject config = HybridSettings.INSTANCE.getConfig("HybridCanvas");
                if (config != null) {
                    if (JSONObjectProtectorUtils.getBoolean(config, "DISABLE_TT_ENGINE_HARDWARE_DECODE")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("settings ");
                        sbLIZ.append("DISABLE_TT_ENGINE_HARDWARE_DECODE");
                        sbLIZ.append(" = true, disable hardware decode for tt-engine");
                        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), enumC1490770otf, "LynxCanvasTTPlayer");
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("settings ");
                        sbLIZ2.append("DISABLE_TT_ENGINE_HARDWARE_DECODE");
                        sbLIZ2.append(" = false, allow hardware decode for tt-engine");
                        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ2), enumC1490770otf, "LynxCanvasTTPlayer");
                    }
                } else {
                    c1490740otc.LIZ("setting without key", enumC1490770otf, "LynxCanvasTTPlayer");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1490740otc c1490740otc2 = C1490740otc.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setting exception ");
                sbLIZ3.append(e);
                c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ3), EnumC1490770otf.I, "LynxCanvasTTPlayer");
            }
            C1490740otc.LIZ.LIZ("default allow hardware decode for tt-engine", EnumC1490770otf.I, "LynxCanvasTTPlayer");
            tTVideoEngine.LIZJ(7, 1);
        }
        this.LL = tTVideoEngine;
    }
}
