package X;

import android.os.HandlerThread;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPerfAutoAdaptiveIntervalTime;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPerfAutoAdaptiveThreadOpt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.01hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C404401hi implements InterfaceC404601hk {
    public static final C01GW<C404401hi> LJFF = C452501pT.LIZ(EnumC452301pR.NONE, AnonymousClass0206.get$arr$(27));
    public C380401dq LIZIZ;
    public C381501e1 LIZJ;
    public boolean LJ;
    public final C1100730ekZ LIZ = new C1100730ekZ();
    public final C381901e5 LIZLLL = new C381901e5();

    public final void LJI() {
        C381501e1 c381501e1 = this.LIZJ;
        if (c381501e1 != null) {
            c381501e1.LIZJ = true;
            if (LiveBroadcastPerfAutoAdaptiveThreadOpt.getEnable()) {
                c381501e1.LJI++;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AutoAdaptiveCenter");
                sbLIZ.append(c381501e1.LJI);
                HandlerThread handlerThread = new HandlerThread(C2188811AlT.LIZIZ(sbLIZ));
                c381501e1.LJ = handlerThread;
                handlerThread.start();
                c381501e1.LJFF = new BPEAHandler(C786410Ut5.W2(handlerThread));
            }
        }
        LIZ(EnumC405401hs.COLLECT_DATA.ordinal(), LiveBroadcastPerfAutoAdaptiveIntervalTime.getValue(), null, true);
    }

    public final void LIZJ() {
        C381501e1 c381501e1 = this.LIZJ;
        if (c381501e1 != null) {
            c381501e1.LIZJ = false;
            if (LiveBroadcastPerfAutoAdaptiveThreadOpt.getEnable()) {
                BPEAHandler bPEAHandler = c381501e1.LJFF;
                if (bPEAHandler != null) {
                    bPEAHandler.removeCallbacksAndMessages(null);
                }
                HandlerThread handlerThread = c381501e1.LJ;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                c381501e1.LJFF = null;
                c381501e1.LJ = null;
            } else {
                C473410IhP.LIZ().removeCallbacks(c381501e1.LJII);
            }
            c381501e1.LIZLLL = null;
        }
    }

    public final void LJFF() {
        if (this.LJ) {
            C405701hv.LIZIZ(-1, 0, "end", "");
        }
        C381501e1 c381501e1 = this.LIZJ;
        if (c381501e1 != null) {
            c381501e1.LIZJ = false;
            c381501e1.LIZLLL = null;
            C380401dq c380401dq = c381501e1.LIZ;
            if (c380401dq != null) {
                LifecycleCoroutineScope lifecycleCoroutineScope = c380401dq.LIZ;
                if (lifecycleCoroutineScope != null) {
                    C2296808zG.LIZJ(lifecycleCoroutineScope, null);
                }
                c380401dq.LIZ = null;
                C2296808zG.LIZLLL(c380401dq.LIZJ, "TaskExecutor#release");
            }
            c381501e1.LIZ = null;
            C381901e5 c381901e5 = c381501e1.LIZIZ;
            if (c381901e5 != null) {
                ((LinkedHashMap) c381901e5.LIZ).clear();
                c381901e5.LIZIZ.clear();
                ((ArrayList) c381901e5.LIZJ).clear();
            }
            c381501e1.LIZIZ = null;
            if (LiveBroadcastPerfAutoAdaptiveThreadOpt.getEnable()) {
                BPEAHandler bPEAHandler = c381501e1.LJFF;
                if (bPEAHandler != null) {
                    bPEAHandler.removeCallbacksAndMessages(null);
                }
                HandlerThread handlerThread = c381501e1.LJ;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                c381501e1.LJFF = null;
                c381501e1.LJ = null;
            } else {
                C473410IhP.LIZ().removeCallbacks(c381501e1.LJII);
            }
            C20441214yg.LIZIZ("AutoAdaptiveCenter", "MessageHandler release.");
        }
        this.LIZJ = null;
        this.LIZIZ = null;
        C381901e5 c381901e52 = this.LIZLLL;
        ((LinkedHashMap) c381901e52.LIZ).clear();
        c381901e52.LIZIZ.clear();
        ((ArrayList) c381901e52.LIZJ).clear();
        C405701hv.LJ = null;
        ((LinkedHashMap) C405701hv.LJFF).clear();
        C405701hv.LJII = 1;
        C405701hv.LJIIIIZZ = "";
        C405701hv.LJIIIZ = "";
        ((ArrayList) this.LIZ.LIZ).clear();
    }

    public final void LJ(AbstractC405601hu abstractC405601hu) {
        C381901e5 c381901e5 = this.LIZLLL;
        new C5182020e(abstractC405601hu, 20);
        c381901e5.getClass();
        c381901e5.LIZIZ.add(abstractC405601hu);
    }

    public final void LJII(AbstractC405601hu abstractC405601hu) {
        C381901e5 c381901e5 = this.LIZLLL;
        new C5182020e(abstractC405601hu, 21);
        c381901e5.getClass();
        c381901e5.LIZIZ.remove(abstractC405601hu);
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, DataChannel dataChannel, boolean z) {
        LifecycleCoroutineScope lifecycleScope;
        if (lifecycleOwner != null) {
            lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
        } else {
            lifecycleScope = null;
        }
        this.LIZIZ = new C380401dq(lifecycleScope);
        this.LJ = z;
        C381901e5 c381901e5 = this.LIZLLL;
        c381901e5.LIZ(new C5182020e(this, 22));
        c381901e5.LIZ(new C020Y(this, c381901e5, 0));
        if (z) {
            C405701hv.LIZ = System.currentTimeMillis();
            C405701hv.LIZIZ = 1;
            C405701hv.LIZJ = "start";
            C405701hv.LIZLLL = 0;
            C405701hv.LJ = new WeakReference<>(dataChannel);
            C405701hv.LJFF = C2097608Jq.LJIIJ(new Pair("guide_animation", 0), new Pair("effect_insert", 0), new Pair("multi_guest", 0), new Pair("like_boom", 0), new Pair("self_like_bottom", 0), new Pair("self_like_avatar", 0));
            Object objInvoke = AnonymousClass0206.get$arr$(28).invoke();
            if (objInvoke != null) {
                ((ArrayList) c381901e5.LIZJ).add(objInvoke);
            }
            c381901e5.LIZ(new C020Y(this, c381901e5, 1));
        }
        this.LIZJ = new C381501e1(this.LIZIZ, this.LIZLLL);
    }

    public final void LIZLLL(int i, Object obj, boolean z) {
        C381501e1 c381501e1 = this.LIZJ;
        if (c381501e1 != null) {
            C381601e2 c381601e2 = new C381601e2(i, 0L, z, obj, 16);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MessageHandler postMessageAtFrontOfQueue messageType: ");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("AutoAdaptiveCenter", C2188811AlT.LIZIZ(sbLIZ));
            c381501e1.LIZJ(c381601e2);
            if (LiveBroadcastPerfAutoAdaptiveThreadOpt.getEnable()) {
                BPEAHandler bPEAHandler = c381501e1.LJFF;
                if (bPEAHandler != null) {
                    bPEAHandler.removeCallbacks(c381501e1.LJIIIIZZ);
                }
                BPEAHandler bPEAHandler2 = c381501e1.LJFF;
                if (bPEAHandler2 != null) {
                    C786410Ut5.LJLIIL(16L, bPEAHandler2, c381501e1.LJIIIIZZ);
                    return;
                }
                return;
            }
            C473410IhP.LIZ().removeCallbacks(c381501e1.LJII);
            C786410Ut5.LJLIIL(16L, C473410IhP.LIZ(), c381501e1.LJII);
        }
    }

    @Override // X.InterfaceC404601hk
    public final void LIZ(int i, long j, Object obj, boolean z) {
        C381501e1 c381501e1 = this.LIZJ;
        if (c381501e1 != null) {
            C381601e2 c381601e2 = new C381601e2(i, Math.max(j, 0L) + SystemClock.uptimeMillis(), z, obj, 16);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MessageHandler postMessage messageType: ");
            sbLIZ.append(i);
            sbLIZ.append(", delayTime: ");
            sbLIZ.append(j);
            C20441214yg.LIZIZ("AutoAdaptiveCenter", C2188811AlT.LIZIZ(sbLIZ));
            c381501e1.LIZJ(c381601e2);
            if (LiveBroadcastPerfAutoAdaptiveThreadOpt.getEnable()) {
                BPEAHandler bPEAHandler = c381501e1.LJFF;
                if (bPEAHandler != null) {
                    bPEAHandler.removeCallbacks(c381501e1.LJIIIIZZ);
                }
                BPEAHandler bPEAHandler2 = c381501e1.LJFF;
                if (bPEAHandler2 != null) {
                    C786410Ut5.LJLIIL(16L, bPEAHandler2, c381501e1.LJIIIIZZ);
                    return;
                }
                return;
            }
            C473410IhP.LIZ().removeCallbacks(c381501e1.LJII);
            C786410Ut5.LJLIIL(16L, C473410IhP.LIZ(), c381501e1.LJII);
        }
    }
}
