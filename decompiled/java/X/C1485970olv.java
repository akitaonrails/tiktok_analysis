package X;

import com.lynx.base.log.LynxLog;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0olv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1485970olv implements InterfaceC1469360oL8, InterfaceC1473620oS0, InterfaceC1467780oIa {
    public final InterfaceC1485980olw LL;

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJJIIJ(int i, int i2) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJJIJ(Map map) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJJLIIIIJ(int i) {
    }

    @Override // X.InterfaceC1473620oS0
    public final void r3() {
        this.LL.sendEvent("seek", new HashMap());
    }

    public C1485970olv(InterfaceC1485980olw interfaceC1485980olw) {
        this.LL = interfaceC1485980olw;
    }

    @Override // X.InterfaceC1473620oS0
    public final void LIZ(boolean z) {
        this.LL.sendEvent("fullscreenchange", C2097608Jq.LJI(new Pair("fullscreen", Boolean.valueOf(z))));
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJ(TTVideoEngine tTVideoEngine) {
        LynxLog.i("MediaVideoEngineCallback", "onRenderStart");
        this.LL.LJIILJJIL();
        this.LL.sendEvent("renderstart", new HashMap());
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJI(e eVar) {
        int i;
        String str;
        HashMap map;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError ");
        if (eVar != null) {
            i = eVar.LIZ;
        } else {
            i = -1;
        }
        sbLIZ.append(i);
        sbLIZ.append(' ');
        if (eVar == null || (str = eVar.LIZLLL) == null) {
            str = "";
        }
        sbLIZ.append(str);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        if (eVar != null) {
            map = C2097608Jq.LJI(new Pair("errorCode", Integer.valueOf(eVar.LIZ)), new Pair("errorMsg", eVar.LIZLLL));
        } else {
            map = new HashMap();
        }
        this.LL.sendEvent("error", map);
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
        LynxLog.i("MediaVideoEngineCallback", "onPrepare");
        this.LL.sendEvent("prepare", new HashMap());
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
        LynxLog.i("MediaVideoEngineCallback", "onPrepared");
        this.LL.sendEvent("canplay", new HashMap());
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIILL(TTVideoEngine tTVideoEngine) {
        LynxLog.i("MediaVideoEngineCallback", "onCompletion");
        this.LL.sendEvent("completion", new HashMap());
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIJJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBufferEnd ");
        sbLIZ.append(i);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.sendEvent("bufferend", C2097608Jq.LJI(new Pair("code", Integer.valueOf(i))));
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIJJLI(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoStatusException ");
        sbLIZ.append(i);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.sendEvent("videostatusexception", C2097608Jq.LJI(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i))));
    }

    @Override // X.InterfaceC1467780oIa
    public final void LJJJIL(C1467470oI5 c1467470oI5) {
        if (c1467470oI5 != null && a0.LJJIIZI(c1467470oI5.LIZ, "mdlhitcachesize", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onVideoEngineInfos ");
            String str = c1467470oI5.LIZLLL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(c1467470oI5.LJ);
            LynxLog.i("MediaVideoEngineInfoListener", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1485980olw interfaceC1485980olw = this.LL;
            Pair[] pairArr = new Pair[2];
            String str3 = c1467470oI5.LIZLLL;
            if (str3 == null) {
                str3 = "";
            }
            pairArr[0] = new Pair("key", str3);
            pairArr[1] = new Pair("size", Long.valueOf(c1467470oI5.LJ));
            interfaceC1485980olw.sendEvent("cacheinfo", C2097608Jq.LJI(pairArr));
            InterfaceC1485980olw interfaceC1485980olw2 = this.LL;
            Pair[] pairArr2 = new Pair[2];
            String str4 = c1467470oI5.LIZLLL;
            if (str4 != null) {
                str2 = str4;
            }
            pairArr2[0] = new Pair("key", str2);
            pairArr2[1] = new Pair("cacheSize", Long.valueOf(c1467470oI5.LJ));
            interfaceC1485980olw2.sendEvent("videoinfos", C2097608Jq.LJI(pairArr2));
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
        LynxLog.i("MediaVideoEngineCallback", "onReadyForDisplay");
        this.LL.LJIILJJIL();
        this.LL.sendEvent("readyfordisplay", new HashMap());
        this.LL.sendEvent("firstframe", new HashMap());
    }

    @Override // X.InterfaceC1469360oL8
    public final void LIZJ(TTVideoEngine tTVideoEngine, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlaybackStateChanged ");
        sbLIZ.append(i);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.sendEvent("playbackstatechanged", C2097608Jq.LJI(new Pair("playbackState", Integer.valueOf(i))));
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoStreamBitrateChanged ");
        sbLIZ.append(i);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.sendEvent("videostreambitratechanged", C2097608Jq.LJI(new Pair("bitrate", Integer.valueOf(i))));
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIIL(TTVideoEngine tTVideoEngine, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBufferingUpdate ");
        sbLIZ.append(i);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1485980olw interfaceC1485980olw = this.LL;
        interfaceC1485980olw.sendEvent("buffering", C2097608Jq.LJI(new Pair("playableDuration", Integer.valueOf(i * interfaceC1485980olw.LJJIIJZLJL()))));
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadStateChanged ");
        sbLIZ.append(i);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.sendEvent("loadstatechanged", C2097608Jq.LJI(new Pair("loadState", Integer.valueOf(i))));
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIJI(TTVideoEngine tTVideoEngine, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStreamChanged ");
        sbLIZ.append(i);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.sendEvent("streamchanged", C2097608Jq.LJI(new Pair("type", Integer.valueOf(i))));
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJJII(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSARChanged ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(i2);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.sendEvent("sarchanged", C2097608Jq.LJI(new Pair("den", Integer.valueOf(i2)), new Pair("num", Integer.valueOf(i))));
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCurrentPlaybackTimeUpdate ");
        sbLIZ.append(i);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.sendEvent("currentplaybacktimeupdate", C2097608Jq.LJI(new Pair("currentPlaybackTime", Integer.valueOf(i))));
        this.LL.sendEvent("timeupdate", C2097608Jq.LJI(new Pair("current", Integer.valueOf(i)), new Pair("total", Integer.valueOf(this.LL.LJJIIJZLJL()))));
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJJL(e eVar, String str) {
        String str2;
        int i;
        String str3;
        HashMap map;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoURLRouteFailed ");
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        if (eVar != null) {
            i = eVar.LIZ;
        } else {
            i = -1;
        }
        sbLIZ.append(i);
        sbLIZ.append(' ');
        if (eVar == null || (str3 = eVar.LIZLLL) == null) {
            str3 = "";
        }
        sbLIZ.append(str3);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        if (eVar != null) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("errorCode", Integer.valueOf(eVar.LIZ));
            pairArr[1] = new Pair("errorMsg", eVar.LIZLLL);
            if (str == null) {
                str = "";
            }
            pairArr[2] = new Pair("url", str);
            map = C2097608Jq.LJI(pairArr);
        } else {
            map = new HashMap();
        }
        this.LL.sendEvent("videourlroutefailed", map);
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoSizeChanged ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(i2);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.sendEvent("videosizechanged", C2097608Jq.LJI(new Pair("width", Integer.valueOf(i)), new Pair("height", Integer.valueOf(i2))));
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJJJLIIL(int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBufferStart ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(i2);
        sbLIZ.append(' ');
        sbLIZ.append(i3);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.sendEvent("bufferstart", C2097608Jq.LJI(new Pair("reason", Integer.valueOf(i)), new Pair("afterFirstFrame", Integer.valueOf(i2)), new Pair("action", Integer.valueOf(i3))));
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map<Integer, String> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFrameAboutToBeRendered ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(j);
        sbLIZ.append(' ');
        sbLIZ.append(j2);
        LynxLog.i("MediaVideoEngineCallback", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.sendEvent("frameabouttoberendered", C2097608Jq.LJI(new Pair("type", Integer.valueOf(i)), new Pair("pts", Long.valueOf(j)), new Pair("wallClockTime", Long.valueOf(j2))));
    }
}
