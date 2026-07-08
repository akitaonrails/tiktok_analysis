package X;

import android.os.Looper;
import com.bytedance.ies.nle.editor_jni.INLEListenerAsyncOnDone;
import com.bytedance.ies.nle.editor_jni.INLEListenerBeginVideoFrame;
import com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEAlgorithmCallbackWrapper;
import com.bytedance.ies.nle.editor_jni.NLEAlgorithmController;
import com.bytedance.ies.nle.editor_jni.NLEAlgorithmPath;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLEClipAlgorithmParam;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AwS1S1402000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oCF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463850oCF extends C0FRA implements INLERhythmPointRuntime {
    public NLEEditor LJ;
    public C1464070oCb LJFF;

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final int beginGenVideoFrames(String str, INLEListenerBeginVideoFrame iNLEListenerBeginVideoFrame) {
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final int cancelGenVideoFrame(String str) {
        return -1;
    }

    public final NLEAlgorithmController LJ() {
        C1464240oCs c1464240oCs = this.LIZ;
        if (c1464240oCs.LIZ == null || c1464240oCs.LIZLLL.get()) {
            return null;
        }
        return (NLEAlgorithmController) c1464240oCs.LJIIIIZZ.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final int removeAllVideoSound() {
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEVEPublic2: removeAllVideoSound");
        }
        return LJFF(true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final int restoreAllVideoSound() {
        NLEModel model;
        NLE nle = NLE.INSTANCE;
        NLELoggerListener logger = nle.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEVEPublic2: restoreAllVideoSound");
        }
        NLEEditor nLEEditor = this.LJ;
        if (nLEEditor == null || (model = nLEEditor.getModel()) == null) {
            NLELoggerListener logger2 = nle.getLogger();
            if (logger2 != null) {
                logger2.onLog(LogLevel.LEVEL_ERROR, "NLEVEPublic2: restoreAllVideoSound error, model is null");
            }
            return NLEError.FAILED.swigValue();
        }
        NLETrack mainTrack = model.getMainTrack(true);
        if (mainTrack == null) {
            return 0;
        }
        Iterator<NLETrackSlot> it2 = mainTrack.getSortedSlots().iterator();
        while (it2.hasNext()) {
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) it2.next().getMainSegment());
            if (nLESegmentVideoDynamicCast != null) {
                nLESegmentVideoDynamicCast.setEnableAudio(true);
            }
        }
        NLEEditor nLEEditor2 = this.LJ;
        if (nLEEditor2 == null) {
            return 0;
        }
        nLEEditor2.commit();
        return 0;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final int updateAlgorithmFromNormal() {
        NLE nle = NLE.INSTANCE;
        NLELoggerListener logger = nle.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEVEPublic2: updateAlgorithmFromNormal");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        NLEAlgorithmController nLEAlgorithmControllerLJ = LJ();
        if (nLEAlgorithmControllerLJ != null) {
            nLEAlgorithmControllerLJ.reInitSmartAlgorithmIfPossible();
        }
        int iRemoveAllVideoSound = removeAllVideoSound();
        NLELoggerListener logger2 = nle.getLogger();
        if (logger2 != null) {
            LogLevel logLevel = LogLevel.LEVEL_DEBUG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEVEPublic2: updateAlgorithmFromNormal, result: ");
            sbLIZ.append(iRemoveAllVideoSound);
            sbLIZ.append(", cost: ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            logger2.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
        }
        return iRemoveAllVideoSound;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final int genRandomSolve() {
        NLEAlgorithmController nLEAlgorithmControllerLJ = LJ();
        if (nLEAlgorithmControllerLJ != null) {
            return nLEAlgorithmControllerLJ.genRandomSolve();
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final int genSmartCutting() {
        NLEAlgorithmController nLEAlgorithmControllerLJ = LJ();
        if (nLEAlgorithmControllerLJ != null) {
            return nLEAlgorithmControllerLJ.genSmartCutting();
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final VecNLEClipAlgorithmParam getAllVideoRangeData() {
        VecNLEClipAlgorithmParam allVideoRangeData;
        NLEAlgorithmController nLEAlgorithmControllerLJ = LJ();
        return (nLEAlgorithmControllerLJ == null || (allVideoRangeData = nLEAlgorithmControllerLJ.getAllVideoRangeData()) == null) ? new VecNLEClipAlgorithmParam() : allVideoRangeData;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final int initBingoAlgorithm() {
        NLEAlgorithmController nLEAlgorithmControllerLJ = LJ();
        if (nLEAlgorithmControllerLJ != null) {
            nLEAlgorithmControllerLJ.reInitSmartAlgorithmIfPossible();
        }
        return removeAllVideoSound();
    }

    public static List LIZLLL(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        ArrayList arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getTrackType() == NLETrackType.AUDIO && (slots = nLETrack.getSlots()) != null && slots.size() == 1 && (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "BGM") || Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "REVERSE_AUDIO"))) {
                    arrayList.add(nLETrack);
                }
            }
        }
        return arrayList;
    }

    public final int LJFF(boolean z) {
        NLEModel model;
        NLEEditor nLEEditor;
        NLEEditor nLEEditor2 = this.LJ;
        if (nLEEditor2 != null && (model = nLEEditor2.getModel()) != null) {
            NLETrack mainTrack = model.getMainTrack(true);
            if (mainTrack != null) {
                Iterator<NLETrackSlot> it2 = mainTrack.getSortedSlots().iterator();
                while (it2.hasNext()) {
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) it2.next().getMainSegment());
                    if (nLESegmentVideoDynamicCast != null) {
                        nLESegmentVideoDynamicCast.setEnableAudio(false);
                    }
                }
                if (z && (nLEEditor = this.LJ) != null) {
                    nLEEditor.commit();
                }
            }
            return 0;
        }
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_ERROR, "NLEVEPublic2: removeAllVideoSound error, model is null");
        }
        return NLEError.FAILED.swigValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final int cancelGenVideoFrame(int i) {
        NLEAlgorithmController nLEAlgorithmControllerLJ = LJ();
        if (nLEAlgorithmControllerLJ != null) {
            return nLEAlgorithmControllerLJ.cancelGenVideoFrame(i);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final int removeMusic(int i) {
        NLEEditor nLEEditor;
        NLEModel model;
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            LogLevel logLevel = LogLevel.LEVEL_DEBUG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEVEPublic2: removeMusic: ");
            sbLIZ.append(i);
            logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i >= 0 && (nLEEditor = this.LJ) != null && (model = nLEEditor.getModel()) != null) {
            Iterator it2 = ((ArrayList) LIZLLL(model)).iterator();
            while (it2.hasNext()) {
                model.removeTrack((NLETrack) it2.next());
            }
        }
        return restoreAllVideoSound();
    }

    public C1463850oCF(C1464240oCs c1464240oCs, NLEEditor nLEEditor) {
        super(c1464240oCs);
        this.LJ = nLEEditor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oCb, com.bytedance.ies.nle.editor_jni.NLEAlgorithmCallbackWrapper] */
    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final int beginGenVideoFrames(int i, final INLEListenerBeginVideoFrame iNLEListenerBeginVideoFrame) {
        NLEAlgorithmController nLEAlgorithmControllerLJ = LJ();
        if (nLEAlgorithmControllerLJ == 0 || iNLEListenerBeginVideoFrame == null) {
            return -1;
        }
        ?? r0 = new NLEAlgorithmCallbackWrapper() { // from class: X.0oCb
            @Override // com.bytedance.ies.nle.editor_jni.NLEAlgorithmCallbackWrapper
            public final void onProgress(float f) {
                INLEListenerBeginVideoFrame iNLEListenerBeginVideoFrame2 = iNLEListenerBeginVideoFrame;
                if (iNLEListenerBeginVideoFrame2 != null) {
                    iNLEListenerBeginVideoFrame2.onProgress(f);
                }
            }
        };
        this.LJFF = r0;
        return nLEAlgorithmControllerLJ.beginGenVideoFrames(i, r0);
    }

    public static NLESegmentAudio LIZJ(int i, int i2, String str) {
        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
        nLESegmentAudio.setTimeClipStart(C352310DrZ.LIZJ(i));
        nLESegmentAudio.setTimeClipEnd(C352310DrZ.LIZJ(i2));
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        if (str == null) {
            str = "";
        }
        nLEResourceAV.setResourceFile(str);
        nLEResourceAV.setResourceType(NLEResType.ALGORITHM_AUDIO);
        nLEResourceAV.setDuration(nLESegmentAudio.getTimeClipEnd() - nLESegmentAudio.getTimeClipStart());
        nLESegmentAudio.setAVFile(nLEResourceAV);
        return nLESegmentAudio;
    }

    public final int LJI(String str, int i, int i2, NLEAlgorithmPath nLEAlgorithmPath) {
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            LogLevel logLevel = LogLevel.LEVEL_DEBUG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEVEPublic2: setMusicAndResultInner: ");
            sbLIZ.append(str);
            logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
        }
        NLEAlgorithmController nLEAlgorithmControllerLJ = LJ();
        if (nLEAlgorithmControllerLJ == null) {
            return -1;
        }
        int iLJII = LJII(str, i, i2, true);
        if (nLEAlgorithmControllerLJ.initSmartAlgorithm(C352310DrZ.LIZJ(i), C352310DrZ.LIZJ(i2), nLEAlgorithmPath) < 0 || iLJII < 0) {
            return -1;
        }
        return 0;
    }

    public final int LJII(String str, int i, int i2, boolean z) {
        NLEModel model;
        boolean z2;
        NLE nle = NLE.INSTANCE;
        NLELoggerListener logger = nle.getLogger();
        if (logger != null) {
            LogLevel logLevel = LogLevel.LEVEL_DEBUG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEVEPublic2: setMusicAndResultInnerSetModel: ");
            sbLIZ.append(str);
            logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
        }
        NLEEditor nLEEditor = this.LJ;
        if (nLEEditor != null && (model = nLEEditor.getModel()) != null) {
            List listLIZLLL = LIZLLL(model);
            if (((ArrayList) listLIZLLL).isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                NLELoggerListener logger2 = nle.getLogger();
                if (logger2 != null) {
                    LogLevel logLevel2 = LogLevel.LEVEL_DEBUG;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("NLEVEPublic2: add algorithm audio track: ");
                    sbLIZ2.append(str);
                    logger2.onLog(logLevel2, C2188811AlT.LIZIZ(sbLIZ2));
                }
                NLETrack nLETrack = new NLETrack();
                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                nLETrackSlot.setMainSegment(LIZJ(i, i2, str));
                nLETrackSlot.setStartTime(0L);
                nLETrackSlot.setEndTime(C352310DrZ.LIZJ(i2 - i));
                nLETrack.addSlot(nLETrackSlot);
                model.addTrack(nLETrack);
            } else {
                for (NLETrack nLETrack2 : (ArrayList) listLIZLLL) {
                    NLELoggerListener logger3 = NLE.INSTANCE.getLogger();
                    if (logger3 != null) {
                        LogLevel logLevel3 = LogLevel.LEVEL_DEBUG;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("NLEVEPublic2: replace algorithm audio clip path: ");
                        sbLIZ3.append(str);
                        logger3.onLog(logLevel3, C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    if (nLETrack2.getSlots().size() == 0) {
                        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                        nLETrackSlot2.setMainSegment(LIZJ(i, i2, str));
                        nLETrackSlot2.setStartTime(0L);
                        nLETrackSlot2.setEndTime(C352310DrZ.LIZJ(i2 - i));
                        nLETrack2.addSlot(nLETrackSlot2);
                    } else {
                        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrack2.getSortedSlots().get(0).getMainSegment());
                        if (nLESegmentAudioDynamicCast != null) {
                            NLEResourceAV aVFile = nLESegmentAudioDynamicCast.getAVFile();
                            nLESegmentAudioDynamicCast.setTimeClipStart(C352310DrZ.LIZJ(i));
                            nLESegmentAudioDynamicCast.setTimeClipEnd(C352310DrZ.LIZJ(i2));
                            String str2 = "";
                            if (aVFile != null) {
                                if (str != null) {
                                    str2 = str;
                                }
                                aVFile.setResourceFile(str2);
                                aVFile.setResourceType(NLEResType.ALGORITHM_AUDIO);
                            } else {
                                NLEResourceAV nLEResourceAV = new NLEResourceAV();
                                if (str != null) {
                                    str2 = str;
                                }
                                nLEResourceAV.setResourceFile(str2);
                                nLEResourceAV.setResourceType(NLEResType.ALGORITHM_AUDIO);
                                nLESegmentAudioDynamicCast.setAVFile(nLEResourceAV);
                            }
                        }
                    }
                }
            }
        }
        return LJFF(z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final int setMusicAndResult(String str, int i, int i2, NLEAlgorithmPath nLEAlgorithmPath) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            c118300cf.element = LJI(str, i, i2, nLEAlgorithmPath);
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            C0FRH.LIZIZ(new AwS1S1402000_22(c118300cf, this, str, i, i2, nLEAlgorithmPath, countDownLatch, 0));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                NLELoggerListener logger = NLE.INSTANCE.getLogger();
                if (logger != null) {
                    LogLevel logLevel = LogLevel.LEVEL_WARNING;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NLEVEPublic2: setMusicAndResult: ");
                    sbLIZ.append(e);
                    logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
        if (logger2 != null) {
            logger2.onLog(LogLevel.LEVEL_DEBUG, "NLEVEPublic2: setMusicAndResult: result: " + c118300cf.element + ", cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        }
        return c118300cf.element;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime
    public final void setMusicAndResultAsync(String str, final int i, final int i2, final NLEAlgorithmPath nLEAlgorithmPath, final INLEListenerAsyncOnDone iNLEListenerAsyncOnDone) {
        int i3;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            final C118300cf c118300cf = new C118300cf();
            c118300cf.element = LJII(str, i, i2, false);
            C786410Ut5.LJJZZIII(LIZ(), new Runnable() { // from class: X.0oCH
                @Override // java.lang.Runnable
                public final void run() {
                    C1463850oCF c1463850oCF = this.LL;
                    int i4 = i;
                    int i5 = i2;
                    NLEAlgorithmPath nLEAlgorithmPath2 = nLEAlgorithmPath;
                    C118300cf c118300cf2 = c118300cf;
                    INLEListenerAsyncOnDone iNLEListenerAsyncOnDone2 = iNLEListenerAsyncOnDone;
                    long j = jCurrentTimeMillis;
                    C1C7U.LIZ("NLERhythmPointRuntimeImplPublic@5f50.setMusicAndResultAsync$1L");
                    NLEEditor nLEEditor = c1463850oCF.LJ;
                    if (nLEEditor != null) {
                        nLEEditor.commit();
                    }
                    NLEAlgorithmController nLEAlgorithmControllerLJ = c1463850oCF.LJ();
                    int i6 = -1;
                    if (nLEAlgorithmControllerLJ != null && nLEAlgorithmControllerLJ.initSmartAlgorithm(C352310DrZ.LIZJ(i4), C352310DrZ.LIZJ(i5), nLEAlgorithmPath2) >= 0 && c118300cf2.element >= 0) {
                        i6 = 0;
                    }
                    if (iNLEListenerAsyncOnDone2 != null) {
                        iNLEListenerAsyncOnDone2.onDone(i6);
                    }
                    NLELoggerListener logger = NLE.INSTANCE.getLogger();
                    if (logger != null) {
                        LogLevel logLevel = LogLevel.LEVEL_DEBUG;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("NLEVEPublic2: setMusicAndResultAsync: result: ");
                        sbLIZ.append(i6);
                        sbLIZ.append(", cost: ");
                        sbLIZ.append(System.currentTimeMillis() - j);
                        logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C1C7U.LIZIZ("NLERhythmPointRuntimeImplPublic@5f50.setMusicAndResultAsync$1L");
                }
            });
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C118300cf c118300cf2 = new C118300cf();
        c118300cf2.element = -1;
        C0FRH.LIZIZ(new AwS1S1402000_22(c118300cf2, this, str, i, i2, nLEAlgorithmPath, countDownLatch, 1));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            NLELoggerListener logger = NLE.INSTANCE.getLogger();
            if (logger != null) {
                LogLevel logLevel = LogLevel.LEVEL_WARNING;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NLEVEPublic2: setMusicAndResult: ");
                sbLIZ.append(e);
                logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        NLEEditor nLEEditor = this.LJ;
        if (nLEEditor != null) {
            nLEEditor.commit();
        }
        NLEAlgorithmController nLEAlgorithmControllerLJ = LJ();
        if (nLEAlgorithmControllerLJ != null && nLEAlgorithmControllerLJ.initSmartAlgorithm(C352310DrZ.LIZJ(i), C352310DrZ.LIZJ(i2), nLEAlgorithmPath) >= 0 && c118300cf2.element >= 0) {
            i3 = 0;
        } else {
            i3 = -1;
        }
        if (iNLEListenerAsyncOnDone != null) {
            iNLEListenerAsyncOnDone.onDone(i3);
        }
        NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
        if (logger2 == null) {
            return;
        }
        LogLevel logLevel2 = LogLevel.LEVEL_DEBUG;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("NLEVEPublic2: setMusicAndResultAsync: result: ");
        sbLIZ2.append(i3);
        sbLIZ2.append(", cost: ");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        logger2.onLog(logLevel2, C2188811AlT.LIZIZ(sbLIZ2));
    }
}
