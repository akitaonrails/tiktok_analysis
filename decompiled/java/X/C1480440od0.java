package X;

import Y.ARunnableS123S0100000_23;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
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

/* JADX INFO: renamed from: X.0od0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1480440od0 implements InterfaceC1480710odR {
    public String LIZ;
    public boolean LIZIZ;
    public final HandlerThread LIZJ;
    public final PlayHandler LJ;
    public final C1480540odA LJFF;
    public final C1480500od6 LJI;
    public final BPEAHandler LJII;
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
    public final C1480460od2 LJIJJLI;
    public final C1480580odE LJIL;
    public final C1480600odG LJJ;
    public final C1473010oR1 LIZLLL = new C1473010oR1();
    public volatile boolean LJIILIIL = true;
    public boolean LJIIZILJ = false;
    public final AtomicInteger LJIJ = new AtomicInteger(0);
    public boolean LJJI = false;

    @Override // X.InterfaceC1480710odR
    public boolean LJJ() {
        return this instanceof C1480590odF;
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
        C1480500od6 c1480500od6 = this.LJI;
        if (c1480500od6 != null) {
            return c1480500od6.LJIIIIZZ();
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
                C1480460od2 c1480460od2 = this.LJIJJLI;
                HandlerThread handlerThread = this.LIZJ;
                int i = playerSessionThreadPriorityConfigLLILLIZIL.recycleStory;
                c1480460od2.getClass();
                C1480460od2.LIZIZ(handlerThread, 4, i);
            }
        } else {
            C1480460od2 c1480460od22 = this.LJIJJLI;
            HandlerThread handlerThread2 = this.LIZJ;
            boolean z = this.LJIILLIIL;
            c1480460od22.getClass();
            C1480460od2.LIZ(handlerThread2, 4, messageObtainMessage, z);
        }
        LJJIFFI();
        LJJIIZI();
        messageObtainMessage.sendToTarget();
    }

    public final void LJJI() {
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
        C1480500od6 c1480500od6 = this.LJI;
        if (c1480500od6 != null) {
            return c1480500od6.LJJLI();
        }
        return 0;
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJLIIIJL() {
        LJJLIIIJL();
    }

    @Override // X.InterfaceC1480710odR
    public final int LJJLIIJ() {
        return this.LJI.LJIILL;
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
        return this.LJI.LJFF;
    }

    @Override // X.InterfaceC1480710odR
    public final int getSessionId() {
        C1480500od6 c1480500od6 = this.LJI;
        if (c1480500od6 != null) {
            return c1480500od6.LIZ;
        }
        return -1;
    }

    @Override // X.InterfaceC1480710odR
    public final int getState() {
        return this.LJI.LJIJI;
    }

    @Override // X.InterfaceC1480710odR
    public final C1471500oOa getVideoInfo() {
        C1480500od6 c1480500od6 = this.LJI;
        if (c1480500od6 != null) {
            return c1480500od6.getVideoInfo();
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
    public final void release() {
        C1480600odG c1480600odG = this.LJJ;
        c1480600odG.getClass();
        if (C1474810oTv.LIZ()) {
            C1481110oe5.LIZJ(Log.getStackTraceString(new Throwable()));
        }
        Message messageObtainMessage = c1480600odG.LIZ.LJ.obtainMessage(7);
        if (1 == C1474810oTv.LLILLL()) {
            messageObtainMessage.obj = Boolean.TRUE;
        }
        if (1 == C1474810oTv.LLILLJJLI()) {
            PlayerSessionThreadPriorityConfig playerSessionThreadPriorityConfigLLILLIZIL = C1474810oTv.LLILLIZIL();
            if (playerSessionThreadPriorityConfigLLILLIZIL != null) {
                C1480440od0 c1480440od0 = c1480600odG.LIZ;
                C1480460od2 c1480460od2 = c1480440od0.LJIJJLI;
                HandlerThread handlerThread = c1480440od0.LIZJ;
                int i = playerSessionThreadPriorityConfigLLILLIZIL.releaseStory;
                c1480460od2.getClass();
                C1480460od2.LIZIZ(handlerThread, 3, i);
            }
        } else {
            C1480440od0 c1480440od02 = c1480600odG.LIZ;
            C1480460od2 c1480460od22 = c1480440od02.LJIJJLI;
            HandlerThread handlerThread2 = c1480440od02.LIZJ;
            boolean z = c1480440od02.LJIILLIIL;
            c1480460od22.getClass();
            C1480460od2.LIZ(handlerThread2, 3, messageObtainMessage, z);
        }
        c1480600odG.LIZ.LJI.LJJJIL(true);
        c1480600odG.LIZ.LJ.removeCallbacksAndMessages(null);
        if (!((Boolean) C1474810oTv.s4.getValue()).booleanValue()) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySession", "transfer signal, disable delay release, normal release");
            }
            messageObtainMessage.sendToTarget();
        } else if (c1480600odG.LIZ.LIZLLL.LIZ) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySession", "transfer signal, enable delay release, delay");
            }
            c1480600odG.LIZ.LJ.sendMessageDelayed(messageObtainMessage, ((Number) C1474810oTv.t4.getValue()).intValue());
        } else {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySession", "transfer signal, enable delay release, not scrolling, normal release");
            }
            messageObtainMessage.sendToTarget();
        }
        c1480600odG.LIZ.LJIIIZ = true;
    }

    @Override // X.InterfaceC1480710odR
    public final void resume() {
        this.LJ.obtainMessage(4).sendToTarget();
    }

    @Override // X.InterfaceC1480710odR
    public final void start() {
        this.LJ.sendEmptyMessage(3);
    }

    public final void LJJIFFI() {
        if (C1474810oTv.LIZ()) {
            C1481110oe5.LIZJ(Log.getStackTraceString(new Throwable()));
        }
        ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(this, 145);
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
            C0C83.INS.runOnMsg(new ARunnableS123S0100000_23(this, 148));
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
    public final void reset() {
        LJJIFFI();
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
        C1480500od6 c1480500od6 = this.LJI;
        if (c1480500od6 == null) {
            return (T) abstractC586270Mz3.LIZ();
        }
        return (T) c1480500od6.LIZIZ(abstractC586270Mz3);
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
        this.LJI.LJJIIJ = onUIPlayListener;
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJIJIIJI(int i) {
        this.LJ.LJ(i);
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJIJL(InterfaceC1472010oPP interfaceC1472010oPP) {
        C1480540odA c1480540odA = this.LJFF;
        if (c1480540odA.LIZIZ != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 2;
            message.obj = interfaceC1472010oPP;
            c1480540odA.LIZ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJIJLIJ(boolean z) {
        C1480540odA c1480540odA = this.LJFF;
        if (c1480540odA.LIZIZ != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 1;
            message.arg2 = z ? 1 : 0;
            c1480540odA.LIZ.sendMessage(message);
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
        C1480540odA c1480540odA = this.LJFF;
        if (c1480540odA.LIZIZ != null) {
            Message message = new Message();
            message.what = 22;
            message.arg1 = 0;
            message.obj = str;
            c1480540odA.LIZ.sendMessage(message);
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
        C1480540odA c1480540odA = this.LJFF;
        if (c1480540odA.LIZIZ != null) {
            Message message = new Message();
            message.what = 22;
            message.arg1 = 2;
            message.obj = interfaceC1471920oPG;
            c1480540odA.LIZ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJLIIIJJI(int i) {
        C1480540odA c1480540odA = this.LJFF;
        if (c1480540odA.LIZIZ != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 0;
            message.arg2 = i;
            c1480540odA.LIZ.sendMessage(message);
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
        C1480500od6 c1480500od6 = this.LJI;
        if (c1480500od6 != null) {
            c1480500od6.LJJIJ = interfaceC1480060ocO;
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJZZIII(InterfaceC1284280jWc interfaceC1284280jWc) {
        LJJZZIII(interfaceC1284280jWc);
    }

    @Override // X.InterfaceC1480710odR
    public final void LJL(Bundle bundle) {
        C1480540odA c1480540odA = this.LJFF;
        if (c1480540odA.LIZIZ != null) {
            Message message = new Message();
            message.what = 27;
            message.obj = bundle;
            c1480540odA.LIZ.sendMessage(message);
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
        this.LJI.LJJIIZI = interfaceC1480330ocp;
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLIL(C1479510obV c1479510obV) {
        final boolean z;
        String strategyTokens;
        OnUIPlayListener onUIPlayListener;
        int i;
        boolean z2;
        C1480580odE c1480580odE = this.LJIL;
        C1479510obV c1479510obV2 = c1480580odE.LIZ.LJIIIIZZ;
        if (c1479510obV2 != null && c1479510obV2.LJJI && c1479510obV != null && !c1479510obV.LJJI && TextUtils.equals(c1479510obV.LJIIIZ, c1479510obV2.LJIIIZ)) {
            c1479510obV.LJZL = c1480580odE.LIZ.LJIIIIZZ.LJZL;
            z = true;
        } else {
            z = false;
        }
        C1480440od0 c1480440od0 = c1480580odE.LIZ;
        c1480440od0.LJIIIIZZ = c1479510obV;
        c1479510obV.LLIIIZ = c1480440od0.LJIILLIIL;
        c1480440od0.LIZIZ = c1479510obV.LLIIL;
        c1480440od0.LIZ = c1479510obV.LJIIIZ;
        c1480440od0.LJIIZILJ = c1479510obV.LJJJJL;
        c1480440od0.LJIIL = c1479510obV.LJIILIIL;
        C1480440od0 c1480440od02 = c1480580odE.LIZ;
        C1479510obV c1479510obV3 = c1480440od02.LJIIIIZZ;
        c1480440od02.LJIILJJIL = c1479510obV3.LJJJZ;
        c1480440od02.LJIILL = c1479510obV3.LJJL;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlaySession-prepare:");
            sbLIZ.append(c1480580odE.LIZ.LIZ);
            sbLIZ.append("; wh(");
            sbLIZ.append(c1480580odE.LIZ.LJIILJJIL);
            sbLIZ.append(", ");
            sbLIZ.append(c1480580odE.LIZ.LJIILL);
            sbLIZ.append(")");
            C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1480440od0 c1480440od03 = c1480580odE.LIZ;
        C1479510obV c1479510obV4 = c1480440od03.LJIIIIZZ;
        if (!c1479510obV4.LJJI) {
            boolean z3 = c1480440od03.LJJI;
            if (c1479510obV4.LJLJLJ == -1) {
                c1479510obV4.LJLJLJ = z3 ? 1 : 0;
            }
            c1480440od03.LJJI = true;
        }
        final C1480580odE c1480580odE2 = c1480440od03.LJIL;
        if (C1481110oe5.LIZ) {
            c1480580odE2.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PlaySession prepare ");
            sbLIZ2.append(SystemClock.elapsedRealtime());
            sbLIZ2.append(" sourceId ");
            sbLIZ2.append(c1480580odE2.LIZ.LIZ);
            sbLIZ2.append(", prepare: ");
            if (c1480580odE2.LIZ.LJIIIIZZ == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ2.append(z2);
            sbLIZ2.append("  ");
            sbLIZ2.append(c1480580odE2.LIZ.LJIIIZ);
            sbLIZ2.append(" ");
            sbLIZ2.append(c1480580odE2.LIZ.LJIIJ);
            C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1480440od0 c1480440od04 = c1480580odE2.LIZ;
        C1479510obV c1479510obV5 = c1480440od04.LJIIIIZZ;
        if (c1479510obV5 != null && !c1480440od04.LJIIIZ && !c1480440od04.LJIIJ) {
            if (c1479510obV5.LJJI && c1479510obV5.LLIIIILZ) {
                if (1 == C1474810oTv.LLILLJJLI()) {
                    PlayerSessionThreadPriorityConfig playerSessionThreadPriorityConfigLLILLIZIL = C1474810oTv.LLILLIZIL();
                    if (playerSessionThreadPriorityConfigLLILLIZIL != null) {
                        C1480440od0 c1480440od05 = c1480580odE2.LIZ;
                        C1480460od2 c1480460od2 = c1480440od05.LJIJJLI;
                        HandlerThread handlerThread = c1480440od05.LIZJ;
                        int i2 = playerSessionThreadPriorityConfigLLILLIZIL.preprepareStory;
                        c1480460od2.getClass();
                        C1480460od2.LIZIZ(handlerThread, 2, i2);
                    }
                } else {
                    C1480440od0 c1480440od06 = c1480580odE2.LIZ;
                    C1480460od2 c1480460od22 = c1480440od06.LJIJJLI;
                    HandlerThread handlerThread2 = c1480440od06.LIZJ;
                    c1480460od22.getClass();
                    C1480460od2.LIZIZ(handlerThread2, 2, 10);
                }
            } else if (1 == C1474810oTv.LLILLJJLI()) {
                PlayerSessionThreadPriorityConfig playerSessionThreadPriorityConfigLLILLIZIL2 = C1474810oTv.LLILLIZIL();
                if (playerSessionThreadPriorityConfigLLILLIZIL2 != null) {
                    C1480440od0 c1480440od07 = c1480580odE2.LIZ;
                    C1480460od2 c1480460od23 = c1480440od07.LJIJJLI;
                    HandlerThread handlerThread3 = c1480440od07.LIZJ;
                    int i3 = playerSessionThreadPriorityConfigLLILLIZIL2.prepareStory;
                    c1480460od23.getClass();
                    C1480460od2.LIZIZ(handlerThread3, 1, i3);
                }
            } else {
                C1480440od0 c1480440od08 = c1480580odE2.LIZ;
                C1480460od2 c1480460od24 = c1480440od08.LJIJJLI;
                HandlerThread handlerThread4 = c1480440od08.LIZJ;
                c1480460od24.getClass();
                C1480460od2.LIZIZ(handlerThread4, 1, 0);
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1473210oRL c1473210oRL = c1480580odE2.LIZ.LJIIIIZZ.LJIJJLI;
            if (c1473210oRL == null) {
                strategyTokens = null;
            } else {
                strategyTokens = c1473210oRL.getStrategyTokens();
            }
            C1480440od0 c1480440od09 = c1480580odE2.LIZ;
            if (!c1480440od09.LJIIIIZZ.LJJI) {
                InterfaceC1480060ocO interfaceC1480060ocO = c1480440od09.LJIJI;
                String str = c1480440od09.LIZ;
                if (interfaceC1480060ocO != null && !TextUtils.isEmpty(str) && jCurrentTimeMillis > 0) {
                    interfaceC1480060ocO.LIZIZ(2, jCurrentTimeMillis, str);
                }
            }
            c1480580odE2.LIZ.LJ.removeCallbacks(null);
            C1479510obV c1479510obV6 = c1480580odE2.LIZ.LJIIIIZZ;
            if (c1479510obV6.LJJIJIIJI && !C1479780obw.LIZ(c1479510obV6)) {
                if (c1480580odE2.LIZ.LJIIIIZZ.LJLJJLL && !((Boolean) C1474810oTv.g0.getValue()).booleanValue() && !C1474810oTv.LLJJJ()) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySession", "MessageQueueOptService onpreapreplay callback");
                    }
                    WeakReference<OnUIPlayListener> weakReference = c1480580odE2.LIZ.LJIIJJI;
                    if (weakReference != null && (onUIPlayListener = weakReference.get()) != null) {
                        onUIPlayListener.onPreparePlay(c1480580odE2.LIZ.LIZ);
                        C1480430ocz c1480430ocz = new C1480430ocz(c1480580odE2.LIZ.LIZ);
                        c1480430ocz.LIZ(strategyTokens);
                        c1480430ocz.LJII = c1480580odE2.LIZ.isMute();
                        c1480430ocz.LIZLLL = jCurrentTimeMillis;
                        c1480430ocz.LJFF = jCurrentTimeMillis;
                        c1480430ocz.LJ = jElapsedRealtime;
                        if (z) {
                            i = 2;
                        } else {
                            i = 3;
                        }
                        c1480430ocz.LJIIJ = i;
                        C1480440od0 c1480440od010 = c1480580odE2.LIZ;
                        c1480430ocz.LJI = c1480440od010.LIZIZ;
                        C1479510obV c1479510obV7 = c1480440od010.LJIIIIZZ;
                        c1480430ocz.LJIILJJIL = c1479510obV7.LLJILLL;
                        c1480430ocz.LJIIIIZZ = c1479510obV7.LJJJJLI;
                        c1480430ocz.LJIIJJI = c1479510obV7.LJZL;
                        c1480430ocz.LJIILLIIL = c1479510obV7.LJJJJLL;
                        try {
                            onUIPlayListener.onPreparePlay(c1480440od010.LIZ, c1480430ocz);
                        } catch (AbstractMethodError e) {
                            TryCatchGuardChecker.doCheck(e);
                            e.printStackTrace();
                        }
                    }
                } else {
                    C1480440od0 c1480440od011 = c1480580odE2.LIZ;
                    if (c1480440od011.LJIIJJI != null) {
                        final C1480430ocz c1480430ocz2 = new C1480430ocz(c1480440od011.LIZ);
                        c1480430ocz2.LJII = c1480580odE2.LIZ.isMute();
                        c1480430ocz2.LIZ(strategyTokens);
                        C786410Ut5.LJJZZIII(c1480580odE2.LIZ.LJII, new Runnable() { // from class: X.0od3
                            public final void LIZ() {
                                OnUIPlayListener onUIPlayListener2;
                                WeakReference<OnUIPlayListener> weakReference2 = c1480580odE2.LIZ.LJIIJJI;
                                if (weakReference2 == null || (onUIPlayListener2 = weakReference2.get()) == null) {
                                    return;
                                }
                                onUIPlayListener2.onPreparePlay(c1480580odE2.LIZ.LIZ);
                                C1480430ocz c1480430ocz3 = c1480430ocz2;
                                long j = jCurrentTimeMillis;
                                c1480430ocz3.LIZLLL = j;
                                c1480430ocz3.LJFF = j;
                                c1480430ocz3.LJ = jElapsedRealtime;
                                c1480430ocz3.LJIIJ = z ? 2 : 3;
                                C1480440od0 c1480440od012 = c1480580odE2.LIZ;
                                c1480430ocz3.LJI = c1480440od012.LIZIZ;
                                C1479510obV c1479510obV8 = c1480440od012.LJIIIIZZ;
                                c1480430ocz3.LJIILJJIL = c1479510obV8.LLJILLL;
                                c1480430ocz3.LJIIIIZZ = c1479510obV8.LJJJJLI;
                                c1480430ocz3.LJIIJJI = c1479510obV8.LJZL;
                                c1480430ocz3.LJIILLIIL = c1479510obV8.LJJJJLL;
                                try {
                                    onUIPlayListener2.onPreparePlay(c1480440od012.LIZ, c1480430ocz3);
                                } catch (AbstractMethodError e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    e2.printStackTrace();
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("PlaySessionPrepareHelper@85e8.prepare$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("PlaySessionPrepareHelper@85e8.prepare$1");
                            }
                        });
                    }
                }
            }
            C1480440od0 c1480440od012 = c1480580odE2.LIZ;
            C1479510obV c1479510obV8 = c1480440od012.LJIIIIZZ;
            c1479510obV8.LLJJJ = c1480440od012.LIZLLL;
            c1479510obV8.LJIJJ = 3;
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySession", C786410Ut5.j4("transfer signal, PlaySession modify prepareData, aid:%s, prerender?%s, isScrolling:%s", new Object[]{c1479510obV8.LJIIIZ, Boolean.valueOf(c1479510obV8.LJJI), Boolean.valueOf(c1480580odE2.LIZ.LIZLLL.LIZ)}));
            }
            C1480440od0 c1480440od013 = c1480580odE2.LIZ;
            c1480440od013.LJ.obtainMessage(1, c1480440od013.LJIIIIZZ).sendToTarget();
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLILLLLZI(InterfaceC1499700p84 interfaceC1499700p84) {
        C1480540odA c1480540odA = this.LJFF;
        if (c1480540odA.LIZIZ != null) {
            Message message = new Message();
            message.what = 26;
            message.obj = interfaceC1499700p84;
            c1480540odA.LIZ.sendMessage(message);
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

    @Override // X.InterfaceC1480710odR
    public final void LJJJZ(int i, JSONObject jSONObject) {
        C1480540odA c1480540odA = this.LJFF;
        if (c1480540odA.LIZIZ != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 3;
            message.arg2 = i;
            message.obj = jSONObject;
            c1480540odA.LIZ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJLIIIJILLIZJL(String str, String str2) {
        C1480500od6 c1480500od6 = this.LJI;
        if (c1480500od6 != null) {
            c1480500od6.LJJLIIIJILLIZJL(str, str2);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJLIIIJJIZ(String str, boolean z) {
        this.LJ.obtainMessage(28, new Pair(str, Boolean.valueOf(z))).sendToTarget();
    }

    @Override // X.InterfaceC1480710odR
    public final void LJJZ(int i, Bundle bundle) {
        C1480540odA c1480540odA = this.LJFF;
        if (c1480540odA.LIZIZ != null) {
            Message message = new Message();
            message.what = 24;
            bundle.putInt("texture_layout_param", i);
            message.obj = bundle;
            c1480540odA.LIZ.sendMessage(message);
        }
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLJJLL(int i, int i2) {
        this.LJ.obtainMessage(13, new Pair(Integer.valueOf(i), Integer.valueOf(i2))).sendToTarget();
    }

    @Override // X.InterfaceC1480710odR
    public final void LJLJL(Bundle bundle, boolean z) {
        C1480540odA c1480540odA = this.LJFF;
        if (c1480540odA.LIZIZ != null) {
            Message message = new Message();
            message.what = 23;
            bundle.putBoolean("crop_param_open", z);
            message.obj = bundle;
            c1480540odA.LIZ.sendMessage(message);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0obT, X.0ocI, X.0od6] */
    public C1480440od0(final EnumC1479760obu enumC1479760obu, HandlerThread handlerThread, C1479510obV c1479510obV, InterfaceC1480570odD interfaceC1480570odD, InterfaceC1480330ocp interfaceC1480330ocp, C1480840ode c1480840ode, boolean z, final int i) {
        Looper looperW2;
        this.LJIILLIIL = false;
        ?? r2 = new C1480000ocI(enumC1479760obu, i) { // from class: X.0od6
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
        this.LJI = r2;
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
            this.LJII = C1479940ocC.LIZ;
        } else {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySession", "play session use handler");
            }
            this.LJII = new PlayerMainHandler(Looper.getMainLooper());
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
            sbLIZ.append(c1480840ode);
            C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (looperW2 == null && C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PlaySession create with looper null, playThread:");
            sbLIZ2.append(handlerThread);
            sbLIZ2.append(", di:");
            sbLIZ2.append(c1480840ode);
            C1481110oe5.LIZIZ("PlaySession", C2188811AlT.LIZIZ(sbLIZ2));
        }
        PlayHandler playHandler = new PlayHandler(new C1480520od8(this, interfaceC1480570odD), looperW2, r2);
        this.LJ = playHandler;
        this.LJIJJLI = new C1480460od2();
        this.LJFF = new C1480540odA(playHandler, r2);
        this.LJIL = new C1480580odE(this);
        this.LJJ = new C1480600odG(this);
    }
}
