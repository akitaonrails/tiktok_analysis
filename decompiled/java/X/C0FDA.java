package X;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.ies.nle.editor_jni.INLEListenerCommon;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.android.editor.components.base.FrameInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0FDA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FDA extends AbstractC2255721DQs<InterfaceC374920Emw> implements InterfaceC374920Emw, InterfaceC379610EuV {
    public static final int LLJILJIL = 8;
    public final C1DRG LL;
    public volatile INLEMediaSession LLILLL;
    public C0FDF LLILZ;
    public NLEEditorListener LLILZIL;
    public boolean LLIZ;
    public final C0FDG LLIZLLLIL;
    public final FrameInterpolator LLJ;
    public INLEListenerCommon LLJI;
    public INLEListenerVideoOutput LLJIJIL;
    public final InterfaceC374920Emw LLILLJJLI = this;
    public final NLEEditor LLILZLL = C346630DiP.LIZ();

    @Override // X.InterfaceC374920Emw
    public long Jh() {
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSession = this.LLILLL;
        return ((iNLEMediaSession == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) ? 0L : playerApi.getCurrentPosition()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.InterfaceC374920Emw
    public void ib1() {
        INLEMediaRuntime mediaRuntimeApi;
        INLEMediaSession iNLEMediaSession = this.LLILLL;
        if (iNLEMediaSession == null || (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) == null) {
            return;
        }
        mediaRuntimeApi.setDisplayState(1.0f, 1.0f, 0.0f, 0, 0);
    }

    @Override // X.InterfaceC374920Emw
    public INLEMediaSession jk0() {
        INLEMediaSession iNLEMediaSession = this.LLILLL;
        if (iNLEMediaSession != null) {
            return iNLEMediaSession;
        }
        throw new IllegalStateException("NLECropComponent not initialized.");
    }

    @Override // X.InterfaceC374920Emw
    public void pause() {
        INLEPlayer playerApi;
        if (this.LLIZ) {
            this.LLJ.LIZ();
            C0FDF c0fdf = this.LLILZ;
            if (c0fdf != null) {
                c0fdf.LIZ(EnumC373600Eko.PAUSE);
            }
            this.LLIZ = false;
            INLEMediaSession iNLEMediaSession = this.LLILLL;
            if (iNLEMediaSession == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) {
                return;
            }
            playerApi.pause();
        }
    }

    @Override // X.InterfaceC374920Emw
    public void prepare() {
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSession = this.LLILLL;
        if (iNLEMediaSession == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) {
            return;
        }
        playerApi.prepare();
    }

    @Override // X.InterfaceC374920Emw
    public long qq() {
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSession = this.LLILLL;
        return ((iNLEMediaSession == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) ? 0L : playerApi.getDuration()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.InterfaceC374920Emw
    public void release() {
        INLEPlayer playerApi;
        INLEPlayer playerApi2;
        INLEMediaSession iNLEMediaSession = this.LLILLL;
        if (iNLEMediaSession != null && (playerApi2 = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi2.removeOnInfoListener(this.LLJI);
        }
        INLEMediaSession iNLEMediaSession2 = this.LLILLL;
        if (iNLEMediaSession2 != null && (playerApi = iNLEMediaSession2.getPlayerApi()) != null) {
            playerApi.setVideoOutputListener(null);
        }
        NLEEditorListener nLEEditorListener = this.LLILZIL;
        if (nLEEditorListener != null) {
            this.LLILZLL.removeConsumer(nLEEditorListener);
            this.LLILZIL = null;
        }
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // X.InterfaceC374920Emw
    public void resume() {
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSession = this.LLILLL;
        if (iNLEMediaSession == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) {
            return;
        }
        playerApi.setVideoOutputListener(this.LLJIJIL);
    }

    @Override // X.InterfaceC374920Emw
    public void play() {
        INLEPlayer playerApi;
        INLEPlayer playerApi2;
        INLEPlayer playerApi3;
        if (qq() - Jh() < 50) {
            INLEMediaSession iNLEMediaSession = this.LLILLL;
            if (iNLEMediaSession != null && (playerApi3 = iNLEMediaSession.getPlayerApi()) != null) {
                playerApi3.refreshCurrentFrame();
            }
            INLEMediaSession iNLEMediaSession2 = this.LLILLL;
            if (iNLEMediaSession2 != null && (playerApi2 = iNLEMediaSession2.getPlayerApi()) != null) {
                playerApi2.seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
            }
            C0FDF c0fdf = this.LLILZ;
            if (c0fdf != null) {
                c0fdf.LIZIZ(0L, false);
            }
        }
        this.LLJ.getClass();
        SystemClock.elapsedRealtime();
        C0FDF c0fdf2 = this.LLILZ;
        if (c0fdf2 != null) {
            c0fdf2.LIZ(EnumC373600Eko.PLAY);
        }
        this.LLIZ = true;
        INLEMediaSession iNLEMediaSession3 = this.LLILLL;
        if (iNLEMediaSession3 == null || (playerApi = iNLEMediaSession3.getPlayerApi()) == null) {
            return;
        }
        playerApi.play();
    }

    @Override // X.InterfaceC374920Emw
    public NLEEditor LF2() {
        return this.LLILZLL;
    }

    public InterfaceC374920Emw W1() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC374920Emw
    public INLEMediaSession fD1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0FDA(C1DRG c1drg) {
        this.LL = c1drg;
        C0FDG c0fdg = new C0FDG() { // from class: X.0FDD
            @Override // X.C0FDG
            public final void handleMsg(Message message) {
                C0FDF c0fdf = this.LIZ.LLILZ;
                if (c0fdf != null) {
                    c0fdf.LIZIZ(message.arg1, false);
                }
            }
        };
        this.LLIZLLLIL = c0fdg;
        this.LLJ = new FrameInterpolator(c0fdg);
        this.LLJI = new INLEListenerCommon() { // from class: X.0FDC
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
            public final void onCallback(int i, int i2, float f, String str) {
                if (4098 == i) {
                    this.LIZ.pause();
                    C0FDA c0fda = this.LIZ;
                    c0fda.LLJ.LIZIZ((int) c0fda.qq());
                }
            }
        };
        this.LLJIJIL = new INLEListenerVideoOutput() { // from class: X.0FDE
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
            public final void onRefresh(int i, long j) {
                if (i == 0) {
                    C0FDA c0fda = this.LL;
                    if (c0fda.LLIZ) {
                        c0fda.LLJ.LIZIZ(((int) j) / LSPassThroughRecordSizeConfig.DEFAULT);
                    }
                }
            }
        };
    }

    @Override // X.InterfaceC374920Emw
    public void mS0(C0FDF c0fdf) {
        this.LLILZ = c0fdf;
    }

    @Override // X.InterfaceC374920Emw
    public void skipNextSeek(boolean z) {
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSession = this.LLILLL;
        if (iNLEMediaSession != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi.skipNextSeek(z);
        }
    }

    @Override // X.InterfaceC374920Emw
    public void ba(long j, INLEListenerSeek iNLEListenerSeek) {
        INLEPlayer playerApi;
        C0FDF c0fdf = this.LLILZ;
        if (c0fdf != null) {
            c0fdf.LIZ(EnumC373600Eko.PAUSE);
        }
        this.LLJ.LIZ();
        this.LLIZ = false;
        INLEMediaSession iNLEMediaSession = this.LLILLL;
        if (iNLEMediaSession != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi.seekTime(C351220Dpo.LLLLLLJ(j), NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek, iNLEListenerSeek);
        }
        C0FDF c0fdf2 = this.LLILZ;
        if (c0fdf2 != null) {
            c0fdf2.LIZIZ(j, true);
        }
    }

    @Override // X.InterfaceC374920Emw
    public void gP(INLEMediaSession iNLEMediaSession, String str, long j) {
        lY0(iNLEMediaSession, str, j, AFwS191S0000000_5.get$arr$(361));
    }

    @Override // X.InterfaceC374920Emw
    public void lY0(INLEMediaSession iNLEMediaSession, String str, long j, Function0<Unit> function0) {
        INLEPlayer playerApi;
        INLEPlayer playerApi2;
        this.LLILLL = iNLEMediaSession;
        INLEMediaSession iNLEMediaSession2 = this.LLILLL;
        if (iNLEMediaSession2 != null && (playerApi2 = iNLEMediaSession2.getPlayerApi()) != null) {
            INLEPlayer.DefaultImpls.addOnInfoListener$default(playerApi2, this.LLJI, false, 2, null);
        }
        INLEMediaSession iNLEMediaSession3 = this.LLILLL;
        if (iNLEMediaSession3 != null && (playerApi = iNLEMediaSession3.getPlayerApi()) != null) {
            playerApi.setVideoOutputListener(this.LLJIJIL);
        }
        INLEMediaSession iNLEMediaSession4 = this.LLILLL;
        if (iNLEMediaSession4 != null) {
            iNLEMediaSession4.updateNLEEditor(this.LLILZLL);
        }
        C354000DuI c354000DuI = new C354000DuI() { // from class: X.0FDB
            public volatile boolean LIZ = true;

            @Override // X.C354000DuI
            public final void LIZ() {
                if (this.LIZ) {
                    this.LIZ = false;
                    return;
                }
                INLEMediaSession iNLEMediaSession5 = this.LIZIZ.LLILLL;
                if (iNLEMediaSession5 != null) {
                    iNLEMediaSession5.setDataSource(this.LIZIZ.LLILZLL.getModel());
                }
            }
        };
        this.LLILZLL.addConsumer(c354000DuI);
        this.LLILZIL = c354000DuI;
        function0.invoke();
        this.LLILZLL.restore(str);
    }
}
