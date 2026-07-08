package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.v3.PlaySessionManager;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0odQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1480700odQ implements InterfaceC1479560oba {
    public final InterfaceC1480720odS LIZ;
    public InterfaceC1480710odR LIZIZ;
    public Surface LIZJ;
    public WeakReference<OnUIPlayListener> LIZLLL;
    public InterfaceC1472490oQB LJ;
    public InterfaceC1480320oco LJFF;
    public InterfaceC1472880oQo LJI;
    public InterfaceC1284280jWc LJII;
    public InterfaceC1480060ocO LJIIIIZZ;
    public InterfaceC1472010oPP LJIIIZ;

    @Override // X.InterfaceC1479560oba
    public final void LJLLI() {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJLLILLLL() {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJLLLL(EnumC1473260oRQ enumC1473260oRQ) {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJLLLLLL(int i) {
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJ() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        return interfaceC1480710odR != null && interfaceC1480710odR.LJ();
    }

    public final String LJII() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        return interfaceC1480710odR != null ? interfaceC1480710odR.getKey() : "null";
    }

    @Override // X.InterfaceC1479560oba
    public final C1472440oQ6 LJIIIIZZ() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            return interfaceC1480710odR.LJIIIIZZ();
        }
        return null;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIIZ() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJIIZ();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIIZI() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJIIZI();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJJIJIIJIL() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        return interfaceC1480710odR != null && interfaceC1480710odR.LJJIJIIJIL();
    }

    @Override // X.InterfaceC1479560oba
    public final int LJJIJIL() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            return interfaceC1480710odR.LJJIJIL();
        }
        return -1;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJJLZIJ() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJJLZIJ();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final int LJJLI() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            return interfaceC1480710odR.LJJLI();
        }
        return 0;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJL() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJLIIIJL();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJLJLI() {
        InterfaceC1480720odS interfaceC1480720odS = this.LIZ;
        if (interfaceC1480720odS != null) {
            interfaceC1480720odS.LJJLIIIJLJLI();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final int LJJLIIJ() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            return interfaceC1480710odR.LJJLIIJ();
        }
        return 0;
    }

    @Override // X.InterfaceC1479560oba
    public final String LJLJLJ() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            return interfaceC1480710odR.LJLJLJ();
        }
        return null;
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJLJLLL() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        return interfaceC1480710odR != null && interfaceC1480710odR.LJLJLLL();
    }

    @Override // X.InterfaceC1479560oba
    public final long getCurrentPosition() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            return interfaceC1480710odR.getCurrentPosition();
        }
        return 0L;
    }

    @Override // X.InterfaceC1479560oba
    public final long getDuration() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            return interfaceC1480710odR.getDuration();
        }
        return 0L;
    }

    @Override // X.InterfaceC1479560oba
    public final EnumC1479760obu getPlayerType() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        return interfaceC1480710odR != null ? interfaceC1480710odR.getPlayerType() : EnumC1479760obu.TT;
    }

    @Override // X.InterfaceC1479560oba
    public final int getState() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            return interfaceC1480710odR.getState();
        }
        return 0;
    }

    @Override // X.InterfaceC1479560oba
    public final C1471500oOa getVideoInfo() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            return interfaceC1480710odR.getVideoInfo();
        }
        return null;
    }

    @Override // X.InterfaceC1479560oba
    public final void init() {
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", "init()");
        }
        InterfaceC1480710odR interfaceC1480710odRLJI = this.LIZIZ;
        if (interfaceC1480710odRLJI == null) {
            interfaceC1480710odRLJI = this.LIZ.LJI();
            this.LIZIZ = interfaceC1480710odRLJI;
            if (interfaceC1480710odRLJI == null) {
                return;
            }
        }
        InterfaceC1472880oQo interfaceC1472880oQo = this.LJI;
        if (interfaceC1472880oQo != null) {
            interfaceC1480710odRLJI.LJLIIIL(interfaceC1472880oQo);
        }
        InterfaceC1284280jWc interfaceC1284280jWc = this.LJII;
        if (interfaceC1284280jWc != null) {
            interfaceC1480710odRLJI.LJJZZIII(interfaceC1284280jWc);
        }
        interfaceC1480710odRLJI.LJIJJLI();
    }

    @Override // X.InterfaceC1479560oba
    public final boolean isLoading() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        return interfaceC1480710odR != null && interfaceC1480710odR.isLoading();
    }

    @Override // X.InterfaceC1479560oba
    public final boolean isMute() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        return interfaceC1480710odR != null && interfaceC1480710odR.isMute();
    }

    @Override // X.InterfaceC1479560oba
    public final boolean isPaused() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        return interfaceC1480710odR != null && interfaceC1480710odR.isPaused();
    }

    @Override // X.InterfaceC1479560oba
    public final boolean isPlaying() {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        return interfaceC1480710odR != null && interfaceC1480710odR.isPlaying();
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sleep()");
        sbLIZ.append(LJII());
        C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJJ();
        }
        if (((Boolean) C1474810oTv.LJLLLL.getValue()).booleanValue()) {
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", "sleep : release background session");
            this.LIZ.LJIIL();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLJLI() {
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("render");
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("render() ");
            sbLIZ.append(LJII());
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJLJLI();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLL() {
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("initNextSession");
        }
        SimRadar.keyScan("SimplifyAsyncPlayerV3", "initNextSession", new Object[0]);
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", "initNextSession()");
        }
        InterfaceC1480710odR interfaceC1480710odRLIZLLL = this.LIZ.LIZLLL();
        if (interfaceC1480710odRLIZLLL != null) {
            interfaceC1480710odRLIZLLL.LJLIIIL(null);
            InterfaceC1284280jWc interfaceC1284280jWc = this.LJII;
            if (interfaceC1284280jWc != null) {
                interfaceC1480710odRLIZLLL.LJJZZIII(interfaceC1284280jWc);
            }
            interfaceC1480710odRLIZLLL.LJIJJLI();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void pause() {
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("pause");
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pause() ");
            sbLIZ.append(LJII());
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.pause();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void release() {
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("release");
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release() ");
            sbLIZ.append(LJII());
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ.release();
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIZ = null;
    }

    @Override // X.InterfaceC1479560oba
    public final void resume() {
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("resume()");
        }
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", "resume() ");
        }
        InterfaceC1480720odS interfaceC1480720odS = this.LIZ;
        if (interfaceC1480720odS != null) {
            interfaceC1480720odS.LJIIIIZZ();
        }
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.resume();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void start() {
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("start");
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start() key:");
            sbLIZ.append(LJII());
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1480720odS interfaceC1480720odS = this.LIZ;
        if (interfaceC1480720odS != null) {
            interfaceC1480720odS.LJIIIIZZ();
        }
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.start();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void stop() {
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("stop");
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop()");
            sbLIZ.append(LJII());
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.reset();
        }
    }

    public static void LJIIIZ(String str) {
        C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", str);
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
        if (stackTrace != null && stackTrace.length > 0) {
            int length = stackTrace.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                int i3 = i2 + 1;
                if (i2 >= 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("    ");
                    sbLIZ.append(stackTraceElement.toString());
                    C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
                }
                i++;
                i2 = i3;
            }
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LIZ(boolean z) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LIZ(z);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final <T> T LIZIZ(AbstractC586270Mz3<T> abstractC586270Mz3) {
        List<InterfaceC1480710odR> listLJIIIZ;
        if (abstractC586270Mz3 instanceof C582770MtP) {
            this.LIZ.clean();
            return (T) abstractC586270Mz3.LIZ();
        }
        if (abstractC586270Mz3 instanceof C1472470oQ9) {
            InterfaceC1480720odS interfaceC1480720odS = this.LIZ;
            if (interfaceC1480720odS != null && interfaceC1480720odS.LJIIJJI() != null && this.LIZ.LJIIJJI().size() > 0) {
                Iterator<InterfaceC1480710odR> it2 = this.LIZ.LJIIJJI().iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(abstractC586270Mz3);
                }
            }
            return (T) abstractC586270Mz3.LIZ();
        }
        if (abstractC586270Mz3 instanceof C1472380oQ0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC1480720odS interfaceC1480720odS2 = this.LIZ;
            if (interfaceC1480720odS2 == null) {
                listLJIIIZ = new ArrayList<>();
            } else {
                listLJIIIZ = interfaceC1480720odS2.LJIIIZ();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("transfer signal, get playSessions time cost:");
                sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                sbLIZ.append(", size:");
                sbLIZ.append(listLJIIIZ.size());
                C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!listLJIIIZ.isEmpty()) {
                Iterator<InterfaceC1480710odR> it3 = listLJIIIZ.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZIZ(abstractC586270Mz3);
                }
            }
            return (T) abstractC586270Mz3.LIZ();
        }
        if (abstractC586270Mz3 instanceof C1472410oQ3) {
            InterfaceC1480720odS interfaceC1480720odS3 = this.LIZ;
            if (interfaceC1480720odS3 != null) {
                interfaceC1480720odS3.LJFF(((C1472410oQ3) abstractC586270Mz3).LIZJ);
            }
            return (T) abstractC586270Mz3.LIZ();
        }
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            return (T) interfaceC1480710odR.LIZIZ(abstractC586270Mz3);
        }
        return (T) abstractC586270Mz3.LIZ();
    }

    @Override // X.InterfaceC1479560oba
    public final void LIZJ(String str) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LIZJ(str);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final float LJFF(int i) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            return interfaceC1480710odR.LJFF(i);
        }
        return 0.0f;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJI(float f) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJI(f);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJIILL(float f) {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("seekTo() progress:");
            sbLIZ.append(f);
            sbLIZ.append(", key:");
            sbLIZ.append(LJII());
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJIILL(f);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIJ(OnUIPlayListener onUIPlayListener) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJIJ(onUIPlayListener);
        }
        this.LIZLLL = new WeakReference<>(onUIPlayListener);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIJIIJI(int i) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJIJIIJI(i);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIJL(InterfaceC1472010oPP interfaceC1472010oPP) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJIJL(interfaceC1472010oPP);
        }
        this.LJIIIZ = interfaceC1472010oPP;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIJLIJ(boolean z) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJIJLIJ(z);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIL(Surface surface) {
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("setSurfaceDirectly");
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSurfaceDirectly(), surface = ");
            sbLIZ.append(surface);
            sbLIZ.append(", mCurrentPlaySession = ");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(", ");
            sbLIZ.append(LJII());
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJIL(surface);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIZ(String str) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJIZ(str);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJL(SurfaceHolder surfaceHolder) {
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("setDisplay");
        }
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJL(surfaceHolder);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIIJ(String str) {
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("resume(1)");
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resume() ");
            sbLIZ.append(str);
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1480720odS interfaceC1480720odS = this.LIZ;
        if (interfaceC1480720odS != null) {
            interfaceC1480720odS.LJIIIIZZ();
        }
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJLIIIIJ(str);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJ(InterfaceC1471920oPG interfaceC1471920oPG) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJLIIIJ(interfaceC1471920oPG);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJJI(int i) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJLIIIJJI(i);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJJLIIIJLLLLLLLZ(String str) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null && interfaceC1480710odR.LJJLIIIJLLLLLLLZ(str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJJLIL(String str) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null && interfaceC1480710odR.LJJLIL(str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJJLJ(String str) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null && interfaceC1480710odR.LJJLJ(str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLL(InterfaceC1480060ocO interfaceC1480060ocO) {
        this.LJIIIIZZ = interfaceC1480060ocO;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJZZI(InterfaceC1472880oQo interfaceC1472880oQo) {
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("preCreateAheadSession");
        }
        this.LIZ.LIZIZ(interfaceC1472880oQo);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJZZIII(InterfaceC1284280jWc interfaceC1284280jWc) {
        this.LJII = interfaceC1284280jWc;
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJZZIII(interfaceC1284280jWc);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJL(Bundle bundle) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJL(bundle);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLI(InterfaceC1480320oco interfaceC1480320oco) {
        this.LJFF = interfaceC1480320oco;
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJLI(interfaceC1480320oco);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLIIIL(InterfaceC1472880oQo interfaceC1472880oQo) {
        this.LJI = interfaceC1472880oQo;
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJLIIIL(interfaceC1472880oQo);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLIIL(InterfaceC1480330ocp interfaceC1480330ocp) {
        this.LIZ.LJIIJ(interfaceC1480330ocp);
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJLIIL(interfaceC1480330ocp);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLIL(C1479510obV c1479510obV) {
        OnUIPlayListener onUIPlayListener;
        String str;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prepare : thread(");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append(") , ");
            if (c1479510obV != null) {
                str = c1479510obV.LJIIIZ;
            } else {
                str = "null";
            }
            sbLIZ.append(str);
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("prepare");
        }
        if (c1479510obV != null && this.LIZ != null) {
            if (!c1479510obV.LJJI) {
                InterfaceC1480060ocO interfaceC1480060ocO = this.LJIIIIZZ;
                String str2 = c1479510obV.LJIIIZ;
                if (interfaceC1480060ocO != null && !TextUtils.isEmpty(str2)) {
                    interfaceC1480060ocO.LIZIZ(5, System.currentTimeMillis(), str2);
                }
            }
            if (C1474810oTv.LJZI() == 2) {
                StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
                if (stackTrace.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append("\n");
                    }
                    c1479510obV.LLIIZ = sb.toString();
                }
            }
            c1479510obV.LJZI = 3;
            WeakReference<OnUIPlayListener> weakReference = this.LIZLLL;
            if (weakReference != null) {
                onUIPlayListener = weakReference.get();
            } else {
                onUIPlayListener = null;
            }
            if (C1480850odf.LIZJ.isPrerenderSurfaceSlowSetFix() || c1479510obV.LJJJJI) {
                C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", "fix prerender surface slow : fill surface before startSession");
                c1479510obV.LJJIFFI = this.LIZJ;
            }
            this.LIZ.LJIILIIL(c1479510obV, onUIPlayListener, this.LJIIIIZZ);
            InterfaceC1480710odR interfaceC1480710odRLJ = this.LIZ.LJ();
            this.LIZIZ = interfaceC1480710odRLJ;
            if (interfaceC1480710odRLJ != null) {
                InterfaceC1284280jWc interfaceC1284280jWc = this.LJII;
                if (interfaceC1284280jWc != null) {
                    interfaceC1480710odRLJ.LJJZZIII(interfaceC1284280jWc);
                }
                Surface surface = this.LIZJ;
                if (surface != null) {
                    interfaceC1480710odRLJ.setSurface(surface);
                    this.LIZJ = null;
                }
                InterfaceC1472490oQB interfaceC1472490oQB = this.LJ;
                if (interfaceC1472490oQB != null) {
                    interfaceC1480710odRLJ.LJLJJL(interfaceC1472490oQB);
                }
                InterfaceC1480320oco interfaceC1480320oco = this.LJFF;
                if (interfaceC1480320oco != null) {
                    interfaceC1480710odRLJ.LJLI(interfaceC1480320oco);
                }
                InterfaceC1472010oPP interfaceC1472010oPP = this.LJIIIZ;
                if (interfaceC1472010oPP != null) {
                    interfaceC1480710odRLJ.LJJIJL(interfaceC1472010oPP);
                    return;
                }
                return;
            }
            return;
        }
        SimRadar.errorScan("SimplifyAsyncPlayerV3", "prepare", new C1473290oRT("PrepareData or PlaySessionManager is null. Prepare failed."), c1479510obV, this.LIZ);
        SimRadar.analyzer().getClass();
        C1472910oQr.LIZIZ("SF-DataNull3");
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLILLLLZI(InterfaceC1499700p84 interfaceC1499700p84) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJLILLLLZI(interfaceC1499700p84);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJLJI(OnUIPlayListener onUIPlayListener) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR == null || interfaceC1480710odR.LJIIL() == null || this.LIZIZ.LJIIL().getWrapperedListener() == null || !this.LIZIZ.LJIIL().getWrapperedListener().equals(onUIPlayListener)) {
            WeakReference<OnUIPlayListener> weakReference = this.LIZLLL;
            if (weakReference != null && weakReference.get() != null && this.LIZLLL.get().getWrapperedListener() != null && this.LIZLLL.get().getWrapperedListener().equals(onUIPlayListener)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLJJI(C00UI c00ui) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJLJJI(c00ui);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLJJL(InterfaceC1472490oQB interfaceC1472490oQB) {
        this.LJ = interfaceC1472490oQB;
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJLJJL(interfaceC1472490oQB);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLLJ(C1479900oc8 c1479900oc8) {
        C1479980ocG.LIZ.LIZ = c1479900oc8;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLLL(C1479510obV c1479510obV) {
        InterfaceC1480720odS interfaceC1480720odS;
        String str;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("nextPrepare : thread(");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append(")");
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("nextPrepare");
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("nextPrepare()");
            if (c1479510obV != null) {
                str = c1479510obV.LJIIIZ;
            } else {
                str = "null";
            }
            sbLIZ2.append(str);
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (c1479510obV != null && (interfaceC1480720odS = this.LIZ) != null) {
            if (c1479510obV.LJLJL) {
                interfaceC1480720odS.LIZ(c1479510obV, this.LJIIIIZZ);
                return;
            } else {
                interfaceC1480720odS.LJII(c1479510obV, this.LJIIIIZZ);
                return;
            }
        }
        SimRadar.errorScan("SimplifyAsyncPlayerV3", "nextPrepare", new C1473290oRT("PrepareData or PlaySessionManager is null.Prepare next failed."), c1479510obV, this.LIZ);
        SimRadar.analyzer().getClass();
        C1472910oQr.LIZIZ("SF-PDataNull1");
    }

    @Override // X.InterfaceC1479560oba
    public final void setLoop(boolean z) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.setLoop(z);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void setSurface(Surface surface) {
        if (C1474810oTv.LLJLL()) {
            LJIIIZ("setSurface");
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSurface(), surface = ");
            sbLIZ.append(surface);
            sbLIZ.append(", mCurrentPlaySession = ");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(", ");
            sbLIZ.append(LJII());
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZJ = surface;
        if (this.LIZIZ != null && !((Boolean) C1474810oTv.n3.getValue()).booleanValue()) {
            this.LIZIZ.setSurface(surface);
        }
    }

    public C1480700odQ(EnumC1479760obu enumC1479760obu, C1480730odT c1480730odT) {
        InterfaceC1480720odS playSessionManager;
        if (((Boolean) C1474810oTv.e2.getValue()).booleanValue()) {
            playSessionManager = new C1480690odP(enumC1479760obu, c1480730odT);
        } else {
            playSessionManager = new PlaySessionManager(enumC1479760obu, c1480730odT);
        }
        this.LIZ = playSessionManager;
    }

    @Override // X.InterfaceC1479560oba
    public final void LIZLLL(String str, String str2) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LIZLLL(str, str2);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJIILLIIL(float f, float f2) {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setVolume() leftVolume:");
            sbLIZ.append(f);
            sbLIZ.append(", rightVolume:");
            sbLIZ.append(f2);
            sbLIZ.append(", key:");
            sbLIZ.append(LJII());
            C1481110oe5.LIZIZ("SimplifyAsyncPlayerV3", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1480720odS interfaceC1480720odS = this.LIZ;
        if (interfaceC1480720odS != null) {
            if (f <= 0.0f && f2 <= 0.0f) {
                interfaceC1480720odS.LJIILJJIL(true);
            } else {
                interfaceC1480720odS.LJIILJJIL(false);
            }
        }
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJIILLIIL(f, f2);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJJZ(int i, JSONObject jSONObject) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJJZ(i, jSONObject);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJILLIZJL(String str, String str2) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJLIIIJILLIZJL(str, str2);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJJIZ(String str, boolean z) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJLIIIJJIZ(str, z);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJZ(int i, Bundle bundle) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJJZ(i, bundle);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLJJLL(int i, int i2) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJLJJLL(i, i2);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLJL(Bundle bundle, boolean z) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.LJLJL(bundle, z);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJLZ(String str, String str2) {
        InterfaceC1480710odR interfaceC1480710odR = this.LIZIZ;
        if (interfaceC1480710odR != null && TextUtils.equals(str, interfaceC1480710odR.getKey())) {
            return true;
        }
        return false;
    }
}
