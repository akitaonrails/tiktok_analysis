package X;

import Y.ARunnableS7S0100001_22;
import com.bytedance.ies.nle.editor_jni.INLEExporter;
import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.KeyframeType;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEAudioCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLECompileResult;
import com.bytedance.ies.nle.editor_jni.NLEExporterController;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0oCE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463840oCE extends C0FRA implements INLEExporter {
    public final NLEMediaConfig LJ;
    public INLEListenerCompile LJFF;
    public C0FRD LJI;
    public C1463830oCD LJII;
    public boolean LJIIIIZZ;

    public final NLEExporterController LIZJ() {
        C1464240oCs c1464240oCs = this.LIZ;
        if (c1464240oCs.LIZ == null) {
            return null;
        }
        return (NLEExporterController) c1464240oCs.LJI.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final int cancelCompile() {
        int iCancelCompile;
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                iCancelCompile = nLEExporterControllerLIZJ != null ? nLEExporterControllerLIZJ.cancelCompile() : -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iCancelCompile;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final int destroyCompiler() {
        int iDestroyCompiler;
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                iDestroyCompiler = nLEExporterControllerLIZJ != null ? nLEExporterControllerLIZJ.destroyCompiler() : -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iDestroyCompiler;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final NLECompileResult getCompileResult() {
        NLECompileResult compileResult;
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                compileResult = nLEExporterControllerLIZJ != null ? nLEExporterControllerLIZJ.getCompileResult() : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return compileResult;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final String getCompileStuckResult() {
        String compileStuckResult;
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                compileStuckResult = nLEExporterControllerLIZJ != null ? nLEExporterControllerLIZJ.getCompileStuckResult() : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return compileStuckResult;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final void pauseCompile() {
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                if (nLEExporterControllerLIZJ != null) {
                    nLEExporterControllerLIZJ.pauseCompile();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final void resumeCompile() {
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                if (nLEExporterControllerLIZJ != null) {
                    nLEExporterControllerLIZJ.resumeCompile();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final String getAudioMatrixResult() {
        String audioMatrixResult;
        NLEExporterController nLEExporterControllerLIZJ = LIZJ();
        return (nLEExporterControllerLIZJ == null || (audioMatrixResult = nLEExporterControllerLIZJ.getAudioMatrixResult()) == null) ? "" : audioMatrixResult;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final VecString getDenoiseSnrResults() {
        VecString denoiseSnrResults;
        NLEExporterController nLEExporterControllerLIZJ = LIZJ();
        return (nLEExporterControllerLIZJ == null || (denoiseSnrResults = nLEExporterControllerLIZJ.getDenoiseSnrResults()) == null) ? new VecString() : denoiseSnrResults;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final int isWatermarkCompileEncode() {
        NLEExporterController nLEExporterControllerLIZJ = LIZJ();
        if (nLEExporterControllerLIZJ != null) {
            return nLEExporterControllerLIZJ.isWatermarkCompileEncode();
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final void releaseNLEResources() {
        LIZIZ();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0oCD, java.lang.Object] */
    public final void LIZLLL(INLEListenerCompile iNLEListenerCompile) {
        if (iNLEListenerCompile != null) {
            this.LJFF = iNLEListenerCompile;
            int iIdentityHashCode = System.identityHashCode(iNLEListenerCompile);
            NLELoggerListener logger = NLE.INSTANCE.getLogger();
            if (logger != null) {
                LogLevel logLevel = LogLevel.LEVEL_INFO;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set internalCompileListener address ");
                sbLIZ.append(iIdentityHashCode);
                logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
            }
            synchronized (this) {
                if (this.LJII == null) {
                    if (this.LJI == null) {
                        C0FRD c0frd = new C0FRD(this.LJ.getEnableCatchExceptionInCallback());
                        NLEPlayer nLEPlayerLIZIZ = this.LIZ.LIZIZ();
                        if (nLEPlayerLIZIZ != null) {
                            nLEPlayerLIZIZ.addMessageListener(c0frd);
                        }
                        this.LJI = c0frd;
                    }
                    ?? r1 = new C0FRG() { // from class: X.0oCD
                        @Override // X.C0FRG
                        public final void onKeyFrameProcess(String str, long j, String str2, KeyframeType keyframeType) {
                        }

                        @Override // X.C0FRG
                        public final void LIZ(final int i, final int i2, final float f, final String str) {
                            C1463840oCE c1463840oCE = this.LIZ;
                            final INLEListenerCompile iNLEListenerCompile2 = c1463840oCE.LJFF;
                            if (iNLEListenerCompile2 != null) {
                                C786410Ut5.LJJZZIII(c1463840oCE.LIZ(), new Runnable() { // from class: X.0nq4
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        INLEListenerCompile iNLEListenerCompile3 = iNLEListenerCompile2;
                                        int i3 = i;
                                        int i4 = i2;
                                        float f2 = f;
                                        String str2 = str;
                                        C1C7U.LIZ("NLEExporterImplPublic$innerSetInfoListener$1@3196.onErrorCallback$1L");
                                        iNLEListenerCompile3.onCompileError(i3, i4, f2, str2);
                                        C1C7U.LIZIZ("NLEExporterImplPublic$innerSetInfoListener$1@3196.onErrorCallback$1L");
                                    }
                                });
                            }
                        }

                        /* JADX WARN: Type inference failed for: r0v6, types: [T, com.bytedance.ies.nle.editor_jni.INLEListenerCompile] */
                        @Override // X.C0FRG
                        public final void LIZIZ(int i, final int i2, float f, final String str) {
                            C1463840oCE c1463840oCE;
                            INLEListenerCompile iNLEListenerCompile2;
                            if (i != 4103) {
                                if (i == 4105 && (iNLEListenerCompile2 = (c1463840oCE = this.LIZ).LJFF) != null) {
                                    C786410Ut5.LJJZZIII(c1463840oCE.LIZ(), new ARunnableS7S0100001_22(f, iNLEListenerCompile2, 3));
                                    return;
                                }
                                return;
                            }
                            INLEListenerCompile iNLEListenerCompile3 = this.LIZ.LJFF;
                            if (iNLEListenerCompile3 == null) {
                                NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
                                if (logger2 != null) {
                                    logger2.onLog(LogLevel.LEVEL_ERROR, "internalCompileListener null");
                                }
                            } else {
                                int iIdentityHashCode2 = System.identityHashCode(iNLEListenerCompile3);
                                NLELoggerListener logger3 = NLE.INSTANCE.getLogger();
                                if (logger3 != null) {
                                    LogLevel logLevel2 = LogLevel.LEVEL_INFO;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("internalCompileListener address ");
                                    sbLIZ2.append(iIdentityHashCode2);
                                    logger3.onLog(logLevel2, C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                            final C1463840oCE c1463840oCE2 = this.LIZ;
                            ?? r0 = c1463840oCE2.LJFF;
                            if (r0 == 0) {
                                return;
                            }
                            final C259800zU c259800zU = new C259800zU();
                            c259800zU.element = r0;
                            C786410Ut5.LJJZZIII(c1463840oCE2.LIZ(), new Runnable() { // from class: X.0oCC
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1463840oCE c1463840oCE3 = c1463840oCE2;
                                    int i3 = i2;
                                    C259800zU c259800zU2 = c259800zU;
                                    String str2 = str;
                                    C1C7U.LIZ("NLEExporterImplPublic$innerSetInfoListener$1@3196.onInfoCallback$1L");
                                    if (c1463840oCE3.LJIIIIZZ) {
                                        c1463840oCE3.LJFF = null;
                                    }
                                    if (i3 < 0) {
                                        INLEListenerCompile iNLEListenerCompile4 = (INLEListenerCompile) c259800zU2.element;
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        iNLEListenerCompile4.onCompileError(i3, i3, 0.0f, str2);
                                    } else {
                                        ((INLEListenerCompile) c259800zU2.element).onCompileDone();
                                    }
                                    if (!c1463840oCE3.LJIIIIZZ) {
                                        c1463840oCE3.LJFF = null;
                                    }
                                    C1C7U.LIZIZ("NLEExporterImplPublic$innerSetInfoListener$1@3196.onInfoCallback$1L");
                                }
                            });
                        }
                    };
                    C0FRD c0frd2 = this.LJI;
                    if (c0frd2 != null) {
                        ((ArrayList) c0frd2.LIZIZ).add(r1);
                    }
                    this.LJII = r1;
                }
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final int getCompileLevel(NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        int compileLevel = -1;
        if (nLEVideoEncodeSettings == null) {
            return -1;
        }
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                if (nLEExporterControllerLIZJ != null) {
                    compileLevel = nLEExporterControllerLIZJ.getCompileLevel(nLEVideoEncodeSettings);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return compileLevel;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final int getRemuxErrorCode(NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        int remuxErrorCode = -1;
        if (nLEVideoEncodeSettings == null) {
            return -1;
        }
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                if (nLEExporterControllerLIZJ != null) {
                    remuxErrorCode = nLEExporterControllerLIZJ.getRemuxErrorCode(nLEVideoEncodeSettings);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return remuxErrorCode;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final boolean isEnableRemuxVideo(NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        boolean zIsEnableRemuxVideo;
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                if (nLEExporterControllerLIZJ != null) {
                    zIsEnableRemuxVideo = nLEExporterControllerLIZJ.isEnableRemuxVideo(nLEVideoEncodeSettings);
                } else {
                    zIsEnableRemuxVideo = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zIsEnableRemuxVideo;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final void setCompileDumpFilePath(String str) {
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                if (nLEExporterControllerLIZJ != null) {
                    nLEExporterControllerLIZJ.setCompileDumpFilePath(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final void setDownloadNetSpeed(int i) {
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                if (nLEExporterControllerLIZJ != null) {
                    nLEExporterControllerLIZJ.setDownloadNetSpeed(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final /* bridge */ /* synthetic */ void setOptimizeListenerRelease(Boolean bool) {
        this.LJIIIIZZ = bool.booleanValue();
    }

    public C1463840oCE(C1464240oCs c1464240oCs, NLEMediaConfig nLEMediaConfig) {
        super(c1464240oCs);
        this.LJ = nLEMediaConfig;
        this.LJIIIIZZ = true;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final boolean compile(String str, NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        boolean zCompile;
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                if (nLEExporterControllerLIZJ != null) {
                    zCompile = nLEExporterControllerLIZJ.compile(str, nLEVideoEncodeSettings);
                } else {
                    zCompile = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zCompile;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final void setSmartRecodeParam(boolean z, int i) {
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                if (nLEExporterControllerLIZJ != null) {
                    nLEExporterControllerLIZJ.setSmartRecodeParam(z, i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final boolean compile(String str, String str2, NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        boolean zCompile;
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                if (nLEExporterControllerLIZJ != null) {
                    zCompile = nLEExporterControllerLIZJ.compile(str, str2, nLEVideoEncodeSettings);
                } else {
                    zCompile = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zCompile;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final boolean compileOnlyAudio(String str, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings, INLEListenerCompile iNLEListenerCompile) {
        boolean zCompileOnlyAudio;
        LIZLLL(iNLEListenerCompile);
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                if (nLEExporterControllerLIZJ != null) {
                    zCompileOnlyAudio = nLEExporterControllerLIZJ.compileOnlyAudio(str, nLEAudioCompileEncodeSettings);
                } else {
                    zCompileOnlyAudio = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zCompileOnlyAudio;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final boolean compile(String str, NLEVideoEncodeSettings nLEVideoEncodeSettings, INLEListenerCompile iNLEListenerCompile) {
        LIZLLL(iNLEListenerCompile);
        NLEExporterController nLEExporterControllerLIZJ = LIZJ();
        if (nLEExporterControllerLIZJ != null) {
            return nLEExporterControllerLIZJ.compile(str, nLEVideoEncodeSettings);
        }
        return false;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEExporter
    public final boolean compile(String str, String str2, NLEVideoEncodeSettings nLEVideoEncodeSettings, INLEListenerCompile iNLEListenerCompile) {
        boolean zCompile;
        LIZLLL(iNLEListenerCompile);
        synchronized (this.LIZ) {
            try {
                NLEExporterController nLEExporterControllerLIZJ = LIZJ();
                if (nLEExporterControllerLIZJ != null) {
                    zCompile = nLEExporterControllerLIZJ.compile(str, str2, nLEVideoEncodeSettings);
                } else {
                    zCompile = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zCompile;
    }
}
