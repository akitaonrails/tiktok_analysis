package X;

import Y.ARunnableS123S0100000_23;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.util.PlayerMainHandler;
import com.ss.android.ugc.aweme.player.sdk.v3.PlayHandler;
import com.ss.android.ugc.playerkit.model.PlayerSessionThreadPriorityConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0od1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1480450od1 implements InterfaceC1480710odR {
    public String LIZ;
    public boolean LIZIZ;
    public final HandlerThread LIZJ;
    public final PlayHandler LJ;
    public final C1480490od5 LJFF;
    public final BPEAHandler LJI;
    public C1479510obV LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public WeakReference<OnUIPlayListener> LJIIJJI;
    public volatile int LJIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public final boolean LJIILLIIL;
    public InterfaceC1480060ocO LJIJI;
    public String LJIJJ;
    public final C1473010oR1 LIZLLL = new C1473010oR1();
    public boolean LJII = false;
    public volatile boolean LJIILIIL = true;
    public boolean LJIIZILJ = false;
    public final AtomicInteger LJIJ = new AtomicInteger(0);

    @Override // X.InterfaceC1480710odR
    public boolean LJJ() {
        return this instanceof C1480560odC;
    }

    public final String toString() {
        return C786410Ut5.j4("PlaySession{this=%s, key=%s, mIsReleasing=%s, mIsReleased=%s}", new Object[]{super.toString(), this.LIZ, Boolean.valueOf(this.LJIIIZ), Boolean.valueOf(this.LJIIJ)});
    }

    @Override // X.InterfaceC1480710odR
    public final boolean LJ() {
        LJ();
        return false;
    }

    @Override // X.InterfaceC1480710odR
    public final C1472440oQ6 LJIIIIZZ() {
        C1480490od5 c1480490od5 = this.LJFF;
        if (c1480490od5 != null) {
            return c1480490od5.LJIIIIZZ();
        }
        return null;
    }

    @Override // X.InterfaceC1480710odR
    public final float LJIIJ() {
        return LJIILIIL();
    }

    @Override // X.InterfaceC1480710odR
    public final void LJIIJJI() {
        this.LJIJ.set(0);
    }

    @Override // X.InterfaceC1480710odR
    public final OnUIPlayListener LJIIL() {
        WeakReference<OnUIPlayListener> weakReference = this.LJIIJJI;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // X.InterfaceC1480710odR
    public final void LJIILIIL() {
        this.LJIJ.incrementAndGet();
    }

    @Override // X.InterfaceC1480710odR
    public final boolean LJIJ() {
        return this.LJIIIIZZ == null;
    }

    @Override // X.InterfaceC1480710odR
    public final int LJIJI() {
        return this.LJIJ.get();
    }

    @Override // X.InterfaceC1480710odR
    public void LJIJJLI() {
        this.LJ.sendEmptyMessage(16);
    }

    @Override // X.InterfaceC1480710odR
    public final void LJIL() {
        Message messageObtainMessage = this.LJ.obtainMessage(17);
        if (1 == C1474810oTv.LLILLL()) {
            messageObtainMessage.obj = Boolean.TRUE;
        }
        if (1 == C1474810oTv.LLILLJJLI()) {
            PlayerSessionThreadPriorityConfig playerSessionThreadPriorityConfigLLILLIZIL = C1474810oTv.LLILLIZIL();
            if (playerSessionThreadPriorityConfigLLILLIZIL != null) {
                LJJIFFI(4, playerSessionThreadPriorityConfigLLILLIZIL.recycleStory);
            }
        } else {
            LJJI(4, messageObtainMessage);
        }
        LJJIII();
        LJJIIZI();
        messageObtainMessage.sendToTarget();
    }

    public final void LJJII() {
        this.LJ.sendEmptyMessage(20);
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJIIZI() {
        this.LJ.removeMessages(12);
    }

    @Override // X.InterfaceC1480710odR
    public final boolean LJJIJIIJIL() {
        return LJJIJIIJIL();
    }

    @Override // X.InterfaceC1480710odR
    public final int LJJIJIL() {
        return LJJIJIL();
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJJLZIJ() {
        LJJJLZIJ();
    }

    @Override // X.InterfaceC1480710odR
    public final int LJJLI() {
        C1480490od5 c1480490od5 = this.LJFF;
        if (c1480490od5 != null) {
            return c1480490od5.LJJLI();
        }
        return 0;
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJLIIIJL() {
        LJJLIIIJL();
    }

    @Override // X.InterfaceC1480710odR
    public final int LJJLIIJ() {
        return this.LJFF.LJIILL;
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJLJLI() {
        this.LJ.sendEmptyMessage(8);
    }

    @Override // X.InterfaceC1480710odR
    public final String LJLJLJ() {
        return LJLJLJ();
    }

    @Override // X.InterfaceC1480710odR
    public final boolean LJLJLLL() {
        return LJLJLLL();
    }

    @Override // X.InterfaceC1480710odR
    public final long getCurrentPosition() {
        return getCurrentPosition();
    }

    @Override // X.InterfaceC1480710odR
    public final long getDuration() {
        return getDuration();
    }

    @Override // X.InterfaceC1480710odR
    public final EnumC1479760obu getPlayerType() {
        return this.LJFF.LJFF;
    }

    @Override // X.InterfaceC1480710odR
    public final int getSessionId() {
        C1480490od5 c1480490od5 = this.LJFF;
        if (c1480490od5 != null) {
            return c1480490od5.LIZ;
        }
        return -1;
    }

    @Override // X.InterfaceC1480710odR
    public final int getState() {
        return this.LJFF.LJIJI;
    }

    @Override // X.InterfaceC1480710odR
    public final C1471500oOa getVideoInfo() {
        C1480490od5 c1480490od5 = this.LJFF;
        if (c1480490od5 != null) {
            return c1480490od5.getVideoInfo();
        }
        return null;
    }

    @Override // X.InterfaceC1480710odR
    public final boolean isLoading() {
        return isLoading();
    }

    @Override // X.InterfaceC1480710odR
    public final boolean isMute() {
        return isMute();
    }

    @Override // X.InterfaceC1480710odR
    public final boolean isPaused() {
        return isPaused();
    }

    @Override // X.InterfaceC1480710odR
    public final boolean isPlaying() {
        return isPlaying();
    }

    @Override // X.InterfaceC1480710odR
    public final void resume() {
        this.LJ.obtainMessage(4).sendToTarget();
    }

    @Override // X.InterfaceC1480710odR
    public final void start() {
        this.LJ.sendEmptyMessage(3);
    }

    public final void LJJIII() {
        if (C1474810oTv.LIZ()) {
            C1481110oe5.LIZJ(Log.getStackTraceString(new Throwable()));
        }
        ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(this, 137);
        if (Looper.myLooper() == Looper.getMainLooper() || !C1474810oTv.LLJJJ()) {
            aRunnableS123S0100000_23.run();
        } else {
            C0C83.INS.runOnMain(aRunnableS123S0100000_23);
        }
        this.LJ.sendEmptyMessage(6);
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJIIZ() {
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS123S0100000_23(this, 38));
        } else {
            if (this.LJIIJ || this.LJIIIZ) {
                return;
            }
            this.LJ.LJ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJJ() {
        if (C1474810oTv.LIZ()) {
            C1481110oe5.LIZJ(Log.getStackTraceString(new Throwable()));
        }
        this.LJ.obtainMessage(19).sendToTarget();
    }

    @Override // X.InterfaceC1480710odR
    public final void pause() {
        if (C1474810oTv.LIZ()) {
            C1481110oe5.LIZJ(Log.getStackTraceString(new Throwable()));
        }
        this.LJ.sendEmptyMessage(5);
    }

    @Override // X.InterfaceC1480710odR
    public final void release() {
        if (C1474810oTv.LIZ()) {
            C1481110oe5.LIZJ(Log.getStackTraceString(new Throwable()));
        }
        Message messageObtainMessage = this.LJ.obtainMessage(7);
        if (1 == C1474810oTv.LLILLL()) {
            messageObtainMessage.obj = Boolean.TRUE;
        }
        if (1 == C1474810oTv.LLILLJJLI()) {
            PlayerSessionThreadPriorityConfig playerSessionThreadPriorityConfigLLILLIZIL = C1474810oTv.LLILLIZIL();
            if (playerSessionThreadPriorityConfigLLILLIZIL != null) {
                LJJIFFI(3, playerSessionThreadPriorityConfigLLILLIZIL.releaseStory);
            }
        } else {
            LJJI(3, messageObtainMessage);
        }
        LJJJIL(true);
        this.LJ.removeCallbacksAndMessages(null);
        if (!((Boolean) C1474810oTv.s4.getValue()).booleanValue()) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySession", "transfer signal, disable delay release, normal release");
            }
            messageObtainMessage.sendToTarget();
        } else if (this.LIZLLL.LIZ) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySession", "transfer signal, enable delay release, delay");
            }
            this.LJ.sendMessageDelayed(messageObtainMessage, ((Number) C1474810oTv.t4.getValue()).intValue());
        } else {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySession", "transfer signal, enable delay release, not scrolling, normal release");
            }
            messageObtainMessage.sendToTarget();
        }
        this.LJIIIZ = true;
    }

    @Override // X.InterfaceC1480710odR
    public final void reset() {
        LJJIII();
        LJJIIZI();
        this.LJ.sendEmptyMessage(17);
    }

    @Override // X.InterfaceC1480710odR
    public final boolean LJII() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1480710odR
    public final int LJIIIZ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1480710odR
    public final boolean LJIILJJIL() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC1480710odR
    public final boolean LJIIZILJ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1480710odR
    public final boolean LJIJJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1480710odR
    public final String getKey() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1480710odR
    public final int getVideoHeight() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC1480710odR
    public final int getVideoWidth() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC1480710odR
    public final void LIZ(boolean z) {
        LIZ(z);
    }

    @Override // X.InterfaceC1480710odR
    public final <T> T LIZIZ(AbstractC586270Mz3<T> abstractC586270Mz3) {
        if (abstractC586270Mz3 instanceof C1472380oQ0) {
            this.LIZLLL.LIZ = ((C1472380oQ0) abstractC586270Mz3).LIZJ;
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("transfer signal, PlaySession execCommand SetPageScrollState, isScrolling:");
                sbLIZ.append(this.LIZLLL.LIZ);
                C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (abstractC586270Mz3.LIZ) {
            this.LJ.sendMessage(this.LJ.obtainMessage(255, abstractC586270Mz3));
            return (T) abstractC586270Mz3.LIZ();
        }
        C1480490od5 c1480490od5 = this.LJFF;
        if (c1480490od5 == null) {
            return (T) abstractC586270Mz3.LIZ();
        }
        return (T) c1480490od5.LIZIZ(abstractC586270Mz3);
    }

    @Override // X.InterfaceC1480710odR
    public final void LIZJ(String str) {
        LIZJ(str);
    }

    @Override // X.InterfaceC1480710odR
    public final float LJFF(int i) {
        return LJFF(i);
    }

    @Override // X.InterfaceC1480710odR
    public final void LJI(float f) {
        LJI(f);
    }

    @Override // X.InterfaceC1480710odR
    public final void LJIILL(float f) {
        this.LJ.obtainMessage(11, Float.valueOf(f)).sendToTarget();
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJIJ(OnUIPlayListener onUIPlayListener) {
        this.LJIIJJI = new WeakReference<>(onUIPlayListener);
        this.LJFF.LJJIIJ = onUIPlayListener;
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJIJIIJI(int i) {
        this.LJ.LJ(i);
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJIJL(InterfaceC1472010oPP interfaceC1472010oPP) {
        if (this.LJFF != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 2;
            message.obj = interfaceC1472010oPP;
            this.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJIJLIJ(boolean z) {
        if (this.LJFF != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 1;
            message.arg2 = z ? 1 : 0;
            this.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJIL(Surface surface) {
        if (C1474810oTv.LLILZ()) {
            this.LJ.obtainMessage(15, surface).sendToTarget();
        } else {
            LJJIL(surface);
            this.LJ.obtainMessage(15, surface).sendToTarget();
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJIZ(String str) {
        if (this.LJFF != null) {
            Message message = new Message();
            message.what = 22;
            message.arg1 = 0;
            message.obj = str;
            this.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJL(SurfaceHolder surfaceHolder) {
        this.LJ.obtainMessage(14, surfaceHolder).sendToTarget();
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJLIIIIJ(String str) {
        this.LJ.obtainMessage(4, str).sendToTarget();
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJLIIIJ(InterfaceC1471920oPG interfaceC1471920oPG) {
        if (this.LJFF != null) {
            Message message = new Message();
            message.what = 22;
            message.arg1 = 2;
            message.obj = interfaceC1471920oPG;
            this.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJLIIIJJI(int i) {
        if (this.LJFF != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 0;
            message.arg2 = i;
            this.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final boolean LJJLIIIJLLLLLLLZ(String str) {
        return LJJLIIIJLLLLLLLZ(str);
    }

    @Override // X.InterfaceC1480710odR
    public final boolean LJJLIL(String str) {
        return LJJLIL(str);
    }

    @Override // X.InterfaceC1480710odR
    public final boolean LJJLJ(String str) {
        return LJJLJ(str);
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJLL(InterfaceC1480060ocO interfaceC1480060ocO) {
        this.LJIJI = interfaceC1480060ocO;
        C1480490od5 c1480490od5 = this.LJFF;
        if (c1480490od5 != null) {
            c1480490od5.LJJIJ = interfaceC1480060ocO;
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJZZIII(InterfaceC1284280jWc interfaceC1284280jWc) {
        LJJZZIII(interfaceC1284280jWc);
    }

    @Override // X.InterfaceC1480710odR
    public final void LJL(Bundle bundle) {
        if (this.LJFF != null) {
            Message message = new Message();
            message.what = 27;
            message.obj = bundle;
            this.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLI(InterfaceC1480320oco interfaceC1480320oco) {
        getClass();
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLIIIL(InterfaceC1472880oQo interfaceC1472880oQo) {
        LJLIIIL(interfaceC1472880oQo);
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLIIL(InterfaceC1480330ocp interfaceC1480330ocp) {
        this.LJFF.LJJIIZI = interfaceC1480330ocp;
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLIL(C1479510obV c1479510obV) {
        final boolean z;
        String strategyTokens;
        OnUIPlayListener onUIPlayListener;
        int i;
        boolean z2;
        C1479510obV c1479510obV2 = this.LJIIIIZZ;
        if (c1479510obV2 != null && c1479510obV2.LJJI && c1479510obV != null && !c1479510obV.LJJI && TextUtils.equals(c1479510obV.LJIIIZ, c1479510obV2.LJIIIZ)) {
            c1479510obV.LJZL = this.LJIIIIZZ.LJZL;
            z = true;
        } else {
            z = false;
        }
        this.LJIIIIZZ = c1479510obV;
        c1479510obV.LLIIIZ = this.LJIILLIIL;
        this.LIZIZ = c1479510obV.LLIIL;
        this.LIZ = c1479510obV.LJIIIZ;
        this.LJIIZILJ = c1479510obV.LJJJJL;
        this.LJIIL = c1479510obV.LJIILIIL;
        C1479510obV c1479510obV3 = this.LJIIIIZZ;
        this.LJIILJJIL = c1479510obV3.LJJJZ;
        this.LJIILL = c1479510obV3.LJJL;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlaySession-prepare:");
            sbLIZ.append(this.LIZ);
            sbLIZ.append("; wh(");
            sbLIZ.append(this.LJIILJJIL);
            sbLIZ.append(", ");
            sbLIZ.append(this.LJIILL);
            sbLIZ.append(")");
            C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1479510obV c1479510obV4 = this.LJIIIIZZ;
        if (!c1479510obV4.LJJI) {
            boolean z3 = this.LJII;
            if (c1479510obV4.LJLJLJ == -1) {
                c1479510obV4.LJLJLJ = z3 ? 1 : 0;
            }
            this.LJII = true;
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PlaySession prepare ");
            sbLIZ2.append(SystemClock.elapsedRealtime());
            sbLIZ2.append(" sourceId ");
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(", prepare: ");
            if (this.LJIIIIZZ == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ2.append(z2);
            sbLIZ2.append("  ");
            sbLIZ2.append(this.LJIIIZ);
            sbLIZ2.append(" ");
            sbLIZ2.append(this.LJIIJ);
            C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1479510obV c1479510obV5 = this.LJIIIIZZ;
        if (c1479510obV5 != null && !this.LJIIIZ && !this.LJIIJ) {
            if (c1479510obV5.LJJI && c1479510obV5.LLIIIILZ) {
                if (1 == C1474810oTv.LLILLJJLI()) {
                    PlayerSessionThreadPriorityConfig playerSessionThreadPriorityConfigLLILLIZIL = C1474810oTv.LLILLIZIL();
                    if (playerSessionThreadPriorityConfigLLILLIZIL != null) {
                        LJJIFFI(2, playerSessionThreadPriorityConfigLLILLIZIL.preprepareStory);
                    }
                } else {
                    LJJIFFI(2, 10);
                }
            } else if (1 == C1474810oTv.LLILLJJLI()) {
                PlayerSessionThreadPriorityConfig playerSessionThreadPriorityConfigLLILLIZIL2 = C1474810oTv.LLILLIZIL();
                if (playerSessionThreadPriorityConfigLLILLIZIL2 != null) {
                    LJJIFFI(1, playerSessionThreadPriorityConfigLLILLIZIL2.prepareStory);
                }
            } else {
                LJJIFFI(1, 0);
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1473210oRL c1473210oRL = this.LJIIIIZZ.LJIJJLI;
            if (c1473210oRL == null) {
                strategyTokens = null;
            } else {
                strategyTokens = c1473210oRL.getStrategyTokens();
            }
            if (!this.LJIIIIZZ.LJJI) {
                InterfaceC1480060ocO interfaceC1480060ocO = this.LJIJI;
                String str = this.LIZ;
                if (interfaceC1480060ocO != null && !TextUtils.isEmpty(str) && jCurrentTimeMillis > 0) {
                    interfaceC1480060ocO.LIZIZ(2, jCurrentTimeMillis, str);
                }
            }
            this.LJ.removeCallbacks(null);
            C1479510obV c1479510obV6 = this.LJIIIIZZ;
            if (c1479510obV6.LJJIJIIJI && !C1479780obw.LIZ(c1479510obV6)) {
                if (this.LJIIIIZZ.LJLJJLL && !((Boolean) C1474810oTv.g0.getValue()).booleanValue() && !C1474810oTv.LLJJJ()) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySession", "MessageQueueOptService onpreapreplay callback");
                    }
                    WeakReference<OnUIPlayListener> weakReference = this.LJIIJJI;
                    if (weakReference != null && (onUIPlayListener = weakReference.get()) != null) {
                        onUIPlayListener.onPreparePlay(this.LIZ);
                        C1480430ocz c1480430ocz = new C1480430ocz(this.LIZ);
                        c1480430ocz.LIZ(strategyTokens);
                        c1480430ocz.LJII = isMute();
                        c1480430ocz.LIZLLL = jCurrentTimeMillis;
                        c1480430ocz.LJFF = jCurrentTimeMillis;
                        c1480430ocz.LJ = jElapsedRealtime;
                        if (z) {
                            i = 2;
                        } else {
                            i = 3;
                        }
                        c1480430ocz.LJIIJ = i;
                        c1480430ocz.LJI = this.LIZIZ;
                        C1479510obV c1479510obV7 = this.LJIIIIZZ;
                        c1480430ocz.LJIILJJIL = c1479510obV7.LLJILLL;
                        c1480430ocz.LJIIIIZZ = c1479510obV7.LJJJJLI;
                        c1480430ocz.LJIIJJI = c1479510obV7.LJZL;
                        c1480430ocz.LJIILLIIL = c1479510obV7.LJJJJLL;
                        try {
                            onUIPlayListener.onPreparePlay(this.LIZ, c1480430ocz);
                        } catch (AbstractMethodError e) {
                            TryCatchGuardChecker.doCheck(e);
                            e.printStackTrace();
                        }
                    }
                } else if (this.LJIIJJI != null) {
                    final C1480430ocz c1480430ocz2 = new C1480430ocz(this.LIZ);
                    c1480430ocz2.LJII = isMute();
                    c1480430ocz2.LIZ(strategyTokens);
                    C786410Ut5.LJJZZIII(this.LJI, new Runnable() { // from class: X.0od4
                        public final void LIZ() {
                            OnUIPlayListener onUIPlayListener2;
                            WeakReference<OnUIPlayListener> weakReference2 = this.LLILZIL.LJIIJJI;
                            if (weakReference2 == null || (onUIPlayListener2 = weakReference2.get()) == null) {
                                return;
                            }
                            onUIPlayListener2.onPreparePlay(this.LLILZIL.LIZ);
                            C1480430ocz c1480430ocz3 = c1480430ocz2;
                            long j = jCurrentTimeMillis;
                            c1480430ocz3.LIZLLL = j;
                            c1480430ocz3.LJFF = j;
                            c1480430ocz3.LJ = jElapsedRealtime;
                            c1480430ocz3.LJIIJ = z ? 2 : 3;
                            C1480450od1 c1480450od1 = this.LLILZIL;
                            c1480430ocz3.LJI = c1480450od1.LIZIZ;
                            C1479510obV c1479510obV8 = c1480450od1.LJIIIIZZ;
                            c1480430ocz3.LJIILJJIL = c1479510obV8.LLJILLL;
                            c1480430ocz3.LJIIIIZZ = c1479510obV8.LJJJJLI;
                            c1480430ocz3.LJIIJJI = c1479510obV8.LJZL;
                            c1480430ocz3.LJIILLIIL = c1479510obV8.LJJJJLL;
                            try {
                                onUIPlayListener2.onPreparePlay(c1480450od1.LIZ, c1480430ocz3);
                            } catch (AbstractMethodError e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                e2.printStackTrace();
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PlaySession@2a89.prepare$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PlaySession@2a89.prepare$1");
                        }
                    });
                }
            }
            C1479510obV c1479510obV8 = this.LJIIIIZZ;
            c1479510obV8.LLJJJ = this.LIZLLL;
            c1479510obV8.LJIJJ = 3;
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySession", C786410Ut5.j4("transfer signal, PlaySession modify prepareData, aid:%s, prerender?%s, isScrolling:%s", new Object[]{c1479510obV8.LJIIIZ, Boolean.valueOf(c1479510obV8.LJJI), Boolean.valueOf(this.LIZLLL.LIZ)}));
            }
            this.LJ.obtainMessage(1, this.LJIIIIZZ).sendToTarget();
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLILLLLZI(InterfaceC1499700p84 interfaceC1499700p84) {
        if (this.LJFF != null) {
            Message message = new Message();
            message.what = 26;
            message.obj = interfaceC1499700p84;
            this.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLJJI(C00UI c00ui) {
        this.LJ.obtainMessage(25, c00ui).sendToTarget();
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLJJL(InterfaceC1472490oQB interfaceC1472490oQB) {
        LJLJJL(interfaceC1472490oQB);
    }

    @Override // X.InterfaceC1480710odR
    public final void setLoop(boolean z) {
        setLoop(z);
    }

    @Override // X.InterfaceC1480710odR
    public final void setSurface(Surface surface) {
        if (C1474810oTv.LLILZ()) {
            this.LJ.obtainMessage(21, surface).sendToTarget();
        } else {
            setSurface(surface);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LIZLLL(String str, String str2) {
        LIZLLL(str, str2);
    }

    @Override // X.InterfaceC1480710odR
    public final void LJIILLIIL(float f, float f2) {
        this.LJ.obtainMessage(9, new Pair(Float.valueOf(f), Float.valueOf(f2))).sendToTarget();
    }

    public final void LJJI(int i, Message message) {
        HandlerThread handlerThread = this.LIZJ;
        if (handlerThread != null && C786410Ut5.W2(handlerThread) != null && C786410Ut5.W2(this.LIZJ) != Looper.getMainLooper()) {
            int threadId = this.LIZJ.getThreadId();
            if (this.LJIILLIIL && threadId > 0) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("adjustPlayThreadPriority play thread, scene : ");
                    sbLIZ.append(i);
                    sbLIZ.append(", priority : ");
                    sbLIZ.append(10);
                    C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (((Boolean) C1474810oTv.LLJZIJLIL.getValue()).booleanValue()) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("set play session thread priority: ");
                        sbLIZ2.append(threadId);
                        sbLIZ2.append(" -> ");
                        sbLIZ2.append(10);
                        C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    Process.setThreadPriority(threadId, 10);
                }
                if ((i == 4 || i == 3) && message != null) {
                    message.obj = Boolean.TRUE;
                }
            }
        }
    }

    public final void LJJIFFI(int i, int i2) {
        HandlerThread handlerThread;
        int threadId;
        if (1 == C1474810oTv.LLILLJJLI() && (handlerThread = this.LIZJ) != null && C786410Ut5.W2(handlerThread) != null && C786410Ut5.W2(this.LIZJ) != Looper.getMainLooper() && (threadId = this.LIZJ.getThreadId()) > 0) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("adjustPlayerThreadPriority play thread, scene : ");
                sbLIZ.append(i);
                sbLIZ.append(", priority : ");
                sbLIZ.append(i2);
                C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ));
            }
            try {
                Process.setThreadPriority(threadId, i2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySession", "Process.setThreadPriority exception");
                }
            }
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJJZ(int i, JSONObject jSONObject) {
        if (this.LJFF != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 3;
            message.arg2 = i;
            message.obj = jSONObject;
            this.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJLIIIJILLIZJL(String str, String str2) {
        C1480490od5 c1480490od5 = this.LJFF;
        if (c1480490od5 != null) {
            c1480490od5.LJJLIIIJILLIZJL(str, str2);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJLIIIJJIZ(String str, boolean z) {
        this.LJ.obtainMessage(28, new Pair(str, Boolean.valueOf(z))).sendToTarget();
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJZ(int i, Bundle bundle) {
        if (this.LJFF != null) {
            Message message = new Message();
            message.what = 24;
            bundle.putInt("texture_layout_param", i);
            message.obj = bundle;
            this.LJ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLJJLL(int i, int i2) {
        this.LJ.obtainMessage(13, new Pair(Integer.valueOf(i), Integer.valueOf(i2))).sendToTarget();
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLJL(Bundle bundle, boolean z) {
        if (this.LJFF != null) {
            Message message = new Message();
            message.what = 23;
            bundle.putBoolean("crop_param_open", z);
            message.obj = bundle;
            this.LJ.sendMessage(message);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0obT, X.0ocI, X.0od5] */
    public C1480450od1(final EnumC1479760obu enumC1479760obu, HandlerThread handlerThread, C1479510obV c1479510obV, InterfaceC1480550odB interfaceC1480550odB, InterfaceC1480330ocp interfaceC1480330ocp, C1480830odd c1480830odd, boolean z, final int i) {
        Looper looperW2;
        this.LJIILLIIL = false;
        ?? r2 = new C1480000ocI(enumC1479760obu, i) { // from class: X.0od5
            @Override // X.C1479490obT
            public final void LJIL(int i2) {
                if (((Boolean) C1474810oTv.LLLLLJIL.getValue()).booleanValue()) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onCodecChanged: ");
                        sbLIZ.append(this.LJJLIIIJJI.LJIIL);
                        sbLIZ.append(" -> ");
                        sbLIZ.append(i2);
                        C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    this.LJJLIIIJJI.LJIIL = i2;
                }
            }

            @Override // X.C1479490obT
            public final void LJJ(boolean z2) {
                String str;
                this.LJJLIIIJJI.LJIILIIL = z2;
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("codec hs updated：");
                    if (z2) {
                        str = "<hardware decode>";
                    } else {
                        str = "<software decode>";
                    }
                    sbLIZ.append(str);
                    C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        };
        this.LJFF = r2;
        r2.LJJIIZI = interfaceC1480330ocp;
        this.LIZJ = handlerThread;
        this.LJIIIIZZ = c1479510obV;
        this.LJIILLIIL = z;
        this.LIZIZ = c1479510obV != null ? c1479510obV.LLIIL : false;
        if (c1479510obV != null) {
            this.LIZ = c1479510obV.LJIIIZ;
            this.LJIIL = c1479510obV.LJIILIIL;
            this.LJIILJJIL = c1479510obV.LJJJZ;
            this.LJIILL = c1479510obV.LJJL;
        }
        if (C1474810oTv.LJLJLJ()) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySession", "play session use OrderlyHandler");
            }
            this.LJI = C1479940ocC.LIZ;
        } else {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySession", "play session use handler");
            }
            this.LJI = new PlayerMainHandler(Looper.getMainLooper());
        }
        if (handlerThread == null) {
            looperW2 = Looper.getMainLooper();
        } else {
            looperW2 = C786410Ut5.W2(handlerThread);
        }
        if (handlerThread == null && C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlaySession create play thread null, looper:");
            sbLIZ.append(looperW2);
            sbLIZ.append(", di:");
            sbLIZ.append(c1480830odd);
            C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (looperW2 == null && C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PlaySession create with looper null, playThread:");
            sbLIZ2.append(handlerThread);
            sbLIZ2.append(", di:");
            sbLIZ2.append(c1480830odd);
            C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LJ = new PlayHandler(new C1480510od7(this, interfaceC1480550odB), looperW2, r2);
    }
}
