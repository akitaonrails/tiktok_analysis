package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.INLEListenerByteBufferEncoder;
import com.bytedance.ies.nle.editor_jni.INLEListenerCompileTargetFileInfoPredict;
import com.bytedance.ies.nle.editor_jni.INLEListenerEncoder;
import com.bytedance.ies.nle.editor_jni.INLEListenerGetImage;
import com.bytedance.ies.nle.editor_jni.INLEListenerSurfaceStatus;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.MapStrInt;
import com.bytedance.ies.nle.editor_jni.MapStrStr;
import com.bytedance.ies.nle.editor_jni.NLEEncodeListenerWrapper;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEListenerCompileTargetFileInfoPredictWrapper;
import com.bytedance.ies.nle.editor_jni.NLEListenerGetImageWrapper;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEPlayerPreviewMode;
import com.bytedance.ies.nle.editor_jni.NLE_GET_FRAME_FLAGS;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecLongLong;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.nio.ByteBuffer;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0oCP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463950oCP extends C0FRA implements INLEMediaRuntime {
    public final C1464240oCs LJ;
    public final NLEMediaConfig LJFF;
    public final C389960FQs LJI;
    public C0FRE LJII;
    public NLEEncodeListenerWrapper LJIIIIZZ;
    public C1464090oCd LJIIIZ;

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final Bitmap getCurrDisplayImage() {
        return getCurrDisplayImage(-1);
    }

    public final NLEMediaRuntimeController LIZJ() {
        C1464240oCs c1464240oCs = this.LJ;
        if (c1464240oCs.LIZ == null || c1464240oCs.LIZLLL.get()) {
            return null;
        }
        return (NLEMediaRuntimeController) c1464240oCs.LJ.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int cancelGetVideoFrames() {
        int iCancelGetVideoFrames;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                iCancelGetVideoFrames = nLEMediaRuntimeControllerLIZJ != null ? nLEMediaRuntimeControllerLIZJ.cancelGetVideoFrames() : -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iCancelGetVideoFrames;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final long[] getHighLightResult() {
        VecLongLong vecLongLong = new VecLongLong();
        getHighLightResult(vecLongLong);
        return C13LP.LLIIIILZ(vecLongLong);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final PairIntInt getInitSize() {
        C389960FQs c389960FQs;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ == null) {
                    return new PairIntInt();
                }
                PairIntInt initSize = nLEMediaRuntimeControllerLIZJ.getInitSize();
                if ((initSize.getFirst() == 0 || initSize.getSecond() == 0) && (c389960FQs = this.LJI) != null) {
                    SurfaceView surfaceView = c389960FQs.LJIJJLI;
                    Pair pair = surfaceView == null ? new Pair(0, 0) : new Pair(Integer.valueOf(surfaceView.getWidth()), Integer.valueOf(surfaceView.getHeight()));
                    if (((Number) pair.getFirst()).intValue() > 0 && ((Number) pair.getSecond()).intValue() > 0) {
                        PairIntInt initSize2 = getInitSize(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
                        initSize.setFirst(initSize2.getFirst());
                        initSize.setSecond(initSize2.getSecond());
                    }
                }
                return initSize;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final float getPlayFps() {
        float playFps;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                playFps = nLEMediaRuntimeControllerLIZJ != null ? nLEMediaRuntimeControllerLIZJ.getPlayFps() : 0.0f;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return playFps;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final PairIntInt getVideoResolution() {
        PairIntInt pairIntInt;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ == null || (pairIntInt = nLEMediaRuntimeControllerLIZJ.getVideoResolution()) == null) {
                    pairIntInt = new PairIntInt();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return pairIntInt;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final boolean isUseFilterProcess() {
        boolean zIsUseFilterProcess;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                zIsUseFilterProcess = nLEMediaRuntimeControllerLIZJ != null ? nLEMediaRuntimeControllerLIZJ.isUseFilterProcess() : false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zIsUseFilterProcess;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int unlockSeekVideoClip() {
        int iUnlockSeekVideoClip;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                iUnlockSeekVideoClip = nLEMediaRuntimeControllerLIZJ != null ? nLEMediaRuntimeControllerLIZJ.unlockSeekVideoClip() : -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iUnlockSeekVideoClip;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void cancelPreprocessI2V() {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            nLEMediaRuntimeControllerLIZJ.cancelPreprocessI2V();
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void clearAndroidImageHolder() {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            nLEMediaRuntimeControllerLIZJ.clearAndroidImageHolder();
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final PairIntInt getCanvasSize() {
        PairIntInt canvasSize;
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        return (nLEMediaRuntimeControllerLIZJ == null || (canvasSize = nLEMediaRuntimeControllerLIZJ.getCanvasSize()) == null) ? new PairIntInt() : canvasSize;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final long getEffectHandlerPtr() {
        if (LIZJ() != null) {
            return r0.getEffectHandle();
        }
        return 0L;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final NLEPlayerPreviewMode getPreviewFillMode() {
        NLEPlayerPreviewMode previewFillMode;
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        return (nLEMediaRuntimeControllerLIZJ == null || (previewFillMode = nLEMediaRuntimeControllerLIZJ.getPreviewFillMode()) == null) ? NLEPlayerPreviewMode.FIT : previewFillMode;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final String getUniqueKey() {
        String uniqueKey;
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        return (nLEMediaRuntimeControllerLIZJ == null || (uniqueKey = nLEMediaRuntimeControllerLIZJ.getUniqueKey()) == null) ? "" : uniqueKey;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int getVEColorSpace() {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            return nLEMediaRuntimeControllerLIZJ.getVEColorSpace();
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int enableWatermarkMetadata(Boolean bool) {
        int iEnableWatermarkMetadata;
        boolean zBooleanValue = bool.booleanValue();
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    iEnableWatermarkMetadata = nLEMediaRuntimeControllerLIZJ.enableWatermarkMetadata(zBooleanValue);
                } else {
                    iEnableWatermarkMetadata = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iEnableWatermarkMetadata;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final String findVEParentIdByNLESlotUUID(String str) {
        String strFindVEParentIdByNLESlotUUID;
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ == null || (strFindVEParentIdByNLESlotUUID = nLEMediaRuntimeControllerLIZJ.findVEParentIdByNLESlotUUID(str)) == null) {
            return "";
        }
        return strFindVEParentIdByNLESlotUUID;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final Bitmap getCurrDecodeImage(String str) {
        return getCurrDecodeImage(str, -1, -1);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final Bitmap getCurrDisplayImage(int i) {
        int second;
        Integer numValueOf;
        PairIntInt canvasSize = getCanvasSize();
        if (canvasSize.getFirst() != 0 && canvasSize.getSecond() != 0) {
            if (i > 0 && i < canvasSize.getFirst()) {
                second = (canvasSize.getSecond() * i) / canvasSize.getFirst();
            } else {
                i = canvasSize.getFirst();
                second = canvasSize.getSecond();
            }
            if (i % 2 == 1) {
                i++;
            }
            if (second % 2 == 1) {
                second++;
            }
            if (i != 0 && second != 0) {
                synchronized (this.LJ) {
                    try {
                        try {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, second, Bitmap.Config.ARGB_8888);
                            if (bitmapCreateBitmap == null) {
                                return null;
                            }
                            NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                            if (nLEMediaRuntimeControllerLIZJ != null) {
                                numValueOf = Integer.valueOf(nLEMediaRuntimeControllerLIZJ.getDisplayImage(bitmapCreateBitmap));
                            } else {
                                numValueOf = null;
                            }
                            int iSwigValue = NLEError.SUCCESS.swigValue();
                            if (numValueOf == null || numValueOf.intValue() != iSwigValue) {
                                NLELoggerListener logger = NLE.INSTANCE.getLogger();
                                if (logger != null) {
                                    LogLevel logLevel = LogLevel.LEVEL_ERROR;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("NLEVEPublic2: getCurrDisplayImage getDisplayImage failed! ");
                                    sbLIZ.append(numValueOf);
                                    logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                                }
                                if (!bitmapCreateBitmap.isRecycled()) {
                                    bitmapCreateBitmap.recycle();
                                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                                    return null;
                                }
                            }
                            return bitmapCreateBitmap;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
                            if (logger2 != null) {
                                LogLevel logLevel2 = LogLevel.LEVEL_ERROR;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("NLEVEPublic2: getCurrDisplayImage createBitmap failed! ");
                                sbLIZ2.append(th.getMessage());
                                logger2.onLog(logLevel2, C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            return null;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int getHighLightResult(VecLongLong vecLongLong) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            return nLEMediaRuntimeControllerLIZJ.getHighLightResult(vecLongLong);
        }
        return 0;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final MapStrInt getHighLightResultByPts(int i) {
        MapStrInt highLightResultByPts;
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ == null || (highLightResultByPts = nLEMediaRuntimeControllerLIZJ.getHighLightResultByPts(i)) == null) {
            return new MapStrInt();
        }
        return highLightResultByPts;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final String getMetadata(String str) {
        String metadata;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    metadata = nLEMediaRuntimeControllerLIZJ.getMetadata(str);
                } else {
                    metadata = null;
                }
                if (metadata == null) {
                    metadata = "";
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return metadata;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int lockSeekVideoClip(String str) {
        int iLockSeekVideoClip;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    iLockSeekVideoClip = nLEMediaRuntimeControllerLIZJ.lockSeekVideoClip(str);
                } else {
                    iLockSeekVideoClip = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLockSeekVideoClip;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final double mapTimeEffectPositionToOriginalPosition(double d) {
        double dMapTimeEffectPositionToOriginalPosition;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    dMapTimeEffectPositionToOriginalPosition = nLEMediaRuntimeControllerLIZJ.mapTimeEffectPositionToOriginalPosition(d);
                } else {
                    dMapTimeEffectPositionToOriginalPosition = 0.0d;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return dMapTimeEffectPositionToOriginalPosition;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void setBackgroundColor(int i) {
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    nLEMediaRuntimeControllerLIZJ.setBackgroundColor(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void setCanvasColor(String str) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            nLEMediaRuntimeControllerLIZJ.setCanvasColor(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oCd] */
    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void setCompileTargetFileInfoPredictListener(final INLEListenerCompileTargetFileInfoPredict iNLEListenerCompileTargetFileInfoPredict) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ;
        if (iNLEListenerCompileTargetFileInfoPredict != null) {
            this.LJIIIZ = new NLEListenerCompileTargetFileInfoPredictWrapper() { // from class: X.0oCd
                @Override // com.bytedance.ies.nle.editor_jni.NLEListenerCompileTargetFileInfoPredictWrapper
                public final void onCompileTargetFileInfoPredict(long j, long j2, boolean z, boolean z2) {
                    iNLEListenerCompileTargetFileInfoPredict.onCompileTargetFileInfoPredict(j, j2, z, z2);
                }
            };
        }
        C1464090oCd c1464090oCd = this.LJIIIZ;
        if (c1464090oCd != null && (nLEMediaRuntimeControllerLIZJ = LIZJ()) != null) {
            nLEMediaRuntimeControllerLIZJ.setOnCompileTargetFileInfoPredictListener(c1464090oCd);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void setEncoderByteBufferListener(final INLEListenerByteBufferEncoder iNLEListenerByteBufferEncoder) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ;
        synchronized (this.LJ) {
            try {
                if (LIZJ() == null) {
                    return;
                }
                if (iNLEListenerByteBufferEncoder != null) {
                    NLEEncodeListenerWrapper nLEEncodeListenerWrapper = new NLEEncodeListenerWrapper() { // from class: X.0oCa
                        @Override // com.bytedance.ies.nle.editor_jni.NLEEncodeListenerWrapper
                        public final void onCompressBuffer(Object obj, long j, int i, boolean z) {
                            ByteBuffer byteBuffer;
                            if ((obj instanceof ByteBuffer) && (byteBuffer = (ByteBuffer) obj) != null) {
                                iNLEListenerByteBufferEncoder.onEncoderDataAvailable(byteBuffer, j, i, z);
                            }
                        }
                    };
                    nLEEncodeListenerWrapper.setEnableByteBuffer(true);
                    this.LJIIIIZZ = nLEEncodeListenerWrapper;
                }
                NLEEncodeListenerWrapper nLEEncodeListenerWrapper2 = this.LJIIIIZZ;
                if (nLEEncodeListenerWrapper2 != null && (nLEMediaRuntimeControllerLIZJ = LIZJ()) != null) {
                    nLEMediaRuntimeControllerLIZJ.setEncoderListener(nLEEncodeListenerWrapper2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void setEncoderListener(final INLEListenerEncoder iNLEListenerEncoder) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ;
        synchronized (this.LJ) {
            try {
                if (LIZJ() == null) {
                    return;
                }
                if (iNLEListenerEncoder != null) {
                    this.LJIIIIZZ = new NLEEncodeListenerWrapper() { // from class: X.0oCZ
                        @Override // com.bytedance.ies.nle.editor_jni.NLEEncodeListenerWrapper
                        public final void onCompressBuffer(byte[] bArr, long j, int i, boolean z) {
                            iNLEListenerEncoder.onEncoderDataAvailable(bArr, j, i, z);
                        }
                    };
                }
                NLEEncodeListenerWrapper nLEEncodeListenerWrapper = this.LJIIIIZZ;
                if (nLEEncodeListenerWrapper != null && (nLEMediaRuntimeControllerLIZJ = LIZJ()) != null) {
                    nLEMediaRuntimeControllerLIZJ.setEncoderListener(nLEEncodeListenerWrapper);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int setHeightWidthRatio(float f) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            return nLEMediaRuntimeControllerLIZJ.setHeightWidthRatio(f);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int setMetadata(MapStrStr mapStrStr) {
        int metadata;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    metadata = nLEMediaRuntimeControllerLIZJ.setMetadata(mapStrStr);
                } else {
                    metadata = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return metadata;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void setPlayFps(float f) {
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    nLEMediaRuntimeControllerLIZJ.setPlayFps(f);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final NLEError setPreviewFillMode(NLEPlayerPreviewMode nLEPlayerPreviewMode) {
        NLEError previewFillMode;
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ == null || (previewFillMode = nLEMediaRuntimeControllerLIZJ.setPreviewFillMode(nLEPlayerPreviewMode)) == null) {
            return NLEError.OPERATION_ILLEGAL;
        }
        return previewFillMode;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void setPreviewOffScreen(boolean z) {
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    nLEMediaRuntimeControllerLIZJ.setPreviewOffScreen(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int setPreviewSurfaceImage(Bitmap bitmap) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ;
        if (bitmap == null || (nLEMediaRuntimeControllerLIZJ = LIZJ()) == null) {
            return -1;
        }
        return nLEMediaRuntimeControllerLIZJ.setPreviewSurfaceImage(bitmap, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int setPreviewSurfaceTexDesc(String str) {
        int previewSurfaceTexDesc;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    previewSurfaceTexDesc = nLEMediaRuntimeControllerLIZJ.setPreviewSurfaceTexDesc(str);
                } else {
                    previewSurfaceTexDesc = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return previewSurfaceTexDesc;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    @InterfaceC1294060jmO
    public final void setSurfaceStatusListener(INLEListenerSurfaceStatus iNLEListenerSurfaceStatus) {
        C389960FQs c389960FQs = this.LJI;
        if (c389960FQs != null) {
            c389960FQs.LJJ = iNLEListenerSurfaceStatus;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void addAndroidImageHolder(String str, Bitmap bitmap) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            nLEMediaRuntimeControllerLIZJ.addAndroidImageHolder(str, bitmap);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int addMetadata(String str, String str2) {
        int iAddMetadata;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    iAddMetadata = nLEMediaRuntimeControllerLIZJ.addMetadata(str, str2);
                } else {
                    iAddMetadata = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iAddMetadata;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final String getFileInfo(String str, String str2) {
        String fileInfo;
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ == null || (fileInfo = nLEMediaRuntimeControllerLIZJ.getFileInfo(str, str2)) == null) {
            return "";
        }
        return fileInfo;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final PairIntInt getInitSize(int i, int i2) {
        PairIntInt pairIntInt;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ == null || (pairIntInt = nLEMediaRuntimeControllerLIZJ.getInitSize(i, i2)) == null) {
                    pairIntInt = new PairIntInt();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return pairIntInt;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final String getKeyFrameParam(String str, long j) {
        String keyFrameParam;
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ == null || (keyFrameParam = nLEMediaRuntimeControllerLIZJ.getKeyFrameParam(str, j)) == null) {
            return "";
        }
        return keyFrameParam;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final double mapOriginalPositionToTimeEffectPosition(double d, int i) {
        double dMapOriginalPositionToTimeEffectPosition;
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    dMapOriginalPositionToTimeEffectPosition = nLEMediaRuntimeControllerLIZJ.mapOriginalPositionToTimeEffectPosition(d, i);
                } else {
                    dMapOriginalPositionToTimeEffectPosition = 0.0d;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return dMapOriginalPositionToTimeEffectPosition;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int setCanvasMinDuration(long j, boolean z) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            return nLEMediaRuntimeControllerLIZJ.setCanvasMinDuration(j, z);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void setCanvasSize(int i, int i2) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            nLEMediaRuntimeControllerLIZJ.setCanvasSize(i, i2);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int setMaxWidthAndHeight(long j, long j2) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            return nLEMediaRuntimeControllerLIZJ.setMaxWidthAndHeight(j, j2);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int setPreviewSurfaceImage(Bitmap bitmap, boolean z) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ;
        if (bitmap == null || (nLEMediaRuntimeControllerLIZJ = LIZJ()) == null) {
            return -1;
        }
        return nLEMediaRuntimeControllerLIZJ.setPreviewSurfaceImage(bitmap, z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int setPreviewSurfaceTexDesc(String str, Boolean bool) {
        int previewSurfaceTexDesc;
        boolean zBooleanValue = bool.booleanValue();
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    previewSurfaceTexDesc = nLEMediaRuntimeControllerLIZJ.setPreviewSurfaceTexDesc(str, zBooleanValue);
                } else {
                    previewSurfaceTexDesc = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return previewSurfaceTexDesc;
    }

    public C1463950oCP(C1464240oCs c1464240oCs, NLEMediaConfig nLEMediaConfig, C389960FQs c389960FQs) {
        super(c1464240oCs);
        this.LJ = c1464240oCs;
        this.LJFF = nLEMediaConfig;
        this.LJI = c389960FQs;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final Bitmap getCurrDecodeImage(String str, int i, int i2) {
        Integer numValueOf;
        PairIntInt canvasSize = getCanvasSize();
        if (canvasSize.getFirst() != 0 && canvasSize.getSecond() != 0) {
            if (i <= 0 || i2 <= 0) {
                i = canvasSize.getFirst();
                i2 = canvasSize.getSecond();
            }
            if (i % 2 == 1) {
                i++;
            }
            if (i2 % 2 == 1) {
                i2++;
            }
            if (i != 0 && i2 != 0) {
                synchronized (this.LJ) {
                    try {
                        try {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            if (bitmapCreateBitmap == null) {
                                return null;
                            }
                            NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                            if (nLEMediaRuntimeControllerLIZJ != null) {
                                numValueOf = Integer.valueOf(nLEMediaRuntimeControllerLIZJ.getCurrDecodeImage(bitmapCreateBitmap, str));
                            } else {
                                numValueOf = null;
                            }
                            int iSwigValue = NLEError.SUCCESS.swigValue();
                            if (numValueOf == null || numValueOf.intValue() != iSwigValue) {
                                NLELoggerListener logger = NLE.INSTANCE.getLogger();
                                if (logger != null) {
                                    LogLevel logLevel = LogLevel.LEVEL_ERROR;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("NLEVEPublic2: getCurrDecodeImage getDisplayImage failed! ");
                                    sbLIZ.append(numValueOf);
                                    logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                                }
                                if (!bitmapCreateBitmap.isRecycled()) {
                                    bitmapCreateBitmap.recycle();
                                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                                    return null;
                                }
                            }
                            return bitmapCreateBitmap;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
                            if (logger2 != null) {
                                LogLevel logLevel2 = LogLevel.LEVEL_ERROR;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("NLEVEPublic2: getCurrDecodeImage createBitmap failed! ");
                                sbLIZ2.append(th.getMessage());
                                logger2.onLog(logLevel2, C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            return null;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void setMagnifierDisplayState(float f, float f2, float f3) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            nLEMediaRuntimeControllerLIZJ.setMagnifierDisplayState(f, f2, f3);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final String preprocessI2V(String str, String str2, long j, int i) {
        String strPreprocessI2V;
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ == null || (strPreprocessI2V = nLEMediaRuntimeControllerLIZJ.preprocessI2V(str, str2, j, i)) == null) {
            return "";
        }
        return strPreprocessI2V;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int sendEffectMsg(int i, long j, long j2, String str) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            return nLEMediaRuntimeControllerLIZJ.sendEffectMsg(i, (int) j, (int) j2, str);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void setDisplayPos(int i, int i2, int i3, int i4) {
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ != null) {
                    nLEMediaRuntimeControllerLIZJ.setDisplayPos(i, i2, i3, i4);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0FRE, com.bytedance.ies.nle.editor_jni.NLEListenerGetImageWrapper] */
    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final int getImages(VecLongLong vecLongLong, int i, int i2, NLE_GET_FRAME_FLAGS nle_get_frame_flags, final INLEListenerGetImage iNLEListenerGetImage) {
        synchronized (this.LJ) {
            try {
                NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
                if (nLEMediaRuntimeControllerLIZJ == 0) {
                    return -1;
                }
                final C013C c013c = new C013C();
                c013c.element = this.LJFF.getEnableCatchExceptionInCallback();
                ?? r8 = new NLEListenerGetImageWrapper() { // from class: X.0FRE
                    public final int LIZ(byte[] bArr, int i3, int i4, int i5, final float f) {
                        if (bArr != null) {
                            INLEListenerGetImage iNLEListenerGetImage2 = iNLEListenerGetImage;
                            if (iNLEListenerGetImage2 == null) {
                                return 0;
                            }
                            return iNLEListenerGetImage2.onGetImageData(bArr, i3, i4, i5, f);
                        }
                        Handler handlerLIZ = this.LIZ();
                        final INLEListenerGetImage iNLEListenerGetImage3 = iNLEListenerGetImage;
                        final C1463950oCP c1463950oCP = this;
                        C786410Ut5.LJJZZIII(handlerLIZ, new Runnable() { // from class: X.0FRF
                            @Override // java.lang.Runnable
                            public final void run() {
                                INLEListenerGetImage iNLEListenerGetImage4 = iNLEListenerGetImage3;
                                float f2 = f;
                                C1463950oCP c1463950oCP2 = c1463950oCP;
                                C1C7U.LIZ("NLEMediaRuntimeImplPublic$getImages$1$1@89c3.realCallback$1L");
                                if (iNLEListenerGetImage4 != null) {
                                    iNLEListenerGetImage4.onGetImageData(null, -1, -1, -1, f2);
                                }
                                c1463950oCP2.LJII = null;
                                C1C7U.LIZIZ("NLEMediaRuntimeImplPublic$getImages$1$1@89c3.realCallback$1L");
                            }
                        });
                        return 0;
                    }

                    @Override // com.bytedance.ies.nle.editor_jni.NLEListenerGetImageWrapper
                    public final int onGetImageDataCalled(byte[] bArr, int i3, int i4, int i5, float f) {
                        if (c013c.element) {
                            try {
                                return LIZ(bArr, i3, i4, i5, f);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                String strLIZJ = C14LJ.LIZJ(th);
                                NLELoggerListener logger = NLE.INSTANCE.getLogger();
                                if (logger != null) {
                                    LogLevel logLevel = LogLevel.LEVEL_ERROR;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("NLEVEPublic2: getImages onGetImageDataCalled exception! errorMsg: ");
                                    sbLIZ.append(th.getMessage());
                                    sbLIZ.append(" stack: ");
                                    sbLIZ.append(strLIZJ);
                                    logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                                    return 0;
                                }
                                return 0;
                            }
                        }
                        return LIZ(bArr, i3, i4, i5, f);
                    }
                };
                this.LJII = r8;
                return nLEMediaRuntimeControllerLIZJ.getImages(vecLongLong, i, i2, nle_get_frame_flags, r8);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaRuntime
    public final void setDisplayState(float f, float f2, float f3, int i, int i2) {
        NLEMediaRuntimeController nLEMediaRuntimeControllerLIZJ = LIZJ();
        if (nLEMediaRuntimeControllerLIZJ != null) {
            nLEMediaRuntimeControllerLIZJ.setDisplayState(f, f2, f3, i, i2);
        }
    }
}
