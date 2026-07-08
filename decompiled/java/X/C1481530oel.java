package X;

import Y.ACallableS0S1710000_23;
import Y.ACallableS0S1800000_23;
import Y.ACallableS428S0100000_23;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService;
import com.ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481530oel {
    public static final C0N6S LJ = new LinkedHashMap<String, Long>() { // from class: X.0N6S
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public static final C0N6U LJFF = new LinkedHashMap<String, String>() { // from class: X.0N6U
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public static final C0N6T LJI = new LinkedHashMap<String, Integer>() { // from class: X.0N6T
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Integer> entry) {
            if (size() > 5) {
                return true;
            }
            return false;
        }
    };
    public static long LJII = -1;
    public final boolean LIZ;
    public final C1481920ofO LIZIZ;
    public volatile CountDownLatch LIZJ;
    public final IPlayerEventReportService LIZLLL;

    public final boolean LJFF() {
        return this.LIZ && !this.LIZIZ.LIZ;
    }

    public C1481530oel() {
        boolean z = ((Number) C1474810oTv.I3.getValue()).intValue() == 2;
        this.LIZ = z;
        ((Number) C1474810oTv.F3.getValue()).intValue();
        this.LIZIZ = new C1481920ofO();
        this.LIZJ = new CountDownLatch(1);
        if (C1474810oTv.LJJZZI()) {
            if (C1481610oet.LIZIZ == null) {
                ISimReporterConfig iSimReporterConfig = (ISimReporterConfig) InjectedConfigManager.getConfig(ISimReporterConfig.class);
                C1481610oet.LIZIZ = iSimReporterConfig;
                if (iSimReporterConfig == null) {
                    C1481610oet.LIZIZ = new C1481880ofK();
                }
            }
            C1481790ofB c1481790ofB = IPlayerEventReportService.LIZ;
            EnumC1481830ofF reporterType = C1481610oet.LIZIZ.getReporterType();
            c1481790ofB.getClass();
            IPlayerEventReportService iPlayerEventReportServiceLIZ = C1481790ofB.LIZ(reporterType);
            iPlayerEventReportServiceLIZ.initConfig(C1481610oet.LIZIZ);
            this.LIZLLL = iPlayerEventReportServiceLIZ;
            if (z) {
                new Object(this) { // from class: X.0ofc
                };
            }
        }
    }

    public static int LIZIZ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null) {
            return 0;
        }
        if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
            if (simVideoUrlModel.getHitDashVideoBitrate() != null) {
                return simVideoUrlModel.getHitDashVideoBitrate().getBitRate();
            }
        } else if (simVideoUrlModel.getHitBitrate() != null) {
            return simVideoUrlModel.getHitBitrate().getBitRate();
        }
        if (simVideoUrlModel.getRawBitRate() == null || simVideoUrlModel.getRawBitRate().size() < 1) {
            return 0;
        }
        return ((SimBitRate) ListProtector.get(simVideoUrlModel.getRawBitRate(), 0)).getBitRate();
    }

    public static String LIZJ(SimVideoUrlModel simVideoUrlModel) {
        List<SimBitRate> bitRate;
        if (simVideoUrlModel == null) {
            return null;
        }
        if (simVideoUrlModel.hasDashBitrate()) {
            bitRate = simVideoUrlModel.getDashBitRate();
        } else {
            bitRate = simVideoUrlModel.getBitRate();
        }
        JSONArray jSONArray = new JSONArray();
        if (bitRate != null && !bitRate.isEmpty()) {
            Iterator<SimBitRate> it2 = bitRate.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().getBitRate());
            }
        }
        return jSONArray.toString();
    }

    public static String LIZLLL(SimVideoUrlModel simVideoUrlModel) {
        JSONArray jSONArray = null;
        if (simVideoUrlModel == null) {
            return null;
        }
        List<SimBitRate> bitRate = simVideoUrlModel.getBitRate();
        if (bitRate != null && !bitRate.isEmpty()) {
            try {
                JSONArray jSONArray2 = new JSONArray();
                try {
                    Iterator<SimBitRate> it2 = bitRate.iterator();
                    while (it2.hasNext()) {
                        jSONArray2.put(it2.next().getGearName());
                    }
                    jSONArray = jSONArray2;
                } catch (Exception e) {
                    e = e;
                    jSONArray = jSONArray2;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (jSONArray != null) {
            return jSONArray.toString();
        }
        return "";
    }

    public static int LJ(SimVideoUrlModel simVideoUrlModel) {
        InterfaceC1477220oXo hitBitrate;
        Integer numValueOf;
        if (simVideoUrlModel == null) {
            return -1;
        }
        if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
            hitBitrate = simVideoUrlModel.getHitDashVideoBitrate();
        } else {
            hitBitrate = simVideoUrlModel.getHitBitrate();
        }
        if (hitBitrate == null || (numValueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
            numValueOf = -1;
        }
        return numValueOf.intValue();
    }

    public static int LIZ(SimVideoUrlModel simVideoUrlModel, String str) {
        if (C1478160oZK.LIZ().isCache(simVideoUrlModel)) {
            return C1478160oZK.LIZ().LJJLIIIJJI(simVideoUrlModel);
        }
        if (PreloadSessionManager.LIZIZ.LIZ(str) == null) {
            return -2;
        }
        return -1;
    }

    public final void LJII(final C1482520ogM c1482520ogM, final int i, final C1480420ocy c1480420ocy, final HashMap<String, Object> map) {
        final String sourceId;
        final SimVideoUrlModel simVideoUrlModelLJJII;
        Callable<C1481560oeo> callable;
        ACallableS428S0100000_23 aCallableS428S0100000_23;
        try {
            sourceId = c1480420ocy.getSourceId();
            final int codecType = c1480420ocy.getCodecType();
            C0N6S c0n6s = LJ;
            final Long lValueOf = c0n6s.get(sourceId);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(System.currentTimeMillis());
                c0n6s.put(sourceId, lValueOf);
            }
            LJFF.put(sourceId, sourceId);
            final InterfaceC1481730of5 interfaceC1481730of5 = c1482520ogM.LLILZLL;
            if (interfaceC1481730of5 == null) {
                simVideoUrlModelLJJII = null;
            } else {
                simVideoUrlModelLJJII = interfaceC1481730of5.LJJII(sourceId);
            }
            callable = new Callable<C1481560oeo>() { // from class: X.0oek
                @Override // java.util.concurrent.Callable
                public final C1481560oeo call() throws InterruptedException {
                    int i2;
                    long j;
                    String str;
                    Integer numValueOf;
                    int iIntValue;
                    String strLIZIZ;
                    Float f;
                    Session sessionLJI;
                    C1C7U.LIZ("SimReporterImpl@9443.reportVideoFirstFrameEvent$1");
                    C1481960ofS c1481960ofS = new C1481960ofS();
                    float fFloatValue = -1.0f;
                    c1481960ofS.LIZ.LJIILJJIL = interfaceC1481730of5 != null ? r0.getDuration() : -1.0f;
                    InterfaceC1481730of5 interfaceC1481730of52 = interfaceC1481730of5;
                    c1481960ofS.LIZ.LJIILL = interfaceC1481730of52 != null ? (int) interfaceC1481730of52.getBitrate() : -1;
                    InterfaceC1481730of5 interfaceC1481730of53 = interfaceC1481730of5;
                    c1481960ofS.LIZ.LJIJJLI = interfaceC1481730of53 != null ? interfaceC1481730of53.LIZLLL() : -1;
                    InterfaceC1481730of5 interfaceC1481730of54 = interfaceC1481730of5;
                    c1481960ofS.LIZ.LJIL = interfaceC1481730of54 != null ? interfaceC1481730of54.LJIJJ() : "";
                    InterfaceC1481730of5 interfaceC1481730of55 = interfaceC1481730of5;
                    c1481960ofS.LIZ.LJJ = interfaceC1481730of55 != null ? (int) interfaceC1481730of55.LJI() : -1;
                    InterfaceC1481730of5 interfaceC1481730of56 = interfaceC1481730of5;
                    c1481960ofS.LIZ.LJJIIJ = interfaceC1481730of56 != null ? interfaceC1481730of56.LJJ() : -1;
                    InterfaceC1481730of5 interfaceC1481730of57 = interfaceC1481730of5;
                    int iLJIJJLI = interfaceC1481730of57 != null ? interfaceC1481730of57.LJIJJLI() : -1;
                    C1481560oeo c1481560oeo = c1481960ofS.LIZ;
                    c1481560oeo.LJJIIZ = iLJIJJLI;
                    int i3 = i;
                    if (i3 >= 0) {
                        i3 /= LSPassThroughRecordSizeConfig.DEFAULT;
                    }
                    c1481560oeo.LJJII = i3;
                    int bitRate = 0;
                    if (!C1474810oTv.LJJIIZ()) {
                        C1481530oel c1481530oel = this.LLJI;
                        InterfaceC1481730of5 interfaceC1481730of58 = interfaceC1481730of5;
                        c1481530oel.getClass();
                        c1481960ofS.LIZ.LJJIJIIJIL = (interfaceC1481730of58 == null || !interfaceC1481730of58.LJ()) ? 0 : 1;
                    }
                    if (this.LLJI.LJFF()) {
                        this.LLJI.LIZJ.await();
                    }
                    SimVideoUrlModel simVideoUrlModel = simVideoUrlModelLJJII;
                    if (simVideoUrlModel == null || (sessionLJI = C1477400oY6.LJJJJI.LJI(simVideoUrlModel.getUri())) == null || !TextUtils.equals(sessionLJI.sourceId, simVideoUrlModelLJJII.getSourceId())) {
                        i2 = -1;
                        j = -1;
                        str = null;
                    } else {
                        InterfaceC1481730of5 interfaceC1481730of59 = interfaceC1481730of5;
                        sessionLJI.playBitrate = interfaceC1481730of59 != null ? interfaceC1481730of59.getBitrate() : -1.0f;
                        i2 = (int) sessionLJI.calcBitrate;
                        j = sessionLJI.timeCostForSelectSDK;
                        str = sessionLJI.selectDiffStrForSDK;
                    }
                    long j2 = C1481530oel.LJII;
                    boolean z = (j2 == -1 || j2 == c1480420ocy.getTid()) ? false : true;
                    C1481530oel.LJII = c1480420ocy.getTid();
                    c1481960ofS.LIZ.LIZ = sourceId;
                    C1481530oel c1481530oel2 = this.LLJI;
                    SimVideoUrlModel simVideoUrlModel2 = simVideoUrlModelLJJII;
                    c1481530oel2.getClass();
                    c1481960ofS.LIZ.LIZJ = simVideoUrlModel2 != null ? C1478160oZK.LIZ().LJJIZ(simVideoUrlModel2) : 0L;
                    C1481530oel c1481530oel3 = this.LLJI;
                    SimVideoUrlModel simVideoUrlModel3 = simVideoUrlModelLJJII;
                    c1481530oel3.getClass();
                    c1481960ofS.LIZ.LJFF = C1481530oel.LIZIZ(simVideoUrlModel3);
                    C1481530oel c1481530oel4 = this.LLJI;
                    SimVideoUrlModel simVideoUrlModel4 = simVideoUrlModelLJJII;
                    c1481530oel4.getClass();
                    c1481960ofS.LIZ.LJIIJ = C1481530oel.LJ(simVideoUrlModel4);
                    SimVideoUrlModel simVideoUrlModel5 = simVideoUrlModelLJJII;
                    if (simVideoUrlModel5 != null) {
                        if (simVideoUrlModel5.hasDashBitrateAndSelectAsMp4() && simVideoUrlModel5.getHitDashAudioBitrate() != null) {
                            bitRate = simVideoUrlModel5.getHitDashAudioBitrate().getBitRate();
                        } else if (simVideoUrlModel5.getAudioBitrate() != null && simVideoUrlModel5.getAudioBitrate().size() >= 1) {
                            bitRate = ((SimAudioBitrate) ListProtector.get(simVideoUrlModel5.getAudioBitrate(), 0)).getBitRate();
                        }
                    }
                    c1481960ofS.LIZ.LJI = bitRate;
                    SimVideoUrlModel simVideoUrlModel6 = simVideoUrlModelLJJII;
                    if (simVideoUrlModel6 == null) {
                        iIntValue = -1;
                    } else {
                        SimAudioBitrate hitDashAudioBitrate = simVideoUrlModel6.getHitDashAudioBitrate();
                        if (hitDashAudioBitrate == null || (numValueOf = Integer.valueOf(hitDashAudioBitrate.getQualityType())) == null) {
                            numValueOf = -1;
                        }
                        iIntValue = numValueOf.intValue();
                    }
                    c1481960ofS.LIZ.LJIIJJI = iIntValue;
                    C1481530oel c1481530oel5 = this.LLJI;
                    SimVideoUrlModel simVideoUrlModel7 = simVideoUrlModelLJJII;
                    c1481530oel5.getClass();
                    c1481960ofS.LIZ.LJIIL = C1481530oel.LIZLLL(simVideoUrlModel7);
                    c1481960ofS.LIZ.LJIILIIL = C1481530oel.LIZJ(simVideoUrlModelLJJII);
                    c1481960ofS.LIZ.LJIILJJIL = interfaceC1481730of5 != null ? r0.getDuration() : -1.0f;
                    InterfaceC1481730of5 interfaceC1481730of510 = interfaceC1481730of5;
                    c1481960ofS.LIZ.LJIILL = interfaceC1481730of510 != null ? (int) interfaceC1481730of510.getBitrate() : -1;
                    C1480850odf c1480850odf = C1480850odf.LIZJ;
                    c1481960ofS.LIZ.LJIILLIIL = c1480850odf.isUseSurfaceView() ? 1 : 0;
                    int preloadType = c1480850odf.getPreloadType();
                    C1481560oeo c1481560oeo2 = c1481960ofS.LIZ;
                    c1481560oeo2.LJIIZILJ = preloadType;
                    c1481560oeo2.LJIJ = i2;
                    c1481560oeo2.LJIJI = j;
                    c1481560oeo2.LJIJJ = str;
                    InterfaceC1481730of5 interfaceC1481730of511 = interfaceC1481730of5;
                    c1481960ofS.LIZ.LJIJJLI = interfaceC1481730of511 != null ? interfaceC1481730of511.LIZLLL() : -1;
                    InterfaceC1481730of5 interfaceC1481730of512 = interfaceC1481730of5;
                    c1481960ofS.LIZ.LJIL = interfaceC1481730of512 != null ? interfaceC1481730of512.LJIJJ() : "";
                    InterfaceC1481730of5 interfaceC1481730of513 = interfaceC1481730of5;
                    int iLJI = interfaceC1481730of513 != null ? (int) interfaceC1481730of513.LJI() : -1;
                    C1481560oeo c1481560oeo3 = c1481960ofS.LIZ;
                    c1481560oeo3.LJJ = iLJI;
                    c1481560oeo3.LJJI = -1;
                    c1481960ofS.LIZ.LJJIFFI = C1475000oUE.LIZIZ().getNetworkTypeDetail(null);
                    C1481530oel c1481530oel6 = this.LLJI;
                    String str2 = sourceId;
                    int i4 = i;
                    c1481530oel6.getClass();
                    PreloadSessionManager.PreloadSession preloadSessionLIZ = PreloadSessionManager.LIZIZ.LIZ(str2);
                    c1481960ofS.LIZ.LJJIII = (preloadSessionLIZ == null || i4 <= 0) ? -1 : preloadSessionLIZ.speed;
                    c1481960ofS.LIZ.LJJIIJZLJL = c1480850odf.getPredictLabelResult();
                    boolean zIsPowerModeHandlerEnable = c1480850odf.isPowerModeHandlerEnable();
                    C1481560oeo c1481560oeo4 = c1481960ofS.LIZ;
                    c1481560oeo4.LJJIIZI = zIsPowerModeHandlerEnable ? 1 : 0;
                    c1481560oeo4.LJJIJ = codecType;
                    c1481960ofS.LIZ.LJJIL = EnumC1481210oeF.INS.getPreRenderType(sourceId);
                    c1481960ofS.LIZ.LJIIIZ = C582130MsN.LIZ().LJ().LIZLLL();
                    if (C1474810oTv.LLJJJJ()) {
                        strLIZIZ = C1477400oY6.LJJJJI.LJIILJJIL(sourceId);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(lValueOf);
                        sbLIZ.append("");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    C1481560oeo c1481560oeo5 = c1481960ofS.LIZ;
                    c1481560oeo5.LJJIJIIJI = strLIZIZ;
                    c1481560oeo5.LJJJIL = z;
                    c1481960ofS.LIZ.LJJJ = c1480420ocy.getHwDecErrReason();
                    c1481960ofS.LIZ.LJJIZ = c1480420ocy.getEngineState();
                    C1481530oel c1481530oel7 = this.LLJI;
                    SimVideoUrlModel simVideoUrlModel8 = simVideoUrlModelLJJII;
                    c1481530oel7.getClass();
                    c1481960ofS.LIZ.LJJIJLIJ = simVideoUrlModel8 != null ? TextUtils.isEmpty(simVideoUrlModel8.getDashVideoId()) ? "mp4" : "dash" : null;
                    C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                    c1481960ofS.LIZ.LJJJJI = c1477400oY6.LJIILIIL(sourceId);
                    c1481960ofS.LIZ.LJJJI = c1477400oY6.LJIL(sourceId);
                    String str3 = sourceId;
                    if (!TextUtils.isEmpty(str3) && (f = c1477400oY6.LJIIZILJ.get(str3)) != null) {
                        fFloatValue = f.floatValue();
                    }
                    c1481960ofS.LIZ.LIZLLL = Float.valueOf(fFloatValue);
                    JSONObject jSONObjectLJIIIIZZ = c1477400oY6.LJIIIIZZ(sourceId);
                    C1481560oeo c1481560oeo6 = c1481960ofS.LIZ;
                    c1481560oeo6.LJJJJIZL = jSONObjectLJIIIIZZ;
                    InterfaceC1481870ofJ interfaceC1481870ofJ = c1482520ogM.LLILZ;
                    if (interfaceC1481870ofJ != null) {
                        c1481560oeo6.LIZIZ(interfaceC1481870ofJ.LJ());
                    }
                    c1481560oeo6.LIZIZ(map);
                    C1480420ocy c1480420ocy2 = c1480420ocy;
                    c1481560oeo6.LIZ(Integer.valueOf(c1480420ocy2 != null ? c1480420ocy2.getUrlProtocolType() : -1), "url_type");
                    C1C7U.LIZIZ("SimReporterImpl@9443.reportVideoFirstFrameEvent$1");
                    return c1481560oeo6;
                }
            };
            aCallableS428S0100000_23 = new ACallableS428S0100000_23(c1482520ogM, sourceId, 11);
        } catch (Exception e) {
            e = e;
        }
        try {
            if (C1474810oTv.LJJZZI()) {
                this.LIZLLL.reportRenderFirstFrame(sourceId, callable, map, aCallableS428S0100000_23, true);
            } else {
                C1481610oet.LIZ().reportRenderFirstFrame(sourceId, callable, map, aCallableS428S0100000_23, true);
            }
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            if (C625790Ogb.LIZ()) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void LJIIIZ(final C1482520ogM c1482520ogM, final String str, final int i, final HashMap map) {
        final SimVideoUrlModel simVideoUrlModelLJJII;
        try {
            final Long lValueOf = Long.valueOf(System.currentTimeMillis());
            LJ.put(str, lValueOf);
            LJI.put(str, Integer.valueOf(i));
            final InterfaceC1481730of5 interfaceC1481730of5 = c1482520ogM.LLILZLL;
            if (interfaceC1481730of5 == null) {
                simVideoUrlModelLJJII = null;
            } else {
                simVideoUrlModelLJJII = interfaceC1481730of5.LJJII(str);
            }
            Callable<C1481580oeq> callable = new Callable<C1481580oeq>() { // from class: X.0oen
                @Override // java.util.concurrent.Callable
                public final C1481580oeq call() throws InterruptedException {
                    String strLIZIZ;
                    String strLIZIZ2;
                    Session sessionLJI;
                    List<SimBitRate> bitRate;
                    C1C7U.LIZ("SimReporterImpl@9443.reportVideoRequestEvent$1");
                    C1481980ofU c1481980ofU = new C1481980ofU();
                    InterfaceC1481730of5 interfaceC1481730of52 = interfaceC1481730of5;
                    c1481980ofU.LIZ.LJIIJ = interfaceC1481730of52 != null ? interfaceC1481730of52.LJIJJLI() : -1;
                    InterfaceC1481730of5 interfaceC1481730of53 = interfaceC1481730of5;
                    c1481980ofU.LIZ.LJIIJJI = String.valueOf(interfaceC1481730of53 != null ? interfaceC1481730of53.LIZLLL() : -1);
                    if (this.LLIZLLLIL.LJFF()) {
                        this.LLIZLLLIL.LIZJ.await();
                    }
                    SimVideoUrlModel simVideoUrlModel = simVideoUrlModelLJJII;
                    if (simVideoUrlModel == null || (sessionLJI = C1477400oY6.LJJJJI.LJI(simVideoUrlModel.getUri())) == null || !TextUtils.equals(sessionLJI.sourceId, simVideoUrlModelLJJII.getSourceId())) {
                        strLIZIZ = "notAssign";
                    } else {
                        String str2 = sessionLJI.selectFlow;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str2);
                        sbLIZ.append(", ServerInputNum:");
                        C1481530oel c1481530oel = this.LLIZLLLIL;
                        SimVideoUrlModel simVideoUrlModel2 = simVideoUrlModelLJJII;
                        c1481530oel.getClass();
                        sbLIZ.append((simVideoUrlModel2 == null || (bitRate = simVideoUrlModel2.getBitRate()) == null) ? 0 : bitRate.size());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    c1481980ofU.LIZ.LIZIZ = str;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(C1475000oUE.LIZIZ().getAppID());
                    sbLIZ2.append("");
                    c1481980ofU.LIZ.LIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c1481980ofU.LIZ.LIZJ = C1475000oUE.LIZIZ().getAppVersion();
                    if (C1474810oTv.LLJJJJ()) {
                        strLIZIZ2 = C1477400oY6.LJJJJI.LJIILJJIL(str);
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(lValueOf);
                        sbLIZ3.append("");
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    c1481980ofU.LIZ.LJFF = strLIZIZ2;
                    int preloadType = C1480850odf.LIZJ.getPreloadType();
                    C1481580oeq c1481580oeq = c1481980ofU.LIZ;
                    c1481580oeq.LJ = preloadType;
                    c1481580oeq.LJII = i > 0 ? 1 : 0;
                    c1481980ofU.LIZ.LJIIIIZZ = C1478160oZK.LIZ().LJIIIIZZ(simVideoUrlModelLJJII) ? 1 : 0;
                    SimVideoUrlModel simVideoUrlModel3 = simVideoUrlModelLJJII;
                    c1481980ofU.LIZ.LIZLLL = simVideoUrlModel3 != null ? (int) simVideoUrlModel3.getDuration() : -1;
                    C1481530oel c1481530oel2 = this.LLIZLLLIL;
                    SimVideoUrlModel simVideoUrlModel4 = simVideoUrlModelLJJII;
                    c1481530oel2.getClass();
                    c1481980ofU.LIZ.LJIILJJIL = C1481530oel.LIZIZ(simVideoUrlModel4);
                    C1481530oel c1481530oel3 = this.LLIZLLLIL;
                    SimVideoUrlModel simVideoUrlModel5 = simVideoUrlModelLJJII;
                    c1481530oel3.getClass();
                    c1481980ofU.LIZ.LJIILL = C1481530oel.LJ(simVideoUrlModel5);
                    String strLIZJ = C1481530oel.LIZJ(simVideoUrlModelLJJII);
                    C1481580oeq c1481580oeq2 = c1481980ofU.LIZ;
                    c1481580oeq2.LJIJ = strLIZJ;
                    c1481580oeq2.LJIIL = strLIZIZ;
                    String networkTypeDetail = C1475000oUE.LIZIZ().getNetworkTypeDetail(null);
                    C1481580oeq c1481580oeq3 = c1481980ofU.LIZ;
                    c1481580oeq3.LJI = networkTypeDetail;
                    InterfaceC1481870ofJ interfaceC1481870ofJ = c1482520ogM.LLILZ;
                    if (interfaceC1481870ofJ != null) {
                        c1481580oeq3.LIZIZ(interfaceC1481870ofJ.LJII());
                    }
                    c1481580oeq3.LIZIZ(map);
                    C1C7U.LIZIZ("SimReporterImpl@9443.reportVideoRequestEvent$1");
                    return c1481580oeq3;
                }
            };
            if (C1474810oTv.LJJZZI()) {
                this.LIZLLL.reportVideoPlayStart(str, callable);
            } else {
                C1481610oet.LIZ().reportVideoPlayStart(str, callable);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C625790Ogb.LIZ()) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void LJIIJ(final C1482520ogM c1482520ogM, final String str, final C1480430ocz c1480430ocz, final HashMap<String, Object> map) {
        final SimVideoUrlModel simVideoUrlModelLJJII;
        try {
            final Long l = LJ.get(str);
            final InterfaceC1481730of5 interfaceC1481730of5 = c1482520ogM.LLILZLL;
            if (interfaceC1481730of5 == null) {
                simVideoUrlModelLJJII = null;
            } else {
                simVideoUrlModelLJJII = interfaceC1481730of5.LJJII(str);
            }
            Callable<C1481340oeS> callable = new Callable<C1481340oeS>() { // from class: X.0oeR
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final C1481340oeS call() throws InterruptedException {
                    String strLIZIZ;
                    C1C7U.LIZ("SimReporterImpl@9443.reportVideoStopEvent$1");
                    C1481400oeY c1481400oeY = new C1481400oeY();
                    InterfaceC1481730of5 interfaceC1481730of52 = interfaceC1481730of5;
                    int i = (interfaceC1481730of52 == null || !interfaceC1481730of52.LJ()) ? 0 : 1;
                    InterfaceC1481730of5 interfaceC1481730of53 = interfaceC1481730of5;
                    int iLJFF = interfaceC1481730of53 == null ? -1 : (int) interfaceC1481730of53.LJFF(11);
                    InterfaceC1481730of5 interfaceC1481730of54 = interfaceC1481730of5;
                    float fLJFF = interfaceC1481730of54 == null ? 1.0f : interfaceC1481730of54.LJFF(12);
                    InterfaceC1481730of5 interfaceC1481730of55 = interfaceC1481730of5;
                    C1481440oec c1481440oec = 0;
                    c1481440oec = 0;
                    C1471500oOa videoInfo = interfaceC1481730of55 != null ? interfaceC1481730of55.getVideoInfo() : null;
                    C1480660odM c1480660odM = new C1480660odM();
                    C1479860oc4 c1479860oc4 = new C1479860oc4();
                    InterfaceC1481730of5 interfaceC1481730of56 = c1482520ogM.LLILZLL;
                    if (interfaceC1481730of56 != null) {
                        C1480660odM c1480660odMLJIJ = interfaceC1481730of56.LJIJ(str);
                        if (c1480660odMLJIJ != null) {
                            c1480660odM = c1480660odMLJIJ;
                        }
                        c1479860oc4 = c1482520ogM.LLILZLL.LJJIFFI(str);
                    }
                    C1481530oel c1481530oel = this.LLIZLLLIL;
                    SimVideoUrlModel simVideoUrlModel = simVideoUrlModelLJJII;
                    c1481530oel.getClass();
                    c1481400oeY.LIZ.LIZLLL = simVideoUrlModel != null ? C1478160oZK.LIZ().LJJJJL(simVideoUrlModel) : -1;
                    C1481530oel c1481530oel2 = this.LLIZLLLIL;
                    SimVideoUrlModel simVideoUrlModel2 = simVideoUrlModelLJJII;
                    c1481530oel2.getClass();
                    c1481400oeY.LIZ.LJIILIIL = simVideoUrlModel2 != null ? C1478160oZK.LIZ().LIZJ(simVideoUrlModel2) : null;
                    C1481530oel c1481530oel3 = this.LLIZLLLIL;
                    SimVideoUrlModel simVideoUrlModel3 = simVideoUrlModelLJJII;
                    c1481530oel3.getClass();
                    c1481400oeY.LIZ.LJIILJJIL = simVideoUrlModel3 != null ? C1478160oZK.LIZ().LJJIIJZLJL(simVideoUrlModel3) : null;
                    if (this.LLIZLLLIL.LJFF()) {
                        this.LLIZLLLIL.LIZJ.await();
                    }
                    C0N6T c0n6t = C1481530oel.LJI;
                    Integer num = c0n6t.containsKey(str) ? c0n6t.get(str) : null;
                    C0N6U c0n6u = C1481530oel.LJFF;
                    boolean zContainsKey = c0n6u.containsKey(str);
                    C1481340oeS c1481340oeS = c1481400oeY.LIZ;
                    c1481340oeS.LIZ = zContainsKey ? 1 : 0;
                    c1481340oeS.LJFF = i;
                    c1481340oeS.LJII = iLJFF;
                    c1481340oeS.LJI = fLJFF;
                    c1481400oeY.LIZ.LJIIJ = C1478160oZK.LIZ().LJJJJJ();
                    if (videoInfo != null && videoInfo.LJI != null) {
                        c1481440oec = new Object() { // from class: X.0oec
                        };
                    }
                    c1481400oeY.LIZ.LJIIL = c1481440oec;
                    if (C1474810oTv.LLJJJJ()) {
                        strLIZIZ = C1477400oY6.LJJJJI.LJIILJJIL(str);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(l);
                        sbLIZ.append("");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    c1481400oeY.LIZ.LJIIJJI = strLIZIZ;
                    if (num != null) {
                        num.intValue();
                    }
                    c1481400oeY.LIZ.getClass();
                    C1481530oel c1481530oel4 = this.LLIZLLLIL;
                    SimVideoUrlModel simVideoUrlModel4 = simVideoUrlModelLJJII;
                    c1481530oel4.getClass();
                    c1481400oeY.LIZ.LJIILL = C1481530oel.LIZLLL(simVideoUrlModel4);
                    String strLIZJ = C1481530oel.LIZJ(simVideoUrlModelLJJII);
                    C1481340oeS c1481340oeS2 = c1481400oeY.LIZ;
                    c1481340oeS2.LJIILLIIL = strLIZJ;
                    c1481340oeS2.LJJIIJ = c1479860oc4.LIZIZ;
                    c1481340oeS2.LJJIIZI = c1479860oc4.LJI;
                    c1481340oeS2.LJJIJIIJIL = c1479860oc4.LIZJ;
                    c1481340oeS2.LJJIJIIJI = c1479860oc4.LIZ;
                    c1481340oeS2.LJJIJ = c1479860oc4.LIZLLL;
                    c1481340oeS2.LJJIIJZLJL = c1479860oc4.LJ;
                    c1481340oeS2.LJJIIZ = c1479860oc4.LJFF;
                    c1481340oeS2.LJIJJLI = c1480660odM.LIZ;
                    c1481340oeS2.LJIL = c1480660odM.LIZIZ;
                    c1481340oeS2.LJJ = c1480660odM.LJFF;
                    c1481340oeS2.LJJI = c1480660odM.LJI;
                    String str2 = videoInfo != null ? videoInfo.LJIIL : "";
                    C1481340oeS c1481340oeS3 = c1481400oeY.LIZ;
                    c1481340oeS3.LJJJJJL = str2;
                    try {
                        c0n6u.remove(str);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("mRenderedSourceId remove error:");
                        sbLIZ2.append(e.getMessage());
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    InterfaceC1481870ofJ interfaceC1481870ofJ = c1482520ogM.LLILZ;
                    if (interfaceC1481870ofJ != null) {
                        c1481340oeS3.LIZIZ(interfaceC1481870ofJ.LIZJ());
                    }
                    c1481340oeS3.LIZIZ(map);
                    C1480430ocz c1480430ocz2 = c1480430ocz;
                    c1481340oeS3.LIZ(Integer.valueOf(c1480430ocz2 != null ? c1480430ocz2.LJIIIZ : -1), "url_type");
                    C1C7U.LIZIZ("SimReporterImpl@9443.reportVideoStopEvent$1");
                    return c1481340oeS3;
                }
            };
            ACallableS428S0100000_23 aCallableS428S0100000_23 = new ACallableS428S0100000_23(c1482520ogM, str, 9);
            try {
                if (C1474810oTv.LJJZZI()) {
                    this.LIZLLL.reportVideoStop(str, callable, map, aCallableS428S0100000_23, true);
                } else {
                    C1481610oet.LIZ().reportVideoStop(str, callable, map, aCallableS428S0100000_23, true);
                }
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                if (C625790Ogb.LIZ()) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void LJI(final C1482520ogM c1482520ogM, String str, boolean z, C1480430ocz c1480430ocz, HashMap map) {
        SimVideoUrlModel simVideoUrlModelLJJII;
        ACallableS0S1710000_23 aCallableS0S1710000_23;
        InterfaceC1482510ogL interfaceC1482510ogL;
        try {
            Long l = LJ.get(str);
            InterfaceC1481730of5 interfaceC1481730of5 = c1482520ogM.LLILZLL;
            if (interfaceC1481730of5 == null) {
                simVideoUrlModelLJJII = null;
            } else {
                simVideoUrlModelLJJII = interfaceC1481730of5.LJJII(str);
            }
            aCallableS0S1710000_23 = new ACallableS0S1710000_23(this, interfaceC1481730of5, simVideoUrlModelLJJII, str, l, c1482520ogM, map, c1480430ocz, 1);
            interfaceC1482510ogL = new InterfaceC1482510ogL() { // from class: X.0ofN
                @Override // X.InterfaceC1482510ogL
                public final void LIZ(int i, String str2, boolean z2, long j, long j2) {
                    InterfaceC1481870ofJ interfaceC1481870ofJ = c1482520ogM.LLILZ;
                    if (interfaceC1481870ofJ != null) {
                        interfaceC1481870ofJ.LIZLLL();
                    }
                }
            };
        } catch (Exception e) {
            e = e;
        }
        try {
            if (C1474810oTv.LJJZZI()) {
                this.LIZLLL.reportVideoBuffering(str, true, z, aCallableS0S1710000_23, interfaceC1482510ogL);
            } else {
                C1481610oet.LIZ().reportVideoBuffering(str, true, z, aCallableS0S1710000_23, interfaceC1482510ogL);
            }
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            if (C625790Ogb.LIZ()) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void LJIIIIZZ(C1482520ogM c1482520ogM, C1481290oeN c1481290oeN, String str, C1480430ocz c1480430ocz, HashMap<String, Object> map) {
        SimVideoUrlModel simVideoUrlModelLJJII;
        ACallableS0S1800000_23 aCallableS0S1800000_23;
        ACallableS428S0100000_23 aCallableS428S0100000_23;
        try {
            Long l = LJ.get(str);
            InterfaceC1481730of5 interfaceC1481730of5 = c1482520ogM.LLILZLL;
            if (interfaceC1481730of5 == null) {
                simVideoUrlModelLJJII = null;
            } else {
                simVideoUrlModelLJJII = interfaceC1481730of5.LJJII(str);
            }
            aCallableS0S1800000_23 = new ACallableS0S1800000_23(interfaceC1481730of5, simVideoUrlModelLJJII, c1481290oeN, l, str, c1482520ogM, map, c1480430ocz, this, 1);
            aCallableS428S0100000_23 = new ACallableS428S0100000_23(c1482520ogM, str, 10);
        } catch (Exception e) {
            e = e;
        }
        try {
            if (C1474810oTv.LJJZZI()) {
                this.LIZLLL.reportPlayFailed(str, aCallableS0S1800000_23, map, aCallableS428S0100000_23, true);
            } else {
                C1481610oet.LIZ().reportPlayFailed(str, aCallableS0S1800000_23, map, aCallableS428S0100000_23, true);
            }
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            if (C625790Ogb.LIZ()) {
                throw new RuntimeException(e);
            }
        }
    }
}
