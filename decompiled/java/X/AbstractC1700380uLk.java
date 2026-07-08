package X;

import Y.ARunnableS2S1301000_26;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveAsyncHandlerDealExp;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveOptStreamJumpExp;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerMessageOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;

/* JADX INFO: renamed from: X.0uLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1700380uLk implements C1API {
    public C1699430uKD LL = new C1699430uKD(0);
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
    public final Handler LLILLL;
    public InterfaceC1700420uLo LLILZ;
    public C1700440uLq LLILZIL;
    public C1700450uLr LLILZLL;
    public long LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final ConcurrentHashSet<EnumC1700470uLt> LLJIJIL;
    public final C1700410uLn LLJILJIL;

    @Override // X.C1API
    public void LIZ(boolean z) {
    }

    @Override // X.C1API
    public /* synthetic */ void LIZLLL() {
    }

    @Override // X.C1API
    public /* synthetic */ Surface LJIIJJI() {
        return null;
    }

    @Override // X.C1API
    public /* synthetic */ void LJIILL(boolean z) {
    }

    @Override // X.C1API
    public /* synthetic */ void changeLowLatencyMode(boolean z) {
    }

    @Override // X.C1API
    public /* synthetic */ int getAudioDuckingDurationForLive(int i) {
        return 0;
    }

    @Override // X.C1API
    public /* synthetic */ C1281010jRL getNetworkState() {
        return null;
    }

    @Override // X.C1API
    public /* synthetic */ int startAuxAudioDucking(C1300320jwU c1300320jwU, InterfaceC1699390uK9 interfaceC1699390uK9) {
        return -100;
    }

    @Override // X.C1API
    public /* synthetic */ int stopAuxAudioDucking(int i) {
        return -100;
    }

    @Override // X.C1API
    public /* synthetic */ int writeAuxAudioDuckingPCM(byte[] bArr, int i) {
        return -100;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        sparseIntArray.put(3, 3);
    }

    @Override // X.C1API
    public void reset() {
        C827750WdZ.LIZ("TTLivePlayerBase", "reset");
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJI = false;
        this.LLJIJIL.clear();
        C1700450uLr c1700450uLr = this.LLILZLL;
        if (c1700450uLr != null) {
            c1700450uLr.getClass();
        }
    }

    public AbstractC1700380uLk() throws Throwable {
        Handler bPEAHandler;
        try {
            bPEAHandler = C08D5.LIZ(Looper.getMainLooper());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        }
        this.LLILLL = bPEAHandler;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJI = false;
        this.LLJIJIL = new ConcurrentHashSet<>();
        this.LLJILJIL = new C1700410uLn(this);
    }

    public final void LIZIZ(ARunnableS2S1301000_26 aRunnableS2S1301000_26) {
        Choreographer choreographer;
        if (LiveOptStreamJumpExp.INSTANCE.isEnable()) {
            if (LiveAsyncHandlerDealExp.INSTANCE.isFirstFrameShowOptEnable()) {
                C786410Ut5.LJL(this.LLILLL, aRunnableS2S1301000_26);
                return;
            } else {
                C786410Ut5.LJL(this.LLILLJJLI, aRunnableS2S1301000_26);
                return;
            }
        }
        BPEAHandler bPEAHandler = this.LLILLJJLI;
        C1700360uLi c1700360uLi = new C1700360uLi(bPEAHandler, aRunnableS2S1301000_26);
        LivePlayerMessageOptSetting livePlayerMessageOptSetting = LivePlayerMessageOptSetting.INSTANCE;
        if (livePlayerMessageOptSetting.enableRenderMessageOptByFrameAnimation() && (choreographer = C1700360uLi.LJIIIIZZ) != null) {
            if (c1700360uLi.LIZJ == null) {
                c1700360uLi.LIZJ = new ChoreographerFrameCallbackC1700390uLl(c1700360uLi);
            }
            ChoreographerFrameCallbackC1700390uLl choreographerFrameCallbackC1700390uLl = c1700360uLi.LIZJ;
            if (choreographerFrameCallbackC1700390uLl != null) {
                choreographer.postFrameCallback(choreographerFrameCallbackC1700390uLl);
                c1700360uLi.LIZLLL = true;
            }
        }
        if (!livePlayerMessageOptSetting.enableRenderMessageOptByMQ()) {
            return;
        }
        if (c1700360uLi.LJ == null) {
            c1700360uLi.LJ = new RunnableC1700370uLj(c1700360uLi);
        }
        RunnableC1700370uLj runnableC1700370uLj = c1700360uLi.LJ;
        if (runnableC1700370uLj == null) {
            return;
        }
        if (bPEAHandler != null) {
            C786410Ut5.LJLI(-1L, bPEAHandler, runnableC1700370uLj);
        }
        c1700360uLi.LJFF = true;
    }
}
