package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS28S0400000_20;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.ILyraxEngine;
import com.ss.lyrax.ILyraxNetProber;
import com.ss.lyrax.engine.LyraxAppOption;
import com.ss.lyrax.engine.LyraxBusinessOption;
import com.ss.lyrax.engine.LyraxEngineOption;
import com.ss.lyrax.engine.LyraxLiveType;
import com.ss.lyrax.engine.LyraxNetworkOption;
import com.ss.lyrax.net.ILyraxNetProberListener;
import com.ss.lyrax.net.LyraxNetProberBandwidthCalcType;
import com.ss.lyrax.net.LyraxNetProberBandwidthResult;
import com.ss.lyrax.net.LyraxNetProberOption;
import com.ss.lyrax.net.LyraxNetProberResult;
import com.ss.ttlivestreamer.livestreamv2.videoquality.controler.model.VideoQualityMockConfig;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jUL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282870jUL {
    public final HandlerThread LIZ;
    public final Handler LIZIZ;
    public VideoQualityMockConfig LIZJ;
    public ILyraxNetProber LIZLLL;
    public ILyraxEngine LJ;
    public volatile LyraxNetProberBandwidthResult LJFF;

    public final void LIZLLL() {
        if (this.LIZ == null) {
            return;
        }
        if (C786410Ut5.u3() != this.LIZ) {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS120S0100000_20(this, 133));
        } else {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS120S0100000_20(this, 134));
        }
    }

    public final void LJ() {
        int i;
        if (this.LIZ == null) {
            return;
        }
        if (C786410Ut5.u3() != this.LIZ) {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS120S0100000_20(this, 136));
            return;
        }
        C1283420jVE.LIZIZ();
        VideoQualityMockConfig videoQualityMockConfig = this.LIZJ;
        if (videoQualityMockConfig != null && videoQualityMockConfig.mockProbeSwitch == 1 && (i = videoQualityMockConfig.mockAsyncReleaseSleepMs) > 0) {
            try {
                Thread.sleep(i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ILyraxNetProber iLyraxNetProber = this.LIZLLL;
        if (iLyraxNetProber != null) {
            iLyraxNetProber.dispose();
            this.LIZLLL = null;
        }
        ILyraxEngine iLyraxEngine = this.LJ;
        if (iLyraxEngine != null) {
            iLyraxEngine.dispose();
            this.LJ = null;
        }
        C1283420jVE.LIZIZ();
    }

    public final int LJFF() {
        if (this.LIZ == null) {
            return -3;
        }
        if (C786410Ut5.u3() != this.LIZ) {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS120S0100000_20(this, 135));
            return 0;
        }
        C1283420jVE.LIZIZ();
        ILyraxNetProber iLyraxNetProber = this.LIZLLL;
        if (iLyraxNetProber != null) {
            iLyraxNetProber.startProbe();
            C1283420jVE.LIZIZ();
            return 0;
        }
        C1283420jVE.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startBWTestAnchorNet(), failed:veLiveProbe is null, url:");
        sbLIZ.append((String) null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1283430jVF interfaceC1283430jVF = C1283030jUb.LIZ.LIZ;
        if (interfaceC1283430jVF == null) {
            return -2;
        }
        interfaceC1283430jVF.LIZJ(4, "LyraxProbeWrapper", strLIZIZ, null);
        return -2;
    }

    public final void LJI() {
        if (this.LIZ == null) {
            return;
        }
        if (C786410Ut5.u3() != this.LIZ) {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS120S0100000_20(this, 137));
            return;
        }
        C1283420jVE.LIZIZ();
        ILyraxNetProber iLyraxNetProber = this.LIZLLL;
        if (iLyraxNetProber != null) {
            iLyraxNetProber.stopProbe();
        }
    }

    public C1282870jUL() {
        C1282920jUQ c1282920jUQ = C1282930jUR.LIZ;
        InterfaceC1282900jUO interfaceC1282900jUO = c1282920jUQ.LIZ;
        this.LIZ = interfaceC1282900jUO != null ? interfaceC1282900jUO.LIZIZ() : null;
        InterfaceC1282900jUO interfaceC1282900jUO2 = c1282920jUQ.LIZ;
        this.LIZIZ = interfaceC1282900jUO2 != null ? interfaceC1282900jUO2.LIZ() : null;
    }

    public final void LIZJ() {
        C1283420jVE.LIZIZ();
        ILyraxNetProber iLyraxNetProber = this.LIZLLL;
        if (iLyraxNetProber != null) {
            iLyraxNetProber.dispose();
            this.LIZLLL = null;
        }
        ILyraxEngine iLyraxEngine = this.LJ;
        if (iLyraxEngine != null) {
            iLyraxEngine.dispose();
            this.LJ = null;
        }
        if (this.LIZ == null) {
            return;
        }
        this.LIZIZ.removeCallbacksAndMessages(null);
        this.LIZIZ.getLooper().quitSafely();
    }

    public final int LIZ(C1282880jUM c1282880jUM, C2250071D4z c2250071D4z, final InterfaceC1282910jUP interfaceC1282910jUP) {
        LyraxLiveType lyraxLiveType;
        ILyraxNetProber iLyraxNetProber = this.LIZLLL;
        if (iLyraxNetProber != null) {
            iLyraxNetProber.dispose();
            this.LIZLLL = null;
        }
        LyraxEngineOption lyraxEngineOption = new LyraxEngineOption();
        LyraxAppOption lyraxAppOption = lyraxEngineOption.appOption;
        lyraxAppOption.appVersion = c1282880jUM.LJ;
        lyraxAppOption.appChannel = c1282880jUM.LJFF;
        lyraxEngineOption.logSdkWebsocketUrl = c2250071D4z.LIZIZ;
        lyraxEngineOption.androidOption.context = c2250071D4z.LJFF;
        LyraxBusinessOption lyraxBusinessOption = lyraxEngineOption.businessOption;
        lyraxBusinessOption.appId = c1282880jUM.LIZJ;
        lyraxBusinessOption.aid = c1282880jUM.LIZLLL;
        lyraxBusinessOption.deviceId = c1282880jUM.LJI;
        LyraxNetworkOption lyraxNetworkOption = lyraxEngineOption.networkOption;
        C1279430jOn c1279430jOn = C1279460jOq.LIZ;
        lyraxNetworkOption.accessHosts = c1279430jOn.LIZJ();
        lyraxEngineOption.logSdkWebsocketUrl = c1279430jOn.LIZLLL();
        lyraxEngineOption.enableEventUpload = true;
        lyraxEngineOption.inAnchorNet = true;
        lyraxEngineOption.forceInitEnv = false;
        LyraxBusinessOption lyraxBusinessOption2 = lyraxEngineOption.businessOption;
        if (c1282880jUM.LJII == EnumC1283150jUn.GAME) {
            lyraxLiveType = LyraxLiveType.GAME;
        } else {
            lyraxLiveType = LyraxLiveType.VIDEO;
        }
        lyraxBusinessOption2.liveType = lyraxLiveType;
        ILyraxEngine iLyraxEngineCreate = ILyraxEngine.create(lyraxEngineOption);
        if (iLyraxEngineCreate == null) {
            return -1;
        }
        LyraxNetProberOption lyraxNetProberOption = new LyraxNetProberOption();
        String str = c2250071D4z.LIZ;
        String str2 = c2250071D4z.LIZIZ;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("UploadBWProbe");
            lyraxNetProberOption.proberDurationMs = jSONObjectOptJSONObject.optInt("bWTestTimeMS");
            lyraxNetProberOption.proberValidTimeMs = jSONObjectOptJSONObject.optInt("packetSendValidTimeMS");
            lyraxNetProberOption.netInfoLogIntervalMs = jSONObjectOptJSONObject.optInt("logIntervalMS");
            lyraxNetProberOption.proberTargetBwKbps = jSONObjectOptJSONObject.optInt("BWProbeTargetKbps", 20000);
            lyraxNetProberOption.proberBandwidthCalcType = LyraxNetProberBandwidthCalcType.fromId(jSONObjectOptJSONObject.optInt("ProbeBandwidthCalcType"));
            lyraxNetProberOption.firstOrderFilterParam = (float) jSONObjectOptJSONObject.optDouble("FirstOrderFilterParam");
            lyraxNetProberOption.peakAvgCount = jSONObjectOptJSONObject.optInt("PeakAvgCount");
            lyraxNetProberOption.clientNetwork = C786410Ut5.J3(jSONObjectOptJSONObject.optJSONObject("RtcProbeParam"));
            lyraxNetProberOption.rtmp_url = str2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ILyraxNetProber iLyraxNetProberCreateNetProber = iLyraxEngineCreate.createNetProber(lyraxNetProberOption);
        iLyraxNetProberCreateNetProber.setListener(new ILyraxNetProberListener() { // from class: X.0jUN
            @Override // com.ss.lyrax.net.ILyraxNetProberListener
            public final void onLogMonitor(String str3) {
                interfaceC1282910jUP.onLogMonitor(str3);
            }

            @Override // com.ss.lyrax.net.ILyraxNetProberListener
            public final void onEvent(LyraxNetProberResult lyraxNetProberResult, long j, String str3) {
                interfaceC1282910jUP.LIZ(lyraxNetProberResult.value(), j, str3);
            }
        });
        this.LIZLLL = iLyraxNetProberCreateNetProber;
        this.LJ = iLyraxEngineCreate;
        return 0;
    }

    public final void LIZIZ(C1282880jUM c1282880jUM, C2250071D4z c2250071D4z, InterfaceC1282910jUP interfaceC1282910jUP) {
        if (this.LIZ == null) {
            return;
        }
        if (C786410Ut5.u3() != this.LIZ) {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS28S0400000_20(c1282880jUM, c2250071D4z, interfaceC1282910jUP, this, 4));
            return;
        }
        C1283420jVE.LIZIZ();
        if (C1282950jUT.LIZ(c1282880jUM) != null) {
            if (LIZ(c1282880jUM, c2250071D4z, interfaceC1282910jUP) != 0) {
                C1283420jVE.LIZIZ();
                LJ();
                LIZLLL();
                return;
            }
            return;
        }
        C1283420jVE.LIZIZ();
        LJ();
        LIZLLL();
    }
}
