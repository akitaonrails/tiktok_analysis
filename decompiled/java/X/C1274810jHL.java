package X;

import Y.ARunnableS0S1530000_20;
import Y.ARunnableS10S2100000_20;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS20S1200000_16;
import Y.ARunnableS21S0210000_20;
import Y.ARunnableS21S1100000_16;
import Y.ARunnableS25S1100000_20;
import Y.ARunnableS2S0120000_20;
import Y.ARunnableS2S1500000_20;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS49S0300000_16;
import Y.ARunnableS4S1101000_20;
import Y.ARunnableS5S1110000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper;
import com.ss.bytertc.engine.NetworkTimeInfo;
import com.ss.bytertc.engine.PostProcessParameter;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.RTCVideoInterface;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.data.AVSyncState;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.engineimpl.RTCVideoImplV2;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter;
import com.ss.bytertc.engine.type.DownLinkAudioSelectionPriority;
import com.ss.bytertc.engine.type.LinkMicType;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import com.ss.bytertc.engine.video.VideoCaptureConfig;
import com.ss.lyrax.ILyraxEngine;
import com.ss.lyrax.ILyraxVideo;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.subscriber.LyraxVideoRenderConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.ILyraxVideoRenderer;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoRendererManager;
import com.ss.lyrax.video.NativeRenderConfig;
import com.ss.lyrax.video.TTLHVideoContentReportConfig;
import com.ss.pusher.core.params.ASRWordMuting;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectResultJava;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jHL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274810jHL implements InterfaceC1276380jJs, InterfaceC1273640jFS, InterfaceC1268200j6g, InterfaceC1272020jCq {
    public final C1274120jGE LIZ;
    public final C1274250jGR LIZJ;
    public final C1274850jHP LIZLLL;
    public boolean LJ;
    public ILyraxVideoPlatformWrapper LJFF;
    public final C1274890jHT LJI;
    public C1275140jHs LJII;
    public C1274830jHN LJIIIIZZ;
    public final C1274990jHd LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final boolean LJIIL;
    public int LJIILIIL;
    public C1275030jHh LJIILJJIL;
    public final C1276550jK9 LJIILLIIL;
    public GLThread LJIJ;
    public Handler LJIJI;
    public RunnableC1274270jGT LJIJJ;
    public final VPassInteractCfg LJIJJLI;
    public final InterfaceC1272770jE3 LJIL;
    public final InterfaceC1271140jBQ LJJ;
    public C1274350jGb LJJI;
    public final C1274940jHY LJJIIJZLJL;
    public SurfaceView LJJIIZI;
    public InterfaceC1274770jHH LJJIJLIJ;
    public boolean LJJIL;
    public boolean LJJIZ;
    public final C1274780jHI LJJJI;
    public JSONObject LJJJJ;
    public final boolean LJJJJLL;
    public final String LJJJLZIJ;
    public final C1266700j4G LJJJZ;
    public InterfaceC1274710jHB LJJLI;
    public final C1271090jBL LJJLIIIIJ;
    public final Map<String, C1276670jKL> LJJLIIIJ;
    public JSONObject LJJLIIIJILLIZJL;
    public final String LJJLIIIJJI;
    public final boolean LJJLIIIJL;
    public final boolean LJJLIIIJLJLI;
    public final int LJJLIIIJLLLLLLLZ;
    public final List<String> LJJLIL;
    public TTLHVideoContentReportConfig LJJLJLI;
    public C1275090jHn LJJLL;
    public final C1274110jGD LJJZZIII;
    public C1274330jGZ LJLI;
    public C1274340jGa LJLIIIL;
    public final C1267500j5Y LJLIIL;
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJJI;
    public final PushBase.HardwareRoi LJLJJL;
    public final C1274790jHJ LJLJJLL;
    public final InterfaceC1268640j7O LJLJL;
    public final C1275410jIJ LJLJLJ;
    public final TTLHSceneDetector LJLJLLL;
    public C1274300jGW LJLL;
    public final C1269940j9U LJLLI;
    public final C1273190jEj LJLLILLLL;
    public final boolean LJLLJ;
    public final C1269850j9L LJLLL;
    public final C1273620jFQ LJLLLL;
    public C1275050jHj LJLLLLLL;
    public List<VideoEncoderConfig> LJLZ;
    public int LJZ;
    public boolean LJZI;
    public final C1274700jHA LJZL;
    public String LL;
    public final C1274820jHM LLD;
    public final C1274880jHS LLF;
    public final C1274900jHU LLFF;
    public C1268130j6Z LLFFF;
    public String LIZIZ = "";
    public EnumC1275390jIH LJIILL = EnumC1275390jIH.ASR_TASK_MODE_DEFAULT;
    public final int[] LJIIZILJ = new int[2];
    public final Map<String, C1274860jHQ> LJJIFFI = new ConcurrentHashMap();
    public final Map<String, C1274860jHQ> LJJII = new ConcurrentHashMap();
    public final C1275290jI7 LJJIII = new C1275290jI7(new C1275770jIt(this));
    public final Map<String, C1275750jIr> LJJIIJ = new LinkedHashMap();
    public final boolean LJJIIZ = true;
    public String LJJIJ = "notDefined";
    public final Map<String, Long> LJJIJIIJI = new ConcurrentHashMap();
    public final AtomicLong LJJIJIIJIL = new AtomicLong();
    public final List<String> LJJIJIL = new ArrayList();
    public final Map<String, Boolean> LJJIJL = new ConcurrentHashMap();
    public boolean LJJJ = false;
    public String LJJJIL = "";
    public boolean LJJJJI = false;
    public boolean LJJJJIZL = false;
    public boolean LJJJJJ = false;
    public int LJJJJJL = 0;
    public int LJJJJL = 0;
    public int LJJJJLI = -1;
    public volatile boolean LJJJJZ = false;
    public final Map<String, LyraxVideoRendererWrapper> LJJJJZI = new ConcurrentHashMap();
    public final Map<String, Boolean> LJJJLIIL = new ConcurrentHashMap();
    public boolean LJJJLL = true;
    public InterfaceC1274500jGq LJJL = null;
    public boolean LJJLIIIJJIZ = false;
    public volatile int LJJLIIJ = 0;
    public final C1210870hcD LJJLJ = new C1210870hcD();
    public String LJJZ = null;
    public boolean LJJZZI = true;
    public final C1275280jI6 LJL = new C1275280jI6();
    public long LJLJI = 0;

    @Override // X.InterfaceC1276380jJs
    public final void LIZIZ() {
        AVLog.debugTrace(new Object[0]);
        boolean zLLIIJI = LLIIJI(true, false);
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(this);
        sbLIZ.append(" mixStreamDone: ");
        sbLIZ.append(zLLIIJI);
        sbLIZ.append(" client:");
        sbLIZ.append(this);
        c1274830jHN.LJIIIIZZ("invalidateSei", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1272020jCq
    public final void LJII() {
        this.LJJJJJL = 0;
        this.LJJJJL = 0;
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        if (c1274830jHN != null) {
            c1274830jHN.LJIIJJI();
        }
    }

    public final synchronized void LJJIIZI() {
        Iterator it2 = ((ConcurrentHashMap) this.LJJIFFI).keySet().iterator();
        while (it2.hasNext()) {
            LJJIJIIJIL(new StreamKey(this.LJJLIIIJJI, (String) it2.next(), StreamIndex.STREAM_INDEX_MAIN));
        }
        Iterator it3 = ((ConcurrentHashMap) this.LJJII).keySet().iterator();
        while (it3.hasNext()) {
            StreamKey streamKeyLJJI = LJJI((String) it3.next());
            if (streamKeyLJJI != null) {
                LJJIJIIJIL(streamKeyLJJI);
            }
        }
        LLFFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current video sink wrappers count:");
        sbLIZ.append(((ConcurrentHashMap) this.LJJIFFI).size());
        sbLIZ.append(",[");
        sbLIZ.append(this);
        sbLIZ.append(e3.f);
        AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
        LLI(((ConcurrentHashMap) this.LJJIFFI).values());
        ((ConcurrentHashMap) this.LJJIFFI).clear();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("current auxstream video sink wrappers count:");
        sbLIZ2.append(((ConcurrentHashMap) this.LJJII).size());
        sbLIZ2.append(",[");
        sbLIZ2.append(this);
        sbLIZ2.append(e3.f);
        AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ2));
        LLI(((ConcurrentHashMap) this.LJJII).values());
        ((ConcurrentHashMap) this.LJJII).clear();
        ((ConcurrentHashMap) this.LJJJJZI).clear();
        ((ConcurrentHashMap) this.LJJJLIIL).clear();
        LLFII();
    }

    @Override // X.InterfaceC1276380jJs
    public final /* synthetic */ void LJJJJI(Object obj, String str) {
    }

    @Override // X.InterfaceC1276380jJs
    public final boolean LJJLIIIJLLLLLLLZ() {
        return false;
    }

    public final synchronized void LLFII() {
        this.LJIJI = null;
        GLThread gLThread = this.LJIJ;
        if (gLThread != null) {
            C1273730jFb.LIZLLL(gLThread);
            this.LJIJ = null;
        }
    }

    public final void LLIIIILZ() {
        StreamKey streamKeyLLIFFJFJJ;
        StreamKey streamKeyLLIFFJFJJ2;
        if (!LLIIL()) {
            for (C1274860jHQ c1274860jHQ : ((ConcurrentHashMap) this.LJJIFFI).values()) {
                this.LJZL.LIZ(this, 33, 0L, 0L, c1274860jHQ.LJIIJ, c1274860jHQ.LJ());
            }
            return;
        }
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJJJJZI).entrySet()) {
            if (entry != null && (streamKeyLLIFFJFJJ = LLIFFJFJJ((String) entry.getKey())) != null && streamKeyLLIFFJFJJ.getStreamIndex() == StreamIndex.STREAM_INDEX_MAIN && (streamKeyLLIFFJFJJ2 = LLIFFJFJJ((String) entry.getKey())) != null && !TextUtils.isEmpty(streamKeyLLIFFJFJJ2.getUserId())) {
                this.LJZL.LIZ(this, 33, 0L, 0L, streamKeyLLIFFJFJJ2.getUserId(), LJLLILLLL(streamKeyLLIFFJFJJ2));
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void setLinkmicStateForAnchorNet() {
    }

    @Override // X.InterfaceC1276380jJs
    public final void LIZ() {
        this.LJJLJ.LIZ("start_push_data");
        C1274690jH9.LJFF(new ARunnableS120S0100000_20(this, 280));
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJI() {
        this.LJIIIIZZ.LJIIIIZZ("composeAlternateImages", "");
        C1274690jH9.LJFF(new ARunnableS116S0100000_16(this, 188));
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJIILIIL() {
        this.LJIIIIZZ.LJIIIIZZ("removeAlternateImages", "");
        if (this.LJIJJLI != null) {
            C1274690jH9.LJFF(new ARunnableS116S0100000_16(this, 190));
            return;
        }
        Map<String, C1276670jKL> map = this.LJJLIIIJ;
        if (map != null) {
            ((ConcurrentHashMap) map).clear();
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final List<C1276580jKC> LJIILL() {
        InterfaceC1266360j3i interfaceC1266360j3i;
        ArrayList arrayList = new ArrayList();
        for (C1275750jIr c1275750jIr : this.LJJIIJ.values()) {
            C1276580jKC c1276580jKC = new C1276580jKC();
            String str = c1275750jIr.LIZ;
            c1276580jKC.LIZIZ = str;
            c1276580jKC.LJIILLIIL = c1275750jIr.LIZLLL;
            c1276580jKC.LJIIZILJ = c1275750jIr.LIZIZ;
            c1276580jKC.LJIJ = c1275750jIr.LIZJ;
            c1276580jKC.LJIIIZ = LJLLL(str);
            if (!c1275750jIr.LIZLLL) {
                C1269160j8E c1269160j8E = this.LJI.LJIJI;
                ASRWordMuting aSRWordMutingLJIJI = (c1269160j8E == null || (interfaceC1266360j3i = c1269160j8E.LJI) == null) ? null : interfaceC1266360j3i.LJIJI();
                if (aSRWordMutingLJIJI != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("enable_word_muting", aSRWordMutingLJIJI.enableWordMuting);
                        jSONObject.put("enable_segment_store", aSRWordMutingLJIJI.enableSegmentStore);
                        jSONObject.put("enable_sdk_callback", aSRWordMutingLJIJI.enableSdkCallback);
                        jSONObject.put("enable", aSRWordMutingLJIJI.enable);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("effectType", 2);
                        jSONObject2.put("effectParam", jSONObject);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(jSONObject2);
                        c1276580jKC.LJIJI = new C1276160jJW(arrayList2);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        AVLog.logKibana(4, "ClientImpl", "asrWordsMuting effectDesc error", e);
                    }
                }
            }
            if (LJLJLLL(c1275750jIr.LIZ)) {
                arrayList.add(c1276580jKC);
            }
        }
        synchronized (this.LJJIJIL) {
            try {
                for (String str2 : this.LJJIJIL) {
                    if (LJLJLLL(str2)) {
                        C1276580jKC c1276580jKC2 = new C1276580jKC();
                        c1276580jKC2.LIZIZ = str2;
                        c1276580jKC2.LJIIIZ = LJLLL(str2);
                        arrayList.add(c1276580jKC2);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (C1267520j5a.LIZ()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1276380jJs
    public final View LJJIJLIJ() {
        SurfaceView surfaceView = this.LJJIIZI;
        if (surfaceView != null) {
            return surfaceView;
        }
        SurfaceView surfaceView2 = new SurfaceView(this.LIZJ.LIZLLL);
        this.LJJIIZI = surfaceView2;
        C1273190jEj c1273190jEj = this.LJLLILLLL;
        c1273190jEj.getClass();
        SurfaceHolder holder = surfaceView2.getHolder();
        if (holder != null) {
            holder.addCallback(new SurfaceHolderCallbackC1273170jEh(c1273190jEj));
        }
        return this.LJJIIZI;
    }

    @Override // X.InterfaceC1276380jJs
    public final JSONArray LJJJJJL() {
        if (this.LJIIIZ == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            C1274910jHV c1274910jHV = this.LJIIIZ.LIZJ;
            Iterator<Map.Entry<String, Integer>> it2 = (c1274910jHV != null ? c1274910jHV.getVideoDelayAvgMSec() : null).entrySet().iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().getValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONArray;
    }

    @Override // X.InterfaceC1276380jJs
    public final RTCVideoInterface LJJJJZ() {
        C1274890jHT c1274890jHT = this.LJI;
        if (c1274890jHT != null) {
            return c1274890jHT.LJIILL;
        }
        return null;
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJLZIJ() {
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZJ.LIZ();
        if (abstractC1273900jFsLIZ != null) {
            abstractC1273900jFsLIZ.LJJLIIIIJ(42, 0, 0);
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJL() {
        this.LJIIIIZZ.LJIIIIZZ("composeCurrentWaterMarks", "");
        C1274690jH9.LJFF(new ARunnableS116S0100000_16(this, 189));
    }

    @Override // X.InterfaceC1276380jJs
    public final JSONArray LJJLIL() {
        if (this.LJIIIZ == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            C1274910jHV c1274910jHV = this.LJIIIZ.LIZJ;
            for (Map.Entry<String, List<C1275730jIp>> entry : (c1274910jHV != null ? c1274910jHV.getVideoFrozenInfo() : null).entrySet()) {
                JSONArray jSONArray2 = new JSONArray();
                for (C1275730jIp c1275730jIp : entry.getValue()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", c1275730jIp.LIZ);
                    jSONObject.put("reason", c1275730jIp.LIZIZ);
                    jSONArray2.put(jSONObject);
                }
                jSONArray.put(jSONArray2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONArray;
    }

    public final View LJL() {
        C1275030jHh c1275030jHh = this.LJIILJJIL;
        if (c1275030jHh != null && c1275030jHh.LIZIZ != null) {
            EnumC1275500jIS enumC1275500jIS = c1275030jHh.LJIILIIL;
            if (enumC1275500jIS == EnumC1275500jIS.TEXTURE_VIEW) {
                return new TextureView(this.LJIILJJIL.LIZIZ);
            }
            if (enumC1275500jIS == EnumC1275500jIS.SURFACE_VIEW) {
                SurfaceView surfaceView = new SurfaceView(this.LJIILJJIL.LIZIZ);
                surfaceView.setZOrderMediaOverlay(false);
                return surfaceView;
            }
        }
        return null;
    }

    public final void LJLJI() {
        RTCVideoImplV2 rTCVideoImplV2LJLJJI;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        NativeRenderConfig nativeRenderConfigLJIILL;
        if (this.LJJJJZ || (rTCVideoImplV2LJLJJI = LJLJJI()) == null) {
            return;
        }
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZJ.LIZ();
        if (abstractC1273900jFsLIZ == null || (nativeRenderConfigLJIILL = abstractC1273900jFsLIZ.LLD().LIZ.ttlhABSettingsConfigs.LJIILL()) == null) {
            j = 0;
            z = false;
            z2 = false;
            z3 = false;
        } else {
            z = nativeRenderConfigLJIILL.enable;
            z2 = nativeRenderConfigLJIILL.enableDelayInit;
            j = nativeRenderConfigLJIILL.initDelayTime;
            z3 = nativeRenderConfigLJIILL.supportHwDecoder;
        }
        C1269300j8S c1269300j8S = abstractC1273900jFsLIZ != null ? (C1269300j8S) abstractC1273900jFsLIZ.LJJIIJZLJL().LIZJ.getService(C1269300j8S.class) : null;
        C1275030jHh c1275030jHh = this.LJIILJJIL;
        Context context = c1275030jHh.LIZIZ;
        boolean z4 = c1275030jHh.LJIILIIL == EnumC1275500jIS.TEXTURE_VIEW;
        this.LJIJJLI.getClass();
        this.LJIJJLI.getClass();
        boolean z5 = this.LJLIL;
        this.LJIJJLI.getClass();
        rTCVideoImplV2LJLJJI.setRemoteVideoRendererFactory(new C1275000jHe(this, new C1275200jHy(context, z4, true, z5, true, z, z2, j, z3, c1269300j8S, this.LJJJI, this.LJIILJJIL)));
        this.LJJJJZ = true;
    }

    public final Handler LJLJJL() {
        Handler handler;
        this.LJIJJLI.getClass();
        Handler handler2 = this.LJIJI;
        if (handler2 != null) {
            return handler2;
        }
        synchronized (this) {
            try {
                if (this.LJIJI == null) {
                    GLThread gLThreadLIZ = C1273730jFb.LIZ(0, "GLVideoRenderer");
                    this.LJIJ = gLThreadLIZ;
                    gLThreadLIZ.start();
                    this.LJIJI = this.LJIJ.getHandler();
                }
                handler = this.LJIJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return handler;
    }

    public final int LJLJJLL() {
        AbstractC1273900jFs abstractC1273900jFsLIZ;
        C1269340j8W c1269340j8WLLD;
        LiveSdkSetting liveSdkSetting;
        C1274250jGR c1274250jGR = this.LIZJ;
        if (c1274250jGR == null || (abstractC1273900jFsLIZ = c1274250jGR.LIZ()) == null || (c1269340j8WLLD = abstractC1273900jFsLIZ.LLD()) == null || (liveSdkSetting = c1269340j8WLLD.LIZ) == null) {
            return -1;
        }
        return liveSdkSetting.LJIJJ();
    }

    public final VideoEncoderConfig LJLL() {
        C1274890jHT c1274890jHT = this.LJI;
        if (c1274890jHT == null) {
            return null;
        }
        C1275010jHf c1275010jHf = c1274890jHT.LJIILIIL;
        return c1275010jHf.LIZLLL != 0 ? c1275010jHf.LJ : c1275010jHf.LJ;
    }

    public final InterfaceC1274230jGP LJLLI() {
        this.LJIJJLI.getClass();
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZJ.LIZ();
        if (abstractC1273900jFsLIZ == null) {
            return null;
        }
        if (abstractC1273900jFsLIZ.LLD().LIZJ()) {
            return this.LJJZZIII;
        }
        Object objLLIIJI = abstractC1273900jFsLIZ.LLIIJI("LinkmicSimulcastStrategy");
        if (objLLIIJI instanceof InterfaceC1274230jGP) {
            return (InterfaceC1274230jGP) objLLIIJI;
        }
        return null;
    }

    public final boolean LJLZ() {
        C1275030jHh c1275030jHh = this.LJIILJJIL;
        if (c1275030jHh == null) {
            return false;
        }
        EnumC1275210jHz enumC1275210jHz = c1275030jHh.LJJIFFI;
        return enumC1275210jHz == EnumC1275210jHz.CLIENT_MIX || enumC1275210jHz == EnumC1275210jHz.RTC_CLIENT_MIX;
    }

    public final boolean LJZ() {
        AbstractC1273900jFs abstractC1273900jFsLIZ;
        C1274250jGR c1274250jGR = this.LIZJ;
        if (c1274250jGR == null || (abstractC1273900jFsLIZ = c1274250jGR.LIZ()) == null) {
            return false;
        }
        return abstractC1273900jFsLIZ.LLJILJILJ();
    }

    public final boolean LJZI() {
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZJ.LIZ();
        if (abstractC1273900jFsLIZ != null) {
            return abstractC1273900jFsLIZ.LLJJ();
        }
        return false;
    }

    public final boolean LJZL() {
        return this.LJIILJJIL.LJIIL == EnumC1274430jGj.GUEST;
    }

    public final void LLD() {
        C1275030jHh c1275030jHh = this.LJIILJJIL;
        if (c1275030jHh.LJIIL == EnumC1274430jGj.ANCHOR && c1275030jHh.LJIILL == EnumC1277290jLL.PK && LJLZ() && this.LJJIJLIJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyAdjustResolution in pk mode.client:");
            sbLIZ.append(this);
            AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
            VideoEncoderConfig videoEncoderConfigLJLL = LJLL();
            InterfaceC1274770jHH interfaceC1274770jHH = this.LJJIJLIJ;
            if (interfaceC1274770jHH != null) {
                ((C1274760jHG) interfaceC1274770jHH).LIZ(false, videoEncoderConfigLJLL.width, videoEncoderConfigLJLL.height);
            }
        }
    }

    public final void LLFF() {
        C1274890jHT c1274890jHT;
        int i = this.LJJJJI ? (this.LJJJJIZL || this.LJJJJJ) ? 2 : 0 : 1;
        if (i == this.LJJJJLI || (c1274890jHT = this.LJI) == null) {
            return;
        }
        this.LJJJJLI = i;
        if (i == 0) {
            c1274890jHT.setVideoSourceType(StreamIndex.STREAM_INDEX_MAIN, VideoSourceType.VIDEO_SOURCE_TYPE_EXTERNAL);
            C1274890jHT c1274890jHT2 = this.LJI;
            if (c1274890jHT2 != null) {
                c1274890jHT2.unpublishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO);
                return;
            }
            return;
        }
        if (i != 2) {
            c1274890jHT.setVideoSourceType(StreamIndex.STREAM_INDEX_MAIN, VideoSourceType.VIDEO_SOURCE_TYPE_EXTERNAL);
            this.LJJLIIJ = 0;
            C1274890jHT c1274890jHT3 = this.LJI;
            if (c1274890jHT3 != null) {
                c1274890jHT3.publishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO);
                return;
            }
            return;
        }
        c1274890jHT.setVideoSourceType(StreamIndex.STREAM_INDEX_MAIN, VideoSourceType.VIDEO_SOURCE_TYPE_INTERNAL);
        this.LJJLIIJ = 0;
        C1274890jHT c1274890jHT4 = this.LJI;
        if (c1274890jHT4 != null) {
            c1274890jHT4.publishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO);
        }
    }

    public final void LLFFF() {
        Iterator it2 = new ArrayList(((ConcurrentHashMap) this.LJJJJZI).keySet()).iterator();
        while (it2.hasNext()) {
            StreamKey streamKeyLLIFFJFJJ = LLIFFJFJJ((String) it2.next());
            if (streamKeyLLIFFJFJJ != null) {
                if (streamKeyLLIFFJFJJ.getStreamIndex() == StreamIndex.STREAM_INDEX_MAIN) {
                    LLFZ(streamKeyLLIFFJFJJ);
                } else {
                    String strLJJIFFI = LJJIFFI(streamKeyLLIFFJFJJ);
                    if (strLJJIFFI != null) {
                        LJLIIL(strLJJIFFI);
                    }
                }
            }
        }
    }

    public final boolean LLIIL() {
        return this.LJIIL && LJLJJI() != null;
    }

    @Override // X.InterfaceC1276380jJs
    public final void disableDownlinkAudioSelection() {
        this.LJIIIIZZ.LJIIIIZZ("disableDownlinkAudioSelection", null);
        C1274890jHT c1274890jHT = this.LJI;
        if (c1274890jHT != null) {
            c1274890jHT.disableDownlinkAudioSelection();
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void dispose() {
        C1274690jH9.LJFF(new ARunnableS120S0100000_20(this, 276));
    }

    @Override // X.InterfaceC1276380jJs
    public final List<LyraxTranscoderFeature> getFeatures() {
        C1266700j4G c1266700j4G = this.LJJJZ;
        if (c1266700j4G != null) {
            return c1266700j4G.LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC1276380jJs
    public final void joinChannel() {
        AVLog.logKibana(4, "ClientImpl", "ClientImpl joinChannel FunCall:", null);
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZJ.LIZ();
        if (abstractC1273900jFsLIZ != null) {
            C1269340j8W c1269340j8WLLD = abstractC1273900jFsLIZ.LLD();
            C1271250jBb c1271250jBb = C1271270jBd.LIZ;
            boolean zLJIIL = c1269340j8WLLD.LIZ.ttlhABSettingsConfigs.LJIIL();
            C1271260jBc c1271260jBc = c1271250jBb.LIZ;
            c1271260jBc.LJJIII = zLJIIL;
            c1271260jBc.LJIIIIZZ();
        }
        this.LJJLJ.LIZ("join_channel");
        C1274690jH9.LJFF(new ARunnableS120S0100000_20(this, 279));
    }

    @Override // X.InterfaceC1276380jJs
    public final void pause() {
        C1274690jH9.LJFF(new ARunnableS120S0100000_20(this, 272));
    }

    @Override // X.InterfaceC1276380jJs
    public final void resume() {
        C1274690jH9.LJFF(new ARunnableS120S0100000_20(this, 273));
    }

    @Override // X.InterfaceC1276380jJs
    public final void stop() {
        AVLog.ioi("ClientImpl", "stop() -->");
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        synchronized (c1274830jHN.LJII) {
            try {
                Iterator<C1275570jIZ> it2 = c1274830jHN.LJII.values().iterator();
                while (it2.hasNext()) {
                    c1274830jHN.LJIL(it2.next());
                }
                c1274830jHN.LJII.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1275090jHn c1275090jHn = this.LJJLL;
        if (c1275090jHn != null) {
            c1275090jHn.LIZIZ();
        }
        C1274690jH9.LJFF(new ARunnableS120S0100000_20(this, 274));
    }

    @Override // X.InterfaceC1276380jJs
    public final void stopForwardStreamToRooms() {
        C1274690jH9.LJFF(new ARunnableS120S0100000_20(this, 278));
    }

    public static void LJJIIZ() {
        C1269510j8n c1269510j8nLIZLLL = C1269500j8m.LIZJ().LIZLLL(1);
        if (c1269510j8nLIZLLL == null) {
            return;
        }
        try {
            c1269510j8nLIZLLL.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Method \"");
            sbLIZ.append(c1269510j8nLIZLLL.LIZJ);
            sbLIZ.append("\" check audio cert failed.");
            AVLog.logToIODeviceInternal(6, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final boolean LJJJJLL() {
        InterfaceC1274230jGP interfaceC1274230jGPLJLLI = LJLLI();
        return interfaceC1274230jGPLJLLI != null && interfaceC1274230jGPLJLLI.LJIILL();
    }

    public final RTCVideoImplV2 LJLJJI() {
        RTCVideoInterface rTCVideoInterfaceLJJJJZ = LJJJJZ();
        if (rTCVideoInterfaceLJJJJZ instanceof RTCVideoImplV2) {
            return (RTCVideoImplV2) rTCVideoInterfaceLJJJJZ;
        }
        return null;
    }

    @Override // X.InterfaceC1276380jJs
    public final List<String> LJJJZ() {
        return this.LJJLIL;
    }

    @Override // X.InterfaceC1276380jJs
    public final boolean Z4() {
        return this.LJJIZ;
    }

    @Override // X.InterfaceC1276380jJs
    public final C1275030jHh getConfig() {
        return this.LJIILJJIL;
    }

    public static EnumC1267980j6K LL(EnumC1276410jJv enumC1276410jJv) {
        int i = C1276390jJt.LJ[enumC1276410jJv.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return EnumC1267980j6K.NORMAL_LIVE;
                    }
                    return EnumC1267980j6K.LINKMIC_UNKNOWN;
                }
                return EnumC1267980j6K.GAME_DUAL_DEVICE;
            }
            return EnumC1267980j6K.LINKMIC_CO_HOST;
        }
        return EnumC1267980j6K.LINKMIC_MULTI_GUEST;
    }

    public static void LLI(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            C1274860jHQ c1274860jHQ = (C1274860jHQ) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release ");
            sbLIZ.append(c1274860jHQ);
            AVLog.iow("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
            c1274860jHQ.LJII();
        }
    }

    @Override // X.InterfaceC1272020jCq
    public final void LIZJ(List<C1269610j8x> list) {
        AbstractC1273900jFs abstractC1273900jFsLIZ;
        for (C1269610j8x c1269610j8x : list) {
            int i = C1276390jJt.LIZLLL[c1269610j8x.LIZLLL.ordinal()];
            AbstractC1273900jFs abstractC1273900jFsLIZ2 = null;
            if (i != 1) {
                if (i == 2 && (c1269610j8x instanceof C1269630j8z)) {
                    C1269630j8z c1269630j8z = (C1269630j8z) c1269610j8x;
                    C1274250jGR c1274250jGR = this.LIZJ;
                    if (c1274250jGR != null) {
                        abstractC1273900jFsLIZ2 = c1274250jGR.LIZ();
                    }
                    int i2 = C1269570j8t.LJFF;
                    if (abstractC1273900jFsLIZ2 != null) {
                        abstractC1273900jFsLIZ2.LLL(c1269630j8z.LIZLLL(i2));
                    }
                    C1271990jCn[] c1271990jCnArr = (C1271990jCn[]) c1269630j8z.LJII;
                    C1272000jCo c1272000jCo = (C1272000jCo) c1269630j8z.LJIIIIZZ;
                    C1274110jGD c1274110jGD = this.LJJZZIII;
                    if (c1274110jGD != null) {
                        c1274110jGD.LJ(c1271990jCnArr, c1272000jCo);
                    }
                    c1269630j8z.LJFF = (~i2) & c1269630j8z.LJFF;
                }
            } else if (c1269610j8x instanceof C1269600j8w) {
                int i3 = C1269570j8t.LJFF;
                JSONObject jSONObjectLIZLLL = c1269610j8x.LIZLLL(i3);
                C1274250jGR c1274250jGR2 = this.LIZJ;
                if (c1274250jGR2 != null && (abstractC1273900jFsLIZ = c1274250jGR2.LIZ()) != null) {
                    abstractC1273900jFsLIZ.LLL(jSONObjectLIZLLL);
                }
                String str = c1269610j8x.LJ;
                if (str != null) {
                    this.LJIILJJIL.LIZLLL = str;
                    this.LJI.LJJIIJ(str);
                    this.LJII = this.LJI.LJIIL();
                }
                c1269610j8x.LJFF = (~i3) & c1269610j8x.LJFF;
            }
        }
    }

    @Override // X.InterfaceC1268200j6g
    public final void LIZLLL(List<VideoEncoderConfig> list) {
        this.LJLZ = list;
        C1275050jHj c1275050jHj = this.LJLLLLLL;
        if (c1275050jHj != null) {
            c1275050jHj.LIZ(list);
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJFF(String str) {
        int iUnsubscribeStream = -1;
        if (!TextUtils.isEmpty(str) && str.length() >= 3) {
            if (this.LJI != null) {
                String strSubstring = str.substring(0, str.length() - 2);
                int numericValue = Character.getNumericValue(str.charAt(str.length() - 1));
                if (numericValue >= StreamIndex.STREAM_INDEX_2ND.value() && numericValue < StreamIndex.STREAM_INDEX_MAX.value()) {
                    iUnsubscribeStream = this.LJI.unsubscribeStream(strSubstring, StreamIndex.fromId(numericValue), MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH);
                    LJLIIIL(str);
                    if (this.LJJIIJ.containsKey(str)) {
                        this.LJJIIJ.remove(str);
                    }
                }
            }
            C1274830jHN c1274830jHN = this.LJIIIIZZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("streamId:");
            sbLIZ.append(str);
            sbLIZ.append(" ret:");
            sbLIZ.append(iUnsubscribeStream);
            c1274830jHN.LJIJ("unsubscribeAuxStreamWithStreamId", "", C2188811AlT.LIZIZ(sbLIZ));
            return iUnsubscribeStream;
        }
        if (!C1267520j5a.LIZ()) {
            C1274830jHN c1274830jHN2 = this.LJIIIIZZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" streamId:");
            sbLIZ2.append(str);
            sbLIZ2.append(" ret:");
            sbLIZ2.append(-1);
            c1274830jHN2.LJIJ("unsubscribeAuxStreamWithStreamId error!!", "", C2188811AlT.LIZIZ(sbLIZ2));
            return -1;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("unsubscribeAuxStreamWithStreamId error!! streamId:");
        sbLIZ3.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJIIIIZZ(List<LyraxTranscoderFeature> list) {
        VPassInteractCfg vPassInteractCfg = this.LJIJJLI;
        if (vPassInteractCfg != null) {
            vPassInteractCfg.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                if (list != null) {
                    for (LyraxTranscoderFeature lyraxTranscoderFeature : list) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("featureName", lyraxTranscoderFeature.getFeatureName());
                        jSONObject2.put("projectKey", lyraxTranscoderFeature.getProjectKey());
                        jSONObject2.put("options", lyraxTranscoderFeature.getOptions());
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("features", jSONArray);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            AVLog.logApiCall("RTCInteractAPI", "setFeatures", jSONObject);
        }
        if (this.LJIILJJIL.LJIIL != EnumC1274430jGj.ANCHOR) {
            return;
        }
        C1274690jH9.LJFF(new ARunnableS89S0200000_20(this, list, 174));
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJIIIZ(C969430bKn c969430bKn) {
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mixStreamParams:");
        sbLIZ.append(c969430bKn);
        c1274830jHN.LJIIIIZZ("stopRemoteEffect", C2188811AlT.LIZIZ(sbLIZ));
        C1274690jH9.LJFF(new ARunnableS89S0200000_20(this, c969430bKn, 171));
    }

    @Override // X.InterfaceC1268200j6g
    public final void LJIIJJI(C1268130j6Z c1268130j6Z) {
        this.LLFFF = c1268130j6Z;
        this.LJIIIIZZ.LJJIIJ = c1268130j6Z;
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJIIL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudioScene audioScene:");
        sbLIZ.append(i);
        AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
        C1274690jH9.LJFF(new ARunnableS31S0101000_20(i, this, 25));
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJIILLIIL(String str) {
        this.LJJIIJ.remove(str);
        return this.LJJIIJZLJL.LIZ(str);
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJIIZILJ(String str) {
        C1274690jH9.LJFF(new ARunnableS25S1100000_20(this, str, 23));
    }

    @Override // X.InterfaceC1273640jFS
    public final void LJIJ(JSONObject jSONObject) {
        if (!this.LJJIZ) {
            return;
        }
        LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStatsLJIL = this.LIZJ.LIZ().LJIL(jSONObject);
        C1274890jHT c1274890jHT = this.LJI;
        if (c1274890jHT != null) {
            c1274890jHT.updateExternalStats(StreamIndex.STREAM_INDEX_MAIN, lyraxPreProcessVideoNodeStatsLJIL);
        }
    }

    public final void LJJ(StreamKey streamKey) {
        RTCVideoImplV2 rTCVideoImplV2LJLJJI = LJLJJI();
        if (rTCVideoImplV2LJLJJI == null) {
            return;
        }
        LJLJI();
        LyraxVideoRenderConfig lyraxVideoRenderConfig = new LyraxVideoRenderConfig(LJJII(streamKey));
        String strLJJIFFI = LJJIFFI(streamKey);
        String str = lyraxVideoRenderConfig.renderId;
        if (str != null && !str.isEmpty() && strLJJIFFI != null) {
            if (rTCVideoImplV2LJLJJI.setRemoteVideoRenderConfig(streamKey, lyraxVideoRenderConfig) != ReturnStatus.RETURN_STATUS_SUCCESS.value()) {
                LLFZ(streamKey);
                return;
            }
            if (LJLLJ(streamKey) == null && rTCVideoImplV2LJLJJI.findRemoteVideoRenderer(streamKey) != null) {
                LLFZ(streamKey);
            }
            rTCVideoImplV2LJLJJI.getOrCreateRemoteVideoRenderer(streamKey);
        }
    }

    public final StreamKey LJJI(String str) {
        int iLastIndexOf;
        if (str != null && (iLastIndexOf = str.lastIndexOf(95)) > 0 && iLastIndexOf < str.length() - 1) {
            try {
                String strSubstring = str.substring(0, iLastIndexOf);
                int i = CastIntegerProtector.parseInt(str.substring(iLastIndexOf + 1));
                if (i < StreamIndex.STREAM_INDEX_2ND.value() || i >= StreamIndex.STREAM_INDEX_MAX.value()) {
                    return null;
                }
                return new StreamKey(this.LJJLIIIJJI, strSubstring, StreamIndex.fromId(i));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("buildAuxStreamKey parse failed, streamId:");
                sbLIZ.append(str);
                AVLog.logKibana(6, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
        return null;
    }

    public final String LJJIFFI(StreamKey streamKey) {
        if (streamKey != null && streamKey.getUserId() != null && streamKey.getStreamIndex() != null) {
            if (streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_MAIN) {
                return streamKey.getUserId();
            }
            if (this.LJJIIJZLJL != null) {
                return C1274940jHY.LJ(streamKey.getStreamIndex().value(), streamKey.getUserId());
            }
            return LJJII(streamKey);
        }
        return null;
    }

    public final String LJJII(StreamKey streamKey) {
        RTCVideoImplV2 rTCVideoImplV2LJLJJI = LJLJJI();
        if (rTCVideoImplV2LJLJJI == null) {
            return null;
        }
        return rTCVideoImplV2LJLJJI.buildRemoteVideoRenderId(streamKey);
    }

    @Override // X.InterfaceC1276380jJs
    public final C1275750jIr LJJIJ(C01IN c01in) {
        int i;
        C1275340jIC c1275340jIC;
        C1274940jHY c1274940jHY = this.LJJIIJZLJL;
        if (c01in == null) {
            C1274830jHN c1274830jHN = c1274940jHY.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mInteractId:");
            sbLIZ.append(c1274940jHY.LIZIZ);
            sbLIZ.append(" ,createAuxStream config");
            c1274830jHN.LJIIIIZZ("createAuxStream", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        c1274940jHY.getClass();
        String strLJ = c01in.LIZ;
        if (strLJ == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ConcurrentHashMap) c1274940jHY.LIZ).values().iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((C1275150jHt) it2.next()).LJII.value()));
            }
            i = 0;
            while (true) {
                if (i < StreamIndex.STREAM_INDEX_MAX.value()) {
                    if (C1274940jHY.LIZJ(i) && !arrayList.contains(Integer.valueOf(i))) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (!C1274940jHY.LIZJ(i)) {
                C1274830jHN c1274830jHN2 = c1274940jHY.LJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mInteractId:");
                sbLIZ2.append(c1274940jHY.LIZIZ);
                sbLIZ2.append(" ,generateAuxStreamIndex invalid streamIndex:");
                sbLIZ2.append(i);
                c1274830jHN2.LJIIIIZZ("createAuxStream", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
            strLJ = C1274940jHY.LJ(i, c1274940jHY.LIZIZ);
        } else {
            String[] strArrSplit = strLJ.split("_");
            i = CastIntegerProtector.parseInt(strArrSplit[strArrSplit.length - 1]);
            if (!C1274940jHY.LIZJ(i)) {
                C1274830jHN c1274830jHN3 = c1274940jHY.LJ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("mInteractId:");
                sbLIZ3.append(c1274940jHY.LIZIZ);
                sbLIZ3.append(" ,invalid streamIndex:");
                sbLIZ3.append(i);
                c1274830jHN3.LJIIIIZZ("createAuxStream", C2188811AlT.LIZIZ(sbLIZ3));
                return null;
            }
        }
        C1275750jIr c1275750jIr = new C1275750jIr(i, c1274940jHY.LIZIZ, strLJ, true);
        if (!((ConcurrentHashMap) c1274940jHY.LIZ).containsKey(strLJ)) {
            C1275150jHt c1275150jHt = new C1275150jHt(strLJ, StreamIndex.fromId(i), c1274940jHY.LIZJ, c01in, c1274940jHY.LJFF, c1274940jHY.LJI);
            c1274940jHY.getClass();
            c1275150jHt.LJIJJ = null;
            c1275150jHt.LJIJJLI = false;
            ((ConcurrentHashMap) c1274940jHY.LIZ).put(strLJ, c1275150jHt);
        }
        C1275550jIX c1275550jIX = ((C1274990jHd) c1274940jHY.LIZLLL).LIZIZ;
        if (c1275550jIX != null) {
            synchronized (c1275550jIX) {
                if (!((ConcurrentHashMap) c1275550jIX.LIZ).containsKey(strLJ)) {
                    ((ConcurrentHashMap) c1275550jIX.LIZ).put(strLJ, new C1275340jIC());
                }
            }
        }
        C01IL c01il = c01in.LIZIZ;
        if (c01il != null) {
            InterfaceC1275920jJ8 interfaceC1275920jJ8 = c1274940jHY.LIZLLL;
            int i2 = c01il.LIZ;
            int i3 = c01il.LIZIZ;
            int i4 = c01il.LIZJ;
            int i5 = c01il.LIZLLL;
            C1275550jIX c1275550jIX2 = ((C1274990jHd) interfaceC1275920jJ8).LIZIZ;
            if (c1275550jIX2 != null && (c1275340jIC = (C1275340jIC) ((ConcurrentHashMap) c1275550jIX2.LIZ).get(strLJ)) != null) {
                c1275340jIC.LJI = i2;
                c1275340jIC.LJII = i3;
                c1275340jIC.LJIIIIZZ = i4;
                c1275340jIC.LJIIIZ = i5;
            }
        }
        C1274830jHN c1274830jHN4 = c1274940jHY.LJ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("mInteractId:");
        sbLIZ4.append(c1274940jHY.LIZIZ);
        sbLIZ4.append(" ,streamId:");
        sbLIZ4.append(strLJ);
        c1274830jHN4.LJIIIIZZ("createAuxStream", C2188811AlT.LIZIZ(sbLIZ4));
        this.LJJIIJ.put(c1275750jIr.LIZIZ, c1275750jIr);
        return c1275750jIr;
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJIJIIJI(C969430bKn c969430bKn) {
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mixStreamParams:");
        sbLIZ.append(c969430bKn);
        c1274830jHN.LJIIIIZZ("startRemoteEffect", C2188811AlT.LIZIZ(sbLIZ));
        C1274690jH9.LJFF(new ARunnableS89S0200000_20(this, c969430bKn, 170));
    }

    public final void LJJIJIIJIL(StreamKey streamKey) {
        RTCVideoInterface rTCVideoInterfaceLJJJJZ = LJJJJZ();
        if (rTCVideoInterfaceLJJJJZ == null) {
            return;
        }
        rTCVideoInterfaceLJJJJZ.setRemoteVideoSink(streamKey, null, 0);
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJIJL(C1273200jEk c1273200jEk) {
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("params:");
        sbLIZ.append(c1273200jEk);
        c1274830jHN.LJIIIIZZ("startEffectMix", C2188811AlT.LIZIZ(sbLIZ));
        C1273190jEj c1273190jEj = this.LJLLILLLL;
        if (c1273190jEj != null) {
            c1273190jEj.LJIILJJIL(c1273200jEk);
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJIZ(int i) {
        TimeUtils.setLocalTimeGapWithServer(i);
        C1274890jHT c1274890jHT = this.LJI;
        if (c1274890jHT != null) {
            c1274890jHT.setSEICurrentShiftDiffTime(i);
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJ(List<C1276780jKW> list) {
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("compositeLayouts:");
        sbLIZ.append(C216900sZ.LIZIZ(list));
        c1274830jHN.LJIIIIZZ("stopEffectMix", C2188811AlT.LIZIZ(sbLIZ));
        C1273190jEj c1273190jEj = this.LJLLILLLL;
        if (c1273190jEj != null) {
            c1273190jEj.LJIILL(list);
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJI(C1274760jHG c1274760jHG) {
        C1274690jH9.LJFF(new ARunnableS89S0200000_20(this, c1274760jHG, 180));
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJIL(boolean z) {
        this.LJJJJJ = z;
        LLFF();
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJJJ(boolean z) {
        C1275030jHh c1275030jHh = this.LJIILJJIL;
        if (c1275030jHh != null) {
            c1275030jHh.LJJJJL = z;
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final boolean LJJJJLI(C1274190jGL c1274190jGL) {
        boolean zEquals = TextUtils.equals(this.LL, c1274190jGL.LIZ);
        String str = c1274190jGL.LIZ;
        this.LL = str;
        C1271260jBc c1271260jBc = C1271270jBd.LIZ.LIZ;
        c1271260jBc.LJJIFFI = str;
        c1271260jBc.LJIIIIZZ();
        InterfaceC1274230jGP interfaceC1274230jGPLJLLI = LJLLI();
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(this);
        sbLIZ.append(", layoutInfo ");
        sbLIZ.append(c1274190jGL);
        sbLIZ.append(" anchorNet:");
        sbLIZ.append(this.LJI.LJJIIZI());
        sbLIZ.append(" strategy:");
        sbLIZ.append(interfaceC1274230jGPLJLLI);
        sbLIZ.append(" sameConfigId:");
        sbLIZ.append(zEquals);
        c1274830jHN.LJIIIIZZ("updateLayoutInfo", C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1274230jGPLJLLI == null) {
            return false;
        }
        if (zEquals && interfaceC1274230jGPLJLLI.LJIILL()) {
            return true;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(this.LJIILJJIL.LJJJJLI).optJSONObject(c1274190jGL.LIZ);
            if (jSONObjectOptJSONObject == null) {
                AVLog.logKibana(4, "ClientImpl", "updateLayoutInfo: layoutConfig == null", null);
                return false;
            }
            String strLJIJ = interfaceC1274230jGPLJLLI.LJIJ();
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strLJIJ);
            if (jSONObjectOptJSONObject2 == null) {
                interfaceC1274230jGPLJLLI.LJIILIIL(false);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateLayoutInfo, no simulcast config, layout id:");
                sbLIZ2.append(c1274190jGL.LIZ);
                sbLIZ2.append(" layout config:");
                sbLIZ2.append(jSONObjectOptJSONObject);
                AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ2), null);
                return false;
            }
            interfaceC1274230jGPLJLLI.LJIILIIL(true);
            C1274690jH9.LJFF(new ARunnableS2S1500000_20(interfaceC1274230jGPLJLLI, strLJIJ, jSONObjectOptJSONObject, jSONObjectOptJSONObject2, c1274190jGL, this, 1));
            return true;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateLayoutInfo, JSONException:");
            sbLIZ3.append(e.getMessage());
            AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ3), e);
            return false;
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJLIIL(boolean z) {
        C1274690jH9.LJFF(new ARunnableS39S0110000_20(this, z, 21));
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLI(boolean z) {
        boolean zLJI = MethodIDManager.LJI(71938);
        C1274690jH9.LJFF(new ARunnableS39S0110000_20(this, z, 20));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIIJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("linkMicMediaPlayerCreated streamId:");
        sbLIZ.append(str);
        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        String str2 = this.LJJJLZIJ;
        if (!this.LJJIIJ.containsKey(str)) {
            this.LJJIIJ.put(str, new C1275750jIr(0, str2, str, true));
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIIJILLIZJL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("linkMicMediaPlayerReleased streamId:");
        sbLIZ.append(str);
        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        if (this.LJJIIJ.containsKey(str)) {
            this.LJJIIJ.remove(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0jGW] */
    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIIJJI(Cert cert) {
        C1269500j8m.LIZJ().LJ(1, "ClientImpl.startInteract", cert);
        this.LJJLJ.LIZ("start_interact");
        C1274690jH9.LJFF(new ARunnableS120S0100000_20(this, 270));
        C1275410jIJ c1275410jIJ = this.LJLJLJ;
        if (c1275410jIJ != null) {
            this.LJLL = new InterfaceC1269120j8A() { // from class: X.0jGW
                @Override // X.InterfaceC1269120j8A
                public final void firstAbnormalCallback(TTLHAbnormalDetectResultJava tTLHAbnormalDetectResultJava) {
                    C1274830jHN c1274830jHN = this.LIZ.LJIIIIZZ;
                    if (c1274830jHN != null && tTLHAbnormalDetectResultJava != null) {
                        Map<String, String> dictionary = tTLHAbnormalDetectResultJava.toDictionary();
                        JSONObject jSONObjectLIZIZ = c1274830jHN.LIZIZ(System.currentTimeMillis(), "first_abnormal_frame_detected");
                        if (jSONObjectLIZIZ != null && dictionary != null) {
                            try {
                                jSONObjectLIZIZ.put("event_name", "ttlh_monitor_event");
                                for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                                    jSONObjectLIZIZ.put(entry.getKey(), entry.getValue());
                                }
                                c1274830jHN.LJJ(jSONObjectLIZIZ);
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                                AVLog.ioe("first_abnormal_frame_detected", String.valueOf(e));
                            }
                        }
                    }
                }
            };
            C1274300jGW c1274300jGW = this.LJLL;
            synchronized (c1275410jIJ.LJII) {
                try {
                    c1275410jIJ.LJ = new WeakReference<>(c1274300jGW);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1269500j8m.LIZJ().LIZLLL(1);
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIIJJIZ(EnumC1277210jLD enumC1277210jLD) {
        EnumC1277210jLD enumC1277210jLD2 = EnumC1277210jLD.MULTI_VIEW;
        LLIIIL(enumC1277210jLD);
        if (enumC1277210jLD == EnumC1277210jLD.MULTI_VIEW) {
            LLIIIILZ();
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIIJL(List<C1276780jKW> list) {
        Handler handler;
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("compositeLayouts:");
        sbLIZ.append(C216900sZ.LIZIZ(list));
        c1274830jHN.LJIIIIZZ("setCompositeLayout", C2188811AlT.LIZIZ(sbLIZ));
        C1273190jEj c1273190jEj = this.LJLLILLLL;
        if (c1273190jEj != null && (handler = c1273190jEj.LLILLL.LIZIZ) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(list, c1273190jEj, 201));
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJJLIIIJLJLI(EnumC1276480jK2 enumC1276480jK2) {
        int downLinkAudioSelectionPriority;
        StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
        if (this.LJI != null) {
            downLinkAudioSelectionPriority = this.LJI.setDownLinkAudioSelectionPriority(streamIndex, DownLinkAudioSelectionPriority.fromId(enumC1276480jK2.value()));
        } else {
            downLinkAudioSelectionPriority = -1;
        }
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("streamIndex:");
        sbLIZ.append(streamIndex);
        sbLIZ.append(" priority:");
        sbLIZ.append(enumC1276480jK2.value());
        sbLIZ.append(" result:");
        sbLIZ.append(downLinkAudioSelectionPriority);
        c1274830jHN.LJIJ("setDownLinkAudioSelectionPriority", "", C2188811AlT.LIZIZ(sbLIZ));
        return downLinkAudioSelectionPriority;
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIJ(String str) {
        AbstractC1273900jFs abstractC1273900jFsLIZ;
        C1273190jEj c1273190jEj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("linkMicMediaPlayerStop streamId:");
        sbLIZ.append(str);
        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        if (str != null && str.endsWith("_game") && (abstractC1273900jFsLIZ = this.LIZJ.LIZ()) != null && (c1273190jEj = this.LJLLILLLL) != null) {
            c1273190jEj.LJIILIIL(abstractC1273900jFsLIZ.LLIIIZ());
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJJLJ(String str) {
        return LJJJLL(str, true, true);
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJZ(InterfaceC1274710jHB interfaceC1274710jHB) {
        C1274690jH9.LJFF(new ARunnableS89S0200000_20(this, interfaceC1274710jHB, 176));
    }

    public final void LJLIIIL(String str) {
        if (LLIIL()) {
            C1274690jH9.LJFF(new ARunnableS21S1100000_16(this, str, 8));
            return;
        }
        if (str == null) {
            return;
        }
        StreamKey streamKeyLJJI = LJJI(str);
        if (streamKeyLJJI != null) {
            LJJIJIIJIL(streamKeyLJJI);
        }
        C1274860jHQ c1274860jHQ = (C1274860jHQ) ((ConcurrentHashMap) this.LJJII).remove(str);
        if (c1274860jHQ != null) {
            c1274860jHQ.LJII();
        }
        C1274910jHV c1274910jHV = this.LJIIIZ.LIZJ;
        if (c1274910jHV != null) {
            c1274910jHV.removeUser(str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroyAuxStreamVideoSink streamId ");
        sbLIZ.append(str);
        AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJLIIL(String str) {
        if (str != null) {
            StreamKey streamKeyLJJI = LJJI(str);
            if (streamKeyLJJI != null) {
                LLFZ(streamKeyLJJI);
            }
            C1274910jHV c1274910jHV = this.LJIIIZ.LIZJ;
            if (c1274910jHV != null) {
                c1274910jHV.removeUser(str);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroyAuxStreamVideoRender streamId ");
            sbLIZ.append(str);
            AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJLILLLLZI(String str) {
        RTCVideoImplV2 rTCVideoImplV2LJLJJI;
        ILyraxEngine engine;
        ILyraxVideo videoModule;
        AbstractC1273900jFs abstractC1273900jFsLIZ;
        View viewLJZL;
        int iValue;
        LyraxVideoRendererManager videoRendererManager;
        AbstractC1273900jFs abstractC1273900jFsLIZ2;
        AbstractC1273900jFs abstractC1273900jFsLIZ3;
        if (LJLJJLL() >= 2 && LJLJJI() != null) {
            LJLJI();
            if (!LJZL()) {
                C1274250jGR c1274250jGR = this.LIZJ;
                if (c1274250jGR != null && (abstractC1273900jFsLIZ3 = c1274250jGR.LIZ()) != null) {
                    iValue = abstractC1273900jFsLIZ3.LLJZIJLIL();
                } else {
                    iValue = LyraxErrorCode.NOT_SUPPORT.value();
                }
            } else if (LJLJJLL() < 2 || (rTCVideoImplV2LJLJJI = LJLJJI()) == null || (engine = rTCVideoImplV2LJLJJI.getEngine()) == null || (videoModule = engine.getVideoModule()) == null) {
                iValue = LyraxErrorCode.NOT_SUPPORT.value();
            } else {
                C1274250jGR c1274250jGR2 = this.LIZJ;
                if (c1274250jGR2 != null) {
                    abstractC1273900jFsLIZ = c1274250jGR2.LIZ();
                    if (abstractC1273900jFsLIZ != null) {
                        InterfaceC1266410j3n interfaceC1266410j3nLLILII = abstractC1273900jFsLIZ.LLILII();
                        if (interfaceC1266410j3nLLILII instanceof ILyraxVideoPlatformWrapper) {
                            engine.bindVideoPlatformWrapper((ILyraxVideoPlatformWrapper) interfaceC1266410j3nLLILII);
                        }
                    }
                } else {
                    abstractC1273900jFsLIZ = null;
                }
                if (!this.LJZI && (videoRendererManager = videoModule.getVideoRendererManager()) != null) {
                    C1274250jGR c1274250jGR3 = this.LIZJ;
                    if (c1274250jGR3 != null) {
                        abstractC1273900jFsLIZ2 = c1274250jGR3.LIZ();
                    } else {
                        abstractC1273900jFsLIZ2 = null;
                    }
                    if ((abstractC1273900jFsLIZ2 instanceof InterfaceC1274510jGr) && abstractC1273900jFsLIZ2 != null) {
                        this.LJIJJLI.getClass();
                        videoRendererManager.setVideoRendererFactory(new C1275160jHu(this, abstractC1273900jFsLIZ2));
                        this.LJZI = true;
                    }
                }
                if (abstractC1273900jFsLIZ == null || (viewLJZL = abstractC1273900jFsLIZ.LJZL()) == null) {
                    iValue = LyraxErrorCode.NOT_SUPPORT.value();
                } else {
                    LyraxErrorCode lyraxErrorCodeResetPreviewView = videoModule.resetPreviewView(viewLJZL);
                    if (lyraxErrorCodeResetPreviewView == null) {
                        lyraxErrorCodeResetPreviewView = LyraxErrorCode.FAILURE;
                    }
                    iValue = lyraxErrorCodeResetPreviewView.value();
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ensureLyraxCapturePreviewRendererProviderConfigured reason=");
            sbLIZ.append(str);
            sbLIZ.append(" result=");
            sbLIZ.append(iValue);
            sbLIZ.append(" isGuest=");
            sbLIZ.append(LJZL());
            sbLIZ.append(" stage=");
            sbLIZ.append(LJLJJLL());
            sbLIZ.append(" down_native_render=");
            sbLIZ.append(this.LJIIL);
            AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }

    public final C1274860jHQ LJLJL(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LJJIFFI.get(str);
    }

    public final C1274860jHQ LJLJLJ(StreamKey streamKey) {
        C1274860jHQ c1274860jHQ;
        C1274860jHQ c1274860jHQ2;
        if (streamKey == null || streamKey.getStreamIndex() == null) {
            return null;
        }
        if (streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_MAIN) {
            synchronized (this.LJJIFFI) {
                try {
                    c1274860jHQ2 = (C1274860jHQ) ((ConcurrentHashMap) this.LJJIFFI).get(streamKey.getUserId());
                } finally {
                }
            }
            return c1274860jHQ2;
        }
        String strLJJIFFI = LJJIFFI(streamKey);
        if (strLJJIFFI == null) {
            return null;
        }
        synchronized (this.LJJII) {
            try {
                c1274860jHQ = (C1274860jHQ) ((ConcurrentHashMap) this.LJJII).get(strLJJIFFI);
            } finally {
            }
        }
        return c1274860jHQ;
    }

    public final boolean LJLJLLL(String str) {
        LyraxVideoRendererWrapper lyraxVideoRendererWrapperLLII;
        if (this.LJIILJJIL.LJIILL == EnumC1277290jLL.PK) {
            if (LLIIL()) {
                if (!TextUtils.isEmpty(str) && (lyraxVideoRendererWrapperLLII = LLII(new StreamKey(this.LJJLIIIJJI, str, StreamIndex.STREAM_INDEX_MAIN))) != null) {
                    if (!(!lyraxVideoRendererWrapperLLII.LJJIJ) && C1267520j5a.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getRenderedStat hasRenderFirstFrame:");
                        sbLIZ.append(str);
                        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
                    }
                    if (!(!lyraxVideoRendererWrapperLLII.LJJIJ)) {
                        return false;
                    }
                } else {
                    if (C1267520j5a.LIZ()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("getRenderedStat null Renderer:");
                        sbLIZ2.append(str);
                        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ2), null);
                        return false;
                    }
                    return false;
                }
            } else {
                if (LJLJL(str) == null) {
                    if (C1267520j5a.LIZ()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("getRenderedStat null Sink:");
                        sbLIZ3.append(str);
                        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ3), null);
                        return false;
                    }
                    return false;
                }
                if (!(!r1.LIZLLL) && C1267520j5a.LIZ()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("getRenderedStat hasRenderFirstFrame:");
                    sbLIZ4.append(str);
                    AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ4), null);
                }
                if (!r1.LIZLLL) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public final View LJLLILLLL(StreamKey streamKey) {
        View renderTargetView;
        LyraxVideoRendererWrapper lyraxVideoRendererWrapperLLII = LLII(streamKey);
        if (lyraxVideoRendererWrapperLLII != null && (renderTargetView = lyraxVideoRendererWrapperLLII.getRenderTargetView()) != null) {
            return renderTargetView;
        }
        RTCVideoImplV2 rTCVideoImplV2LJLJJI = LJLJJI();
        if (rTCVideoImplV2LJLJJI == null || streamKey == null) {
            return null;
        }
        return rTCVideoImplV2LJLJJI.getRemoteVideoRenderTargetView(streamKey);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        if (r0 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper LJLLJ(com.ss.bytertc.engine.data.StreamKey r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 != 0) goto L4
            return r2
        L4:
            java.lang.String r1 = r3.LJJII(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Lf
            return r2
        Lf:
            java.util.Map<java.lang.String, com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper> r0 = r3.LJJJJZI
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r1 = r0.get(r1)
            com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper r1 = (com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper) r1
            if (r1 == 0) goto L37
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L38
            boolean r0 = r1.LIZIZ
            if (r0 != 0) goto L38
            X.0jHx r0 = r1.LJIJ
            if (r0 != 0) goto L2b
            X.0jHx r0 = r1.LJIJI
            if (r0 == 0) goto L38
        L2b:
            monitor-enter(r1)
            X.0jHx r0 = r1.LJIIIIZZ()     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L34:
            monitor-exit(r1)
            if (r0 == 0) goto L38
        L37:
            return r1
        L38:
            r3.LLFZ(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274810jHL.LJLLJ(com.ss.bytertc.engine.data.StreamKey):com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper");
    }

    public final boolean LJLLL(String str) {
        if (str == null) {
            C1267520j5a.LIZIZ("getTalkingState, null interactId");
            return false;
        }
        if (!this.LJJIJL.containsKey(str)) {
            return false;
        }
        return this.LJJIJL.get(str).booleanValue();
    }

    public final InterfaceC1274490jGp LJLLLL(String str) {
        InterfaceC1275190jHx interfaceC1275190jHxLJIIIIZZ;
        StreamKey streamKey = new StreamKey(this.LJJLIIIJJI, str, StreamIndex.STREAM_INDEX_MAIN);
        if (LLIIL()) {
            LyraxVideoRendererWrapper lyraxVideoRendererWrapperLLII = LLII(streamKey);
            if (lyraxVideoRendererWrapperLLII == null) {
                return null;
            }
            synchronized (lyraxVideoRendererWrapperLLII) {
                interfaceC1275190jHxLJIIIIZZ = lyraxVideoRendererWrapperLLII.LJIIIIZZ();
            }
            if (interfaceC1275190jHxLJIIIIZZ == null) {
                return null;
            }
            return interfaceC1275190jHxLJIIIIZZ.LIZJ();
        }
        C1274860jHQ c1274860jHQLJLJL = LJLJL(str);
        if (c1274860jHQLJLJL == null) {
            return null;
        }
        return c1274860jHQLJLJL.LJI();
    }

    public final View LJLLLLLL(String str) {
        StreamKey streamKey = new StreamKey(this.LJJLIIIJJI, str, StreamIndex.STREAM_INDEX_MAIN);
        if (LLIIL()) {
            return LJLLILLLL(streamKey);
        }
        C1274860jHQ c1274860jHQLJLJL = LJLJL(str);
        if (c1274860jHQLJLJL == null) {
            return null;
        }
        EnumC1275500jIS enumC1275500jIS = this.LJIILJJIL.LJIILIIL;
        if (enumC1275500jIS == EnumC1275500jIS.SURFACE_VIEW) {
            return c1274860jHQLJLJL.LJ();
        }
        if (enumC1275500jIS != EnumC1275500jIS.TEXTURE_VIEW) {
            return null;
        }
        return c1274860jHQLJLJL.LJFF();
    }

    public final void LLFZ(StreamKey streamKey) {
        RTCVideoImplV2 rTCVideoImplV2LJLJJI = LJLJJI();
        if (rTCVideoImplV2LJLJJI != null) {
            if (streamKey != null) {
                rTCVideoImplV2LJLJJI.detachRemoteVideoRenderer(streamKey);
            } else {
                return;
            }
        } else if (streamKey == null) {
            return;
        }
        String strLJJII = LJJII(streamKey);
        if (strLJJII != null) {
            this.LJJJJZI.remove(strLJJII);
            this.LJJJLIIL.remove(strLJJII);
        }
    }

    public final StreamKey LLIFFJFJJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(95);
        if (iLastIndexOf > 0 && iLastIndexOf < str.length() - 1) {
            try {
                String strSubstring = str.substring(0, iLastIndexOf);
                StreamIndex streamIndexFromId = StreamIndex.fromId(CastIntegerProtector.parseInt(str.substring(iLastIndexOf + 1)));
                if (streamIndexFromId == null) {
                    return new StreamKey(this.LJJLIIIJJI, str, StreamIndex.STREAM_INDEX_MAIN);
                }
                return new StreamKey(this.LJJLIIIJJI, strSubstring, streamIndexFromId);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return new StreamKey(this.LJJLIIIJJI, str, StreamIndex.STREAM_INDEX_MAIN);
            }
        }
        return new StreamKey(this.LJJLIIIJJI, str, StreamIndex.STREAM_INDEX_MAIN);
    }

    public final LyraxVideoRendererWrapper LLII(StreamKey streamKey) {
        LyraxVideoRendererWrapper lyraxVideoRendererWrapperLJLLJ = LJLLJ(streamKey);
        if (lyraxVideoRendererWrapperLJLLJ == null) {
            RTCVideoImplV2 rTCVideoImplV2LJLJJI = LJLJJI();
            if (rTCVideoImplV2LJLJJI != null && streamKey != null) {
                ILyraxVideoRenderer remoteVideoRenderer = rTCVideoImplV2LJLJJI.getRemoteVideoRenderer(streamKey);
                if (remoteVideoRenderer instanceof LyraxVideoRendererWrapper) {
                    return (LyraxVideoRendererWrapper) remoteVideoRenderer;
                }
                return null;
            }
            return null;
        }
        return lyraxVideoRendererWrapperLJLLJ;
    }

    public final void LLIIIJ(EnumC1275210jHz enumC1275210jHz) {
        C1274690jH9.LJFF(new ARunnableS89S0200000_20(this, enumC1275210jHz, 175));
    }

    public final void LLIIIL(EnumC1277210jLD enumC1277210jLD) {
        boolean z;
        this.LJIIIIZZ.LJIIIIZZ("updateInternalViewModeFlagsInternal", enumC1277210jLD.toString());
        if (enumC1277210jLD == EnumC1277210jLD.SINGLE_VIEW) {
            z = true;
        } else {
            z = false;
        }
        RTCVideoImplV2 rTCVideoImplV2LJLJJI = LJLJJI();
        if (rTCVideoImplV2LJLJJI != null) {
            rTCVideoImplV2LJLJJI.setGlobalSingleViewMode(z);
        }
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZJ.LIZ();
        if (abstractC1273900jFsLIZ != null) {
            abstractC1273900jFsLIZ.LJLJLLL(z);
        }
        C1273190jEj c1273190jEj = this.LJLLILLLL;
        Handler handler = c1273190jEj.LLILLL.LIZIZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS39S0110000_20(c1273190jEj, z, 24));
        }
        Iterator it2 = ((ConcurrentHashMap) this.LJJIFFI).values().iterator();
        while (it2.hasNext()) {
            ((C1274860jHQ) it2.next()).LJIIIIZZ(z);
        }
        synchronized (this.LJJIJIL) {
            try {
                for (String str : (ArrayList) this.LJJIJIL) {
                    if (!TextUtils.equals(str, this.LJJJLZIJ)) {
                        StreamKey streamKey = new StreamKey(this.LJJLIIIJJI, str, StreamIndex.STREAM_INDEX_MAIN);
                        if (LLIIL()) {
                            LJJ(streamKey);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (abstractC1273900jFsLIZ != null && abstractC1273900jFsLIZ.LLJIJIL()) {
            Iterator it3 = ((ConcurrentHashMap) this.LJJII).values().iterator();
            while (it3.hasNext()) {
                ((C1274860jHQ) it3.next()).LJIIIIZZ(z);
            }
            for (C1275750jIr c1275750jIr : ((LinkedHashMap) this.LJJIIJ).values()) {
                if (c1275750jIr.LIZLLL && !TextUtils.equals(c1275750jIr.LIZ, this.LJJJLZIJ) && !TextUtils.isEmpty(c1275750jIr.LIZ)) {
                    StreamKey streamKey2 = new StreamKey(this.LJJLIIIJJI, c1275750jIr.LIZ, StreamIndex.fromId(c1275750jIr.LIZJ));
                    if (LLIIL()) {
                        LJJ(streamKey2);
                    }
                }
            }
        }
    }

    public final void LLIIJLIL(String str) {
        JSONObject jSONObjectOptJSONObject;
        int iOptInt;
        int iOptInt2;
        int iOptInt3;
        String strOptString;
        JSONObject jSONObjectOptJSONObject2;
        int iOptInt4;
        String strJ3 = str;
        C1275030jHh c1275030jHh = this.LJIILJJIL;
        c1275030jHh.LIZLLL = strJ3;
        if (c1275030jHh.LIZ().LJFF != 0.5f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("modifySizeIfFrameRatioOpt: ratio not matched, ratio:");
            sbLIZ.append(this.LJIILJJIL.LIZ().LJFF);
            AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(strJ3);
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("live_rtc_video_param");
                if (jSONObjectOptJSONObject3 == null) {
                    jSONObjectOptJSONObject = null;
                } else {
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("rtc_video_param_server_define");
                    if (jSONObjectOptJSONObject != null) {
                        iOptInt = jSONObjectOptJSONObject.optInt("width", 0);
                        iOptInt2 = jSONObjectOptJSONObject.optInt("height", 0);
                        iOptInt3 = jSONObjectOptJSONObject.optInt("bitrate_kbps", 0);
                    }
                    strOptString = jSONObject.optString("layout_config_id", "");
                    if (iOptInt > 0 && iOptInt2 > 0 && iOptInt3 > 0 && jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(new JSONObject(this.LJIILJJIL.LJJJJLI), strOptString);
                        int iOptInt5 = jSONObjectOptJSONObject.optInt("height", 0);
                        int iOptInt6 = jSONObjectOptJSONObject.optInt("bitrate_kbps", 0);
                        jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("rtc_video_param_server_define");
                        if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optInt("height", 0) == iOptInt5 && jSONObjectOptJSONObject2.optInt("bitrate_kbps", 0) == iOptInt6 && (iOptInt4 = jSONObjectOptJSONObject2.optInt("bitrate_kbps_1_2", 0)) > 0) {
                            try {
                                jSONObjectOptJSONObject.put("bitrate_kbps", iOptInt4);
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        jSONObjectOptJSONObject3.put("rtc_video_param_server_define", jSONObjectOptJSONObject);
                        jSONObject.put("layout_config_id", jSONObjectOptJSONObject3);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("modifySizeIfFrameRatioOpt: modified configObj result:");
                        sbLIZ2.append(jSONObject);
                        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ2), null);
                        strJ3 = C786410Ut5.J3(jSONObject);
                    }
                }
                iOptInt = 0;
                iOptInt2 = 0;
                iOptInt3 = 0;
                strOptString = jSONObject.optString("layout_config_id", "");
                if (iOptInt > 0) {
                    JSONObject jSONObject22 = JSONObjectProtectorUtils.getJSONObject(new JSONObject(this.LJIILJJIL.LJJJJLI), strOptString);
                    int iOptInt52 = jSONObjectOptJSONObject.optInt("height", 0);
                    int iOptInt62 = jSONObjectOptJSONObject.optInt("bitrate_kbps", 0);
                    jSONObjectOptJSONObject2 = jSONObject22.optJSONObject("rtc_video_param_server_define");
                    if (jSONObjectOptJSONObject2 != null) {
                        jSONObjectOptJSONObject.put("bitrate_kbps", iOptInt4);
                    }
                    jSONObjectOptJSONObject3.put("rtc_video_param_server_define", jSONObjectOptJSONObject);
                    jSONObject.put("layout_config_id", jSONObjectOptJSONObject3);
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append("modifySizeIfFrameRatioOpt: modified configObj result:");
                    sbLIZ22.append(jSONObject);
                    AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ22), null);
                    strJ3 = C786410Ut5.J3(jSONObject);
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                strJ3 = null;
            }
        }
        this.LJI.LJJIIJ(strJ3);
        this.LJII = this.LJI.LJIIL();
    }

    @Override // X.InterfaceC1276380jJs
    public final void b0(boolean z) {
        String str;
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        c1274830jHN.LJIIIIZZ("enableAIExplanationTask", str);
        C1274690jH9.LJFF(new ARunnableS39S0110000_20(this, z, 19));
    }

    @Override // X.InterfaceC1276380jJs
    public final void enableDownlinkAudioSelection(int i) {
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("number:");
        sbLIZ.append(i);
        c1274830jHN.LJIIIIZZ("enableDownlinkAudioSelection", C2188811AlT.LIZIZ(sbLIZ));
        C1274890jHT c1274890jHT = this.LJI;
        if (c1274890jHT != null) {
            c1274890jHT.enableDownlinkAudioSelection(i);
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void muteAllRemoteAudioStreams(boolean z) {
        C1274690jH9.LJFF(new ARunnableS39S0110000_20(this, z, 22));
    }

    @Override // X.InterfaceC1276380jJs
    public final void muteAllRemoteVideoStreams(boolean z) {
        C1274690jH9.LJFF(new ARunnableS39S0110000_20(this, z, 23));
    }

    @Override // X.InterfaceC1276380jJs
    public final long sendRoomMessage(String str) {
        C1274690jH9.LJFF(new ARunnableS25S1100000_20(this, str, 21));
        return 0L;
    }

    @Override // X.InterfaceC1276380jJs
    public final void setBizSessionId(String str) {
        C1274890jHT c1274890jHT = this.LJI;
        if (c1274890jHT != null) {
            c1274890jHT.setBizSessionId(str);
        }
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bizSessionId:");
        sbLIZ.append(str);
        c1274830jHN.LJIJ("setBizSessionId", "", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1276380jJs
    public final void setBusinessId(String str) {
        if (str == null) {
            return;
        }
        C1275030jHh c1275030jHh = this.LJIILJJIL;
        if (c1275030jHh != null && !TextUtils.isEmpty(str)) {
            c1275030jHh.LJJIIZ = str;
        }
        this.LJJIJ = str;
        C1274890jHT c1274890jHT = this.LJI;
        if (c1274890jHT != null) {
            c1274890jHT.setBusinessId(str);
            C1274830jHN c1274830jHN = this.LJIIIIZZ;
            if (c1274830jHN != null) {
                c1274830jHN.LJIIIIZZ("setBusinessId", str);
            }
        }
        C1274890jHT c1274890jHT2 = this.LJI;
        if (c1274890jHT2 != null) {
            c1274890jHT2.setBusinessLabel(str);
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void setGroupChannelId(String str) {
        C1274890jHT c1274890jHT = this.LJI;
        if (c1274890jHT != null) {
            c1274890jHT.setGroupChannelId(str);
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void setLinkMicType(LinkMicType linkMicType) {
        C1274890jHT c1274890jHT = this.LJI;
        if (c1274890jHT != null) {
            c1274890jHT.setLinkMicType(linkMicType);
        }
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("linkMicType:");
        sbLIZ.append(linkMicType.value);
        c1274830jHN.LJIJ("setLinkMicType", "", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1276380jJs
    public final void setRemoteRoomAudioPlaybackVolume(int i) {
        C1274690jH9.LJFF(new ARunnableS31S0101000_20(i, this, 26));
    }

    @Override // X.InterfaceC1276380jJs
    public final int startAuxStream(String str) {
        int i;
        C1274940jHY c1274940jHY = this.LJJIIJZLJL;
        c1274940jHY.getClass();
        if (TextUtils.isEmpty(str)) {
            i = -1;
        } else {
            i = 0;
        }
        C1275150jHt c1275150jHtLIZIZ = c1274940jHY.LIZIZ(str);
        if (c1275150jHtLIZIZ == null) {
            i = -2;
        }
        if (i != 0) {
            C1274830jHN c1274830jHN = c1274940jHY.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mInteractId:");
            sbLIZ.append(c1274940jHY.LIZIZ);
            sbLIZ.append(" ,streamId:");
            sbLIZ.append(str);
            sbLIZ.append(" ,result:");
            sbLIZ.append(i);
            c1274830jHN.LJIIIIZZ("startAuxStream", C2188811AlT.LIZIZ(sbLIZ));
            return i;
        }
        c1275150jHtLIZIZ.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("start:");
        sbLIZ2.append(c1275150jHtLIZIZ.LJFF);
        AVLog.logKibana(4, "AuxStream", C2188811AlT.LIZIZ(sbLIZ2), null);
        C786410Ut5.LJJZZIII(c1275150jHtLIZIZ.LJIILLIIL, new ARunnableS120S0100000_20(c1275150jHtLIZIZ, 304));
        C1274830jHN c1274830jHN2 = c1274940jHY.LJ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("mInteractId:");
        sbLIZ3.append(c1274940jHY.LIZIZ);
        sbLIZ3.append(" ,streamId:");
        sbLIZ3.append(str);
        sbLIZ3.append(" ,result:");
        sbLIZ3.append(i);
        c1274830jHN2.LJIIIIZZ("startAuxStream", C2188811AlT.LIZIZ(sbLIZ3));
        return i;
    }

    @Override // X.InterfaceC1276380jJs
    public final int startForwardStreamToRooms(List<C1275450jIN> list) {
        this.LJJLJ.LIZ("start_forward");
        C1274690jH9.LJFF(new ARunnableS89S0200000_20(this, new ArrayList(list), 172));
        return 0;
    }

    @Override // X.InterfaceC1276380jJs
    public final void stop(Cert cert) {
        C1269500j8m.LIZJ().LJ(1, "ClientImpl.stop", cert);
        stop();
        C1269500j8m.LIZJ().LIZLLL(1);
    }

    @Override // X.InterfaceC1276380jJs
    public final int stopAuxStream(String str) {
        int i;
        C1274940jHY c1274940jHY = this.LJJIIJZLJL;
        c1274940jHY.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopAuxStream:");
        sbLIZ.append(str);
        AVLog.logKibana(4, "AuxStreamManager", C2188811AlT.LIZIZ(sbLIZ), null);
        if (TextUtils.isEmpty(str)) {
            i = -1;
        } else {
            i = 0;
        }
        C1275150jHt c1275150jHtLIZIZ = c1274940jHY.LIZIZ(str);
        if (c1275150jHtLIZIZ == null) {
            i = -2;
        }
        if (i != 0) {
            C1274830jHN c1274830jHN = c1274940jHY.LJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mInteractId:");
            sbLIZ2.append(c1274940jHY.LIZIZ);
            sbLIZ2.append(" ,streamId:");
            sbLIZ2.append(str);
            sbLIZ2.append(" ,result:");
            sbLIZ2.append(i);
            c1274830jHN.LJIIIIZZ("stopAuxStream", C2188811AlT.LIZIZ(sbLIZ2));
            return i;
        }
        c1275150jHtLIZIZ.LIZIZ();
        C1274830jHN c1274830jHN2 = c1274940jHY.LJ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("mInteractId:");
        sbLIZ3.append(c1274940jHY.LIZIZ);
        sbLIZ3.append(" ,streamId:");
        sbLIZ3.append(str);
        sbLIZ3.append(" ,result:");
        sbLIZ3.append(i);
        c1274830jHN2.LJIIIIZZ("stopAuxStream", C2188811AlT.LIZIZ(sbLIZ3));
        return i;
    }

    @Override // X.InterfaceC1276380jJs
    public final int updateForwardStreamToRooms(List<C1275450jIN> list) {
        C1274690jH9.LJFF(new ARunnableS89S0200000_20(this, new ArrayList(list), 173));
        return 0;
    }

    @Override // X.InterfaceC1276380jJs
    public final void updateRtcExtInfo(String str) {
        this.LJJZ = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("layout_config_id", "");
            this.LL = strOptString;
            C1271260jBc c1271260jBc = C1271270jBd.LIZ.LIZ;
            c1271260jBc.LJJIFFI = strOptString;
            c1271260jBc.LJIIIIZZ();
            if (this.LIZJ.LIZ().LLD().LJJLIIIJILLIZJL != null) {
                this.LIZJ.LIZ().LLD().LJJLIIIJILLIZJL.updateFeature("linkmic_layout_config_id", "not_set");
            } else {
                this.LIZJ.LIZ().LLLLLLZZ(new C1267110j4v());
            }
            AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZJ.LIZ();
            if (abstractC1273900jFsLIZ != null && abstractC1273900jFsLIZ.LLILZLL()) {
                setBusinessId(jSONObject.optString("rtc_business_id", ""));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1274690jH9.LJFF(new ARunnableS25S1100000_20(this, str, 22));
    }

    @Override // X.InterfaceC1272020jCq
    public final void LJIIJ(VideoFrame videoFrame, LyraxErrorCode lyraxErrorCode) {
        boolean z;
        if (videoFrame != null && lyraxErrorCode != null) {
            if (lyraxErrorCode != LyraxErrorCode.SUCCESS && lyraxErrorCode != LyraxErrorCode.TIMESTAMP_ERROR) {
                z = false;
            } else {
                z = true;
            }
            C1274830jHN c1274830jHN = this.LJIIIIZZ;
            if (c1274830jHN != null) {
                if (this.LJIJJLI != null) {
                    c1274830jHN.LIZ(z);
                } else {
                    C1274690jH9.LJ(new ARunnableS2S0120000_20(c1274830jHN, z, 1));
                }
            }
            C1274990jHd c1274990jHd = this.LJIIIZ;
            if (c1274990jHd != null) {
                c1274990jHd.LJ(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJIILJJIL(String str, C1276750jKT c1276750jKT) {
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("waterMarkId:");
        sbLIZ.append(str);
        sbLIZ.append(" region:");
        sbLIZ.append(c1276750jKT);
        c1274830jHN.LJIIIIZZ("setAlternateImageWithId", C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        C1274690jH9.LJFF(new ARunnableS20S1200000_16(c1276750jKT, this, str, 17));
        return 0;
    }

    @Override // X.InterfaceC1272020jCq
    public final void LJIJI(int i, int i2) {
        int i3;
        C1275560jIY c1275560jIY;
        if (i > 0 && i2 > 0) {
            int i4 = this.LJJJJJL;
            int i5 = this.LJJJJL;
            if (i4 == i && i5 == i2) {
                return;
            }
            C1275030jHh c1275030jHh = this.LJIILJJIL;
            if (c1275030jHh != null && (c1275560jIY = c1275030jHh.LJIILJJIL) != null) {
                i3 = c1275560jIY.LJ;
            } else {
                i3 = 0;
            }
            if (this.LJI != null && c1275030jHh != null && c1275030jHh.LJJJIL && c1275030jHh.LJJIFFI == EnumC1275210jHz.RTC_CLIENT_MIX) {
                VideoCaptureConfig videoCaptureConfig = new VideoCaptureConfig(i, i2, i3);
                this.LJI.setVideoCaptureConfig(videoCaptureConfig);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RtcClientMixUseOriginStream, setVideoCaptureConfig: ");
                sbLIZ.append(videoCaptureConfig.toString());
                AVLog.iow("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
            C1274890jHT c1274890jHT = this.LJI;
            if (c1274890jHT != null && c1274890jHT.LJIILLIIL()) {
                VideoCaptureConfig videoCaptureConfig2 = new VideoCaptureConfig(i, i2, i3);
                this.LJI.setVideoCaptureConfig(videoCaptureConfig2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AnchorNet, setVideoCaptureConfig2: ");
                sbLIZ2.append(videoCaptureConfig2.toString());
                AVLog.iow("ClientImpl", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (i4 != 0 && i5 != 0) {
                InterfaceC1274710jHB interfaceC1274710jHB = this.LJJLI;
                if (interfaceC1274710jHB != null) {
                    interfaceC1274710jHB.LIZ(this, 22, 0L, 0L, Integer.valueOf(i), Integer.valueOf(i2));
                }
                C1274830jHN c1274830jHN = this.LJIIIIZZ;
                if (c1274830jHN != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("origin video with:");
                    sbLIZ3.append(i4);
                    sbLIZ3.append(" height:");
                    sbLIZ3.append(i5);
                    sbLIZ3.append(" current video width:");
                    sbLIZ3.append(i);
                    sbLIZ3.append(" height:");
                    sbLIZ3.append(i2);
                    c1274830jHN.LJIIJ(C2188811AlT.LIZIZ(sbLIZ3));
                }
                this.LJJJJJL = i;
                this.LJJJJL = i2;
                return;
            }
            this.LJJJJJL = i;
            this.LJJJJL = i2;
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJIJJ(String str, C01IM c01im) {
        int i;
        C1274940jHY c1274940jHY = this.LJJIIJZLJL;
        c1274940jHY.getClass();
        if (!TextUtils.isEmpty(str)) {
            i = 0;
        } else {
            i = -1;
        }
        C1275150jHt c1275150jHtLIZIZ = c1274940jHY.LIZIZ(str);
        if (c1275150jHtLIZIZ == null) {
            i = -2;
        }
        if (i != 0) {
            C1274830jHN c1274830jHN = c1274940jHY.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mInteractId:");
            sbLIZ.append(c1274940jHY.LIZIZ);
            sbLIZ.append(" ,streamId:");
            sbLIZ.append(str);
            sbLIZ.append(" ,result:");
            sbLIZ.append(i);
            c1274830jHN.LJIIIIZZ("updateAuxStreamSourceConfig", C2188811AlT.LIZIZ(sbLIZ));
            return i;
        }
        C786410Ut5.LJJZZIII(c1275150jHtLIZIZ.LJIILLIIL, new ARunnableS89S0200000_20(c1275150jHtLIZIZ, c01im, 185));
        C1274830jHN c1274830jHN2 = c1274940jHY.LJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("mInteractId:");
        sbLIZ2.append(c1274940jHY.LIZIZ);
        sbLIZ2.append(" ,streamId:");
        sbLIZ2.append(str);
        sbLIZ2.append(" ,result:");
        sbLIZ2.append(i);
        c1274830jHN2.LJIIIIZZ("updateAuxStreamSourceConfig", C2188811AlT.LIZIZ(sbLIZ2));
        return i;
    }

    public final void LJIL(StreamKey streamKey, LyraxVideoRendererWrapper lyraxVideoRendererWrapper) {
        if (streamKey == null || streamKey.getStreamIndex() == null || lyraxVideoRendererWrapper == null || this.LJLJLJ == null || lyraxVideoRendererWrapper.LJJIFFI.get() != null) {
            return;
        }
        synchronized (lyraxVideoRendererWrapper) {
            try {
                if (lyraxVideoRendererWrapper.LJJIFFI.get() != null) {
                    return;
                }
                TTLHAbnormalDetectorJava tTLHAbnormalDetectorJavaLIZIZ = this.LJLJLJ.LIZIZ(streamKey.getStreamIndex().value(), streamKey.getUserId());
                if (tTLHAbnormalDetectorJavaLIZIZ != null) {
                    lyraxVideoRendererWrapper.LJJIFFI.set(tTLHAbnormalDetectorJavaLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJIII(String str, List list) {
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sei:");
        sbLIZ.append(str);
        sbLIZ.append(" regions:");
        sbLIZ.append(list);
        c1274830jHN.LJIIIIZZ("composeAlternateImages", C2188811AlT.LIZIZ(sbLIZ));
        C1274690jH9.LJFF(new ARunnableS20S1200000_16(list, this, str, 16));
    }

    public final boolean LJJIIJ(C1274860jHQ c1274860jHQ, String str) {
        if (LLIIL()) {
            return true;
        }
        synchronized (this.LJJIFFI) {
            try {
                Map<String, C1274860jHQ> map = this.LJJIFFI;
                if (map != null && str != null && c1274860jHQ != null && !((ConcurrentHashMap) map).containsKey(str)) {
                    ((ConcurrentHashMap) this.LJJIFFI).put(str, c1274860jHQ);
                    boolean z = this.LJJIIZ;
                    c1274860jHQ.LJI = z;
                    C1274460jGm c1274460jGm = c1274860jHQ.LJIIIIZZ;
                    if (c1274460jGm != null) {
                        c1274460jGm.LJIIZILJ(z);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUserJoined mVideoSinkMap.put size =");
                    sbLIZ.append(((ConcurrentHashMap) this.LJJIFFI).size());
                    AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIIJZLJL(String str, LyraxVideoRendererWrapper lyraxVideoRendererWrapper) {
        if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) this.LJJJJZI).put(str, lyraxVideoRendererWrapper);
            lyraxVideoRendererWrapper.LJJIJIIJIL = Boolean.TRUE.equals(((ConcurrentHashMap) this.LJJJLIIL).get(str));
            lyraxVideoRendererWrapper.LJJIJIIJI = this.LJJIIZ;
            lyraxVideoRendererWrapper.LJIIJJI();
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJJIJIL(String str, SurfaceView surfaceView) {
        int i;
        C1274940jHY c1274940jHY = this.LJJIIJZLJL;
        c1274940jHY.getClass();
        if (!TextUtils.isEmpty(str)) {
            i = 0;
        } else {
            i = -1;
        }
        C1275150jHt c1275150jHtLIZIZ = c1274940jHY.LIZIZ(str);
        if (c1275150jHtLIZIZ == null) {
            i = -2;
        }
        if (i != 0) {
            C1274830jHN c1274830jHN = c1274940jHY.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mInteractId:");
            sbLIZ.append(c1274940jHY.LIZIZ);
            sbLIZ.append(" ,streamId:");
            sbLIZ.append(str);
            sbLIZ.append(",view:");
            sbLIZ.append(surfaceView);
            sbLIZ.append(" ,result:");
            sbLIZ.append(i);
            c1274830jHN.LJIIIIZZ("setAuxStreamView", C2188811AlT.LIZIZ(sbLIZ));
            return i;
        }
        C786410Ut5.LJJZZIII(c1275150jHtLIZIZ.LJIILLIIL, new ARunnableS89S0200000_20(c1275150jHtLIZIZ, surfaceView, 187));
        C1274830jHN c1274830jHN2 = c1274940jHY.LJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("mInteractId:");
        sbLIZ2.append(c1274940jHY.LIZIZ);
        sbLIZ2.append(" ,streamId:");
        sbLIZ2.append(str);
        sbLIZ2.append(",view:");
        sbLIZ2.append(surfaceView);
        sbLIZ2.append(" ,result:");
        sbLIZ2.append(i);
        c1274830jHN2.LJIIIIZZ("setAuxStreamView", C2188811AlT.LIZIZ(sbLIZ2));
        return i;
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJJIL(String str, C01IL c01il) {
        int i;
        C1275340jIC c1275340jIC;
        C1274940jHY c1274940jHY = this.LJJIIJZLJL;
        c1274940jHY.getClass();
        if (!TextUtils.isEmpty(str)) {
            i = 0;
        } else {
            i = -1;
        }
        C1275150jHt c1275150jHtLIZIZ = c1274940jHY.LIZIZ(str);
        if (c1275150jHtLIZIZ == null) {
            i = -2;
        }
        if (i != 0) {
            C1274830jHN c1274830jHN = c1274940jHY.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mInteractId:");
            sbLIZ.append(c1274940jHY.LIZIZ);
            sbLIZ.append(" ,streamId:");
            sbLIZ.append(str);
            sbLIZ.append(" ,result:");
            sbLIZ.append(i);
            c1274830jHN.LJIIIIZZ("updateAuxStreamEncodeConfig", C2188811AlT.LIZIZ(sbLIZ));
            return i;
        }
        C786410Ut5.LJJZZIII(c1275150jHtLIZIZ.LJIILLIIL, new ARunnableS89S0200000_20(c1275150jHtLIZIZ, c01il, 186));
        InterfaceC1275920jJ8 interfaceC1275920jJ8 = c1274940jHY.LIZLLL;
        int i2 = c01il.LIZ;
        int i3 = c01il.LIZIZ;
        int i4 = c01il.LIZJ;
        int i5 = c01il.LIZLLL;
        C1275550jIX c1275550jIX = ((C1274990jHd) interfaceC1275920jJ8).LIZIZ;
        if (c1275550jIX != null && (c1275340jIC = (C1275340jIC) ((ConcurrentHashMap) c1275550jIX.LIZ).get(str)) != null) {
            c1275340jIC.LJI = i2;
            c1275340jIC.LJII = i3;
            c1275340jIC.LJIIIIZZ = i4;
            c1275340jIC.LJIIIZ = i5;
        }
        C1274830jHN c1274830jHN2 = c1274940jHY.LJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("mInteractId:");
        sbLIZ2.append(c1274940jHY.LIZIZ);
        sbLIZ2.append(" ,streamId:");
        sbLIZ2.append(str);
        sbLIZ2.append(" ,result:");
        sbLIZ2.append(i);
        c1274830jHN2.LJIIIIZZ("updateAuxStreamEncodeConfig", C2188811AlT.LIZIZ(sbLIZ2));
        return 0;
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJJ(String str, JSONObject jSONObject) {
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(this);
        sbLIZ.append(", channelId:");
        sbLIZ.append(str);
        sbLIZ.append(", channelBaseConfig:");
        sbLIZ.append(jSONObject);
        sbLIZ.append(", allowUpdateChannelBaseConfiguration:true");
        c1274830jHN.LJIIIIZZ("updateChannelBaseConfiguration", C2188811AlT.LIZIZ(sbLIZ));
        if (jSONObject == null) {
            return;
        }
        C1274690jH9.LJFF(new ARunnableS89S0200000_20(this, jSONObject, 168));
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJJIZL(EnumC1277210jLD enumC1277210jLD, C1273200jEk c1273200jEk) {
        boolean z;
        if (enumC1277210jLD == EnumC1277210jLD.SINGLE_VIEW) {
            z = true;
        } else {
            z = false;
        }
        if (c1273200jEk != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setInteractViewModeWithEffectMix viewMode:");
            sbLIZ.append(enumC1277210jLD.toString());
            sbLIZ.append(" EffectMixParams:");
            sbLIZ.append(c1273200jEk.toString());
            AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setInteractViewModeWithEffectMix viewMode:");
            sbLIZ2.append(enumC1277210jLD.toString());
            AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ2), null);
        }
        C1273190jEj c1273190jEj = this.LJLLILLLL;
        if (c1273190jEj == null) {
            AVLog.logKibana(4, "ClientImpl", "setInteractViewModeWithEffectMix return because mInteractMixManager null", null);
            return;
        }
        Handler handler = c1273190jEj.LLILLL.LIZIZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS21S0210000_20(c1273200jEk, c1273190jEj, z, 9));
        }
        LLIIIL(enumC1277210jLD);
        if (enumC1277210jLD == EnumC1277210jLD.MULTI_VIEW) {
            LLIIIILZ();
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJJL(JSONObject jSONObject, EnumC1275330jIB enumC1275330jIB) {
        if (jSONObject != null && enumC1275330jIB.ordinal() != 0) {
            if (this.LJIILJJIL.LIZ != null && C786410Ut5.u3() != this.LJIILJJIL.LIZ.getLooper().getThread()) {
                C786410Ut5.LJJZZIII(this.LJIILJJIL.LIZ, new ARunnableS49S0300000_16(jSONObject, enumC1275330jIB, this, 14));
                return;
            }
            if (this.LJIILJJIL.LJJIFFI == EnumC1275210jHz.SERVER_MIX) {
                try {
                    if (this.LJJJJ == null) {
                        this.LJJJJ = jSONObject;
                    }
                    this.LJJJJ.put("dynamicLabel", "TTLive");
                    this.LJJJJ.put("frameType", enumC1275330jIB.ordinal());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (this.LJIILLIIL.LJ) {
                    LLIIJI(false, false);
                }
            }
            this.LJIILLIIL.LIZJ = this.LJJJJ;
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJJJJZI(String str, boolean z) {
        int iUnsubscribeStream = -1;
        if (!TextUtils.isEmpty(str) && str.length() >= 3) {
            if (this.LJI != null) {
                String strSubstring = str.substring(0, str.length() - 2);
                int numericValue = Character.getNumericValue(str.charAt(str.length() - 1));
                if (numericValue >= StreamIndex.STREAM_INDEX_2ND.value() && numericValue < StreamIndex.STREAM_INDEX_MAX.value()) {
                    iUnsubscribeStream = z ? this.LJI.unsubscribeStream(strSubstring, StreamIndex.fromId(numericValue), MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO) : this.LJI.subscribeStream(strSubstring, StreamIndex.fromId(numericValue), MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
                }
            }
            C1274830jHN c1274830jHN = this.LJIIIIZZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("streamId:");
            sbLIZ.append(str);
            sbLIZ.append(" mute:");
            sbLIZ.append(z);
            sbLIZ.append(" ret:");
            sbLIZ.append(iUnsubscribeStream);
            c1274830jHN.LJIJ("muteAuxStreamAudioWithSteamId", "", C2188811AlT.LIZIZ(sbLIZ));
            return iUnsubscribeStream;
        }
        if (!C1267520j5a.LIZ()) {
            C1274830jHN c1274830jHN2 = this.LJIIIIZZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" streamId:");
            sbLIZ2.append(str);
            sbLIZ2.append(" ret:");
            sbLIZ2.append(-1);
            c1274830jHN2.LJIJ("muteAuxStreamAudioWithSteamId error!!", "", C2188811AlT.LIZIZ(sbLIZ2));
            return -1;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("muteAuxStreamAudioWithSteamId error!! streamId:");
        sbLIZ3.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIIIJ(float f, String str) {
        InterfaceC1274490jGp interfaceC1274490jGp;
        LyraxVideoRendererWrapper lyraxVideoRendererWrapperLLII;
        InterfaceC1275190jHx interfaceC1275190jHx;
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZJ.LIZ();
        if (abstractC1273900jFsLIZ != null) {
            C1269340j8W c1269340j8WLLD = abstractC1273900jFsLIZ.LLD();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setAuxStreamCornerRadius streamId:");
            sbLIZ.append(str);
            sbLIZ.append(" radius:");
            sbLIZ.append(f);
            sbLIZ.append(" enableRoundedCorner:");
            sbLIZ.append(c1269340j8WLLD.LIZ.LJIILLIIL());
            AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
            if (!c1269340j8WLLD.LIZ.LJIILLIIL() || str == null) {
                return;
            }
            C1275150jHt c1275150jHtLIZIZ = this.LJJIIJZLJL.LIZIZ(str);
            if (c1275150jHtLIZIZ != null) {
                c1275150jHtLIZIZ.LJIJI = f;
                C1272880jEE c1272880jEE = c1275150jHtLIZIZ.LIZ;
                if (c1272880jEE != null) {
                    c1272880jEE.setCornerRadius(f);
                }
            }
            if (LLIIL()) {
                if (!TextUtils.isEmpty(str) && (lyraxVideoRendererWrapperLLII = LLII(LJJI(str))) != null) {
                    lyraxVideoRendererWrapperLLII.LJIIIZ = f;
                    synchronized (lyraxVideoRendererWrapperLLII) {
                        interfaceC1275190jHx = lyraxVideoRendererWrapperLLII.LJIJ;
                    }
                    if (interfaceC1275190jHx != null) {
                        interfaceC1275190jHx.setCornerRadius(f);
                        return;
                    }
                    return;
                }
                return;
            }
            for (C1274860jHQ c1274860jHQ : ((ConcurrentHashMap) this.LJJII).values()) {
                if (c1274860jHQ.LJIIJJI.equals(str) && c1274860jHQ.LJIJ) {
                    c1274860jHQ.LJJIIJZLJL = f;
                    C1274460jGm c1274460jGm = c1274860jHQ.LJIIIIZZ;
                    if (c1274460jGm != null && (interfaceC1274490jGp = c1274460jGm.LLIZLLLIL) != null && interfaceC1274490jGp.LJLLLLLL()) {
                        interfaceC1274490jGp.setCornerRadius(f);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLJLI(float f, String str) {
        InterfaceC1274490jGp interfaceC1274490jGp;
        LyraxVideoRendererWrapper lyraxVideoRendererWrapperLLII;
        InterfaceC1275190jHx interfaceC1275190jHx;
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZJ.LIZ();
        if (abstractC1273900jFsLIZ != null) {
            C1269340j8W c1269340j8WLLD = abstractC1273900jFsLIZ.LLD();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setConorRadius linkMicId:");
            sbLIZ.append(str);
            sbLIZ.append(" radius:");
            sbLIZ.append(f);
            sbLIZ.append(" enableRoundedCorner:");
            sbLIZ.append(c1269340j8WLLD.LIZ.LJIILLIIL());
            AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
            if (!c1269340j8WLLD.LIZ.LJIILLIIL() || str == null) {
                return;
            }
            if (this.LJJJLZIJ.equals(str)) {
                abstractC1273900jFsLIZ.LLLIIII(f);
                return;
            }
            if (LLIIL()) {
                if (TextUtils.isEmpty(str) || (lyraxVideoRendererWrapperLLII = LLII(new StreamKey(this.LJJLIIIJJI, str, StreamIndex.STREAM_INDEX_MAIN))) == null) {
                    return;
                }
                lyraxVideoRendererWrapperLLII.LJIIIZ = f;
                synchronized (lyraxVideoRendererWrapperLLII) {
                    interfaceC1275190jHx = lyraxVideoRendererWrapperLLII.LJIJ;
                }
                if (interfaceC1275190jHx == null) {
                    return;
                }
                interfaceC1275190jHx.setCornerRadius(f);
                return;
            }
            for (C1274860jHQ c1274860jHQ : ((ConcurrentHashMap) this.LJJIFFI).values()) {
                if (c1274860jHQ.LJIIJ.equals(str) && !c1274860jHQ.LJIJ) {
                    c1274860jHQ.LJJIIJZLJL = f;
                    C1274460jGm c1274460jGm = c1274860jHQ.LJIIIIZZ;
                    if (c1274460jGm != null && (interfaceC1274490jGp = c1274460jGm.LLIZLLLIL) != null && interfaceC1274490jGp.LJLLLLLL()) {
                        interfaceC1274490jGp.setCornerRadius(f);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLL(long j, String str) {
        AbstractC1273900jFs abstractC1273900jFsLIZ;
        C1273190jEj c1273190jEj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startMediaPlayer streamId:");
        sbLIZ.append(str);
        sbLIZ.append(" offset:");
        sbLIZ.append(j);
        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        if (str != null && str.endsWith("_game") && (abstractC1273900jFsLIZ = this.LIZJ.LIZ()) != null && (c1273190jEj = this.LJLLILLLL) != null) {
            c1273190jEj.LJIILIIL(abstractC1273900jFsLIZ.LLF());
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJZZI(float f, boolean z) {
        C1274110jGD c1274110jGD = this.LJJZZIII;
        if (c1274110jGD != null && c1274110jGD.LJIILL()) {
            this.LJJZZIII.LIZ(f, z);
            return;
        }
        C1274890jHT c1274890jHT = this.LJI;
        if (c1274890jHT == null) {
            return;
        }
        c1274890jHT.LJJI = z;
        c1274890jHT.LJJIFFI = f;
        c1274890jHT.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[Catch: all -> 0x010c, TryCatch #1 {all -> 0x010c, blocks: (B:8:0x0014, B:10:0x0018, B:12:0x0036, B:14:0x0038, B:16:0x003e, B:20:0x0096, B:22:0x00a3, B:23:0x00a9, B:26:0x00af, B:28:0x00b7, B:30:0x00c4, B:31:0x00c7, B:33:0x00ea, B:34:0x00ed, B:36:0x00f1, B:38:0x00f7, B:41:0x0103, B:18:0x0091, B:42:0x010a), top: B:50:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea A[Catch: all -> 0x010c, TryCatch #1 {all -> 0x010c, blocks: (B:8:0x0014, B:10:0x0018, B:12:0x0036, B:14:0x0038, B:16:0x003e, B:20:0x0096, B:22:0x00a3, B:23:0x00a9, B:26:0x00af, B:28:0x00b7, B:30:0x00c4, B:31:0x00c7, B:33:0x00ea, B:34:0x00ed, B:36:0x00f1, B:38:0x00f7, B:41:0x0103, B:18:0x0091, B:42:0x010a), top: B:50:0x0014, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZZIII(java.lang.String r10, com.ss.bytertc.engine.data.StreamIndex r11) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274810jHL.LJJZZIII(java.lang.String, com.ss.bytertc.engine.data.StreamIndex):void");
    }

    public final InterfaceC1275190jHx LJLI(String str, boolean z) {
        boolean z2;
        C1274560jGw c1274560jGw = null;
        c1269300j8S = null;
        C1269300j8S c1269300j8S = null;
        c1274560jGw = null;
        if (z) {
            if (this.LJLLILLLL != null && str != null) {
                AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZJ.LIZ();
                if (abstractC1273900jFsLIZ != null && abstractC1273900jFsLIZ.LJJIIJZLJL() != null) {
                    c1269300j8S = (C1269300j8S) abstractC1273900jFsLIZ.LJJIIJZLJL().LIZJ.getService(C1269300j8S.class);
                }
                C1269300j8S c1269300j8S2 = c1269300j8S;
                Handler handlerLJLJJL = LJLJJL();
                this.LJIJJLI.getClass();
                if (handlerLJLJJL == null) {
                    handlerLJLJJL = GLThreadManager.getMainGlHandle();
                }
                C1273190jEj c1273190jEj = this.LJLLILLLL;
                this.LJIJJLI.getClass();
                this.LJIJJLI.getClass();
                this.LJIJJLI.getClass();
                if (abstractC1273900jFsLIZ != null && abstractC1273900jFsLIZ.LLJ()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LJIJJLI.getClass();
                c1274560jGw = new C1274560jGw(handlerLJLJJL, c1273190jEj, str, z2, GlUtil.isGLES3Support(), this.LJIJJLI.LJFF(), c1269300j8S2);
            }
            return c1274560jGw;
        }
        if (str == null) {
            return null;
        }
        AbstractC1273900jFs abstractC1273900jFsLIZ2 = this.LIZJ.LIZ();
        Handler handlerLJLJJL2 = LJLJJL();
        this.LJIJJLI.getClass();
        Handler handlerLJLJJL3 = LJLJJL();
        this.LJIJJLI.getClass();
        if (handlerLJLJJL3 == null) {
            handlerLJLJJL3 = GLThreadManager.getMainGlHandle();
        }
        this.LJIJJLI.getClass();
        this.LJIJJLI.getClass();
        this.LJIJJLI.getClass();
        this.LJIJJLI.getClass();
        this.LJIJJLI.getClass();
        this.LJIJJLI.getClass();
        this.LJIJJLI.getClass();
        this.LJIJJLI.getClass();
        this.LJIJJLI.getClass();
        this.LJIJJLI.getClass();
        return new C1274570jGx(abstractC1273900jFsLIZ2, handlerLJLJJL2, handlerLJLJJL3, true, true, 640, 360, GlUtil.isGLES3Support());
    }

    public final void LJLIL(String str, boolean z) {
        C1274830jHN c1274830jHN = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enable state: ");
        sbLIZ.append(z);
        c1274830jHN.LJIJ("enableLocalAudio", C2188811AlT.LIZIZ(sbLIZ), str);
        if (z) {
            this.LJI.startAudioCapture();
        } else {
            this.LJI.stopAudioCapture();
        }
    }

    public final void LLF(String str, boolean z) {
        AVLog.debugTrace(str, Boolean.valueOf(z));
        synchronized (this.LJJIJIL) {
            try {
                Iterator it2 = ((ArrayList) this.LJJIJIL).iterator();
                while (it2.hasNext()) {
                    if (((String) it2.next()).equals(str)) {
                        it2.remove();
                    }
                }
                if (z) {
                    ((ArrayList) this.LJJIJIL).add(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LLIIJI(boolean z, boolean z2) {
        return LLIIIZ(null, z, z2, false, null);
    }

    @Override // X.InterfaceC1276380jJs
    public final void muteRemoteAudioStream(String str, boolean z) {
        C1274690jH9.LJFF(new ARunnableS5S1110000_20(this, str, z, 8));
    }

    @Override // X.InterfaceC1276380jJs
    public final long sendUserMessage(String str, String str2) {
        C1274690jH9.LJFF(new ARunnableS10S2100000_20(this, str, str2, 9));
        return 0L;
    }

    @Override // X.InterfaceC1276380jJs
    public final void setRemoteAudioPlaybackVolume(String str, int i) {
        C1274690jH9.LJFF(new ARunnableS4S1101000_20(i, str, this, 8));
    }

    @Override // X.InterfaceC1268200j6g
    public final void LJ(int i, int i2, int i3) {
        C1275050jHj c1275050jHj = this.LJLLLLLL;
        if (c1275050jHj != null && c1275050jHj.LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateEncodePerformanceConfig: width:");
            sbLIZ.append(i);
            sbLIZ.append(" height:");
            sbLIZ.append(i2);
            sbLIZ.append(" fps:");
            sbLIZ.append(i3);
            AVLog.logKibana(4, "LinkMicEncodeParamsManager", C2188811AlT.LIZIZ(sbLIZ), null);
            c1275050jHj.LIZ.setVideoPerformanceConfig(StreamIndex.STREAM_INDEX_MAIN, i, i2, i3);
        }
    }

    public final void LJIJJLI(StreamIndex streamIndex, String str, boolean z) {
        C1274940jHY c1274940jHY = this.LJJIIJZLJL;
        int iValue = streamIndex.value();
        c1274940jHY.getClass();
        String strLJ = C1274940jHY.LJ(iValue, str);
        if (!this.LJJIIJ.containsKey(strLJ)) {
            this.LJJIIJ.put(strLJ, new C1275750jIr(streamIndex.value(), str, strLJ, z));
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJJJLL(String str, boolean z, boolean z2) {
        int iSubscribeStream = -1;
        if (!TextUtils.isEmpty(str) && str.length() >= 3) {
            if (!z && !z2) {
                return -1;
            }
            MediaStreamType mediaStreamType = MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH;
            if (z) {
                if (!z2) {
                    mediaStreamType = MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO;
                }
            } else if (z2) {
                mediaStreamType = MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO;
            }
            if (this.LJI != null) {
                String strSubstring = str.substring(0, str.length() - 2);
                int numericValue = Character.getNumericValue(str.charAt(str.length() - 1));
                if (numericValue >= StreamIndex.STREAM_INDEX_2ND.value() && numericValue < StreamIndex.STREAM_INDEX_MAX.value()) {
                    iSubscribeStream = this.LJI.subscribeStream(strSubstring, StreamIndex.fromId(numericValue), mediaStreamType);
                }
            }
            C1274830jHN c1274830jHN = this.LJIIIIZZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("streamId:");
            sbLIZ.append(str);
            sbLIZ.append(" ret:");
            sbLIZ.append(iSubscribeStream);
            c1274830jHN.LJIJ("subscribeAuxStreamWithStreamId", "", C2188811AlT.LIZIZ(sbLIZ));
            return iSubscribeStream;
        }
        if (!C1267520j5a.LIZ()) {
            C1274830jHN c1274830jHN2 = this.LJIIIIZZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" streamId:");
            sbLIZ2.append(str);
            sbLIZ2.append(" ret:");
            sbLIZ2.append(-1);
            c1274830jHN2.LJIJ("subscribeAuxStreamWithStreamId error!!", "", C2188811AlT.LIZIZ(sbLIZ2));
            return -1;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("subscribeAuxStreamWithStreamId error!! streamId:");
        sbLIZ3.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LLIIII(int i, int i2, String str) {
        StreamKey streamKey = new StreamKey(this.LJJLIIIJJI, str, StreamIndex.STREAM_INDEX_MAIN);
        if (LLIIL() || this.LJJ != null) {
            if (!LLIIL() && LJLJLJ(streamKey) == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Consume user ");
                sbLIZ.append(str);
                sbLIZ.append("'s buffer frame before he joins room.");
                AVLog.ioe("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            View viewLJLLLLLL = LJLLLLLL(str);
            if (!this.LJJJJLL) {
                this.LJZL.LIZ(this, 17, 0L, 0L, str, viewLJLLLLLL, Integer.valueOf(this.LIZLLL.LJIILL(str)), Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                this.LJZL.LIZ(this, 17, 1L, 0L, str, LJLLLL(str), Integer.valueOf(this.LIZLLL.LJIILL(str)), Integer.valueOf(i), Integer.valueOf(i2));
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", "rtc_first_remote_video_real_render_msg_sent");
                jSONObject.put("rtc_channel_id", this.LJII.LIZLLL);
                jSONObject.put("timestamp", System.currentTimeMillis());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1274690jH9.LJ(new ARunnableS120S0100000_20(jSONObject, 283));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean LLIIIZ(String str, boolean z, boolean z2, boolean z3, List list) {
        int i;
        int i2;
        boolean z4;
        int i3;
        int i4;
        String strMixStream = str;
        List listLJIILL = list;
        EnumC1275390jIH enumC1275390jIH = this.LJIILL;
        AVLog.debugTrace(new Object[0]);
        C1275030jHh c1275030jHh = this.LJIILJJIL;
        EnumC1274430jGj enumC1274430jGj = c1275030jHh.LJIIL;
        EnumC1274430jGj enumC1274430jGj2 = EnumC1274430jGj.ANCHOR;
        if (enumC1274430jGj == enumC1274430jGj2) {
            EnumC1275210jHz enumC1275210jHz = c1275030jHh.LJJIFFI;
            EnumC1275210jHz enumC1275210jHz2 = EnumC1275210jHz.NONE;
            if (enumC1275210jHz != enumC1275210jHz2 && c1275030jHh.LJJIJLIJ != null) {
                if (listLJIILL == null) {
                    listLJIILL = LJIILL();
                }
                if (C1267520j5a.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateMixStream func call:");
                    sbLIZ.append(listLJIILL.size());
                    AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
                }
                HashMap map = new HashMap(this.LJJLIIIJ);
                C1276550jK9 c1276550jK9 = this.LJIILLIIL;
                c1276550jK9.getClass();
                AVLog.debugTrace(new Object[0]);
                C1275030jHh c1275030jHh2 = c1276550jK9.LIZ;
                InterfaceC1276590jKD interfaceC1276590jKD = c1275030jHh2.LJJIJLIJ;
                if (c1275030jHh2.LJIIL == enumC1274430jGj2 && c1275030jHh2.LJJIFFI != enumC1275210jHz2 && interfaceC1276590jKD != 0) {
                    C1275970jJD c1275970jJD = c1276550jK9.LJIIIZ;
                    if (c1275970jJD != null && c1275970jJD.LIZ) {
                        C1274930jHX c1274930jHXLIZ = c1275030jHh2.LIZ();
                        if (c1276550jK9.LIZ.LJJJJJ) {
                            synchronized (c1274930jHXLIZ) {
                                try {
                                    i = c1274930jHXLIZ.LIZ;
                                    i2 = c1274930jHXLIZ.LIZIZ;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        } else {
                            i = c1274930jHXLIZ.LIZ;
                            i2 = c1274930jHXLIZ.LIZIZ;
                        }
                        VideoEncoderConfig videoEncoderConfig = c1276550jK9.LJIILLIIL;
                        if (videoEncoderConfig != null && (i3 = videoEncoderConfig.width) > 0 && (i4 = videoEncoderConfig.height) > 0) {
                            i2 = i4;
                            i = i3;
                        }
                        if (!TextUtils.isEmpty(strMixStream)) {
                            z4 = true;
                        } else {
                            strMixStream = interfaceC1276590jKD.mixStream(i, i2, listLJIILL);
                            z4 = false;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateMixStream mixStream result: sei");
                        sbLIZ2.append(strMixStream);
                        sbLIZ2.append(", region:");
                        sbLIZ2.append(C1276550jK9.LJIIIIZZ(listLJIILL));
                        sbLIZ2.append(" useExternalSei:");
                        sbLIZ2.append(z4);
                        AVLog.iow("StreamMixManager", C2188811AlT.LIZIZ(sbLIZ2));
                        C1276000jJG c1276000jJG = new C1276000jJG(c1274930jHXLIZ.LIZJ, c1276550jK9.LIZIZ.LJLJJI.getValue(), c1274930jHXLIZ.LJFF, c1276550jK9.LJIIL());
                        if (!listLJIILL.isEmpty()) {
                            if (C1274690jH9.LIZJ() != null) {
                                C1274690jH9.LJFF(new ARunnableS0S1530000_20(c1276550jK9, listLJIILL, strMixStream, z, z2, z3, map, c1276000jJG, enumC1275390jIH, 0));
                                return true;
                            }
                            return true;
                        }
                    } else {
                        AVLog.logKibana(5, "StreamMixManager", "updateMixStream before startMixStream, return", null);
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0j9S, X.0jHJ] */
    public C1274810jHL(C1274890jHT c1274890jHT, C1275030jHh c1275030jHh, C1269340j8W c1269340j8W, C1272750jE1 c1272750jE1, C1271130jBP c1271130jBP, C1271090jBL c1271090jBL, C1274850jHP c1274850jHP) {
        Throwable th;
        boolean z;
        boolean z2;
        long j;
        TTLHVideoContentReportConfig tTLHVideoContentReportConfig;
        boolean z3;
        C1275090jHn c1275090jHn;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        C1269910j9R c1269910j9RLJIJJ;
        this.LJJLIIIJL = false;
        this.LJJLIIIJLJLI = false;
        this.LJJLIIIJLLLLLLLZ = 0;
        this.LJJLIL = null;
        this.LJLI = null;
        this.LJLIIIL = null;
        this.LJLIL = false;
        this.LJLILLLLZI = false;
        this.LJLJJI = false;
        C1275780jIu c1275780jIu = new C1275780jIu(this);
        ?? r10 = new InterfaceC1269920j9S() { // from class: X.0jHJ
            @Override // X.InterfaceC1269920j9S
            public final void LIZ(int i) {
                C1274810jHL c1274810jHL = this.LIZ;
                InterfaceC1274770jHH interfaceC1274770jHH = c1274810jHL.LJJIJLIJ;
                if (interfaceC1274770jHH != null) {
                    ((C1274760jHG) interfaceC1274770jHH).LIZIZ(c1274810jHL, 600, c1274810jHL.LJJJLZIJ, Integer.valueOf(i));
                }
                C1274810jHL c1274810jHL2 = this.LIZ;
                c1274810jHL2.LJZL.LIZ(c1274810jHL2, 600, 0L, 0L, c1274810jHL2.LJJJLZIJ, Integer.valueOf(i));
            }
        };
        this.LJLJJLL = r10;
        this.LJLJLJ = null;
        this.LJLJLLL = null;
        this.LJLLJ = true;
        this.LJLLLLLL = null;
        this.LJLZ = null;
        this.LJZ = 15;
        this.LJZI = false;
        C1274700jHA c1274700jHA = new C1274700jHA(this);
        this.LJZL = c1274700jHA;
        this.LL = "";
        this.LLD = new C1274820jHM(this);
        this.LLF = new C1274880jHS(this);
        this.LLFF = new C1274900jHU(this);
        AVLog.debugTrace(new Object[0]);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<init> ");
        sbLIZ.append(this);
        sbLIZ.append(" rtcExtInfo:");
        sbLIZ.append(c1275030jHh.LIZLLL);
        AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ClientImpl Init:");
        sbLIZ2.append(c1275030jHh.LIZLLL);
        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ2), null);
        C1274250jGR c1274250jGR = c1274850jHP.LIZIZ;
        this.LIZJ = c1274250jGR;
        C1266700j4G c1266700j4G = c1274250jGR.LJI;
        this.LJJJZ = c1266700j4G;
        if (c1266700j4G == null) {
            AVLog.logKibana(6, "ClientImpl", "ClientImpl Init: FeaturesManager is null from builder", null);
        }
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LIZLLL = c1274850jHP;
        this.LJIILJJIL = c1275030jHh;
        C1271250jBb c1271250jBb = C1271270jBd.LIZ;
        EnumC1274430jGj enumC1274430jGj = c1275030jHh.LJIIL;
        EnumC1274430jGj enumC1274430jGj2 = EnumC1274430jGj.ANCHOR;
        boolean z6 = enumC1274430jGj == enumC1274430jGj2;
        C1271260jBc c1271260jBc = c1271250jBb.LIZ;
        c1271260jBc.LJIJI = z6;
        c1271260jBc.LJIIIIZZ();
        this.LJJLIIIIJ = c1271090jBL;
        VPassInteractCfg vPassInteractCfg = c1274250jGR.LJFF;
        this.LJIJJLI = vPassInteractCfg;
        this.LJI = c1274890jHT;
        c1274890jHT.LJJ(c1275030jHh.LIZLLL, "external");
        AbstractC1273900jFs abstractC1273900jFsLIZ = c1274250jGR.LIZ();
        if (abstractC1273900jFsLIZ != null) {
            C1267500j5Y c1267500j5YLJJIIJZLJL = abstractC1273900jFsLIZ.LJJIIJZLJL();
            this.LJLIIL = c1267500j5YLJJIIJZLJL;
            if (c1267500j5YLJJIIJZLJL != null) {
                this.LJIIL = c1267500j5YLJJIIJZLJL.LIZ.ttlhABSettingsConfigs.LJ();
                C1266790j4P c1266790j4P = (C1266790j4P) c1267500j5YLJJIIJZLJL.LIZJ.getService(C1266790j4P.class);
                if (c1266790j4P != null) {
                    this.LJLLLL = c1266790j4P.LL;
                }
            }
        }
        C1275140jHs c1275140jHsLJIIL = c1274890jHT.LJIIL();
        this.LJII = c1275140jHsLJIIL;
        String str = c1275140jHsLJIIL.LJFF;
        this.LJJJLZIJ = str;
        C1274830jHN c1274830jHN = new C1274830jHN(c1275140jHsLJIIL, this.LJIILJJIL, c1274850jHP);
        this.LJIIIIZZ = c1274830jHN;
        c1274830jHN.LJJI = vPassInteractCfg;
        C1274990jHd c1274990jHd = new C1274990jHd(this.LJIILJJIL);
        this.LJIIIZ = c1274990jHd;
        C1274890jHT c1274890jHT2 = this.LJI;
        C1274880jHS c1274880jHS = this.LLF;
        c1274890jHT2.getClass();
        C1279520jOw c1279520jOw = new C1279520jOw(c1274880jHS, c1274890jHT2);
        c1274890jHT2.LJIIJJI = c1279520jOw;
        c1274890jHT2.LJIILL.setRtcVideoEventHandler(c1279520jOw);
        c1274890jHT.LJIJ = this;
        if (TextUtils.isEmpty(str)) {
            C1267520j5a.LIZIZ("ClientImpl init mInteractId empty!");
        }
        c1271250jBb.LIZ.LJII = vPassInteractCfg.LJI();
        C1275030jHh c1275030jHh2 = this.LJIILJJIL;
        vPassInteractCfg.LJI();
        c1275030jHh2.getClass();
        if (c1274890jHT.LJIILLIIL == null) {
            if (c1274890jHT.LJJIIZI()) {
                if (c1274890jHT.LJIILL != null) {
                    if (!c1274890jHT.LIZ() && c1274890jHT.LJJIIZ()) {
                        c1274890jHT.LJI();
                    } else {
                        c1274890jHT.LJIIJJI();
                    }
                }
            } else {
                c1274890jHT.LJI();
            }
        }
        if (c1274250jGR.LIZ() != null && c1274250jGR.LIZ().LLD() != null) {
            String strLJJIJL = c1274250jGR.LIZ().LLD().LIZ.mPushBase.LJJIJL();
            String strLJJIII = c1274250jGR.LIZ().LLD().LIZ.mPushBase.LJJIII();
            if (!TextUtils.isEmpty(strLJJIII) && !TextUtils.isEmpty(strLJJIJL)) {
                c1274890jHT.setPostProcessParameter(new PostProcessParameter(strLJJIII, strLJJIJL));
            }
        }
        this.LJJLIIIJ = new ConcurrentHashMap();
        C1276550jK9 c1276550jK9 = new C1276550jK9(this, c1275030jHh, c1269340j8W, this.LJIIIIZZ, c1274990jHd, vPassInteractCfg, this.LJII, c1274850jHP, c1274700jHA, c1274890jHT);
        this.LJIILLIIL = c1276550jK9;
        this.LJJ = c1271130jBP;
        LJLILLLLZI("client_init");
        final C1274820jHM c1274820jHM = this.LLD;
        c1274890jHT.setRTCRoomEventHandler(new IRTCRoomEventHandlerAdapter(c1274820jHM) { // from class: X.0jP0
            public final WeakReference<IRTCRoomEventHandler> LIZ;

            public final IRTCRoomEventHandler LIZ() {
                WeakReference<IRTCRoomEventHandler> weakReference = this.LIZ;
                if (weakReference == null) {
                    return null;
                }
                return weakReference.get();
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onTokenWillExpire() {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onTokenWillExpire();
                }
            }

            {
                this.LIZ = new WeakReference<>(c1274820jHM);
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onAVSyncStateChange(AVSyncState aVSyncState) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onAVSyncStateChange(aVSyncState);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onFeatureEvent(lyraxTranscoderFeatureEvent);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onForwardStreamEvent(forwardStreamEventInfoArr);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onForwardStreamStateChanged(forwardStreamStateInfoArr);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onLeaveRoom(RTCRoomStats rTCRoomStats) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onLeaveRoom(rTCRoomStats);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onLocalStreamStats(LocalStreamStats localStreamStats) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onLocalStreamStats(localStreamStats);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onRemoteStreamStats(remoteStreamStats);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onRoomError(int i) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onRoomError(i);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onRoomStats(RTCRoomStats rTCRoomStats) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onRoomStats(rTCRoomStats);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onRoomWarning(int i) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onRoomWarning(i);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onStreamAdd(RTCStream rTCStream) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onStreamAdd(rTCStream);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onAudioStreamBanned(String str2, boolean z7) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onAudioStreamBanned(str2, z7);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onNetworkQuality(networkQualityStats, networkQualityStatsArr);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onRoomBinaryMessageReceived(String str2, ByteBuffer byteBuffer) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onRoomBinaryMessageReceived(str2, byteBuffer);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onRoomMessageReceived(String str2, String str3) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onRoomMessageReceived(str2, str3);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onRoomMessageSendResult(long j2, int i) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onRoomMessageSendResult(j2, i);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onStreamPublishSuccess(String str2, boolean z7) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onStreamPublishSuccess(str2, z7);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onStreamRemove(rTCStream, streamRemoveReason);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onUserBinaryMessageReceived(String str2, ByteBuffer byteBuffer) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onUserBinaryMessageReceived(str2, byteBuffer);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onUserJoined(UserInfo userInfo, int i) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onUserJoined(userInfo, i);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onUserLeave(String str2, int i) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onUserLeave(str2, i);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onUserMessageReceived(String str2, String str3) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onUserMessageReceived(str2, str3);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onUserMessageSendResult(long j2, int i) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onUserMessageSendResult(j2, i);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onUserPublishScreen(String str2, MediaStreamType mediaStreamType) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onUserPublishScreen(str2, mediaStreamType);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onUserPublishStream(String str2, MediaStreamType mediaStreamType) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onUserPublishStream(str2, mediaStreamType);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onVideoStreamBanned(String str2, boolean z7) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onVideoStreamBanned(str2, z7);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onStreamSubscribed(int i, String str2, SubscribeConfig subscribeConfig) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onStreamSubscribed(i, str2, subscribeConfig);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onUserPublishStream(StreamKey streamKey, boolean z7, MediaStreamType mediaStreamType) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onUserPublishStream(streamKey, z7, mediaStreamType);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onUserUnpublishScreen(String str2, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onUserUnpublishScreen(str2, mediaStreamType, streamRemoveReason);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onUserUnpublishStream(StreamKey streamKey, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onUserUnpublishStream(streamKey, mediaStreamType, streamRemoveReason);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onUserUnpublishStream(String str2, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onUserUnpublishStream(str2, mediaStreamType, streamRemoveReason);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onRoomStateChanged(String str2, String str3, int i, String str4) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onRoomStateChanged(str2, str3, i, str4);
                }
            }

            @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
            public final void onStreamStateChanged(String str2, String str3, int i, String str4) {
                IRTCRoomEventHandler iRTCRoomEventHandlerLIZ = LIZ();
                if (iRTCRoomEventHandlerLIZ != null) {
                    iRTCRoomEventHandlerLIZ.onStreamStateChanged(str2, str3, i, str4);
                }
            }
        });
        c1274890jHT.setDefaultRemoteVideoConfig(new RemoteVideoConfig(16, 16, 15));
        this.LJIL = c1272750jE1;
        this.LJJJJLL = this.LJIILJJIL.LJJIIJ;
        this.LJJJI = new C1274780jHI();
        String str2 = this.LJII.LIZLLL;
        this.LJJLIIIJJI = str2;
        if (abstractC1273900jFsLIZ != null) {
            C1269340j8W c1269340j8WLLD = abstractC1273900jFsLIZ.LLD();
            this.LJIIIIZZ.LJJIII = abstractC1273900jFsLIZ;
            C1271430jBt c1271430jBt = (C1271430jBt) abstractC1273900jFsLIZ.LJJIIJZLJL().LIZJ.getService(C1271430jBt.class);
            c1276550jK9.LJJ = c1271430jBt;
            C1275970jJD c1275970jJD = c1276550jK9.LJIIIZ;
            if (c1275970jJD != null) {
                c1275970jJD.LIZJ = c1271430jBt;
            }
            if (c1269340j8WLLD != null) {
                this.LJIIIIZZ.LJJ = c1269340j8WLLD;
                this.LJJLIIIJL = c1269340j8WLLD.LJJIJL;
                this.LJJLIIIJLJLI = c1269340j8WLLD.LJLJI.LIZLLL;
                if (c1269340j8WLLD.LIZ == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(1);
                    arrayList.add("push-rtmp-f5");
                }
                this.LJJLIL = arrayList;
                this.LJJLIIIJLLLLLLLZ = c1269340j8WLLD.LJJJI;
                if (C1267520j5a.LIZ() && c1269340j8WLLD.LIZ.ttlhABSettingsConfigs.LJIIJ()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.LJLJJI = z4;
                if (!c1274890jHT.LJJIIZ() && !c1274890jHT.LJIILL()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                this.LJLLJ = z5;
                if (c1269340j8WLLD.LIZ.mPushBase.LJIILLIIL() && (c1269910j9RLJIJJ = c1269340j8WLLD.LJIJJ()) != 0) {
                    c1269910j9RLJIJJ.LIZ(r10);
                }
            }
            this.LJLJL = abstractC1273900jFsLIZ.LJIIL();
            this.LJLJLJ = abstractC1273900jFsLIZ.LJLLILLLL();
            this.LJLJLLL = abstractC1273900jFsLIZ.LLIIIILZ();
            InterfaceC1272820jE8 interfaceC1272820jE8LLIIIL = abstractC1273900jFsLIZ.LLIIIL();
            if (interfaceC1272820jE8LLIIIL != null) {
                this.LJLLI = (C1269940j9U) interfaceC1272820jE8LLIIIL.getService(C1269940j9U.class);
                this.LJLLL = (C1269850j9L) interfaceC1272820jE8LLIIIL.getService(C1269850j9L.class);
            }
            C1267500j5Y c1267500j5YLJJIIJZLJL2 = abstractC1273900jFsLIZ.LJJIIJZLJL();
            this.LJLIIL = c1267500j5YLJJIIJZLJL2;
            if (c1267500j5YLJJIIJZLJL2.LIZ.LJI) {
                C1273240jEo c1273240jEo = new C1273240jEo();
                C1274690jH9.LIZJ();
                c1273240jEo.LIZ = str;
                c1273240jEo.LIZJ = c1267500j5YLJJIIJZLJL2;
                c1273240jEo.LIZLLL = abstractC1273900jFsLIZ;
                c1273240jEo.LJ = new InterfaceC1273260jEq() { // from class: X.0jHE
                    @Override // X.InterfaceC1273260jEq
                    public final void onError(int i) {
                        C1274810jHL c1274810jHL = this.LIZ;
                        InterfaceC1274710jHB interfaceC1274710jHB = c1274810jHL.LJJLI;
                        if (interfaceC1274710jHB != null) {
                            interfaceC1274710jHB.LIZIZ(c1274810jHL, 36, i, 0, null);
                        }
                    }

                    @Override // X.InterfaceC1273260jEq
                    public final void LIZ(int i, Object... objArr) {
                        C1274810jHL c1274810jHL = this.LIZ;
                        InterfaceC1274710jHB interfaceC1274710jHB = c1274810jHL.LJJLI;
                        if (interfaceC1274710jHB != null) {
                            long j2 = 0;
                            interfaceC1274710jHB.LIZ(c1274810jHL, i, j2, j2, objArr);
                        }
                    }
                };
                C1273190jEj c1273190jEj = new C1273190jEj(c1273240jEo);
                this.LJLLILLLL = c1273190jEj;
                abstractC1273900jFsLIZ.LLLILZ(c1273190jEj);
            }
        }
        TTLHVideoContentReportConfig tTLHVideoContentReportConfig2 = c1269340j8W.LIZ.mPushBase.LJIILLIIL;
        if (tTLHVideoContentReportConfig2 != null && tTLHVideoContentReportConfig2.enable && this.LJIILJJIL.LJIJJ == EnumC1276410jJv.CO_HOST && !LJZL() && (tTLHVideoContentReportConfig = this.LJJLJLI) != null) {
            if (tTLHVideoContentReportConfig.isVadEnable() != tTLHVideoContentReportConfig.isVadEnable()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tTLHVideoContentReportConfig.equals(this.LJJLJLI) && (c1275090jHn = this.LJJLL) != null) {
                c1275090jHn.LIZ();
                th = null;
            } else {
                this.LJJLJLI = tTLHVideoContentReportConfig;
                C1275090jHn c1275090jHn2 = this.LJJLL;
                if (c1275090jHn2 != null) {
                    c1275090jHn2.LIZIZ();
                }
                th = null;
                this.LJJLL = null;
                if (tTLHVideoContentReportConfig.enable) {
                    C1275090jHn c1275090jHn3 = new C1275090jHn(tTLHVideoContentReportConfig, c1275780jIu);
                    this.LJJLL = c1275090jHn3;
                    InterfaceC1268640j7O interfaceC1268640j7O = this.LJLJL;
                    if (interfaceC1268640j7O != null) {
                        interfaceC1268640j7O.LJIIL(c1275090jHn3);
                    }
                }
            }
            if (z3) {
                C1274690jH9.LJFF(new ARunnableS89S0200000_20(this, tTLHVideoContentReportConfig, 178));
            }
        } else {
            th = null;
        }
        this.LJJIIJZLJL = new C1274940jHY(str, c1274890jHT, c1274990jHd, this.LJIIIIZZ, vPassInteractCfg, c1274250jGR);
        if (abstractC1273900jFsLIZ != null) {
            abstractC1273900jFsLIZ.LLD();
        }
        this.LIZ = new C1274120jGE(c1274250jGR.LIZ(), this);
        if (LJZI()) {
            this.LJLI = new C1274330jGZ(this);
        } else {
            this.LJLIIIL = new C1274340jGa(this);
        }
        boolean z7 = c1269340j8W.LIZ.LJIIJ;
        this.LJLIL = z7;
        if (LJZL()) {
            c1269340j8W.LIZ.getClass();
            z = false;
        } else {
            z = true;
        }
        this.LJLILLLLZI = z;
        if (z7) {
            AVLog.w("ClientImpl", "[zgx]enableSeiSendInfo");
            z2 = false;
            c1274890jHT.enableSEISendE2EInfo(true, 0);
        } else {
            z2 = false;
        }
        if (abstractC1273900jFsLIZ != null) {
            if (abstractC1273900jFsLIZ.LLD().LIZJ()) {
                this.LJJZZIII = new C1274110jGD(this, c1274890jHT, this.LJIILJJIL.LJIIL == enumC1274430jGj2 ? true : z2);
            }
            PushBase.RoiMap roiMap = c1269340j8W.LIZ.mPushBase.LJIIL;
            if (roiMap != null) {
                if (roiMap.hardwareRoi == null) {
                    roiMap.hardwareRoi = new PushBase.HardwareRoi();
                }
                this.LJLJJL = roiMap.hardwareRoi;
            }
            if (this.LJLJL != null) {
                AVLog.logKibana(4, "ClientImpl", "setHardwareRoiSceneAvailable: true", th);
                this.LJLJL.LJLIIL(true);
            }
        }
        if (vPassInteractCfg.LIZJ()) {
            NetworkTimeInfo networkTimeInfo = c1274890jHT.getNetworkTimeInfo();
            if (networkTimeInfo != null) {
                j = networkTimeInfo.timestamp;
            } else {
                j = -1;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getNetworkTimeInfo ret:");
            sbLIZ3.append(j);
            AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ3));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rtcExtInfo", c1275030jHh.LIZLLL);
            jSONObject.put("rtcEngineWrapper", c1274890jHT);
            jSONObject.put("rtcEngineWrapper", c1274890jHT);
            jSONObject.put("mInteractId", str);
            jSONObject.put("mRoomId", str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.logApiCall("RTCInteractAPI", "ClientImpl construct", jSONObject);
        this.LJLLLLLL = new C1275050jHj(c1274890jHT, this);
        if (abstractC1273900jFsLIZ != null) {
            abstractC1273900jFsLIZ.LLLJL(this);
        }
    }
}
