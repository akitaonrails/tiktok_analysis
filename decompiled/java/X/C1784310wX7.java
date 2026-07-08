package X;

import com.bytedance.ies.nle.editor_jni.INLEMattingListener;
import com.bytedance.ies.nle.editor_jni.INLEMattingRuntime;
import com.bytedance.ies.nle.editor_jni.NLELogger;
import com.bytedance.ies.nle.editor_jni.NLEMattingListenerWrapper;
import com.bytedance.ies.nle.editor_jni.NLEMattingRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecString;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0wX7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784310wX7 extends C1784320wX8 implements INLEMattingRuntime {
    public final C1464240oCs LIZ;
    public INLEMattingListener LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 925));
    public C1776290wKB LIZIZ = new NLEMattingListenerWrapper() { // from class: X.0wKB
        @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
        public final void onMattingStartedCallback() {
            NLELogger.obtain().d("onMattingStartedCallback ");
            INLEMattingListener iNLEMattingListener = this.LIZ.LIZJ;
            if (iNLEMattingListener != null) {
                iNLEMattingListener.onMattingStartedCallback();
            }
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
        public final void onMattingAddedCallback(String str) {
            NLELogger.obtain().d("onMattingAddedCallback");
            INLEMattingListener iNLEMattingListener = this.LIZ.LIZJ;
            if (iNLEMattingListener != null) {
                iNLEMattingListener.onMattingAddedCallback(str);
            }
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
        public final void onMattingRemovedCallback(String str) {
            NLELogger.obtain().d("onMattingRemovedCallback");
            INLEMattingListener iNLEMattingListener = this.LIZ.LIZJ;
            if (iNLEMattingListener != null) {
                iNLEMattingListener.onMattingRemovedCallback(str);
            }
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
        public final boolean shouldInterceptMatting(NLETrackSlot nLETrackSlot) {
            NLELogger.obtain().d("shouldInterceptMatting");
            INLEMattingListener iNLEMattingListener = this.LIZ.LIZJ;
            if (iNLEMattingListener != null) {
                return iNLEMattingListener.shouldInterceptMatting(nLETrackSlot);
            }
            return false;
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
        public final void onMattingDoneCallback(float f, String str) {
            NLELogger.obtain().d("onMattingDoneCallback");
            INLEMattingListener iNLEMattingListener = this.LIZ.LIZJ;
            if (iNLEMattingListener != null) {
                iNLEMattingListener.onMattingDoneCallback(f, str);
            }
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
        public final void onMattingErrorCallback(int i, String str) {
            NLELogger nLELoggerObtain = NLELogger.obtain();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMattingErrorCallback slotUUID=");
            sbLIZ.append(str);
            sbLIZ.append(" error=");
            sbLIZ.append(i);
            nLELoggerObtain.d(C2188811AlT.LIZIZ(sbLIZ));
            INLEMattingListener iNLEMattingListener = this.LIZ.LIZJ;
            if (iNLEMattingListener != null) {
                iNLEMattingListener.onMattingErrorCallback(i, str);
            }
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
        public final void onMattingClipDoneCallback(String str, float f, float f2) {
            NLELogger nLELoggerObtain = NLELogger.obtain();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMattingClipDoneCallback slotUUID=");
            sbLIZ.append(str);
            sbLIZ.append(" aveCost=");
            sbLIZ.append(f);
            nLELoggerObtain.d(C2188811AlT.LIZIZ(sbLIZ));
            INLEMattingListener iNLEMattingListener = this.LIZ.LIZJ;
            if (iNLEMattingListener != null) {
                iNLEMattingListener.onMattingClipDoneCallback(str, f, f2);
            }
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
        public final void onMattingErrorCallback(int i, int i2, float f) {
            NLELogger nLELoggerObtain = NLELogger.obtain();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMattingErrorCallback ext=");
            sbLIZ.append(i2);
            sbLIZ.append(" error=");
            sbLIZ.append(i);
            sbLIZ.append(" f=");
            sbLIZ.append(f);
            sbLIZ.append(':');
            nLELoggerObtain.d(C2188811AlT.LIZIZ(sbLIZ));
            INLEMattingListener iNLEMattingListener = this.LIZ.LIZJ;
            if (iNLEMattingListener != null) {
                iNLEMattingListener.onMattingErrorCallback(i, i2, f);
            }
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
        public final void onMattingInteractiveMaskCallback(String str, long j, String str2) {
            NLELogger.obtain().d("onMattingInteractiveMaskCallback");
            INLEMattingListener iNLEMattingListener = this.LIZ.LIZJ;
            if (iNLEMattingListener != null) {
                iNLEMattingListener.onMattingInteractiveMaskCallback(str, j, str2);
            }
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEMattingListener
        public final void onMattingProgressCallback(String str, float f, float f2, boolean z) {
            NLELogger nLELoggerObtain = NLELogger.obtain();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" slotMattingProgress=");
            sbLIZ.append(f);
            sbLIZ.append(" projectMattingProgress=");
            sbLIZ.append(f2);
            nLELoggerObtain.d(C2188811AlT.LIZIZ(sbLIZ));
            INLEMattingListener iNLEMattingListener = this.LIZ.LIZJ;
            if (iNLEMattingListener != null) {
                iNLEMattingListener.onMattingProgressCallback(str, f, f2, z);
            }
        }
    };

    public final NLEMattingRuntimeController LIZ() {
        return (NLEMattingRuntimeController) this.LIZLLL.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingRuntime
    public final VecString getRunningTasks() {
        NLEMattingRuntimeController nLEMattingRuntimeControllerLIZ = LIZ();
        if (nLEMattingRuntimeControllerLIZ == null || nLEMattingRuntimeControllerLIZ.getRunningTasks() == null) {
            return new VecString();
        }
        NLEMattingRuntimeController nLEMattingRuntimeControllerLIZ2 = LIZ();
        if (nLEMattingRuntimeControllerLIZ2 != null) {
            return nLEMattingRuntimeControllerLIZ2.getRunningTasks();
        }
        return null;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingRuntime
    public final void removeAllTask() {
        NLEMattingRuntimeController nLEMattingRuntimeControllerLIZ = LIZ();
        if (nLEMattingRuntimeControllerLIZ != null) {
            nLEMattingRuntimeControllerLIZ.removeAllTask();
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingRuntime
    public final void removeMattingListener() {
        NLEMattingRuntimeController nLEMattingRuntimeControllerLIZ = LIZ();
        if (nLEMattingRuntimeControllerLIZ != null) {
            nLEMattingRuntimeControllerLIZ.removeMattingListener();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0wKB] */
    public C1784310wX7(C1464240oCs c1464240oCs) {
        this.LIZ = c1464240oCs;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingRuntime
    public final void addMattingTask(String str) {
        NLEMattingRuntimeController nLEMattingRuntimeControllerLIZ = LIZ();
        if (nLEMattingRuntimeControllerLIZ != null) {
            nLEMattingRuntimeControllerLIZ.addMattingTask(str);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingRuntime
    public final void removeMattingTask(String str) {
        NLEMattingRuntimeController nLEMattingRuntimeControllerLIZ = LIZ();
        if (nLEMattingRuntimeControllerLIZ != null) {
            nLEMattingRuntimeControllerLIZ.removeMattingTask(str);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingRuntime
    public final void setMattingListener(INLEMattingListener iNLEMattingListener) {
        NLEMattingRuntimeController nLEMattingRuntimeControllerLIZ;
        this.LIZJ = iNLEMattingListener;
        C1776290wKB c1776290wKB = this.LIZIZ;
        if (c1776290wKB != null && (nLEMattingRuntimeControllerLIZ = LIZ()) != null) {
            nLEMattingRuntimeControllerLIZ.setMattingListener(c1776290wKB);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingRuntime
    public final void cleanMattingFile(String str, String str2, int i, String str3) {
        NLEMattingRuntimeController nLEMattingRuntimeControllerLIZ = LIZ();
        if (nLEMattingRuntimeControllerLIZ != null) {
            nLEMattingRuntimeControllerLIZ.cleanMattingFile(str, str2, i, str3);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingRuntime
    public final void copyMattingFile(String str, String str2, String str3, int i) {
        NLEMattingRuntimeController nLEMattingRuntimeControllerLIZ = LIZ();
        if (nLEMattingRuntimeControllerLIZ != null) {
            nLEMattingRuntimeControllerLIZ.copyMattingFile(str, str2, str3, i);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMattingRuntime
    public final void cleanMattingFile(String str, String str2, int i, String str3, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        NLEMattingRuntimeController nLEMattingRuntimeControllerLIZ = LIZ();
        if (nLEMattingRuntimeControllerLIZ != null) {
            nLEMattingRuntimeControllerLIZ.cleanMattingFile(str, str2, i, str3, zBooleanValue);
        }
    }
}
