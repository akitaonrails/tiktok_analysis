package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxPipelineEvent;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxRtcVideoEncoderConfig;
import com.ss.lyrax.video.LyraxRtcVideoPerformanceConfig;
import com.ss.lyrax.video.LyraxSimulcastUpdateLayoutConfigEvent;
import com.ss.lyrax.video.LyraxUpdateVideoParamsEvent;
import com.ss.lyrax.video.LyraxVideoContentType;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.lyrax.video.LyraxVideoPlatformCaptureConfig;
import com.ss.lyrax.video.LyraxVideoPlatformWrapperConfig;
import com.ss.lyrax.video.LyraxVideoSourceState;
import com.ss.lyrax.video.LyraxVideoSourceType;
import com.ss.lyrax.video.LyraxVideoSubSource;
import com.ss.lyrax.video.bridge.IVideoPublishCallback;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271980jCm extends AbsLyraxVideoPlatformWrapper implements InterfaceC1266410j3n, IVideoPublishCallback {
    public final C1271520jC2 LL;
    public final C1266350j3h LLILLJJLI;
    public final C1267500j5Y LLILLL;
    public final int LLILZ;
    public final List<C1269610j8x> LLILZIL = new LinkedList();
    public final Object LLILZLL = new Object();
    public final C1272030jCr LLIZ;
    public LyraxVideoSourceState LLIZLLLIL;
    public LyraxVideoContentType LLJ;
    public EnumC1267980j6K LLJI;
    public C1272100jCy LLJIJIL;
    public InterfaceC1269980j9Y LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public volatile InterfaceC1272020jCq LLJJIII;
    public volatile boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final void enablePushAliveCheck(boolean z) {
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final void setPushTimeoutThreshold(int i) {
    }

    @Override // X.InterfaceC1266410j3n
    public final JSONObject LJZI() {
        return this.LL.LJZI();
    }

    @Override // X.InterfaceC1266410j3n
    public final C1267750j5x LLILZIL() {
        return this.LL.LLJ;
    }

    public final void LLIZLLLIL() {
        int i = this.LLILZ;
        C1272100jCy c1272100jCy = i >= 3 ? null : this.LLJIJIL;
        if (i >= 3 && this.LLJIJIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stage policy detaches Java effect node from VideoNodeManager stage=");
            sbLIZ.append(this.LLILZ);
            AVLog.logKibana(4, "VideoPlatformWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        this.LL.LJL(c1272100jCy);
    }

    public final void LLJI() {
        synchronized (this.LLILZLL) {
            try {
                ((LinkedList) this.LLILZIL).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LLJILJILJ() {
        return this.LLILLL.LIZ.LJIJJ() >= 2;
    }

    public final boolean LLJILLL() {
        EnumC1267980j6K enumC1267980j6K = this.LLJI;
        return enumC1267980j6K == EnumC1267980j6K.NORMAL_LIVE || enumC1267980j6K == EnumC1267980j6K.GAME_LIVE;
    }

    @Override // X.InterfaceC1266410j3n
    public final JSONObject getStatus() {
        return this.LL.getStatus();
    }

    @Override // X.InterfaceC1266410j3n
    public final void start() {
        this.LL.start();
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final LyraxErrorCode startPlatformCapture() {
        this.LLIZLLLIL = LyraxVideoSourceState.STARTED;
        return LyraxErrorCode.SUCCESS;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final LyraxErrorCode stopPlatformCapture() {
        this.LLIZLLLIL = LyraxVideoSourceState.STOPPED;
        return LyraxErrorCode.SUCCESS;
    }

    public final void LLIZ() {
        InterfaceC1269980j9Y interfaceC1269980j9Y = LLJILJILJ() ? null : this.LLJILJIL;
        if (LLJILJILJ() && this.LLJILJIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stage policy detaches Java render node from VideoNodeManager stage=");
            sbLIZ.append(this.LLILZ);
            AVLog.logKibana(4, "VideoPlatformWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        this.LL.LJJLIIIJL(interfaceC1269980j9Y);
    }

    @Override // com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper, com.ss.ttlivestreamer.core.engine.NativeObject
    public final void release() {
        LLJI();
        this.LL.release();
        this.LLIZLLLIL = LyraxVideoSourceState.STOPPED;
        super.release();
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final LyraxErrorCode uninitPlatformWrapper() {
        LLJI();
        this.LLIZLLLIL = LyraxVideoSourceState.CREATED;
        return LyraxErrorCode.SUCCESS;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final LyraxVideoContentType getContentType() {
        return this.LLJ;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final LyraxVideoSourceType getSourceType() {
        return LyraxVideoSourceType.EXTERNAL_RAW_FRAME;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final LyraxVideoSourceState getState() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJFF(boolean z) {
        this.LL.LJFF(z);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJIILLIIL(int i) {
        LyraxErrorCode lyraxErrorCodeLLJJI = LLJJI(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchVideoCaptureDevice native sync toDevice:");
        sbLIZ.append(i);
        sbLIZ.append(" result:");
        sbLIZ.append(lyraxErrorCodeLLJJI.value());
        AVLog.logKibana(4, "VideoPlatformWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("switchVideoCaptureDevice stage5 cxx vdm authority toDevice:");
        sbLIZ2.append(i);
        sbLIZ2.append(" result:");
        sbLIZ2.append(lyraxErrorCodeLLJJI.value());
        sbLIZ2.append(" androidFallback:VideoNodeManager");
        AVLog.logKibana(4, "VideoPlatformWrapper", C2188811AlT.LIZIZ(sbLIZ2), null);
        this.LL.LJIILLIIL(i);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJIIZILJ(C1273190jEj c1273190jEj) {
        this.LL.LLJJIJIIJIL = c1273190jEj;
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJIJJ(EnumC1269700j96 enumC1269700j96) {
        this.LL.LJIJJ(enumC1269700j96);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJ(C1270360jAA c1270360jAA) {
        this.LL.LJJ(c1270360jAA);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJI(C1269990j9Z c1269990j9Z) {
        this.LL.LJJI(c1269990j9Z);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJIIJZLJL(boolean z) {
        this.LL.LJJIIJZLJL(z);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJIL(C1275410jIJ c1275410jIJ) {
        this.LL.LLIZLLLIL = c1275410jIJ;
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJIZ(EnumC1267980j6K enumC1267980j6K) {
        if (this.LLJI != enumC1267980j6K) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setScene ");
            sbLIZ.append(this.LLJI);
            sbLIZ.append(" -> ");
            sbLIZ.append(enumC1267980j6K);
            AVLog.logKibana(4, "VideoPlatformWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
            if ((enumC1267980j6K == EnumC1267980j6K.NORMAL_LIVE || enumC1267980j6K == EnumC1267980j6K.GAME_LIVE) && this.LLJJIJI) {
                AVLog.logKibana(5, "VideoPlatformWrapper", "setScene fallback cleanup: rtc slot not unbound on linkmic exit", null);
                this.LLJJIJI = false;
                this.LLJJIJIIJIL = false;
                this.LL.LJJLIIIJLLLLLLLZ(null);
            }
        }
        this.LLJI = enumC1267980j6K;
        this.LL.LJJIZ(enumC1267980j6K);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJJI(C1272040jCs c1272040jCs) {
        this.LL.LJJJI(c1272040jCs);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJJJJL(EnumC1270450jAJ enumC1270450jAJ) {
        this.LL.LJJJJJL(enumC1270450jAJ);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJJLIIL(VideoSink videoSink) {
        C1272030jCr c1272030jCr;
        String name;
        if (videoSink == null) {
            c1272030jCr = null;
        } else {
            c1272030jCr = this.LLIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPusherPublishNode replace sink ");
        String name2 = "null";
        if (videoSink == null) {
            name = "null";
        } else {
            name = videoSink.getClass().getName();
        }
        sbLIZ.append(name);
        sbLIZ.append(" -> ");
        if (c1272030jCr != null) {
            name2 = C1272030jCr.class.getName();
        }
        sbLIZ.append(name2);
        AVLog.logKibana(4, "VideoPlatformWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LL.LJJJLIIL(c1272030jCr);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJLIIIJL(InterfaceC1269980j9Y interfaceC1269980j9Y) {
        this.LLJILJIL = interfaceC1269980j9Y;
        LLIZ();
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJLIIIJLLLLLLLZ(VideoSink videoSink) {
        if (this.LLILLJJLI.LLJJIJI()) {
            if (videoSink == null) {
                this.LLJJIJI = false;
                this.LLJJIJIIJIL = false;
                this.LL.LJJLIIIJLLLLLLLZ(null);
                return;
            } else {
                if (this.LLJJIJI) {
                    return;
                }
                if (hasNativePeer()) {
                    this.LLJJIJI = true;
                    AVLog.logKibana(4, "VideoPlatformWrapper", "setRtcPublishNode[linkmic] wrapper path active", null);
                    this.LL.LJJLIIIJLLLLLLLZ(this.LLIZ);
                    return;
                } else {
                    AVLog.logKibana(5, "VideoPlatformWrapper", "setRtcPublishNode[linkmic] fallback: wrapper not bound to publisher", null);
                    this.LL.LJJLIIIJLLLLLLLZ(videoSink);
                    return;
                }
            }
        }
        this.LL.LJJLIIIJLLLLLLLZ(videoSink);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJLIIJ(EnumC1267980j6K enumC1267980j6K) {
        this.LL.LLJLILLLLZIIL = enumC1267980j6K;
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJZ(C1270630jAb c1270630jAb) {
        this.LL.LJJZ(c1270630jAb);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJL(C1272100jCy c1272100jCy) {
        this.LLJIJIL = c1272100jCy;
        LLIZLLLIL();
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJLIIIL(TTLHSceneDetector tTLHSceneDetector) {
        this.LL.LLJJIJI = tTLHSceneDetector;
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJLIL(C1270180j9s c1270180j9s) {
        this.LL.LJLIL(c1270180j9s);
    }

    @Override // X.InterfaceC1266410j3n
    public final void LLF(JSONObject jSONObject) {
        this.LL.LLF(jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d0 A[PHI: r15
      0x02d0: PHI (r15v4 boolean) = (r15v1 boolean), (r15v5 boolean) binds: [B:49:0x00c4, B:98:0x02cf] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.lyrax.video.LyraxVideoFrame LLJ(com.ss.ttlivestreamer.core.buffer.VideoFrame r20) {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1271980jCm.LLJ(com.ss.ttlivestreamer.core.buffer.VideoFrame):com.ss.lyrax.video.LyraxVideoFrame");
    }

    public final void LLJIJIL(VideoFrame videoFrame) {
        LyraxPipelineEvent[] lyraxPipelineEventArr;
        boolean z;
        LyraxRtcVideoEncoderConfig[] lyraxRtcVideoEncoderConfigArr;
        LyraxRtcVideoEncoderConfig lyraxRtcVideoEncoderConfig;
        boolean z2;
        boolean z3;
        if (videoFrame != null && videoFrame.getBuffer() != null) {
            boolean zLLJILLL = LLJILLL();
            InterfaceC1272020jCq interfaceC1272020jCq = this.LLJJIII;
            if (!zLLJILLL) {
                if (interfaceC1272020jCq == null) {
                    if (!this.LLJJIJI) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("handlePublishFrameForNativePipeline skip unexpected sceneType=");
                        sbLIZ.append(this.LLJI);
                        LLJJ(5, C2188811AlT.LIZIZ(sbLIZ), true);
                        return;
                    }
                    LLJJ(3, "handlePublishFrameForNativePipeline linkmic transient: executor null, push without side effects", false);
                }
                this.LLILLJJLI.LLJLLL(videoFrame);
                this.LLILLJJLI.getClass();
                this.LLILLJJLI.LLJZ(videoFrame);
                if (interfaceC1272020jCq != null && !this.LLJJIJIIJIL) {
                    interfaceC1272020jCq.LJII();
                    this.LLJJIJIIJIL = true;
                }
            } else {
                this.LLILLJJLI.getClass();
                this.LLILLJJLI.LLJZ(videoFrame);
                this.LLILLJJLI.LLJLLL(videoFrame);
                this.LLILLJJLI.LLL(videoFrame);
            }
            LyraxVideoFrame lyraxVideoFrameLLJ = LLJ(videoFrame);
            if (lyraxVideoFrameLLJ == null) {
                if (zLLJILLL) {
                    this.LLILLJJLI.LJLJI(0, 0);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handlePublishFrameForNativePipeline buildLyraxVideoFrame returned null, buffer=");
                sbLIZ2.append(videoFrame.getBuffer().getClass().getName());
                LLJJ(6, C2188811AlT.LIZIZ(sbLIZ2), true);
                return;
            }
            List<C1269610j8x> events = videoFrame.getEvents();
            ArrayList arrayList = new ArrayList();
            if (zLLJILLL && this.LLILLJJLI.LLJJI()) {
                synchronized (this.LLILZLL) {
                    if (events != null) {
                        try {
                            if (!events.isEmpty()) {
                                for (C1269610j8x c1269610j8x : events) {
                                    if ((c1269610j8x.LJFF & C1269570j8t.LJ) != 0) {
                                        ((LinkedList) this.LLILZIL).add(c1269610j8x);
                                    }
                                }
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    if (!this.LLILZIL.isEmpty()) {
                        Iterator<C1269610j8x> it2 = this.LLILZIL.iterator();
                        while (it2.hasNext()) {
                            C1269610j8x next = it2.next();
                            int i = next.LJFF;
                            int i2 = C1269570j8t.LJ;
                            if ((i & i2) != 0) {
                                if (next.LIZLLL == EnumC1269590j8v.UpdateVideoParameters && (next instanceof C1269600j8w)) {
                                    C1269600j8w c1269600j8w = (C1269600j8w) next;
                                    arrayList.add(new LyraxUpdateVideoParamsEvent(c1269600j8w.LIZIZ, 1, 129, 1, c1269600j8w.LJIILIIL, c1269600j8w.LJIILJJIL, c1269600j8w.LJIILL, 0, 0, c1269600j8w.LJ));
                                    int i3 = next.LJFF & (~i2);
                                    next.LJFF = i3;
                                    if (i3 == 0) {
                                        it2.remove();
                                    }
                                }
                            } else if (i == 0) {
                                it2.remove();
                            }
                        }
                    }
                }
            }
            if (events != null && !events.isEmpty()) {
                for (C1269610j8x c1269610j8x2 : events) {
                    if ((c1269610j8x2.LJFF & C1269570j8t.LJFF) != 0) {
                        EnumC1269590j8v enumC1269590j8v = c1269610j8x2.LIZLLL;
                        if (enumC1269590j8v == EnumC1269590j8v.UpdateVideoParameters && (c1269610j8x2 instanceof C1269600j8w)) {
                            C1269600j8w c1269600j8w2 = (C1269600j8w) c1269610j8x2;
                            arrayList.add(new LyraxUpdateVideoParamsEvent(c1269600j8w2.LIZIZ, 1, 129, 2, c1269600j8w2.LJIILIIL, c1269600j8w2.LJIILJJIL, c1269600j8w2.LJIILL, 0, 0, c1269600j8w2.LJ));
                        } else if (enumC1269590j8v == EnumC1269590j8v.SimulcastUpdateLayoutConfig && (c1269610j8x2 instanceof C1269630j8z)) {
                            C1269630j8z c1269630j8z = (C1269630j8z) c1269610j8x2;
                            Object obj = c1269630j8z.LJII;
                            LyraxRtcVideoPerformanceConfig lyraxRtcVideoPerformanceConfig = null;
                            if (!(obj instanceof C1271990jCn[])) {
                                lyraxRtcVideoEncoderConfigArr = null;
                            } else {
                                C1271990jCn[] c1271990jCnArr = (C1271990jCn[]) obj;
                                lyraxRtcVideoEncoderConfigArr = new LyraxRtcVideoEncoderConfig[c1271990jCnArr.length];
                                for (int i4 = 0; i4 < c1271990jCnArr.length; i4++) {
                                    C1271990jCn c1271990jCn = c1271990jCnArr[i4];
                                    if (c1271990jCn == null) {
                                        lyraxRtcVideoEncoderConfig = null;
                                    } else {
                                        lyraxRtcVideoEncoderConfig = new LyraxRtcVideoEncoderConfig(c1271990jCn.LIZ, c1271990jCn.LIZIZ, c1271990jCn.LIZJ, c1271990jCn.LIZLLL, c1271990jCn.LJ);
                                    }
                                    lyraxRtcVideoEncoderConfigArr[i4] = lyraxRtcVideoEncoderConfig;
                                }
                            }
                            Object obj2 = c1269630j8z.LJIIIIZZ;
                            if (obj2 instanceof C1272000jCo) {
                                C1272000jCo c1272000jCo = (C1272000jCo) obj2;
                                lyraxRtcVideoPerformanceConfig = new LyraxRtcVideoPerformanceConfig(c1272000jCo.LIZ, c1272000jCo.LIZIZ, c1272000jCo.LIZJ);
                            }
                            long j = c1269630j8z.LIZIZ;
                            if (lyraxRtcVideoEncoderConfigArr != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (lyraxRtcVideoPerformanceConfig != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            arrayList.add(new LyraxSimulcastUpdateLayoutConfigEvent(j, 14, 129, z2, lyraxRtcVideoEncoderConfigArr, z3, lyraxRtcVideoPerformanceConfig));
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                lyraxPipelineEventArr = new LyraxPipelineEvent[0];
            } else {
                lyraxPipelineEventArr = (LyraxPipelineEvent[]) arrayList.toArray(new LyraxPipelineEvent[0]);
            }
            lyraxVideoFrameLLJ.setPipelineEvents(lyraxPipelineEventArr);
            if (zLLJILLL) {
                this.LLILLJJLI.LJLJI(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
            }
            try {
                if (this.LLIZLLLIL != LyraxVideoSourceState.STOPPED && hasNativePeer()) {
                    LyraxErrorCode lyraxErrorCodePushFrameToNative = pushFrameToNative(lyraxVideoFrameLLJ);
                    if (lyraxErrorCodePushFrameToNative != LyraxErrorCode.SUCCESS && lyraxErrorCodePushFrameToNative != LyraxErrorCode.TIMESTAMP_ERROR) {
                        z = false;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("handlePublishFrameForNativePipeline push failed result=");
                        sbLIZ3.append(lyraxErrorCodePushFrameToNative);
                        sbLIZ3.append(", nativePeer=");
                        sbLIZ3.append(getNativePeer());
                        sbLIZ3.append(", sceneType=");
                        sbLIZ3.append(this.LLJI);
                        sbLIZ3.append(", frame=");
                        sbLIZ3.append(videoFrame.getRotatedWidth());
                        sbLIZ3.append("x");
                        sbLIZ3.append(videoFrame.getRotatedHeight());
                        sbLIZ3.append(", tsUs=");
                        sbLIZ3.append(videoFrame.getTimestampNs() / 1000);
                        LLJJ(6, C2188811AlT.LIZIZ(sbLIZ3), true);
                    } else {
                        z = true;
                        this.LLIZLLLIL = LyraxVideoSourceState.STARTED;
                    }
                    this.LLILLJJLI.LLJZIJLIL(videoFrame, z);
                    if (!zLLJILLL && interfaceC1272020jCq != null) {
                        try {
                            interfaceC1272020jCq.LJIIJ(videoFrame, lyraxErrorCodePushFrameToNative);
                        } catch (Exception th) {
                        }
                    }
                    lyraxVideoFrameLLJ.release();
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("skip pushFrameToNative: state=");
                sbLIZ4.append(this.LLIZLLLIL);
                sbLIZ4.append(", sceneType=");
                sbLIZ4.append(this.LLJI);
                LLJJ(5, C2188811AlT.LIZIZ(sbLIZ4), false);
                lyraxVideoFrameLLJ.release();
                return;
            } catch (Throwable th2) {
                lyraxVideoFrameLLJ.release();
                throw th2;
            }
        }
        LLJJ(5, "handlePublishFrameForNativePipeline skip: frame or buffer is null", false);
    }

    public final void LLJILJIL(VideoFrame videoFrame) {
        boolean z = false;
        if (this.LLILZ >= 1) {
            LLJIJIL(videoFrame);
            return;
        }
        if (videoFrame != null && videoFrame.getBuffer() != null) {
            boolean zLLJILLL = LLJILLL();
            InterfaceC1272020jCq interfaceC1272020jCq = this.LLJJIII;
            if (!zLLJILLL) {
                if (interfaceC1272020jCq == null) {
                    if (!this.LLJJIJI) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("handlePublishFrame skip unexpected sceneType=");
                        sbLIZ.append(this.LLJI);
                        LLJJ(5, C2188811AlT.LIZIZ(sbLIZ), true);
                        return;
                    }
                    LLJJ(3, "handlePublishFrame linkmic transient: executor null, push without side effects", false);
                }
                this.LLILLJJLI.LLJLLL(videoFrame);
                this.LLILLJJLI.getClass();
                this.LLILLJJLI.LLJZ(videoFrame);
                if (interfaceC1272020jCq != null) {
                    List<C1269610j8x> events = videoFrame.getEvents();
                    if (events != null && !events.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (C1269610j8x c1269610j8x : events) {
                            if ((c1269610j8x.LJFF & C1269570j8t.LJFF) != 0) {
                                arrayList.add(c1269610j8x);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            interfaceC1272020jCq.LIZJ(arrayList);
                        }
                    }
                    if (!this.LLJJIJIIJIL) {
                        interfaceC1272020jCq.LJII();
                        this.LLJJIJIIJIL = true;
                    }
                }
            } else {
                this.LLILLJJLI.getClass();
                this.LLILLJJLI.LLJZ(videoFrame);
                if (this.LLILLJJLI.LLJJI()) {
                    List<C1269610j8x> events2 = videoFrame.getEvents();
                    synchronized (this.LLILZLL) {
                        if (events2 != null) {
                            try {
                                if (!events2.isEmpty()) {
                                    ((LinkedList) this.LLILZIL).addAll(events2);
                                }
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        if (!this.LLILZIL.isEmpty()) {
                            Iterator<C1269610j8x> it2 = this.LLILZIL.iterator();
                            while (it2.hasNext()) {
                                C1269610j8x next = it2.next();
                                int i = next.LJFF;
                                int i2 = C1269570j8t.LJ;
                                if ((i & i2) != 0 && C1269540j8q.LIZ[next.LIZLLL.ordinal()] == 1 && (next instanceof C1269600j8w)) {
                                    C1266350j3h c1266350j3h = this.LLILLJJLI;
                                    C1269600j8w c1269600j8w = (C1269600j8w) next;
                                    c1266350j3h.getClass();
                                    c1266350j3h.LLLIIIL(c1269600j8w.LIZLLL(i2));
                                    c1266350j3h.LLLZZIL = c1269600j8w.LJIILIIL;
                                    c1266350j3h.LLZ = c1269600j8w.LJIILJJIL;
                                    c1266350j3h.LLZIL = c1269600j8w.LJIILL;
                                    int i3 = next.LJFF & (~i2);
                                    next.LJFF = i3;
                                    if (i3 == 0) {
                                        it2.remove();
                                    }
                                }
                            }
                        }
                    }
                }
                this.LLILLJJLI.LLJLLL(videoFrame);
                this.LLILLJJLI.LLL(videoFrame);
            }
            List<C1269610j8x> events3 = videoFrame.getEvents();
            if (events3 != null && !events3.isEmpty()) {
                for (C1269610j8x c1269610j8x2 : events3) {
                }
            }
            LyraxVideoFrame lyraxVideoFrameLLJ = LLJ(videoFrame);
            if (lyraxVideoFrameLLJ == null) {
                if (zLLJILLL) {
                    this.LLILLJJLI.LJLJI(0, 0);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handlePublishFrame buildLyraxVideoFrame returned null, buffer=");
                sbLIZ2.append(videoFrame.getBuffer().getClass().getName());
                LLJJ(6, C2188811AlT.LIZIZ(sbLIZ2), true);
                return;
            }
            if (zLLJILLL) {
                this.LLILLJJLI.LJLJI(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
            }
            try {
                if (this.LLIZLLLIL != LyraxVideoSourceState.STOPPED && hasNativePeer()) {
                    LyraxErrorCode lyraxErrorCodePushFrameToNative = pushFrameToNative(lyraxVideoFrameLLJ);
                    if (lyraxErrorCodePushFrameToNative != LyraxErrorCode.SUCCESS && lyraxErrorCodePushFrameToNative != LyraxErrorCode.TIMESTAMP_ERROR) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("handlePublishFrame push failed result=");
                        sbLIZ3.append(lyraxErrorCodePushFrameToNative);
                        sbLIZ3.append(", nativePeer=");
                        sbLIZ3.append(getNativePeer());
                        sbLIZ3.append(", sceneType=");
                        sbLIZ3.append(this.LLJI);
                        sbLIZ3.append(", frame=");
                        sbLIZ3.append(videoFrame.getRotatedWidth());
                        sbLIZ3.append("x");
                        sbLIZ3.append(videoFrame.getRotatedHeight());
                        sbLIZ3.append(", tsUs=");
                        sbLIZ3.append(videoFrame.getTimestampNs() / 1000);
                        LLJJ(6, C2188811AlT.LIZIZ(sbLIZ3), true);
                    } else {
                        z = true;
                        this.LLIZLLLIL = LyraxVideoSourceState.STARTED;
                    }
                    this.LLILLJJLI.LLJZIJLIL(videoFrame, z);
                    if (!zLLJILLL && interfaceC1272020jCq != null) {
                        try {
                            interfaceC1272020jCq.LJIIJ(videoFrame, lyraxErrorCodePushFrameToNative);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("skip pushFrameToNative: state=");
                    sbLIZ4.append(this.LLIZLLLIL);
                    sbLIZ4.append(", sceneType=");
                    sbLIZ4.append(this.LLJI);
                    LLJJ(5, C2188811AlT.LIZIZ(sbLIZ4), false);
                }
                lyraxVideoFrameLLJ.release();
                return;
            } catch (Throwable th) {
                lyraxVideoFrameLLJ.release();
                throw th;
            }
        }
        LLJJ(5, "handlePublishFrame skip: frame or buffer is null", false);
    }

    public final LyraxErrorCode LLJJI(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 6) {
                        return LyraxErrorCode.NOT_SUPPORT;
                    }
                    return switchSubSource(LyraxVideoSubSource.EXTERNAL_FRAME);
                }
                return switchSubSource(LyraxVideoSubSource.SCREEN);
            }
            return switchCameraBack();
        }
        return switchCameraFront();
    }

    @Override // com.ss.lyrax.video.bridge.IVideoPublishCallback
    public final void onSimulcastUpdateLayoutConfigEvent(LyraxSimulcastUpdateLayoutConfigEvent lyraxSimulcastUpdateLayoutConfigEvent) {
        InterfaceC1272020jCq interfaceC1272020jCq;
        C1271990jCn[] c1271990jCnArr;
        LyraxRtcVideoPerformanceConfig rtcVideoPerformanceConfig;
        LyraxRtcVideoEncoderConfig[] rtcVideoEncoderConfigs;
        if (lyraxSimulcastUpdateLayoutConfigEvent == null || LLJILLL() || (interfaceC1272020jCq = this.LLJJIII) == null) {
            return;
        }
        C1269630j8z c1269630j8z = new C1269630j8z((int) lyraxSimulcastUpdateLayoutConfigEvent.getSequenceNumber(), EnumC1269590j8v.SimulcastUpdateLayoutConfig, C1269570j8t.LJFF);
        C1272000jCo c1272000jCo = null;
        if (lyraxSimulcastUpdateLayoutConfigEvent.hasRtcVideoEncoderConfigs() && (rtcVideoEncoderConfigs = lyraxSimulcastUpdateLayoutConfigEvent.getRtcVideoEncoderConfigs()) != null) {
            if (rtcVideoEncoderConfigs.length == 0) {
                c1271990jCnArr = new C1271990jCn[0];
            } else {
                c1271990jCnArr = new C1271990jCn[rtcVideoEncoderConfigs.length];
                for (int i = 0; i < rtcVideoEncoderConfigs.length; i++) {
                    LyraxRtcVideoEncoderConfig lyraxRtcVideoEncoderConfig = rtcVideoEncoderConfigs[i];
                    if (lyraxRtcVideoEncoderConfig == null) {
                        c1271990jCnArr[i] = null;
                    } else {
                        C1271990jCn c1271990jCn = new C1271990jCn();
                        c1271990jCn.LIZ = lyraxRtcVideoEncoderConfig.getWidth();
                        c1271990jCn.LIZIZ = lyraxRtcVideoEncoderConfig.getHeight();
                        c1271990jCn.LIZJ = lyraxRtcVideoEncoderConfig.getFps();
                        c1271990jCn.LIZLLL = lyraxRtcVideoEncoderConfig.getBitrate();
                        c1271990jCn.LJ = lyraxRtcVideoEncoderConfig.getName();
                        c1271990jCnArr[i] = c1271990jCn;
                    }
                }
            }
        } else {
            c1271990jCnArr = null;
        }
        if (lyraxSimulcastUpdateLayoutConfigEvent.hasRtcVideoPerformanceConfig() && (rtcVideoPerformanceConfig = lyraxSimulcastUpdateLayoutConfigEvent.getRtcVideoPerformanceConfig()) != null) {
            c1272000jCo = new C1272000jCo(rtcVideoPerformanceConfig.getWidth(), rtcVideoPerformanceConfig.getHeight(), rtcVideoPerformanceConfig.getFps());
        }
        c1269630j8z.LJII = c1271990jCnArr;
        c1269630j8z.LJIIIIZZ = c1272000jCo;
        interfaceC1272020jCq.LIZJ(Collections.singletonList(c1269630j8z));
    }

    @Override // com.ss.lyrax.video.bridge.IVideoPublishCallback
    public final void onUpdateVideoParamsEvent(LyraxUpdateVideoParamsEvent lyraxUpdateVideoParamsEvent) {
        InterfaceC1272020jCq interfaceC1272020jCq;
        if (lyraxUpdateVideoParamsEvent == null) {
            return;
        }
        boolean zLLJILLL = LLJILLL();
        if (lyraxUpdateVideoParamsEvent.getTerminalTarget() == 1 && zLLJILLL) {
            C1266350j3h c1266350j3h = this.LLILLJJLI;
            int i = C1269570j8t.LJ;
            C1269600j8w c1269600j8wLLJJIII = LLJJIII(lyraxUpdateVideoParamsEvent, i);
            c1266350j3h.getClass();
            c1266350j3h.LLLIIIL(c1269600j8wLLJJIII.LIZLLL(i));
            c1266350j3h.LLLZZIL = c1269600j8wLLJJIII.LJIILIIL;
            c1266350j3h.LLZ = c1269600j8wLLJJIII.LJIILJJIL;
            c1266350j3h.LLZIL = c1269600j8wLLJJIII.LJIILL;
            return;
        }
        if (lyraxUpdateVideoParamsEvent.getTerminalTarget() == 2 && !zLLJILLL && (interfaceC1272020jCq = this.LLJJIII) != null) {
            interfaceC1272020jCq.LIZJ(Collections.singletonList(LLJJIII(lyraxUpdateVideoParamsEvent, C1269570j8t.LJFF)));
        }
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final LyraxErrorCode pushVideoFrame(LyraxVideoFrame lyraxVideoFrame) {
        return pushFrameToNative(lyraxVideoFrame);
    }

    @Override // X.InterfaceC1266410j3n
    public final Bundle query(String str) {
        return this.LL.query(str);
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final LyraxErrorCode updateExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) {
        return updateStatsToNative(lyraxPreProcessVideoNodeStats);
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final LyraxErrorCode updatePlatformCaptureConfig(LyraxVideoPlatformCaptureConfig lyraxVideoPlatformCaptureConfig) {
        return LyraxErrorCode.SUCCESS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0jCr, com.ss.ttlivestreamer.core.engine.VideoSink] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1271980jCm(X.C1267500j5Y r8, X.C1266350j3h r9) {
        /*
            r7 = this;
            r7.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r7.LLILZIL = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r7.LLILZLL = r0
            X.0jCr r4 = new X.0jCr
            r4.<init>()
            r7.LLIZ = r4
            com.ss.lyrax.video.LyraxVideoSourceState r0 = com.ss.lyrax.video.LyraxVideoSourceState.CREATED
            r7.LLIZLLLIL = r0
            com.ss.lyrax.video.LyraxVideoContentType r0 = com.ss.lyrax.video.LyraxVideoContentType.CAMERA
            r7.LLJ = r0
            X.0j6K r0 = X.EnumC1267980j6K.NORMAL_LIVE
            r7.LLJI = r0
            r5 = 0
            r7.LLJIJIL = r5
            r7.LLJILJIL = r5
            r0 = 0
            r7.LLJILJILJ = r0
            r7.LLJILLL = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.LLJJ = r0
            r6 = 0
            r7.LLJJI = r6
            r7.LLJJIII = r5
            r7.LLJJIJI = r6
            r7.LLJJIJIIJIL = r6
            X.0jC2 r3 = new X.0jC2
            r3.<init>(r8, r9)
            r7.LL = r3
            r7.LLILLJJLI = r9
            r7.LLILLL = r8
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r8.LIZ
            int r2 = r0.LJIJJ()
            r7.LLILZ = r2
            r0 = 4
            if (r2 < r0) goto L9c
            r1 = 1
        L53:
            r6 = 1
        L54:
            boolean r0 = r3.LLJJL
            if (r0 != r1) goto L6c
            boolean r0 = r3.LLJJLIIIJLLLLLLLZ
            if (r0 != r6) goto L6c
        L5c:
            r7.LLIZLLLIL()
            r7.LLIZ()
            boolean r0 = r7.LLJILJILJ()
            if (r0 == 0) goto L6b
            r3.LJJJLIIL(r4)
        L6b:
            return
        L6c:
            r3.LLJJL = r1
            r3.LLJJLIIIJLLLLLLLZ = r6
            if (r1 == 0) goto L8a
            X.0jC5 r0 = r3.LLJI
            if (r0 == 0) goto L7c
            r0.release()
            r3.LJIIJJI(r0)
        L7c:
            X.0jC4 r0 = r3.LLJIJIL
            if (r0 == 0) goto L86
            r0.release()
            r3.LJIIJJI(r0)
        L86:
            r3.LLJI = r5
            r3.LLJIJIL = r5
        L8a:
            if (r6 == 0) goto L98
            X.0jCC r0 = r3.LLJILJIL
            if (r0 == 0) goto L96
            r0.release()
            r3.LJIIJJI(r0)
        L96:
            r3.LLJILJIL = r5
        L98:
            r3.LIZIZ()
            goto L5c
        L9c:
            r1 = 0
            r0 = 3
            if (r2 < r0) goto L54
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1271980jCm.<init>(X.0j5Y, X.0j3h):void");
    }

    public static C1269600j8w LLJJIII(LyraxUpdateVideoParamsEvent lyraxUpdateVideoParamsEvent, int i) {
        C1269600j8w c1269600j8w = new C1269600j8w((int) lyraxUpdateVideoParamsEvent.getSequenceNumber(), EnumC1269590j8v.UpdateVideoParameters, i, lyraxUpdateVideoParamsEvent.getExtraInfo());
        int encodeWidth = lyraxUpdateVideoParamsEvent.getEncodeWidth();
        int encodeHeight = lyraxUpdateVideoParamsEvent.getEncodeHeight();
        int encodeFps = lyraxUpdateVideoParamsEvent.getEncodeFps();
        c1269600j8w.LJIILIIL = encodeWidth;
        c1269600j8w.LJIILJJIL = encodeHeight;
        c1269600j8w.LJIILL = encodeFps;
        return c1269600j8w;
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJLJLLL(Bundle bundle, InterfaceC1270140j9o interfaceC1270140j9o) {
        this.LL.LJLJLLL(bundle, interfaceC1270140j9o);
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final LyraxErrorCode initPlatformWrapper(LyraxVideoPlatformWrapperConfig lyraxVideoPlatformWrapperConfig, LyraxVideoPlatformCaptureConfig lyraxVideoPlatformCaptureConfig) {
        if (lyraxVideoPlatformWrapperConfig != null && lyraxVideoPlatformWrapperConfig.getContentType() != null) {
            this.LLJ = lyraxVideoPlatformWrapperConfig.getContentType();
        }
        LLJI();
        this.LLIZLLLIL = LyraxVideoSourceState.CREATED;
        C1266350j3h c1266350j3h = this.LLILLJJLI;
        c1266350j3h.R = false;
        c1266350j3h.S = 0;
        c1266350j3h.T = 0;
        return LyraxErrorCode.SUCCESS;
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJLJI(int i, int i2, boolean z) {
        this.LL.LJLJI(i, i2, z);
    }

    public final void LLJJ(int i, String str, boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.LLJILJILJ > 10000) {
            this.LLJILJILJ = jElapsedRealtime;
            if (z) {
                AVLog.logKibana(i, "VideoPlatformWrapper", str, null);
            }
        }
    }

    @Override // com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper, com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final void onVideoCaptureFirstFrameRendered(int i, int i2, long j) {
        if (!LLJILJILJ()) {
            return;
        }
        C1266350j3h c1266350j3h = this.LLILLJJLI;
        synchronized (c1266350j3h) {
            if (c1266350j3h.LLLLIL) {
                return;
            }
            c1266350j3h.LLLLIL = true;
            c1266350j3h.LJJLIIIIJ(28, c1266350j3h.LLILZLL.LJJII(), 0);
            if (!c1266350j3h.LLLLIILLL) {
                c1266350j3h.LJJLIIIIJ(30, c1266350j3h.LLILZLL.LJJII(), 0);
                c1266350j3h.LLLLIILLL = true;
            }
        }
    }

    @Override // com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper, com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public final void onVideoCaptureFrameResolutionChanged(int i, int i2, long j) {
        InterfaceC1272020jCq interfaceC1272020jCq;
        if (LLJILLL() || (interfaceC1272020jCq = this.LLJJIII) == null) {
            return;
        }
        interfaceC1272020jCq.LJIJI(i, i2);
    }
}
