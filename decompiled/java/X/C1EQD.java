package X;

import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.INLEBrushRuntime;
import com.bytedance.ies.nle.editor_jni.INLEBrushSaveCallback;
import com.bytedance.ies.nle.editor_jni.INLEBrushStateCallback;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEBrushRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEBrushSaveCallbackWrapper;
import com.bytedance.ies.nle.editor_jni.NLEBrushStateCallbackWrapper;
import com.bytedance.ies.nle.editor_jni.NLEBrushStickerState;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLERectF;
import com.bytedance.ies.nleeditor.NLE;

/* JADX INFO: renamed from: X.1EQD, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EQD extends C0FRA implements INLEBrushRuntime {
    public NLEBrushSaveCallbackWrapper LJ;
    public C1EQE LJFF;

    public final NLEBrushRuntimeController LIZJ() {
        C1464240oCs c1464240oCs = this.LIZ;
        if (c1464240oCs.LIZ == null || c1464240oCs.LIZLLL.get()) {
            return null;
        }
        return (NLEBrushRuntimeController) c1464240oCs.LJIIIZ.getValue();
    }

    public C1EQD(C1464240oCs c1464240oCs) {
        super(c1464240oCs);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int begin2DBrush(String str) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ != null) {
            return nLEBrushRuntimeControllerLIZJ.begin2DBrush(str);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int clear2DBrush(String str) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ != null) {
            return nLEBrushRuntimeControllerLIZJ.clear2DBrush(str);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int end2DBrush(String str) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ != null) {
            return nLEBrushRuntimeControllerLIZJ.end2DBrush(str);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int redo2DBrush(String str) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ != null) {
            return nLEBrushRuntimeControllerLIZJ.redo2DBrush(str);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int reverse2DBrush(String str) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ != null) {
            return nLEBrushRuntimeControllerLIZJ.reverse2DBrush(str);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int undo2DBrush(String str) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ != null) {
            return nLEBrushRuntimeControllerLIZJ.undo2DBrush(str);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final NLEBrushStickerState getBrushStickerOutState(String str, boolean z) {
        NLEBrushStickerState brushStickerOutState;
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ == null || (brushStickerOutState = nLEBrushRuntimeControllerLIZJ.getBrushStickerOutState(str, z)) == null) {
            return new NLEBrushStickerState();
        }
        return brushStickerOutState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1EQE, com.bytedance.ies.nle.editor_jni.NLEBrushStateCallbackWrapper] */
    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int setBrushStickerOutStateCallback(String str, final INLEBrushStateCallback iNLEBrushStateCallback) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ == 0) {
            return -1;
        }
        if (str == null) {
            NLELoggerListener logger = NLE.INSTANCE.getLogger();
            if (logger != null) {
                logger.onLog(LogLevel.LEVEL_ERROR, "setBrushStickerOutStateCallback fail: uuid is null");
                return -2;
            }
            return -2;
        }
        ?? r0 = new NLEBrushStateCallbackWrapper() { // from class: X.1EQE
            @Override // com.bytedance.ies.nle.editor_jni.NLEBrushStateCallbackWrapper
            public final void onStateChange(NLEBrushStickerState nLEBrushStickerState) {
                iNLEBrushStateCallback.onStateChange(nLEBrushStickerState);
            }
        };
        this.LJFF = r0;
        return nLEBrushRuntimeControllerLIZJ.setBrushStickerOutStateCallback(str, r0);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int addBrushStickerStroke(String str, Bitmap bitmap, NLERectF nLERectF) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ != null) {
            return nLEBrushRuntimeControllerLIZJ.addBrushStickerStroke(str, bitmap, nLERectF);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int saveBrushStickerContext(String str, String str2, final INLEBrushSaveCallback iNLEBrushSaveCallback) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ == null) {
            return -1;
        }
        if (str != null && str2 != null) {
            if (iNLEBrushSaveCallback != null) {
                this.LJ = new NLEBrushSaveCallbackWrapper() { // from class: X.1EQF
                    @Override // com.bytedance.ies.nle.editor_jni.NLEBrushSaveCallbackWrapper
                    public final void onDone(String str3, boolean z) {
                        iNLEBrushSaveCallback.onDone(str3, z);
                    }
                };
            }
            return nLEBrushRuntimeControllerLIZJ.saveBrushStickerContext(str, str2, this.LJ);
        }
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_ERROR, "saveBrushStickerContext fail: uuid or draftPath is null");
            return -2;
        }
        return -2;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int saveStickerBrushMask(String str, String str2, final INLEBrushSaveCallback iNLEBrushSaveCallback) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ == null) {
            return -1;
        }
        if (iNLEBrushSaveCallback != null) {
            this.LJ = new NLEBrushSaveCallbackWrapper() { // from class: X.1EQG
                @Override // com.bytedance.ies.nle.editor_jni.NLEBrushSaveCallbackWrapper
                public final void onDone(String str3, boolean z) {
                    iNLEBrushSaveCallback.onDone(str3, z);
                }
            };
        }
        return nLEBrushRuntimeControllerLIZJ.saveStickerBrushMask(str, str2, this.LJ);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int saveStickerBrushToPng(String str, String str2, final INLEBrushSaveCallback iNLEBrushSaveCallback) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ == null) {
            return -1;
        }
        if (iNLEBrushSaveCallback != null) {
            this.LJ = new NLEBrushSaveCallbackWrapper() { // from class: X.1EQH
                @Override // com.bytedance.ies.nle.editor_jni.NLEBrushSaveCallbackWrapper
                public final void onDone(String str3, boolean z) {
                    iNLEBrushSaveCallback.onDone(str3, z);
                }
            };
        }
        return nLEBrushRuntimeControllerLIZJ.saveStickerBrushToPng(str, str2, this.LJ);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int addBrushStickerStroke(String str, String str2, String str3, Long l) {
        long jLongValue = l.longValue();
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ != null) {
            return nLEBrushRuntimeControllerLIZJ.addBrushStickerStroke(str, str2, str3, jLongValue);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int processPanEvent(String str, float f, float f2, float f3, float f4, float f5) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ != null) {
            return nLEBrushRuntimeControllerLIZJ.processPanEvent(str, f, f2, f3, f4, f5);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int processTouchDownEvent(String str, float f, float f2, float f3, float f4, float f5) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ != null) {
            return nLEBrushRuntimeControllerLIZJ.processTouchDownEvent(str, f, f2, f3, f4, f5);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int processTouchUpEvent(String str, float f, float f2, float f3, float f4, float f5) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ != null) {
            return nLEBrushRuntimeControllerLIZJ.processTouchUpEvent(str, f, f2, f3, f4, f5);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEBrushRuntime
    public final int processTouchUpEvent2(String str, float f, float f2, float f3, float f4, float f5) {
        NLEBrushRuntimeController nLEBrushRuntimeControllerLIZJ = LIZJ();
        if (nLEBrushRuntimeControllerLIZJ != null) {
            return nLEBrushRuntimeControllerLIZJ.processTouchUpEvent2(str, f, f2, f3, f4, f5, true);
        }
        return -1;
    }
}
