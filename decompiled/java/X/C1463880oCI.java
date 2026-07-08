package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.NLEMediaSettingsController;
import com.bytedance.ies.nle.editor_jni.NLEResFillMode;
import com.bytedance.ies.nle.editor_jni.NLEResizeAlgorithm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oCI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463880oCI extends C0FRA implements INLEMediaSettings {
    public final NLEMediaSettingsController LIZJ() {
        C1464240oCs c1464240oCs = this.LIZ;
        if (c1464240oCs.LIZ == null || c1464240oCs.LIZLLL.get()) {
            return null;
        }
        return (NLEMediaSettingsController) c1464240oCs.LJIILIIL.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final int getPageMode() {
        int pageMode;
        synchronized (this.LIZ) {
            try {
                NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
                pageMode = nLEMediaSettingsControllerLIZJ != null ? nLEMediaSettingsControllerLIZJ.getPageMode() : -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return pageMode;
    }

    public C1463880oCI(C1464240oCs c1464240oCs) {
        super(c1464240oCs);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final int enableEffect(boolean z) {
        NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
        if (nLEMediaSettingsControllerLIZJ != null) {
            return nLEMediaSettingsControllerLIZJ.enableEffect(z);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void enableHighSpeedForSingle(boolean z) {
        NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
        if (nLEMediaSettingsControllerLIZJ != null) {
            nLEMediaSettingsControllerLIZJ.enableHighSpeedForSingle(z);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void enableImageEditor(boolean z) {
        NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
        if (nLEMediaSettingsControllerLIZJ != null) {
            nLEMediaSettingsControllerLIZJ.enableImageEditor(z);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void enableSimpleProcessor(boolean z) {
        synchronized (this.LIZ) {
            try {
                NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
                if (nLEMediaSettingsControllerLIZJ != null) {
                    nLEMediaSettingsControllerLIZJ.enableSimpleProcessor(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void setAutoPrepare(boolean z) {
        synchronized (this.LIZ) {
            try {
                NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
                if (nLEMediaSettingsControllerLIZJ != null) {
                    nLEMediaSettingsControllerLIZJ.setAutoPrepare(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final int setDestroyVersion(boolean z) {
        NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
        if (nLEMediaSettingsControllerLIZJ != null) {
            return nLEMediaSettingsControllerLIZJ.setDestroyVersion(z);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void setDldEnabled(boolean z) {
        synchronized (this.LIZ) {
            try {
                NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
                if (nLEMediaSettingsControllerLIZJ != null) {
                    nLEMediaSettingsControllerLIZJ.setDldEnabled(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void setDldThrVal(int i) {
        synchronized (this.LIZ) {
            try {
                NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
                if (nLEMediaSettingsControllerLIZJ != null) {
                    nLEMediaSettingsControllerLIZJ.setDldThrVal(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void setDleEnabled(boolean z) {
        synchronized (this.LIZ) {
            try {
                NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
                if (nLEMediaSettingsControllerLIZJ != null) {
                    nLEMediaSettingsControllerLIZJ.setDleEnabled(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void setDleEnabledPreview(boolean z) {
        synchronized (this.LIZ) {
            try {
                NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
                if (nLEMediaSettingsControllerLIZJ != null) {
                    nLEMediaSettingsControllerLIZJ.setDleEnabledPreview(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void setForceDetectForFirstFrameByClip(boolean z) {
        NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
        if (nLEMediaSettingsControllerLIZJ != null) {
            nLEMediaSettingsControllerLIZJ.setForceDetectForFirstFrameByClip(z);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void setLoopPlay(boolean z) {
        NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
        if (nLEMediaSettingsControllerLIZJ != null) {
            nLEMediaSettingsControllerLIZJ.setLoopPlay(z);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void setPageMode(int i) {
        synchronized (this.LIZ) {
            try {
                NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
                if (nLEMediaSettingsControllerLIZJ != null) {
                    nLEMediaSettingsControllerLIZJ.setPageMode(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final int setPreviewFps(int i) {
        NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
        if (nLEMediaSettingsControllerLIZJ != null) {
            return nLEMediaSettingsControllerLIZJ.setPreviewFps(i);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final int setPreviewMaxFps(int i) {
        NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
        if (nLEMediaSettingsControllerLIZJ != null) {
            return nLEMediaSettingsControllerLIZJ.setPreviewMaxFps(i);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final int setSrcMaxHWRatio(float f) {
        int srcMaxHWRatio;
        synchronized (this.LIZ) {
            try {
                NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
                if (nLEMediaSettingsControllerLIZJ != null) {
                    srcMaxHWRatio = nLEMediaSettingsControllerLIZJ.setSrcMaxHWRatio(f);
                } else {
                    srcMaxHWRatio = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return srcMaxHWRatio;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void setSurfaceReDraw(boolean z) {
        synchronized (this.LIZ) {
            try {
                NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
                if (nLEMediaSettingsControllerLIZJ != null) {
                    nLEMediaSettingsControllerLIZJ.setSurfaceReDraw(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final int setPreviewFps(int i, boolean z) {
        NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
        if (nLEMediaSettingsControllerLIZJ != null) {
            return nLEMediaSettingsControllerLIZJ.setPreviewFps(i, z);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final int setDropFrameParam(boolean z, long j, int i) {
        int dropFrameParam;
        synchronized (this.LIZ) {
            try {
                NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
                if (nLEMediaSettingsControllerLIZJ != null) {
                    dropFrameParam = nLEMediaSettingsControllerLIZJ.setDropFrameParam(z, j, i);
                } else {
                    dropFrameParam = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return dropFrameParam;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSettings
    public final void setImageResizeInfo(int i, int i2, NLEResFillMode nLEResFillMode, NLEResizeAlgorithm nLEResizeAlgorithm) {
        synchronized (this.LIZ) {
            try {
                NLEMediaSettingsController nLEMediaSettingsControllerLIZJ = LIZJ();
                if (nLEMediaSettingsControllerLIZJ != null) {
                    nLEMediaSettingsControllerLIZJ.setImageResizeInfo(i, i2, nLEResFillMode, nLEResizeAlgorithm);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
