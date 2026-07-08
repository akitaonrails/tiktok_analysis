package Y;

import X.C0E10;
import X.C0E48;
import X.C0E9S;
import X.C0EGB;
import X.C0F2X;
import X.C1C7U;
import X.C357700E0q;
import X.C373660Eku;
import X.C389960FQs;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.Surface;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.nle.editor_jni.INLEListenerSurfaceStatus;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nleeditor.NLE;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class ARunnableS8S0210000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        NLEPlayer nLEPlayerLJFF;
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: surfaceCreated");
        }
        NLEPlayer nLEPlayerLJFF2 = ((C389960FQs) this.l0).LJFF();
        if (nLEPlayerLJFF2 != null) {
            nLEPlayerLJFF2.setAndroidSurface((Surface) this.l1, this.z2);
        }
        NLEPlayer nLEPlayerLJFF3 = ((C389960FQs) this.l0).LJFF();
        NLEPlayerState nLEPlayerStateState = nLEPlayerLJFF3 != null ? nLEPlayerLJFF3.state() : null;
        if (nLEPlayerStateState == NLEPlayerState.STOPPED) {
            NLEPlayer nLEPlayerLJFF4 = ((C389960FQs) this.l0).LJFF();
            if (nLEPlayerLJFF4 != null) {
                nLEPlayerLJFF4.prepare();
            }
            if (NLEMediaPublicJniJNI.NLEConfigUtil_enableSeekDoneAndRenderCallbackOpt()) {
                NLEPlayer nLEPlayerLJFF5 = ((C389960FQs) this.l0).LJFF();
                if (nLEPlayerLJFF5 != null) {
                    C389960FQs c389960FQs = (C389960FQs) this.l0;
                    long j = c389960FQs.LJJIJIL;
                    NLESeekFlag nLESeekFlag = NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek;
                    long j2 = c389960FQs.LJIILJJIL;
                    c389960FQs.LJIILJJIL = 1 + j2;
                    nLEPlayerLJFF5.seekTime(j, nLESeekFlag, j2);
                }
            } else {
                NLEPlayer nLEPlayerLJFF6 = ((C389960FQs) this.l0).LJFF();
                if (nLEPlayerLJFF6 != null) {
                    nLEPlayerLJFF6.seekTime(((C389960FQs) this.l0).LJJIJIL, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
                }
            }
        } else if (nLEPlayerStateState == NLEPlayerState.PREPARED && (nLEPlayerLJFF = ((C389960FQs) this.l0).LJFF()) != null) {
            nLEPlayerLJFF.refreshCurrentFrame(0);
        }
        INLEListenerSurfaceStatus iNLEListenerSurfaceStatus = ((C389960FQs) this.l0).LJJ;
        if (iNLEListenerSurfaceStatus != null) {
            iNLEListenerSurfaceStatus.onSurfaceCreatedDone();
        }
    }

    public static final void run$0(ARunnableS8S0210000_5 aRunnableS8S0210000_5) {
        boolean zLIZ;
        C1C7U.LIZ("MagicPanelComponent@546d.checkServiceInterceptApply$1$1$2$1");
        try {
            if (((C357700E0q) aRunnableS8S0210000_5.l0).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                ((Function1) aRunnableS8S0210000_5.l1).invoke(Boolean.valueOf(aRunnableS8S0210000_5.z2));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MagicPanelComponent@546d.checkServiceInterceptApply$1$1$2$1");
    }

    public static final void run$1(ARunnableS8S0210000_5 aRunnableS8S0210000_5) {
        boolean zLIZ;
        C1C7U.LIZ("MagicPanelComponent@546d.checkServiceInterceptApply$3$1");
        try {
            if (((C357700E0q) aRunnableS8S0210000_5.l0).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                ((Function1) aRunnableS8S0210000_5.l1).invoke(Boolean.valueOf(aRunnableS8S0210000_5.z2));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MagicPanelComponent@546d.checkServiceInterceptApply$3$1");
    }

    public static final void run$2(ARunnableS8S0210000_5 aRunnableS8S0210000_5) {
        boolean zLIZ;
        C1C7U.LIZ("MagicPanelComponent@546d.onMagicItemInterceptDownload$1$3$1");
        try {
            if (((C357700E0q) aRunnableS8S0210000_5.l0).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                ((C0E10) aRunnableS8S0210000_5.l1).LIZ(aRunnableS8S0210000_5.z2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MagicPanelComponent@546d.onMagicItemInterceptDownload$1$3$1");
    }

    public static final void run$3(ARunnableS8S0210000_5 aRunnableS8S0210000_5) {
        boolean zLIZ;
        float f;
        C1C7U.LIZ("AnimationGuideComponentImpl@146f.showOrHideGuideAnim$1$1");
        try {
            C0F2X c0f2x = (C0F2X) aRunnableS8S0210000_5.l0;
            if (aRunnableS8S0210000_5.z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0f2x);
            c0f2x.setAlpha(f);
            Function0 function0 = (Function0) aRunnableS8S0210000_5.l1;
            if (function0 != null) {
                function0.invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnimationGuideComponentImpl@146f.showOrHideGuideAnim$1$1");
    }

    public static final void run$4(ARunnableS8S0210000_5 aRunnableS8S0210000_5) {
        boolean zLIZ;
        float f;
        C1C7U.LIZ("KeyframeGuideComponent@a791.showOrHideGuideAnim$1$1");
        try {
            C373660Eku c373660Eku = (C373660Eku) aRunnableS8S0210000_5.l0;
            if (aRunnableS8S0210000_5.z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c373660Eku);
            c373660Eku.setAlpha(f);
            Function0 function0 = (Function0) aRunnableS8S0210000_5.l1;
            if (function0 != null) {
                function0.invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KeyframeGuideComponent@a791.showOrHideGuideAnim$1$1");
    }

    public static final void run$5(ARunnableS8S0210000_5 aRunnableS8S0210000_5) {
        boolean zLIZ;
        C1C7U.LIZ("NLEPlayerPublic@86c4.surfaceCreated$$inlined$surfaceCreated$1");
        try {
            aRunnableS8S0210000_5.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NLEPlayerPublic@86c4.surfaceCreated$$inlined$surfaceCreated$1");
    }

    public static final void run$6(ARunnableS8S0210000_5 aRunnableS8S0210000_5) {
        boolean zLIZ;
        C1C7U.LIZ("EPSceneLegacySurfaceResultHandlerKt@a988.processEPSceneLegacySurfaceNewArguments$currentBeforeOnResumeRunnale$1");
        try {
            if (aRunnableS8S0210000_5.z2) {
                C0E9S.LIZ((C0EGB) aRunnableS8S0210000_5.l0);
            } else {
                float[] fArrLLJLLIL = ((C0E48) aRunnableS8S0210000_5.l1).getPlayer().LLJLLIL();
                if (fArrLLJLLIL != null) {
                    ((C0E48) aRunnableS8S0210000_5.l1).getPlayer().LJIILJJIL(fArrLLJLLIL[0], fArrLLJLLIL[1], fArrLLJLLIL[2], fArrLLJLLIL[3], null);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EPSceneLegacySurfaceResultHandlerKt@a988.processEPSceneLegacySurfaceNewArguments$currentBeforeOnResumeRunnale$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS8S0210000_5(Object obj, C357700E0q c357700E0q, Function1<? super Boolean, Unit> function1, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = obj;
        this.l1 = c357700E0q;
        this.z2 = function1;
    }
}
