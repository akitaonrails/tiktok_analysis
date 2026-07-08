package X;

import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.xelement.audiott.bean.XAudioSrc;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.lynx.base.log.LynxLog;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.a4;
import fyo.e;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AMZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AMZ implements a4, InterfaceC1467780oIa {
    public final Context LL;
    public TTVideoEngine LLILZ;
    public InterfaceC2178061AMa LLILZIL;
    public XAudioSrc LLILZLL;
    public XAudioSrc LLIZ;
    public C2178071AMb LLIZLLLIL;
    public InterfaceC2178111AMf<XAudioSrc, C2178071AMb> LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public Map<String, String> LLJILJILJ;
    public volatile int LLJILLL;
    public int LLJJ;
    public final HandlerThread LLJJIJI;
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
    public String LLILLL = "default";
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1850));
    public int LLJJI = 500;
    public boolean LLJJIII = true;

    @Override // cxo.a4
    public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // cxo.a4
    public final void LJ(TTVideoEngine tTVideoEngine) {
    }

    @Override // cxo.a4
    public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // cxo.a4
    public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
    }

    public final void LJIIJ() {
        TTVideoEngine tTVideoEngine;
        this.LLJILLL = 1;
        if (this.LLIZLLLIL == null || (tTVideoEngine = this.LLILZ) == null) {
            return;
        }
        tTVideoEngine.play();
    }

    @Override // cxo.a4
    public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    @Override // cxo.a4
    public final void LJIIL(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // cxo.a4
    public final void LJIJI(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // cxo.a4
    public final void LJIJJLI(int i) {
    }

    @Override // X.InterfaceC1467780oIa
    public final void LJJJIL(C1467470oI5 c1467470oI5) {
    }

    public final String LIZ() {
        String songId;
        XAudioSrc xAudioSrc = this.LLIZ;
        return (xAudioSrc == null || (songId = xAudioSrc.getSongId()) == null) ? "" : songId;
    }

    public final String LIZLLL() {
        String songId;
        XAudioSrc xAudioSrc = this.LLILZLL;
        return (xAudioSrc == null || (songId = xAudioSrc.getSongId()) == null) ? "" : songId;
    }

    public final void LJII() {
        TTVideoEngine tTVideoEngine = this.LLILZ;
        if (tTVideoEngine == null || this.LLJJ != 1) {
            return;
        }
        long jLJJJIL = tTVideoEngine.LJJJIL();
        InterfaceC2178061AMa interfaceC2178061AMa = this.LLILZIL;
        if (interfaceC2178061AMa != null) {
            interfaceC2178061AMa.onPlaybackTimeChanged(jLJJJIL);
        }
        C786410Ut5.LJLIIIL(this.LLILLJJLI, new ARunnableS131S0100000_31(this, 221), this, SystemClock.uptimeMillis() + ((long) this.LLJJI));
    }

    public final void LJFF(String str) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSrc: ");
        sbLIZ.append(str);
        LynxLog.i("AudioEnginePlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJILLL == 4) {
            return;
        }
        if (this.LLILZ == null) {
            String str2 = this.LLILLL;
            if (!Intrinsics.LJFF(str2, "default") && Intrinsics.LJFF(str2, "light")) {
                i = 2;
            } else {
                i = 0;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createTypedPlayer: ");
            sbLIZ2.append(str2);
            LynxLog.i("AudioEnginePlayer", C2188811AlT.LIZIZ(sbLIZ2));
            HashMap map = new HashMap();
            map.put("enable_looper", Boolean.valueOf(this.LLJJIII));
            TTVideoEngine tTVideoEngine = new TTVideoEngine(C786410Ut5.N3(this.LL), i, map);
            tTVideoEngine.LIZ.LLLLZLL = this;
            tTVideoEngine.LLI(this);
            tTVideoEngine.LLJIJIL("AudioEnginePlayer");
            tTVideoEngine.setLooping(this.LLJILJIL);
            tTVideoEngine.LIZJ(160, 1);
            tTVideoEngine.LIZJ(480, 1);
            tTVideoEngine.LIZJ(402, 1);
            tTVideoEngine.LIZJ(27, 1);
            tTVideoEngine.LIZJ(416, 0);
            tTVideoEngine.LIZJ(314, 1);
            tTVideoEngine.LIZJ(28, 6);
            tTVideoEngine.LIZJ(18, 1);
            tTVideoEngine.LIZJ(415, 1);
            tTVideoEngine.LIZJ(0, 10);
            tTVideoEngine.LIZJ(480, 1);
            tTVideoEngine.LJLLJ();
            Map<String, String> map2 = this.LLJILJILJ;
            if (map2 != null) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    tTVideoEngine.LJJIII(entry.getKey(), entry.getValue());
                }
            }
            this.LLILZ = tTVideoEngine;
        }
        try {
            this.LLILZLL = (XAudioSrc) GsonProtectorUtils.fromJson((Gson) this.LLJ.getValue(), str, XAudioSrc.class);
            InterfaceC2178061AMa interfaceC2178061AMa = this.LLILZIL;
            if (interfaceC2178061AMa != null) {
                interfaceC2178061AMa.LIZJ(0);
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC2178061AMa interfaceC2178061AMa2 = this.LLILZIL;
            if (interfaceC2178061AMa2 != null) {
                interfaceC2178061AMa2.LJIIJ(-2, "src json format error");
            }
        }
        this.LLJI.LIZ(new AwS612S0100000_33(this, 282), this.LLILZLL);
    }

    @Override // cxo.a4
    public final void LJI(e eVar) {
        InterfaceC2178061AMa interfaceC2178061AMa;
        if (eVar != null && (interfaceC2178061AMa = this.LLILZIL) != null) {
            int i = eVar.LIZ;
            String str = eVar.LIZLLL;
            if (str == null) {
                str = "";
            }
            interfaceC2178061AMa.LJIIJ(i, str);
        }
    }

    @Override // cxo.a4
    public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
        InterfaceC2178061AMa interfaceC2178061AMa = this.LLILZIL;
        if (interfaceC2178061AMa != null) {
            interfaceC2178061AMa.LJIIL(4);
        }
        if (this.LLJILLL != 5 && this.LLJJ != 1) {
            this.LLJJ = 1;
            LJII();
            InterfaceC2178061AMa interfaceC2178061AMa2 = this.LLILZIL;
            if (interfaceC2178061AMa2 != null) {
                interfaceC2178061AMa2.LJIIL(this.LLJJ);
            }
        }
    }

    @Override // cxo.a4
    public final void LJIILL(TTVideoEngine tTVideoEngine) {
        InterfaceC2178061AMa interfaceC2178061AMa = this.LLILZIL;
        if (interfaceC2178061AMa != null) {
            interfaceC2178061AMa.LIZIZ(this.LLJILJIL);
        }
    }

    public C1AMZ(Context context, boolean z) {
        this.LL = context;
        this.LLJI = new C2178101AMe(context);
        if (z) {
            HandlerThread handlerThread = new HandlerThread("AudioEnginePlayerThread");
            this.LLJJIJI = handlerThread;
            handlerThread.start();
        }
    }

    @Override // cxo.a4
    public final void LIZJ(TTVideoEngine tTVideoEngine, int i) {
        if (this.LLJJ != i) {
            this.LLJJ = i;
            LJII();
            InterfaceC2178061AMa interfaceC2178061AMa = this.LLILZIL;
            if (interfaceC2178061AMa != null) {
                interfaceC2178061AMa.LJIIL(this.LLJJ);
            }
        }
    }

    @Override // cxo.a4
    public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
        InterfaceC2178061AMa interfaceC2178061AMa = this.LLILZIL;
        if (interfaceC2178061AMa != null) {
            interfaceC2178061AMa.LJJI(i);
        }
    }
}
